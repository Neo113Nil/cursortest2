package com.paypal.oslo.core.navigation;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/core/navigation/NavigationMetadataBuilder;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/NavigationLevel;", "level", "navigationLevel", "(Lcom/paypal/oslo/core/navigation/NavigationLevel;)Lcom/paypal/oslo/core/navigation/NavigationMetadataBuilder;", "", "showTopBar", "showBottomNav", "uiChrome", "(ZZ)Lcom/paypal/oslo/core/navigation/NavigationMetadataBuilder;", "", "l1Parent", "isTabDestination", "l1Configuration", "(Ljava/lang/String;Z)Lcom/paypal/oslo/core/navigation/NavigationMetadataBuilder;", "forceDarkTheme", "()Lcom/paypal/oslo/core/navigation/NavigationMetadataBuilder;", "Lcom/paypal/oslo/core/navigation/SoftInputMode;", "softInputMode", "forceSoftInputMode", "(Lcom/paypal/oslo/core/navigation/SoftInputMode;)Lcom/paypal/oslo/core/navigation/NavigationMetadataBuilder;", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, io.reactivex.annotations.SchedulerSupport.CUSTOM, "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/core/navigation/NavigationMetadataBuilder;", "", "build", "()Ljava/util/Map;", "", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NavigationMetadataBuilder {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashMap();

    public final com.paypal.oslo.core.navigation.NavigationMetadataBuilder navigationLevel(com.paypal.oslo.core.navigation.NavigationLevel level) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "");
        com.paypal.oslo.core.navigation.NavigationMetadataKeysKt.set(this.getHighResolutionOutputSizeshNQ4ISI, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getNAVIGATION_LEVEL(), level.name());
        com.paypal.oslo.core.navigation.NavigationMetadataKeysKt.set(this.getHighResolutionOutputSizeshNQ4ISI, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getSHOW_TOP_BAR(), java.lang.Boolean.valueOf(level.getShowTopBar()));
        com.paypal.oslo.core.navigation.NavigationMetadataKeysKt.set(this.getHighResolutionOutputSizeshNQ4ISI, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getSHOW_BOTTOM_NAV(), java.lang.Boolean.valueOf(level.getShowBottomNav()));
        return this;
    }

    public static /* synthetic */ com.paypal.oslo.core.navigation.NavigationMetadataBuilder uiChrome$default(com.paypal.oslo.core.navigation.NavigationMetadataBuilder navigationMetadataBuilder, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return navigationMetadataBuilder.uiChrome(z, z2);
    }

    public final com.paypal.oslo.core.navigation.NavigationMetadataBuilder uiChrome(boolean showTopBar, boolean showBottomNav) {
        com.paypal.oslo.core.navigation.NavigationMetadataKeysKt.set(this.getHighResolutionOutputSizeshNQ4ISI, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getSHOW_TOP_BAR(), java.lang.Boolean.valueOf(showTopBar));
        com.paypal.oslo.core.navigation.NavigationMetadataKeysKt.set(this.getHighResolutionOutputSizeshNQ4ISI, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getSHOW_BOTTOM_NAV(), java.lang.Boolean.valueOf(showBottomNav));
        return this;
    }

    public static /* synthetic */ com.paypal.oslo.core.navigation.NavigationMetadataBuilder l1Configuration$default(com.paypal.oslo.core.navigation.NavigationMetadataBuilder navigationMetadataBuilder, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return navigationMetadataBuilder.l1Configuration(str, z);
    }

    public final com.paypal.oslo.core.navigation.NavigationMetadataBuilder l1Configuration(java.lang.String l1Parent, boolean isTabDestination) {
        if (l1Parent != null) {
            com.paypal.oslo.core.navigation.NavigationMetadataKeysKt.set(this.getHighResolutionOutputSizeshNQ4ISI, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getL1_PARENT(), l1Parent);
        }
        if (isTabDestination) {
            com.paypal.oslo.core.navigation.NavigationMetadataKeysKt.set(this.getHighResolutionOutputSizeshNQ4ISI, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getTAB_DESTINATION(), java.lang.Boolean.TRUE);
        }
        return this;
    }

    public final com.paypal.oslo.core.navigation.NavigationMetadataBuilder forceDarkTheme() {
        com.paypal.oslo.core.navigation.NavigationMetadataKeysKt.set(this.getHighResolutionOutputSizeshNQ4ISI, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getDARK_THEME_FORCED(), java.lang.Boolean.TRUE);
        return this;
    }

    public final com.paypal.oslo.core.navigation.NavigationMetadataBuilder forceSoftInputMode(com.paypal.oslo.core.navigation.SoftInputMode softInputMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softInputMode, "");
        com.paypal.oslo.core.navigation.NavigationMetadataKeysKt.set(this.getHighResolutionOutputSizeshNQ4ISI, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getSOFT_INPUT_MODE(), softInputMode);
        return this;
    }

    public final com.paypal.oslo.core.navigation.NavigationMetadataBuilder custom(java.lang.String key, java.lang.Object value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this.getHighResolutionOutputSizeshNQ4ISI.put(key, value);
        return this;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> build() {
        return kotlin.collections.MapsKt.toMap(this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
