package com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lcom/paypal/oslo/feature/home/ui/components/nbacarousel/stackedcarousel/StackCardTransform;", "transform", "cardTransform", "(Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/home/ui/components/nbacarousel/stackedcarousel/StackCardTransform;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CardTransformModifierKt {
    public static final androidx.compose.ui.Modifier cardTransform(androidx.compose.ui.Modifier modifier, final com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackCardTransform stackCardTransform, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stackCardTransform, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(499207081, i, -1, "com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.cardTransform (CardTransformModifier.kt:29)");
        }
        androidx.compose.ui.Modifier zIndex = androidx.compose.ui.ZIndexModifierKt.zIndex(modifier, stackCardTransform.getZIndex());
        boolean z = (((i & 112) ^ 48) > 32 && composer.changed(stackCardTransform)) || (i & 48) == 32;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.CardTransformModifierKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.CardTransformModifierKt.$r8$lambda$cgeltxo2XwEVWiRB3LiCl0NM_RU(com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackCardTransform.this, (androidx.compose.ui.graphics.GraphicsLayerScope) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.ui.Modifier graphicsLayer = androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(zIndex, (kotlin.jvm.functions.Function1) rememberedValue);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return graphicsLayer;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cgeltxo2XwEVWiRB3LiCl0NM_RU(com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackCardTransform stackCardTransform, androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphicsLayerScope, "");
        graphicsLayerScope.setScaleX(stackCardTransform.getScale());
        graphicsLayerScope.setScaleY(stackCardTransform.getScale());
        graphicsLayerScope.setAlpha(stackCardTransform.getAlpha());
        graphicsLayerScope.setTranslationX(graphicsLayerScope.mo1418toPx0680j_4(stackCardTransform.m14975getOffsetXD9Ej5fM()));
        graphicsLayerScope.setTranslationY(graphicsLayerScope.mo1418toPx0680j_4(stackCardTransform.m14976getOffsetYD9Ej5fM()));
        return kotlin.Unit.INSTANCE;
    }
}
