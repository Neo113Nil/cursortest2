package com.google.android.libraries.places.widget.internal.autocomplete.ui;

/* loaded from: classes8.dex */
final class zzl implements android.view.View.OnFocusChangeListener {
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z) {
        try {
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) androidx.core.content.ContextCompat.getSystemService(view.getContext(), android.view.inputmethod.InputMethodManager.class);
            if (inputMethodManager == null) {
                return;
            }
            if (z) {
                inputMethodManager.showSoftInput(view, 1);
            } else {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    /* synthetic */ zzl(byte[] bArr) {
    }

    private zzl() {
        throw null;
    }
}
