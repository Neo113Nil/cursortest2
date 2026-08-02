package com.paypal.oslo.feature.subscriptions.di;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JO\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/di/ConfiguredBottomSheetConfigProvider;", "", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "<init>", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "Lkotlin/Function0;", "", "onBackButtonClick", "onCloseButtonClick", "onDismiss", "", "", "getBaseSubscriptionsBottomSheetsMetadata", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/util/Map;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ConfiguredBottomSheetConfigProvider {
    public static final int $stable = 0;
    private final com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public ConfiguredBottomSheetConfigProvider(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        this.Camera2StreamConfigurationMap = appNavigator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.util.Map getBaseSubscriptionsBottomSheetsMetadata$default(com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider configuredBottomSheetConfigProvider, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        if ((i & 2) != 0) {
            function02 = null;
        }
        if ((i & 4) != 0) {
            function03 = null;
        }
        return configuredBottomSheetConfigProvider.getBaseSubscriptionsBottomSheetsMetadata(function0, function02, function03);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getBaseSubscriptionsBottomSheetsMetadata(kotlin.jvm.functions.Function0<kotlin.Unit> onBackButtonClick, kotlin.jvm.functions.Function0<kotlin.Unit> onCloseButtonClick, kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
        if (onBackButtonClick == null) {
            onBackButtonClick = new com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider$getBaseSubscriptionsBottomSheetsMetadata$1(this);
        }
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = onBackButtonClick;
        if (onCloseButtonClick == null) {
            onCloseButtonClick = new com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider$getBaseSubscriptionsBottomSheetsMetadata$2(this);
        }
        kotlin.jvm.functions.Function0<kotlin.Unit> function02 = onCloseButtonClick;
        if (onDismiss == null) {
            onDismiss = new com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider$getBaseSubscriptionsBottomSheetsMetadata$3(this);
        }
        return com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, true, false, function0, function02, onDismiss, 1, null);
    }

    /* renamed from: $r8$lambda$--3QO7HGusngHGEOnEb-tuZDVjc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19852$r8$lambda$3QO7HGusngHGEOnEbtuZDVjc(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "BottomSheet interaction", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", "back_button_click")), null, 4, null);
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$olFjvKsgDWMMIolFL1veqZ0Imfc(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "BottomSheet interaction", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", "close_button_click")), null, 4, null);
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rdjTWgtXRXdY0jfGsAhaV2djRw8(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "BottomSheet interaction", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", "dismissed")), null, 4, null);
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }
}
