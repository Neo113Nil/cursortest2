package com.paypal.oslo.feature.home.ui.preview;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/preview/FakeAdWidgetProvider;", "Lcom/paypal/oslo/feature/ads/api/provider/AdWidgetProvider;", "<init>", "()V", "Lcom/paypal/oslo/feature/ads/api/widget/configs/AdWidgetConfiguration;", "config", "Lcom/paypal/oslo/feature/ads/api/widget/AdWidget;", "createWidget", "(Lcom/paypal/oslo/feature/ads/api/widget/configs/AdWidgetConfiguration;)Lcom/paypal/oslo/feature/ads/api/widget/AdWidget;", "FakeAdWidget"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FakeAdWidgetProvider implements com.paypal.oslo.feature.ads.api.provider.AdWidgetProvider {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.home.ui.preview.FakeAdWidgetProvider INSTANCE = new com.paypal.oslo.feature.home.ui.preview.FakeAdWidgetProvider();

    private FakeAdWidgetProvider() {
    }

    @Override // com.paypal.oslo.feature.ads.api.provider.AdWidgetProvider
    public final com.paypal.oslo.feature.ads.api.widget.AdWidget createWidget(com.paypal.oslo.feature.ads.api.widget.configs.AdWidgetConfiguration config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        return new com.paypal.oslo.feature.home.ui.preview.FakeAdWidgetProvider.FakeAdWidget(config);
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R)\u0010\u0011\u001a\u0011\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b¢\u0006\u0002\b\f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/preview/FakeAdWidgetProvider$FakeAdWidget;", "Lcom/paypal/oslo/feature/ads/api/widget/AdWidget;", "Lcom/paypal/oslo/feature/ads/api/widget/configs/AdWidgetConfiguration;", "p0", "<init>", "(Lcom/paypal/oslo/feature/ads/api/widget/configs/AdWidgetConfiguration;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/ads/api/widget/configs/AdWidgetConfiguration;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Function0;", "", "Lcom/paypal/oslo/feature/ads/api/widget/AdWidgetContent;", "Landroidx/compose/runtime/Composable;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function2;", "getContent", "()Lkotlin/jvm/functions/Function2;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class FakeAdWidget implements com.paypal.oslo.feature.ads.api.widget.AdWidget {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final com.paypal.oslo.feature.ads.api.widget.configs.AdWidgetConfiguration getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap;

        public FakeAdWidget(com.paypal.oslo.feature.ads.api.widget.configs.AdWidgetConfiguration adWidgetConfiguration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adWidgetConfiguration, "");
            this.getHighSpeedVideoFpsRangesFor = adWidgetConfiguration;
            this.Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-2074963413, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.preview.FakeAdWidgetProvider$FakeAdWidget$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.home.ui.preview.FakeAdWidgetProvider.FakeAdWidget.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.home.ui.preview.FakeAdWidgetProvider.FakeAdWidget.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }

        @Override // com.paypal.oslo.feature.ads.api.widget.AdWidget
        public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getContent() {
            return this.Camera2StreamConfigurationMap;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.home.ui.preview.FakeAdWidgetProvider.FakeAdWidget fakeAdWidget, androidx.compose.runtime.Composer composer, int i) {
            if (composer.shouldExecute((i & 3) != 2, i & 1)) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-2074963413, i, -1, "com.paypal.oslo.feature.home.ui.preview.FakeAdWidgetProvider.FakeAdWidget.content.<anonymous> (FakeAdWidgetProvider.kt:34)");
                }
                androidx.compose.ui.Modifier m1726height3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(100.0f));
                java.lang.String placement = fakeAdWidget.getHighSpeedVideoFpsRangesFor.getPlacement();
                int position = fakeAdWidget.getHighSpeedVideoFpsRangesFor.getPosition();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("FakeAdWidget_");
                sb.append(placement);
                sb.append("_");
                sb.append(position);
                androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.ui.platform.TestTagKt.testTag(m1726height3ABfNKs, sb.toString()), composer, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return kotlin.Unit.INSTANCE;
        }
    }
}
