package com.google.android.gms.common;

/* loaded from: classes4.dex */
abstract class zzj extends com.google.android.gms.common.internal.zzw {
    private final int zza;

    protected zzj(byte[] bArr) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(bArr.length == 25);
        this.zza = java.util.Arrays.hashCode(bArr);
    }

    public final boolean equals(java.lang.Object obj) {
        com.google.android.gms.dynamic.IObjectWrapper zzd;
        if (!(obj instanceof com.google.android.gms.common.internal.zzx)) {
            return false;
        }
        try {
            com.google.android.gms.common.internal.zzx zzxVar = (com.google.android.gms.common.internal.zzx) obj;
            if (zzxVar.zze() == this.zza && (zzd = zzxVar.zzd()) != null) {
                return java.util.Arrays.equals(zzc(), (byte[]) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzd));
            }
            return false;
        } catch (android.os.RemoteException e) {
            android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    abstract byte[] zzc();

    @Override // com.google.android.gms.common.internal.zzx
    public final com.google.android.gms.dynamic.IObjectWrapper zzd() {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(zzc());
    }

    @Override // com.google.android.gms.common.internal.zzx
    public final int zze() {
        return this.zza;
    }

    public final int hashCode() {
        return this.zza;
    }
}
