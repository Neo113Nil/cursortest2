package com.google.firebase.database.connection.idl;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class zzag extends zzo {
    private final /* synthetic */ com.google.android.gms.internal.firebase_database.zzae zzga;

    zzag(zzaf zzafVar, com.google.android.gms.internal.firebase_database.zzae zzaeVar) {
        this.zzga = zzaeVar;
    }

    @Override // com.google.firebase.database.connection.idl.zzn
    public final void onError(String str) throws RemoteException {
        this.zzga.onError(str);
    }

    @Override // com.google.firebase.database.connection.idl.zzn
    public final void zzf(String str) throws RemoteException {
        this.zzga.zzf(str);
    }
}
