package com.google.android.gms.internal.ads;

import E2.o;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzche implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;

    public zzche(zzhep zzhepVar, zzhep zzhepVar2) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbui zzb() {
        Context contextZza = ((zzcgi) this.zza).zza();
        zzfgb zzfgbVar = (zzfgb) this.zzb.zzb();
        o oVar = o.f1952C;
        zzbnq zzbnqVarZzb = oVar.f1970q.zzb(contextZza, VersionInfoParcel.j(), zzfgbVar);
        zzbnk zzbnkVar = zzbnn.zza;
        zzbnqVarZzb.zza("google.afma.request.getAdDictionary", zzbnkVar, zzbnkVar);
        return new zzbuk(contextZza, oVar.f1970q.zzb(contextZza, VersionInfoParcel.j(), zzfgbVar).zza("google.afma.sdkConstants.getSdkConstants", zzbnkVar, zzbnkVar), VersionInfoParcel.j());
    }
}
