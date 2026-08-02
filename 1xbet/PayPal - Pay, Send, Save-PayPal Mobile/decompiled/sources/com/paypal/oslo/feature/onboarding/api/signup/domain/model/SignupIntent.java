package com.paypal.oslo.feature.onboarding.api.signup.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00062\u00020\u0001:\u0005\u0007\b\t\n\u0006R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\u000b\f\r\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent;", "", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FlowEntryPoint;", "getFlowEntryPoint", "()Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FlowEntryPoint;", "flowEntryPoint", "Companion", "SignupWithPhone", "SignupWithEmail", "SignupWithGoogle", "SignupWithOnboardingEmail", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent$SignupWithEmail;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent$SignupWithGoogle;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent$SignupWithOnboardingEmail;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent$SignupWithPhone;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public interface SignupIntent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.Companion INSTANCE = com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.Companion.getHighSpeedVideoSizes;

    com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint getFlowEntryPoint();

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.Companion getHighSpeedVideoSizes = new com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.Companion();

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent> serializer() {
            return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithEmail.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithGoogle.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithOnboardingEmail.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithPhone.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent$SignupWithEmail$$serializer.INSTANCE, com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent$SignupWithGoogle$$serializer.INSTANCE, new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithOnboardingEmail", com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithOnboardingEmail.INSTANCE, new java.lang.annotation.Annotation[0]), com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent$SignupWithPhone$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0013J\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\u0010J'\u0010(\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent$SignupWithPhone;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/PhoneNumber;", "phoneNumber", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/InternationalDialingCode;", "dialingCode", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FlowEntryPoint;", "flowEntryPoint", "<init>", "(Ljava/lang/String;ILcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FlowEntryPoint;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/InternationalDialingCode;Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FlowEntryPoint;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-v-Cycbc", "()Ljava/lang/String;", "component1", "component2-WKAk_us", "()I", "component2", "component3", "()Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FlowEntryPoint;", "copy-nUfM9yo", "(Ljava/lang/String;ILcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FlowEntryPoint;)Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent$SignupWithPhone;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$onboarding_api_prodRelease", "(Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent$SignupWithPhone;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getPhoneNumber-v-Cycbc", com.visa.cbp.getEncExpo.warmup, "getDialingCode-WKAk_us", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FlowEntryPoint;", "getFlowEntryPoint", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class SignupWithPhone implements com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent {
        private final int dialingCode;
        private final com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint;
        private final java.lang.String phoneNumber;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithPhone.Companion INSTANCE = new com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithPhone.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent$SignupWithPhone$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint.INSTANCE.serializer();
                return serializer;
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent$SignupWithPhone$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent$SignupWithPhone;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes13.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithPhone> serializer() {
                return com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent$SignupWithPhone$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private /* synthetic */ SignupWithPhone(int i, java.lang.String str, com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode internationalDialingCode, com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint) {
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent$SignupWithPhone$$serializer.INSTANCE.getDescriptor());
            }
            this.phoneNumber = str;
            this.dialingCode = internationalDialingCode.m15966unboximpl();
            if ((i & 4) == 0) {
                this.flowEntryPoint = com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint.ORGANIC;
            } else {
                this.flowEntryPoint = flowEntryPoint;
            }
        }

        private SignupWithPhone(java.lang.String str, int i, com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowEntryPoint, "");
            this.phoneNumber = str;
            this.dialingCode = i;
            this.flowEntryPoint = flowEntryPoint;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$onboarding_api_prodRelease(com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithPhone self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.onboarding.api.signup.domain.model.PhoneNumber$$serializer.INSTANCE, com.paypal.oslo.feature.onboarding.api.signup.domain.model.PhoneNumber.m15978boximpl(self.phoneNumber));
            output.encodeSerializableElement(serialDesc, 1, com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode$$serializer.INSTANCE, com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode.m15960boximpl(self.dialingCode));
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.getFlowEntryPoint() != com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint.ORGANIC) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.getFlowEntryPoint());
            }
        }

        /* renamed from: getPhoneNumber-v-Cycbc, reason: not valid java name */
        public final java.lang.String m16019getPhoneNumbervCycbc() {
            return this.phoneNumber;
        }

        /* renamed from: getDialingCode-WKAk_us, reason: not valid java name */
        public final int m16018getDialingCodeWKAk_us() {
            return this.dialingCode;
        }

        public /* synthetic */ SignupWithPhone(java.lang.String str, int i, com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, (i2 & 4) != 0 ? com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint.ORGANIC : flowEntryPoint, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        @Override // com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent
        public final com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint getFlowEntryPoint() {
            return this.flowEntryPoint;
        }

        public final java.lang.String toString() {
            java.lang.String m15983toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.PhoneNumber.m15983toStringimpl(this.phoneNumber);
            java.lang.String m15965toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode.m15965toStringimpl(this.dialingCode);
            com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint = this.flowEntryPoint;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SignupWithPhone(phoneNumber=");
            sb.append(m15983toStringimpl);
            sb.append(", dialingCode=");
            sb.append(m15965toStringimpl);
            sb.append(", flowEntryPoint=");
            sb.append(flowEntryPoint);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((com.paypal.oslo.feature.onboarding.api.signup.domain.model.PhoneNumber.m15982hashCodeimpl(this.phoneNumber) * 31) + com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode.m15964hashCodeimpl(this.dialingCode)) * 31) + this.flowEntryPoint.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithPhone)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithPhone signupWithPhone = (com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithPhone) other;
            return com.paypal.oslo.feature.onboarding.api.signup.domain.model.PhoneNumber.m15981equalsimpl0(this.phoneNumber, signupWithPhone.phoneNumber) && com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode.m15963equalsimpl0(this.dialingCode, signupWithPhone.dialingCode) && this.flowEntryPoint == signupWithPhone.flowEntryPoint;
        }

        /* renamed from: copy-nUfM9yo, reason: not valid java name */
        public final com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithPhone m16017copynUfM9yo(java.lang.String phoneNumber, int dialingCode, com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowEntryPoint, "");
            return new com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithPhone(phoneNumber, dialingCode, flowEntryPoint, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint getFlowEntryPoint() {
            return this.flowEntryPoint;
        }

        /* renamed from: component2-WKAk_us, reason: not valid java name and from getter */
        public final int getDialingCode() {
            return this.dialingCode;
        }

        /* renamed from: component1-v-Cycbc, reason: not valid java name and from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        /* renamed from: copy-nUfM9yo$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithPhone m16014copynUfM9yo$default(com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithPhone signupWithPhone, java.lang.String str, int i, com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = signupWithPhone.phoneNumber;
            }
            if ((i2 & 2) != 0) {
                i = signupWithPhone.dialingCode;
            }
            if ((i2 & 4) != 0) {
                flowEntryPoint = signupWithPhone.flowEntryPoint;
            }
            return signupWithPhone.m16017copynUfM9yo(str, i, flowEntryPoint);
        }

        public /* synthetic */ SignupWithPhone(java.lang.String str, int i, com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, flowEntryPoint);
        }

        public /* synthetic */ SignupWithPhone(int i, java.lang.String str, com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode internationalDialingCode, com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, internationalDialingCode, flowEntryPoint);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000eJ'\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent$SignupWithEmail;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "email", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FlowEntryPoint;", "flowEntryPoint", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FlowEntryPoint;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FlowEntryPoint;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-BvNj-jI", "()Ljava/lang/String;", "component1", "component2", "()Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FlowEntryPoint;", "copy-E4ilnuY", "(Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FlowEntryPoint;)Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent$SignupWithEmail;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$onboarding_api_prodRelease", "(Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent$SignupWithEmail;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getEmail-BvNj-jI", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FlowEntryPoint;", "getFlowEntryPoint", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class SignupWithEmail implements com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent {
        private final java.lang.String email;
        private final com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithEmail.Companion INSTANCE = new com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithEmail.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent$SignupWithEmail$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint.INSTANCE.serializer();
                return serializer;
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent$SignupWithEmail$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent$SignupWithEmail;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes13.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithEmail> serializer() {
                return com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent$SignupWithEmail$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private /* synthetic */ SignupWithEmail(int i, java.lang.String str, com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint) {
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent$SignupWithEmail$$serializer.INSTANCE.getDescriptor());
            }
            this.email = str;
            if ((i & 2) == 0) {
                this.flowEntryPoint = com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint.ORGANIC;
            } else {
                this.flowEntryPoint = flowEntryPoint;
            }
        }

        private SignupWithEmail(java.lang.String str, com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowEntryPoint, "");
            this.email = str;
            this.flowEntryPoint = flowEntryPoint;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$onboarding_api_prodRelease(com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithEmail self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email$$serializer.INSTANCE, com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15921boximpl(self.email));
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.getFlowEntryPoint() != com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint.ORGANIC) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.getFlowEntryPoint());
            }
        }

        /* renamed from: getEmail-BvNj-jI, reason: not valid java name */
        public final java.lang.String m15999getEmailBvNjjI() {
            return this.email;
        }

        public /* synthetic */ SignupWithEmail(java.lang.String str, com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint.ORGANIC : flowEntryPoint, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        @Override // com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent
        public final com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint getFlowEntryPoint() {
            return this.flowEntryPoint;
        }

        public final java.lang.String toString() {
            java.lang.String m15926toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15926toStringimpl(this.email);
            com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint = this.flowEntryPoint;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SignupWithEmail(email=");
            sb.append(m15926toStringimpl);
            sb.append(", flowEntryPoint=");
            sb.append(flowEntryPoint);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15925hashCodeimpl(this.email) * 31) + this.flowEntryPoint.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithEmail)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithEmail signupWithEmail = (com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithEmail) other;
            return com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15924equalsimpl0(this.email, signupWithEmail.email) && this.flowEntryPoint == signupWithEmail.flowEntryPoint;
        }

        /* renamed from: copy-E4ilnuY, reason: not valid java name */
        public final com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithEmail m15998copyE4ilnuY(java.lang.String email, com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowEntryPoint, "");
            return new com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithEmail(email, flowEntryPoint, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint getFlowEntryPoint() {
            return this.flowEntryPoint;
        }

        /* renamed from: component1-BvNj-jI, reason: not valid java name and from getter */
        public final java.lang.String getEmail() {
            return this.email;
        }

        /* renamed from: copy-E4ilnuY$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithEmail m15996copyE4ilnuY$default(com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithEmail signupWithEmail, java.lang.String str, com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = signupWithEmail.email;
            }
            if ((i & 2) != 0) {
                flowEntryPoint = signupWithEmail.flowEntryPoint;
            }
            return signupWithEmail.m15998copyE4ilnuY(str, flowEntryPoint);
        }

        public /* synthetic */ SignupWithEmail(java.lang.String str, com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, flowEntryPoint);
        }

        public /* synthetic */ SignupWithEmail(int i, java.lang.String str, com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, flowEntryPoint);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fBW\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001f\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0010\u0010 \u001a\u00020\fHÆ\u0003¢\u0006\u0004\b \u0010!JL\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010\u0016J'\u00104\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b8\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b9\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b:\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b;\u0010\u0016R\u001a\u0010\r\u001a\u00020\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010!"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent$SignupWithGoogle;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "email", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FirstName;", "firstName", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/LastName;", "lastName", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/ProfileUrl;", "profileUrl", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/GoogleToken;", "googleToken", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FlowEntryPoint;", "flowEntryPoint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FlowEntryPoint;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FlowEntryPoint;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-BvNj-jI", "()Ljava/lang/String;", "component1", "component2-w8YRmDk", "component2", "component3-i7KAUmI", "component3", "component4-C-jiun0", "component4", "component5-7eVPCio", "component5", "component6", "()Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FlowEntryPoint;", "copy-0F5sDl8", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FlowEntryPoint;)Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent$SignupWithGoogle;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$onboarding_api_prodRelease", "(Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent$SignupWithGoogle;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getEmail-BvNj-jI", "getFirstName-w8YRmDk", "getLastName-i7KAUmI", "getProfileUrl-C-jiun0", "getGoogleToken-7eVPCio", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FlowEntryPoint;", "getFlowEntryPoint", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class SignupWithGoogle implements com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent {
        private final java.lang.String email;
        private final java.lang.String firstName;
        private final com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint;
        private final java.lang.String googleToken;
        private final java.lang.String lastName;
        private final java.lang.String profileUrl;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithGoogle.Companion INSTANCE = new com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithGoogle.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent$SignupWithGoogle$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint.INSTANCE.serializer();
                return serializer;
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent$SignupWithGoogle$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent$SignupWithGoogle;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes13.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithGoogle> serializer() {
                return com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent$SignupWithGoogle$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private /* synthetic */ SignupWithGoogle(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint) {
            if (31 != (i & 31)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 31, com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent$SignupWithGoogle$$serializer.INSTANCE.getDescriptor());
            }
            this.email = str;
            this.firstName = str2;
            this.lastName = str3;
            this.profileUrl = str4;
            this.googleToken = str5;
            if ((i & 32) == 0) {
                this.flowEntryPoint = com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint.ORGANIC;
            } else {
                this.flowEntryPoint = flowEntryPoint;
            }
        }

        private SignupWithGoogle(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowEntryPoint, "");
            this.email = str;
            this.firstName = str2;
            this.lastName = str3;
            this.profileUrl = str4;
            this.googleToken = str5;
            this.flowEntryPoint = flowEntryPoint;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$onboarding_api_prodRelease(com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithGoogle self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email$$serializer.INSTANCE, com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15921boximpl(self.email));
            output.encodeSerializableElement(serialDesc, 1, com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName$$serializer.INSTANCE, com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName.m15930boximpl(self.firstName));
            output.encodeSerializableElement(serialDesc, 2, com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName$$serializer.INSTANCE, com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName.m15969boximpl(self.lastName));
            output.encodeSerializableElement(serialDesc, 3, com.paypal.oslo.feature.onboarding.api.signup.domain.model.ProfileUrl$$serializer.INSTANCE, com.paypal.oslo.feature.onboarding.api.signup.domain.model.ProfileUrl.m15987boximpl(self.profileUrl));
            output.encodeSerializableElement(serialDesc, 4, com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleToken$$serializer.INSTANCE, com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleToken.m15951boximpl(self.googleToken));
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.getFlowEntryPoint() != com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint.ORGANIC) {
                output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.getFlowEntryPoint());
            }
        }

        /* renamed from: getEmail-BvNj-jI, reason: not valid java name */
        public final java.lang.String m16008getEmailBvNjjI() {
            return this.email;
        }

        /* renamed from: getFirstName-w8YRmDk, reason: not valid java name */
        public final java.lang.String m16009getFirstNamew8YRmDk() {
            return this.firstName;
        }

        /* renamed from: getLastName-i7KAUmI, reason: not valid java name */
        public final java.lang.String m16011getLastNamei7KAUmI() {
            return this.lastName;
        }

        /* renamed from: getProfileUrl-C-jiun0, reason: not valid java name */
        public final java.lang.String m16012getProfileUrlCjiun0() {
            return this.profileUrl;
        }

        /* renamed from: getGoogleToken-7eVPCio, reason: not valid java name */
        public final java.lang.String m16010getGoogleToken7eVPCio() {
            return this.googleToken;
        }

        public /* synthetic */ SignupWithGoogle(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, (i & 32) != 0 ? com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint.ORGANIC : flowEntryPoint, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        @Override // com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent
        public final com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint getFlowEntryPoint() {
            return this.flowEntryPoint;
        }

        public final java.lang.String toString() {
            java.lang.String m15926toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15926toStringimpl(this.email);
            java.lang.String m15935toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName.m15935toStringimpl(this.firstName);
            java.lang.String m15974toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName.m15974toStringimpl(this.lastName);
            java.lang.String m15992toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.ProfileUrl.m15992toStringimpl(this.profileUrl);
            java.lang.String m15956toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleToken.m15956toStringimpl(this.googleToken);
            com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint = this.flowEntryPoint;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SignupWithGoogle(email=");
            sb.append(m15926toStringimpl);
            sb.append(", firstName=");
            sb.append(m15935toStringimpl);
            sb.append(", lastName=");
            sb.append(m15974toStringimpl);
            sb.append(", profileUrl=");
            sb.append(m15992toStringimpl);
            sb.append(", googleToken=");
            sb.append(m15956toStringimpl);
            sb.append(", flowEntryPoint=");
            sb.append(flowEntryPoint);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15925hashCodeimpl(this.email) * 31) + com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName.m15934hashCodeimpl(this.firstName)) * 31) + com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName.m15973hashCodeimpl(this.lastName)) * 31) + com.paypal.oslo.feature.onboarding.api.signup.domain.model.ProfileUrl.m15991hashCodeimpl(this.profileUrl)) * 31) + com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleToken.m15955hashCodeimpl(this.googleToken)) * 31) + this.flowEntryPoint.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithGoogle)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithGoogle signupWithGoogle = (com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithGoogle) other;
            return com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15924equalsimpl0(this.email, signupWithGoogle.email) && com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName.m15933equalsimpl0(this.firstName, signupWithGoogle.firstName) && com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName.m15972equalsimpl0(this.lastName, signupWithGoogle.lastName) && com.paypal.oslo.feature.onboarding.api.signup.domain.model.ProfileUrl.m15990equalsimpl0(this.profileUrl, signupWithGoogle.profileUrl) && com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleToken.m15954equalsimpl0(this.googleToken, signupWithGoogle.googleToken) && this.flowEntryPoint == signupWithGoogle.flowEntryPoint;
        }

        /* renamed from: copy-0F5sDl8, reason: not valid java name */
        public final com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithGoogle m16007copy0F5sDl8(java.lang.String email, java.lang.String firstName, java.lang.String lastName, java.lang.String profileUrl, java.lang.String googleToken, com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleToken, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowEntryPoint, "");
            return new com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithGoogle(email, firstName, lastName, profileUrl, googleToken, flowEntryPoint, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint getFlowEntryPoint() {
            return this.flowEntryPoint;
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

        /* renamed from: copy-0F5sDl8$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithGoogle m16001copy0F5sDl8$default(com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithGoogle signupWithGoogle, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = signupWithGoogle.email;
            }
            if ((i & 2) != 0) {
                str2 = signupWithGoogle.firstName;
            }
            java.lang.String str6 = str2;
            if ((i & 4) != 0) {
                str3 = signupWithGoogle.lastName;
            }
            java.lang.String str7 = str3;
            if ((i & 8) != 0) {
                str4 = signupWithGoogle.profileUrl;
            }
            java.lang.String str8 = str4;
            if ((i & 16) != 0) {
                str5 = signupWithGoogle.googleToken;
            }
            java.lang.String str9 = str5;
            if ((i & 32) != 0) {
                flowEntryPoint = signupWithGoogle.flowEntryPoint;
            }
            return signupWithGoogle.m16007copy0F5sDl8(str, str6, str7, str8, str9, flowEntryPoint);
        }

        public /* synthetic */ SignupWithGoogle(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, flowEntryPoint);
        }

        public /* synthetic */ SignupWithGoogle(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, str2, str3, str4, str5, flowEntryPoint);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent$SignupWithOnboardingEmail;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FlowEntryPoint;", "flowEntryPoint", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FlowEntryPoint;", "getFlowEntryPoint", "()Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FlowEntryPoint;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes13.dex */
    public static final /* data */ class SignupWithOnboardingEmail implements com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent {
        public static final com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithOnboardingEmail INSTANCE = new com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithOnboardingEmail();
        private static final com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint = com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint.ORGANIC;
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent$SignupWithOnboardingEmail$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithOnboardingEmail.$r8$lambda$jk2AsZ9PMs5nCrhWcKGeiZEvRyU();
            }
        });

        public final int hashCode() {
            return 758066616;
        }

        private SignupWithOnboardingEmail() {
        }

        @Override // com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent
        public final com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint getFlowEntryPoint() {
            return flowEntryPoint;
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$jk2AsZ9PMs5nCrhWcKGeiZEvRyU() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithOnboardingEmail", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithOnboardingEmail> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "SignupWithOnboardingEmail";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithOnboardingEmail)) {
                return false;
            }
            return true;
        }
    }
}
