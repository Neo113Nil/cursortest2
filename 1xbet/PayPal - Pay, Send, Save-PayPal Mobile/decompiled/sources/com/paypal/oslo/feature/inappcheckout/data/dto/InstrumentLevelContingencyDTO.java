package com.paypal.oslo.feature.inappcheckout.data.dto;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bq\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/dto/InstrumentLevelContingencyDTO;", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/ContingencyDTO;", "", "getFundingInstrument", "()Ljava/lang/String;", "fundingInstrument", "Companion", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/BankAccountBalanceRequiredContingencyDTO;", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/InstrumentLevelUnknownContingencyDTO;", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/PreAuthRequiredContingencyDTO;", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/ThreeDsContingencyDTO;", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/UserConsentForBankAccountInfoContingencyDTO;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes13.dex */
public interface InstrumentLevelContingencyDTO extends com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.data.dto.InstrumentLevelContingencyDTO.Companion INSTANCE = com.paypal.oslo.feature.inappcheckout.data.dto.InstrumentLevelContingencyDTO.Companion.getHighResolutionOutputSizeshNQ4ISI;

    java.lang.String getFundingInstrument();

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/dto/InstrumentLevelContingencyDTO$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/InstrumentLevelContingencyDTO;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.dto.InstrumentLevelContingencyDTO.Companion getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.inappcheckout.data.dto.InstrumentLevelContingencyDTO.Companion();

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.inappcheckout.data.dto.InstrumentLevelContingencyDTO> serializer() {
            return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.inappcheckout.data.dto.InstrumentLevelContingencyDTO", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.data.dto.InstrumentLevelContingencyDTO.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.data.dto.BankAccountBalanceRequiredContingencyDTO.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.data.dto.InstrumentLevelUnknownContingencyDTO.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.data.dto.PreAuthRequiredContingencyDTO.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.data.dto.ThreeDsContingencyDTO.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.data.dto.UserConsentForBankAccountInfoContingencyDTO.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.inappcheckout.data.dto.BankAccountBalanceRequiredContingencyDTO$$serializer.INSTANCE, com.paypal.oslo.feature.inappcheckout.data.dto.InstrumentLevelUnknownContingencyDTO$$serializer.INSTANCE, com.paypal.oslo.feature.inappcheckout.data.dto.PreAuthRequiredContingencyDTO$$serializer.INSTANCE, com.paypal.oslo.feature.inappcheckout.data.dto.ThreeDsContingencyDTO$$serializer.INSTANCE, com.paypal.oslo.feature.inappcheckout.data.dto.UserConsentForBankAccountInfoContingencyDTO$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
        }
    }
}
