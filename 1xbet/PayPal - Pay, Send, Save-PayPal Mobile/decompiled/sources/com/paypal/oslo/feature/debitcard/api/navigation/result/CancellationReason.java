package com.paypal.oslo.feature.debitcard.api.navigation.result;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/navigation/result/CancellationReason;", "", "Companion", "UserNavigatedBack", "UserClosedFlow", "UserSkippedFlow", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/CancellationReason$UserClosedFlow;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/CancellationReason$UserNavigatedBack;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/CancellationReason$UserSkippedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public interface CancellationReason {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.Companion INSTANCE = com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.Companion.getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/navigation/result/CancellationReason$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/CancellationReason;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.Companion getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.Companion();

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason> serializer() {
            return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserClosedFlow.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserNavigatedBack.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserSkippedFlow.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserClosedFlow", com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserClosedFlow.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserNavigatedBack", com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserNavigatedBack.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserSkippedFlow", com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserSkippedFlow.INSTANCE, new java.lang.annotation.Annotation[0])}, new java.lang.annotation.Annotation[0]);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/navigation/result/CancellationReason$UserNavigatedBack;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/CancellationReason;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes12.dex */
    public static final /* data */ class UserNavigatedBack implements com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason {
        public static final com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserNavigatedBack INSTANCE = new com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserNavigatedBack();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason$UserNavigatedBack$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserNavigatedBack.m14166$r8$lambda$_HYBYVVUzq7AIruscAdkddI8cA();
            }
        });
        public static final int $stable = 8;

        public final int hashCode() {
            return -687129834;
        }

        private UserNavigatedBack() {
        }

        /* renamed from: $r8$lambda$_HYBYVVUzq7AIruscAdkddI-8cA, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m14166$r8$lambda$_HYBYVVUzq7AIruscAdkddI8cA() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserNavigatedBack", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserNavigatedBack> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "UserNavigatedBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserNavigatedBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/navigation/result/CancellationReason$UserClosedFlow;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/CancellationReason;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes12.dex */
    public static final /* data */ class UserClosedFlow implements com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason {
        public static final com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserClosedFlow INSTANCE = new com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserClosedFlow();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason$UserClosedFlow$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserClosedFlow.m14165$r8$lambda$HxZKtrso5AM2fK8GrSh5VxyWew();
            }
        });
        public static final int $stable = 8;

        public final int hashCode() {
            return 1583994814;
        }

        private UserClosedFlow() {
        }

        /* renamed from: $r8$lambda$HxZKtrso5AM2fK8GrS-h5VxyWew, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m14165$r8$lambda$HxZKtrso5AM2fK8GrSh5VxyWew() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserClosedFlow", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserClosedFlow> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "UserClosedFlow";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserClosedFlow)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/navigation/result/CancellationReason$UserSkippedFlow;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/CancellationReason;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes12.dex */
    public static final /* data */ class UserSkippedFlow implements com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason {
        public static final com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserSkippedFlow INSTANCE = new com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserSkippedFlow();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason$UserSkippedFlow$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserSkippedFlow.$r8$lambda$jy0NoKz95AQ4Zegjl2mCPe1wqLc();
            }
        });
        public static final int $stable = 8;

        public final int hashCode() {
            return 1623428602;
        }

        private UserSkippedFlow() {
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$jy0NoKz95AQ4Zegjl2mCPe1wqLc() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserSkippedFlow", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserSkippedFlow> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "UserSkippedFlow";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserSkippedFlow)) {
                return false;
            }
            return true;
        }
    }
}
