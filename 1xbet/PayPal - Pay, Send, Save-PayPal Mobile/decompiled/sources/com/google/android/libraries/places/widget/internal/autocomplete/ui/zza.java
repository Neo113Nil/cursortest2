package com.google.android.libraries.places.widget.internal.autocomplete.ui;

/* loaded from: classes8.dex */
final class zza extends androidx.view.OnBackPressedCallback {
    final /* synthetic */ com.google.android.libraries.places.widget.internal.autocomplete.ui.AutocompleteImplFragment zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zza(com.google.android.libraries.places.widget.internal.autocomplete.ui.AutocompleteImplFragment autocompleteImplFragment, boolean z) {
        super(true);
        java.util.Objects.requireNonNull(autocompleteImplFragment);
        this.zza = autocompleteImplFragment;
    }

    @Override // androidx.view.OnBackPressedCallback
    public final void handleOnBackPressed() {
        this.zza.zzg().zzj();
    }
}
