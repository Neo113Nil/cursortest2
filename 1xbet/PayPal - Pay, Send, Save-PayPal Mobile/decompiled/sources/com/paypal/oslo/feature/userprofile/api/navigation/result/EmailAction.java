package com.paypal.oslo.feature.userprofile.api.navigation.result;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/navigation/result/EmailAction;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ADD", "EDIT", com.datadog.android.internal.network.HttpSpec.Method.DELETE, "CONFIRM", "MAKE_PRIMARY"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class EmailAction {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction ADD;
    public static final com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction CONFIRM;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.Companion INSTANCE;
    public static final com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction DELETE;
    public static final com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction EDIT;
    public static final com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction MAKE_PRIMARY;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/navigation/result/EmailAction$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/userprofile/api/navigation/result/EmailAction;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private EmailAction(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction emailAction = new com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction("ADD", 0);
        ADD = emailAction;
        com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction emailAction2 = new com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction("EDIT", 1);
        EDIT = emailAction2;
        com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction emailAction3 = new com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction(com.datadog.android.internal.network.HttpSpec.Method.DELETE, 2);
        DELETE = emailAction3;
        com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction emailAction4 = new com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction("CONFIRM", 3);
        CONFIRM = emailAction4;
        com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction emailAction5 = new com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction("MAKE_PRIMARY", 4);
        MAKE_PRIMARY = emailAction5;
        com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction[] emailActionArr = {emailAction, emailAction2, emailAction3, emailAction4, emailAction5};
        $VALUES = emailActionArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(emailActionArr);
        INSTANCE = new com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction", com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction[] values() {
        return (com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction) java.lang.Enum.valueOf(com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction> getEntries() {
        return $ENTRIES;
    }
}
