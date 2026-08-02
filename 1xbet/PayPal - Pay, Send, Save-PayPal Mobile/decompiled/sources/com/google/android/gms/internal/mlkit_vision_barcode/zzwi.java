package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzwi implements com.google.android.gms.internal.mlkit_vision_barcode.zzwf {
    final java.util.List zza;

    public zzwi(android.content.Context context, com.google.android.gms.internal.mlkit_vision_barcode.zzwh zzwhVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.zza = arrayList;
        if (zzwhVar.zzc()) {
            arrayList.add(new com.google.android.gms.internal.mlkit_vision_barcode.zzwx(context, zzwhVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwf
    public final void zza(com.google.android.gms.internal.mlkit_vision_barcode.zzwe zzweVar) {
        java.util.Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.mlkit_vision_barcode.zzwf) it.next()).zza(zzweVar);
        }
    }
}
