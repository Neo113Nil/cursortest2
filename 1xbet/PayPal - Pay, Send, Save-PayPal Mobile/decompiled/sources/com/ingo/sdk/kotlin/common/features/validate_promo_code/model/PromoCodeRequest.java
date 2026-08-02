package com.ingo.sdk.kotlin.common.features.validate_promo_code.model;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000e"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/validate_promo_code/model/PromoCodeRequest;", "", "", "transactionReferenceNumber", "promoCode", "accountIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ingo/sdk/kotlin/common/features/validate_promo_code/model/PromoCodeRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sharedSdk_release", "(Lcom/ingo/sdk/kotlin/common/features/validate_promo_code/model/PromoCodeRequest;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getTransactionReferenceNumber", "getPromoCode", "getAccountIdentifier", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes.dex */
public final /* data */ class PromoCodeRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.ingo.sdk.kotlin.common.features.validate_promo_code.model.PromoCodeRequest.Companion INSTANCE = new com.ingo.sdk.kotlin.common.features.validate_promo_code.model.PromoCodeRequest.Companion(null);
    private final java.lang.String accountIdentifier;
    private final java.lang.String promoCode;
    private final java.lang.String transactionReferenceNumber;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/validate_promo_code/model/PromoCodeRequest$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingo/sdk/kotlin/common/features/validate_promo_code/model/PromoCodeRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        public final kotlinx.serialization.KSerializer<com.ingo.sdk.kotlin.common.features.validate_promo_code.model.PromoCodeRequest> serializer() {
            return com.ingo.sdk.kotlin.common.features.validate_promo_code.model.PromoCodeRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ PromoCodeRequest(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.ingo.sdk.kotlin.common.features.validate_promo_code.model.PromoCodeRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.transactionReferenceNumber = str;
        this.promoCode = str2;
        this.accountIdentifier = str3;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$sharedSdk_release(com.ingo.sdk.kotlin.common.features.validate_promo_code.model.PromoCodeRequest self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.transactionReferenceNumber);
        output.encodeStringElement(serialDesc, 1, self.promoCode);
        output.encodeStringElement(serialDesc, 2, self.accountIdentifier);
    }

    public PromoCodeRequest(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.transactionReferenceNumber = str;
        this.promoCode = str2;
        this.accountIdentifier = str3;
    }

    public final java.lang.String getTransactionReferenceNumber() {
        return this.transactionReferenceNumber;
    }

    public final java.lang.String getPromoCode() {
        return this.promoCode;
    }

    public final java.lang.String getAccountIdentifier() {
        return this.accountIdentifier;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.transactionReferenceNumber;
        java.lang.String str2 = this.promoCode;
        java.lang.String str3 = this.accountIdentifier;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PromoCodeRequest(transactionReferenceNumber=");
        sb.append(str);
        sb.append(", promoCode=");
        sb.append(str2);
        sb.append(", accountIdentifier=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.transactionReferenceNumber.hashCode() * 31) + this.promoCode.hashCode()) * 31) + this.accountIdentifier.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.ingo.sdk.kotlin.common.features.validate_promo_code.model.PromoCodeRequest)) {
            return false;
        }
        com.ingo.sdk.kotlin.common.features.validate_promo_code.model.PromoCodeRequest promoCodeRequest = (com.ingo.sdk.kotlin.common.features.validate_promo_code.model.PromoCodeRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.transactionReferenceNumber, promoCodeRequest.transactionReferenceNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.promoCode, promoCodeRequest.promoCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountIdentifier, promoCodeRequest.accountIdentifier);
    }

    public final com.ingo.sdk.kotlin.common.features.validate_promo_code.model.PromoCodeRequest copy(java.lang.String transactionReferenceNumber, java.lang.String promoCode, java.lang.String accountIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionReferenceNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promoCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountIdentifier, "");
        return new com.ingo.sdk.kotlin.common.features.validate_promo_code.model.PromoCodeRequest(transactionReferenceNumber, promoCode, accountIdentifier);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAccountIdentifier() {
        return this.accountIdentifier;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPromoCode() {
        return this.promoCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTransactionReferenceNumber() {
        return this.transactionReferenceNumber;
    }

    public static /* synthetic */ com.ingo.sdk.kotlin.common.features.validate_promo_code.model.PromoCodeRequest copy$default(com.ingo.sdk.kotlin.common.features.validate_promo_code.model.PromoCodeRequest promoCodeRequest, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = promoCodeRequest.transactionReferenceNumber;
        }
        if ((i & 2) != 0) {
            str2 = promoCodeRequest.promoCode;
        }
        if ((i & 4) != 0) {
            str3 = promoCodeRequest.accountIdentifier;
        }
        return promoCodeRequest.copy(str, str2, str3);
    }
}
