package androidx.core.view.accessibility;

/* loaded from: classes3.dex */
public final class AccessibilityClickableSpanCompat extends android.text.style.ClickableSpan {
    public static final java.lang.String SPAN_ID = "ACCESSIBILITY_CLICKABLE_SPAN_ID";
    private final int Camera2StreamConfigurationMap;
    private final androidx.core.view.accessibility.AccessibilityNodeInfoCompat getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoSizes;

    public AccessibilityClickableSpanCompat(int i, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i2) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighResolutionOutputSizeshNQ4ISI = accessibilityNodeInfoCompat;
        this.getHighSpeedVideoSizes = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View view) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(SPAN_ID, this.Camera2StreamConfigurationMap);
        this.getHighResolutionOutputSizeshNQ4ISI.performAction(this.getHighSpeedVideoSizes, bundle);
    }
}
