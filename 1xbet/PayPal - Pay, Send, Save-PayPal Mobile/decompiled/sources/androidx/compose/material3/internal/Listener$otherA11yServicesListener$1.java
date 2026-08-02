package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R+\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000e"}, d2 = {"Landroidx/compose/material3/internal/Listener$otherA11yServicesListener$1;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityServicesStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager;", "am", "", "onAccessibilityServicesStateChanged", "(Landroid/view/accessibility/AccessibilityManager;)V", "", "<set-?>", "switchAccessEnabled$delegate", "Landroidx/compose/runtime/MutableState;", "getSwitchAccessEnabled", "()Z", "setSwitchAccessEnabled", "(Z)V", "switchAccessEnabled", "voiceAccessEnabled$delegate", "getVoiceAccessEnabled", "setVoiceAccessEnabled", "voiceAccessEnabled"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Listener$otherA11yServicesListener$1 implements android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener {
    final /* synthetic */ androidx.compose.material3.internal.Listener getHighSpeedVideoSizes;

    /* renamed from: switchAccessEnabled$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState switchAccessEnabled;

    /* renamed from: voiceAccessEnabled$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState voiceAccessEnabled;

    Listener$otherA11yServicesListener$1(androidx.compose.material3.internal.Listener listener) {
        this.getHighSpeedVideoSizes = listener;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.switchAccessEnabled = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.voiceAccessEnabled = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getSwitchAccessEnabled() {
        return ((java.lang.Boolean) this.switchAccessEnabled.getValue()).booleanValue();
    }

    public final void setSwitchAccessEnabled(boolean z) {
        this.switchAccessEnabled.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getVoiceAccessEnabled() {
        return ((java.lang.Boolean) this.voiceAccessEnabled.getValue()).booleanValue();
    }

    public final void setVoiceAccessEnabled(boolean z) {
        this.voiceAccessEnabled.setValue(java.lang.Boolean.valueOf(z));
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener
    public final void onAccessibilityServicesStateChanged(android.view.accessibility.AccessibilityManager am) {
        boolean highSpeedVideoFpsRangesFor;
        boolean highSpeedVideoFpsRanges;
        highSpeedVideoFpsRangesFor = androidx.compose.material3.internal.Listener.getHighSpeedVideoFpsRangesFor(am);
        setSwitchAccessEnabled(highSpeedVideoFpsRangesFor);
        highSpeedVideoFpsRanges = androidx.compose.material3.internal.Listener.getHighSpeedVideoFpsRanges(am);
        setVoiceAccessEnabled(highSpeedVideoFpsRanges);
    }
}
