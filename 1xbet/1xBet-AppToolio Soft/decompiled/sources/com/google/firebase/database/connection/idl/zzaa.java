package com.google.firebase.database.connection.idl;

import android.os.RemoteException;
import com.google.android.gms.internal.firebase_database.zzbb;

/* loaded from: classes.dex */
final class zzaa implements zzbb {
    private final /* synthetic */ zzah zzfu;

    zzaa(zzah zzahVar) {
        this.zzfu = zzahVar;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzbb
    public final void zzb(String str, String str2) {
        try {
            this.zzfu.zzb(str, str2);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
