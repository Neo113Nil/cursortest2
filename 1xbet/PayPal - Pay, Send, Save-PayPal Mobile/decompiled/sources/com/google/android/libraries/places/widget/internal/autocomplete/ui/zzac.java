package com.google.android.libraries.places.widget.internal.autocomplete.ui;

/* loaded from: classes8.dex */
final class zzac implements android.text.TextWatcher {
    final /* synthetic */ com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment zza;

    /* synthetic */ zzac(com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment baseAutocompleteImplFragment, byte[] bArr) {
        java.util.Objects.requireNonNull(baseAutocompleteImplFragment);
        this.zza = baseAutocompleteImplFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        try {
            com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment baseAutocompleteImplFragment = this.zza;
            baseAutocompleteImplFragment.zzj().zzc(editable.toString(), baseAutocompleteImplFragment.zzk().getSelectionEnd());
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }
}
