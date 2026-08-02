package com.paypal.oslo.feature.onboarding.api.navigation;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b7\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0001\u0013"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/navigation/PostOnboardingDeepLinkParams;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/onboarding/api/navigation/PostOnboardingDeepLinkParams;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "WelcomeBackEmailConfirmation", "Lcom/paypal/oslo/feature/onboarding/api/navigation/PostOnboardingDeepLinkParams$WelcomeBackEmailConfirmation;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class PostOnboardingDeepLinkParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams.Companion INSTANCE = new com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams.$r8$lambda$gbzEO0O8bv7SKZ6SttPJKjumgPY();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/navigation/PostOnboardingDeepLinkParams$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/onboarding/api/navigation/PostOnboardingDeepLinkParams;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private PostOnboardingDeepLinkParams() {
    }

    public /* synthetic */ PostOnboardingDeepLinkParams(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002$%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/navigation/PostOnboardingDeepLinkParams$WelcomeBackEmailConfirmation;", "Lcom/paypal/oslo/feature/onboarding/api/navigation/PostOnboardingDeepLinkParams;", "", "email", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/api/navigation/PostOnboardingDeepLinkParams$WelcomeBackEmailConfirmation;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$onboarding_api_prodRelease", "(Lcom/paypal/oslo/feature/onboarding/api/navigation/PostOnboardingDeepLinkParams$WelcomeBackEmailConfirmation;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getEmail", "getCode", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class WelcomeBackEmailConfirmation extends com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams.WelcomeBackEmailConfirmation.Companion INSTANCE = new com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams.WelcomeBackEmailConfirmation.Companion(null);
        private final java.lang.String code;
        private final java.lang.String email;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ WelcomeBackEmailConfirmation(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams$WelcomeBackEmailConfirmation$$serializer.INSTANCE.getDescriptor());
            }
            this.email = str;
            this.code = str2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WelcomeBackEmailConfirmation(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.email = str;
            this.code = str2;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$onboarding_api_prodRelease(com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams.WelcomeBackEmailConfirmation self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.email);
            output.encodeStringElement(serialDesc, 1, self.code);
        }

        public final java.lang.String getEmail() {
            return this.email;
        }

        public final java.lang.String getCode() {
            return this.code;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/navigation/PostOnboardingDeepLinkParams$WelcomeBackEmailConfirmation$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/onboarding/api/navigation/WelcomeBackDeepLinkLauncher;", "destination", "Lcom/paypal/oslo/feature/onboarding/api/navigation/PostOnboardingDeepLinkParams$WelcomeBackEmailConfirmation;", "from", "(Lcom/paypal/oslo/feature/onboarding/api/navigation/WelcomeBackDeepLinkLauncher;)Lcom/paypal/oslo/feature/onboarding/api/navigation/PostOnboardingDeepLinkParams$WelcomeBackEmailConfirmation;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes13.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams.WelcomeBackEmailConfirmation> serializer() {
                return com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams$WelcomeBackEmailConfirmation$$serializer.INSTANCE;
            }

            public final com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams.WelcomeBackEmailConfirmation from(com.paypal.oslo.feature.onboarding.api.navigation.WelcomeBackDeepLinkLauncher destination) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
                return new com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams.WelcomeBackEmailConfirmation(destination.getEmail(), destination.getCode());
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.email;
            java.lang.String str2 = this.code;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WelcomeBackEmailConfirmation(email=");
            sb.append(str);
            sb.append(", code=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.email.hashCode() * 31) + this.code.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams.WelcomeBackEmailConfirmation)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams.WelcomeBackEmailConfirmation welcomeBackEmailConfirmation = (com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams.WelcomeBackEmailConfirmation) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.email, welcomeBackEmailConfirmation.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.code, welcomeBackEmailConfirmation.code);
        }

        public final com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams.WelcomeBackEmailConfirmation copy(java.lang.String email, java.lang.String code) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
            return new com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams.WelcomeBackEmailConfirmation(email, code);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCode() {
            return this.code;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getEmail() {
            return this.email;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams.WelcomeBackEmailConfirmation copy$default(com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams.WelcomeBackEmailConfirmation welcomeBackEmailConfirmation, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = welcomeBackEmailConfirmation.email;
            }
            if ((i & 2) != 0) {
                str2 = welcomeBackEmailConfirmation.code;
            }
            return welcomeBackEmailConfirmation.copy(str, str2);
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$gbzEO0O8bv7SKZ6SttPJKjumgPY() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams.WelcomeBackEmailConfirmation.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams$WelcomeBackEmailConfirmation$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ PostOnboardingDeepLinkParams(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
