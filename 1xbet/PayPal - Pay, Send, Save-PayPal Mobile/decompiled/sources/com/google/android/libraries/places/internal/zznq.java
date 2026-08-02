package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public abstract class zznq implements android.os.Parcelable {
    public static com.google.android.libraries.places.internal.zznp zzs(com.google.android.libraries.places.widget.model.AutocompleteActivityMode autocompleteActivityMode, java.util.List list, com.google.android.libraries.places.internal.zzor zzorVar) {
        com.google.android.libraries.places.internal.zznj zznjVar = new com.google.android.libraries.places.internal.zznj();
        zznjVar.zzj(new java.util.ArrayList());
        zznjVar.zzk(new java.util.ArrayList());
        zznjVar.zzb(autocompleteActivityMode);
        zznjVar.zzc(list);
        zznjVar.zzd(zzorVar);
        zznjVar.zzl(0);
        zznjVar.zzm(0);
        zznjVar.zzp(false);
        zznjVar.zza(com.google.android.libraries.places.internal.zzow.PABLO);
        return zznjVar;
    }

    public static com.google.android.libraries.places.internal.zznp zzt(com.google.android.libraries.places.internal.zzow zzowVar) {
        com.google.android.libraries.places.internal.zznj zznjVar = new com.google.android.libraries.places.internal.zznj();
        zznjVar.zzj(new java.util.ArrayList());
        zznjVar.zzk(new java.util.ArrayList());
        zznjVar.zzc(new java.util.ArrayList());
        zznjVar.zzl(0);
        zznjVar.zzm(0);
        zznjVar.zzb(com.google.android.libraries.places.widget.model.AutocompleteActivityMode.FULLSCREEN);
        zznjVar.zzd(com.google.android.libraries.places.internal.zzor.INTENT);
        zznjVar.zza(zzowVar);
        zznjVar.zzp(false);
        return zznjVar;
    }

    public abstract com.google.android.libraries.places.internal.zzow zza();

    public abstract com.google.android.libraries.places.widget.model.AutocompleteActivityMode zzb();

    public abstract com.google.common.collect.ImmutableList zzc();

    public abstract com.google.android.libraries.places.internal.zzor zzd();

    public abstract com.google.android.gms.maps.model.LatLng zze();

    public abstract java.lang.String zzf();

    public abstract java.lang.String zzg();

    public abstract com.google.android.libraries.places.api.model.LocationBias zzh();

    public abstract com.google.android.libraries.places.api.model.LocationRestriction zzi();

    public abstract com.google.common.collect.ImmutableList zzj();

    public abstract com.google.common.collect.ImmutableList zzk();

    public abstract int zzl();

    public abstract int zzm();

    public abstract java.lang.String zzn();

    public abstract com.google.android.libraries.places.widget.model.AutocompleteUiCustomization zzo();

    public abstract boolean zzp();

    public abstract com.google.android.libraries.places.api.model.AutocompleteSessionToken zzq();

    public abstract com.google.android.libraries.places.internal.zznp zzr();
}
