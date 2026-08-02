package org.betup.ui.fragment.shop;

import android.content.Context;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.betup.ui.fragment.shop.compose.ShopContentUiModel;
import org.betup.ui.fragment.shop.compose.ShopHtmlAssetCache;

/* compiled from: ShopBetcoinsFragmentK.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.shop.ShopBetcoinsFragmentK$prefetchShopHtmlImages$1", f = "ShopBetcoinsFragmentK.kt", i = {}, l = {338}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class ShopBetcoinsFragmentK$prefetchShopHtmlImages$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $appContext;
    final /* synthetic */ ShopContentUiModel $content;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShopBetcoinsFragmentK$prefetchShopHtmlImages$1(Context context, ShopContentUiModel shopContentUiModel, Continuation<? super ShopBetcoinsFragmentK$prefetchShopHtmlImages$1> continuation) {
        super(2, continuation);
        this.$appContext = context;
        this.$content = shopContentUiModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShopBetcoinsFragmentK$prefetchShopHtmlImages$1(this.$appContext, this.$content, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ShopBetcoinsFragmentK$prefetchShopHtmlImages$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (ShopHtmlAssetCache.INSTANCE.warm(this.$appContext, ShopHtmlAssetCache.INSTANCE.collectImageUrls(this.$content), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
