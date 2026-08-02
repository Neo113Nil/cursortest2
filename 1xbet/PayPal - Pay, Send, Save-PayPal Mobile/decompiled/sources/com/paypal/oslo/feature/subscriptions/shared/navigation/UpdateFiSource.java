package com.paypal.oslo.feature.subscriptions.shared.navigation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/navigation/UpdateFiSource;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "DETAILS", "BULK_FI", "BULK_FI_POST_UPDATE"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class UpdateFiSource {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource BULK_FI;
    public static final com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource BULK_FI_POST_UPDATE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource.Companion INSTANCE;
    public static final com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource DETAILS;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/navigation/UpdateFiSource$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/subscriptions/shared/navigation/UpdateFiSource;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private UpdateFiSource(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource updateFiSource = new com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource("DETAILS", 0);
        DETAILS = updateFiSource;
        com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource updateFiSource2 = new com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource("BULK_FI", 1);
        BULK_FI = updateFiSource2;
        com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource updateFiSource3 = new com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource("BULK_FI_POST_UPDATE", 2);
        BULK_FI_POST_UPDATE = updateFiSource3;
        com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource[] updateFiSourceArr = {updateFiSource, updateFiSource2, updateFiSource3};
        $VALUES = updateFiSourceArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(updateFiSourceArr);
        INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource", com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource[] values() {
        return (com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource) java.lang.Enum.valueOf(com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource> getEntries() {
        return $ENTRIES;
    }
}
