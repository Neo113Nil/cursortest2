package com.datadog.android.rum.internal;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/internal/RumAnonymousIdentifierManager;", "", "Lcom/datadog/android/api/storage/datastore/DataStoreHandler;", "dataStore", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "core", "<init>", "(Lcom/datadog/android/api/storage/datastore/DataStoreHandler;Lcom/datadog/android/api/feature/FeatureSdkCore;)V", "", "shouldTrack", "", "manageAnonymousId", "(Z)V", "Camera2StreamConfigurationMap", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/api/storage/datastore/DataStoreHandler;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RumAnonymousIdentifierManager {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.api.feature.FeatureSdkCore getHighSpeedVideoSizes;
    private final com.datadog.android.api.storage.datastore.DataStoreHandler getHighResolutionOutputSizeshNQ4ISI;

    public RumAnonymousIdentifierManager(com.datadog.android.api.storage.datastore.DataStoreHandler dataStoreHandler, com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataStoreHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        this.getHighResolutionOutputSizeshNQ4ISI = dataStoreHandler;
        this.getHighSpeedVideoSizes = featureSdkCore;
    }

    public final void manageAnonymousId(boolean shouldTrack) {
        if (shouldTrack) {
            final com.datadog.android.api.storage.datastore.DataStoreHandler dataStoreHandler = this.getHighResolutionOutputSizeshNQ4ISI;
            final com.datadog.android.api.feature.FeatureSdkCore featureSdkCore = this.getHighSpeedVideoSizes;
            dataStoreHandler.value("anonymous_id_key", null, new com.datadog.android.rum.internal.AnonymousIdentifierReadCallback(new kotlin.jvm.functions.Function1<java.util.UUID, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.RumAnonymousIdentifierManager$handleAnonymousIdTracking$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(java.util.UUID uuid) {
                    getHighSpeedVideoSizes(uuid);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoSizes(java.util.UUID uuid) {
                    if (uuid == null) {
                        com.datadog.android.rum.internal.RumAnonymousIdentifierManager.access$createAndStoreAnonymousId(com.datadog.android.rum.internal.RumAnonymousIdentifierManager.this, dataStoreHandler, featureSdkCore);
                    } else {
                        featureSdkCore.setAnonymousId(uuid);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            }), new com.datadog.android.rum.internal.AnonymousIdentifierDeserializer());
        } else {
            com.datadog.android.api.storage.datastore.DataStoreHandler dataStoreHandler2 = this.getHighResolutionOutputSizeshNQ4ISI;
            com.datadog.android.api.feature.FeatureSdkCore featureSdkCore2 = this.getHighSpeedVideoSizes;
            com.datadog.android.api.storage.datastore.DataStoreHandler.DefaultImpls.removeValue$default(dataStoreHandler2, "anonymous_id_key", null, 2, null);
            featureSdkCore2.setAnonymousId(null);
        }
    }

    public static final /* synthetic */ void access$createAndStoreAnonymousId(com.datadog.android.rum.internal.RumAnonymousIdentifierManager rumAnonymousIdentifierManager, com.datadog.android.api.storage.datastore.DataStoreHandler dataStoreHandler, com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
        java.util.UUID randomUUID = java.util.UUID.randomUUID();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(randomUUID, "");
        dataStoreHandler.setValue("anonymous_id_key", randomUUID, 0, null, new com.datadog.android.rum.internal.AnonymousIdentifierSerializer());
        featureSdkCore.setAnonymousId(randomUUID);
    }
}
