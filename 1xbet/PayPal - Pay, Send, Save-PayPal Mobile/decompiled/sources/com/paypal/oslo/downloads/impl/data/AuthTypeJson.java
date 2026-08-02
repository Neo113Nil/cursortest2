package com.paypal.oslo.downloads.impl.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0081\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/downloads/impl/data/AuthTypeJson;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "USER", "CLIENT"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class AuthTypeJson {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.downloads.impl.data.AuthTypeJson[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    @kotlinx.serialization.SerialName("CLIENT")
    public static final com.paypal.oslo.downloads.impl.data.AuthTypeJson CLIENT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.downloads.impl.data.AuthTypeJson.Companion INSTANCE;

    @kotlinx.serialization.SerialName("USER")
    public static final com.paypal.oslo.downloads.impl.data.AuthTypeJson USER;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/downloads/impl/data/AuthTypeJson$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/downloads/impl/data/AuthTypeJson;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.downloads.impl.data.AuthTypeJson> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.downloads.impl.data.AuthTypeJson.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AuthTypeJson(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.downloads.impl.data.AuthTypeJson authTypeJson = new com.paypal.oslo.downloads.impl.data.AuthTypeJson("USER", 0);
        USER = authTypeJson;
        com.paypal.oslo.downloads.impl.data.AuthTypeJson authTypeJson2 = new com.paypal.oslo.downloads.impl.data.AuthTypeJson("CLIENT", 1);
        CLIENT = authTypeJson2;
        com.paypal.oslo.downloads.impl.data.AuthTypeJson[] authTypeJsonArr = {authTypeJson, authTypeJson2};
        $VALUES = authTypeJsonArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(authTypeJsonArr);
        INSTANCE = new com.paypal.oslo.downloads.impl.data.AuthTypeJson.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.downloads.impl.data.AuthTypeJson$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createAnnotatedEnumSerializer;
                createAnnotatedEnumSerializer = kotlinx.serialization.internal.EnumsKt.createAnnotatedEnumSerializer("com.paypal.oslo.downloads.impl.data.AuthTypeJson", com.paypal.oslo.downloads.impl.data.AuthTypeJson.values(), new java.lang.String[]{"USER", "CLIENT"}, new java.lang.annotation.Annotation[][]{null, null}, null);
                return createAnnotatedEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.downloads.impl.data.AuthTypeJson[] values() {
        return (com.paypal.oslo.downloads.impl.data.AuthTypeJson[]) $VALUES.clone();
    }

    public static com.paypal.oslo.downloads.impl.data.AuthTypeJson valueOf(java.lang.String str) {
        return (com.paypal.oslo.downloads.impl.data.AuthTypeJson) java.lang.Enum.valueOf(com.paypal.oslo.downloads.impl.data.AuthTypeJson.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.downloads.impl.data.AuthTypeJson> getEntries() {
        return $ENTRIES;
    }
}
