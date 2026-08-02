package com.paypal.oslo.feature.identity.api.model;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0011J'\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/CheckoutPreferences;", "", "", "cancelUrl", "returnUrl", "checkoutApprovalUrl", "bridgeUrl", "Lcom/paypal/oslo/feature/identity/api/model/AppSwitchPreferences;", "appSwitchPreferences", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/api/model/AppSwitchPreferences;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/api/model/AppSwitchPreferences;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/identity/api/model/AppSwitchPreferences;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/api/model/AppSwitchPreferences;)Lcom/paypal/oslo/feature/identity/api/model/CheckoutPreferences;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_api_prodRelease", "(Lcom/paypal/oslo/feature/identity/api/model/CheckoutPreferences;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getCancelUrl", "getReturnUrl", "getCheckoutApprovalUrl", "getBridgeUrl", "Lcom/paypal/oslo/feature/identity/api/model/AppSwitchPreferences;", "getAppSwitchPreferences", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CheckoutPreferences {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.api.model.CheckoutPreferences.Companion INSTANCE = new com.paypal.oslo.feature.identity.api.model.CheckoutPreferences.Companion(null);
    private final com.paypal.oslo.feature.identity.api.model.AppSwitchPreferences appSwitchPreferences;
    private final java.lang.String bridgeUrl;
    private final java.lang.String cancelUrl;
    private final java.lang.String checkoutApprovalUrl;
    private final java.lang.String returnUrl;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/CheckoutPreferences$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutPreferences;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.model.CheckoutPreferences> serializer() {
            return com.paypal.oslo.feature.identity.api.model.CheckoutPreferences$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CheckoutPreferences(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.identity.api.model.AppSwitchPreferences appSwitchPreferences, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 31, com.paypal.oslo.feature.identity.api.model.CheckoutPreferences$$serializer.INSTANCE.getDescriptor());
        }
        this.cancelUrl = str;
        this.returnUrl = str2;
        this.checkoutApprovalUrl = str3;
        this.bridgeUrl = str4;
        this.appSwitchPreferences = appSwitchPreferences;
    }

    public CheckoutPreferences(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.identity.api.model.AppSwitchPreferences appSwitchPreferences) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchPreferences, "");
        this.cancelUrl = str;
        this.returnUrl = str2;
        this.checkoutApprovalUrl = str3;
        this.bridgeUrl = str4;
        this.appSwitchPreferences = appSwitchPreferences;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$identity_api_prodRelease(com.paypal.oslo.feature.identity.api.model.CheckoutPreferences self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.cancelUrl);
        output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.returnUrl);
        output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.checkoutApprovalUrl);
        output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.bridgeUrl);
        output.encodeSerializableElement(serialDesc, 4, com.paypal.oslo.feature.identity.api.model.AppSwitchPreferences$$serializer.INSTANCE, self.appSwitchPreferences);
    }

    public final java.lang.String getCancelUrl() {
        return this.cancelUrl;
    }

    public final java.lang.String getReturnUrl() {
        return this.returnUrl;
    }

    public final java.lang.String getCheckoutApprovalUrl() {
        return this.checkoutApprovalUrl;
    }

    public final java.lang.String getBridgeUrl() {
        return this.bridgeUrl;
    }

    public final com.paypal.oslo.feature.identity.api.model.AppSwitchPreferences getAppSwitchPreferences() {
        return this.appSwitchPreferences;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.cancelUrl;
        java.lang.String str2 = this.returnUrl;
        java.lang.String str3 = this.checkoutApprovalUrl;
        java.lang.String str4 = this.bridgeUrl;
        com.paypal.oslo.feature.identity.api.model.AppSwitchPreferences appSwitchPreferences = this.appSwitchPreferences;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CheckoutPreferences(cancelUrl=");
        sb.append(str);
        sb.append(", returnUrl=");
        sb.append(str2);
        sb.append(", checkoutApprovalUrl=");
        sb.append(str3);
        sb.append(", bridgeUrl=");
        sb.append(str4);
        sb.append(", appSwitchPreferences=");
        sb.append(appSwitchPreferences);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.cancelUrl;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.returnUrl;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.checkoutApprovalUrl;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.bridgeUrl;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + this.appSwitchPreferences.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.api.model.CheckoutPreferences)) {
            return false;
        }
        com.paypal.oslo.feature.identity.api.model.CheckoutPreferences checkoutPreferences = (com.paypal.oslo.feature.identity.api.model.CheckoutPreferences) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.cancelUrl, checkoutPreferences.cancelUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.returnUrl, checkoutPreferences.returnUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.checkoutApprovalUrl, checkoutPreferences.checkoutApprovalUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.bridgeUrl, checkoutPreferences.bridgeUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.appSwitchPreferences, checkoutPreferences.appSwitchPreferences);
    }

    public final com.paypal.oslo.feature.identity.api.model.CheckoutPreferences copy(java.lang.String cancelUrl, java.lang.String returnUrl, java.lang.String checkoutApprovalUrl, java.lang.String bridgeUrl, com.paypal.oslo.feature.identity.api.model.AppSwitchPreferences appSwitchPreferences) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchPreferences, "");
        return new com.paypal.oslo.feature.identity.api.model.CheckoutPreferences(cancelUrl, returnUrl, checkoutApprovalUrl, bridgeUrl, appSwitchPreferences);
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.identity.api.model.AppSwitchPreferences getAppSwitchPreferences() {
        return this.appSwitchPreferences;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getBridgeUrl() {
        return this.bridgeUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCheckoutApprovalUrl() {
        return this.checkoutApprovalUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getReturnUrl() {
        return this.returnUrl;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCancelUrl() {
        return this.cancelUrl;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.api.model.CheckoutPreferences copy$default(com.paypal.oslo.feature.identity.api.model.CheckoutPreferences checkoutPreferences, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.identity.api.model.AppSwitchPreferences appSwitchPreferences, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = checkoutPreferences.cancelUrl;
        }
        if ((i & 2) != 0) {
            str2 = checkoutPreferences.returnUrl;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = checkoutPreferences.checkoutApprovalUrl;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = checkoutPreferences.bridgeUrl;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            appSwitchPreferences = checkoutPreferences.appSwitchPreferences;
        }
        return checkoutPreferences.copy(str, str5, str6, str7, appSwitchPreferences);
    }
}
