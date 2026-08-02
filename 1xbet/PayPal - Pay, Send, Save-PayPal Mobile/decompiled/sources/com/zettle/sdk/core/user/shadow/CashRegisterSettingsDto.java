package com.zettle.sdk.core.user.shadow;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0013\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bHÇ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\f"}, d2 = {"Lcom/zettle/sdk/core/user/shadow/CashRegisterSettingsDto;", "", "", "seen1", "Lcom/zettle/android/entities/TssOptInOut;", "tss", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILcom/zettle/android/entities/TssOptInOut;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/zettle/android/entities/TssOptInOut;)V", "component1", "()Lcom/zettle/android/entities/TssOptInOut;", "copy", "(Lcom/zettle/android/entities/TssOptInOut;)Lcom/zettle/sdk/core/user/shadow/CashRegisterSettingsDto;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/zettle/sdk/core/user/shadow/CashRegisterSettingsDto;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/zettle/android/entities/TssOptInOut;", "getTss", "getTss$annotations", "()V", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final /* data */ class CashRegisterSettingsDto {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.user.shadow.CashRegisterSettingsDto.Companion INSTANCE = new com.zettle.sdk.core.user.shadow.CashRegisterSettingsDto.Companion(null);
    private final com.zettle.android.entities.TssOptInOut tss;

    @kotlinx.serialization.SerialName("tss")
    public static /* synthetic */ void getTss$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/core/user/shadow/CashRegisterSettingsDto$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/zettle/sdk/core/user/shadow/CashRegisterSettingsDto;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.zettle.sdk.core.user.shadow.CashRegisterSettingsDto> serializer() {
            return com.zettle.sdk.core.user.shadow.CashRegisterSettingsDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ CashRegisterSettingsDto(int i, @kotlinx.serialization.SerialName("tss") com.zettle.android.entities.TssOptInOut tssOptInOut, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tss = null;
        } else {
            this.tss = tssOptInOut;
        }
    }

    public CashRegisterSettingsDto(com.zettle.android.entities.TssOptInOut tssOptInOut) {
        this.tss = tssOptInOut;
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.zettle.sdk.core.user.shadow.CashRegisterSettingsDto self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.tss != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.zettle.android.entities.TssOptInOut", com.zettle.android.entities.TssOptInOut.values()), self.tss);
        }
    }

    public /* synthetic */ CashRegisterSettingsDto(com.zettle.android.entities.TssOptInOut tssOptInOut, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : tssOptInOut);
    }

    public final com.zettle.android.entities.TssOptInOut getTss() {
        return this.tss;
    }

    public final java.lang.String toString() {
        com.zettle.android.entities.TssOptInOut tssOptInOut = this.tss;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CashRegisterSettingsDto(tss=");
        sb.append(tssOptInOut);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.zettle.android.entities.TssOptInOut tssOptInOut = this.tss;
        if (tssOptInOut == null) {
            return 0;
        }
        return tssOptInOut.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.zettle.sdk.core.user.shadow.CashRegisterSettingsDto) && this.tss == ((com.zettle.sdk.core.user.shadow.CashRegisterSettingsDto) other).tss;
    }

    public final com.zettle.sdk.core.user.shadow.CashRegisterSettingsDto copy(com.zettle.android.entities.TssOptInOut tss) {
        return new com.zettle.sdk.core.user.shadow.CashRegisterSettingsDto(tss);
    }

    /* renamed from: component1, reason: from getter */
    public final com.zettle.android.entities.TssOptInOut getTss() {
        return this.tss;
    }

    public static /* synthetic */ com.zettle.sdk.core.user.shadow.CashRegisterSettingsDto copy$default(com.zettle.sdk.core.user.shadow.CashRegisterSettingsDto cashRegisterSettingsDto, com.zettle.android.entities.TssOptInOut tssOptInOut, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            tssOptInOut = cashRegisterSettingsDto.tss;
        }
        return cashRegisterSettingsDto.copy(tssOptInOut);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CashRegisterSettingsDto() {
        this((com.zettle.android.entities.TssOptInOut) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
