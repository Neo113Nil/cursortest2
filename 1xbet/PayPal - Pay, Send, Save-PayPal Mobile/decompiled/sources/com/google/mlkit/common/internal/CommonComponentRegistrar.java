package com.google.mlkit.common.internal;

/* loaded from: classes9.dex */
public class CommonComponentRegistrar implements com.google.firebase.components.ComponentRegistrar {
    public static final /* synthetic */ int zza = 0;

    @Override // com.google.firebase.components.ComponentRegistrar
    public final java.util.List getComponents() {
        return com.google.android.gms.internal.mlkit_common.zzaf.zzi(com.google.mlkit.common.sdkinternal.SharedPrefManager.COMPONENT, com.google.firebase.components.Component.builder(com.google.mlkit.common.sdkinternal.model.ModelFileHelper.class).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) com.google.mlkit.common.sdkinternal.MlKitContext.class)).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.mlkit.common.internal.zza
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                int i = com.google.mlkit.common.internal.CommonComponentRegistrar.zza;
                return new com.google.mlkit.common.sdkinternal.model.ModelFileHelper((com.google.mlkit.common.sdkinternal.MlKitContext) componentContainer.get(com.google.mlkit.common.sdkinternal.MlKitContext.class));
            }
        }).build(), com.google.firebase.components.Component.builder(com.google.mlkit.common.sdkinternal.MlKitThreadPool.class).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.mlkit.common.internal.zzb
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                int i = com.google.mlkit.common.internal.CommonComponentRegistrar.zza;
                return new com.google.mlkit.common.sdkinternal.MlKitThreadPool();
            }
        }).build(), com.google.firebase.components.Component.builder(com.google.mlkit.common.model.RemoteModelManager.class).add(com.google.firebase.components.Dependency.setOf((java.lang.Class<?>) com.google.mlkit.common.model.RemoteModelManager.RemoteModelManagerRegistration.class)).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.mlkit.common.internal.zzc
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                int i = com.google.mlkit.common.internal.CommonComponentRegistrar.zza;
                return new com.google.mlkit.common.model.RemoteModelManager(componentContainer.setOf(com.google.mlkit.common.model.RemoteModelManager.RemoteModelManagerRegistration.class));
            }
        }).build(), com.google.firebase.components.Component.builder(com.google.mlkit.common.sdkinternal.ExecutorSelector.class).add(com.google.firebase.components.Dependency.requiredProvider((java.lang.Class<?>) com.google.mlkit.common.sdkinternal.MlKitThreadPool.class)).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.mlkit.common.internal.zzd
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return new com.google.mlkit.common.sdkinternal.ExecutorSelector(componentContainer.getProvider(com.google.mlkit.common.sdkinternal.MlKitThreadPool.class));
            }
        }).build(), com.google.firebase.components.Component.builder(com.google.mlkit.common.sdkinternal.Cleaner.class).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.mlkit.common.internal.zze
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return com.google.mlkit.common.sdkinternal.Cleaner.create();
            }
        }).build(), com.google.firebase.components.Component.builder(com.google.mlkit.common.sdkinternal.CloseGuard.Factory.class).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) com.google.mlkit.common.sdkinternal.Cleaner.class)).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.mlkit.common.internal.zzf
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return new com.google.mlkit.common.sdkinternal.CloseGuard.Factory((com.google.mlkit.common.sdkinternal.Cleaner) componentContainer.get(com.google.mlkit.common.sdkinternal.Cleaner.class));
            }
        }).build(), com.google.firebase.components.Component.builder(com.google.mlkit.common.internal.model.zzg.class).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) com.google.mlkit.common.sdkinternal.MlKitContext.class)).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.mlkit.common.internal.zzg
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return new com.google.mlkit.common.internal.model.zzg((com.google.mlkit.common.sdkinternal.MlKitContext) componentContainer.get(com.google.mlkit.common.sdkinternal.MlKitContext.class));
            }
        }).build(), com.google.firebase.components.Component.intoSetBuilder(com.google.mlkit.common.model.RemoteModelManager.RemoteModelManagerRegistration.class).add(com.google.firebase.components.Dependency.requiredProvider((java.lang.Class<?>) com.google.mlkit.common.internal.model.zzg.class)).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.mlkit.common.internal.zzh
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return new com.google.mlkit.common.model.RemoteModelManager.RemoteModelManagerRegistration(com.google.mlkit.common.model.CustomRemoteModel.class, componentContainer.getProvider(com.google.mlkit.common.internal.model.zzg.class));
            }
        }).build());
    }
}
