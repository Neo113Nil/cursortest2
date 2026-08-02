package com.paypal.oslo.feature.identity.shared.domain.model.challenge;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nBG\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014JB\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J'\u0010%\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b\u0007\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b\b\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/EmailAddress;", "", "", "id", "maskedEmail", "", "notified", "isVerified", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZZ)Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/EmailAddress;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_prodRelease", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/EmailAddress;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", "getMaskedEmail", "Z", "getNotified", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class EmailAddress {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress.Companion INSTANCE = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress.Companion(null);
    private final java.lang.String id;
    private final boolean isSelected;
    private final boolean isVerified;
    private final java.lang.String maskedEmail;
    private final boolean notified;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/EmailAddress$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/EmailAddress;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress> serializer() {
            return com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ EmailAddress(int i, java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.maskedEmail = str2;
        if ((i & 4) == 0) {
            this.notified = false;
        } else {
            this.notified = z;
        }
        if ((i & 8) == 0) {
            this.isVerified = true;
        } else {
            this.isVerified = z2;
        }
        if ((i & 16) == 0) {
            this.isSelected = false;
        } else {
            this.isSelected = z3;
        }
    }

    public EmailAddress(java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.maskedEmail = str2;
        this.notified = z;
        this.isVerified = z2;
        this.isSelected = z3;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$identity_prodRelease(com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.maskedEmail);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.notified) {
            output.encodeBooleanElement(serialDesc, 2, self.notified);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !self.isVerified) {
            output.encodeBooleanElement(serialDesc, 3, self.isVerified);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.isSelected) {
            output.encodeBooleanElement(serialDesc, 4, self.isSelected);
        }
    }

    public /* synthetic */ EmailAddress(java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? false : z3);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getMaskedEmail() {
        return this.maskedEmail;
    }

    public final boolean getNotified() {
        return this.notified;
    }

    public final boolean isVerified() {
        return this.isVerified;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.maskedEmail;
        boolean z = this.notified;
        boolean z2 = this.isVerified;
        boolean z3 = this.isSelected;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EmailAddress(id=");
        sb.append(str);
        sb.append(", maskedEmail=");
        sb.append(str2);
        sb.append(", notified=");
        sb.append(z);
        sb.append(", isVerified=");
        sb.append(z2);
        sb.append(", isSelected=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.maskedEmail.hashCode()) * 31) + java.lang.Boolean.hashCode(this.notified)) * 31) + java.lang.Boolean.hashCode(this.isVerified)) * 31) + java.lang.Boolean.hashCode(this.isSelected);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress)) {
            return false;
        }
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress emailAddress = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, emailAddress.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.maskedEmail, emailAddress.maskedEmail) && this.notified == emailAddress.notified && this.isVerified == emailAddress.isVerified && this.isSelected == emailAddress.isSelected;
    }

    public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress copy(java.lang.String id, java.lang.String maskedEmail, boolean notified, boolean isVerified, boolean isSelected) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maskedEmail, "");
        return new com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress(id, maskedEmail, notified, isVerified, isSelected);
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsVerified() {
        return this.isVerified;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getNotified() {
        return this.notified;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMaskedEmail() {
        return this.maskedEmail;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress copy$default(com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress emailAddress, java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = emailAddress.id;
        }
        if ((i & 2) != 0) {
            str2 = emailAddress.maskedEmail;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            z = emailAddress.notified;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = emailAddress.isVerified;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = emailAddress.isSelected;
        }
        return emailAddress.copy(str, str3, z4, z5, z3);
    }
}
