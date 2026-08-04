package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
final class zzapu {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    public zzapu(String str, zzaok zzaokVar) {
        String str2 = zzaokVar.zzb;
        long j = zzaokVar.zzc;
        long j3 = zzaokVar.zzd;
        long j7 = zzaokVar.zze;
        long j8 = zzaokVar.zzf;
        ?? arrayList = zzaokVar.zzh;
        if (arrayList == 0) {
            Map map = zzaokVar.zzg;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new zzaot((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j, j3, j7, j8, arrayList);
    }

    public static zzapu zza(zzapv zzapvVar) throws IOException {
        if (zzapx.zze(zzapvVar) != 538247942) {
            throw new IOException();
        }
        String strZzh = zzapx.zzh(zzapvVar);
        String strZzh2 = zzapx.zzh(zzapvVar);
        long jZzf = zzapx.zzf(zzapvVar);
        long jZzf2 = zzapx.zzf(zzapvVar);
        long jZzf3 = zzapx.zzf(zzapvVar);
        long jZzf4 = zzapx.zzf(zzapvVar);
        int iZze = zzapx.zze(zzapvVar);
        if (iZze < 0) {
            throw new IOException(k.d(iZze, "readHeaderList size="));
        }
        List listEmptyList = iZze == 0 ? Collections.emptyList() : new ArrayList();
        for (int i7 = 0; i7 < iZze; i7++) {
            listEmptyList.add(new zzaot(zzapx.zzh(zzapvVar).intern(), zzapx.zzh(zzapvVar).intern()));
        }
        return new zzapu(strZzh, strZzh2, jZzf, jZzf2, jZzf3, jZzf4, listEmptyList);
    }

    private zzapu(String str, String str2, long j, long j3, long j7, long j8, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j;
        this.zze = j3;
        this.zzf = j7;
        this.zzg = j8;
        this.zzh = list;
    }
}
