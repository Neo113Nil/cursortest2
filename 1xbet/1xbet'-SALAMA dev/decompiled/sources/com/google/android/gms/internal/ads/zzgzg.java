package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class zzgzg {
    private final ArrayDeque zza = new ArrayDeque();

    private zzgzg() {
    }

    public static /* bridge */ /* synthetic */ zzgvy zza(zzgzg zzgzgVar, zzgvy zzgvyVar, zzgvy zzgvyVar2) {
        zzgzgVar.zzb(zzgvyVar);
        zzgzgVar.zzb(zzgvyVar2);
        zzgvy zzgzjVar = (zzgvy) zzgzgVar.zza.pop();
        while (!zzgzgVar.zza.isEmpty()) {
            zzgzjVar = new zzgzj((zzgvy) zzgzgVar.zza.pop(), zzgzjVar);
        }
        return zzgzjVar;
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
        int iZzc = zzc(zzgvyVar.zzd());
        ArrayDeque arrayDeque = this.zza;
        int iZzc2 = zzgzj.zzc(iZzc + 1);
        if (arrayDeque.isEmpty() || ((zzgvy) this.zza.peek()).zzd() >= iZzc2) {
            this.zza.push(zzgvyVar);
            return;
        }
        int iZzc3 = zzgzj.zzc(iZzc);
        zzgvy zzgzjVar2 = (zzgvy) this.zza.pop();
        while (true) {
            zzgziVar = null;
            if (this.zza.isEmpty() || ((zzgvy) this.zza.peek()).zzd() >= iZzc3) {
                break;
            } else {
                zzgzjVar2 = new zzgzj((zzgvy) this.zza.pop(), zzgzjVar2);
            }
        }
        zzgzj zzgzjVar3 = new zzgzj(zzgzjVar2, zzgvyVar);
        while (!this.zza.isEmpty()) {
            int iZzc4 = zzc(zzgzjVar3.zzd()) + 1;
            ArrayDeque arrayDeque2 = this.zza;
            if (((zzgvy) arrayDeque2.peek()).zzd() >= zzgzj.zzc(iZzc4)) {
                break;
            } else {
                zzgzjVar3 = new zzgzj((zzgvy) this.zza.pop(), zzgzjVar3);
            }
        }
        this.zza.push(zzgzjVar3);
    }

    private static final int zzc(int i7) {
        int iBinarySearch = Arrays.binarySearch(zzgzj.zza, i7);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    public /* synthetic */ zzgzg(zzgzi zzgziVar) {
    }
}
