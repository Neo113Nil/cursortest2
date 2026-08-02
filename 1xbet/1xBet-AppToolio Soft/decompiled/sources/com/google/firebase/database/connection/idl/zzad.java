package com.google.firebase.database.connection.idl;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class zzad extends zzl {
    private final /* synthetic */ com.google.android.gms.internal.firebase_database.zzad zzfx;

    zzad(com.google.android.gms.internal.firebase_database.zzad zzadVar) {
        this.zzfx = zzadVar;
    }

    @Override // com.google.firebase.database.connection.idl.zzk
    public final void zza(boolean z, zzn zznVar) throws RemoteException {
        this.zzfx.zza(z, new zzae(this, zznVar));
    }
}
