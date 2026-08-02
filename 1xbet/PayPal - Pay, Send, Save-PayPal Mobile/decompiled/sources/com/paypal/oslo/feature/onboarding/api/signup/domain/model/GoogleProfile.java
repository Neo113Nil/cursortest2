package com.paypal.oslo.feature.onboarding.api.signup.domain.model;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBM\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014JB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010\u0014J'\u0010/\u001a\u00020.2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b3\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b4\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b5\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b6\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/GoogleProfile;", "", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "email", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FirstName;", "firstName", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/LastName;", "lastName", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/ProfileUrl;", "profileUrl", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/GoogleToken;", "googleToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-BvNj-jI", "()Ljava/lang/String;", "component1", "component2-w8YRmDk", "component2", "component3-i7KAUmI", "component3", "component4-C-jiun0", "component4", "component5-7eVPCio", "component5", "copy-GcWgj3I", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/GoogleProfile;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$onboarding_api_prodRelease", "(Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/GoogleProfile;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getEmail-BvNj-jI", "getFirstName-w8YRmDk", "getLastName-i7KAUmI", "getProfileUrl-C-jiun0", "getGoogleToken-7eVPCio", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class GoogleProfile {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleProfile.Companion INSTANCE = new com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleProfile.Companion(null);
    private final java.lang.String email;
    private final java.lang.String firstName;
    private final java.lang.String googleToken;
    private final java.lang.String lastName;
    private final java.lang.String profileUrl;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/GoogleProfile$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/GoogleProfile;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleProfile> serializer() {
            return com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleProfile$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ GoogleProfile(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        if (31 != (i & 31)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 31, com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleProfile$$serializer.INSTANCE.getDescriptor());
        }
        this.email = str;
        this.firstName = str2;
        this.lastName = str3;
        this.profileUrl = str4;
        this.googleToken = str5;
    }

    private GoogleProfile(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        this.email = str;
        this.firstName = str2;
        this.lastName = str3;
        this.profileUrl = str4;
        this.googleToken = str5;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$onboarding_api_prodRelease(com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleProfile self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email$$serializer.INSTANCE, com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15921boximpl(self.email));
        output.encodeSerializableElement(serialDesc, 1, com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName$$serializer.INSTANCE, com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName.m15930boximpl(self.firstName));
        output.encodeSerializableElement(serialDesc, 2, com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName$$serializer.INSTANCE, com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName.m15969boximpl(self.lastName));
        output.encodeSerializableElement(serialDesc, 3, com.paypal.oslo.feature.onboarding.api.signup.domain.model.ProfileUrl$$serializer.INSTANCE, com.paypal.oslo.feature.onboarding.api.signup.domain.model.ProfileUrl.m15987boximpl(self.profileUrl));
        output.encodeSerializableElement(serialDesc, 4, com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleToken$$serializer.INSTANCE, com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleToken.m15951boximpl(self.googleToken));
    }

    /* renamed from: getEmail-BvNj-jI, reason: not valid java name */
    public final java.lang.String m15946getEmailBvNjjI() {
        return this.email;
    }

    /* renamed from: getFirstName-w8YRmDk, reason: not valid java name */
    public final java.lang.String m15947getFirstNamew8YRmDk() {
        return this.firstName;
    }

    /* renamed from: getLastName-i7KAUmI, reason: not valid java name */
    public final java.lang.String m15949getLastNamei7KAUmI() {
        return this.lastName;
    }

    /* renamed from: getProfileUrl-C-jiun0, reason: not valid java name */
    public final java.lang.String m15950getProfileUrlCjiun0() {
        return this.profileUrl;
    }

    /* renamed from: getGoogleToken-7eVPCio, reason: not valid java name */
    public final java.lang.String m15948getGoogleToken7eVPCio() {
        return this.googleToken;
    }

    public final java.lang.String toString() {
        java.lang.String m15926toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15926toStringimpl(this.email);
        java.lang.String m15935toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName.m15935toStringimpl(this.firstName);
        java.lang.String m15974toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName.m15974toStringimpl(this.lastName);
        java.lang.String m15992toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.ProfileUrl.m15992toStringimpl(this.profileUrl);
        java.lang.String m15956toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleToken.m15956toStringimpl(this.googleToken);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GoogleProfile(email=");
        sb.append(m15926toStringimpl);
        sb.append(", firstName=");
        sb.append(m15935toStringimpl);
        sb.append(", lastName=");
        sb.append(m15974toStringimpl);
        sb.append(", profileUrl=");
        sb.append(m15992toStringimpl);
        sb.append(", googleToken=");
        sb.append(m15956toStringimpl);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15925hashCodeimpl(this.email) * 31) + com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName.m15934hashCodeimpl(this.firstName)) * 31) + com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName.m15973hashCodeimpl(this.lastName)) * 31) + com.paypal.oslo.feature.onboarding.api.signup.domain.model.ProfileUrl.m15991hashCodeimpl(this.profileUrl)) * 31) + com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleToken.m15955hashCodeimpl(this.googleToken);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleProfile)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleProfile googleProfile = (com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleProfile) other;
        return com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15924equalsimpl0(this.email, googleProfile.email) && com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName.m15933equalsimpl0(this.firstName, googleProfile.firstName) && com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName.m15972equalsimpl0(this.lastName, googleProfile.lastName) && com.paypal.oslo.feature.onboarding.api.signup.domain.model.ProfileUrl.m15990equalsimpl0(this.profileUrl, googleProfile.profileUrl) && com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleToken.m15954equalsimpl0(this.googleToken, googleProfile.googleToken);
    }

    /* renamed from: copy-GcWgj3I, reason: not valid java name */
    public final com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleProfile m15945copyGcWgj3I(java.lang.String email, java.lang.String firstName, java.lang.String lastName, java.lang.String profileUrl, java.lang.String googleToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleToken, "");
        return new com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleProfile(email, firstName, lastName, profileUrl, googleToken, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: component5-7eVPCio, reason: not valid java name and from getter */
    public final java.lang.String getGoogleToken() {
        return this.googleToken;
    }

    /* renamed from: component4-C-jiun0, reason: not valid java name and from getter */
    public final java.lang.String getProfileUrl() {
        return this.profileUrl;
    }

    /* renamed from: component3-i7KAUmI, reason: not valid java name and from getter */
    public final java.lang.String getLastName() {
        return this.lastName;
    }

    /* renamed from: component2-w8YRmDk, reason: not valid java name and from getter */
    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component1-BvNj-jI, reason: not valid java name and from getter */
    public final java.lang.String getEmail() {
        return this.email;
    }

    /* renamed from: copy-GcWgj3I$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleProfile m15939copyGcWgj3I$default(com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleProfile googleProfile, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = googleProfile.email;
        }
        if ((i & 2) != 0) {
            str2 = googleProfile.firstName;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = googleProfile.lastName;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = googleProfile.profileUrl;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = googleProfile.googleToken;
        }
        return googleProfile.m15945copyGcWgj3I(str, str6, str7, str8, str5);
    }

    public /* synthetic */ GoogleProfile(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5);
    }

    public /* synthetic */ GoogleProfile(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, str4, str5);
    }
}
