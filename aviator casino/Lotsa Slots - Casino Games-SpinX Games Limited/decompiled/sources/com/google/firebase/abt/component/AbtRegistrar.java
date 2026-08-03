package com.google.firebase.abt.component;

/* loaded from: classes3.dex */
public class AbtRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private static final java.lang.String LIBRARY_NAME = "fire-abt";

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<com.google.firebase.components.Component<?>> getComponents() {
        return java.util.Arrays.asList(com.google.firebase.components.Component.builder(com.google.firebase.abt.component.AbtComponent.class).name(LIBRARY_NAME).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) android.content.Context.class)).add(com.google.firebase.components.Dependency.optionalProvider((java.lang.Class<?>) com.google.firebase.analytics.connector.AnalyticsConnector.class)).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.abt.component.AbtRegistrar$$ExternalSyntheticLambda0
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return com.google.firebase.abt.component.AbtRegistrar.lambda$getComponents$0(componentContainer);
            }
        }).build(), com.google.firebase.platforminfo.LibraryVersionComponent.create(LIBRARY_NAME, com.google.firebase.abt.BuildConfig.VERSION_NAME));
    }

    static /* synthetic */ com.google.firebase.abt.component.AbtComponent lambda$getComponents$0(com.google.firebase.components.ComponentContainer componentContainer) {
        return new com.google.firebase.abt.component.AbtComponent((android.content.Context) componentContainer.get(android.content.Context.class), componentContainer.getProvider(com.google.firebase.analytics.connector.AnalyticsConnector.class));
    }
}
