package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/UploadTncStore;", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/CardSyncStore;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UploadTncStore extends com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.CardSyncStore<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId> {
    private static final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.UploadTncStore.Companion Companion = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.UploadTncStore.Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public UploadTncStore(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        super(new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DataStoreReadWrite(new com.paypal.oslo.core.persistence.appstorage.AppStorage("taptopay_card_sync", context), new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted("uploadTnC"), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.UploadTncStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.String highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.UploadTncStore.getHighResolutionOutputSizeshNQ4ISI((java.util.Set) obj);
                return highResolutionOutputSizeshNQ4ISI;
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.UploadTncStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.util.Set Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.UploadTncStore.Camera2StreamConfigurationMap((java.lang.String) obj);
                return Camera2StreamConfigurationMap;
            }
        }), null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/UploadTncStore$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.util.Set set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        try {
            return com.paypal.oslo.feature.taptopay.data.util.ExtensionsKt.getJson().encodeToString(new kotlinx.serialization.internal.LinkedHashSetSerializer(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId.INSTANCE.serializer()), set);
        } catch (kotlinx.serialization.SerializationException e) {
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.Set.class).getSimpleName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to serialize ");
            sb.append(simpleName);
            sb.append(" to JSON");
            throw new java.lang.IllegalStateException(sb.toString(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Set Camera2StreamConfigurationMap(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            return (java.util.Set) com.paypal.oslo.feature.taptopay.data.util.ExtensionsKt.getJson().decodeFromString(new kotlinx.serialization.internal.LinkedHashSetSerializer(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId.INSTANCE.serializer()), str);
        } catch (kotlinx.serialization.SerializationException e) {
            throw new java.lang.IllegalStateException("Failed to deserialize JSON to ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.Set.class).getSimpleName())), e);
        }
    }
}
