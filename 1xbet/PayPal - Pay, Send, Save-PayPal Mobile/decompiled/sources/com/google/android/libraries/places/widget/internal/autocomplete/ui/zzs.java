package com.google.android.libraries.places.widget.internal.autocomplete.ui;

/* loaded from: classes8.dex */
final class zzs implements android.view.View.OnClickListener {
    final /* synthetic */ com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment zza;

    zzs(com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment baseAutocompleteImplFragment) {
        java.util.Objects.requireNonNull(baseAutocompleteImplFragment);
        this.zza = baseAutocompleteImplFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        this.zza.zzi();
    }
}
