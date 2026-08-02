package com.google.android.libraries.places.widget.internal.autocomplete.ui;

/* loaded from: classes8.dex */
final class zzk implements android.text.TextWatcher {
    final /* synthetic */ com.google.android.libraries.places.widget.internal.autocomplete.ui.AutocompleteImplFragment zza;

    /* synthetic */ zzk(com.google.android.libraries.places.widget.internal.autocomplete.ui.AutocompleteImplFragment autocompleteImplFragment, byte[] bArr) {
        java.util.Objects.requireNonNull(autocompleteImplFragment);
        this.zza = autocompleteImplFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        try {
            com.google.android.libraries.places.widget.internal.autocomplete.ui.AutocompleteImplFragment autocompleteImplFragment = this.zza;
            autocompleteImplFragment.zzg().zzc(editable.toString(), autocompleteImplFragment.zzh().getSelectionEnd());
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
