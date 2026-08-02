package com.paypal.oslo.feature.oneonboarding.api.domain;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00112\u00020\u0001:\u0003\u0012\u0013\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/ProgressType;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/ProgressType;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "ContinuousProgress", "SegmentedProgress", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/ProgressType$ContinuousProgress;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/ProgressType$SegmentedProgress;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class ProgressType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.Companion INSTANCE = new com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.$r8$lambda$fvIEP4LKFVy8hygNbCRFX74WhMM();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/ProgressType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/ProgressType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private ProgressType() {
    }

    public /* synthetic */ ProgressType(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/ProgressType$ContinuousProgress;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/ProgressType;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes13.dex */
    public static final class ContinuousProgress extends com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType {
        public static final com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.ContinuousProgress INSTANCE = new com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.ContinuousProgress();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType$ContinuousProgress$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.ContinuousProgress.$r8$lambda$4ZbRuo2K1LbsoBd8Q2rmpqQG0ms();
            }
        });

        private ContinuousProgress() {
            super(null);
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$4ZbRuo2K1LbsoBd8Q2rmpqQG0ms() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.ContinuousProgress", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.ContinuousProgress> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/ProgressType$SegmentedProgress;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/ProgressType;", "", "currentSegment", "totalSegments", "<init>", "(II)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()I", "component2", "copy", "(II)Lcom/paypal/oslo/feature/oneonboarding/api/domain/ProgressType$SegmentedProgress;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$one_onboarding_api_prodRelease", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/ProgressType$SegmentedProgress;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", com.visa.cbp.getEncExpo.warmup, "getCurrentSegment", "getTotalSegments", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class SegmentedProgress extends com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.SegmentedProgress.Companion INSTANCE = new com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.SegmentedProgress.Companion(null);
        private final int currentSegment;
        private final int totalSegments;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/ProgressType$SegmentedProgress$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/ProgressType$SegmentedProgress;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes13.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.SegmentedProgress> serializer() {
                return com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType$SegmentedProgress$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public SegmentedProgress(int i, int i2) {
            super(null);
            this.currentSegment = i;
            this.totalSegments = i2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SegmentedProgress(int i, int i2, int i3, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType$SegmentedProgress$$serializer.INSTANCE.getDescriptor());
            }
            this.currentSegment = i2;
            this.totalSegments = i3;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$one_onboarding_api_prodRelease(com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.SegmentedProgress self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.write$Self(self, output, serialDesc);
            output.encodeIntElement(serialDesc, 0, self.currentSegment);
            output.encodeIntElement(serialDesc, 1, self.totalSegments);
        }

        public final int getCurrentSegment() {
            return this.currentSegment;
        }

        public final int getTotalSegments() {
            return this.totalSegments;
        }

        public final java.lang.String toString() {
            int i = this.currentSegment;
            int i2 = this.totalSegments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SegmentedProgress(currentSegment=");
            sb.append(i);
            sb.append(", totalSegments=");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.currentSegment) * 31) + java.lang.Integer.hashCode(this.totalSegments);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.SegmentedProgress)) {
                return false;
            }
            com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.SegmentedProgress segmentedProgress = (com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.SegmentedProgress) other;
            return this.currentSegment == segmentedProgress.currentSegment && this.totalSegments == segmentedProgress.totalSegments;
        }

        public final com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.SegmentedProgress copy(int currentSegment, int totalSegments) {
            return new com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.SegmentedProgress(currentSegment, totalSegments);
        }

        /* renamed from: component2, reason: from getter */
        public final int getTotalSegments() {
            return this.totalSegments;
        }

        /* renamed from: component1, reason: from getter */
        public final int getCurrentSegment() {
            return this.currentSegment;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.SegmentedProgress copy$default(com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.SegmentedProgress segmentedProgress, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = segmentedProgress.currentSegment;
            }
            if ((i3 & 2) != 0) {
                i2 = segmentedProgress.totalSegments;
            }
            return segmentedProgress.copy(i, i2);
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$fvIEP4LKFVy8hygNbCRFX74WhMM() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.ContinuousProgress.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.SegmentedProgress.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.ContinuousProgress", com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.ContinuousProgress.INSTANCE, new java.lang.annotation.Annotation[0]), com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType$SegmentedProgress$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ ProgressType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
