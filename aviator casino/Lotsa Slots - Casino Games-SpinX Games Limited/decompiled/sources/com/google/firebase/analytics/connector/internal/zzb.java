package com.google.firebase.analytics.connector.internal;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.5.0 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzb implements com.google.firebase.components.ComponentFactory {
    static final /* synthetic */ com.google.firebase.analytics.connector.internal.zzb zza = new com.google.firebase.analytics.connector.internal.zzb();

    private /* synthetic */ zzb() {
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final /* synthetic */ java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
        com.google.firebase.analytics.connector.AnalyticsConnector lambda$getComponents$0;
        lambda$getComponents$0 = com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar.lambda$getComponents$0(componentContainer);
        return lambda$getComponents$0;
    }
}
