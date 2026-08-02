package com.paypal.oslo.feature.identity.api.navigation.result;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0002\u0082\u0001\u0004\u0007\b\t\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationErrorType;", "", "Companion", "ConfirmationFailed", "NetworkError", "InvalidLink", "Unknown", "Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationErrorType$ConfirmationFailed;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationErrorType$InvalidLink;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationErrorType$NetworkError;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationErrorType$Unknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public interface EmailConfirmationErrorType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.Companion INSTANCE = com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.Companion.getHighSpeedVideoFpsRanges;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationErrorType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationErrorType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.Companion getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.Companion();

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType> serializer() {
            return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.ConfirmationFailed.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.InvalidLink.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.NetworkError.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.Unknown.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.ConfirmationFailed", com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.ConfirmationFailed.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.InvalidLink", com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.InvalidLink.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.NetworkError", com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.NetworkError.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.Unknown", com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.Unknown.INSTANCE, new java.lang.annotation.Annotation[0])}, new java.lang.annotation.Annotation[0]);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationErrorType$ConfirmationFailed;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationErrorType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes12.dex */
    public static final /* data */ class ConfirmationFailed implements com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType {
        public static final com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.ConfirmationFailed INSTANCE = new com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.ConfirmationFailed();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType$ConfirmationFailed$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.ConfirmationFailed.$r8$lambda$OiBGYxSfWwHC9JT0EQs5P163s5s();
            }
        });

        public final int hashCode() {
            return -18182491;
        }

        private ConfirmationFailed() {
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$OiBGYxSfWwHC9JT0EQs5P163s5s() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.ConfirmationFailed", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.ConfirmationFailed> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "ConfirmationFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.ConfirmationFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationErrorType$NetworkError;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationErrorType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes12.dex */
    public static final /* data */ class NetworkError implements com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType {
        public static final com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.NetworkError INSTANCE = new com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.NetworkError();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType$NetworkError$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.NetworkError.$r8$lambda$s0EhONRj7AXvWXCFNlrIFYwq1lU();
            }
        });

        public final int hashCode() {
            return -1391293299;
        }

        private NetworkError() {
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$s0EhONRj7AXvWXCFNlrIFYwq1lU() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.NetworkError", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.NetworkError> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "NetworkError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.NetworkError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationErrorType$InvalidLink;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationErrorType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes12.dex */
    public static final /* data */ class InvalidLink implements com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType {
        public static final com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.InvalidLink INSTANCE = new com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.InvalidLink();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType$InvalidLink$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.InvalidLink.$r8$lambda$oyelt0uMaRzF4W5e8c2kEItZh_U();
            }
        });

        public final int hashCode() {
            return -1551066082;
        }

        private InvalidLink() {
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$oyelt0uMaRzF4W5e8c2kEItZh_U() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.InvalidLink", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.InvalidLink> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "InvalidLink";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.InvalidLink)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationErrorType$Unknown;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationErrorType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes12.dex */
    public static final /* data */ class Unknown implements com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType {
        public static final com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.Unknown INSTANCE = new com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.Unknown();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType$Unknown$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.Unknown.m15035$r8$lambda$zML2iwj2Mim1rC4Gvri2nNrqEs();
            }
        });

        public final int hashCode() {
            return 495113303;
        }

        private Unknown() {
        }

        /* renamed from: $r8$lambda$zML2iwj2Mim1rC4Gvri-2nNrqEs, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m15035$r8$lambda$zML2iwj2Mim1rC4Gvri2nNrqEs() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.Unknown", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.Unknown> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "Unknown";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.Unknown)) {
                return false;
            }
            return true;
        }
    }
}
