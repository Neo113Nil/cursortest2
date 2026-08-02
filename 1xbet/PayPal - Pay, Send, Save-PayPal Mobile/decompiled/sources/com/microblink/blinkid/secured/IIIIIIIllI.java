package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public abstract class IIIIIIIllI {
    public static int llIIlIlIIl(android.content.Context context, int i) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    public static android.graphics.drawable.Drawable llIIlIlIIl(com.microblink.blinkid.activity.edit.BlinkCardEditActivity blinkCardEditActivity, int i) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        blinkCardEditActivity.getTheme().resolveAttribute(i, typedValue, true);
        int i2 = typedValue.resourceId;
        if (i2 != 0) {
            return androidx.core.content.ContextCompat.getDrawable(blinkCardEditActivity, i2);
        }
        return null;
    }
}
