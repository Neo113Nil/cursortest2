package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzca extends com.google.android.gms.internal.fido.zzcc {
    private final transient com.google.android.gms.internal.fido.zzcc zza;

    zzca(com.google.android.gms.internal.fido.zzcc zzccVar) {
        this.zza = zzccVar;
    }

    private final int zzl(int i) {
        return (this.zza.size() - 1) - i;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        return this.zza.contains(obj);
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.fido.zzbm.zza(i, this.zza.size(), "index");
        return this.zza.get(zzl(i));
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    public final int indexOf(@javax.annotation.CheckForNull java.lang.Object obj) {
        int lastIndexOf = this.zza.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return zzl(lastIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    public final int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object obj) {
        int indexOf = this.zza.indexOf(obj);
        if (indexOf >= 0) {
            return zzl(indexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    public final /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.fido.zzcc
    /* renamed from: zzg */
    public final com.google.android.gms.internal.fido.zzcc subList(int i, int i2) {
        com.google.android.gms.internal.fido.zzbm.zze(i, i2, this.zza.size());
        com.google.android.gms.internal.fido.zzcc zzccVar = this.zza;
        return zzccVar.subList(zzccVar.size() - i2, this.zza.size() - i).zzf();
    }

    @Override // com.google.android.gms.internal.fido.zzcc
    public final com.google.android.gms.internal.fido.zzcc zzf() {
        return this.zza;
    }
}
