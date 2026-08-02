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
import org.betup.services.offer.PromoService;
import org.betup.ui.common.video.VideoOfferAvailabilityPhase;
import org.betup.ui.fragment.shop.compose.ShopItemDataModel;

/* compiled from: ShopBetcoinsFragmentK.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.shop.ShopBetcoinsFragmentK$scheduleVideoRewardSearchTimeout$1", f = "ShopBetcoinsFragmentK.kt", i = {0}, l = {912}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class ShopBetcoinsFragmentK$scheduleVideoRewardSearchTimeout$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ShopBetcoinsFragmentK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShopBetcoinsFragmentK$scheduleVideoRewardSearchTimeout$1(ShopBetcoinsFragmentK shopBetcoinsFragmentK, Continuation<? super ShopBetcoinsFragmentK$scheduleVideoRewardSearchTimeout$1> continuation) {
        super(2, continuation);
        this.this$0 = shopBetcoinsFragmentK;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShopBetcoinsFragmentK$scheduleVideoRewardSearchTimeout$1 shopBetcoinsFragmentK$scheduleVideoRewardSearchTimeout$1 = new ShopBetcoinsFragmentK$scheduleVideoRewardSearchTimeout$1(this.this$0, continuation);
        shopBetcoinsFragmentK$scheduleVideoRewardSearchTimeout$1.L$0 = obj;
        return shopBetcoinsFragmentK$scheduleVideoRewardSearchTimeout$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ShopBetcoinsFragmentK$scheduleVideoRewardSearchTimeout$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0036 -> B:5:0x0039). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        MutableStateFlow mutableStateFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            if (!CoroutineScopeKt.isActive(coroutineScope)) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.this$0._videoRewardItem;
            if (((ShopItemDataModel) mutableStateFlow.getValue()).getVideoOfferPhase() == VideoOfferAvailabilityPhase.CHECKING) {
                return Unit.INSTANCE;
            }
            Log.d("ShopBetcoinsFragmentK", "No Shop ad yet; continuing partner search");
            this.this$0.getVideoRewardService().preloadRewarded(PromoService.PromoPlacement.SHOP_BONUS);
            this.this$0.getVideoRewardService().getVideoRewardInfo(PromoService.PromoPlacement.SHOP_BONUS, null, null);
            if (!CoroutineScopeKt.isActive(coroutineScope)) {
                this.L$0 = coroutineScope;
                this.label = 1;
                if (DelayKt.delay(12000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableStateFlow = this.this$0._videoRewardItem;
                if (((ShopItemDataModel) mutableStateFlow.getValue()).getVideoOfferPhase() == VideoOfferAvailabilityPhase.CHECKING) {
                }
            } else {
                return Unit.INSTANCE;
            }
        }
    }
}
