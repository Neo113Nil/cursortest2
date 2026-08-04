package com.google.android.gms.internal.ads;

import H2.j;
import I2.J;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzbiq implements zzbiz {
    @Override // com.google.android.gms.internal.ads.zzbiz
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzceb zzcebVar = (zzceb) obj;
        if (zzcebVar.zzJ() != null) {
            zzcebVar.zzJ().zza();
        }
        j jVarZzL = zzcebVar.zzL();
        if (jVarZzL != null) {
            jVarZzL.zzb();
            return;
        }
        j jVarZzM = zzcebVar.zzM();
        if (jVarZzM != null) {
            jVarZzM.zzb();
        } else {
            int i7 = J.f3546b;
            J2.j.g("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
