package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzcz extends com.google.android.gms.internal.fido.zzcf {
    final transient java.lang.Object zza;

    zzcz(java.lang.Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.fido.zzcf, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        return "[" + this.zza.toString() + "]";
    }

    @Override // com.google.android.gms.internal.fido.zzby
    final int zza(java.lang.Object[] objArr, int i) {
        objArr[0] = this.zza;
        return 1;
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    public final com.google.android.gms.internal.fido.zzcc zzi() {
        return com.google.android.gms.internal.fido.zzcc.zzj(this.zza);
    }

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby
    /* renamed from: zzd */
    public final com.google.android.gms.internal.fido.zzdc iterator() {
        return new com.google.android.gms.internal.fido.zzcm(this.zza);
    }

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return new com.google.android.gms.internal.fido.zzcm(this.zza);
    }
}
