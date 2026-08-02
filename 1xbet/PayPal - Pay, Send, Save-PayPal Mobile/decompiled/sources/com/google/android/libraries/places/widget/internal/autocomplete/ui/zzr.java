package com.google.android.libraries.places.widget.internal.autocomplete.ui;

/* loaded from: classes8.dex */
final class zzr extends androidx.view.OnBackPressedCallback {
    final /* synthetic */ com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzr(com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment baseAutocompleteImplFragment, boolean z) {
        super(true);
        java.util.Objects.requireNonNull(baseAutocompleteImplFragment);
        this.zza = baseAutocompleteImplFragment;
    }

    @Override // androidx.view.OnBackPressedCallback
    public final void handleOnBackPressed() {
        this.zza.zzj().zzj();
    }
}
