package com.google.firebase.database.connection.idl;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class zzae implements com.google.android.gms.internal.firebase_database.zzae {
    private final /* synthetic */ zzn zzfy;

    zzae(zzad zzadVar, zzn zznVar) {
        this.zzfy = zznVar;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzae
    public final void onError(String str) {
        try {
            this.zzfy.onError(str);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzae
    public final void zzf(String str) {
        try {
            this.zzfy.zzf(str);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
