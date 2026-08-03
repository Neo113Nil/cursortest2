package com.google.firebase.remoteconfig;

/* loaded from: classes3.dex */
public class RemoteConfigRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private static final java.lang.String LIBRARY_NAME = "fire-rc";

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<com.google.firebase.components.Component<?>> getComponents() {
        final com.google.firebase.components.Qualified qualified = com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Blocking.class, java.util.concurrent.ScheduledExecutorService.class);
        return java.util.Arrays.asList(com.google.firebase.components.Component.builder(com.google.firebase.remoteconfig.RemoteConfigComponent.class, com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop.class).name(LIBRARY_NAME).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) android.content.Context.class)).add(com.google.firebase.components.Dependency.required((com.google.firebase.components.Qualified<?>) qualified)).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) com.google.firebase.FirebaseApp.class)).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) com.google.firebase.installations.FirebaseInstallationsApi.class)).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) com.google.firebase.abt.component.AbtComponent.class)).add(com.google.firebase.components.Dependency.optionalProvider((java.lang.Class<?>) com.google.firebase.analytics.connector.AnalyticsConnector.class)).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.remoteconfig.RemoteConfigRegistrar$$ExternalSyntheticLambda0
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return com.google.firebase.remoteconfig.RemoteConfigRegistrar.lambda$getComponents$0(com.google.firebase.components.Qualified.this, componentContainer);
            }
        }).eagerInDefaultApp().build(), com.google.firebase.platforminfo.LibraryVersionComponent.create(LIBRARY_NAME, com.google.firebase.remoteconfig.BuildConfig.VERSION_NAME));
    }

    static /* synthetic */ com.google.firebase.remoteconfig.RemoteConfigComponent lambda$getComponents$0(com.google.firebase.components.Qualified qualified, com.google.firebase.components.ComponentContainer componentContainer) {
        return new com.google.firebase.remoteconfig.RemoteConfigComponent((android.content.Context) componentContainer.get(android.content.Context.class), (java.util.concurrent.ScheduledExecutorService) componentContainer.get(qualified), (com.google.firebase.FirebaseApp) componentContainer.get(com.google.firebase.FirebaseApp.class), (com.google.firebase.installations.FirebaseInstallationsApi) componentContainer.get(com.google.firebase.installations.FirebaseInstallationsApi.class), ((com.google.firebase.abt.component.AbtComponent) componentContainer.get(com.google.firebase.abt.component.AbtComponent.class)).get(com.google.firebase.abt.FirebaseABTesting.OriginService.REMOTE_CONFIG), componentContainer.getProvider(com.google.firebase.analytics.connector.AnalyticsConnector.class));
    }
}
