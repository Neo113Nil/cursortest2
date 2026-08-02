package com.paypal.oslo.feature.onboarding.api.navigation.result;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000eJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b\u0005\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/navigation/result/EmailSuggestionNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "acceptedEmail", "", "isOriginalEmail", "<init>", "(Ljava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-BvNj-jI", "()Ljava/lang/String;", "component1", "component2", "()Z", "copy-E4ilnuY", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/onboarding/api/navigation/result/EmailSuggestionNavResult;", "copy", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$onboarding_api_prodRelease", "(Lcom/paypal/oslo/feature/onboarding/api/navigation/result/EmailSuggestionNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getAcceptedEmail-BvNj-jI", "Z", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class EmailSuggestionNavResult implements com.paypal.oslo.core.navigation.result.NavResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.onboarding.api.navigation.result.EmailSuggestionNavResult.Companion INSTANCE = new com.paypal.oslo.feature.onboarding.api.navigation.result.EmailSuggestionNavResult.Companion(null);
    private final java.lang.String acceptedEmail;
    private final boolean isOriginalEmail;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/navigation/result/EmailSuggestionNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/onboarding/api/navigation/result/EmailSuggestionNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.onboarding.api.navigation.result.EmailSuggestionNavResult> serializer() {
            return com.paypal.oslo.feature.onboarding.api.navigation.result.EmailSuggestionNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ EmailSuggestionNavResult(int i, java.lang.String str, boolean z) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.onboarding.api.navigation.result.EmailSuggestionNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.acceptedEmail = str;
        this.isOriginalEmail = z;
    }

    private EmailSuggestionNavResult(java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.acceptedEmail = str;
        this.isOriginalEmail = z;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$onboarding_api_prodRelease(com.paypal.oslo.feature.onboarding.api.navigation.result.EmailSuggestionNavResult self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email$$serializer.INSTANCE, com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15921boximpl(self.acceptedEmail));
        output.encodeBooleanElement(serialDesc, 1, self.isOriginalEmail);
    }

    /* renamed from: getAcceptedEmail-BvNj-jI, reason: not valid java name */
    public final java.lang.String m15916getAcceptedEmailBvNjjI() {
        return this.acceptedEmail;
    }

    public final boolean isOriginalEmail() {
        return this.isOriginalEmail;
    }

    public final java.lang.String toString() {
        java.lang.String m15926toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15926toStringimpl(this.acceptedEmail);
        boolean z = this.isOriginalEmail;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EmailSuggestionNavResult(acceptedEmail=");
        sb.append(m15926toStringimpl);
        sb.append(", isOriginalEmail=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15925hashCodeimpl(this.acceptedEmail) * 31) + java.lang.Boolean.hashCode(this.isOriginalEmail);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.api.navigation.result.EmailSuggestionNavResult)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.api.navigation.result.EmailSuggestionNavResult emailSuggestionNavResult = (com.paypal.oslo.feature.onboarding.api.navigation.result.EmailSuggestionNavResult) other;
        return com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15924equalsimpl0(this.acceptedEmail, emailSuggestionNavResult.acceptedEmail) && this.isOriginalEmail == emailSuggestionNavResult.isOriginalEmail;
    }

    /* renamed from: copy-E4ilnuY, reason: not valid java name */
    public final com.paypal.oslo.feature.onboarding.api.navigation.result.EmailSuggestionNavResult m15915copyE4ilnuY(java.lang.String acceptedEmail, boolean isOriginalEmail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acceptedEmail, "");
        return new com.paypal.oslo.feature.onboarding.api.navigation.result.EmailSuggestionNavResult(acceptedEmail, isOriginalEmail, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsOriginalEmail() {
        return this.isOriginalEmail;
    }

    /* renamed from: component1-BvNj-jI, reason: not valid java name and from getter */
    public final java.lang.String getAcceptedEmail() {
        return this.acceptedEmail;
    }

    /* renamed from: copy-E4ilnuY$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.onboarding.api.navigation.result.EmailSuggestionNavResult m15913copyE4ilnuY$default(com.paypal.oslo.feature.onboarding.api.navigation.result.EmailSuggestionNavResult emailSuggestionNavResult, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = emailSuggestionNavResult.acceptedEmail;
        }
        if ((i & 2) != 0) {
            z = emailSuggestionNavResult.isOriginalEmail;
        }
        return emailSuggestionNavResult.m15915copyE4ilnuY(str, z);
    }

    public /* synthetic */ EmailSuggestionNavResult(java.lang.String str, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z);
    }

    public /* synthetic */ EmailSuggestionNavResult(int i, java.lang.String str, boolean z, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, z);
    }
}
