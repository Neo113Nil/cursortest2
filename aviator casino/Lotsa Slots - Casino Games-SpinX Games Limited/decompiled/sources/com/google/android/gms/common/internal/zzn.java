package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public final class zzn {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final android.content.ComponentName zzc;
    private final int zzd;
    private final boolean zze;

    public zzn(android.content.ComponentName componentName, int i) {
        this.zza = null;
        this.zzb = null;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(componentName);
        this.zzc = componentName;
        this.zzd = 4225;
        this.zze = false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.common.internal.zzn)) {
            return false;
        }
        com.google.android.gms.common.internal.zzn zznVar = (com.google.android.gms.common.internal.zzn) obj;
        if (com.google.android.gms.common.internal.Objects.equal(this.zza, zznVar.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, zznVar.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, zznVar.zzc)) {
            int i = zznVar.zzd;
            if (this.zze == zznVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, this.zzc, 4225, java.lang.Boolean.valueOf(this.zze));
    }

    public final java.lang.String toString() {
        java.lang.String str = this.zza;
        if (str != null) {
            return str;
        }
        android.content.ComponentName componentName = this.zzc;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(componentName);
        return componentName.flattenToString();
    }

    public final java.lang.String zza() {
        return this.zza;
    }

    public final java.lang.String zzb() {
        return this.zzb;
    }

    public final android.content.ComponentName zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zze;
    }

    public zzn(java.lang.String str, int i, boolean z) {
        this(str, "com.google.android.gms", 4225, false);
    }

    public zzn(java.lang.String str, java.lang.String str2, int i, boolean z) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zza = str;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        this.zzb = str2;
        this.zzc = null;
        this.zzd = 4225;
        this.zze = z;
    }
}
