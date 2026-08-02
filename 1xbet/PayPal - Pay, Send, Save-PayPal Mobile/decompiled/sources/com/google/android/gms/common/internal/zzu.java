package com.google.android.gms.common.internal;

/* loaded from: classes8.dex */
public final class zzu extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.ICancelToken {
    zzu(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
    }

    @Override // com.google.android.gms.common.internal.ICancelToken
    public final void cancel() throws android.os.RemoteException {
        zzC(2, zza());
    }
}
