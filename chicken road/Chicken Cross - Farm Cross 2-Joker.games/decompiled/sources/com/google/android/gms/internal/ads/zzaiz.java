package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzaiz {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zza(zzagi zzagiVar, boolean z) throws IOException {
        int i;
        zzeu zzeuVar = new zzeu(16);
        boolean z2 = true;
        while (true) {
            zzeuVar.zza(8);
            if (!zzagiVar.zzh(zzeuVar.zzi(), 0, 8, true)) {
                return false;
            }
            long zzz = zzeuVar.zzz();
            int zzB = zzeuVar.zzB();
            if (zzz != 1) {
                i = 8;
            } else {
                if (!zzagiVar.zzh(zzeuVar.zzi(), 8, 8, true)) {
                    return false;
                }
                zzz = zzeuVar.zzJ();
                i = 16;
            }
            long j = i;
            if (zzz < j) {
                return false;
            }
            int i2 = (int) (zzz - j);
            if (z2) {
                if (zzB != 1718909296 || i2 < 8) {
                    break;
                }
                zzeuVar.zza(4);
                zzagiVar.zzi(zzeuVar.zzi(), 0, 4);
                if (zzeuVar.zzB() != 1751476579) {
                    return false;
                }
                if (!z) {
                    return true;
                }
                zzagiVar.zzk(i2 - 4);
            } else {
                if (zzB == 1836086884) {
                    return true;
                }
                if (i2 != 0) {
                    zzagiVar.zzk(i2);
                }
            }
            z2 = false;
        }
    }
}
