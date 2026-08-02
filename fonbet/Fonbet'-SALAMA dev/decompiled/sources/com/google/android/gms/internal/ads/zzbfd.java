package com.google.android.gms.internal.ads;

import J2.j;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbfd {
    private final zzbfc zza;
    private final List zzb = new ArrayList();
    private String zzc;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        r4.zzb.add(new com.google.android.gms.internal.ads.zzbfk(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
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
                zzbfj zzbfjVar = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbfjVar = queryLocalInterface instanceof zzbfj ? (zzbfj) queryLocalInterface : new zzbfh(iBinder);
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
