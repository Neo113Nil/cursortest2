package com.google.android.libraries.places.widget.internal.autocomplete.ui;

/* loaded from: classes8.dex */
final class zzt extends androidx.recyclerview.widget.RecyclerView.OnScrollListener {
    final /* synthetic */ com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment zza;

    zzt(com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment baseAutocompleteImplFragment) {
        java.util.Objects.requireNonNull(baseAutocompleteImplFragment);
        this.zza = baseAutocompleteImplFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        if (i == 1) {
            try {
                com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment baseAutocompleteImplFragment = this.zza;
                baseAutocompleteImplFragment.zzj().zze();
                baseAutocompleteImplFragment.zzk().clearFocus();
            } catch (java.lang.Error | java.lang.RuntimeException e) {
                com.google.android.libraries.places.internal.zznb.zzb(e);
                throw e;
            }
        }
    }
}
