package com.paypal.oslo.feature.publicprofile.api.navigation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/api/navigation/PublicProfileFlowType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "SEND_REQUEST", com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionSend, com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionRequest}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class PublicProfileFlowType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType REQUEST;
    public static final com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType SEND;
    public static final com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType SEND_REQUEST;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/api/navigation/PublicProfileFlowType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/publicprofile/api/navigation/PublicProfileFlowType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private PublicProfileFlowType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType publicProfileFlowType = new com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType("SEND_REQUEST", 0);
        SEND_REQUEST = publicProfileFlowType;
        com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType publicProfileFlowType2 = new com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType(com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionSend, 1);
        SEND = publicProfileFlowType2;
        com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType publicProfileFlowType3 = new com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType(com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionRequest, 2);
        REQUEST = publicProfileFlowType3;
        com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType[] publicProfileFlowTypeArr = {publicProfileFlowType, publicProfileFlowType2, publicProfileFlowType3};
        $VALUES = publicProfileFlowTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(publicProfileFlowTypeArr);
        INSTANCE = new com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType", com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType[] values() {
        return (com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType) java.lang.Enum.valueOf(com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType> getEntries() {
        return $ENTRIES;
    }
}
