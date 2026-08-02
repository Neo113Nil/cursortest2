package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public abstract class zzns {
    public static com.google.android.libraries.places.internal.zzns zzh() {
        return zzt(1).zzg();
    }

    public static com.google.android.libraries.places.internal.zzns zzi() {
        return zzt(2).zzg();
    }

    public static com.google.android.libraries.places.internal.zzns zzj() {
        return zzt(3).zzg();
    }

    public static com.google.android.libraries.places.internal.zzns zzk() {
        return zzt(4).zzg();
    }

    public static com.google.android.libraries.places.internal.zzns zzl(java.util.List list) {
        com.google.common.base.Preconditions.checkNotNull(list);
        com.google.android.libraries.places.internal.zznr zzt = zzt(5);
        zzt.zzb(list);
        return zzt.zzg();
    }

    public static com.google.android.libraries.places.internal.zzns zzm(java.lang.String str) {
        com.google.common.base.Preconditions.checkNotNull(str);
        com.google.android.libraries.places.internal.zznr zzt = zzt(6);
        zzt.zza(str);
        return zzt.zzg();
    }

    public static com.google.android.libraries.places.internal.zzns zzn(java.lang.String str, com.google.android.gms.common.api.Status status) {
        com.google.common.base.Preconditions.checkNotNull(str);
        com.google.common.base.Preconditions.checkNotNull(status);
        com.google.android.libraries.places.internal.zznr zzt = zzt(7);
        zzt.zza(str);
        zzt.zzf(status);
        return zzt.zzg();
    }

    public static com.google.android.libraries.places.internal.zzns zzo(com.google.android.libraries.places.api.model.Place place) {
        com.google.common.base.Preconditions.checkNotNull(place);
        com.google.android.libraries.places.internal.zznr zzt = zzt(8);
        zzt.zzc(place);
        return zzt.zzg();
    }

    public static com.google.android.libraries.places.internal.zzns zzp(com.google.android.libraries.places.api.model.AutocompletePrediction autocompletePrediction, com.google.android.libraries.places.api.model.AutocompleteSessionToken autocompleteSessionToken) {
        com.google.common.base.Preconditions.checkNotNull(autocompletePrediction);
        com.google.common.base.Preconditions.checkNotNull(autocompleteSessionToken);
        com.google.android.libraries.places.internal.zznr zzt = zzt(8);
        zzt.zzd(autocompletePrediction);
        zzt.zze(autocompleteSessionToken);
        return zzt.zzg();
    }

    public static com.google.android.libraries.places.internal.zzns zzq(com.google.android.libraries.places.api.model.AutocompletePrediction autocompletePrediction, com.google.android.gms.common.api.Status status) {
        com.google.common.base.Preconditions.checkNotNull(autocompletePrediction);
        com.google.common.base.Preconditions.checkNotNull(status);
        com.google.android.libraries.places.internal.zznr zzt = zzt(9);
        zzt.zzd(autocompletePrediction);
        zzt.zzf(status);
        return zzt.zzg();
    }

    public static com.google.android.libraries.places.internal.zzns zzr() {
        com.google.android.libraries.places.internal.zznr zzt = zzt(10);
        zzt.zzf(new com.google.android.gms.common.api.Status(16));
        return zzt.zzg();
    }

    public static com.google.android.libraries.places.internal.zzns zzs(com.google.android.gms.common.api.Status status) {
        com.google.common.base.Preconditions.checkNotNull(status);
        com.google.android.libraries.places.internal.zznr zzt = zzt(10);
        zzt.zzf(status);
        return zzt.zzg();
    }

    private static com.google.android.libraries.places.internal.zznr zzt(int i) {
        com.google.android.libraries.places.internal.zznn zznnVar = new com.google.android.libraries.places.internal.zznn();
        zznnVar.zzh(i);
        return zznnVar;
    }

    public abstract java.lang.String zza();

    public abstract com.google.common.collect.ImmutableList zzb();

    public abstract com.google.android.libraries.places.api.model.Place zzc();

    public abstract com.google.android.libraries.places.api.model.AutocompletePrediction zzd();

    public abstract com.google.android.libraries.places.api.model.AutocompleteSessionToken zze();

    public abstract com.google.android.gms.common.api.Status zzf();

    public abstract int zzg();
}
