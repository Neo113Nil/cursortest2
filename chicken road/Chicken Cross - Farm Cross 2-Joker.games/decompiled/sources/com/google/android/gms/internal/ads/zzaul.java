package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzaul {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    private zzaul(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = j4;
        this.zzh = list;
    }

    static zzaul zza(zzaum zzaumVar) throws IOException {
        if (zzauo.zzi(zzaumVar) != 538247942) {
            throw new IOException();
        }
        String zzm = zzauo.zzm(zzaumVar);
        String zzm2 = zzauo.zzm(zzaumVar);
        long zzk = zzauo.zzk(zzaumVar);
        long zzk2 = zzauo.zzk(zzaumVar);
        long zzk3 = zzauo.zzk(zzaumVar);
        long zzk4 = zzauo.zzk(zzaumVar);
        int zzi = zzauo.zzi(zzaumVar);
        if (zzi < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(zzi).length() + 20);
            sb.append("readHeaderList size=");
            sb.append(zzi);
            throw new IOException(sb.toString());
        }
        List emptyList = zzi == 0 ? Collections.emptyList() : new ArrayList();
        for (int i = 0; i < zzi; i++) {
            emptyList.add(new zzatk(zzauo.zzm(zzaumVar).intern(), zzauo.zzm(zzaumVar).intern()));
        }
        return new zzaul(zzm, zzm2, zzk, zzk2, zzk3, zzk4, emptyList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    zzaul(String str, zzatb zzatbVar) {
        this(str, r2, r3, r5, r7, r9, r0);
        String str2 = zzatbVar.zzb;
        long j = zzatbVar.zzc;
        long j2 = zzatbVar.zzd;
        long j3 = zzatbVar.zze;
        long j4 = zzatbVar.zzf;
        List list = zzatbVar.zzh;
        if (list == null) {
            Map map = zzatbVar.zzg;
            list = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                list.add(new zzatk((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }
}
