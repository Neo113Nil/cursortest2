package com.paypal.oslo.feature.onboarding.api.navigation;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000eJ'\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/navigation/SignupFlowDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "countryCode", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent;", "intent", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-ALGuh4w", "()Ljava/lang/String;", "component1", "component2", "()Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent;", "copy-n_l99Nk", "(Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent;)Lcom/paypal/oslo/feature/onboarding/api/navigation/SignupFlowDestination;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$onboarding_api_prodRelease", "(Lcom/paypal/oslo/feature/onboarding/api/navigation/SignupFlowDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getCountryCode-ALGuh4w", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent;", "getIntent", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class SignupFlowDestination implements androidx.navigation3.runtime.NavKey {
    private final java.lang.String countryCode;
    private final com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent intent;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.onboarding.api.navigation.SignupFlowDestination.Companion INSTANCE = new com.paypal.oslo.feature.onboarding.api.navigation.SignupFlowDestination.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.api.navigation.SignupFlowDestination$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/navigation/SignupFlowDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/onboarding/api/navigation/SignupFlowDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.onboarding.api.navigation.SignupFlowDestination> serializer() {
            return com.paypal.oslo.feature.onboarding.api.navigation.SignupFlowDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ SignupFlowDestination(int i, java.lang.String str, com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent signupIntent) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.onboarding.api.navigation.SignupFlowDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.countryCode = str;
        this.intent = signupIntent;
    }

    private SignupFlowDestination(java.lang.String str, com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent signupIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupIntent, "");
        this.countryCode = str;
        this.intent = signupIntent;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$onboarding_api_prodRelease(com.paypal.oslo.feature.onboarding.api.navigation.SignupFlowDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.core.i18n.domain.model.CountryCode$$serializer.INSTANCE, com.paypal.oslo.core.i18n.domain.model.CountryCode.m11363boximpl(self.countryCode));
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.intent);
    }

    /* renamed from: getCountryCode-ALGuh4w, reason: not valid java name */
    public final java.lang.String m15911getCountryCodeALGuh4w() {
        return this.countryCode;
    }

    public final com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent getIntent() {
        return this.intent;
    }

    public final java.lang.String toString() {
        java.lang.String m11368toStringimpl = com.paypal.oslo.core.i18n.domain.model.CountryCode.m11368toStringimpl(this.countryCode);
        com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent signupIntent = this.intent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SignupFlowDestination(countryCode=");
        sb.append(m11368toStringimpl);
        sb.append(", intent=");
        sb.append(signupIntent);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (com.paypal.oslo.core.i18n.domain.model.CountryCode.m11367hashCodeimpl(this.countryCode) * 31) + this.intent.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.api.navigation.SignupFlowDestination)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.api.navigation.SignupFlowDestination signupFlowDestination = (com.paypal.oslo.feature.onboarding.api.navigation.SignupFlowDestination) other;
        return com.paypal.oslo.core.i18n.domain.model.CountryCode.m11366equalsimpl0(this.countryCode, signupFlowDestination.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.intent, signupFlowDestination.intent);
    }

    /* renamed from: copy-n_l99Nk, reason: not valid java name */
    public final com.paypal.oslo.feature.onboarding.api.navigation.SignupFlowDestination m15910copyn_l99Nk(java.lang.String countryCode, com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        return new com.paypal.oslo.feature.onboarding.api.navigation.SignupFlowDestination(countryCode, intent, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent getIntent() {
        return this.intent;
    }

    /* renamed from: component1-ALGuh4w, reason: not valid java name and from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: copy-n_l99Nk$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.onboarding.api.navigation.SignupFlowDestination m15908copyn_l99Nk$default(com.paypal.oslo.feature.onboarding.api.navigation.SignupFlowDestination signupFlowDestination, java.lang.String str, com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent signupIntent, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = signupFlowDestination.countryCode;
        }
        if ((i & 2) != 0) {
            signupIntent = signupFlowDestination.intent;
        }
        return signupFlowDestination.m15910copyn_l99Nk(str, signupIntent);
    }

    public /* synthetic */ SignupFlowDestination(java.lang.String str, com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent signupIntent, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, signupIntent);
    }

    public /* synthetic */ SignupFlowDestination(int i, java.lang.String str, com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent signupIntent, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, signupIntent);
    }
}
