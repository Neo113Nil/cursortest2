package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzsq {
    private static final com.google.android.gms.internal.consent_sdk.zzsq zza = new com.google.android.gms.internal.consent_sdk.zzsq(0, new int[0], new java.lang.Object[0], false);
    private int zzb;
    private int[] zzc;
    private java.lang.Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzsq() {
        this(0, new int[8], new java.lang.Object[8], true);
    }

    private zzsq(int i, int[] iArr, java.lang.Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = 0;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static com.google.android.gms.internal.consent_sdk.zzsq zzc() {
        return zza;
    }

    static com.google.android.gms.internal.consent_sdk.zzsq zze(com.google.android.gms.internal.consent_sdk.zzsq zzsqVar, com.google.android.gms.internal.consent_sdk.zzsq zzsqVar2) {
        int i = zzsqVar.zzb;
        int i2 = zzsqVar2.zzb;
        int[] copyOf = java.util.Arrays.copyOf(zzsqVar.zzc, 0);
        int[] iArr = zzsqVar2.zzc;
        int i3 = zzsqVar.zzb;
        int i4 = zzsqVar2.zzb;
        java.lang.System.arraycopy(iArr, 0, copyOf, 0, 0);
        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(zzsqVar.zzd, 0);
        java.lang.Object[] objArr = zzsqVar2.zzd;
        int i5 = zzsqVar.zzb;
        int i6 = zzsqVar2.zzb;
        java.lang.System.arraycopy(objArr, 0, copyOf2, 0, 0);
        return new com.google.android.gms.internal.consent_sdk.zzsq(0, copyOf, copyOf2, true);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof com.google.android.gms.internal.consent_sdk.zzsq)) {
            return false;
        }
        com.google.android.gms.internal.consent_sdk.zzsq zzsqVar = (com.google.android.gms.internal.consent_sdk.zzsq) obj;
        int[] iArr = zzsqVar.zzc;
        java.lang.Object[] objArr = zzsqVar.zzd;
        return true;
    }

    public final int hashCode() {
        return 506991;
    }

    public final int zza() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        this.zze = 0;
        return 0;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        this.zze = 0;
        return 0;
    }

    final com.google.android.gms.internal.consent_sdk.zzsq zzd(com.google.android.gms.internal.consent_sdk.zzsq zzsqVar) {
        if (zzsqVar.equals(zza)) {
            return this;
        }
        if (!this.zzf) {
            throw new java.lang.UnsupportedOperationException();
        }
        int i = zzsqVar.zzb;
        int[] iArr = this.zzc;
        int length = iArr.length;
        java.lang.System.arraycopy(zzsqVar.zzc, 0, iArr, 0, 0);
        java.lang.Object[] objArr = zzsqVar.zzd;
        java.lang.Object[] objArr2 = this.zzd;
        int i2 = zzsqVar.zzb;
        java.lang.System.arraycopy(objArr, 0, objArr2, 0, 0);
        this.zzb = 0;
        return this;
    }

    public final void zzf() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zzg(java.lang.StringBuilder sb, int i) {
    }

    final void zzh(com.google.android.gms.internal.consent_sdk.zztb zztbVar) throws java.io.IOException {
    }
}
