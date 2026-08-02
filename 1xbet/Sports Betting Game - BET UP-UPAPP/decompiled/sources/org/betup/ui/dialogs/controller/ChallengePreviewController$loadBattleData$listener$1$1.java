package org.betup.ui.dialogs.controller;

import android.util.Log;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.entity.challenges.NewChallengeDetailsResponseModelP;
import org.betup.model.remote.entity.challenges.NewChallengeMatchModel;
import org.betup.model.remote.entity.challenges.NewChallengeTeamModel;
import org.betup.model.remote.entity.challenges.V7ChallengeDetailsMapperKt;
import org.betup.model.remote.entity.challenges.V7ChallengeDetailsResponseModel;
import org.betup.model.remote.entity.user.BaseUserModel;

/* compiled from: ChallengePreviewController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.controller.ChallengePreviewController$loadBattleData$listener$1$1", f = "ChallengePreviewController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class ChallengePreviewController$loadBattleData$listener$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $challengeIdToLoad;
    final /* synthetic */ FetchedResponseMessage<V7ChallengeDetailsResponseModel, Long> $response;
    int label;
    final /* synthetic */ ChallengePreviewController this$0;

    /* compiled from: ChallengePreviewController.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FetchStat.values().length];
            try {
                iArr[FetchStat.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FetchStat.NO_CONNECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FetchStat.NO_AUTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChallengePreviewController$loadBattleData$listener$1$1(ChallengePreviewController challengePreviewController, long j, FetchedResponseMessage<V7ChallengeDetailsResponseModel, Long> fetchedResponseMessage, Continuation<? super ChallengePreviewController$loadBattleData$listener$1$1> continuation) {
        super(2, continuation);
        this.this$0 = challengePreviewController;
        this.$challengeIdToLoad = j;
        this.$response = fetchedResponseMessage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChallengePreviewController$loadBattleData$listener$1$1(this.this$0, this.$challengeIdToLoad, this.$response, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChallengePreviewController$loadBattleData$listener$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        boolean z;
        Long l;
        Job job;
        Map map;
        Long l2;
        MutableStateFlow mutableStateFlow3;
        MutableStateFlow mutableStateFlow4;
        MutableStateFlow mutableStateFlow5;
        MutableStateFlow mutableStateFlow6;
        NewChallengeTeamModel awayTeam;
        NewChallengeTeamModel homeTeam;
        Integer id;
        MutableStateFlow mutableStateFlow7;
        Unit unit;
        MutableStateFlow mutableStateFlow8;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                try {
                    z = this.this$0.isBound;
                } catch (Exception e) {
                    Log.e(ChallengePreviewController.TAG, "Exception processing response: " + e.getMessage(), e);
                    this.this$0.handleLoadingError("An error occurred");
                }
                if (z) {
                    l = this.this$0._challengeId;
                    long j = this.$challengeIdToLoad;
                    if (l != null && l.longValue() == j) {
                        job = this.this$0.loadingJob;
                        String str = null;
                        if (job != null) {
                            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                        }
                        FetchStat stat = this.$response.getStat();
                        int i = stat == null ? -1 : WhenMappings.$EnumSwitchMapping$0[stat.ordinal()];
                        if (i == 1) {
                            Log.d(ChallengePreviewController.TAG, "Challenge data loaded successfully for ID: " + this.$challengeIdToLoad);
                            BaseUserModel userModel = this.this$0.getUserServiceP().getShortProfile().getUserModel();
                            Long boxLong = (userModel == null || (id = userModel.getId()) == null) ? null : Boxing.boxLong(id.intValue());
                            V7ChallengeDetailsResponseModel model = this.$response.getModel();
                            NewChallengeDetailsResponseModelP legacyDetails = model != null ? V7ChallengeDetailsMapperKt.toLegacyDetails(model, boxLong) : null;
                            if (legacyDetails != null) {
                                map = this.this$0.detailsCache;
                                map.put(Boxing.boxLong(this.$challengeIdToLoad), legacyDetails);
                                l2 = this.this$0._challengeId;
                                long j2 = this.$challengeIdToLoad;
                                if (l2 != null && l2.longValue() == j2) {
                                    mutableStateFlow3 = this.this$0._challengeData;
                                    mutableStateFlow3.setValue(legacyDetails);
                                }
                                mutableStateFlow4 = this.this$0._error;
                                mutableStateFlow4.setValue(null);
                                mutableStateFlow5 = this.this$0._canRetry;
                                mutableStateFlow5.setValue(Boxing.boxBoolean(false));
                                mutableStateFlow6 = this.this$0._retryCount;
                                mutableStateFlow6.setValue(Boxing.boxInt(0));
                                NewChallengeMatchModel match = legacyDetails.getMatch();
                                String name = (match == null || (homeTeam = match.getHomeTeam()) == null) ? null : homeTeam.getName();
                                NewChallengeMatchModel match2 = legacyDetails.getMatch();
                                if (match2 != null && (awayTeam = match2.getAwayTeam()) != null) {
                                    str = awayTeam.getName();
                                }
                                Boxing.boxInt(Log.d(ChallengePreviewController.TAG, "Challenge data set successfully: match=" + name + " vs " + str));
                            } else {
                                Log.e(ChallengePreviewController.TAG, "Challenge data conversion returned null for ID: " + this.$challengeIdToLoad);
                                this.this$0.handleLoadingError("Failed to parse challenge data");
                            }
                        } else if (i == 2) {
                            Log.e(ChallengePreviewController.TAG, "No connection when loading challenge data for ID: " + this.$challengeIdToLoad);
                            this.this$0.handleLoadingError("No internet connection");
                        } else if (i != 3) {
                            Log.e(ChallengePreviewController.TAG, "Failed to load challenge data for ID: " + this.$challengeIdToLoad + ", stat: " + this.$response.getStat());
                            this.this$0.handleLoadingError("Failed to load challenge data");
                        } else {
                            Log.e(ChallengePreviewController.TAG, "Authentication error when loading challenge data for ID: " + this.$challengeIdToLoad);
                            this.this$0.handleLoadingError("Authentication error - please log in again");
                        }
                        mutableStateFlow2 = this.this$0._isLoading;
                        mutableStateFlow2.setValue(Boxing.boxBoolean(false));
                        return Unit.INSTANCE;
                    }
                    Log.d(ChallengePreviewController.TAG, "Ignoring stale response for ID: " + this.$challengeIdToLoad);
                    mutableStateFlow7 = this.this$0._isLoading;
                    mutableStateFlow7.setValue(Boxing.boxBoolean(false));
                    unit = Unit.INSTANCE;
                } else {
                    Log.d(ChallengePreviewController.TAG, "Controller is no longer bound, ignoring response");
                    mutableStateFlow8 = this.this$0._isLoading;
                    mutableStateFlow8.setValue(Boxing.boxBoolean(false));
                    unit = Unit.INSTANCE;
                }
                return unit;
            } finally {
                mutableStateFlow = this.this$0._isLoading;
                mutableStateFlow.setValue(Boxing.boxBoolean(false));
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
