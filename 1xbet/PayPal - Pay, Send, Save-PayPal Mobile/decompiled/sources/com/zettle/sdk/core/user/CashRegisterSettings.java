package com.zettle.sdk.core.user;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bHÇ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\f"}, d2 = {"Lcom/zettle/sdk/core/user/CashRegisterSettings;", "", "", "seen1", "Lcom/zettle/sdk/core/user/TssOptInOut;", "tss", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILcom/zettle/sdk/core/user/TssOptInOut;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/zettle/sdk/core/user/TssOptInOut;)V", "component1", "()Lcom/zettle/sdk/core/user/TssOptInOut;", "copy", "(Lcom/zettle/sdk/core/user/TssOptInOut;)Lcom/zettle/sdk/core/user/CashRegisterSettings;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/zettle/sdk/core/user/CashRegisterSettings;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/zettle/sdk/core/user/TssOptInOut;", "getTss", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final /* data */ class CashRegisterSettings {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.user.CashRegisterSettings.Companion INSTANCE = new com.zettle.sdk.core.user.CashRegisterSettings.Companion(null);
    private final com.zettle.sdk.core.user.TssOptInOut tss;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/core/user/CashRegisterSettings$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/zettle/sdk/core/user/CashRegisterSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.zettle.sdk.core.user.CashRegisterSettings> serializer() {
            return com.zettle.sdk.core.user.CashRegisterSettings$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ CashRegisterSettings(int i, com.zettle.sdk.core.user.TssOptInOut tssOptInOut, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.zettle.sdk.core.user.CashRegisterSettings$$serializer.INSTANCE.getDescriptor());
        }
        this.tss = tssOptInOut;
    }

    public CashRegisterSettings(com.zettle.sdk.core.user.TssOptInOut tssOptInOut) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tssOptInOut, "");
        this.tss = tssOptInOut;
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.zettle.sdk.core.user.CashRegisterSettings self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
        output.encodeSerializableElement(serialDesc, 0, com.zettle.sdk.core.user.TssOptInOut.INSTANCE.serializer(), self.tss);
    }

    public final com.zettle.sdk.core.user.TssOptInOut getTss() {
        return this.tss;
    }

    public final java.lang.String toString() {
        com.zettle.sdk.core.user.TssOptInOut tssOptInOut = this.tss;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CashRegisterSettings(tss=");
        sb.append(tssOptInOut);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.tss.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.zettle.sdk.core.user.CashRegisterSettings) && this.tss == ((com.zettle.sdk.core.user.CashRegisterSettings) other).tss;
    }

    public final com.zettle.sdk.core.user.CashRegisterSettings copy(com.zettle.sdk.core.user.TssOptInOut tss) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tss, "");
        return new com.zettle.sdk.core.user.CashRegisterSettings(tss);
    }

    /* renamed from: component1, reason: from getter */
    public final com.zettle.sdk.core.user.TssOptInOut getTss() {
        return this.tss;
    }

    public static /* synthetic */ com.zettle.sdk.core.user.CashRegisterSettings copy$default(com.zettle.sdk.core.user.CashRegisterSettings cashRegisterSettings, com.zettle.sdk.core.user.TssOptInOut tssOptInOut, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            tssOptInOut = cashRegisterSettings.tss;
        }
        return cashRegisterSettings.copy(tssOptInOut);
    }
}
