package defpackage;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import android.view.inputmethod.EditorBoundsInfo;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class kSPEzfraxudm4i {
    public static /* synthetic */ EditorBoundsInfo.Builder FsuUJlzzWhYnMlD() {
        return new EditorBoundsInfo.Builder();
    }

    public static /* synthetic */ BoringLayout b41X89IqSbKt(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z, TextUtils.TruncateAt truncateAt, int i2) {
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2, true);
    }

    public static /* bridge */ /* synthetic */ AccessibilityManager$AccessibilityServicesStateChangeListener gmXBnHsR2YSm(Object obj) {
        return (AccessibilityManager$AccessibilityServicesStateChangeListener) obj;
    }
}
