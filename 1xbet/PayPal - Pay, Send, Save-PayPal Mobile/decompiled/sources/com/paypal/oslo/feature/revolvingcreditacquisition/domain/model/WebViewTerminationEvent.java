package com.paypal.oslo.feature.revolvingcreditacquisition.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/model/WebViewTerminationEvent;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "DID_COMPLETE_FLOW", "DID_CANCEL_FLOW", "DID_PERFORM_DEEP_LINK"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class WebViewTerminationEvent {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.WebViewTerminationEvent[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.WebViewTerminationEvent.Companion INSTANCE;

    @kotlinx.serialization.SerialName("didCancelFlow")
    public static final com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.WebViewTerminationEvent DID_CANCEL_FLOW;

    @kotlinx.serialization.SerialName("didCompleteFlow")
    public static final com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.WebViewTerminationEvent DID_COMPLETE_FLOW;

    @kotlinx.serialization.SerialName("didPerformDeeplink")
    public static final com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.WebViewTerminationEvent DID_PERFORM_DEEP_LINK;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/model/WebViewTerminationEvent$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/model/WebViewTerminationEvent;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.WebViewTerminationEvent> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.WebViewTerminationEvent.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private WebViewTerminationEvent(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.WebViewTerminationEvent webViewTerminationEvent = new com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.WebViewTerminationEvent("DID_COMPLETE_FLOW", 0);
        DID_COMPLETE_FLOW = webViewTerminationEvent;
        com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.WebViewTerminationEvent webViewTerminationEvent2 = new com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.WebViewTerminationEvent("DID_CANCEL_FLOW", 1);
        DID_CANCEL_FLOW = webViewTerminationEvent2;
        com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.WebViewTerminationEvent webViewTerminationEvent3 = new com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.WebViewTerminationEvent("DID_PERFORM_DEEP_LINK", 2);
        DID_PERFORM_DEEP_LINK = webViewTerminationEvent3;
        com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.WebViewTerminationEvent[] webViewTerminationEventArr = {webViewTerminationEvent, webViewTerminationEvent2, webViewTerminationEvent3};
        $VALUES = webViewTerminationEventArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(webViewTerminationEventArr);
        INSTANCE = new com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.WebViewTerminationEvent.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.WebViewTerminationEvent$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createAnnotatedEnumSerializer;
                createAnnotatedEnumSerializer = kotlinx.serialization.internal.EnumsKt.createAnnotatedEnumSerializer("com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.WebViewTerminationEvent", com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.WebViewTerminationEvent.values(), new java.lang.String[]{"didCompleteFlow", "didCancelFlow", "didPerformDeeplink"}, new java.lang.annotation.Annotation[][]{null, null, null}, null);
                return createAnnotatedEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.WebViewTerminationEvent[] values() {
        return (com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.WebViewTerminationEvent[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.WebViewTerminationEvent valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.WebViewTerminationEvent) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.WebViewTerminationEvent.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.WebViewTerminationEvent> getEntries() {
        return $ENTRIES;
    }
}
