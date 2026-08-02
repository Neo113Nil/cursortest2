package com.paypal.oslo.core.navigation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018"}, d2 = {"Lcom/paypal/oslo/core/navigation/NavigationLevel;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;IZZ)V", "", "l1Parent", "isTabDestination", "", "", "metadata", "(Ljava/lang/String;Z)Ljava/util/Map;", "showTopBar", "Z", "getShowTopBar", "()Z", "showBottomNav", "getShowBottomNav", "Companion", "L0", "L1", "L2", "L3"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NavigationLevel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.navigation.NavigationLevel.Companion INSTANCE;
    public static final com.paypal.oslo.core.navigation.NavigationLevel L0;
    public static final com.paypal.oslo.core.navigation.NavigationLevel L1;
    public static final com.paypal.oslo.core.navigation.NavigationLevel L2;
    public static final com.paypal.oslo.core.navigation.NavigationLevel L3;
    private static final /* synthetic */ com.paypal.oslo.core.navigation.NavigationLevel[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final boolean showBottomNav;
    private final boolean showTopBar;

    private NavigationLevel(java.lang.String str, int i, boolean z, boolean z2) {
        this.showTopBar = z;
        this.showBottomNav = z2;
    }

    public final boolean getShowTopBar() {
        return this.showTopBar;
    }

    public final boolean getShowBottomNav() {
        return this.showBottomNav;
    }

    static {
        com.paypal.oslo.core.navigation.NavigationLevel navigationLevel = new com.paypal.oslo.core.navigation.NavigationLevel("L0", 0, true, false);
        L0 = navigationLevel;
        com.paypal.oslo.core.navigation.NavigationLevel navigationLevel2 = new com.paypal.oslo.core.navigation.NavigationLevel("L1", 1, true, true);
        L1 = navigationLevel2;
        com.paypal.oslo.core.navigation.NavigationLevel navigationLevel3 = new com.paypal.oslo.core.navigation.NavigationLevel("L2", 2, false, false);
        L2 = navigationLevel3;
        com.paypal.oslo.core.navigation.NavigationLevel navigationLevel4 = new com.paypal.oslo.core.navigation.NavigationLevel("L3", 3, false, false);
        L3 = navigationLevel4;
        com.paypal.oslo.core.navigation.NavigationLevel[] navigationLevelArr = {navigationLevel, navigationLevel2, navigationLevel3, navigationLevel4};
        getHighResolutionOutputSizeshNQ4ISI = navigationLevelArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(navigationLevelArr);
        INSTANCE = new com.paypal.oslo.core.navigation.NavigationLevel.Companion(null);
    }

    public static /* synthetic */ java.util.Map metadata$default(com.paypal.oslo.core.navigation.NavigationLevel navigationLevel, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: metadata");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return navigationLevel.metadata(str, z);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> metadata(java.lang.String l1Parent, boolean isTabDestination) {
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        com.paypal.oslo.core.navigation.NavigationMetadataKeysKt.set(createMapBuilder, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getNAVIGATION_LEVEL(), name());
        com.paypal.oslo.core.navigation.NavigationMetadataKeysKt.set(createMapBuilder, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getSHOW_TOP_BAR(), java.lang.Boolean.valueOf(this.showTopBar));
        com.paypal.oslo.core.navigation.NavigationMetadataKeysKt.set(createMapBuilder, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getSHOW_BOTTOM_NAV(), java.lang.Boolean.valueOf(this.showBottomNav));
        if (this == L1) {
            if (l1Parent != null) {
                com.paypal.oslo.core.navigation.NavigationMetadataKeysKt.set(createMapBuilder, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getL1_PARENT(), l1Parent);
            }
            if (isTabDestination) {
                com.paypal.oslo.core.navigation.NavigationMetadataKeysKt.set(createMapBuilder, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getTAB_DESTINATION(), java.lang.Boolean.TRUE);
            }
        }
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/navigation/NavigationLevel$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/core/navigation/NavigationLevel;", "fromValue", "(Ljava/lang/String;)Lcom/paypal/oslo/core/navigation/NavigationLevel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.core.navigation.NavigationLevel fromValue(java.lang.String value) {
            java.lang.Object obj;
            java.util.Iterator<E> it = com.paypal.oslo.core.navigation.NavigationLevel.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.core.navigation.NavigationLevel) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.core.navigation.NavigationLevel navigationLevel = (com.paypal.oslo.core.navigation.NavigationLevel) obj;
            return navigationLevel == null ? com.paypal.oslo.core.navigation.NavigationLevel.L1 : navigationLevel;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.core.navigation.NavigationLevel[] values() {
        return (com.paypal.oslo.core.navigation.NavigationLevel[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.core.navigation.NavigationLevel valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.navigation.NavigationLevel) java.lang.Enum.valueOf(com.paypal.oslo.core.navigation.NavigationLevel.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.navigation.NavigationLevel> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
