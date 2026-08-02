package com.paypal.oslo.feature.taptopay.domain.model.card.paypal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \f2\u00020\u0001:\u0001\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b\u0082\u0001\u0002\r\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardInfo;", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;", "getType", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;", "type", "", "getBrand", "()Ljava/lang/String;", "brand", "getDescription", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Companion", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/DefaultCardInfo;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayLaterCardInfo;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public interface CardInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo.Companion INSTANCE = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo.Companion.getHighSpeedVideoFpsRangesFor;

    java.lang.String getBrand();

    java.lang.String getDescription();

    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType getType();

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardInfo$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo.Companion getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo.Companion();

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo> serializer() {
            return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DefaultCardInfo.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayLaterCardInfo.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DefaultCardInfo$$serializer.INSTANCE, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayLaterCardInfo$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
        }
    }
}
