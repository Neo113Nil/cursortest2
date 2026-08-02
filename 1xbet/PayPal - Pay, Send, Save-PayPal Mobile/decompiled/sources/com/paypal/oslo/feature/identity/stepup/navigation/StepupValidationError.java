package com.paypal.oslo.feature.identity.stepup.navigation;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b1\u0018\u0000 \u00112\u00020\u0001:\u0003\u0012\u0013\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/navigation/StepupValidationError;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/identity/stepup/navigation/StepupValidationError;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "MaxAttemptsReached", "VerificationLimitExceeded", "Lcom/paypal/oslo/feature/identity/stepup/navigation/StepupValidationError$MaxAttemptsReached;", "Lcom/paypal/oslo/feature/identity/stepup/navigation/StepupValidationError$VerificationLimitExceeded;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class StepupValidationError {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.Companion INSTANCE = new com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.$r8$lambda$dglI1tYErSK7_uOBlUzfvs9X5OI();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/navigation/StepupValidationError$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/stepup/navigation/StepupValidationError;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private StepupValidationError() {
    }

    public /* synthetic */ StepupValidationError(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/navigation/StepupValidationError$MaxAttemptsReached;", "Lcom/paypal/oslo/feature/identity/stepup/navigation/StepupValidationError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes5.dex */
    public static final /* data */ class MaxAttemptsReached extends com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.MaxAttemptsReached INSTANCE = new com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.MaxAttemptsReached();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError$MaxAttemptsReached$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.MaxAttemptsReached.$r8$lambda$zvHfa1fwvpK_MiEgdQtMBiQO8Po();
            }
        });

        public final int hashCode() {
            return -928265888;
        }

        private MaxAttemptsReached() {
            super(null);
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$zvHfa1fwvpK_MiEgdQtMBiQO8Po() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.MaxAttemptsReached", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.MaxAttemptsReached> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "MaxAttemptsReached";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.MaxAttemptsReached)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/navigation/StepupValidationError$VerificationLimitExceeded;", "Lcom/paypal/oslo/feature/identity/stepup/navigation/StepupValidationError;", "", "maskedTarget", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/stepup/navigation/StepupValidationError$VerificationLimitExceeded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_prodRelease", "(Lcom/paypal/oslo/feature/identity/stepup/navigation/StepupValidationError$VerificationLimitExceeded;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getMaskedTarget", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class VerificationLimitExceeded extends com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.VerificationLimitExceeded.Companion INSTANCE = new com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.VerificationLimitExceeded.Companion(null);
        private final java.lang.String maskedTarget;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/navigation/StepupValidationError$VerificationLimitExceeded$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/stepup/navigation/StepupValidationError$VerificationLimitExceeded;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.VerificationLimitExceeded> serializer() {
                return com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError$VerificationLimitExceeded$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ VerificationLimitExceeded(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError$VerificationLimitExceeded$$serializer.INSTANCE.getDescriptor());
            }
            this.maskedTarget = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerificationLimitExceeded(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.maskedTarget = str;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$identity_prodRelease(com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.VerificationLimitExceeded self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.maskedTarget);
        }

        public final java.lang.String getMaskedTarget() {
            return this.maskedTarget;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.maskedTarget;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("VerificationLimitExceeded(maskedTarget=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.maskedTarget.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.VerificationLimitExceeded) && kotlin.jvm.internal.Intrinsics.areEqual(this.maskedTarget, ((com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.VerificationLimitExceeded) other).maskedTarget);
        }

        public final com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.VerificationLimitExceeded copy(java.lang.String maskedTarget) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maskedTarget, "");
            return new com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.VerificationLimitExceeded(maskedTarget);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMaskedTarget() {
            return this.maskedTarget;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.VerificationLimitExceeded copy$default(com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.VerificationLimitExceeded verificationLimitExceeded, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = verificationLimitExceeded.maskedTarget;
            }
            return verificationLimitExceeded.copy(str);
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$dglI1tYErSK7_uOBlUzfvs9X5OI() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.MaxAttemptsReached.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.VerificationLimitExceeded.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.MaxAttemptsReached", com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.MaxAttemptsReached.INSTANCE, new java.lang.annotation.Annotation[0]), com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError$VerificationLimitExceeded$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ StepupValidationError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
