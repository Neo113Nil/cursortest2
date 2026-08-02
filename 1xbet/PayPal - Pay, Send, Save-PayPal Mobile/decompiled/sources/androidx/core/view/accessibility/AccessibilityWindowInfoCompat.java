package androidx.core.view.accessibility;

/* loaded from: classes7.dex */
public class AccessibilityWindowInfoCompat {
    public static final int TYPE_ACCESSIBILITY_OVERLAY = 4;
    public static final int TYPE_APPLICATION = 1;
    public static final int TYPE_INPUT_METHOD = 2;
    public static final int TYPE_MAGNIFICATION_OVERLAY = 6;
    public static final int TYPE_SPLIT_SCREEN_DIVIDER = 5;
    public static final int TYPE_SYSTEM = 3;
    private final android.view.accessibility.AccessibilityWindowInfo getHighSpeedVideoFpsRangesFor;

    @java.lang.Deprecated
    public void recycle() {
    }

    static androidx.core.view.accessibility.AccessibilityWindowInfoCompat Camera2StreamConfigurationMap(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo) {
        if (accessibilityWindowInfo != null) {
            return new androidx.core.view.accessibility.AccessibilityWindowInfoCompat(accessibilityWindowInfo);
        }
        return null;
    }

    public AccessibilityWindowInfoCompat() {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            this.getHighSpeedVideoFpsRangesFor = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api30Impl.Camera2StreamConfigurationMap();
        } else {
            this.getHighSpeedVideoFpsRangesFor = null;
        }
    }

    private AccessibilityWindowInfoCompat(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo) {
        this.getHighSpeedVideoFpsRangesFor = accessibilityWindowInfo;
    }

    public int getType() {
        return this.getHighSpeedVideoFpsRangesFor.getType();
    }

    public int getLayer() {
        return this.getHighSpeedVideoFpsRangesFor.getLayer();
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getRoot() {
        return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor.getRoot());
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getRoot(int i) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api33Impl.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, i);
        }
        return getRoot();
    }

    public boolean isInPictureInPictureMode() {
        return androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api26Impl.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor);
    }

    public androidx.core.view.accessibility.AccessibilityWindowInfoCompat getParent() {
        return Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor.getParent());
    }

    public int getId() {
        return this.getHighSpeedVideoFpsRangesFor.getId();
    }

    public void getRegionInScreen(android.graphics.Region region) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api33Impl.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, region);
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        this.getHighSpeedVideoFpsRangesFor.getBoundsInScreen(rect);
        region.set(rect);
    }

    public void getBoundsInScreen(android.graphics.Rect rect) {
        this.getHighSpeedVideoFpsRangesFor.getBoundsInScreen(rect);
    }

    public boolean isActive() {
        return this.getHighSpeedVideoFpsRangesFor.isActive();
    }

    public boolean isFocused() {
        return this.getHighSpeedVideoFpsRangesFor.isFocused();
    }

    public boolean isAccessibilityFocused() {
        return this.getHighSpeedVideoFpsRangesFor.isAccessibilityFocused();
    }

    public int getChildCount() {
        return this.getHighSpeedVideoFpsRangesFor.getChildCount();
    }

    public androidx.core.view.accessibility.AccessibilityWindowInfoCompat getChild(int i) {
        return Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor.getChild(i));
    }

    public int getDisplayId() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api33Impl.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor);
        }
        return 0;
    }

    public long getTransitionTimeMillis() {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api34Impl.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor);
        }
        return 0L;
    }

    public androidx.core.os.LocaleListCompat getLocales() {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.os.LocaleListCompat.wrap(androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api34Impl.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor));
        }
        return androidx.core.os.LocaleListCompat.getEmptyLocaleList();
    }

    public java.lang.CharSequence getTitle() {
        return androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api24Impl.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor);
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getAnchor() {
        return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.getHighSpeedVideoSizes(androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api24Impl.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor));
    }

    public static androidx.core.view.accessibility.AccessibilityWindowInfoCompat obtain() {
        return Camera2StreamConfigurationMap(android.view.accessibility.AccessibilityWindowInfo.obtain());
    }

    public static androidx.core.view.accessibility.AccessibilityWindowInfoCompat obtain(androidx.core.view.accessibility.AccessibilityWindowInfoCompat accessibilityWindowInfoCompat) {
        if (accessibilityWindowInfoCompat == null) {
            return null;
        }
        return Camera2StreamConfigurationMap(android.view.accessibility.AccessibilityWindowInfo.obtain(accessibilityWindowInfoCompat.getHighSpeedVideoFpsRangesFor));
    }

    public android.view.accessibility.AccessibilityWindowInfo unwrap() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int hashCode() {
        android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo = this.getHighSpeedVideoFpsRangesFor;
        if (accessibilityWindowInfo == null) {
            return 0;
        }
        return accessibilityWindowInfo.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof androidx.core.view.accessibility.AccessibilityWindowInfoCompat)) {
            return false;
        }
        androidx.core.view.accessibility.AccessibilityWindowInfoCompat accessibilityWindowInfoCompat = (androidx.core.view.accessibility.AccessibilityWindowInfoCompat) obj;
        android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo = this.getHighSpeedVideoFpsRangesFor;
        if (accessibilityWindowInfo == null) {
            return accessibilityWindowInfoCompat.getHighSpeedVideoFpsRangesFor == null;
        }
        return accessibilityWindowInfo.equals(accessibilityWindowInfoCompat.getHighSpeedVideoFpsRangesFor);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AccessibilityWindowInfo[id=");
        android.graphics.Rect rect = new android.graphics.Rect();
        getBoundsInScreen(rect);
        sb.append(getId());
        sb.append(", type=");
        sb.append(getHighResolutionOutputSizeshNQ4ISI(getType()));
        sb.append(", layer=");
        sb.append(getLayer());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(isFocused());
        sb.append(", active=");
        sb.append(isActive());
        sb.append(", hasParent=");
        sb.append(getParent() != null);
        sb.append(", hasChildren=");
        sb.append(getChildCount() > 0);
        sb.append(", transitionTime=");
        sb.append(getTransitionTimeMillis());
        sb.append(", locales=");
        sb.append(getLocales());
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(int i) {
        if (i == 1) {
            return "TYPE_APPLICATION";
        }
        if (i == 2) {
            return "TYPE_INPUT_METHOD";
        }
        if (i == 3) {
            return "TYPE_SYSTEM";
        }
        if (i == 4) {
            return "TYPE_ACCESSIBILITY_OVERLAY";
        }
        return "<UNKNOWN>";
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static android.view.accessibility.AccessibilityNodeInfo getHighSpeedVideoSizes(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getAnchor();
        }

        static java.lang.CharSequence getHighSpeedVideoFpsRangesFor(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTitle();
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static boolean getHighResolutionOutputSizeshNQ4ISI(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isInPictureInPictureMode();
        }
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static android.view.accessibility.AccessibilityWindowInfo Camera2StreamConfigurationMap() {
            return new android.view.accessibility.AccessibilityWindowInfo();
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static int getHighSpeedVideoSizes(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getDisplayId();
        }

        static void getHighSpeedVideoFpsRanges(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo, android.graphics.Region region) {
            accessibilityWindowInfo.getRegionInScreen(region);
        }

        public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat getHighSpeedVideoFpsRanges(java.lang.Object obj, int i) {
            return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.getHighSpeedVideoSizes(((android.view.accessibility.AccessibilityWindowInfo) obj).getRoot(i));
        }
    }

    static class Api34Impl {
        private Api34Impl() {
        }

        public static long getHighResolutionOutputSizeshNQ4ISI(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTransitionTimeMillis();
        }

        static android.os.LocaleList getHighSpeedVideoFpsRanges(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLocales();
        }
    }
}
