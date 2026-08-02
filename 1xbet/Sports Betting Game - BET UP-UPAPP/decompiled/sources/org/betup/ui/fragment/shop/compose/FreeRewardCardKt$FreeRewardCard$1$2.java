package org.betup.ui.fragment.shop.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.betup.R;

/* compiled from: FreeRewardCard.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FreeRewardCardKt$FreeRewardCard$1$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function1<ShopItemDataModel, Unit> $onClick;
    final /* synthetic */ ShopItemDataModel $shopItem;

    /* JADX WARN: Multi-variable type inference failed */
    FreeRewardCardKt$FreeRewardCard$1$2(Function1<? super ShopItemDataModel, Unit> function1, ShopItemDataModel shopItemDataModel) {
        this.$onClick = function1;
        this.$shopItem = shopItemDataModel;
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
            ComposerKt.traceEventStart(-59713298, i, -1, "org.betup.ui.fragment.shop.compose.FreeRewardCard.<anonymous>.<anonymous> (FreeRewardCard.kt:42)");
        }
        composer.startReplaceGroup(-1633490746);
        boolean changed = composer.changed(this.$onClick) | composer.changed(this.$shopItem);
        final Function1<ShopItemDataModel, Unit> function1 = this.$onClick;
        final ShopItemDataModel shopItemDataModel = this.$shopItem;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.shop.compose.FreeRewardCardKt$FreeRewardCard$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = FreeRewardCardKt$FreeRewardCard$1$2.invoke$lambda$1$lambda$0(Function1.this, shopItemDataModel);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        ShopCardChromeKt.ShopPriceBar("", null, 0, R.string.shop_watch, (Function0) rememberedValue, null, composer, 3078, 38);
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
