package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzana implements zzaho {
    public final int zza;
    public final zzhbf zzb;

    public zzana(int i, int[] iArr) {
        this.zza = i;
        this.zzb = iArr != null ? zzhbf.zzf(iArr) : zzhbf.zza();
    }

    public final String toString() {
        zzhbf zzhbfVar = this.zzb;
        ArrayList arrayList = new ArrayList(zzhbfVar.zzh());
        for (int i = 0; i < zzhbfVar.zzh(); i++) {
            arrayList.add(zzfm.zzA(zzhbfVar.zzi(i)));
        }
        String zzA = zzfm.zzA(this.zza);
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder(zzA.length() + 37 + obj.length() + 1);
        sb.append("UnsupportedBrands{major=");
        sb.append(zzA);
        sb.append(", compatible=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
