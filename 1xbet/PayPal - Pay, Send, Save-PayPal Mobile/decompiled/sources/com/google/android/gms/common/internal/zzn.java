package com.google.android.gms.common.internal;

/* loaded from: classes4.dex */
public final class zzn {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final android.content.ComponentName zzc;
    private final int zzd;
    private final boolean zze;
    private final android.os.UserHandle zzf;

    public zzn(android.content.ComponentName componentName, int i, android.os.UserHandle userHandle) {
        this.zza = null;
        this.zzb = null;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(componentName);
        this.zzc = componentName;
        this.zzd = 4225;
        this.zze = false;
        this.zzf = null;
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
            if (this.zze == zznVar.zze && com.google.android.gms.common.internal.Objects.equal(this.zzf, zznVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        java.lang.String str2 = this.zzb;
        android.content.ComponentName componentName = this.zzc;
        boolean z = this.zze;
        return com.google.android.gms.common.internal.Objects.hashCode(str, str2, componentName, 4225, java.lang.Boolean.valueOf(z), this.zzf);
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

    public zzn(java.lang.String str, int i, boolean z) {
        this(str, "com.google.android.gms", 4225, false, null);
    }

    public zzn(java.lang.String str, java.lang.String str2, int i, boolean z, android.os.UserHandle userHandle) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zza = str;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        this.zzb = str2;
        this.zzc = null;
        this.zzd = 4225;
        this.zze = z;
        this.zzf = userHandle;
    }

    public final android.os.UserHandle zze() {
        return this.zzf;
    }

    public final boolean zzd() {
        return this.zze;
    }

    public final android.content.ComponentName zzc() {
        return this.zzc;
    }

    public final java.lang.String zzb() {
        return this.zzb;
    }

    public final java.lang.String zza() {
        return this.zza;
    }
}
