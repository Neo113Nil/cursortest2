package com.zettle.sdk.core.user;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B3\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eHÇ\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b\u0007\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b\u0005\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/core/user/PayPalQrcSettings;", "", "", "seen1", "", "isEnabled", "isCheckoutEnabled", "isActivated", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(IZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZZZ)V", "component1", "()Z", "component2", "component3", "copy", "(ZZZ)Lcom/zettle/sdk/core/user/PayPalQrcSettings;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/zettle/sdk/core/user/PayPalQrcSettings;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final /* data */ class PayPalQrcSettings {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.user.PayPalQrcSettings.Companion INSTANCE = new com.zettle.sdk.core.user.PayPalQrcSettings.Companion(null);
    private final boolean isActivated;
    private final boolean isCheckoutEnabled;
    private final boolean isEnabled;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/core/user/PayPalQrcSettings$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/zettle/sdk/core/user/PayPalQrcSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.zettle.sdk.core.user.PayPalQrcSettings> serializer() {
            return com.zettle.sdk.core.user.PayPalQrcSettings$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PayPalQrcSettings(int i, boolean z, boolean z2, boolean z3, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.zettle.sdk.core.user.PayPalQrcSettings$$serializer.INSTANCE.getDescriptor());
        }
        this.isEnabled = z;
        this.isCheckoutEnabled = z2;
        this.isActivated = z3;
    }

    public PayPalQrcSettings(boolean z, boolean z2, boolean z3) {
        this.isEnabled = z;
        this.isCheckoutEnabled = z2;
        this.isActivated = z3;
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.zettle.sdk.core.user.PayPalQrcSettings self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
        output.encodeBooleanElement(serialDesc, 0, self.isEnabled);
        output.encodeBooleanElement(serialDesc, 1, self.isCheckoutEnabled);
        output.encodeBooleanElement(serialDesc, 2, self.isActivated);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isCheckoutEnabled() {
        return this.isCheckoutEnabled;
    }

    public final boolean isActivated() {
        return this.isActivated;
    }

    public final java.lang.String toString() {
        boolean z = this.isEnabled;
        boolean z2 = this.isCheckoutEnabled;
        boolean z3 = this.isActivated;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PayPalQrcSettings(isEnabled=");
        sb.append(z);
        sb.append(", isCheckoutEnabled=");
        sb.append(z2);
        sb.append(", isActivated=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public final int hashCode() {
        boolean z = this.isEnabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        ?? r2 = this.isCheckoutEnabled;
        int i = r2;
        if (r2 != 0) {
            i = 1;
        }
        boolean z2 = this.isActivated;
        return (((r0 * 31) + i) * 31) + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.core.user.PayPalQrcSettings)) {
            return false;
        }
        com.zettle.sdk.core.user.PayPalQrcSettings payPalQrcSettings = (com.zettle.sdk.core.user.PayPalQrcSettings) other;
        return this.isEnabled == payPalQrcSettings.isEnabled && this.isCheckoutEnabled == payPalQrcSettings.isCheckoutEnabled && this.isActivated == payPalQrcSettings.isActivated;
    }

    public final com.zettle.sdk.core.user.PayPalQrcSettings copy(boolean isEnabled, boolean isCheckoutEnabled, boolean isActivated) {
        return new com.zettle.sdk.core.user.PayPalQrcSettings(isEnabled, isCheckoutEnabled, isActivated);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsActivated() {
        return this.isActivated;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsCheckoutEnabled() {
        return this.isCheckoutEnabled;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public static /* synthetic */ com.zettle.sdk.core.user.PayPalQrcSettings copy$default(com.zettle.sdk.core.user.PayPalQrcSettings payPalQrcSettings, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = payPalQrcSettings.isEnabled;
        }
        if ((i & 2) != 0) {
            z2 = payPalQrcSettings.isCheckoutEnabled;
        }
        if ((i & 4) != 0) {
            z3 = payPalQrcSettings.isActivated;
        }
        return payPalQrcSettings.copy(z, z2, z3);
    }
}
