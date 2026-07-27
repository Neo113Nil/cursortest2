package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgwa extends zzgvy implements ListIterator {
    final /* synthetic */ zzgwb zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgwa(zzgwb zzgwbVar) {
        super(zzgwbVar);
        Objects.requireNonNull(zzgwbVar);
        this.zzd = zzgwbVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        zzgwb zzgwbVar = this.zzd;
        boolean isEmpty = zzgwbVar.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        zzgwc zzgwcVar = zzgwbVar.zzf;
        zzgwcVar.zzq(zzgwcVar.zzp() + 1);
        if (isEmpty) {
            zzgwbVar.zzc();
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
    zzgwa(zzgwb zzgwbVar, int i) {
        super(zzgwbVar, ((List) zzgwbVar.zzb).listIterator(i));
        Objects.requireNonNull(zzgwbVar);
        this.zzd = zzgwbVar;
    }
}
