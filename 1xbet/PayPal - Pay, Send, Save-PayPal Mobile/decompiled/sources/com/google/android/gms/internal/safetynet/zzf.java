package com.google.android.gms.internal.safetynet;

/* loaded from: classes8.dex */
public abstract class zzf extends com.google.android.gms.internal.safetynet.zzb implements com.google.android.gms.internal.safetynet.zzg {
    public zzf() {
        super("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    }

    @Override // com.google.android.gms.internal.safetynet.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            zzd((com.google.android.gms.common.api.Status) com.google.android.gms.internal.safetynet.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR), (com.google.android.gms.safetynet.zza) com.google.android.gms.internal.safetynet.zzc.zza(parcel, com.google.android.gms.safetynet.zza.CREATOR));
        } else if (i == 2) {
            zze(parcel.readString());
        } else if (i == 3) {
            zzj((com.google.android.gms.common.api.Status) com.google.android.gms.internal.safetynet.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR), (com.google.android.gms.safetynet.SafeBrowsingData) com.google.android.gms.internal.safetynet.zzc.zza(parcel, com.google.android.gms.safetynet.SafeBrowsingData.CREATOR));
        } else if (i == 4) {
            zzb((com.google.android.gms.common.api.Status) com.google.android.gms.internal.safetynet.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR), com.google.android.gms.internal.safetynet.zzc.zzc(parcel));
        } else if (i == 6) {
            zzh((com.google.android.gms.common.api.Status) com.google.android.gms.internal.safetynet.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR), (com.google.android.gms.safetynet.zzf) com.google.android.gms.internal.safetynet.zzc.zza(parcel, com.google.android.gms.safetynet.zzf.CREATOR));
        } else if (i == 8) {
            zzg((com.google.android.gms.common.api.Status) com.google.android.gms.internal.safetynet.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR), (com.google.android.gms.safetynet.zzd) com.google.android.gms.internal.safetynet.zzc.zza(parcel, com.google.android.gms.safetynet.zzd.CREATOR));
        } else if (i == 10) {
            zzf((com.google.android.gms.common.api.Status) com.google.android.gms.internal.safetynet.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR), com.google.android.gms.internal.safetynet.zzc.zzc(parcel));
        } else if (i == 11) {
            zzc((com.google.android.gms.common.api.Status) com.google.android.gms.internal.safetynet.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR));
        } else if (i == 15) {
            zzi((com.google.android.gms.common.api.Status) com.google.android.gms.internal.safetynet.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR), (com.google.android.gms.safetynet.zzh) com.google.android.gms.internal.safetynet.zzc.zza(parcel, com.google.android.gms.safetynet.zzh.CREATOR));
        } else {
            if (i != 16) {
                return false;
            }
            zzk((com.google.android.gms.common.api.Status) com.google.android.gms.internal.safetynet.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR), parcel.readString(), parcel.readInt());
        }
        return true;
    }
}
