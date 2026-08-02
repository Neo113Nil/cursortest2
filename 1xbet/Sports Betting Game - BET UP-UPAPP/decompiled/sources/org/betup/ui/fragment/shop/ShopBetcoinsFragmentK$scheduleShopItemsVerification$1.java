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
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: ShopBetcoinsFragmentK.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.shop.ShopBetcoinsFragmentK$scheduleShopItemsVerification$1", f = "ShopBetcoinsFragmentK.kt", i = {0}, l = {218}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class ShopBetcoinsFragmentK$scheduleShopItemsVerification$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ShopBetcoinsFragmentK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShopBetcoinsFragmentK$scheduleShopItemsVerification$1(ShopBetcoinsFragmentK shopBetcoinsFragmentK, Continuation<? super ShopBetcoinsFragmentK$scheduleShopItemsVerification$1> continuation) {
        super(2, continuation);
        this.this$0 = shopBetcoinsFragmentK;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShopBetcoinsFragmentK$scheduleShopItemsVerification$1 shopBetcoinsFragmentK$scheduleShopItemsVerification$1 = new ShopBetcoinsFragmentK$scheduleShopItemsVerification$1(this.this$0, continuation);
        shopBetcoinsFragmentK$scheduleShopItemsVerification$1.L$0 = obj;
        return shopBetcoinsFragmentK$scheduleShopItemsVerification$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ShopBetcoinsFragmentK$scheduleShopItemsVerification$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            this.L$0 = coroutineScope2;
            this.label = 1;
            if (DelayKt.delay(3000L, this) == coroutine_suspended) {
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
            mutableStateFlow = this.this$0._shopContent;
            if (mutableStateFlow.getValue() == null) {
                mutableStateFlow2 = this.this$0._isLoading;
                if (!((Boolean) mutableStateFlow2.getValue()).booleanValue()) {
                    Log.w("ShopBetcoinsFragmentK", "scheduleShopItemsVerification: Shop items not loaded properly, forcing reload");
                    this.this$0.forceReloadShopItems();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
