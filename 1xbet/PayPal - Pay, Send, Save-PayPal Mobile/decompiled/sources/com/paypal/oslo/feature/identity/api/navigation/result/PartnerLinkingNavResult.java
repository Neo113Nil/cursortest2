package com.paypal.oslo.feature.identity.api.navigation.result;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003$%#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult$PartnerLinkingResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult$PartnerLinkingResult;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult$PartnerLinkingResult;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult$PartnerLinkingResult;", "copy", "(Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult$PartnerLinkingResult;)Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_api_prodRelease", "(Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult$PartnerLinkingResult;", "getResult", "Companion", "PartnerLinkingResult", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class PartnerLinkingNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    private final com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult result;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.Companion INSTANCE = new com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult> serializer() {
            return com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PartnerLinkingNavResult(int i, com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult partnerLinkingResult, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.result = partnerLinkingResult;
    }

    public PartnerLinkingNavResult(com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult partnerLinkingResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerLinkingResult, "");
        this.result = partnerLinkingResult;
    }

    public final com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult getResult() {
        return this.result;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult$PartnerLinkingResult;", "", "Companion", "Success", "UserCancelled", "Failure", "Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult$PartnerLinkingResult$Failure;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult$PartnerLinkingResult$Success;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult$PartnerLinkingResult$UserCancelled;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public interface PartnerLinkingResult {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.Companion INSTANCE = com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.Companion.Camera2StreamConfigurationMap;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult$PartnerLinkingResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult$PartnerLinkingResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes12.dex */
        public static final class Companion {
            static final /* synthetic */ com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.Companion Camera2StreamConfigurationMap = new com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.Companion();

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult> serializer() {
                return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.Failure.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.Success.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.UserCancelled.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult$PartnerLinkingResult$Failure$$serializer.INSTANCE, com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult$PartnerLinkingResult$Success$$serializer.INSTANCE, new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.UserCancelled", com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.UserCancelled.INSTANCE, new java.lang.annotation.Annotation[0])}, new java.lang.annotation.Annotation[0]);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult$PartnerLinkingResult$Success;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult$PartnerLinkingResult;", "", "partnerLink", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult$PartnerLinkingResult$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_api_prodRelease", "(Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult$PartnerLinkingResult$Success;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getPartnerLink", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Success implements com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.Success.Companion INSTANCE = new com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.Success.Companion(null);
            private final java.lang.String partnerLink;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult$PartnerLinkingResult$Success$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult$PartnerLinkingResult$Success;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes12.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.Success> serializer() {
                    return com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult$PartnerLinkingResult$Success$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Success(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult$PartnerLinkingResult$Success$$serializer.INSTANCE.getDescriptor());
                }
                this.partnerLink = str;
            }

            public Success(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.partnerLink = str;
            }

            public final java.lang.String getPartnerLink() {
                return this.partnerLink;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.partnerLink;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(partnerLink=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.partnerLink.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.partnerLink, ((com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.Success) other).partnerLink);
            }

            public final com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.Success copy(java.lang.String partnerLink) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerLink, "");
                return new com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.Success(partnerLink);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getPartnerLink() {
                return this.partnerLink;
            }

            public static /* synthetic */ com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.Success copy$default(com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.Success success, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = success.partnerLink;
                }
                return success.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult$PartnerLinkingResult$UserCancelled;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult$PartnerLinkingResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes12.dex */
        public static final /* data */ class UserCancelled implements com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult {
            public static final com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.UserCancelled INSTANCE = new com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.UserCancelled();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult$PartnerLinkingResult$UserCancelled$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.UserCancelled.m15037$r8$lambda$vXmKZMlQUAix1NJHfC1mdGnYq0();
                }
            });

            public final int hashCode() {
                return -163283027;
            }

            private UserCancelled() {
            }

            /* renamed from: $r8$lambda$vXmKZMl-QUAix1NJHfC1mdGnYq0, reason: not valid java name */
            public static /* synthetic */ kotlinx.serialization.KSerializer m15037$r8$lambda$vXmKZMlQUAix1NJHfC1mdGnYq0() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.UserCancelled", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.UserCancelled> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final java.lang.String toString() {
                return "UserCancelled";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.UserCancelled)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult$PartnerLinkingResult$Failure;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult$PartnerLinkingResult;", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError;", "error", "<init>", "(Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError;", "copy", "(Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError;)Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult$PartnerLinkingResult$Failure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_api_prodRelease", "(Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult$PartnerLinkingResult$Failure;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError;", "getError", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Failure implements com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult {
            private final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError error;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.Failure.Companion INSTANCE = new com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.Failure.Companion(null);
            private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult$PartnerLinkingResult$Failure$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer serializer;
                    serializer = com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.INSTANCE.serializer();
                    return serializer;
                }
            })};

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult$PartnerLinkingResult$Failure$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult$PartnerLinkingResult$Failure;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes12.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.Failure> serializer() {
                    return com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult$PartnerLinkingResult$Failure$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Failure(int i, com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError partnerLinkingError, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult$PartnerLinkingResult$Failure$$serializer.INSTANCE.getDescriptor());
                }
                this.error = partnerLinkingError;
            }

            public Failure(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError partnerLinkingError) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerLinkingError, "");
                this.error = partnerLinkingError;
            }

            public final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError getError() {
                return this.error;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError partnerLinkingError = this.error;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failure(error=");
                sb.append(partnerLinkingError);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.error.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.Failure) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.Failure) other).error);
            }

            public final com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.Failure copy(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                return new com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.Failure(error);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError getError() {
                return this.error;
            }

            public static /* synthetic */ com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.Failure copy$default(com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.Failure failure, com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError partnerLinkingError, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    partnerLinkingError = failure.error;
                }
                return failure.copy(partnerLinkingError);
            }
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult partnerLinkingResult = this.result;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PartnerLinkingNavResult(result=");
        sb.append(partnerLinkingResult);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.result.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult) other).result);
    }

    public final com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult copy(com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        return new com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult(result);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult getResult() {
        return this.result;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult copy$default(com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult partnerLinkingNavResult, com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult partnerLinkingResult, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            partnerLinkingResult = partnerLinkingNavResult.result;
        }
        return partnerLinkingNavResult.copy(partnerLinkingResult);
    }
}
