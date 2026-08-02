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
import org.betup.ui.fragment.home.controller.HomeVideoBonusController;

/* compiled from: HomeVideoBonusController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.home.controller.HomeVideoBonusController$startPeriodicPoll$1", f = "HomeVideoBonusController.kt", i = {0}, l = {376}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class HomeVideoBonusController$startPeriodicPoll$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HomeVideoBonusController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeVideoBonusController$startPeriodicPoll$1(HomeVideoBonusController homeVideoBonusController, Continuation<? super HomeVideoBonusController$startPeriodicPoll$1> continuation) {
        super(2, continuation);
        this.this$0 = homeVideoBonusController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HomeVideoBonusController$startPeriodicPoll$1 homeVideoBonusController$startPeriodicPoll$1 = new HomeVideoBonusController$startPeriodicPoll$1(this.this$0, continuation);
        homeVideoBonusController$startPeriodicPoll$1.L$0 = obj;
        return homeVideoBonusController$startPeriodicPoll$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeVideoBonusController$startPeriodicPoll$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0047 -> B:5:0x004a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            if (CoroutineScopeKt.isActive(coroutineScope)) {
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        coroutineScope = (CoroutineScope) this.L$0;
        ResultKt.throwOnFailure(obj);
        z3 = this.this$0.clientRegistered;
        if (z3) {
            z4 = this.this$0.pollingActive;
            if (z4) {
                this.this$0.performVideoBonusNetworkRefresh(HomeVideoBonusController.VideoBonusNetworkRefreshPolicy.RESPECT_TRACKED_OVERLAY, true);
            }
        }
        if (CoroutineScopeKt.isActive(coroutineScope)) {
            z = this.this$0.clientRegistered;
            if (z) {
                z2 = this.this$0.pollingActive;
                if (z2) {
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    if (DelayKt.delay(45000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z3 = this.this$0.clientRegistered;
                    if (z3) {
                    }
                    if (CoroutineScopeKt.isActive(coroutineScope)) {
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
