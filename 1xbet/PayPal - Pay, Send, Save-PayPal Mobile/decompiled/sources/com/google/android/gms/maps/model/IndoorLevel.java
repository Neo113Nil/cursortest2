package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
public final class IndoorLevel {
    private final com.google.android.gms.internal.maps.zzad zza;

    public IndoorLevel(com.google.android.gms.internal.maps.zzad zzadVar) {
        this.zza = (com.google.android.gms.internal.maps.zzad) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzadVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.maps.model.IndoorLevel)) {
            return false;
        }
        try {
            return this.zza.zzh(((com.google.android.gms.maps.model.IndoorLevel) obj).zza);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final java.lang.String getName() {
        try {
            return this.zza.zze();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final java.lang.String getShortName() {
        try {
            return this.zza.zzf();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.zza.zzd();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void activate() {
        try {
            this.zza.zzg();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }
}
