package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbtp implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbnp zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbua zzb;

    zzbtp(com.google.android.libraries.places.internal.zzbua zzbuaVar, com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        this.zza = zzbnpVar;
        java.util.Objects.requireNonNull(zzbuaVar);
        this.zzb = zzbuaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.zzb.zzy());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((com.google.android.libraries.places.internal.zzbwd) arrayList.get(i)).zze(this.zza);
        }
    }
}
