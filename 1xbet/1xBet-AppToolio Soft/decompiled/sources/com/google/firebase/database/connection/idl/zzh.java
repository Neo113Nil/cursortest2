package com.google.firebase.database.connection.idl;

import android.os.RemoteException;
import com.google.android.gms.internal.firebase_database.zzbb;

/* loaded from: classes.dex */
final class zzh extends zzai {
    private final /* synthetic */ zzbb zzfr;

    zzh(zzbb zzbbVar) {
        this.zzfr = zzbbVar;
    }

    @Override // com.google.firebase.database.connection.idl.zzah
    public final void zzb(String str, String str2) throws RemoteException {
        this.zzfr.zzb(str, str2);
    }
}
