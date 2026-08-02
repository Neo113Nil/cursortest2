package org.betup.ui.fragment.matches.details;

import android.util.Log;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.matches.details.MatchShortInfoInteractor;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.matches.details.MatchShortInfoModel;

/* compiled from: MatchDetailsController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.matches.details.MatchDetailsController$pollMatchShortInfo$1", f = "MatchDetailsController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class MatchDetailsController$pollMatchShortInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $matchId;
    int label;
    final /* synthetic */ MatchDetailsController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchDetailsController$pollMatchShortInfo$1(MatchDetailsController matchDetailsController, int i, Continuation<? super MatchDetailsController$pollMatchShortInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = matchDetailsController;
        this.$matchId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MatchDetailsController$pollMatchShortInfo$1(this.this$0, this.$matchId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MatchDetailsController$pollMatchShortInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            MatchShortInfoInteractor matchesDetailsRequestInteractor = this.this$0.getMatchesDetailsRequestInteractor();
            final MatchDetailsController matchDetailsController = this.this$0;
            matchesDetailsRequestInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener<MatchShortInfoModel, Integer>() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$pollMatchShortInfo$1.1
                @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
                public void onFetched(FetchedResponseMessage<MatchShortInfoModel, Integer> response) {
                    MutableStateFlow mutableStateFlow;
                    Intrinsics.checkNotNullParameter(response, "response");
                    if (response.getStat() != FetchStat.SUCCESS || response.getModel() == null) {
                        return;
                    }
                    int matchState = response.getModel().getMatchState();
                    mutableStateFlow = MatchDetailsController.this._currentMatch;
                    MatchShortInfoModel matchShortInfoModel = (MatchShortInfoModel) mutableStateFlow.getValue();
                    Integer valueOf = matchShortInfoModel != null ? Integer.valueOf(matchShortInfoModel.getMatchState()) : null;
                    if (valueOf == null || matchState == valueOf.intValue() || MatchState.fromInt(matchState) != MatchState.FINISHED) {
                        return;
                    }
                    MatchDetailsController.this.invokeRefresh();
                }
            }, Boxing.boxInt(this.$matchId), null);
        } catch (Exception e) {
            Log.w("MatchDetailsController", "Error polling match short info: " + e.getMessage(), e);
        }
        return Unit.INSTANCE;
    }
}
