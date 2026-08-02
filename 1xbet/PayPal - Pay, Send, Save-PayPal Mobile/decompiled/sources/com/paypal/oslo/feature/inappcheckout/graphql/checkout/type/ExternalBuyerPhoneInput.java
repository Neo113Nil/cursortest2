package com.paypal.oslo.feature.inappcheckout.graphql.checkout.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalBuyerPhoneInput;", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalPhoneInput;", "phone", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalPhoneType;", "type", "", "consentId", "experienceId", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalPhoneInput;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalPhoneType;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalPhoneInput;", "component2", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalPhoneType;", "component3", "()Ljava/lang/String;", "component4", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalPhoneInput;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalPhoneType;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalBuyerPhoneInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalPhoneInput;", "getPhone", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalPhoneType;", "getType", "Ljava/lang/String;", "getConsentId", "getExperienceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExternalBuyerPhoneInput {
    public static final int $stable = 8;
    private final java.lang.String consentId;
    private final java.lang.String experienceId;
    private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneInput phone;
    private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType type;

    public ExternalBuyerPhoneInput(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneInput externalPhoneInput, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType externalPhoneType, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalPhoneInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalPhoneType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.phone = externalPhoneInput;
        this.type = externalPhoneType;
        this.consentId = str;
        this.experienceId = str2;
    }

    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneInput getPhone() {
        return this.phone;
    }

    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType getType() {
        return this.type;
    }

    public final java.lang.String getConsentId() {
        return this.consentId;
    }

    public final java.lang.String getExperienceId() {
        return this.experienceId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneInput externalPhoneInput = this.phone;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType externalPhoneType = this.type;
        java.lang.String str = this.consentId;
        java.lang.String str2 = this.experienceId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExternalBuyerPhoneInput(phone=");
        sb.append(externalPhoneInput);
        sb.append(", type=");
        sb.append(externalPhoneType);
        sb.append(", consentId=");
        sb.append(str);
        sb.append(", experienceId=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.phone.hashCode() * 31) + this.type.hashCode()) * 31) + this.consentId.hashCode()) * 31) + this.experienceId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBuyerPhoneInput)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBuyerPhoneInput externalBuyerPhoneInput = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBuyerPhoneInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.phone, externalBuyerPhoneInput.phone) && this.type == externalBuyerPhoneInput.type && kotlin.jvm.internal.Intrinsics.areEqual(this.consentId, externalBuyerPhoneInput.consentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.experienceId, externalBuyerPhoneInput.experienceId);
    }

    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBuyerPhoneInput copy(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneInput phone, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType type, java.lang.String consentId, java.lang.String experienceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phone, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experienceId, "");
        return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBuyerPhoneInput(phone, type, consentId, experienceId);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getExperienceId() {
        return this.experienceId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getConsentId() {
        return this.consentId;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneInput getPhone() {
        return this.phone;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBuyerPhoneInput copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBuyerPhoneInput externalBuyerPhoneInput, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneInput externalPhoneInput, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType externalPhoneType, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            externalPhoneInput = externalBuyerPhoneInput.phone;
        }
        if ((i & 2) != 0) {
            externalPhoneType = externalBuyerPhoneInput.type;
        }
        if ((i & 4) != 0) {
            str = externalBuyerPhoneInput.consentId;
        }
        if ((i & 8) != 0) {
            str2 = externalBuyerPhoneInput.experienceId;
        }
        return externalBuyerPhoneInput.copy(externalPhoneInput, externalPhoneType, str, str2);
    }
}
