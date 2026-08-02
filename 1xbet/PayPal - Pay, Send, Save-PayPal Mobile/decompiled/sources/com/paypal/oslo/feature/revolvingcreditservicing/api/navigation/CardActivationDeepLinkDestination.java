package com.paypal.oslo.feature.revolvingcreditservicing.api.navigation;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B9\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0005\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/api/navigation/CardActivationDeepLinkDestination;", "Landroidx/navigation3/runtime/NavKey;", "", "path", "creditProductIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/api/navigation/CardActivationDeepLinkDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_api_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/navigation/CardActivationDeepLinkDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getPath", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCpi", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CardActivationDeepLinkDestination implements androidx.navigation3.runtime.NavKey {
    private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi;
    private final java.lang.String creditProductIdentifier;
    private final java.lang.String path;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardActivationDeepLinkDestination.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardActivationDeepLinkDestination.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardActivationDeepLinkDestination$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/api/navigation/CardActivationDeepLinkDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/navigation/CardActivationDeepLinkDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardActivationDeepLinkDestination> serializer() {
            return com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardActivationDeepLinkDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CardActivationDeepLinkDestination(int i, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.path = null;
        } else {
            this.path = str;
        }
        if ((i & 2) == 0) {
            this.creditProductIdentifier = null;
        } else {
            this.creditProductIdentifier = str2;
        }
        if ((i & 4) == 0) {
            this.cpi = com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.DestinationsKt.parseCreditProductIdentifier(this.path, this.creditProductIdentifier);
        } else {
            this.cpi = creditProductIdentifier;
        }
    }

    public CardActivationDeepLinkDestination(java.lang.String str, java.lang.String str2) {
        this.path = str;
        this.creditProductIdentifier = str2;
        this.cpi = com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.DestinationsKt.parseCreditProductIdentifier(str, str2);
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$revolvingcredit_servicing_api_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardActivationDeepLinkDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.path != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.path);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.creditProductIdentifier != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.creditProductIdentifier);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.cpi != com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.DestinationsKt.parseCreditProductIdentifier(self.path, self.creditProductIdentifier)) {
            output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.cpi);
        }
    }

    public /* synthetic */ CardActivationDeepLinkDestination(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public final java.lang.String getPath() {
        return this.path;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
        return this.cpi;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.path;
        java.lang.String str2 = this.creditProductIdentifier;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardActivationDeepLinkDestination(path=");
        sb.append(str);
        sb.append(", creditProductIdentifier=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.path;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.creditProductIdentifier;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardActivationDeepLinkDestination)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardActivationDeepLinkDestination cardActivationDeepLinkDestination = (com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardActivationDeepLinkDestination) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.path, cardActivationDeepLinkDestination.path) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditProductIdentifier, cardActivationDeepLinkDestination.creditProductIdentifier);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardActivationDeepLinkDestination copy(java.lang.String path, java.lang.String creditProductIdentifier) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardActivationDeepLinkDestination(path, creditProductIdentifier);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPath() {
        return this.path;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardActivationDeepLinkDestination copy$default(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardActivationDeepLinkDestination cardActivationDeepLinkDestination, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cardActivationDeepLinkDestination.path;
        }
        if ((i & 2) != 0) {
            str2 = cardActivationDeepLinkDestination.creditProductIdentifier;
        }
        return cardActivationDeepLinkDestination.copy(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CardActivationDeepLinkDestination() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
