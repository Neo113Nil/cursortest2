package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
final class zzsr extends com.google.mlkit.common.sdkinternal.LazyInstanceMap {
    /* synthetic */ zzsr(com.google.android.gms.internal.mlkit_common.zzsq zzsqVar) {
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    public final /* synthetic */ java.lang.Object create(java.lang.Object obj) {
        com.google.android.gms.internal.mlkit_common.zzsb zzsbVar = (com.google.android.gms.internal.mlkit_common.zzsb) obj;
        com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext = com.google.mlkit.common.sdkinternal.MlKitContext.getInstance();
        return new com.google.android.gms.internal.mlkit_common.zzsh(mlKitContext.getApplicationContext(), (com.google.mlkit.common.sdkinternal.SharedPrefManager) mlKitContext.get(com.google.mlkit.common.sdkinternal.SharedPrefManager.class), new com.google.android.gms.internal.mlkit_common.zzsc(com.google.mlkit.common.sdkinternal.MlKitContext.getInstance().getApplicationContext(), zzsbVar), zzsbVar.zzb());
    }

    private zzsr() {
        throw null;
    }
}
