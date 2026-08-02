package com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00112\u00020\u0001:\u0006\u0012\u0013\u0014\u0015\u0016\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/InvoiceStatus;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/InvoiceStatus;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "Sent", "Paid", "Overdue", "Cancelled", "Draft", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/InvoiceStatus$Cancelled;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/InvoiceStatus$Draft;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/InvoiceStatus$Overdue;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/InvoiceStatus$Paid;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/InvoiceStatus$Sent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class InvoiceStatus {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Companion INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.$r8$lambda$MIAD3_7cIe5A03XvU_dL975PorY();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/InvoiceStatus$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/InvoiceStatus;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private InvoiceStatus() {
    }

    public /* synthetic */ InvoiceStatus(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/InvoiceStatus$Sent;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/InvoiceStatus;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes11.dex */
    public static final /* data */ class Sent extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Sent INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Sent();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus$Sent$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Sent.$r8$lambda$xGyM7DQGPHGRr5gVmobJC9OBvZI();
            }
        });

        public final int hashCode() {
            return -1465530663;
        }

        private Sent() {
            super(null);
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$xGyM7DQGPHGRr5gVmobJC9OBvZI() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Sent", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Sent> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "Sent";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Sent)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/InvoiceStatus$Paid;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/InvoiceStatus;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes11.dex */
    public static final /* data */ class Paid extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Paid INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Paid();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus$Paid$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Paid.$r8$lambda$E2h9XzT5jPWxkwFcFSnlt3fyb7U();
            }
        });

        public final int hashCode() {
            return -1465624051;
        }

        private Paid() {
            super(null);
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$E2h9XzT5jPWxkwFcFSnlt3fyb7U() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Paid", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Paid> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "Paid";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Paid)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/InvoiceStatus$Overdue;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/InvoiceStatus;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes11.dex */
    public static final /* data */ class Overdue extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Overdue INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Overdue();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus$Overdue$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Overdue.m13365$r8$lambda$3xlWnLD6C6AEwAqI1bDIyUrywg();
            }
        });

        public final int hashCode() {
            return -58040897;
        }

        private Overdue() {
            super(null);
        }

        /* renamed from: $r8$lambda$3xl-WnLD6C6AEwAqI1bDIyUrywg, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m13365$r8$lambda$3xlWnLD6C6AEwAqI1bDIyUrywg() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Overdue", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Overdue> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "Overdue";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Overdue)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/InvoiceStatus$Cancelled;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/InvoiceStatus;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes11.dex */
    public static final /* data */ class Cancelled extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Cancelled INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Cancelled();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus$Cancelled$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Cancelled.$r8$lambda$9Xt0ANjqtZpQxaZmIQKGKEK5RHM();
            }
        });

        public final int hashCode() {
            return 1296405168;
        }

        private Cancelled() {
            super(null);
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$9Xt0ANjqtZpQxaZmIQKGKEK5RHM() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Cancelled", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Cancelled> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "Cancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Cancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/InvoiceStatus$Draft;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/InvoiceStatus;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes11.dex */
    public static final /* data */ class Draft extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Draft INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Draft();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus$Draft$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Draft.m13364$r8$lambda$CY386go_TI7LWHFHzp20xO_mLM();
            }
        });

        public final int hashCode() {
            return 1799711360;
        }

        private Draft() {
            super(null);
        }

        /* renamed from: $r8$lambda$CY386go_TI7LWHFHzp20-xO_mLM, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m13364$r8$lambda$CY386go_TI7LWHFHzp20xO_mLM() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Draft", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Draft> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "Draft";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Draft)) {
                return false;
            }
            return true;
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$MIAD3_7cIe5A03XvU_dL975PorY() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Cancelled.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Draft.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Overdue.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Paid.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Sent.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Cancelled", com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Cancelled.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Draft", com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Draft.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Overdue", com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Overdue.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Paid", com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Paid.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Sent", com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Sent.INSTANCE, new java.lang.annotation.Annotation[0])}, new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ InvoiceStatus(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
