package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
final class zzcu extends com.google.android.gms.common.api.internal.RegisterListenerMethod<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.drive.events.OpenFileCallback> {
    private final /* synthetic */ com.google.android.gms.drive.DriveFile zzfs;
    private final /* synthetic */ int zzft;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzg zzfu;
    private final /* synthetic */ com.google.android.gms.common.api.internal.ListenerHolder zzfv;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzch zzfw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcu(com.google.android.gms.internal.drive.zzch zzchVar, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder, com.google.android.gms.drive.DriveFile driveFile, int i, com.google.android.gms.internal.drive.zzg zzgVar, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder2) {
        super(listenerHolder);
        this.zzfw = zzchVar;
        this.zzfs = driveFile;
        this.zzft = i;
        this.zzfu = zzgVar;
        this.zzfv = listenerHolder2;
    }

    @Override // com.google.android.gms.common.api.internal.RegisterListenerMethod
    protected final /* synthetic */ void registerListener(com.google.android.gms.internal.drive.zzaw zzawVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        this.zzfu.setCancelToken(com.google.android.gms.common.internal.ICancelToken.Stub.asInterface(((com.google.android.gms.internal.drive.zzeo) zzawVar.getService()).zza(new com.google.android.gms.internal.drive.zzgj(this.zzfs.getDriveId(), this.zzft, 0), new com.google.android.gms.internal.drive.zzdk(this.zzfw, this.zzfu, this.zzfv)).zzgs));
        taskCompletionSource.setResult(null);
    }
}
