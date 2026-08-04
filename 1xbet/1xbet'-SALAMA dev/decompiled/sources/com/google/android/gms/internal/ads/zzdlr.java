package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import W5.AbstractC0486a1;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzdlr implements zzbiz {
    private final zzbgn zza;
    private final zzdmf zzb;
    private final zzhea zzc;

    public zzdlr(zzdhn zzdhnVar, zzdhc zzdhcVar, zzdmf zzdmfVar, zzhea zzheaVar) {
        this.zza = zzdhnVar.zzc(zzdhcVar.zzA());
        this.zzb = zzdmfVar;
        this.zzc = zzheaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzbgd) this.zzc.zzb(), str);
        } catch (RemoteException e7) {
            String strH = AbstractC0486a1.h("Failed to call onCustomClick for asset ", str, ".");
            int i7 = J.f3546b;
            j.h(strH, e7);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzl("/nativeAdCustomClick", this);
    }
}
