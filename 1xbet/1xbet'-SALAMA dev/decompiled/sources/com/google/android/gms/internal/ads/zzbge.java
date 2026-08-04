package com.google.android.gms.internal.ads;

import J2.j;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.MediaView;

/* JADX INFO: loaded from: classes.dex */
public final class zzbge {
    private final zzbgd zza;

    public zzbge(zzbgd zzbgdVar) {
        Context context;
        this.zza = zzbgdVar;
        try {
            context = (Context) p105o3.b.t0(zzbgdVar.zzh());
        } catch (RemoteException | NullPointerException e7) {
            j.e("", e7);
            context = null;
        }
        if (context != null) {
            try {
                this.zza.zzs(new p105o3.b(new MediaView(context)));
            } catch (RemoteException e8) {
                j.e("", e8);
            }
        }
    }

    public final zzbgd zza() {
        return this.zza;
    }

    public final String zzb() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e7) {
            j.e("", e7);
            return null;
        }
    }
}
