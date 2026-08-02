package org.betup.utils;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes4.dex */
public final class KeyboardUtil {
    public static void showKeyboard(View v) {
    }

    private KeyboardUtil() {
    }

    public static void hideKeyboard(View v) {
        ((InputMethodManager) v.getContext().getSystemService("input_method")).hideSoftInputFromWindow(v.getWindowToken(), 0);
    }
}
