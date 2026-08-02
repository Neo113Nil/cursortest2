package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzheh implements zzheg, zzhea {
    private static final zzheh zza = new zzheh(null);
    private final Object zzb;

    private zzheh(Object obj) {
        this.zzb = obj;
    }

    public static zzheg zza(Object obj) {
        zzheo.zza(obj, "instance cannot be null");
        return new zzheh(obj);
    }

    public static zzheg zzc(Object obj) {
        return obj == null ? zza : new zzheh(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        return this.zzb;
    }
}
