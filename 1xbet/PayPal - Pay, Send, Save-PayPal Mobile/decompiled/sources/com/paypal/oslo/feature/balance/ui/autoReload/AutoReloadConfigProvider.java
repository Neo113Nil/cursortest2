package com.paypal.oslo.feature.balance.ui.autoReload;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadConfigProvider;", "", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "<init>", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "", "", "getAutoReloadBottomSheetMetadata", "()Ljava/util/Map;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutoReloadConfigProvider {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public AutoReloadConfigProvider(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getAutoReloadBottomSheetMetadata() {
        return com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, true, false, null, new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadConfigProvider$getAutoReloadBottomSheetMetadata$1(this), new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadConfigProvider$getAutoReloadBottomSheetMetadata$2(this), 27, null);
    }

    /* renamed from: $r8$lambda$efN8ST6OJHK6oOf-Zl6JzyXHHk0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12039$r8$lambda$efN8ST6OJHK6oOfZl6JzyXHHk0(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ChoiceSheet.INSTANCE, new com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Cancelled(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ChoiceSheet.INSTANCE)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jsvs7_5g2140PVT33YuMGSac9iY(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ChoiceSheet.INSTANCE, com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Dismissed.INSTANCE));
        return kotlin.Unit.INSTANCE;
    }
}
