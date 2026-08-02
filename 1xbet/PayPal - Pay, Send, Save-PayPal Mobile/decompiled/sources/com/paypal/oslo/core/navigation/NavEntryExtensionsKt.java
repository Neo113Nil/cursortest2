package com.paypal.oslo.core.navigation;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\u0007\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0017\u0010\t\u001a\u0004\u0018\u00010\b*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u000b\u0010\u0006\u001a\u001d\u0010\r\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u000f\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u000f\u0010\u0006\u001a\u0015\u0010\u0010\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0010\u0010\u0006\u001a\u0015\u0010\u0011\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0011\u0010\u0006\u001a\u0015\u0010\u0012\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0012\u0010\u0006\u001a\u0015\u0010\u0013\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0013\u0010\u0006\u001a\u0017\u0010\u0014\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0014\u0010\u0006\u001a\u0017\u0010\u0016\u001a\u00020\u0015*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/navigation3/runtime/NavEntry;", "Lcom/paypal/oslo/core/navigation/NavigationLevel;", "getNavigationLevel", "(Landroidx/navigation3/runtime/NavEntry;)Lcom/paypal/oslo/core/navigation/NavigationLevel;", "", "shouldShowTopBar", "(Landroidx/navigation3/runtime/NavEntry;)Z", "shouldShowBottomNav", "", "getL1Parent", "(Landroidx/navigation3/runtime/NavEntry;)Ljava/lang/String;", "isTabDestination", "level", "isNavigationLevel", "(Landroidx/navigation3/runtime/NavEntry;Lcom/paypal/oslo/core/navigation/NavigationLevel;)Z", "isL0", "isL1", "isL2", "isL3", "isBottomSheet", "isDarkThemeForced", "Lcom/paypal/oslo/core/navigation/SoftInputMode;", "getForcedSoftInputMode", "(Landroidx/navigation3/runtime/NavEntry;)Lcom/paypal/oslo/core/navigation/SoftInputMode;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavEntryExtensionsKt {
    public static final com.paypal.oslo.core.navigation.NavigationLevel getNavigationLevel(androidx.navigation3.runtime.NavEntry<?> navEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navEntry, "");
        return com.paypal.oslo.core.navigation.NavigationLevel.INSTANCE.fromValue((java.lang.String) androidx.navigation3.runtime.NavMetadataKt.get(navEntry.getMetadata(), com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getNAVIGATION_LEVEL()));
    }

    public static final boolean shouldShowTopBar(androidx.navigation3.runtime.NavEntry<?> navEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navEntry, "");
        java.lang.Boolean bool = (java.lang.Boolean) androidx.navigation3.runtime.NavMetadataKt.get(navEntry.getMetadata(), com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getSHOW_TOP_BAR());
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final boolean shouldShowBottomNav(androidx.navigation3.runtime.NavEntry<?> navEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navEntry, "");
        java.lang.Boolean bool = (java.lang.Boolean) androidx.navigation3.runtime.NavMetadataKt.get(navEntry.getMetadata(), com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getSHOW_BOTTOM_NAV());
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final java.lang.String getL1Parent(androidx.navigation3.runtime.NavEntry<?> navEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navEntry, "");
        return (java.lang.String) androidx.navigation3.runtime.NavMetadataKt.get(navEntry.getMetadata(), com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getL1_PARENT());
    }

    public static final boolean isTabDestination(androidx.navigation3.runtime.NavEntry<?> navEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navEntry, "");
        java.lang.Boolean bool = (java.lang.Boolean) androidx.navigation3.runtime.NavMetadataKt.get(navEntry.getMetadata(), com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getTAB_DESTINATION());
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean isNavigationLevel(androidx.navigation3.runtime.NavEntry<?> navEntry, com.paypal.oslo.core.navigation.NavigationLevel navigationLevel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navEntry, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationLevel, "");
        return getNavigationLevel(navEntry) == navigationLevel;
    }

    public static final boolean isL0(androidx.navigation3.runtime.NavEntry<?> navEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navEntry, "");
        return isNavigationLevel(navEntry, com.paypal.oslo.core.navigation.NavigationLevel.L0);
    }

    public static final boolean isL1(androidx.navigation3.runtime.NavEntry<?> navEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navEntry, "");
        return isNavigationLevel(navEntry, com.paypal.oslo.core.navigation.NavigationLevel.L1);
    }

    public static final boolean isL2(androidx.navigation3.runtime.NavEntry<?> navEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navEntry, "");
        return isNavigationLevel(navEntry, com.paypal.oslo.core.navigation.NavigationLevel.L2);
    }

    public static final boolean isL3(androidx.navigation3.runtime.NavEntry<?> navEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navEntry, "");
        return isNavigationLevel(navEntry, com.paypal.oslo.core.navigation.NavigationLevel.L3);
    }

    public static final boolean isBottomSheet(androidx.navigation3.runtime.NavEntry<?> navEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navEntry, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(androidx.navigation3.runtime.NavMetadataKt.get(navEntry.getMetadata(), com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getBOTTOM_SHEET()), java.lang.Boolean.TRUE);
    }

    public static final boolean isDarkThemeForced(androidx.navigation3.runtime.NavEntry<?> navEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navEntry, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(androidx.navigation3.runtime.NavMetadataKt.get(navEntry.getMetadata(), com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getDARK_THEME_FORCED()), java.lang.Boolean.TRUE);
    }

    public static final com.paypal.oslo.core.navigation.SoftInputMode getForcedSoftInputMode(androidx.navigation3.runtime.NavEntry<?> navEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navEntry, "");
        com.paypal.oslo.core.navigation.SoftInputMode softInputMode = (com.paypal.oslo.core.navigation.SoftInputMode) androidx.navigation3.runtime.NavMetadataKt.get(navEntry.getMetadata(), com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getSOFT_INPUT_MODE());
        return softInputMode == null ? com.paypal.oslo.core.navigation.SoftInputMode.Default.INSTANCE : softInputMode;
    }
}
