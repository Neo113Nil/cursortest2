package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001cB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\rR+\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038C@CX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\u0012\"\u0004\b\u0013\u0010\u000bR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0018\u0010\u001a\u001a\u00020\u0003*\u00020\u00188CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0019R\u0018\u0010\u001b\u001a\u00020\u0003*\u00020\u00188CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0019"}, d2 = {"Landroidx/compose/material3/internal/Listener;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Landroidx/compose/runtime/State;", "", "p0", "p1", "p2", "<init>", "(ZZZ)V", "", "onAccessibilityStateChanged", "(Z)V", "getHighSpeedVideoFpsRanges", "Z", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/MutableState;", "()Z", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/material3/internal/Listener$touchExplorationListener$1;", "Landroidx/compose/material3/internal/Listener$touchExplorationListener$1;", "Landroidx/compose/material3/internal/Listener$otherA11yServicesListener$1;", "Landroidx/compose/material3/internal/Listener$otherA11yServicesListener$1;", "Landroid/view/accessibility/AccessibilityManager;", "(Landroid/view/accessibility/AccessibilityManager;)Z", "getOutputMinFrameDuration", "getHighSpeedVideoSizesFor", "Api33Impl"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class Listener implements android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener, androidx.compose.runtime.State<java.lang.Boolean> {
    private final androidx.compose.runtime.MutableState Camera2StreamConfigurationMap = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final androidx.compose.material3.internal.Listener$otherA11yServicesListener$1 getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;
    private final boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final androidx.compose.material3.internal.Listener$touchExplorationListener$1 getHighResolutionOutputSizeshNQ4ISI;

    public Listener(boolean z, boolean z2, boolean z3) {
        this.getHighSpeedVideoSizes = z2;
        this.getHighSpeedVideoFpsRangesFor = z3;
        androidx.compose.material3.internal.Listener$otherA11yServicesListener$1 listener$otherA11yServicesListener$1 = null;
        this.getHighResolutionOutputSizeshNQ4ISI = z ? new androidx.compose.material3.internal.Listener$touchExplorationListener$1() : null;
        if ((z2 || z3) && android.os.Build.VERSION.SDK_INT >= 33) {
            listener$otherA11yServicesListener$1 = new androidx.compose.material3.internal.Listener$otherA11yServicesListener$1(this);
        }
        this.getHighSpeedVideoFpsRanges = listener$otherA11yServicesListener$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getHighSpeedVideoFpsRangesFor() {
        return ((java.lang.Boolean) this.Camera2StreamConfigurationMap.getValue()).booleanValue();
    }

    final void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        this.Camera2StreamConfigurationMap.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean getHighSpeedVideoFpsRangesFor(android.view.accessibility.AccessibilityManager accessibilityManager) {
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            java.lang.String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && kotlin.text.StringsKt.contains((java.lang.CharSequence) settingsActivityName, (java.lang.CharSequence) "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean getHighSpeedVideoFpsRanges(android.view.accessibility.AccessibilityManager accessibilityManager) {
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            java.lang.String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && kotlin.text.StringsKt.contains((java.lang.CharSequence) settingsActivityName, (java.lang.CharSequence) "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean p0) {
        getHighResolutionOutputSizeshNQ4ISI(p0);
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\n"}, d2 = {"Landroidx/compose/material3/internal/Listener$Api33Impl;", "", "<init>", "()V", "Landroid/view/accessibility/AccessibilityManager;", "p0", "Landroid/view/accessibility/AccessibilityManager$AccessibilityServicesStateChangeListener;", "p1", "", "aE_", "(Landroid/view/accessibility/AccessibilityManager;Landroid/view/accessibility/AccessibilityManager$AccessibilityServicesStateChangeListener;)V", "aF_"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Api33Impl {
        public static final androidx.compose.material3.internal.Listener.Api33Impl INSTANCE = new androidx.compose.material3.internal.Listener.Api33Impl();

        private Api33Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final void aE_(android.view.accessibility.AccessibilityManager p0, android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener p1) {
            p0.addAccessibilityServicesStateChangeListener(p1);
        }

        @kotlin.jvm.JvmStatic
        public static final void aF_(android.view.accessibility.AccessibilityManager p0, android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener p1) {
            p0.removeAccessibilityServicesStateChangeListener(p1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001d, code lost:
    
        if (r0.getSwitchAccessEnabled() == true) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        if (r0.getVoiceAccessEnabled() == true) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r0.getEnabled() == true) goto L21;
     */
    @Override // androidx.compose.runtime.State
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ java.lang.Boolean getValue() {
        boolean z;
        if (getHighSpeedVideoFpsRangesFor()) {
            androidx.compose.material3.internal.Listener$touchExplorationListener$1 listener$touchExplorationListener$1 = this.getHighResolutionOutputSizeshNQ4ISI;
            z = true;
            if (listener$touchExplorationListener$1 != null) {
            }
            if (this.getHighSpeedVideoSizes) {
                androidx.compose.material3.internal.Listener$otherA11yServicesListener$1 listener$otherA11yServicesListener$1 = this.getHighSpeedVideoFpsRanges;
                if (listener$otherA11yServicesListener$1 != null) {
                }
            }
            if (this.getHighSpeedVideoFpsRangesFor) {
                androidx.compose.material3.internal.Listener$otherA11yServicesListener$1 listener$otherA11yServicesListener$12 = this.getHighSpeedVideoFpsRanges;
                if (listener$otherA11yServicesListener$12 != null) {
                }
            }
        }
        z = false;
        return java.lang.Boolean.valueOf(z);
    }
}
