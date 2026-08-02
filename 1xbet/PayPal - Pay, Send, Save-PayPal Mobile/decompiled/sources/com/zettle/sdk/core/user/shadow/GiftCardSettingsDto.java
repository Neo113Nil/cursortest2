package com.zettle.sdk.core.user.shadow;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B3\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB\u001f\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cHÇ\u0001¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010!\u0012\u0004\b\"\u0010#\u001a\u0004\b\u0006\u0010\rR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010!\u0012\u0004\b$\u0010#\u001a\u0004\b\u0005\u0010\r"}, d2 = {"Lcom/zettle/sdk/core/user/shadow/GiftCardSettingsDto;", "", "", "seen1", "", "isEnabled", "isCheckoutEnabled", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/zettle/sdk/core/user/shadow/GiftCardSettingsDto;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/zettle/sdk/core/user/shadow/GiftCardSettingsDto;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/Boolean;", "isCheckoutEnabled$annotations", "()V", "isEnabled$annotations", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final /* data */ class GiftCardSettingsDto {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.user.shadow.GiftCardSettingsDto.Companion INSTANCE = new com.zettle.sdk.core.user.shadow.GiftCardSettingsDto.Companion(null);
    private final java.lang.Boolean isCheckoutEnabled;
    private final java.lang.Boolean isEnabled;

    @kotlinx.serialization.SerialName("checkoutEnabled")
    public static /* synthetic */ void isCheckoutEnabled$annotations() {
    }

    @kotlinx.serialization.SerialName("enabled")
    public static /* synthetic */ void isEnabled$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/core/user/shadow/GiftCardSettingsDto$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/zettle/sdk/core/user/shadow/GiftCardSettingsDto;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.zettle.sdk.core.user.shadow.GiftCardSettingsDto> serializer() {
            return com.zettle.sdk.core.user.shadow.GiftCardSettingsDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ GiftCardSettingsDto(int i, @kotlinx.serialization.SerialName("enabled") java.lang.Boolean bool, @kotlinx.serialization.SerialName("checkoutEnabled") java.lang.Boolean bool2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.isEnabled = null;
        } else {
            this.isEnabled = bool;
        }
        if ((i & 2) == 0) {
            this.isCheckoutEnabled = null;
        } else {
            this.isCheckoutEnabled = bool2;
        }
    }

    public GiftCardSettingsDto(java.lang.Boolean bool, java.lang.Boolean bool2) {
        this.isEnabled = bool;
        this.isCheckoutEnabled = bool2;
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.zettle.sdk.core.user.shadow.GiftCardSettingsDto self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.isEnabled != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.isEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.isCheckoutEnabled != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.isCheckoutEnabled);
        }
    }

    public /* synthetic */ GiftCardSettingsDto(java.lang.Boolean bool, java.lang.Boolean bool2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
    }

    public final java.lang.Boolean isEnabled() {
        return this.isEnabled;
    }

    public final java.lang.Boolean isCheckoutEnabled() {
        return this.isCheckoutEnabled;
    }

    public final java.lang.String toString() {
        java.lang.Boolean bool = this.isEnabled;
        java.lang.Boolean bool2 = this.isCheckoutEnabled;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GiftCardSettingsDto(isEnabled=");
        sb.append(bool);
        sb.append(", isCheckoutEnabled=");
        sb.append(bool2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Boolean bool = this.isEnabled;
        int hashCode = bool == null ? 0 : bool.hashCode();
        java.lang.Boolean bool2 = this.isCheckoutEnabled;
        return (hashCode * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.core.user.shadow.GiftCardSettingsDto)) {
            return false;
        }
        com.zettle.sdk.core.user.shadow.GiftCardSettingsDto giftCardSettingsDto = (com.zettle.sdk.core.user.shadow.GiftCardSettingsDto) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.isEnabled, giftCardSettingsDto.isEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.isCheckoutEnabled, giftCardSettingsDto.isCheckoutEnabled);
    }

    public final com.zettle.sdk.core.user.shadow.GiftCardSettingsDto copy(java.lang.Boolean isEnabled, java.lang.Boolean isCheckoutEnabled) {
        return new com.zettle.sdk.core.user.shadow.GiftCardSettingsDto(isEnabled, isCheckoutEnabled);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Boolean getIsCheckoutEnabled() {
        return this.isCheckoutEnabled;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Boolean getIsEnabled() {
        return this.isEnabled;
    }

    public static /* synthetic */ com.zettle.sdk.core.user.shadow.GiftCardSettingsDto copy$default(com.zettle.sdk.core.user.shadow.GiftCardSettingsDto giftCardSettingsDto, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = giftCardSettingsDto.isEnabled;
        }
        if ((i & 2) != 0) {
            bool2 = giftCardSettingsDto.isCheckoutEnabled;
        }
        return giftCardSettingsDto.copy(bool, bool2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GiftCardSettingsDto() {
        this((java.lang.Boolean) null, (java.lang.Boolean) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
