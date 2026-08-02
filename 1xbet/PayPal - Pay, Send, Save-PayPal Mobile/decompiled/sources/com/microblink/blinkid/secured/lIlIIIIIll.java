package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public abstract class lIlIIIIIll {
    public static void llIIlIlIIl(android.content.Context context) {
        ((android.view.inputmethod.InputMethodManager) context.getSystemService("input_method")).toggleSoftInput(2, 1);
    }

    public static void llIIlIlIIl(androidx.appcompat.widget.AppCompatEditText appCompatEditText) {
        ((android.view.inputmethod.InputMethodManager) appCompatEditText.getContext().getSystemService("input_method")).hideSoftInputFromWindow(appCompatEditText.getWindowToken(), 0);
    }
}
