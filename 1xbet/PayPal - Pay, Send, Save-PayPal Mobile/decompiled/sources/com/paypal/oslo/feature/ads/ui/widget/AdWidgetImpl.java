package com.paypal.oslo.feature.ads.ui.widget;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\b\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR#\u0010\u0013\u001a\u0011\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f¢\u0006\u0002\b\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/ads/ui/widget/AdWidgetImpl;", "Lcom/paypal/oslo/feature/ads/api/widget/AdWidget;", "<init>", "()V", "Lcom/paypal/oslo/feature/ads/api/widget/configs/AdWidgetConfiguration;", "config", "initialize", "(Lcom/paypal/oslo/feature/ads/api/widget/configs/AdWidgetConfiguration;)Lcom/paypal/oslo/feature/ads/ui/widget/AdWidgetImpl;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/ads/api/widget/configs/AdWidgetConfiguration;", "getHighSpeedVideoFpsRanges", "", "Ljava/lang/String;", "Lkotlin/Function0;", "", "Lcom/paypal/oslo/feature/ads/api/widget/AdWidgetContent;", "Landroidx/compose/runtime/Composable;", "getContent", "()Lkotlin/jvm/functions/Function2;", "content", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdWidgetImpl implements com.paypal.oslo.feature.ads.api.widget.AdWidget {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private com.paypal.oslo.feature.ads.api.widget.configs.AdWidgetConfiguration getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/ads/ui/widget/AdWidgetImpl$Factory;", "", "Lcom/paypal/oslo/feature/ads/api/widget/configs/AdWidgetConfiguration;", "config", "Lcom/paypal/oslo/feature/ads/ui/widget/AdWidgetImpl;", "create", "(Lcom/paypal/oslo/feature/ads/api/widget/configs/AdWidgetConfiguration;)Lcom/paypal/oslo/feature/ads/ui/widget/AdWidgetImpl;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.ads.ui.widget.AdWidgetImpl create(com.paypal.oslo.feature.ads.api.widget.configs.AdWidgetConfiguration config);
    }

    @javax.inject.Inject
    public AdWidgetImpl() {
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        this.Camera2StreamConfigurationMap = obj;
    }

    public final com.paypal.oslo.feature.ads.ui.widget.AdWidgetImpl initialize(com.paypal.oslo.feature.ads.api.widget.configs.AdWidgetConfiguration config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        if (this.getHighSpeedVideoFpsRanges != null) {
            throw new java.lang.IllegalStateException("AdWidgetImpl has already been initialized. Multiple initializations are not allowed.".toString());
        }
        this.getHighSpeedVideoFpsRanges = config;
        return this;
    }

    @Override // com.paypal.oslo.feature.ads.api.widget.AdWidget
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getContent() {
        return androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-858860520, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.ads.ui.widget.AdWidgetImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.ads.ui.widget.AdWidgetImpl.m11996$r8$lambda$AMT7L41qUwbUbye0916wqHYXaw(com.paypal.oslo.feature.ads.ui.widget.AdWidgetImpl.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        });
    }

    /* renamed from: $r8$lambda$A-MT7L41qUwbUbye0916wqHYXaw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11996$r8$lambda$AMT7L41qUwbUbye0916wqHYXaw(com.paypal.oslo.feature.ads.ui.widget.AdWidgetImpl adWidgetImpl, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-858860520, i, -1, "com.paypal.oslo.feature.ads.ui.widget.AdWidgetImpl.<get-content>.<anonymous> (AdWidgetImpl.kt:76)");
            }
            if (adWidgetImpl.getHighSpeedVideoFpsRanges == null) {
                throw new java.lang.IllegalStateException("AdWidgetImpl must be initialized before accessing content. Call initialize() first.".toString());
            }
            java.lang.String concat = "AdWidget_".concat(java.lang.String.valueOf(adWidgetImpl.Camera2StreamConfigurationMap));
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModel adWidgetViewModel = (com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModel.class), current, concat, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
            com.paypal.oslo.feature.ads.api.widget.configs.AdWidgetConfiguration adWidgetConfiguration = adWidgetImpl.getHighSpeedVideoFpsRanges;
            if (adWidgetConfiguration == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                adWidgetConfiguration = null;
            }
            com.paypal.oslo.feature.ads.ui.widget.AdWidgetImplKt.AdWidgetContentComposable(adWidgetViewModel, adWidgetConfiguration, null, composer, com.paypal.oslo.feature.ads.api.widget.configs.AdWidgetConfiguration.$stable << 3, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
