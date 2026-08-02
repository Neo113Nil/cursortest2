package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzgzg {
    private final ArrayDeque zza = new ArrayDeque();

    private zzgzg() {
    }

    public static /* bridge */ /* synthetic */ zzgvy zza(zzgzg zzgzgVar, zzgvy zzgvyVar, zzgvy zzgvyVar2) {
        zzgzgVar.zzb(zzgvyVar);
        zzgzgVar.zzb(zzgvyVar2);
        zzgvy zzgvyVar3 = (zzgvy) zzgzgVar.zza.pop();
        while (!zzgzgVar.zza.isEmpty()) {
            zzgvyVar3 = new zzgzj((zzgvy) zzgzgVar.zza.pop(), zzgvyVar3);
        }
        return zzgvyVar3;
    }

    private final void zzb(zzgvy zzgvyVar) {
        zzgzi zzgziVar;
        if (!zzgvyVar.zzh()) {
            if (!(zzgvyVar instanceof zzgzj)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzgvyVar.getClass())));
            }
            zzgzj zzgzjVar = (zzgzj) zzgvyVar;
            zzb(zzgzjVar.zzd);
            zzb(zzgzjVar.zze);
            return;
        }
        int zzc = zzc(zzgvyVar.zzd());
        ArrayDeque arrayDeque = this.zza;
        int zzc2 = zzgzj.zzc(zzc + 1);
        if (arrayDeque.isEmpty() || ((zzgvy) this.zza.peek()).zzd() >= zzc2) {
            this.zza.push(zzgvyVar);
            return;
        }
        int zzc3 = zzgzj.zzc(zzc);
        zzgvy zzgvyVar2 = (zzgvy) this.zza.pop();
        while (true) {
            zzgziVar = null;
            if (this.zza.isEmpty() || ((zzgvy) this.zza.peek()).zzd() >= zzc3) {
                break;
            } else {
                zzgvyVar2 = new zzgzj((zzgvy) this.zza.pop(), zzgvyVar2);
            }
        }
        zzgzj zzgzjVar2 = new zzgzj(zzgvyVar2, zzgvyVar);
        while (!this.zza.isEmpty()) {
            int zzc4 = zzc(zzgzjVar2.zzd()) + 1;
            ArrayDeque arrayDeque2 = this.zza;
            if (((zzgvy) arrayDeque2.peek()).zzd() >= zzgzj.zzc(zzc4)) {
                break;
            } else {
                zzgzjVar2 = new zzgzj((zzgvy) this.zza.pop(), zzgzjVar2);
            }
        }
        this.zza.push(zzgzjVar2);
    }

    private static final int zzc(int i7) {
        int binarySearch = Arrays.binarySearch(zzgzj.zza, i7);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    public /* synthetic */ zzgzg(zzgzi zzgziVar) {
    }
}
