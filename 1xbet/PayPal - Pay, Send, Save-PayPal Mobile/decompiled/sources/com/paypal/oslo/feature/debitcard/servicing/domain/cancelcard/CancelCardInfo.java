package com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0081\b\u0018\u0000 12\u00020\u0001:\u000221B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JB\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0014J'\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b-\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b.\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardInfo;", "", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "", "cardId", "cardLastFourDigits", "displayProductName", "", "primary", "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Z", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$debit_card_prodRelease", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardInfo;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "Ljava/lang/String;", "getCardId", "getCardLastFourDigits", "getDisplayProductName", "Z", "getPrimary", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CancelCardInfo {
    public static final int $stable = 0;
    private final java.lang.String cardId;
    private final java.lang.String cardLastFourDigits;
    private final java.lang.String displayProductName;
    private final boolean primary;
    private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.INSTANCE.serializer();
            return serializer;
        }
    }), null, null, null, null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardInfo$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo> serializer() {
            return com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CancelCardInfo(int i, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 15, com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.productName = debitCardProductName;
        this.cardId = str;
        this.cardLastFourDigits = str2;
        this.displayProductName = str3;
        if ((i & 16) == 0) {
            this.primary = true;
        } else {
            this.primary = z;
        }
    }

    public CancelCardInfo(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.productName = debitCardProductName;
        this.cardId = str;
        this.cardLastFourDigits = str2;
        this.displayProductName = str3;
        this.primary = z;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$debit_card_prodRelease(com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, $childSerializers[0].getValue(), self.productName);
        output.encodeStringElement(serialDesc, 1, self.cardId);
        output.encodeStringElement(serialDesc, 2, self.cardLastFourDigits);
        output.encodeStringElement(serialDesc, 3, self.displayProductName);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !self.primary) {
            output.encodeBooleanElement(serialDesc, 4, self.primary);
        }
    }

    public /* synthetic */ CancelCardInfo(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(debitCardProductName, str, str2, str3, (i & 16) != 0 ? true : z);
    }

    public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
        return this.productName;
    }

    public final java.lang.String getCardId() {
        return this.cardId;
    }

    public final java.lang.String getCardLastFourDigits() {
        return this.cardLastFourDigits;
    }

    public final java.lang.String getDisplayProductName() {
        return this.displayProductName;
    }

    public final boolean getPrimary() {
        return this.primary;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
        java.lang.String str = this.cardId;
        java.lang.String str2 = this.cardLastFourDigits;
        java.lang.String str3 = this.displayProductName;
        boolean z = this.primary;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CancelCardInfo(productName=");
        sb.append(debitCardProductName);
        sb.append(", cardId=");
        sb.append(str);
        sb.append(", cardLastFourDigits=");
        sb.append(str2);
        sb.append(", displayProductName=");
        sb.append(str3);
        sb.append(", primary=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.productName.hashCode() * 31) + this.cardId.hashCode()) * 31) + this.cardLastFourDigits.hashCode()) * 31) + this.displayProductName.hashCode()) * 31) + java.lang.Boolean.hashCode(this.primary);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo cancelCardInfo = (com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo) other;
        return this.productName == cancelCardInfo.productName && kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, cancelCardInfo.cardId) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardLastFourDigits, cancelCardInfo.cardLastFourDigits) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayProductName, cancelCardInfo.displayProductName) && this.primary == cancelCardInfo.primary;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo copy(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName, java.lang.String cardId, java.lang.String cardLastFourDigits, java.lang.String displayProductName, boolean primary) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardLastFourDigits, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayProductName, "");
        return new com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo(productName, cardId, cardLastFourDigits, displayProductName, primary);
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getPrimary() {
        return this.primary;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getDisplayProductName() {
        return this.displayProductName;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCardLastFourDigits() {
        return this.cardLastFourDigits;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCardId() {
        return this.cardId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
        return this.productName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo copy$default(com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo cancelCardInfo, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitCardProductName = cancelCardInfo.productName;
        }
        if ((i & 2) != 0) {
            str = cancelCardInfo.cardId;
        }
        java.lang.String str4 = str;
        if ((i & 4) != 0) {
            str2 = cancelCardInfo.cardLastFourDigits;
        }
        java.lang.String str5 = str2;
        if ((i & 8) != 0) {
            str3 = cancelCardInfo.displayProductName;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            z = cancelCardInfo.primary;
        }
        return cancelCardInfo.copy(debitCardProductName, str4, str5, str6, z);
    }
}
