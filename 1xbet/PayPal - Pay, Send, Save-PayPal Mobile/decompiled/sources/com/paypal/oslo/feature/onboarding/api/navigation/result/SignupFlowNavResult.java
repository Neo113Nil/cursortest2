package com.paypal.oslo.feature.onboarding.api.navigation.result;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003$%#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult$Status;", "status", "<init>", "(Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult$Status;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult$Status;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult$Status;", "copy", "(Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult$Status;)Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$onboarding_api_prodRelease", "(Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult$Status;", "getStatus", "Companion", "Status", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class SignupFlowNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    private final com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status status;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Companion INSTANCE = new com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult> serializer() {
            return com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SignupFlowNavResult(int i, com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status status, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.status = status;
    }

    public SignupFlowNavResult(com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        this.status = status;
    }

    public final com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status getStatus() {
        return this.status;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult$Status;", "", "Companion", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, "EmailAlreadyExists", "Cancelled", "Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult$Status$Cancelled;", "Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult$Status$Completed;", "Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult$Status$EmailAlreadyExists;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public interface Status {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.Companion INSTANCE = com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.Companion.getHighResolutionOutputSizeshNQ4ISI;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult$Status$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult$Status;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes13.dex */
        public static final class Companion {
            static final /* synthetic */ com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.Companion getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.Companion();

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status> serializer() {
                return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.Cancelled.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.Completed.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.EmailAlreadyExists.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.Cancelled", com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.Cancelled.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.Completed", com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.Completed.INSTANCE, new java.lang.annotation.Annotation[0]), com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult$Status$EmailAlreadyExists$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult$Status$Completed;", "Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult$Status;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes13.dex */
        public static final /* data */ class Completed implements com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status {
            public static final com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.Completed INSTANCE = new com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.Completed();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult$Status$Completed$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.Completed.$r8$lambda$ogE0fovYHndyR7LVCXhS1jFC2io();
                }
            });

            public final int hashCode() {
                return 1815275600;
            }

            private Completed() {
            }

            public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$ogE0fovYHndyR7LVCXhS1jFC2io() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.Completed", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.Completed> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final java.lang.String toString() {
                return com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE;
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.Completed)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult$Status$EmailAlreadyExists;", "Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult$Status;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "email", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-BvNj-jI", "()Ljava/lang/String;", "component1", "copy-RQoNrjY", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult$Status$EmailAlreadyExists;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$onboarding_api_prodRelease", "(Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult$Status$EmailAlreadyExists;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getEmail-BvNj-jI", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class EmailAlreadyExists implements com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.EmailAlreadyExists.Companion INSTANCE = new com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.EmailAlreadyExists.Companion(null);
            private final java.lang.String email;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult$Status$EmailAlreadyExists$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult$Status$EmailAlreadyExists;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes13.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.EmailAlreadyExists> serializer() {
                    return com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult$Status$EmailAlreadyExists$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            private /* synthetic */ EmailAlreadyExists(int i, java.lang.String str) {
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult$Status$EmailAlreadyExists$$serializer.INSTANCE.getDescriptor());
                }
                this.email = str;
            }

            private EmailAlreadyExists(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.email = str;
            }

            /* renamed from: getEmail-BvNj-jI, reason: not valid java name */
            public final java.lang.String m15920getEmailBvNjjI() {
                return this.email;
            }

            public final java.lang.String toString() {
                java.lang.String m15926toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15926toStringimpl(this.email);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("EmailAlreadyExists(email=");
                sb.append(m15926toStringimpl);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15925hashCodeimpl(this.email);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.EmailAlreadyExists) && com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15924equalsimpl0(this.email, ((com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.EmailAlreadyExists) other).email);
            }

            /* renamed from: copy-RQoNrjY, reason: not valid java name */
            public final com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.EmailAlreadyExists m15919copyRQoNrjY(java.lang.String email) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
                return new com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.EmailAlreadyExists(email, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            }

            /* renamed from: component1-BvNj-jI, reason: not valid java name and from getter */
            public final java.lang.String getEmail() {
                return this.email;
            }

            /* renamed from: copy-RQoNrjY$default, reason: not valid java name */
            public static /* synthetic */ com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.EmailAlreadyExists m15917copyRQoNrjY$default(com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.EmailAlreadyExists emailAlreadyExists, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = emailAlreadyExists.email;
                }
                return emailAlreadyExists.m15919copyRQoNrjY(str);
            }

            public /* synthetic */ EmailAlreadyExists(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            public /* synthetic */ EmailAlreadyExists(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(i, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult$Status$Cancelled;", "Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult$Status;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes13.dex */
        public static final /* data */ class Cancelled implements com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status {
            public static final com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.Cancelled INSTANCE = new com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.Cancelled();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult$Status$Cancelled$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.Cancelled.$r8$lambda$_KKSCTiDzl_c6mvZL6TqT9ANq3A();
                }
            });

            public final int hashCode() {
                return -600171690;
            }

            private Cancelled() {
            }

            public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$_KKSCTiDzl_c6mvZL6TqT9ANq3A() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.Cancelled", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.Cancelled> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final java.lang.String toString() {
                return "Cancelled";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.Cancelled)) {
                    return false;
                }
                return true;
            }
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status status = this.status;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SignupFlowNavResult(status=");
        sb.append(status);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.status.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, ((com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult) other).status);
    }

    public final com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult copy(com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return new com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult(status);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status getStatus() {
        return this.status;
    }

    public static /* synthetic */ com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult copy$default(com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult signupFlowNavResult, com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status status, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            status = signupFlowNavResult.status;
        }
        return signupFlowNavResult.copy(status);
    }
}
