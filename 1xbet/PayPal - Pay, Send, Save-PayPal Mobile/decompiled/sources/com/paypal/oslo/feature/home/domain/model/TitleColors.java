package com.paypal.oslo.feature.home.domain.model;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b1\u0018\u0000 \u00112\u00020\u0001:\u0003\u0012\u0013\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/model/TitleColors;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/home/domain/model/TitleColors;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "Base", "Disabled", "Lcom/paypal/oslo/feature/home/domain/model/TitleColors$Base;", "Lcom/paypal/oslo/feature/home/domain/model/TitleColors$Disabled;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class TitleColors {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.home.domain.model.TitleColors.Companion INSTANCE = new com.paypal.oslo.feature.home.domain.model.TitleColors.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.domain.model.TitleColors$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.home.domain.model.TitleColors.$r8$lambda$NvGyQOxu12B4VFnKbFKbKLKBQc8();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.home.domain.model.TitleColors self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/model/TitleColors$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/home/domain/model/TitleColors;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.home.domain.model.TitleColors> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.home.domain.model.TitleColors.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private TitleColors() {
    }

    public /* synthetic */ TitleColors(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/model/TitleColors$Base;", "Lcom/paypal/oslo/feature/home/domain/model/TitleColors;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* data */ class Base extends com.paypal.oslo.feature.home.domain.model.TitleColors {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.home.domain.model.TitleColors.Base INSTANCE = new com.paypal.oslo.feature.home.domain.model.TitleColors.Base();

        public final int hashCode() {
            return -1478006520;
        }

        private Base() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Base";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.domain.model.TitleColors.Base)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/model/TitleColors$Disabled;", "Lcom/paypal/oslo/feature/home/domain/model/TitleColors;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* data */ class Disabled extends com.paypal.oslo.feature.home.domain.model.TitleColors {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.home.domain.model.TitleColors.Disabled INSTANCE = new com.paypal.oslo.feature.home.domain.model.TitleColors.Disabled();

        public final int hashCode() {
            return -1687836365;
        }

        private Disabled() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Disabled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.domain.model.TitleColors.Disabled)) {
                return false;
            }
            return true;
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$NvGyQOxu12B4VFnKbFKbKLKBQc8() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.home.domain.model.TitleColors", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.home.domain.model.TitleColors.class), new kotlin.reflect.KClass[0], new kotlinx.serialization.KSerializer[0], new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ TitleColors(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
