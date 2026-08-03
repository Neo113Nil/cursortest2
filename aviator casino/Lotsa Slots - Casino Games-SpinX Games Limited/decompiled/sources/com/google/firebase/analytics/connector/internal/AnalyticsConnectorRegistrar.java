package com.google.firebase.analytics.connector.internal;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.5.0 */
/* loaded from: classes3.dex */
public class AnalyticsConnectorRegistrar implements com.google.firebase.components.ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.firebase.analytics.connector.AnalyticsConnector lambda$getComponents$0(com.google.firebase.components.ComponentContainer componentContainer) {
        return com.google.firebase.analytics.connector.AnalyticsConnectorImpl.getInstance((com.google.firebase.FirebaseApp) componentContainer.get(com.google.firebase.FirebaseApp.class), (android.content.Context) componentContainer.get(android.content.Context.class), (com.google.firebase.events.Subscriber) componentContainer.get(com.google.firebase.events.Subscriber.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<com.google.firebase.components.Component<?>> getComponents() {
        return java.util.Arrays.asList(com.google.firebase.components.Component.builder(com.google.firebase.analytics.connector.AnalyticsConnector.class).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) com.google.firebase.FirebaseApp.class)).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) android.content.Context.class)).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) com.google.firebase.events.Subscriber.class)).factory(com.google.firebase.analytics.connector.internal.zzb.zza).eagerInDefaultApp().build(), com.google.firebase.platforminfo.LibraryVersionComponent.create("fire-analytics", "22.5.0"));
    }
}
