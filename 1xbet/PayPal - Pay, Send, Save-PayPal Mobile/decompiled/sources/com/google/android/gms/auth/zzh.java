package com.google.android.gms.auth;

/* loaded from: classes8.dex */
final class zzh implements com.google.android.gms.auth.zzk {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ android.os.Bundle zzb;

    @Override // com.google.android.gms.auth.zzk
    public final /* synthetic */ java.lang.Object zza(android.os.IBinder iBinder) throws android.os.RemoteException, java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
        android.os.Bundle zzd = com.google.android.gms.internal.auth.zze.zzb(iBinder).zzd(this.zza, this.zzb);
        com.google.android.gms.auth.zzl.zzc(zzd);
        java.lang.String string = zzd.getString("Error");
        if (zzd.getBoolean("booleanResult")) {
            return null;
        }
        throw new com.google.android.gms.auth.GoogleAuthException(string);
    }

    zzh(java.lang.String str, android.os.Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }
}
