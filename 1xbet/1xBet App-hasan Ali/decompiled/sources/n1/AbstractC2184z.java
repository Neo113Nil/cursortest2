package n1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: n1.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2184z {
    public static View.AccessibilityDelegate a(View view) {
        return view.getAccessibilityDelegate();
    }

    public static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i5) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i5);
    }
}
