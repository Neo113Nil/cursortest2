package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
final class zztg extends zzkf {
    private final /* synthetic */ zzst zzbnw;

    zztg(zzst zzstVar) {
        this.zzbnw = zzstVar;
    }

    @Override // com.google.android.gms.internal.ads.zzke
    public final void onAdClicked() throws RemoteException {
        List list;
        list = this.zzbnw.zzxo;
        list.add(new zzth(this));
    }
}
