package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
public final class zzsc implements com.google.android.gms.internal.mlkit_common.zzrz {
    final java.util.List zza;

    public zzsc(android.content.Context context, com.google.android.gms.internal.mlkit_common.zzsb zzsbVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.zza = arrayList;
        if (zzsbVar.zzc()) {
            arrayList.add(new com.google.android.gms.internal.mlkit_common.zzsp(context, zzsbVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzrz
    public final void zza(com.google.android.gms.internal.mlkit_common.zzry zzryVar) {
        java.util.Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.mlkit_common.zzrz) it.next()).zza(zzryVar);
        }
    }
}
