package com.paypal.oslo.downloads.impl.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0081\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/downloads/impl/data/AuthStateJson;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "LOGGED_IN", "REMEMBERED"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class AuthStateJson {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.downloads.impl.data.AuthStateJson[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.downloads.impl.data.AuthStateJson.Companion INSTANCE;

    @kotlinx.serialization.SerialName("LOGGED_IN")
    public static final com.paypal.oslo.downloads.impl.data.AuthStateJson LOGGED_IN;

    @kotlinx.serialization.SerialName("REMEMBERED")
    public static final com.paypal.oslo.downloads.impl.data.AuthStateJson REMEMBERED;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/downloads/impl/data/AuthStateJson$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/downloads/impl/data/AuthStateJson;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.downloads.impl.data.AuthStateJson> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.downloads.impl.data.AuthStateJson.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AuthStateJson(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.downloads.impl.data.AuthStateJson authStateJson = new com.paypal.oslo.downloads.impl.data.AuthStateJson("LOGGED_IN", 0);
        LOGGED_IN = authStateJson;
        com.paypal.oslo.downloads.impl.data.AuthStateJson authStateJson2 = new com.paypal.oslo.downloads.impl.data.AuthStateJson("REMEMBERED", 1);
        REMEMBERED = authStateJson2;
        com.paypal.oslo.downloads.impl.data.AuthStateJson[] authStateJsonArr = {authStateJson, authStateJson2};
        $VALUES = authStateJsonArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(authStateJsonArr);
        INSTANCE = new com.paypal.oslo.downloads.impl.data.AuthStateJson.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.downloads.impl.data.AuthStateJson$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createAnnotatedEnumSerializer;
                createAnnotatedEnumSerializer = kotlinx.serialization.internal.EnumsKt.createAnnotatedEnumSerializer("com.paypal.oslo.downloads.impl.data.AuthStateJson", com.paypal.oslo.downloads.impl.data.AuthStateJson.values(), new java.lang.String[]{"LOGGED_IN", "REMEMBERED"}, new java.lang.annotation.Annotation[][]{null, null}, null);
                return createAnnotatedEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.downloads.impl.data.AuthStateJson[] values() {
        return (com.paypal.oslo.downloads.impl.data.AuthStateJson[]) $VALUES.clone();
    }

    public static com.paypal.oslo.downloads.impl.data.AuthStateJson valueOf(java.lang.String str) {
        return (com.paypal.oslo.downloads.impl.data.AuthStateJson) java.lang.Enum.valueOf(com.paypal.oslo.downloads.impl.data.AuthStateJson.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.downloads.impl.data.AuthStateJson> getEntries() {
        return $ENTRIES;
    }
}
