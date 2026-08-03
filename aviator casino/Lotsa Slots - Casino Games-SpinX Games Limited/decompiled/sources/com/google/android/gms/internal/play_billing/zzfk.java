package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
@java.lang.Deprecated
/* loaded from: classes4.dex */
public final class zzfk extends java.util.AbstractList implements java.util.RandomAccess, com.google.android.gms.internal.play_billing.zzdk {
    private final com.google.android.gms.internal.play_billing.zzdk zza;

    public zzfk(com.google.android.gms.internal.play_billing.zzdk zzdkVar) {
        this.zza = zzdkVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        return ((com.google.android.gms.internal.play_billing.zzdj) this.zza).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.play_billing.zzfj(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int i) {
        return new com.google.android.gms.internal.play_billing.zzfi(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.play_billing.zzdk
    public final com.google.android.gms.internal.play_billing.zzdk zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdk
    public final java.lang.Object zzf(int i) {
        return this.zza.zzf(i);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdk
    public final java.util.List zzh() {
        return this.zza.zzh();
    }
}
