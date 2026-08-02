package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zzgzh implements Iterator {
    private final ArrayDeque zza;
    private zzgvu zzb;

    public /* synthetic */ zzgzh(zzgvy zzgvyVar, zzgzi zzgziVar) {
        if (!(zzgvyVar instanceof zzgzj)) {
            this.zza = null;
            this.zzb = (zzgvu) zzgvyVar;
            return;
        }
        zzgzj zzgzjVar = (zzgzj) zzgvyVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzgzjVar.zzf());
        this.zza = arrayDeque;
        arrayDeque.push(zzgzjVar);
        this.zzb = zzb(zzgzjVar.zzd);
    }

    private final zzgvu zzb(zzgvy zzgvyVar) {
        while (zzgvyVar instanceof zzgzj) {
            zzgzj zzgzjVar = (zzgzj) zzgvyVar;
            this.zza.push(zzgzjVar);
            zzgvyVar = zzgzjVar.zzd;
        }
        return (zzgvu) zzgvyVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzgvu next() {
        zzgvu zzgvuVar;
        zzgvu zzgvuVar2 = this.zzb;
        if (zzgvuVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzgvuVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzgvuVar = zzb(((zzgzj) this.zza.pop()).zze);
        } while (zzgvuVar.zzd() == 0);
        this.zzb = zzgvuVar;
        return zzgvuVar2;
    }
}
