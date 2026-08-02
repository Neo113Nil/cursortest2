package com.paypal.oslo.feature.p2p.ui.success.state;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b\u0006\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/success/state/UiPaymentLink;", "", "", "url", "expirationTime", "", "isSent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/p2p/ui/success/state/UiPaymentLink;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$p2p_prodRelease", "(Lcom/paypal/oslo/feature/p2p/ui/success/state/UiPaymentLink;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getUrl", "getExpirationTime", "Z", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class UiPaymentLink {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.p2p.ui.success.state.UiPaymentLink.Companion INSTANCE = new com.paypal.oslo.feature.p2p.ui.success.state.UiPaymentLink.Companion(null);
    private final java.lang.String expirationTime;
    private final boolean isSent;
    private final java.lang.String url;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/success/state/UiPaymentLink$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/p2p/ui/success/state/UiPaymentLink;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.p2p.ui.success.state.UiPaymentLink> serializer() {
            return com.paypal.oslo.feature.p2p.ui.success.state.UiPaymentLink$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ UiPaymentLink(int i, java.lang.String str, java.lang.String str2, boolean z, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.p2p.ui.success.state.UiPaymentLink$$serializer.INSTANCE.getDescriptor());
        }
        this.url = str;
        this.expirationTime = str2;
        if ((i & 4) == 0) {
            this.isSent = false;
        } else {
            this.isSent = z;
        }
    }

    public UiPaymentLink(java.lang.String str, java.lang.String str2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.url = str;
        this.expirationTime = str2;
        this.isSent = z;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$p2p_prodRelease(com.paypal.oslo.feature.p2p.ui.success.state.UiPaymentLink self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.url);
        output.encodeStringElement(serialDesc, 1, self.expirationTime);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.isSent) {
            output.encodeBooleanElement(serialDesc, 2, self.isSent);
        }
    }

    public /* synthetic */ UiPaymentLink(java.lang.String str, java.lang.String str2, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z);
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final java.lang.String getExpirationTime() {
        return this.expirationTime;
    }

    public final boolean isSent() {
        return this.isSent;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.url;
        java.lang.String str2 = this.expirationTime;
        boolean z = this.isSent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UiPaymentLink(url=");
        sb.append(str);
        sb.append(", expirationTime=");
        sb.append(str2);
        sb.append(", isSent=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.url;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.expirationTime.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isSent);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.ui.success.state.UiPaymentLink)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.ui.success.state.UiPaymentLink uiPaymentLink = (com.paypal.oslo.feature.p2p.ui.success.state.UiPaymentLink) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.url, uiPaymentLink.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.expirationTime, uiPaymentLink.expirationTime) && this.isSent == uiPaymentLink.isSent;
    }

    public final com.paypal.oslo.feature.p2p.ui.success.state.UiPaymentLink copy(java.lang.String url, java.lang.String expirationTime, boolean isSent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expirationTime, "");
        return new com.paypal.oslo.feature.p2p.ui.success.state.UiPaymentLink(url, expirationTime, isSent);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSent() {
        return this.isSent;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getExpirationTime() {
        return this.expirationTime;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.success.state.UiPaymentLink copy$default(com.paypal.oslo.feature.p2p.ui.success.state.UiPaymentLink uiPaymentLink, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = uiPaymentLink.url;
        }
        if ((i & 2) != 0) {
            str2 = uiPaymentLink.expirationTime;
        }
        if ((i & 4) != 0) {
            z = uiPaymentLink.isSent;
        }
        return uiPaymentLink.copy(str, str2, z);
    }
}
