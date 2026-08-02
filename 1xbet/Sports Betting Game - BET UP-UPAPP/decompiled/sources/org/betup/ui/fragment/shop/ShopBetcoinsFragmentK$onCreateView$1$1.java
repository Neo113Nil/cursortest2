package org.betup.ui.fragment.shop;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.StateFlow;
import org.betup.ui.fragment.shop.compose.ShopContentUiModel;
import org.betup.ui.fragment.shop.compose.ShopItemDataModel;
import org.betup.ui.fragment.shop.compose.ShopScreenKt;

/* compiled from: ShopBetcoinsFragmentK.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ShopBetcoinsFragmentK$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ ShopBetcoinsFragmentK this$0;

    ShopBetcoinsFragmentK$onCreateView$1$1(ShopBetcoinsFragmentK shopBetcoinsFragmentK) {
        this.this$0 = shopBetcoinsFragmentK;
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
            ComposerKt.traceEventStart(-1938126952, i, -1, "org.betup.ui.fragment.shop.ShopBetcoinsFragmentK.onCreateView.<anonymous>.<anonymous> (ShopBetcoinsFragmentK.kt:180)");
        }
        StateFlow<ShopContentUiModel> shopContent = this.this$0.getShopContent();
        StateFlow<Boolean> isLoading = this.this$0.isLoading();
        StateFlow<Boolean> isRefreshing = this.this$0.isRefreshing();
        StateFlow<String> error = this.this$0.getError();
        ShopBetcoinsFragmentK shopBetcoinsFragmentK = this.this$0;
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(shopBetcoinsFragmentK);
        ShopBetcoinsFragmentK$onCreateView$1$1$1$1 rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new ShopBetcoinsFragmentK$onCreateView$1$1$1$1(shopBetcoinsFragmentK);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        Function0 function0 = (Function0) ((KFunction) rememberedValue);
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final ShopBetcoinsFragmentK shopBetcoinsFragmentK2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.shop.ShopBetcoinsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$2$lambda$1;
                    invoke$lambda$2$lambda$1 = ShopBetcoinsFragmentK$onCreateView$1$1.invoke$lambda$2$lambda$1(ShopBetcoinsFragmentK.this, (ShopItemDataModel) obj);
                    return invoke$lambda$2$lambda$1;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function1 function1 = (Function1) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(this.this$0);
        final ShopBetcoinsFragmentK shopBetcoinsFragmentK3 = this.this$0;
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.shop.ShopBetcoinsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$4$lambda$3;
                    invoke$lambda$4$lambda$3 = ShopBetcoinsFragmentK$onCreateView$1$1.invoke$lambda$4$lambda$3(ShopBetcoinsFragmentK.this, (ShopItemDataModel) obj);
                    return invoke$lambda$4$lambda$3;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        ShopScreenKt.ShopScreenWithState(shopContent, isLoading, isRefreshing, error, function0, function1, (Function1) rememberedValue3, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(ShopBetcoinsFragmentK shopBetcoinsFragmentK, ShopItemDataModel shopItem) {
        Intrinsics.checkNotNullParameter(shopItem, "shopItem");
        shopBetcoinsFragmentK.handleShopItemClick(shopItem);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(ShopBetcoinsFragmentK shopBetcoinsFragmentK, ShopItemDataModel shopItem) {
        Intrinsics.checkNotNullParameter(shopItem, "shopItem");
        shopBetcoinsFragmentK.handleEntitlementClaim(shopItem);
        return Unit.INSTANCE;
    }
}
