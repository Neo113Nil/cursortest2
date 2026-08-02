package com.paypal.oslo.feature.balance.api.models.autoreload;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00112\u00020\u0001:\u0004\u0012\u0013\u0014\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0003\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "ChoiceSheet", "LowBalanceReload", "ScheduledReload", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent$ChoiceSheet;", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent$LowBalanceReload;", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent$ScheduledReload;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class AutoReloadFlowIntent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.Companion INSTANCE = new com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.m11998$r8$lambda$gPMa5OW2s1y9mE9hGvzSKH2uiE();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AutoReloadFlowIntent() {
    }

    public /* synthetic */ AutoReloadFlowIntent(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent$ChoiceSheet;", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes11.dex */
    public static final /* data */ class ChoiceSheet extends com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent {
        public static final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ChoiceSheet INSTANCE = new com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ChoiceSheet();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent$ChoiceSheet$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ChoiceSheet.$r8$lambda$joYtmPBqNYUkxqGynKokH9Q1Wn0();
            }
        });

        public final int hashCode() {
            return -1375438405;
        }

        private ChoiceSheet() {
            super(null);
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$joYtmPBqNYUkxqGynKokH9Q1Wn0() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ChoiceSheet", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ChoiceSheet> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "ChoiceSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ChoiceSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent$LowBalanceReload;", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes11.dex */
    public static final /* data */ class LowBalanceReload extends com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent {
        public static final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.LowBalanceReload INSTANCE = new com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.LowBalanceReload();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent$LowBalanceReload$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.LowBalanceReload.$r8$lambda$JbWYYgQufVhKuxcT5dXUoZu9dSo();
            }
        });

        public final int hashCode() {
            return 512341316;
        }

        private LowBalanceReload() {
            super(null);
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$JbWYYgQufVhKuxcT5dXUoZu9dSo() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.LowBalanceReload", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.LowBalanceReload> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "LowBalanceReload";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.LowBalanceReload)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent$ScheduledReload;", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes11.dex */
    public static final /* data */ class ScheduledReload extends com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent {
        public static final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ScheduledReload INSTANCE = new com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ScheduledReload();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent$ScheduledReload$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ScheduledReload.m11999$r8$lambda$KAwPQz4y5JdYtIuhPgLy1wrCZA();
            }
        });

        public final int hashCode() {
            return 369442723;
        }

        private ScheduledReload() {
            super(null);
        }

        /* renamed from: $r8$lambda$KAw-PQz4y5JdYtIuhPgLy1wrCZA, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m11999$r8$lambda$KAwPQz4y5JdYtIuhPgLy1wrCZA() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ScheduledReload", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ScheduledReload> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "ScheduledReload";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ScheduledReload)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: $r8$lambda$gPMa5OW2s1y9mE9hGv-zSKH2uiE, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m11998$r8$lambda$gPMa5OW2s1y9mE9hGvzSKH2uiE() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ChoiceSheet.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.LowBalanceReload.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ScheduledReload.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ChoiceSheet", com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ChoiceSheet.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.LowBalanceReload", com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.LowBalanceReload.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ScheduledReload", com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ScheduledReload.INSTANCE, new java.lang.annotation.Annotation[0])}, new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ AutoReloadFlowIntent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
