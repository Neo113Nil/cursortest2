package com.paypal.oslo.feature.userprofile.api.navigation.result;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/navigation/result/PhoneAction;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ADD", "EDIT", com.datadog.android.internal.network.HttpSpec.Method.DELETE, "MAKE_PRIMARY", "RESEND_CONFIRMATION"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class PhoneAction {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction ADD;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction.Companion INSTANCE;
    public static final com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction DELETE;
    public static final com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction EDIT;
    public static final com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction MAKE_PRIMARY;
    public static final com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction RESEND_CONFIRMATION;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/navigation/result/PhoneAction$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/userprofile/api/navigation/result/PhoneAction;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private PhoneAction(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction phoneAction = new com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction("ADD", 0);
        ADD = phoneAction;
        com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction phoneAction2 = new com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction("EDIT", 1);
        EDIT = phoneAction2;
        com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction phoneAction3 = new com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction(com.datadog.android.internal.network.HttpSpec.Method.DELETE, 2);
        DELETE = phoneAction3;
        com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction phoneAction4 = new com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction("MAKE_PRIMARY", 3);
        MAKE_PRIMARY = phoneAction4;
        com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction phoneAction5 = new com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction("RESEND_CONFIRMATION", 4);
        RESEND_CONFIRMATION = phoneAction5;
        com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction[] phoneActionArr = {phoneAction, phoneAction2, phoneAction3, phoneAction4, phoneAction5};
        $VALUES = phoneActionArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(phoneActionArr);
        INSTANCE = new com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction", com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction[] values() {
        return (com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction) java.lang.Enum.valueOf(com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction> getEntries() {
        return $ENTRIES;
    }
}
