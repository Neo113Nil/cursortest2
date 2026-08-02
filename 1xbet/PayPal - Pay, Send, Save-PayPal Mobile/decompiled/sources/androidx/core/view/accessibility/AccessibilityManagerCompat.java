package androidx.core.view.accessibility;

/* loaded from: classes7.dex */
public final class AccessibilityManagerCompat {

    @java.lang.Deprecated
    public interface AccessibilityStateChangeListener {
        @java.lang.Deprecated
        void onAccessibilityStateChanged(boolean z);
    }

    @java.lang.Deprecated
    public static abstract class AccessibilityStateChangeListenerCompat implements androidx.core.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListener {
    }

    public interface TouchExplorationStateChangeListener {
        void onTouchExplorationStateChanged(boolean z);
    }

    @java.lang.Deprecated
    public static boolean addAccessibilityStateChangeListener(android.view.accessibility.AccessibilityManager accessibilityManager, androidx.core.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListener accessibilityStateChangeListener) {
        if (accessibilityStateChangeListener == null) {
            return false;
        }
        return accessibilityManager.addAccessibilityStateChangeListener(new androidx.core.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListenerWrapper(accessibilityStateChangeListener));
    }

    @java.lang.Deprecated
    public static boolean removeAccessibilityStateChangeListener(android.view.accessibility.AccessibilityManager accessibilityManager, androidx.core.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListener accessibilityStateChangeListener) {
        if (accessibilityStateChangeListener == null) {
            return false;
        }
        return accessibilityManager.removeAccessibilityStateChangeListener(new androidx.core.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListenerWrapper(accessibilityStateChangeListener));
    }

    static class AccessibilityStateChangeListenerWrapper implements android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener {
        androidx.core.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListener getHighResolutionOutputSizeshNQ4ISI;

        AccessibilityStateChangeListenerWrapper(androidx.core.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListener accessibilityStateChangeListener) {
            this.getHighResolutionOutputSizeshNQ4ISI = accessibilityStateChangeListener;
        }

        public int hashCode() {
            return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof androidx.core.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListenerWrapper) {
                return this.getHighResolutionOutputSizeshNQ4ISI.equals(((androidx.core.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListenerWrapper) obj).getHighResolutionOutputSizeshNQ4ISI);
            }
            return false;
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI.onAccessibilityStateChanged(z);
        }
    }

    @androidx.annotation.ReplaceWith(expression = "manager.getInstalledAccessibilityServiceList()")
    @java.lang.Deprecated
    public static java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getInstalledAccessibilityServiceList(android.view.accessibility.AccessibilityManager accessibilityManager) {
        return accessibilityManager.getInstalledAccessibilityServiceList();
    }

    @androidx.annotation.ReplaceWith(expression = "manager.getEnabledAccessibilityServiceList(feedbackTypeFlags)")
    @java.lang.Deprecated
    public static java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getEnabledAccessibilityServiceList(android.view.accessibility.AccessibilityManager accessibilityManager, int i) {
        return accessibilityManager.getEnabledAccessibilityServiceList(i);
    }

    @androidx.annotation.ReplaceWith(expression = "manager.isTouchExplorationEnabled()")
    @java.lang.Deprecated
    public static boolean isTouchExplorationEnabled(android.view.accessibility.AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }

    @androidx.annotation.ReplaceWith(expression = "manager.addTouchExplorationStateChangeListener(listener)")
    @java.lang.Deprecated
    public static boolean addTouchExplorationStateChangeListener(android.view.accessibility.AccessibilityManager accessibilityManager, androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListenerWrapper(touchExplorationStateChangeListener));
    }

    @androidx.annotation.ReplaceWith(expression = "manager.removeTouchExplorationStateChangeListener(listener)")
    @java.lang.Deprecated
    public static boolean removeTouchExplorationStateChangeListener(android.view.accessibility.AccessibilityManager accessibilityManager, androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListenerWrapper(touchExplorationStateChangeListener));
    }

    public static boolean isRequestFromAccessibilityTool(android.view.accessibility.AccessibilityManager accessibilityManager) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.view.accessibility.AccessibilityManagerCompat.Api34Impl.Camera2StreamConfigurationMap(accessibilityManager);
        }
        return true;
    }

    static final class TouchExplorationStateChangeListenerWrapper implements android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {
        final androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener getHighSpeedVideoFpsRanges;

        TouchExplorationStateChangeListenerWrapper(androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
            this.getHighSpeedVideoFpsRanges = touchExplorationStateChangeListener;
        }

        public final int hashCode() {
            return this.getHighSpeedVideoFpsRanges.hashCode();
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListenerWrapper) {
                return this.getHighSpeedVideoFpsRanges.equals(((androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListenerWrapper) obj).getHighSpeedVideoFpsRanges);
            }
            return false;
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public final void onTouchExplorationStateChanged(boolean z) {
            this.getHighSpeedVideoFpsRanges.onTouchExplorationStateChanged(z);
        }
    }

    private AccessibilityManagerCompat() {
    }

    static class Api34Impl {
        private Api34Impl() {
        }

        static boolean Camera2StreamConfigurationMap(android.view.accessibility.AccessibilityManager accessibilityManager) {
            return accessibilityManager.isRequestFromAccessibilityTool();
        }
    }
}
