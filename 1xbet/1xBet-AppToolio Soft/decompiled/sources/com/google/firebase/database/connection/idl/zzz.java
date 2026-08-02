package com.google.firebase.database.connection.idl;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class zzz implements com.google.android.gms.internal.firebase_database.zzai {
    private final /* synthetic */ zzq zzft;

    zzz(IPersistentConnectionImpl iPersistentConnectionImpl, zzq zzqVar) {
        this.zzft = zzqVar;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzai
    public final String zzx() {
        try {
            return this.zzft.zzx();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzai
    public final boolean zzy() {
        try {
            return this.zzft.zzy();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzai
    public final com.google.android.gms.internal.firebase_database.zzy zzz() {
        try {
            return zza.zza(this.zzft.zzaw());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
