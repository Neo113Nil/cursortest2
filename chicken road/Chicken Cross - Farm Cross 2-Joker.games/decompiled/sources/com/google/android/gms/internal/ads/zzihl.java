package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final class zzihl {
    static final /* synthetic */ zziei zza(zziei zzieiVar, zziei zzieiVar2, ArrayDeque arrayDeque) {
        zzb(zzieiVar, arrayDeque);
        zzb(zzieiVar2, arrayDeque);
        zziei zzieiVar3 = (zziei) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            zzieiVar3 = new zzihn((zziei) arrayDeque.pop(), zzieiVar3, null);
        }
        return zzieiVar3;
    }

    private static final void zzb(zziei zzieiVar, ArrayDeque arrayDeque) {
        byte[] bArr;
        if (!zzieiVar.zzq()) {
            if (!(zzieiVar instanceof zzihn)) {
                String valueOf = String.valueOf(zzieiVar.getClass());
                String.valueOf(valueOf);
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(valueOf)));
            }
            zzihn zzihnVar = (zzihn) zzieiVar;
            zzb(zzihnVar.zzo(), arrayDeque);
            zzb(zzihnVar.zzF(), arrayDeque);
            return;
        }
        int zzc = zzc(zzieiVar.zzb(), arrayDeque);
        int zzn = zzihn.zzn(zzc + 1);
        if (arrayDeque.isEmpty() || ((zziei) arrayDeque.peek()).zzb() >= zzn) {
            arrayDeque.push(zzieiVar);
            return;
        }
        int zzn2 = zzihn.zzn(zzc);
        zziei zzieiVar2 = (zziei) arrayDeque.pop();
        while (true) {
            bArr = null;
            if (arrayDeque.isEmpty() || ((zziei) arrayDeque.peek()).zzb() >= zzn2) {
                break;
            } else {
                zzieiVar2 = new zzihn((zziei) arrayDeque.pop(), zzieiVar2, bArr);
            }
        }
        zzihn zzihnVar2 = new zzihn(zzieiVar2, zzieiVar, bArr);
        while (!arrayDeque.isEmpty()) {
            if (((zziei) arrayDeque.peek()).zzb() >= zzihn.zzn(zzc(zzihnVar2.zzb(), arrayDeque) + 1)) {
                break;
            } else {
                zzihnVar2 = new zzihn((zziei) arrayDeque.pop(), zzihnVar2, bArr);
            }
        }
        arrayDeque.push(zzihnVar2);
    }

    private static final int zzc(int i, ArrayDeque arrayDeque) {
        int binarySearch = Arrays.binarySearch(zzihn.zzb, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }
}
