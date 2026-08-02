package com.paypal.oslo.feature.userprofile.api.navigation;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/navigation/SetPrimaryEmailDestination;", "Lcom/paypal/oslo/feature/userprofile/api/navigation/EmailBottomSheetDestination;", "", "emailId", "", "confirm", "<init>", "(Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/userprofile/api/navigation/SetPrimaryEmailDestination;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$user_profile_api_prodRelease", "(Lcom/paypal/oslo/feature/userprofile/api/navigation/SetPrimaryEmailDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getEmailId", "Z", "getConfirm", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class SetPrimaryEmailDestination implements com.paypal.oslo.feature.userprofile.api.navigation.EmailBottomSheetDestination {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.userprofile.api.navigation.SetPrimaryEmailDestination.Companion INSTANCE = new com.paypal.oslo.feature.userprofile.api.navigation.SetPrimaryEmailDestination.Companion(null);
    private final boolean confirm;
    private final java.lang.String emailId;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/navigation/SetPrimaryEmailDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/userprofile/api/navigation/SetPrimaryEmailDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.userprofile.api.navigation.SetPrimaryEmailDestination> serializer() {
            return com.paypal.oslo.feature.userprofile.api.navigation.SetPrimaryEmailDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SetPrimaryEmailDestination(int i, java.lang.String str, boolean z, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.userprofile.api.navigation.SetPrimaryEmailDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.emailId = str;
        if ((i & 2) == 0) {
            this.confirm = false;
        } else {
            this.confirm = z;
        }
    }

    public SetPrimaryEmailDestination(java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.emailId = str;
        this.confirm = z;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$user_profile_api_prodRelease(com.paypal.oslo.feature.userprofile.api.navigation.SetPrimaryEmailDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.emailId);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.confirm) {
            output.encodeBooleanElement(serialDesc, 1, self.confirm);
        }
    }

    public /* synthetic */ SetPrimaryEmailDestination(java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }

    public final java.lang.String getEmailId() {
        return this.emailId;
    }

    public final boolean getConfirm() {
        return this.confirm;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.emailId;
        boolean z = this.confirm;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SetPrimaryEmailDestination(emailId=");
        sb.append(str);
        sb.append(", confirm=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.emailId.hashCode() * 31) + java.lang.Boolean.hashCode(this.confirm);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.userprofile.api.navigation.SetPrimaryEmailDestination)) {
            return false;
        }
        com.paypal.oslo.feature.userprofile.api.navigation.SetPrimaryEmailDestination setPrimaryEmailDestination = (com.paypal.oslo.feature.userprofile.api.navigation.SetPrimaryEmailDestination) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.emailId, setPrimaryEmailDestination.emailId) && this.confirm == setPrimaryEmailDestination.confirm;
    }

    public final com.paypal.oslo.feature.userprofile.api.navigation.SetPrimaryEmailDestination copy(java.lang.String emailId, boolean confirm) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailId, "");
        return new com.paypal.oslo.feature.userprofile.api.navigation.SetPrimaryEmailDestination(emailId, confirm);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getConfirm() {
        return this.confirm;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getEmailId() {
        return this.emailId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.userprofile.api.navigation.SetPrimaryEmailDestination copy$default(com.paypal.oslo.feature.userprofile.api.navigation.SetPrimaryEmailDestination setPrimaryEmailDestination, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = setPrimaryEmailDestination.emailId;
        }
        if ((i & 2) != 0) {
            z = setPrimaryEmailDestination.confirm;
        }
        return setPrimaryEmailDestination.copy(str, z);
    }
}
