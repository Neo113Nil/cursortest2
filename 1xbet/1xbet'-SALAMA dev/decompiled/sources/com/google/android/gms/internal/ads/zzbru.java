package com.google.android.gms.internal.ads;

import J2.j;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzbru extends O2.a {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbru(zzbfc zzbfcVar) {
        try {
            this.zzb = zzbfcVar.zzg();
        } catch (RemoteException e7) {
            j.e("", e7);
            this.zzb = "";
        }
        try {
            for (Object obj : zzbfcVar.zzh()) {
                zzbfj zzbfjVarZzg = obj instanceof IBinder ? zzbfi.zzg((IBinder) obj) : null;
                if (zzbfjVarZzg != null) {
                    this.zza.add(new zzbrw(zzbfjVarZzg));
                }
            }
        } catch (RemoteException e8) {
            j.e("", e8);
        }
    }

    public final List<O2.b> getImages() {
        return this.zza;
    }

    public final CharSequence getText() {
        return this.zzb;
    }
}
