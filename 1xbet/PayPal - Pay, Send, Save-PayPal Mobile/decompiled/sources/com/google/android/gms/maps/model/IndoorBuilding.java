package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
public final class IndoorBuilding {
    private final com.google.android.gms.internal.maps.zzaa zza;

    public IndoorBuilding(com.google.android.gms.internal.maps.zzaa zzaaVar) {
        com.google.android.gms.maps.model.zzl zzlVar = com.google.android.gms.maps.model.zzl.zza;
        this.zza = (com.google.android.gms.internal.maps.zzaa) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzaaVar, "delegate");
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.maps.model.IndoorBuilding)) {
            return false;
        }
        try {
            return this.zza.zzh(((com.google.android.gms.maps.model.IndoorBuilding) obj).zza);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final int getActiveLevelIndex() {
        try {
            return this.zza.zzd();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final int getDefaultLevelIndex() {
        try {
            return this.zza.zze();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final java.util.List<com.google.android.gms.maps.model.IndoorLevel> getLevels() {
        try {
            java.util.List zzg = this.zza.zzg();
            java.util.ArrayList arrayList = new java.util.ArrayList(zzg.size());
            java.util.Iterator it = zzg.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.google.android.gms.maps.model.IndoorLevel(com.google.android.gms.internal.maps.zzac.zzb((android.os.IBinder) it.next())));
            }
            return arrayList;
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.zza.zzf();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isUnderground() {
        try {
            return this.zza.zzi();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }
}
