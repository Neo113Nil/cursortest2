package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@18.1.0 */
/* loaded from: classes.dex */
final class zzk extends zzd {
    private final /* synthetic */ zzl zzcj;

    zzk(zzl zzlVar) {
        this.zzcj = zzlVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzd, com.google.android.gms.auth.api.signin.internal.zzt
    public final void zze(Status status) throws RemoteException {
        this.zzcj.setResult((zzl) status);
    }
}
