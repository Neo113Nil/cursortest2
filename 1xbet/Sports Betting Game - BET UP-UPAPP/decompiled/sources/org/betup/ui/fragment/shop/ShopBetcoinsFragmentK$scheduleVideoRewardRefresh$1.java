package org.betup.ui.fragment.shop;

import android.util.Log;
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

/* compiled from: ShopBetcoinsFragmentK.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.shop.ShopBetcoinsFragmentK$scheduleVideoRewardRefresh$1", f = "ShopBetcoinsFragmentK.kt", i = {0}, l = {1020}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class ShopBetcoinsFragmentK$scheduleVideoRewardRefresh$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ShopBetcoinsFragmentK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShopBetcoinsFragmentK$scheduleVideoRewardRefresh$1(ShopBetcoinsFragmentK shopBetcoinsFragmentK, Continuation<? super ShopBetcoinsFragmentK$scheduleVideoRewardRefresh$1> continuation) {
        super(2, continuation);
        this.this$0 = shopBetcoinsFragmentK;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShopBetcoinsFragmentK$scheduleVideoRewardRefresh$1 shopBetcoinsFragmentK$scheduleVideoRewardRefresh$1 = new ShopBetcoinsFragmentK$scheduleVideoRewardRefresh$1(this.this$0, continuation);
        shopBetcoinsFragmentK$scheduleVideoRewardRefresh$1.L$0 = obj;
        return shopBetcoinsFragmentK$scheduleVideoRewardRefresh$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ShopBetcoinsFragmentK$scheduleVideoRewardRefresh$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            this.L$0 = coroutineScope2;
            this.label = 1;
            if (DelayKt.delay(400L, this) == coroutine_suspended) {
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
            Log.d("ShopBetcoinsFragmentK", "scheduleVideoRewardRefresh: Refreshing video reward availability after redemption");
            this.this$0.refreshVideoRewardAvailability();
        }
        return Unit.INSTANCE;
    }
}
