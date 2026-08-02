package org.betup.ui.fragment.shop.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.betup.R;

/* compiled from: FirstPurchaseBannerCard.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FirstPurchaseBannerCardKt$FirstPurchaseBannerCard$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function1<ShopItemDataModel, Unit> $onClick;
    final /* synthetic */ ShopItemDataModel $shopItem;

    /* JADX WARN: Multi-variable type inference failed */
    FirstPurchaseBannerCardKt$FirstPurchaseBannerCard$2(ShopItemDataModel shopItemDataModel, Function1<? super ShopItemDataModel, Unit> function1) {
        this.$shopItem = shopItemDataModel;
        this.$onClick = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-815981576, i, -1, "org.betup.ui.fragment.shop.compose.FirstPurchaseBannerCard.<anonymous> (FirstPurchaseBannerCard.kt:37)");
        }
        String shopPurchaseButtonPrice$default = ShopPriceFormattingKt.shopPurchaseButtonPrice$default(this.$shopItem.getPrice(), false, 2, null);
        composer.startReplaceGroup(-1633490746);
        boolean changed = composer.changed(this.$onClick) | composer.changed(this.$shopItem);
        final Function1<ShopItemDataModel, Unit> function1 = this.$onClick;
        final ShopItemDataModel shopItemDataModel = this.$shopItem;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.shop.compose.FirstPurchaseBannerCardKt$FirstPurchaseBannerCard$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = FirstPurchaseBannerCardKt$FirstPurchaseBannerCard$2.invoke$lambda$1$lambda$0(Function1.this, shopItemDataModel);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        ShopCardChromeKt.ShopPriceBar(shopPurchaseButtonPrice$default, null, 0, R.string.shop_buy_for_price, (Function0) rememberedValue, null, composer, 3072, 38);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, ShopItemDataModel shopItemDataModel) {
        function1.invoke(shopItemDataModel);
        return Unit.INSTANCE;
    }
}
