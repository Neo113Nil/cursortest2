package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfz extends zzgb {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzfz(int i, long j) {
        super(i, null);
        this.zza = j;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final String toString() {
        List list = this.zzb;
        String zze = zze(this.zzd);
        String arrays = Arrays.toString(list.toArray());
        String arrays2 = Arrays.toString(this.zzc.toArray());
        int length = zze.length();
        StringBuilder sb = new StringBuilder(length + 9 + String.valueOf(arrays).length() + 13 + String.valueOf(arrays2).length());
        sb.append(zze);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }

    public final void zza(zzga zzgaVar) {
        this.zzb.add(zzgaVar);
    }

    public final void zzb(zzfz zzfzVar) {
        this.zzc.add(zzfzVar);
    }

    public final zzga zzc(int i) {
        List list = this.zzb;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzga zzgaVar = (zzga) list.get(i2);
            if (zzgaVar.zzd == i) {
                return zzgaVar;
            }
        }
        return null;
    }

    public final zzfz zzd(int i) {
        List list = this.zzc;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzfz zzfzVar = (zzfz) list.get(i2);
            if (zzfzVar.zzd == i) {
                return zzfzVar;
            }
        }
        return null;
    }
}
