package com.google.mlkit.vision.barcode.internal;

/* loaded from: classes9.dex */
public final class zzb {
    static final java.util.concurrent.atomic.AtomicReference zza;
    private static final android.util.SparseArray zzb;
    private static final android.util.SparseArray zzc;
    private static final java.util.Map zzd;

    static {
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        zzb = sparseArray;
        android.util.SparseArray sparseArray2 = new android.util.SparseArray();
        zzc = sparseArray2;
        zza = new java.util.concurrent.atomic.AtomicReference();
        sparseArray.put(-1, com.google.android.gms.internal.mlkit_vision_barcode.zzrn.FORMAT_UNKNOWN);
        sparseArray.put(1, com.google.android.gms.internal.mlkit_vision_barcode.zzrn.FORMAT_CODE_128);
        sparseArray.put(2, com.google.android.gms.internal.mlkit_vision_barcode.zzrn.FORMAT_CODE_39);
        sparseArray.put(4, com.google.android.gms.internal.mlkit_vision_barcode.zzrn.FORMAT_CODE_93);
        sparseArray.put(8, com.google.android.gms.internal.mlkit_vision_barcode.zzrn.FORMAT_CODABAR);
        sparseArray.put(16, com.google.android.gms.internal.mlkit_vision_barcode.zzrn.FORMAT_DATA_MATRIX);
        sparseArray.put(32, com.google.android.gms.internal.mlkit_vision_barcode.zzrn.FORMAT_EAN_13);
        sparseArray.put(64, com.google.android.gms.internal.mlkit_vision_barcode.zzrn.FORMAT_EAN_8);
        sparseArray.put(128, com.google.android.gms.internal.mlkit_vision_barcode.zzrn.FORMAT_ITF);
        sparseArray.put(256, com.google.android.gms.internal.mlkit_vision_barcode.zzrn.FORMAT_QR_CODE);
        sparseArray.put(512, com.google.android.gms.internal.mlkit_vision_barcode.zzrn.FORMAT_UPC_A);
        sparseArray.put(1024, com.google.android.gms.internal.mlkit_vision_barcode.zzrn.FORMAT_UPC_E);
        sparseArray.put(2048, com.google.android.gms.internal.mlkit_vision_barcode.zzrn.FORMAT_PDF417);
        sparseArray.put(4096, com.google.android.gms.internal.mlkit_vision_barcode.zzrn.FORMAT_AZTEC);
        sparseArray2.put(0, com.google.android.gms.internal.mlkit_vision_barcode.zzro.TYPE_UNKNOWN);
        sparseArray2.put(1, com.google.android.gms.internal.mlkit_vision_barcode.zzro.TYPE_CONTACT_INFO);
        sparseArray2.put(2, com.google.android.gms.internal.mlkit_vision_barcode.zzro.TYPE_EMAIL);
        sparseArray2.put(3, com.google.android.gms.internal.mlkit_vision_barcode.zzro.TYPE_ISBN);
        sparseArray2.put(4, com.google.android.gms.internal.mlkit_vision_barcode.zzro.TYPE_PHONE);
        sparseArray2.put(5, com.google.android.gms.internal.mlkit_vision_barcode.zzro.TYPE_PRODUCT);
        sparseArray2.put(6, com.google.android.gms.internal.mlkit_vision_barcode.zzro.TYPE_SMS);
        sparseArray2.put(7, com.google.android.gms.internal.mlkit_vision_barcode.zzro.TYPE_TEXT);
        sparseArray2.put(8, com.google.android.gms.internal.mlkit_vision_barcode.zzro.TYPE_URL);
        sparseArray2.put(9, com.google.android.gms.internal.mlkit_vision_barcode.zzro.TYPE_WIFI);
        sparseArray2.put(10, com.google.android.gms.internal.mlkit_vision_barcode.zzro.TYPE_GEO);
        sparseArray2.put(11, com.google.android.gms.internal.mlkit_vision_barcode.zzro.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, com.google.android.gms.internal.mlkit_vision_barcode.zzro.TYPE_DRIVER_LICENSE);
        java.util.HashMap hashMap = new java.util.HashMap();
        zzd = hashMap;
        hashMap.put(1, com.google.android.gms.internal.mlkit_vision_barcode.zzvw.CODE_128);
        hashMap.put(2, com.google.android.gms.internal.mlkit_vision_barcode.zzvw.CODE_39);
        hashMap.put(4, com.google.android.gms.internal.mlkit_vision_barcode.zzvw.CODE_93);
        hashMap.put(8, com.google.android.gms.internal.mlkit_vision_barcode.zzvw.CODABAR);
        hashMap.put(16, com.google.android.gms.internal.mlkit_vision_barcode.zzvw.DATA_MATRIX);
        hashMap.put(32, com.google.android.gms.internal.mlkit_vision_barcode.zzvw.EAN_13);
        hashMap.put(64, com.google.android.gms.internal.mlkit_vision_barcode.zzvw.EAN_8);
        hashMap.put(128, com.google.android.gms.internal.mlkit_vision_barcode.zzvw.ITF);
        hashMap.put(256, com.google.android.gms.internal.mlkit_vision_barcode.zzvw.QR_CODE);
        hashMap.put(512, com.google.android.gms.internal.mlkit_vision_barcode.zzvw.UPC_A);
        hashMap.put(1024, com.google.android.gms.internal.mlkit_vision_barcode.zzvw.UPC_E);
        hashMap.put(2048, com.google.android.gms.internal.mlkit_vision_barcode.zzvw.PDF417);
        hashMap.put(4096, com.google.android.gms.internal.mlkit_vision_barcode.zzvw.AZTEC);
    }

