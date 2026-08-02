package com.paypal.oslo.feature.subscriptions.linkagreements.iab;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserArgs;", "", "", "url", "source", "merchantName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserArgs;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$subscriptions_prodRelease", "(Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserArgs;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getUrl", "getSource", "getMerchantName", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class LinkAgreementInAppBrowserArgs {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserArgs.Companion INSTANCE = new com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserArgs.Companion(null);
    private final java.lang.String merchantName;
    private final java.lang.String source;
    private final java.lang.String url;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserArgs$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserArgs> serializer() {
            return com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserArgs$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ LinkAgreementInAppBrowserArgs(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserArgs$$serializer.INSTANCE.getDescriptor());
        }
        this.url = str;
        this.source = str2;
        this.merchantName = str3;
    }

    public LinkAgreementInAppBrowserArgs(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.url = str;
        this.source = str2;
        this.merchantName = str3;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$subscriptions_prodRelease(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserArgs self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.url);
        output.encodeStringElement(serialDesc, 1, self.source);
        output.encodeStringElement(serialDesc, 2, self.merchantName);
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final java.lang.String getSource() {
        return this.source;
    }

    public final java.lang.String getMerchantName() {
        return this.merchantName;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.url;
        java.lang.String str2 = this.source;
        java.lang.String str3 = this.merchantName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkAgreementInAppBrowserArgs(url=");
        sb.append(str);
        sb.append(", source=");
        sb.append(str2);
        sb.append(", merchantName=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.url.hashCode() * 31) + this.source.hashCode()) * 31) + this.merchantName.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserArgs)) {
            return false;
        }
        com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserArgs linkAgreementInAppBrowserArgs = (com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserArgs) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.url, linkAgreementInAppBrowserArgs.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, linkAgreementInAppBrowserArgs.source) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantName, linkAgreementInAppBrowserArgs.merchantName);
    }

    public final com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserArgs copy(java.lang.String url, java.lang.String source, java.lang.String merchantName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantName, "");
        return new com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserArgs(url, source, merchantName);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getMerchantName() {
        return this.merchantName;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSource() {
        return this.source;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserArgs copy$default(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserArgs linkAgreementInAppBrowserArgs, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = linkAgreementInAppBrowserArgs.url;
        }
        if ((i & 2) != 0) {
            str2 = linkAgreementInAppBrowserArgs.source;
        }
        if ((i & 4) != 0) {
            str3 = linkAgreementInAppBrowserArgs.merchantName;
        }
        return linkAgreementInAppBrowserArgs.copy(str, str2, str3);
    }
}
