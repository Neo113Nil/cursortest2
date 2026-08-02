package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzwz extends com.google.mlkit.common.sdkinternal.LazyInstanceMap {
    /* synthetic */ zzwz(com.google.android.gms.internal.mlkit_vision_barcode.zzwy zzwyVar) {
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    public final /* synthetic */ java.lang.Object create(java.lang.Object obj) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzwh zzwhVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzwh) obj;
        com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext = com.google.mlkit.common.sdkinternal.MlKitContext.getInstance();
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzwp(mlKitContext.getApplicationContext(), (com.google.mlkit.common.sdkinternal.SharedPrefManager) mlKitContext.get(com.google.mlkit.common.sdkinternal.SharedPrefManager.class), new com.google.android.gms.internal.mlkit_vision_barcode.zzwi(com.google.mlkit.common.sdkinternal.MlKitContext.getInstance().getApplicationContext(), zzwhVar), zzwhVar.zzb());
    }

    private zzwz() {
        throw null;
    }
}