    public static com.google.android.gms.internal.mlkit_vision_barcode.zzrn zza(int i) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzrn zzrnVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzrn) zzb.get(i);
        return zzrnVar == null ? com.google.android.gms.internal.mlkit_vision_barcode.zzrn.FORMAT_UNKNOWN : zzrnVar;
    }

    public static com.google.android.gms.internal.mlkit_vision_barcode.zzro zzb(int i) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzro zzroVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzro) zzc.get(i);
        return zzroVar == null ? com.google.android.gms.internal.mlkit_vision_barcode.zzro.TYPE_UNKNOWN : zzroVar;
    }

    public static com.google.android.gms.internal.mlkit_vision_barcode.zzvz zzc(com.google.mlkit.vision.barcode.BarcodeScannerOptions barcodeScannerOptions) {
        int zza2 = barcodeScannerOptions.zza();
        com.google.android.gms.internal.mlkit_vision_barcode.zzcp zzcpVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzcp();
        if (zza2 == 0) {
            zzcpVar.zze(zzd.values());
        } else {
            for (java.util.Map.Entry entry : zzd.entrySet()) {
                if ((((java.lang.Integer) entry.getKey()).intValue() & zza2) != 0) {
                    zzcpVar.zzd((com.google.android.gms.internal.mlkit_vision_barcode.zzvw) entry.getValue());
                }
            }
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzvx zzvxVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzvx();
        zzvxVar.zzb(zzcpVar.zzf());
        return zzvxVar.zzc();
    }

    public static java.lang.String zzd() {
        return true != zzf() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
    }

    static void zze(com.google.android.gms.internal.mlkit_vision_barcode.zzwp zzwpVar, final com.google.android.gms.internal.mlkit_vision_barcode.zzrb zzrbVar) {
        zzwpVar.zzf(new com.google.android.gms.internal.mlkit_vision_barcode.zzwo() { // from class: com.google.mlkit.vision.barcode.internal.zza
            @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwo
            public final com.google.android.gms.internal.mlkit_vision_barcode.zzwe zza() {
                com.google.android.gms.internal.mlkit_vision_barcode.zzrd zzrdVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzrd();
                com.google.android.gms.internal.mlkit_vision_barcode.zzra zzraVar = com.google.mlkit.vision.barcode.internal.zzb.zzf() ? com.google.android.gms.internal.mlkit_vision_barcode.zzra.TYPE_THICK : com.google.android.gms.internal.mlkit_vision_barcode.zzra.TYPE_THIN;
                com.google.android.gms.internal.mlkit_vision_barcode.zzrb zzrbVar2 = com.google.android.gms.internal.mlkit_vision_barcode.zzrb.this;
                zzrdVar.zze(zzraVar);
                com.google.android.gms.internal.mlkit_vision_barcode.zzrs zzrsVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzrs();
                zzrsVar.zzb(zzrbVar2);
                zzrdVar.zzh(zzrsVar.zzc());
                return com.google.android.gms.internal.mlkit_vision_barcode.zzws.zzf(zzrdVar);
            }
        }, com.google.android.gms.internal.mlkit_vision_barcode.zzrc.ON_DEVICE_BARCODE_LOAD);
    }

    static boolean zzf() {
        java.util.concurrent.atomic.AtomicReference atomicReference = zza;
        if (atomicReference.get() != null) {
            return ((java.lang.Boolean) atomicReference.get()).booleanValue();
        }
        boolean zzd2 = com.google.mlkit.vision.barcode.internal.zzo.zzd(com.google.mlkit.common.sdkinternal.MlKitContext.getInstance().getApplicationContext());
        atomicReference.set(java.lang.Boolean.valueOf(zzd2));
        return zzd2;
    }
}
