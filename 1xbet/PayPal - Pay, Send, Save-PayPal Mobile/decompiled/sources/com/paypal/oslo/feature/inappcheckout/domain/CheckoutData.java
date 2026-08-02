package com.paypal.oslo.feature.inappcheckout.domain;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/CheckoutData;", "", "", "checkoutUrl", "returnUrl", "cancellationUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/domain/CheckoutData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$inappcheckout_prodRelease", "(Lcom/paypal/oslo/feature/inappcheckout/domain/CheckoutData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getCheckoutUrl", "getReturnUrl", "getCancellationUrl", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CheckoutData {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.domain.CheckoutData.Companion INSTANCE = new com.paypal.oslo.feature.inappcheckout.domain.CheckoutData.Companion(null);
    private final java.lang.String cancellationUrl;
    private final java.lang.String checkoutUrl;
    private final java.lang.String returnUrl;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/CheckoutData$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/inappcheckout/domain/CheckoutData;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.inappcheckout.domain.CheckoutData> serializer() {
            return com.paypal.oslo.feature.inappcheckout.domain.CheckoutData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CheckoutData(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.paypal.oslo.feature.inappcheckout.domain.CheckoutData$$serializer.INSTANCE.getDescriptor());
        }
        this.checkoutUrl = str;
        this.returnUrl = str2;
        this.cancellationUrl = str3;
    }

    public CheckoutData(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.checkoutUrl = str;
        this.returnUrl = str2;
        this.cancellationUrl = str3;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$inappcheckout_prodRelease(com.paypal.oslo.feature.inappcheckout.domain.CheckoutData self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.checkoutUrl);
        output.encodeStringElement(serialDesc, 1, self.returnUrl);
        output.encodeStringElement(serialDesc, 2, self.cancellationUrl);
    }

    public final java.lang.String getCheckoutUrl() {
        return this.checkoutUrl;
    }

    public final java.lang.String getReturnUrl() {
        return this.returnUrl;
    }

    public final java.lang.String getCancellationUrl() {
        return this.cancellationUrl;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.checkoutUrl;
        java.lang.String str2 = this.returnUrl;
        java.lang.String str3 = this.cancellationUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CheckoutData(checkoutUrl=");
        sb.append(str);
        sb.append(", returnUrl=");
        sb.append(str2);
        sb.append(", cancellationUrl=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.checkoutUrl.hashCode() * 31) + this.returnUrl.hashCode()) * 31) + this.cancellationUrl.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.domain.CheckoutData)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.domain.CheckoutData checkoutData = (com.paypal.oslo.feature.inappcheckout.domain.CheckoutData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.checkoutUrl, checkoutData.checkoutUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.returnUrl, checkoutData.returnUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.cancellationUrl, checkoutData.cancellationUrl);
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.CheckoutData copy(java.lang.String checkoutUrl, java.lang.String returnUrl, java.lang.String cancellationUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(returnUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancellationUrl, "");
        return new com.paypal.oslo.feature.inappcheckout.domain.CheckoutData(checkoutUrl, returnUrl, cancellationUrl);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCancellationUrl() {
        return this.cancellationUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getReturnUrl() {
        return this.returnUrl;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCheckoutUrl() {
        return this.checkoutUrl;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.CheckoutData copy$default(com.paypal.oslo.feature.inappcheckout.domain.CheckoutData checkoutData, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = checkoutData.checkoutUrl;
        }
        if ((i & 2) != 0) {
            str2 = checkoutData.returnUrl;
        }
        if ((i & 4) != 0) {
            str3 = checkoutData.cancellationUrl;
        }
        return checkoutData.copy(str, str2, str3);
    }
}
