package org.betup.ui.fragment.home.controller;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.ui.fragment.home.controller.HomeVideoBonusController;

/* compiled from: HomeVideoBonusController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.home.controller.HomeVideoBonusController$startCountdown$3", f = "HomeVideoBonusController.kt", i = {0}, l = {507}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class HomeVideoBonusController$startCountdown$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $remaining;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HomeVideoBonusController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeVideoBonusController$startCountdown$3(long j, HomeVideoBonusController homeVideoBonusController, Continuation<? super HomeVideoBonusController$startCountdown$3> continuation) {
        super(2, continuation);
        this.$remaining = j;
        this.this$0 = homeVideoBonusController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HomeVideoBonusController$startCountdown$3 homeVideoBonusController$startCountdown$3 = new HomeVideoBonusController$startCountdown$3(this.$remaining, this.this$0, continuation);
        homeVideoBonusController$startCountdown$3.L$0 = obj;
        return homeVideoBonusController$startCountdown$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeVideoBonusController$startCountdown$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        boolean z;
        MutableStateFlow mutableStateFlow;
        Object value;
        HomeVideoBonusUiState copy;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            this.L$0 = coroutineScope2;
            this.label = 1;
            if (DelayKt.delay(this.$remaining, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (CoroutineScopeKt.isActive(coroutineScope)) {
            z = this.this$0.clientRegistered;
            if (z) {
                this.this$0.beginAvailabilitySearch();
                mutableStateFlow = this.this$0._uiState;
                do {
                    value = mutableStateFlow.getValue();
                    copy = r4.copy((r22 & 1) != 0 ? r4.adsActive : false, (r22 & 2) != 0 ? r4.availabilityPhase : null, (r22 & 4) != 0 ? r4.adsAmount : 0L, (r22 & 8) != 0 ? r4.displayPrizeAmount : 0L, (r22 & 16) != 0 ? r4.usedInInterval : 0, (r22 & 32) != 0 ? r4.maxPerInterval : 0, (r22 & 64) != 0 ? r4.cooldownEndsAtEpochMs : null, (r22 & 128) != 0 ? ((HomeVideoBonusUiState) value).isActionLoading : false);
                } while (!mutableStateFlow.compareAndSet(value, copy));
                this.this$0.performVideoBonusNetworkRefresh(HomeVideoBonusController.VideoBonusNetworkRefreshPolicy.BYPASS_TRACKED_OVERLAY, true);
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
