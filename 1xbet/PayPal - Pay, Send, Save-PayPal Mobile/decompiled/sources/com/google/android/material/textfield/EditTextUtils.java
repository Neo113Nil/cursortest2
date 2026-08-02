package com.google.android.material.textfield;

/* loaded from: classes8.dex */
class EditTextUtils {
    private EditTextUtils() {
    }

    static boolean isEditable(android.widget.EditText editText) {
        return editText.getInputType() != 0;
    }
}
