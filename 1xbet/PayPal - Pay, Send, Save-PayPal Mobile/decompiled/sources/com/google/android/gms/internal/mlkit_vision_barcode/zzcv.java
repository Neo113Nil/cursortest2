package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public abstract class zzcv extends com.google.android.gms.internal.mlkit_vision_barcode.zzcn implements java.util.Set {

    @javax.annotation.CheckForNull
    private transient com.google.android.gms.internal.mlkit_vision_barcode.zzcs zza;

    zzcv() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return com.google.android.gms.internal.mlkit_vision_barcode.zzds.zzb(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return com.google.android.gms.internal.mlkit_vision_barcode.zzds.zza(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract com.google.android.gms.internal.mlkit_vision_barcode.zzdu iterator();

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzcs zzf() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzcs zzcsVar = this.zza;
        if (zzcsVar != null) {
            return zzcsVar;
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzcs zzg = zzg();
        this.zza = zzg;
        return zzg;
    }

    com.google.android.gms.internal.mlkit_vision_barcode.zzcs zzg() {
        java.lang.Object[] array = toArray();
        int i = com.google.android.gms.internal.mlkit_vision_barcode.zzcs.zzd;
        return com.google.android.gms.internal.mlkit_vision_barcode.zzcs.zzg(array, array.length);
    }
}
