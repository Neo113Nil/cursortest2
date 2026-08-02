package com.google.android.gms.internal.ads;

import e1.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzapu(String str, zzaok zzaokVar) {
        this(str, r2, r3, r5, r7, r9, r0);
        String str2 = zzaokVar.zzb;
        long j = zzaokVar.zzc;
        long j3 = zzaokVar.zzd;
        long j7 = zzaokVar.zze;
        long j8 = zzaokVar.zzf;
        List list = zzaokVar.zzh;
        if (list == 0) {
            Map map = zzaokVar.zzg;
            list = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                list.add(new zzaot((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }

    public static zzapu zza(zzapv zzapvVar) {
        if (zzapx.zze(zzapvVar) != 538247942) {
            throw new IOException();
        }
        String zzh = zzapx.zzh(zzapvVar);
        String zzh2 = zzapx.zzh(zzapvVar);
        long zzf = zzapx.zzf(zzapvVar);
        long zzf2 = zzapx.zzf(zzapvVar);
        long zzf3 = zzapx.zzf(zzapvVar);
        long zzf4 = zzapx.zzf(zzapvVar);
        int zze = zzapx.zze(zzapvVar);
        if (zze < 0) {
            throw new IOException(k.d(zze, "readHeaderList size="));
        }
        List emptyList = zze == 0 ? Collections.emptyList() : new ArrayList();
        for (int i7 = 0; i7 < zze; i7++) {
            emptyList.add(new zzaot(zzapx.zzh(zzapvVar).intern(), zzapx.zzh(zzapvVar).intern()));
        }
        return new zzapu(zzh, zzh2, zzf, zzf2, zzf3, zzf4, emptyList);
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
