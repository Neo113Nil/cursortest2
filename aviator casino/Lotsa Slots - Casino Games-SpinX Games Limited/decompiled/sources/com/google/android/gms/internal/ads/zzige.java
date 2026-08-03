package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzige {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzida zza(com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzida zzidaVar2, java.util.ArrayDeque arrayDeque) {
        zzb(zzidaVar, arrayDeque);
        zzb(zzidaVar2, arrayDeque);
        com.google.android.gms.internal.ads.zzida zzidaVar3 = (com.google.android.gms.internal.ads.zzida) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            zzidaVar3 = new com.google.android.gms.internal.ads.zzigg((com.google.android.gms.internal.ads.zzida) arrayDeque.pop(), zzidaVar3, null);
        }
        return zzidaVar3;
    }

    private static final void zzb(com.google.android.gms.internal.ads.zzida zzidaVar, java.util.ArrayDeque arrayDeque) {
        byte[] bArr;
        if (!zzidaVar.zzq()) {
            if (!(zzidaVar instanceof com.google.android.gms.internal.ads.zzigg)) {
                java.lang.String valueOf = java.lang.String.valueOf(zzidaVar.getClass());
                java.lang.String.valueOf(valueOf);
                throw new java.lang.IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(java.lang.String.valueOf(valueOf)));
            }
            com.google.android.gms.internal.ads.zzigg zziggVar = (com.google.android.gms.internal.ads.zzigg) zzidaVar;
            zzb(zziggVar.zzo(), arrayDeque);
            zzb(zziggVar.zzF(), arrayDeque);
            return;
        }
        int zzc = zzc(zzidaVar.zzb(), arrayDeque);
        int zzn = com.google.android.gms.internal.ads.zzigg.zzn(zzc + 1);
        if (arrayDeque.isEmpty() || ((com.google.android.gms.internal.ads.zzida) arrayDeque.peek()).zzb() >= zzn) {
            arrayDeque.push(zzidaVar);
            return;
        }
        int zzn2 = com.google.android.gms.internal.ads.zzigg.zzn(zzc);
        com.google.android.gms.internal.ads.zzida zzidaVar2 = (com.google.android.gms.internal.ads.zzida) arrayDeque.pop();
        while (true) {
            bArr = null;
            if (arrayDeque.isEmpty() || ((com.google.android.gms.internal.ads.zzida) arrayDeque.peek()).zzb() >= zzn2) {
                break;
            } else {
                zzidaVar2 = new com.google.android.gms.internal.ads.zzigg((com.google.android.gms.internal.ads.zzida) arrayDeque.pop(), zzidaVar2, bArr);
            }
        }
        com.google.android.gms.internal.ads.zzigg zziggVar2 = new com.google.android.gms.internal.ads.zzigg(zzidaVar2, zzidaVar, bArr);
        while (!arrayDeque.isEmpty()) {
            if (((com.google.android.gms.internal.ads.zzida) arrayDeque.peek()).zzb() >= com.google.android.gms.internal.ads.zzigg.zzn(zzc(zziggVar2.zzb(), arrayDeque) + 1)) {
                break;
            } else {
                zziggVar2 = new com.google.android.gms.internal.ads.zzigg((com.google.android.gms.internal.ads.zzida) arrayDeque.pop(), zziggVar2, bArr);
            }
        }
        arrayDeque.push(zziggVar2);
    }

    private static final int zzc(int i, java.util.ArrayDeque arrayDeque) {
        int binarySearch = java.util.Arrays.binarySearch(com.google.android.gms.internal.ads.zzigg.zzb, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }
}
