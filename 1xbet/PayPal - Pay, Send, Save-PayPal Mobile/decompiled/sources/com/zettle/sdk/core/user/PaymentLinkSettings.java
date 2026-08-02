package com.zettle.sdk.core.user;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B5\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0012J(\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eHÇ\u0001¢\u0006\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b\u0006\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b\u0005\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/core/user/PaymentLinkSettings;", "", "", "seen1", "", "isEnabled", "isCheckoutEnabled", "", "eopStatus", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(IZZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZZLjava/lang/String;)V", "component1", "()Z", "component2", "component3", "()Ljava/lang/String;", "copy", "(ZZLjava/lang/String;)Lcom/zettle/sdk/core/user/PaymentLinkSettings;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/zettle/sdk/core/user/PaymentLinkSettings;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getEopStatus", "Z", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final /* data */ class PaymentLinkSettings {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.user.PaymentLinkSettings.Companion INSTANCE = new com.zettle.sdk.core.user.PaymentLinkSettings.Companion(null);
    private final java.lang.String eopStatus;
    private final boolean isCheckoutEnabled;
    private final boolean isEnabled;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/core/user/PaymentLinkSettings$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/zettle/sdk/core/user/PaymentLinkSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.zettle.sdk.core.user.PaymentLinkSettings> serializer() {
            return com.zettle.sdk.core.user.PaymentLinkSettings$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PaymentLinkSettings(int i, boolean z, boolean z2, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.zettle.sdk.core.user.PaymentLinkSettings$$serializer.INSTANCE.getDescriptor());
        }
        this.isEnabled = z;
        this.isCheckoutEnabled = z2;
        this.eopStatus = str;
    }

    public PaymentLinkSettings(boolean z, boolean z2, java.lang.String str) {
        this.isEnabled = z;
        this.isCheckoutEnabled = z2;
        this.eopStatus = str;
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.zettle.sdk.core.user.PaymentLinkSettings self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
        output.encodeBooleanElement(serialDesc, 0, self.isEnabled);
        output.encodeBooleanElement(serialDesc, 1, self.isCheckoutEnabled);
        output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.eopStatus);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isCheckoutEnabled() {
        return this.isCheckoutEnabled;
    }

    public final java.lang.String getEopStatus() {
        return this.eopStatus;
    }

    public final java.lang.String toString() {
        boolean z = this.isEnabled;
        boolean z2 = this.isCheckoutEnabled;
        java.lang.String str = this.eopStatus;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentLinkSettings(isEnabled=");
        sb.append(z);
        sb.append(", isCheckoutEnabled=");
        sb.append(z2);
        sb.append(", eopStatus=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.isEnabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        boolean z2 = this.isCheckoutEnabled;
        int i = z2 ? 1 : z2 ? 1 : 0;
        java.lang.String str = this.eopStatus;
        return (((r0 * 31) + i) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.core.user.PaymentLinkSettings)) {
            return false;
        }
        com.zettle.sdk.core.user.PaymentLinkSettings paymentLinkSettings = (com.zettle.sdk.core.user.PaymentLinkSettings) other;
        return this.isEnabled == paymentLinkSettings.isEnabled && this.isCheckoutEnabled == paymentLinkSettings.isCheckoutEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.eopStatus, paymentLinkSettings.eopStatus);
    }

    public final com.zettle.sdk.core.user.PaymentLinkSettings copy(boolean isEnabled, boolean isCheckoutEnabled, java.lang.String eopStatus) {
        return new com.zettle.sdk.core.user.PaymentLinkSettings(isEnabled, isCheckoutEnabled, eopStatus);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getEopStatus() {
        return this.eopStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsCheckoutEnabled() {
        return this.isCheckoutEnabled;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public static /* synthetic */ com.zettle.sdk.core.user.PaymentLinkSettings copy$default(com.zettle.sdk.core.user.PaymentLinkSettings paymentLinkSettings, boolean z, boolean z2, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = paymentLinkSettings.isEnabled;
        }
        if ((i & 2) != 0) {
            z2 = paymentLinkSettings.isCheckoutEnabled;
        }
        if ((i & 4) != 0) {
            str = paymentLinkSettings.eopStatus;
        }
        return paymentLinkSettings.copy(z, z2, str);
    }
}
