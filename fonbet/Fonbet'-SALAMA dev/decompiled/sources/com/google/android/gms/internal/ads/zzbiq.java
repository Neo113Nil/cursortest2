package com.google.android.gms.internal.ads;

import H2.j;
import I2.J;
import java.util.Map;

/* loaded from: classes.dex */
final class zzbiq implements zzbiz {
    @Override // com.google.android.gms.internal.ads.zzbiz
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzceb zzcebVar = (zzceb) obj;
        if (zzcebVar.zzJ() != null) {
            zzcebVar.zzJ().zza();
        }
        j zzL = zzcebVar.zzL();
        if (zzL != null) {
            zzL.zzb();
            return;
        }
        j zzM = zzcebVar.zzM();
        if (zzM != null) {
            zzM.zzb();
        } else {
            int i7 = J.f3546b;
            J2.j.g("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
