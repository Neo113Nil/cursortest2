package com.paypal.oslo.feature.taptopay.api.domain.model.topbar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/domain/model/topbar/NavAction;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "HOME", com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.BACK, com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_CLOSE, "SKIP"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class NavAction {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction BACK;
    public static final com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction CLOSE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction.Companion INSTANCE;
    public static final com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction HOME;
    public static final com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction SKIP;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/domain/model/topbar/NavAction$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/topbar/NavAction;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private NavAction(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction navAction = new com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction("HOME", 0);
        HOME = navAction;
        com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction navAction2 = new com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction(com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.BACK, 1);
        BACK = navAction2;
        com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction navAction3 = new com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction(com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_CLOSE, 2);
        CLOSE = navAction3;
        com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction navAction4 = new com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction("SKIP", 3);
        SKIP = navAction4;
        com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction[] navActionArr = {navAction, navAction2, navAction3, navAction4};
        $VALUES = navActionArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(navActionArr);
        INSTANCE = new com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction", com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction[] values() {
        return (com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction) java.lang.Enum.valueOf(com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction> getEntries() {
        return $ENTRIES;
    }
}
