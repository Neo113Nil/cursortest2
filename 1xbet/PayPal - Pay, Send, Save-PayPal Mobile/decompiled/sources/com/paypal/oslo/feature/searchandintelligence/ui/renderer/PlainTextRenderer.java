package com.paypal.oslo.feature.searchandintelligence.ui.renderer;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/renderer/PlainTextRenderer;", "Lcom/paypal/oslo/feature/searchandintelligence/api/renderer/UiComponentRenderer;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/ui/PlainText;", "<init>", "()V", "content", "Landroidx/compose/ui/Modifier;", "modifier", "", "Render", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/ui/PlainText;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/reflect/KClass;", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PlainTextRenderer implements com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<com.paypal.oslo.feature.searchandintelligence.domain.model.ui.PlainText> {
    public static final int $stable = 8;
    private final kotlin.reflect.KClass<com.paypal.oslo.feature.searchandintelligence.domain.model.ui.PlainText> type = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.searchandintelligence.domain.model.ui.PlainText.class);

    @javax.inject.Inject
    public PlainTextRenderer() {
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer
    public final /* bridge */ com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig provideAnalyticsConfig(com.paypal.oslo.feature.searchandintelligence.domain.model.ui.PlainText plainText) {
        return super.provideAnalyticsConfig((com.paypal.oslo.feature.searchandintelligence.ui.renderer.PlainTextRenderer) plainText);
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer
    public final kotlin.reflect.KClass<? extends com.paypal.oslo.feature.searchandintelligence.domain.model.ui.PlainText> getType() {
        return this.type;
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer
    public final void Render(com.paypal.oslo.feature.searchandintelligence.domain.model.ui.PlainText plainText, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plainText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        composer.startReplaceGroup(-1747159762);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1747159762, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.renderer.PlainTextRenderer.Render (PlainTextRenderer.kt:34)");
        }
        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(plainText.getText(), modifier, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, (i & 112) | 384, 6, 1016);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
