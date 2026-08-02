package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbim {
    private com.google.android.libraries.places.internal.zzbio zza;
    private java.util.IdentityHashMap zzb;

    private final java.util.IdentityHashMap zzd(int i) {
        if (this.zzb == null) {
            java.util.IdentityHashMap identityHashMap = new java.util.IdentityHashMap(this.zza.zzd().size() + i);
            this.zzb = identityHashMap;
            identityHashMap.putAll(this.zza.zzd());
            this.zza = null;
        }
        return this.zzb;
    }

    public final com.google.android.libraries.places.internal.zzbim zza(com.google.android.libraries.places.internal.zzbin zzbinVar, java.lang.Object obj) {
        zzd(1).put(zzbinVar, obj);
        return this;
    }

    public final com.google.android.libraries.places.internal.zzbim zzb(com.google.android.libraries.places.internal.zzbin zzbinVar) {
        com.google.android.libraries.places.internal.zzbio zzbioVar = this.zza;
        if (zzbioVar == null) {
            this.zzb.remove(zzbinVar);
            return this;
        }
        if (zzbioVar.zzd().containsKey(zzbinVar)) {
            zzd(0).remove(zzbinVar);
        }
        return this;
    }

    public final com.google.android.libraries.places.internal.zzbio zzc() {
        if (this.zzb != null) {
            this.zza = new com.google.android.libraries.places.internal.zzbio(this.zzb, null);
            this.zzb = null;
        }
        return this.zza;
    }

    /* synthetic */ zzbim(com.google.android.libraries.places.internal.zzbio zzbioVar, byte[] bArr) {
        this.zza = zzbioVar;
    }
}
