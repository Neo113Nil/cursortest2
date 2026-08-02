package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzch extends com.google.android.gms.internal.fido.zzcc {
    final /* synthetic */ com.google.android.gms.internal.fido.zzci zza;

    zzch(com.google.android.gms.internal.fido.zzci zzciVar) {
        this.zza = zzciVar;
    }

    @Override // java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        com.google.android.gms.internal.fido.zzcv zzcvVar;
        com.google.android.gms.internal.fido.zzcc zzccVar;
        zzcvVar = this.zza.zza.zzd;
        java.lang.Object obj = zzcvVar.zzd.get(i);
        zzccVar = this.zza.zza.zze;
        return new java.util.AbstractMap.SimpleImmutableEntry(obj, zzccVar.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zza.size();
    }
}
