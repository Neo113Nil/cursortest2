package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b1\u0018\u0000 \u00112\u00020\u0001:\u0007\u0012\u0013\u0014\u0015\u0016\u0017\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0006\u0018\u0019\u001a\u001b\u001c\u001d"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "Network", "CriticalFieldsMissing", "PartialDataAvailable", "InvalidResponse", "MaxPaymentsThresholdReached", "Default", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError$CriticalFieldsMissing;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError$Default;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError$InvalidResponse;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError$MaxPaymentsThresholdReached;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError$Network;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError$PartialDataAvailable;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class PaymentError {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.m18150$r8$lambda$2Tw51lxoHDaXml9fE9MkqJ1Iko();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private PaymentError() {
    }

    public /* synthetic */ PaymentError(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError$Network;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final /* data */ class Network extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.Network INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.Network();

        public final int hashCode() {
            return 2097806972;
        }

        private Network() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Network";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.Network)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ \u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError$CriticalFieldsMissing;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError;", "", "", "affectedPaths", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError$CriticalFieldsMissing;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError$CriticalFieldsMissing;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/List;", "getAffectedPaths", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class CriticalFieldsMissing extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError {
        private final java.util.List<java.lang.String> affectedPaths;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.CriticalFieldsMissing.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.CriticalFieldsMissing.Companion(null);
        public static final int $stable = 8;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError$CriticalFieldsMissing$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.CriticalFieldsMissing.m18151$r8$lambda$7yRxjw_jjK5GkKMJ22JxNlsXzE();
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError$CriticalFieldsMissing$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError$CriticalFieldsMissing;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes14.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.CriticalFieldsMissing> serializer() {
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError$CriticalFieldsMissing$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ CriticalFieldsMissing(int i, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if ((i & 1) == 0) {
                this.affectedPaths = kotlin.collections.CollectionsKt.emptyList();
            } else {
                this.affectedPaths = list;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CriticalFieldsMissing(java.util.List<java.lang.String> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.affectedPaths = list;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.CriticalFieldsMissing self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.write$Self(self, output, serialDesc);
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            if (output.shouldEncodeElementDefault(serialDesc, 0) || !kotlin.jvm.internal.Intrinsics.areEqual(self.affectedPaths, kotlin.collections.CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.affectedPaths);
            }
        }

        public /* synthetic */ CriticalFieldsMissing(java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        public final java.util.List<java.lang.String> getAffectedPaths() {
            return this.affectedPaths;
        }

        /* renamed from: $r8$lambda$7yRxjw_jjK5GkKMJ22J-xNlsXzE, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m18151$r8$lambda$7yRxjw_jjK5GkKMJ22JxNlsXzE() {
            return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE);
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.String> list = this.affectedPaths;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CriticalFieldsMissing(affectedPaths=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.affectedPaths.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.CriticalFieldsMissing) && kotlin.jvm.internal.Intrinsics.areEqual(this.affectedPaths, ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.CriticalFieldsMissing) other).affectedPaths);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.CriticalFieldsMissing copy(java.util.List<java.lang.String> affectedPaths) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(affectedPaths, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.CriticalFieldsMissing(affectedPaths);
        }

        public final java.util.List<java.lang.String> component1() {
            return this.affectedPaths;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.CriticalFieldsMissing copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.CriticalFieldsMissing criticalFieldsMissing, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = criticalFieldsMissing.affectedPaths;
            }
            return criticalFieldsMissing.copy(list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CriticalFieldsMissing() {
            this((java.util.List) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ \u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError$PartialDataAvailable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError;", "", "", "affectedPaths", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError$PartialDataAvailable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError$PartialDataAvailable;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/List;", "getAffectedPaths", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class PartialDataAvailable extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError {
        private final java.util.List<java.lang.String> affectedPaths;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.PartialDataAvailable.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.PartialDataAvailable.Companion(null);
        public static final int $stable = 8;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError$PartialDataAvailable$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.PartialDataAvailable.$r8$lambda$n1vHFz1MTuHDTI3alkYXm_3ztfg();
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError$PartialDataAvailable$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError$PartialDataAvailable;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes14.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.PartialDataAvailable> serializer() {
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError$PartialDataAvailable$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ PartialDataAvailable(int i, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if ((i & 1) == 0) {
                this.affectedPaths = kotlin.collections.CollectionsKt.emptyList();
            } else {
                this.affectedPaths = list;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PartialDataAvailable(java.util.List<java.lang.String> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.affectedPaths = list;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.PartialDataAvailable self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.write$Self(self, output, serialDesc);
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            if (output.shouldEncodeElementDefault(serialDesc, 0) || !kotlin.jvm.internal.Intrinsics.areEqual(self.affectedPaths, kotlin.collections.CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.affectedPaths);
            }
        }

        public /* synthetic */ PartialDataAvailable(java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        public final java.util.List<java.lang.String> getAffectedPaths() {
            return this.affectedPaths;
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$n1vHFz1MTuHDTI3alkYXm_3ztfg() {
            return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE);
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.String> list = this.affectedPaths;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PartialDataAvailable(affectedPaths=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.affectedPaths.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.PartialDataAvailable) && kotlin.jvm.internal.Intrinsics.areEqual(this.affectedPaths, ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.PartialDataAvailable) other).affectedPaths);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.PartialDataAvailable copy(java.util.List<java.lang.String> affectedPaths) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(affectedPaths, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.PartialDataAvailable(affectedPaths);
        }

        public final java.util.List<java.lang.String> component1() {
            return this.affectedPaths;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.PartialDataAvailable copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.PartialDataAvailable partialDataAvailable, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = partialDataAvailable.affectedPaths;
            }
            return partialDataAvailable.copy(list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PartialDataAvailable() {
            this((java.util.List) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError$InvalidResponse;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final /* data */ class InvalidResponse extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.InvalidResponse INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.InvalidResponse();

        public final int hashCode() {
            return 184940966;
        }

        private InvalidResponse() {
            super(null);
        }

        public final java.lang.String toString() {
            return "InvalidResponse";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.InvalidResponse)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError$MaxPaymentsThresholdReached;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final /* data */ class MaxPaymentsThresholdReached extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.MaxPaymentsThresholdReached INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.MaxPaymentsThresholdReached();

        public final int hashCode() {
            return -2045382010;
        }

        private MaxPaymentsThresholdReached() {
            super(null);
        }

        public final java.lang.String toString() {
            return "MaxPaymentsThresholdReached";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.MaxPaymentsThresholdReached)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError$Default;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final /* data */ class Default extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.Default INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.Default();

        public final int hashCode() {
            return 1799125647;
        }

        private Default() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Default";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.Default)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: $r8$lambda$2Tw51lxoHDaXml9fE9-MkqJ1Iko, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m18150$r8$lambda$2Tw51lxoHDaXml9fE9MkqJ1Iko() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.CriticalFieldsMissing.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.PartialDataAvailable.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError$CriticalFieldsMissing$$serializer.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError$PartialDataAvailable$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ PaymentError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
