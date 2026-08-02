package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzci extends com.google.android.gms.internal.fido.zzce {
    final /* synthetic */ com.google.android.gms.internal.fido.zzcj zza;

    zzci(com.google.android.gms.internal.fido.zzcj zzcjVar) {
        this.zza = zzcjVar;
    }

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return zzi().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby
    /* renamed from: zzd */
    public final com.google.android.gms.internal.fido.zzdc iterator() {
        return zzi().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    final com.google.android.gms.internal.fido.zzcc zzj() {
        return new com.google.android.gms.internal.fido.zzch(this);
    }

    @Override // com.google.android.gms.internal.fido.zzce
    final com.google.android.gms.internal.fido.zzcd zzf() {
        return this.zza;
    }
}
