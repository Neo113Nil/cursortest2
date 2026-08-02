package n;

import android.widget.TextView;

/* renamed from: n.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2153x {
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(TextView textView, int i, int i5, int i6, int i7) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i5, i6, i7);
    }

    public static void c(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public static boolean d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
