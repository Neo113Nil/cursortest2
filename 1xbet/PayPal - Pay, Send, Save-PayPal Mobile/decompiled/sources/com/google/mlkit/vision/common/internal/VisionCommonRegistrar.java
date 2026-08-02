package com.google.mlkit.vision.common.internal;

/* loaded from: classes9.dex */
public class VisionCommonRegistrar implements com.google.firebase.components.ComponentRegistrar {
    public static final /* synthetic */ int zza = 0;

    @Override // com.google.firebase.components.ComponentRegistrar
    public final java.util.List getComponents() {
        return com.google.android.gms.internal.mlkit_vision_common.zzp.zzi(com.google.firebase.components.Component.builder(com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.class).add(com.google.firebase.components.Dependency.setOf((java.lang.Class<?>) com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.Registration.class)).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.mlkit.vision.common.internal.zzf
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                int i = com.google.mlkit.vision.common.internal.VisionCommonRegistrar.zza;
                return new com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator(componentContainer.setOf(com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.Registration.class));
            }
        }).build());
    }
}
