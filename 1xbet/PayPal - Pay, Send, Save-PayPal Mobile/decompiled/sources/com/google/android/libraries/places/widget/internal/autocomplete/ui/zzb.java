package com.google.android.libraries.places.widget.internal.autocomplete.ui;

/* loaded from: classes8.dex */
final class zzb extends androidx.recyclerview.widget.RecyclerView.OnScrollListener {
    final /* synthetic */ com.google.android.libraries.places.widget.internal.autocomplete.ui.AutocompleteImplFragment zza;

    zzb(com.google.android.libraries.places.widget.internal.autocomplete.ui.AutocompleteImplFragment autocompleteImplFragment) {
        java.util.Objects.requireNonNull(autocompleteImplFragment);
        this.zza = autocompleteImplFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        if (i == 1) {
            try {
                com.google.android.libraries.places.widget.internal.autocomplete.ui.AutocompleteImplFragment autocompleteImplFragment = this.zza;
                autocompleteImplFragment.zzg().zze();
                autocompleteImplFragment.zzh().clearFocus();
            } catch (java.lang.Error | java.lang.RuntimeException e) {
                com.google.android.libraries.places.internal.zznb.zzb(e);
                throw e;
            }
        }
    }
}
