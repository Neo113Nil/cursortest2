package com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ViewPinArgs;", "", "", "pin", "", "hasPhysicalCard", "<init>", "(Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ViewPinArgs;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ViewPinArgs;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getPin", "Z", "getHasPhysicalCard", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class ViewPinArgs {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ViewPinArgs.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ViewPinArgs.Companion(null);
    private final boolean hasPhysicalCard;
    private final java.lang.String pin;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ViewPinArgs$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ViewPinArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ViewPinArgs> serializer() {
            return com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ViewPinArgs$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ViewPinArgs(int i, java.lang.String str, boolean z, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ViewPinArgs$$serializer.INSTANCE.getDescriptor());
        }
        this.pin = str;
        this.hasPhysicalCard = z;
    }

    public ViewPinArgs(java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.pin = str;
        this.hasPhysicalCard = z;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ViewPinArgs self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.pin);
        output.encodeBooleanElement(serialDesc, 1, self.hasPhysicalCard);
    }

    public final boolean getHasPhysicalCard() {
        return this.hasPhysicalCard;
    }

    public final java.lang.String getPin() {
        return this.pin;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.pin;
        boolean z = this.hasPhysicalCard;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ViewPinArgs(pin=");
        sb.append(str);
        sb.append(", hasPhysicalCard=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.pin.hashCode() * 31) + java.lang.Boolean.hashCode(this.hasPhysicalCard);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ViewPinArgs)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ViewPinArgs viewPinArgs = (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ViewPinArgs) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.pin, viewPinArgs.pin) && this.hasPhysicalCard == viewPinArgs.hasPhysicalCard;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ViewPinArgs copy(java.lang.String pin, boolean hasPhysicalCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pin, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ViewPinArgs(pin, hasPhysicalCard);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasPhysicalCard() {
        return this.hasPhysicalCard;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPin() {
        return this.pin;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ViewPinArgs copy$default(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ViewPinArgs viewPinArgs, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = viewPinArgs.pin;
        }
        if ((i & 2) != 0) {
            z = viewPinArgs.hasPhysicalCard;
        }
        return viewPinArgs.copy(str, z);
    }
}
