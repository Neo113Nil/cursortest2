package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
final class zzcq extends com.google.android.gms.common.api.internal.UnregisterListenerMethod<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.internal.drive.zzdi> {
    private final /* synthetic */ com.google.android.gms.drive.DriveResource zzfq;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzdi zzfr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcq(com.google.android.gms.internal.drive.zzch zzchVar, com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey, com.google.android.gms.drive.DriveResource driveResource, com.google.android.gms.internal.drive.zzdi zzdiVar) {
        super(listenerKey);
        this.zzfq = driveResource;
        this.zzfr = zzdiVar;
    }

    @Override // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    protected final /* synthetic */ void unregisterListener(com.google.android.gms.internal.drive.zzaw zzawVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        com.google.android.gms.internal.drive.zzee zzeeVar;
        com.google.android.gms.internal.drive.zzeo zzeoVar = (com.google.android.gms.internal.drive.zzeo) zzawVar.getService();
        com.google.android.gms.internal.drive.zzgs zzgsVar = new com.google.android.gms.internal.drive.zzgs(this.zzfq.getDriveId(), 1);
        zzeeVar = this.zzfr.zzgh;
        zzeoVar.zza(zzgsVar, zzeeVar, (java.lang.String) null, new com.google.android.gms.internal.drive.zzhq(taskCompletionSource));
    }
}
