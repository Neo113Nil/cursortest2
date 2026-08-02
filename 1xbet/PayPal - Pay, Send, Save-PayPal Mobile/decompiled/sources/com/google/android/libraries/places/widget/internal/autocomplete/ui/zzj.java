package com.google.android.libraries.places.widget.internal.autocomplete.ui;

/* loaded from: classes8.dex */
public final class zzj extends androidx.fragment.app.FragmentFactory {
    private final int zza;
    private final com.google.android.libraries.places.api.net.PlacesClient zzb;
    private final com.google.android.libraries.places.internal.zznq zzc;
    private final com.google.android.libraries.places.internal.zzpu zzd;
    private final com.google.android.libraries.places.internal.zzef zze;

    public zzj(int i, com.google.android.libraries.places.internal.zzpt zzptVar, com.google.android.libraries.places.internal.zznq zznqVar) {
        this.zza = i;
        this.zzb = zzptVar.zzc();
        this.zzc = zznqVar;
        this.zzd = zzptVar.zzd();
        this.zze = zzptVar.zzb();
    }

    @Override // androidx.fragment.app.FragmentFactory
    public final androidx.fragment.app.Fragment instantiate(java.lang.ClassLoader classLoader, java.lang.String str) {
        return loadFragmentClass(classLoader, str) == com.google.android.libraries.places.widget.internal.autocomplete.ui.AutocompleteImplFragment.class ? new com.google.android.libraries.places.widget.internal.autocomplete.ui.AutocompleteImplFragment(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null) : super.instantiate(classLoader, str);
    }
}
