package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
public final class zzmf implements com.google.android.gms.internal.mlkit_vision_common.zzmc {
    final java.util.List zza;

    public zzmf(android.content.Context context, com.google.android.gms.internal.mlkit_vision_common.zzme zzmeVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.zza = arrayList;
        if (zzmeVar.zzc()) {
            arrayList.add(new com.google.android.gms.internal.mlkit_vision_common.zzmp(context, zzmeVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmc
    public final void zza(com.google.android.gms.internal.mlkit_vision_common.zzmb zzmbVar) {
        java.util.Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.mlkit_vision_common.zzmc) it.next()).zza(zzmbVar);
        }
    }
}
