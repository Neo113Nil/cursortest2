package org.betup.ui.dialogs.controller;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.energy.ChallengeCancelInteractor;

/* compiled from: ChallengePreviewController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.controller.ChallengePreviewController$cancelChallenge$1", f = "ChallengePreviewController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class ChallengePreviewController$cancelChallenge$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $challengeId;
    final /* synthetic */ CoroutineScope $scope;
    int label;
    final /* synthetic */ ChallengePreviewController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChallengePreviewController$cancelChallenge$1(ChallengePreviewController challengePreviewController, long j, CoroutineScope coroutineScope, Continuation<? super ChallengePreviewController$cancelChallenge$1> continuation) {
        super(2, continuation);
        this.this$0 = challengePreviewController;
        this.$challengeId = j;
        this.$scope = coroutineScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChallengePreviewController$cancelChallenge$1(this.this$0, this.$challengeId, this.$scope, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChallengePreviewController$cancelChallenge$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.this$0._isCancelInProgress;
            mutableStateFlow.setValue(Boxing.boxBoolean(true));
            ChallengeCancelInteractor challengeCancelInteractor = this.this$0.getChallengeCancelInteractor();
            final CoroutineScope coroutineScope = this.$scope;
            final ChallengePreviewController challengePreviewController = this.this$0;
            final long j = this.$challengeId;
            challengeCancelInteractor.load((BaseCachedSharedInteractor.OnFetchedListener<T, BaseCachedSharedInteractor.OnFetchedListener>) new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.dialogs.controller.ChallengePreviewController$cancelChallenge$1$$ExternalSyntheticLambda0
                @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
                public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                    ChallengePreviewController$cancelChallenge$1.invokeSuspend$lambda$0(CoroutineScope.this, challengePreviewController, j, fetchedResponseMessage);
                }
            }, (BaseCachedSharedInteractor.OnFetchedListener) Boxing.boxLong(this.$challengeId));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(CoroutineScope coroutineScope, ChallengePreviewController challengePreviewController, long j, FetchedResponseMessage fetchedResponseMessage) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new ChallengePreviewController$cancelChallenge$1$1$1(challengePreviewController, fetchedResponseMessage, j, null), 2, null);
    }
}
