package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
final class zzfuy extends zzfuw implements ListIterator {
    final /* synthetic */ zzfuz zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfuy(zzfuz zzfuzVar) {
        super(zzfuzVar);
        this.zzd = zzfuzVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i7;
        boolean isEmpty = this.zzd.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        zzfva zzfvaVar = this.zzd.zzf;
        i7 = zzfvaVar.zzb;
        zzfvaVar.zzb = i7 + 1;
        if (isEmpty) {
            this.zzd.zza();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.zza).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        zza();
        return ((ListIterator) this.zza).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        zza();
        return ((ListIterator) this.zza).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        zza();
        return ((ListIterator) this.zza).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        zza();
        ((ListIterator) this.zza).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfuy(zzfuz zzfuzVar, int i7) {
        super(zzfuzVar, ((List) zzfuzVar.zzb).listIterator(i7));
        this.zzd = zzfuzVar;
    }
}
