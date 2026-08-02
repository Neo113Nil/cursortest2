package com.zettle.sdk.core.user;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B+\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cHÇ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\u0006\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\u0005\u0010\r"}, d2 = {"Lcom/zettle/sdk/core/user/GiftCardSettings;", "", "", "seen1", "", "isEnabled", "isCheckoutEnabled", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(IZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZZ)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/zettle/sdk/core/user/GiftCardSettings;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/zettle/sdk/core/user/GiftCardSettings;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final /* data */ class GiftCardSettings {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.user.GiftCardSettings.Companion INSTANCE = new com.zettle.sdk.core.user.GiftCardSettings.Companion(null);
    private final boolean isCheckoutEnabled;
    private final boolean isEnabled;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/core/user/GiftCardSettings$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/zettle/sdk/core/user/GiftCardSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.zettle.sdk.core.user.GiftCardSettings> serializer() {
            return com.zettle.sdk.core.user.GiftCardSettings$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ GiftCardSettings(int i, boolean z, boolean z2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.zettle.sdk.core.user.GiftCardSettings$$serializer.INSTANCE.getDescriptor());
        }
        this.isEnabled = z;
        this.isCheckoutEnabled = z2;
    }

    public GiftCardSettings(boolean z, boolean z2) {
        this.isEnabled = z;
        this.isCheckoutEnabled = z2;
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.zettle.sdk.core.user.GiftCardSettings self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
        output.encodeBooleanElement(serialDesc, 0, self.isEnabled);
        output.encodeBooleanElement(serialDesc, 1, self.isCheckoutEnabled);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isCheckoutEnabled() {
        return this.isCheckoutEnabled;
    }

    public final java.lang.String toString() {
        boolean z = this.isEnabled;
        boolean z2 = this.isCheckoutEnabled;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GiftCardSettings(isEnabled=");
        sb.append(z);
        sb.append(", isCheckoutEnabled=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z = this.isEnabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        boolean z2 = this.isCheckoutEnabled;
        return (r0 * 31) + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.core.user.GiftCardSettings)) {
            return false;
        }
        com.zettle.sdk.core.user.GiftCardSettings giftCardSettings = (com.zettle.sdk.core.user.GiftCardSettings) other;
        return this.isEnabled == giftCardSettings.isEnabled && this.isCheckoutEnabled == giftCardSettings.isCheckoutEnabled;
    }

    public final com.zettle.sdk.core.user.GiftCardSettings copy(boolean isEnabled, boolean isCheckoutEnabled) {
        return new com.zettle.sdk.core.user.GiftCardSettings(isEnabled, isCheckoutEnabled);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsCheckoutEnabled() {
        return this.isCheckoutEnabled;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public static /* synthetic */ com.zettle.sdk.core.user.GiftCardSettings copy$default(com.zettle.sdk.core.user.GiftCardSettings giftCardSettings, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = giftCardSettings.isEnabled;
        }
        if ((i & 2) != 0) {
            z2 = giftCardSettings.isCheckoutEnabled;
        }
        return giftCardSettings.copy(z, z2);
    }
}
