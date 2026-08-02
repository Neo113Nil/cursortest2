package com.paypal.oslo.feature.identity.accountswitch.domain.model;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017JN\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0012J'\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b\b\u0010\u0017R\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b\t\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/UserAccount;", "", "", "partyId", "fullName", androidx.autofill.HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "profilePicture", "", "isBusinessProfile", "isActive", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Z", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/UserAccount;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_prodRelease", "(Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/UserAccount;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getPartyId", "getFullName", "getEmailAddress", "getProfilePicture", "Z", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class UserAccount {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount.Companion INSTANCE = new com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount.Companion(null);
    private final java.lang.String emailAddress;
    private final java.lang.String fullName;
    private final boolean isActive;
    private final boolean isBusinessProfile;
    private final java.lang.String partyId;
    private final java.lang.String profilePicture;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/UserAccount$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/UserAccount;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount> serializer() {
            return com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ UserAccount(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 63, com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount$$serializer.INSTANCE.getDescriptor());
        }
        this.partyId = str;
        this.fullName = str2;
        this.emailAddress = str3;
        this.profilePicture = str4;
        this.isBusinessProfile = z;
        this.isActive = z2;
    }

    public UserAccount(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.partyId = str;
        this.fullName = str2;
        this.emailAddress = str3;
        this.profilePicture = str4;
        this.isBusinessProfile = z;
        this.isActive = z2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$identity_prodRelease(com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.partyId);
        output.encodeStringElement(serialDesc, 1, self.fullName);
        output.encodeStringElement(serialDesc, 2, self.emailAddress);
        output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.profilePicture);
        output.encodeBooleanElement(serialDesc, 4, self.isBusinessProfile);
        output.encodeBooleanElement(serialDesc, 5, self.isActive);
    }

    public final java.lang.String getPartyId() {
        return this.partyId;
    }

    public final java.lang.String getFullName() {
        return this.fullName;
    }

    public final java.lang.String getEmailAddress() {
        return this.emailAddress;
    }

    public final java.lang.String getProfilePicture() {
        return this.profilePicture;
    }

    public final boolean isBusinessProfile() {
        return this.isBusinessProfile;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.partyId;
        java.lang.String str2 = this.fullName;
        java.lang.String str3 = this.emailAddress;
        java.lang.String str4 = this.profilePicture;
        boolean z = this.isBusinessProfile;
        boolean z2 = this.isActive;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserAccount(partyId=");
        sb.append(str);
        sb.append(", fullName=");
        sb.append(str2);
        sb.append(", emailAddress=");
        sb.append(str3);
        sb.append(", profilePicture=");
        sb.append(str4);
        sb.append(", isBusinessProfile=");
        sb.append(z);
        sb.append(", isActive=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.partyId.hashCode();
        int hashCode2 = this.fullName.hashCode();
        int hashCode3 = this.emailAddress.hashCode();
        java.lang.String str = this.profilePicture;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.isBusinessProfile)) * 31) + java.lang.Boolean.hashCode(this.isActive);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount)) {
            return false;
        }
        com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount userAccount = (com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.partyId, userAccount.partyId) && kotlin.jvm.internal.Intrinsics.areEqual(this.fullName, userAccount.fullName) && kotlin.jvm.internal.Intrinsics.areEqual(this.emailAddress, userAccount.emailAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.profilePicture, userAccount.profilePicture) && this.isBusinessProfile == userAccount.isBusinessProfile && this.isActive == userAccount.isActive;
    }

    public final com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount copy(java.lang.String partyId, java.lang.String fullName, java.lang.String emailAddress, java.lang.String profilePicture, boolean isBusinessProfile, boolean isActive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partyId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailAddress, "");
        return new com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount(partyId, fullName, emailAddress, profilePicture, isBusinessProfile, isActive);
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsBusinessProfile() {
        return this.isBusinessProfile;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getProfilePicture() {
        return this.profilePicture;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getEmailAddress() {
        return this.emailAddress;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFullName() {
        return this.fullName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPartyId() {
        return this.partyId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount copy$default(com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount userAccount, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = userAccount.partyId;
        }
        if ((i & 2) != 0) {
            str2 = userAccount.fullName;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = userAccount.emailAddress;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = userAccount.profilePicture;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            z = userAccount.isBusinessProfile;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = userAccount.isActive;
        }
        return userAccount.copy(str, str5, str6, str7, z3, z2);
    }
}
