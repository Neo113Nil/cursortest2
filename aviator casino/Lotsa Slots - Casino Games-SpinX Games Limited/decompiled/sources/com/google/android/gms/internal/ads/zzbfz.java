package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzbfz {
    public static void zza(java.lang.String[] strArr, int i, int i2, java.util.PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            zzb(i, zze(strArr, 0, length), zzc(strArr, 0, length), length, priorityQueue);
            return;
        }
        long zze = zze(strArr, 0, 6);
        zzb(i, zze, zzc(strArr, 0, 6), 6, priorityQueue);
        int i3 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i3 >= length2 - 5) {
                return;
            }
            long zza = com.google.android.gms.internal.ads.zzbfw.zza(strArr[i3 - 1]);
            long zza2 = com.google.android.gms.internal.ads.zzbfw.zza(strArr[i3 + 5]);
            java.lang.String zzc = zzc(strArr, i3, 6);
            zze = ((((((zze + 1073807359) - ((zzd(16785407L, 5) * ((zza + 2147483647L) % 1073807359)) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((zza2 + 2147483647L) % 1073807359)) % 1073807359;
            zzb(i, zze, zzc, length2, priorityQueue);
            i3++;
        }
    }

    static void zzb(int i, long j, java.lang.String str, int i2, java.util.PriorityQueue priorityQueue) {
        com.google.android.gms.internal.ads.zzbfy zzbfyVar = new com.google.android.gms.internal.ads.zzbfy(j, str, i2);
        if ((priorityQueue.size() != i || (((com.google.android.gms.internal.ads.zzbfy) priorityQueue.peek()).zzc <= zzbfyVar.zzc && ((com.google.android.gms.internal.ads.zzbfy) priorityQueue.peek()).zza <= zzbfyVar.zza)) && !priorityQueue.contains(zzbfyVar)) {
            priorityQueue.add(zzbfyVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    static java.lang.String zzc(java.lang.String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to construct shingle");
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            int i5 = i3 - 1;
            if (i >= i5) {
                sb.append(strArr[i5]);
                return sb.toString();
            }
            sb.append(strArr[i]);
            sb.append(' ');
            i++;
        }
    }

    static long zzd(long j, int i) {
        if (i == 1) {
            return j;
        }
        int i2 = i >> 1;
        long j2 = (j * j) % 1073807359;
        return ((i & 1) == 0 ? zzd(j2, i2) : j * (zzd(j2, i2) % 1073807359)) % 1073807359;
    }

    private static long zze(java.lang.String[] strArr, int i, int i2) {
        long zza = (com.google.android.gms.internal.ads.zzbfw.zza(strArr[0]) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            zza = (((zza * 16785407) % 1073807359) + ((com.google.android.gms.internal.ads.zzbfw.zza(strArr[i3]) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return zza;
    }
}
