package com.zettle.sdk.core.user.shadow;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bHÇ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\f"}, d2 = {"Lcom/zettle/sdk/core/user/shadow/CashRegisterTssDto;", "", "", "seen1", "Lcom/zettle/android/entities/TssVersion;", "version", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILcom/zettle/android/entities/TssVersion;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/zettle/android/entities/TssVersion;)V", "component1", "()Lcom/zettle/android/entities/TssVersion;", "copy", "(Lcom/zettle/android/entities/TssVersion;)Lcom/zettle/sdk/core/user/shadow/CashRegisterTssDto;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/zettle/sdk/core/user/shadow/CashRegisterTssDto;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/zettle/android/entities/TssVersion;", "getVersion", "getVersion$annotations", "()V", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final /* data */ class CashRegisterTssDto {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.user.shadow.CashRegisterTssDto.Companion INSTANCE = new com.zettle.sdk.core.user.shadow.CashRegisterTssDto.Companion(null);
    private final com.zettle.android.entities.TssVersion version;

    @kotlinx.serialization.SerialName("version")
    public static /* synthetic */ void getVersion$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/core/user/shadow/CashRegisterTssDto$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/zettle/sdk/core/user/shadow/CashRegisterTssDto;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.zettle.sdk.core.user.shadow.CashRegisterTssDto> serializer() {
            return com.zettle.sdk.core.user.shadow.CashRegisterTssDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ CashRegisterTssDto(int i, @kotlinx.serialization.SerialName("version") com.zettle.android.entities.TssVersion tssVersion, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.zettle.sdk.core.user.shadow.CashRegisterTssDto$$serializer.INSTANCE.getDescriptor());
        }
        this.version = tssVersion;
    }

    public CashRegisterTssDto(com.zettle.android.entities.TssVersion tssVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tssVersion, "");
        this.version = tssVersion;
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.zettle.sdk.core.user.shadow.CashRegisterTssDto self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
        output.encodeSerializableElement(serialDesc, 0, kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.zettle.android.entities.TssVersion", com.zettle.android.entities.TssVersion.values()), self.version);
    }

    public final com.zettle.android.entities.TssVersion getVersion() {
        return this.version;
    }

    public final java.lang.String toString() {
        com.zettle.android.entities.TssVersion tssVersion = this.version;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CashRegisterTssDto(version=");
        sb.append(tssVersion);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.version.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.zettle.sdk.core.user.shadow.CashRegisterTssDto) && this.version == ((com.zettle.sdk.core.user.shadow.CashRegisterTssDto) other).version;
    }

    public final com.zettle.sdk.core.user.shadow.CashRegisterTssDto copy(com.zettle.android.entities.TssVersion version) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
        return new com.zettle.sdk.core.user.shadow.CashRegisterTssDto(version);
    }

    /* renamed from: component1, reason: from getter */
    public final com.zettle.android.entities.TssVersion getVersion() {
        return this.version;
    }

    public static /* synthetic */ com.zettle.sdk.core.user.shadow.CashRegisterTssDto copy$default(com.zettle.sdk.core.user.shadow.CashRegisterTssDto cashRegisterTssDto, com.zettle.android.entities.TssVersion tssVersion, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            tssVersion = cashRegisterTssDto.version;
        }
        return cashRegisterTssDto.copy(tssVersion);
    }
}
