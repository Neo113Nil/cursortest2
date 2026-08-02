package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzxa {
    private static com.google.android.gms.internal.mlkit_vision_barcode.zzwz zza;

    public static com.google.android.gms.internal.mlkit_vision_barcode.zzwp zza(com.google.android.gms.internal.mlkit_vision_barcode.zzwh zzwhVar) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzwp zzwpVar;
        synchronized (com.google.android.gms.internal.mlkit_vision_barcode.zzxa.class) {
            if (zza == null) {
                zza = new com.google.android.gms.internal.mlkit_vision_barcode.zzwz(null);
            }
            zzwpVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzwp) zza.get(zzwhVar);
        }
        return zzwpVar;
    }

    public static com.google.android.gms.internal.mlkit_vision_barcode.zzwp zzb(java.lang.String str) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzwp zza2;
        synchronized (com.google.android.gms.internal.mlkit_vision_barcode.zzxa.class) {
            zza2 = zza(com.google.android.gms.internal.mlkit_vision_barcode.zzwh.zzd(str).zzd());
        }
        return zza2;
    }
}
