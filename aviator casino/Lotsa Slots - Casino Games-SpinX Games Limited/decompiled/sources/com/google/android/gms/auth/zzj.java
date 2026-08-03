package com.google.android.gms.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes3.dex */
final class zzj implements com.google.android.gms.auth.zzk {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ android.content.Context zzb;

    zzj(java.lang.String str, android.content.Context context) {
        this.zza = str;
        this.zzb = context;
    }

    @Override // com.google.android.gms.auth.zzk
    public final /* bridge */ /* synthetic */ java.lang.Object zza(android.os.IBinder iBinder) throws android.os.RemoteException, java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
        android.os.Bundle zzg = com.google.android.gms.internal.auth.zze.zzb(iBinder).zzg(this.zza);
        com.google.android.gms.auth.zzl.zzc(zzg);
        java.lang.String string = zzg.getString(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c);
        android.content.Intent intent = (android.content.Intent) zzg.getParcelable("userRecoveryIntent");
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) zzg.getParcelable("userRecoveryPendingIntent");
        if (com.google.android.gms.internal.auth.zzby.SUCCESS.equals(com.google.android.gms.internal.auth.zzby.zza(string))) {
            return true;
        }
        com.google.android.gms.auth.zzl.zzn(this.zzb, "requestGoogleAccountsAccess", string, intent, pendingIntent);
        throw new com.google.android.gms.auth.GoogleAuthException("Invalid state. Shouldn't happen");
    }
}
