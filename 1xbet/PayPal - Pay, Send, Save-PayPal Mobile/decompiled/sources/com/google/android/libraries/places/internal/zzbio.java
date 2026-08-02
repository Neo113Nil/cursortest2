package com.google.android.libraries.places.internal;

/* loaded from: classes.dex */
public final class zzbio {
    public static final com.google.android.libraries.places.internal.zzbio zza;
    private static final java.util.IdentityHashMap zzc;
    private final java.util.IdentityHashMap zzb;

    static {
        java.util.IdentityHashMap identityHashMap = new java.util.IdentityHashMap();
        zzc = identityHashMap;
        zza = new com.google.android.libraries.places.internal.zzbio(identityHashMap);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        java.util.IdentityHashMap identityHashMap = this.zzb;
        java.util.IdentityHashMap identityHashMap2 = ((com.google.android.libraries.places.internal.zzbio) obj).zzb;
        if (identityHashMap.size() != identityHashMap2.size()) {
            return false;
        }
        for (java.util.Map.Entry entry : identityHashMap.entrySet()) {
            if (!identityHashMap2.containsKey(entry.getKey()) || !com.google.common.base.Objects.equal(entry.getValue(), identityHashMap2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (java.util.Map.Entry entry : this.zzb.entrySet()) {
            i += com.google.common.base.Objects.hashCode(entry.getKey(), entry.getValue());
        }
        return i;
    }

    public final java.lang.String toString() {
        return this.zzb.toString();
    }

    @javax.annotation.Nullable
    public final java.lang.Object zza(com.google.android.libraries.places.internal.zzbin zzbinVar) {
        return this.zzb.get(zzbinVar);
    }

    final /* synthetic */ java.util.IdentityHashMap zzd() {
        return this.zzb;
    }

    public final com.google.android.libraries.places.internal.zzbim zzc() {
        return new com.google.android.libraries.places.internal.zzbim(this, null);
    }

    public static com.google.android.libraries.places.internal.zzbim zzb() {
        return new com.google.android.libraries.places.internal.zzbim(zza, null);
    }

    /* synthetic */ zzbio(java.util.IdentityHashMap identityHashMap, byte[] bArr) {
        this.zzb = identityHashMap;
    }

    private zzbio(java.util.IdentityHashMap identityHashMap) {
        this.zzb = identityHashMap;
    }
}
