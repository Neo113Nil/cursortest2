package com.google.mlkit.vision.barcode.internal;

/* loaded from: classes9.dex */
public class BarcodeRegistrar implements com.google.firebase.components.ComponentRegistrar {
    public static final /* synthetic */ int zza = 0;

    @Override // com.google.firebase.components.ComponentRegistrar
    public final java.util.List getComponents() {
        return com.google.android.gms.internal.mlkit_vision_barcode.zzcs.zzh(com.google.firebase.components.Component.builder(com.google.mlkit.vision.barcode.internal.zzi.class).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) com.google.mlkit.common.sdkinternal.MlKitContext.class)).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.mlkit.vision.barcode.internal.zzc
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                int i = com.google.mlkit.vision.barcode.internal.BarcodeRegistrar.zza;
                return new com.google.mlkit.vision.barcode.internal.zzi((com.google.mlkit.common.sdkinternal.MlKitContext) componentContainer.get(com.google.mlkit.common.sdkinternal.MlKitContext.class));
            }
        }).build(), com.google.firebase.components.Component.builder(com.google.mlkit.vision.barcode.internal.zzg.class).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) com.google.mlkit.vision.barcode.internal.zzi.class)).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) com.google.mlkit.common.sdkinternal.ExecutorSelector.class)).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) com.google.mlkit.common.sdkinternal.MlKitContext.class)).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.mlkit.vision.barcode.internal.zzd
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return new com.google.mlkit.vision.barcode.internal.zzg((com.google.mlkit.vision.barcode.internal.zzi) componentContainer.get(com.google.mlkit.vision.barcode.internal.zzi.class), (com.google.mlkit.common.sdkinternal.ExecutorSelector) componentContainer.get(com.google.mlkit.common.sdkinternal.ExecutorSelector.class), (com.google.mlkit.common.sdkinternal.MlKitContext) componentContainer.get(com.google.mlkit.common.sdkinternal.MlKitContext.class));
            }
        }).build());
    }
}
