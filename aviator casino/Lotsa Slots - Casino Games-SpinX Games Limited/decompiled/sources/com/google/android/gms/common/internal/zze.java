package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public final class zze implements android.content.ServiceConnection {
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zza;
    private final int zzb;

    public zze(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, int i) {
        java.util.Objects.requireNonNull(baseGmsClient);
        this.zza = baseGmsClient;
        this.zzb = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = this.zza;
        if (iBinder == null) {
            baseGmsClient.zzf(16);
            return;
        }
        synchronized (baseGmsClient.zzh()) {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            baseGmsClient.zzi((queryLocalInterface == null || !(queryLocalInterface instanceof com.google.android.gms.common.internal.IGmsServiceBroker)) ? new com.google.android.gms.common.internal.zzaa(iBinder) : (com.google.android.gms.common.internal.IGmsServiceBroker) queryLocalInterface);
        }
        this.zza.zzb(0, null, this.zzb);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = this.zza;
        synchronized (baseGmsClient.zzh()) {
            baseGmsClient.zzi(null);
        }
        com.google.android.gms.common.internal.BaseGmsClient baseGmsClient2 = this.zza;
        int i = this.zzb;
        android.os.Handler handler = baseGmsClient2.zzb;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
