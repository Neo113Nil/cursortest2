package com.paypal.oslo.feature.activity.api.models;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00112\u00020\u0001:\u0004\u0012\u0013\u0014\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0003\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/models/ActivityMoneyMovementDirection;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/activity/api/models/ActivityMoneyMovementDirection;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "Credit", "Debit", "Unknown", "Lcom/paypal/oslo/feature/activity/api/models/ActivityMoneyMovementDirection$Credit;", "Lcom/paypal/oslo/feature/activity/api/models/ActivityMoneyMovementDirection$Debit;", "Lcom/paypal/oslo/feature/activity/api/models/ActivityMoneyMovementDirection$Unknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class ActivityMoneyMovementDirection {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Companion INSTANCE = new com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.$r8$lambda$0fU4LKQLgJ7_Oyusa8xKxnxu7L8();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/models/ActivityMoneyMovementDirection$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/activity/api/models/ActivityMoneyMovementDirection;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private ActivityMoneyMovementDirection() {
    }

    public /* synthetic */ ActivityMoneyMovementDirection(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/models/ActivityMoneyMovementDirection$Credit;", "Lcom/paypal/oslo/feature/activity/api/models/ActivityMoneyMovementDirection;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class Credit extends com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Credit INSTANCE = new com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Credit();

        public final int hashCode() {
            return -1567946266;
        }

        private Credit() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Credit";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Credit)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/models/ActivityMoneyMovementDirection$Debit;", "Lcom/paypal/oslo/feature/activity/api/models/ActivityMoneyMovementDirection;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class Debit extends com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Debit INSTANCE = new com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Debit();

        public final int hashCode() {
            return 1612522591;
        }

        private Debit() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Debit";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Debit)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/models/ActivityMoneyMovementDirection$Unknown;", "Lcom/paypal/oslo/feature/activity/api/models/ActivityMoneyMovementDirection;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class Unknown extends com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Unknown INSTANCE = new com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Unknown();

        public final int hashCode() {
            return 1619798781;
        }

        private Unknown() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Unknown";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Unknown)) {
                return false;
            }
            return true;
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$0fU4LKQLgJ7_Oyusa8xKxnxu7L8() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.class), new kotlin.reflect.KClass[0], new kotlinx.serialization.KSerializer[0], new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ ActivityMoneyMovementDirection(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
