package com.google.mlkit.common.model;

/* loaded from: classes9.dex */
public abstract class RemoteModelSource {
    private final java.lang.String zza;

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass().equals(getClass())) {
            return com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.mlkit.common.model.RemoteModelSource) obj).zza);
        }
        return false;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza);
    }

    public java.lang.String toString() {
        com.google.android.gms.internal.mlkit_common.zzq zzb = com.google.android.gms.internal.mlkit_common.zzr.zzb("RemoteModelSource");
        zzb.zza("firebaseModelName", this.zza);
        return zzb.toString();
    }

    public final java.lang.String zza() {
        return this.zza;
    }

    protected RemoteModelSource(java.lang.String str) {
        this.zza = str;
    }
}
