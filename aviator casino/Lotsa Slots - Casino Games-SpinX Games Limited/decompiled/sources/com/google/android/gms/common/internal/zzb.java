package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
final class zzb extends com.google.android.gms.internal.common.zzg {
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, android.os.Looper looper) {
        super(looper);
        java.util.Objects.requireNonNull(baseGmsClient);
        this.zza = baseGmsClient;
    }

    private static final void zza(android.os.Message message) {
        com.google.android.gms.common.internal.zzc zzcVar = (com.google.android.gms.common.internal.zzc) message.obj;
        if (zzcVar != null) {
            zzcVar.zze();
        }
    }

    private static final boolean zzb(android.os.Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = this.zza;
        if (baseGmsClient.zzd.get() != message.arg1) {
            if (zzb(message)) {
                zza(message);
                return;
            }
            return;
        }
        if ((message.what == 1 || message.what == 7 || ((message.what == 4 && !baseGmsClient.enableLocalFallback()) || message.what == 5)) && !baseGmsClient.isConnecting()) {
            zza(message);
            return;
        }
        if (message.what == 4) {
            baseGmsClient.zzn(new com.google.android.gms.common.ConnectionResult(message.arg2));
            if (baseGmsClient.zzg() && !baseGmsClient.zzo()) {
                baseGmsClient.zzd(3, null);
                return;
            }
            com.google.android.gms.common.ConnectionResult zzm = baseGmsClient.zzm() != null ? baseGmsClient.zzm() : new com.google.android.gms.common.ConnectionResult(8);
            baseGmsClient.zzc.onReportServiceBinding(zzm);
            baseGmsClient.onConnectionFailed(zzm);
            return;
        }
        if (message.what == 5) {
            com.google.android.gms.common.ConnectionResult zzm2 = baseGmsClient.zzm() != null ? baseGmsClient.zzm() : new com.google.android.gms.common.ConnectionResult(8);
            baseGmsClient.zzc.onReportServiceBinding(zzm2);
            baseGmsClient.onConnectionFailed(zzm2);
            return;
        }
        if (message.what == 3) {
            com.google.android.gms.common.ConnectionResult connectionResult = new com.google.android.gms.common.ConnectionResult(message.arg2, message.obj instanceof android.app.PendingIntent ? (android.app.PendingIntent) message.obj : null);
            baseGmsClient.zzc.onReportServiceBinding(connectionResult);
            baseGmsClient.onConnectionFailed(connectionResult);
            return;
        }
        if (message.what == 6) {
            baseGmsClient.zzd(5, null);
            if (baseGmsClient.zzk() != null) {
                baseGmsClient.zzk().onConnectionSuspended(message.arg2);
            }
            baseGmsClient.onConnectionSuspended(message.arg2);
            baseGmsClient.zze(5, 1, null);
            return;
        }
        if (message.what == 2 && !baseGmsClient.isConnected()) {
            zza(message);
            return;
        }
        if (zzb(message)) {
            ((com.google.android.gms.common.internal.zzc) message.obj).zzd();
            return;
        }
        int i = message.what;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 34);
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        android.util.Log.wtf("GmsClient", sb.toString(), new java.lang.Exception());
    }
}
