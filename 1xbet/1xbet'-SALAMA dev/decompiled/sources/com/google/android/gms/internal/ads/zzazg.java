package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class zzazg {
    public static long zza(long j, int i7) {
        if (i7 == 1) {
            return j;
        }
        int i8 = i7 >> 1;
        long j3 = (j * j) % 1073807359;
        return (i7 & 1) == 0 ? zza(j3, i8) % 1073807359 : ((zza(j3, i8) % 1073807359) * j) % 1073807359;
    }

    public static String zzb(String[] strArr, int i7, int i8) {
        int i9 = i8 + i7;
        if (strArr.length < i9) {
            int i10 = J.f3546b;
            j.d("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i11 = i9 - 1;
            if (i7 >= i11) {
                sb.append(strArr[i11]);
                return sb.toString();
            }
            sb.append(strArr[i7]);
            sb.append(' ');
            i7++;
        }
    }

    public static void zzc(String[] strArr, int i7, int i8, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            zzd(i7, zze(strArr, 0, length), zzb(strArr, 0, length), length, priorityQueue);
            return;
        }
        long jZze = zze(strArr, 0, 6);
        zzd(i7, jZze, zzb(strArr, 0, 6), 6, priorityQueue);
        int i9 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i9 >= length2 - 5) {
                return;
            }
            long jZza = zzazc.zza(strArr[i9 - 1]);
            long jZza2 = zzazc.zza(strArr[i9 + 5]);
            String strZzb = zzb(strArr, i9, 6);
            jZze = (((jZza2 + 2147483647L) % 1073807359) + (((((jZze + 1073807359) - ((((jZza + 2147483647L) % 1073807359) * zza(16785407L, 5)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
            zzd(i7, jZze, strZzb, length2, priorityQueue);
            i9++;
        }
    }

    public static void zzd(int i7, long j, String str, int i8, PriorityQueue priorityQueue) {
        zzazf zzazfVar = new zzazf(j, str, i8);
        if ((priorityQueue.size() != i7 || (((zzazf) priorityQueue.peek()).zzc <= zzazfVar.zzc && ((zzazf) priorityQueue.peek()).zza <= zzazfVar.zza)) && !priorityQueue.contains(zzazfVar)) {
            priorityQueue.add(zzazfVar);
            if (priorityQueue.size() > i7) {
                priorityQueue.poll();
            }
        }
    }

    private static long zze(String[] strArr, int i7, int i8) {
        long jZza = (((long) zzazc.zza(strArr[0])) + 2147483647L) % 1073807359;
        for (int i9 = 1; i9 < i8; i9++) {
            jZza = (((((long) zzazc.zza(strArr[i9])) + 2147483647L) % 1073807359) + ((jZza * 16785407) % 1073807359)) % 1073807359;
        }
        return jZza;
    }
}
