package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzuw {
    private static final com.google.android.libraries.places.internal.zzuz zza = new com.google.android.libraries.places.internal.zzuu();
    private static final com.google.android.libraries.places.internal.zzuy zzb = new com.google.android.libraries.places.internal.zzuv();
    private final com.google.android.libraries.places.internal.zzuz zze;
    private final java.util.Map zzc = new java.util.HashMap();
    private final java.util.Map zzd = new java.util.HashMap();
    private com.google.android.libraries.places.internal.zzuy zzf = null;

    public final com.google.android.libraries.places.internal.zzuw zza(com.google.android.libraries.places.internal.zzuy zzuyVar) {
        this.zzf = zzuyVar;
        return this;
    }

    final void zzb(com.google.android.libraries.places.internal.zztv zztvVar) {
        com.google.android.libraries.places.internal.zzxb.zza(zztvVar, "key");
        if (!zztvVar.zzf()) {
            com.google.android.libraries.places.internal.zzuz zzuzVar = zza;
            com.google.android.libraries.places.internal.zzxb.zza(zztvVar, "key");
            this.zzd.remove(zztvVar);
            this.zzc.put(zztvVar, zzuzVar);
            return;
        }
        com.google.android.libraries.places.internal.zzuy zzuyVar = zzb;
        com.google.android.libraries.places.internal.zzxb.zza(zztvVar, "key");
        com.google.android.libraries.places.internal.zzxb.zzb(zztvVar.zzf(), "key must be repeating");
        this.zzc.remove(zztvVar);
        this.zzd.put(zztvVar, zzuyVar);
    }

    public final com.google.android.libraries.places.internal.zzva zzc() {
        return new com.google.android.libraries.places.internal.zzux(this, null);
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzuy zzg() {
        return this.zzf;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzuz zzf() {
        return this.zze;
    }

    final /* synthetic */ java.util.Map zze() {
        return this.zzd;
    }

    final /* synthetic */ java.util.Map zzd() {
        return this.zzc;
    }
}
