package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
final class zzmr extends com.google.mlkit.common.sdkinternal.LazyInstanceMap {
    private zzmr() {
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    public final /* synthetic */ java.lang.Object create(java.lang.Object obj) {
        com.google.android.gms.internal.mlkit_vision_common.zzme zzmeVar = (com.google.android.gms.internal.mlkit_vision_common.zzme) obj;
        com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext = com.google.mlkit.common.sdkinternal.MlKitContext.getInstance();
        return new com.google.android.gms.internal.mlkit_vision_common.zzmj(mlKitContext.getApplicationContext(), (com.google.mlkit.common.sdkinternal.SharedPrefManager) mlKitContext.get(com.google.mlkit.common.sdkinternal.SharedPrefManager.class), new com.google.android.gms.internal.mlkit_vision_common.zzmf(com.google.mlkit.common.sdkinternal.MlKitContext.getInstance().getApplicationContext(), zzmeVar), zzmeVar.zzb());
    }

    /* synthetic */ zzmr(com.google.android.gms.internal.mlkit_vision_common.zzmq zzmqVar) {
    }
}
