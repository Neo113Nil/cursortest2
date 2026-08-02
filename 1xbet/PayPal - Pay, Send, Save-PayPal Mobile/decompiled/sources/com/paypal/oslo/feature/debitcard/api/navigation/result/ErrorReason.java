package com.paypal.oslo.feature.debitcard.api.navigation.result;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0002\u0082\u0001\u0004\u0007\b\t\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/navigation/result/ErrorReason;", "", "Companion", "InternetConnectionError", "ApiError", "StepUpFailedError", "StepUpDeclinedError", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/ErrorReason$ApiError;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/ErrorReason$InternetConnectionError;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/ErrorReason$StepUpDeclinedError;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/ErrorReason$StepUpFailedError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public interface ErrorReason {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.Companion INSTANCE = com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.Companion.getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/navigation/result/ErrorReason$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/ErrorReason;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.Companion getHighSpeedVideoSizes = new com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.Companion();

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason> serializer() {
            return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.ApiError.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.InternetConnectionError.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.StepUpDeclinedError.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.StepUpFailedError.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.ApiError", com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.ApiError.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.InternetConnectionError", com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.InternetConnectionError.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.StepUpDeclinedError", com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.StepUpDeclinedError.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.StepUpFailedError", com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.StepUpFailedError.INSTANCE, new java.lang.annotation.Annotation[0])}, new java.lang.annotation.Annotation[0]);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/navigation/result/ErrorReason$InternetConnectionError;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/ErrorReason;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes12.dex */
    public static final /* data */ class InternetConnectionError implements com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason {
        public static final com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.InternetConnectionError INSTANCE = new com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.InternetConnectionError();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason$InternetConnectionError$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.InternetConnectionError.$r8$lambda$qnjWqSFcc7e2cOForkM0W1SbXxQ();
            }
        });
        public static final int $stable = 8;

        public final int hashCode() {
            return -32126151;
        }

        private InternetConnectionError() {
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$qnjWqSFcc7e2cOForkM0W1SbXxQ() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.InternetConnectionError", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.InternetConnectionError> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "InternetConnectionError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.InternetConnectionError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/navigation/result/ErrorReason$ApiError;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/ErrorReason;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes12.dex */
    public static final /* data */ class ApiError implements com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason {
        public static final com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.ApiError INSTANCE = new com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.ApiError();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason$ApiError$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.ApiError.$r8$lambda$bGsMd4nqFaVhw6KNXXWfj5czvGU();
            }
        });
        public static final int $stable = 8;

        public final int hashCode() {
            return 604454686;
        }

        private ApiError() {
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$bGsMd4nqFaVhw6KNXXWfj5czvGU() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.ApiError", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.ApiError> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "ApiError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.ApiError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/navigation/result/ErrorReason$StepUpFailedError;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/ErrorReason;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes12.dex */
    public static final /* data */ class StepUpFailedError implements com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason {
        public static final com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.StepUpFailedError INSTANCE = new com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.StepUpFailedError();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason$StepUpFailedError$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.StepUpFailedError.$r8$lambda$7pdNaW_q54pFOi_Aroaddhw9png();
            }
        });
        public static final int $stable = 8;

        public final int hashCode() {
            return -316189260;
        }

        private StepUpFailedError() {
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$7pdNaW_q54pFOi_Aroaddhw9png() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.StepUpFailedError", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.StepUpFailedError> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "StepUpFailedError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.StepUpFailedError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/navigation/result/ErrorReason$StepUpDeclinedError;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/ErrorReason;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes12.dex */
    public static final /* data */ class StepUpDeclinedError implements com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason {
        public static final com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.StepUpDeclinedError INSTANCE = new com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.StepUpDeclinedError();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason$StepUpDeclinedError$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.StepUpDeclinedError.$r8$lambda$qSakXIRP3CynogWZgnnfb5VmWpE();
            }
        });
        public static final int $stable = 8;

        public final int hashCode() {
            return -413833693;
        }

        private StepUpDeclinedError() {
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$qSakXIRP3CynogWZgnnfb5VmWpE() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.StepUpDeclinedError", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.StepUpDeclinedError> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "StepUpDeclinedError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.StepUpDeclinedError)) {
                return false;
            }
            return true;
        }
    }
}
