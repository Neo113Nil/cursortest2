package com.google.android.gms.internal.ads;

import J2.j;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzbfd {
    private final zzbfc zza;
    private final List zzb = new ArrayList();
    private String zzc;

    public zzbfd(zzbfc zzbfcVar) {
        IBinder iBinder;
        this.zza = zzbfcVar;
        try {
            this.zzc = zzbfcVar.zzg();
        } catch (RemoteException e7) {
            j.e("", e7);
            this.zzc = "";
        }
        try {
            for (Object obj : zzbfcVar.zzh()) {
                zzbfj zzbfhVar = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbfhVar = iInterfaceQueryLocalInterface instanceof zzbfj ? (zzbfj) iInterfaceQueryLocalInterface : new zzbfh(iBinder);
                }
                if (zzbfhVar != null) {
                    this.zzb.add(new zzbfk(zzbfhVar));
                }
            }
        } catch (RemoteException e8) {
            j.e("", e8);
        }
    }

    public final List<B2.a> getImages() {
        return this.zzb;
    }

    public final CharSequence getText() {
        return this.zzc;
    }
}
