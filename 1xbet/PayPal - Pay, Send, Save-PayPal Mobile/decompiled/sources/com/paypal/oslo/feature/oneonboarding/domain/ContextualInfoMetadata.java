package com.paypal.oslo.feature.oneonboarding.domain;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfoMetadata;", "", "Companion", "Lcom/paypal/oslo/feature/oneonboarding/domain/AddressCorrectionMetadata;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public interface ContextualInfoMetadata {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.oneonboarding.domain.ContextualInfoMetadata.Companion INSTANCE = com.paypal.oslo.feature.oneonboarding.domain.ContextualInfoMetadata.Companion.getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfoMetadata$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfoMetadata;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.oneonboarding.domain.ContextualInfoMetadata.Companion getHighSpeedVideoSizes = new com.paypal.oslo.feature.oneonboarding.domain.ContextualInfoMetadata.Companion();

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfoMetadata> serializer() {
            return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.oneonboarding.domain.ContextualInfoMetadata", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.domain.ContextualInfoMetadata.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.domain.AddressCorrectionMetadata.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.oneonboarding.domain.AddressCorrectionMetadata$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
        }
    }
}
