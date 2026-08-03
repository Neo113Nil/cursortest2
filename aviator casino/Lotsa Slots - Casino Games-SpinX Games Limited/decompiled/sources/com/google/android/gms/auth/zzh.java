package com.google.android.gms.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes3.dex */
final class zzh implements com.google.android.gms.auth.zzk {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ android.os.Bundle zzb;

    zzh(java.lang.String str, android.os.Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.auth.zzk
    public final /* bridge */ /* synthetic */ java.lang.Object zza(android.os.IBinder iBinder) throws android.os.RemoteException, java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
        android.os.Bundle zzd = com.google.android.gms.internal.auth.zze.zzb(iBinder).zzd(this.zza, this.zzb);
        com.google.android.gms.auth.zzl.zzc(zzd);
        java.lang.String string = zzd.getString(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c);
        if (zzd.getBoolean("booleanResult")) {
            return null;
        }
        throw new com.google.android.gms.auth.GoogleAuthException(string);
    }
}
