package com.paypal.android.taptopay.data.thales.payment.mapper;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001Bk\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u00060\tj\u0002`\n0\u0001\u0012\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u00060\rj\u0002`\u000e0\u0001\u0012\u0018\b\u0002\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR$\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u00060\rj\u0002`\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR$\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u00060\tj\u0002`\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/payment/mapper/TransactionContextMapper;", "Lcom/paypal/android/taptopay/domain/core/Mapper;", "Lcom/gemalto/mfs/mwsdk/payment/engine/TransactionContext;", "Lcom/paypal/android/taptopay/domain/model/payment/TransactionContext;", "Lcom/paypal/android/taptopay/data/thales/payment/mapper/DomainTransactionContext;", "", "", "byteArrayBCDStringMapper", "Lcom/gemalto/mfs/mwsdk/dcm/DigitalizedCardStatus;", "Lcom/paypal/android/taptopay/domain/model/payment/DigitizedCardStatus;", "Lcom/paypal/android/taptopay/data/thales/payment/mapper/DomainDigitizedCardStatus;", "digitalizedCardStatusMapper", "Lcom/gemalto/mfs/mwsdk/payment/engine/CardScheme;", "Lcom/paypal/android/taptopay/domain/model/CardScheme;", "Lcom/paypal/android/taptopay/data/thales/payment/mapper/DomainCardScheme;", "cardSchemeMapper", "", "Lcom/paypal/android/taptopay/domain/model/payment/TransactionType;", "Lcom/paypal/android/taptopay/data/thales/payment/mapper/DomainTransactionType;", "byteTransactionTypeMapper", "<init>", "(Lcom/paypal/android/taptopay/domain/core/Mapper;Lcom/paypal/android/taptopay/domain/core/Mapper;Lcom/paypal/android/taptopay/domain/core/Mapper;Lcom/paypal/android/taptopay/domain/core/Mapper;)V", "input", "map", "(Lcom/gemalto/mfs/mwsdk/payment/engine/TransactionContext;)Lcom/paypal/android/taptopay/domain/model/payment/TransactionContext;", "Camera2StreamConfigurationMap", "Lcom/paypal/android/taptopay/domain/core/Mapper;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TransactionContextMapper implements com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.payment.engine.TransactionContext, com.paypal.android.taptopay.domain.model.payment.TransactionContext> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.core.Mapper<byte[], java.lang.String> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus, com.paypal.android.taptopay.domain.model.payment.DigitizedCardStatus> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.payment.engine.CardScheme, com.paypal.android.taptopay.domain.model.CardScheme> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.core.Mapper<java.lang.Byte, com.paypal.android.taptopay.domain.model.payment.TransactionType> getHighSpeedVideoFpsRangesFor;

    public TransactionContextMapper(com.paypal.android.taptopay.domain.core.Mapper<byte[], java.lang.String> mapper, com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus, com.paypal.android.taptopay.domain.model.payment.DigitizedCardStatus> mapper2, com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.payment.engine.CardScheme, com.paypal.android.taptopay.domain.model.CardScheme> mapper3, com.paypal.android.taptopay.domain.core.Mapper<java.lang.Byte, com.paypal.android.taptopay.domain.model.payment.TransactionType> mapper4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapper2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapper3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapper4, "");
        this.getHighSpeedVideoSizes = mapper;
        this.Camera2StreamConfigurationMap = mapper2;
        this.getHighResolutionOutputSizeshNQ4ISI = mapper3;
        this.getHighSpeedVideoFpsRangesFor = mapper4;
    }

    public /* synthetic */ TransactionContextMapper(com.paypal.android.taptopay.data.thales.payment.mapper.BCDStringMapper bCDStringMapper, com.paypal.android.taptopay.data.thales.payment.mapper.DigitalizedCardStatusMapper digitalizedCardStatusMapper, com.paypal.android.taptopay.data.thales.payment.mapper.CardSchemeMapper cardSchemeMapper, com.paypal.android.taptopay.data.thales.payment.mapper.TransactionTypeMapper transactionTypeMapper, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.paypal.android.taptopay.data.thales.payment.mapper.BCDStringMapper() : bCDStringMapper, (i & 2) != 0 ? new com.paypal.android.taptopay.data.thales.payment.mapper.DigitalizedCardStatusMapper(null, 1, null) : digitalizedCardStatusMapper, (i & 4) != 0 ? new com.paypal.android.taptopay.data.thales.payment.mapper.CardSchemeMapper() : cardSchemeMapper, (i & 8) != 0 ? new com.paypal.android.taptopay.data.thales.payment.mapper.TransactionTypeMapper() : transactionTypeMapper);
    }

    @Override // com.paypal.android.taptopay.domain.core.Mapper
    public final com.paypal.android.taptopay.domain.model.payment.TransactionContext map(com.gemalto.mfs.mwsdk.payment.engine.TransactionContext input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.lang.String aid = input.getAid();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aid, "");
        double amount = input.getAmount();
        com.paypal.android.taptopay.domain.core.Mapper<byte[], java.lang.String> mapper = this.getHighSpeedVideoSizes;
        byte[] currencyCode = input.getCurrencyCode();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currencyCode, "");
        java.lang.String map = mapper.map(currencyCode);
        com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus, com.paypal.android.taptopay.domain.model.payment.DigitizedCardStatus> mapper2 = this.Camera2StreamConfigurationMap;
        com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus digitalizedCardStatus = input.getDigitalizedCardStatus();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(digitalizedCardStatus, "");
        com.paypal.android.taptopay.domain.model.payment.DigitizedCardStatus map2 = mapper2.map(digitalizedCardStatus);
        com.paypal.android.taptopay.domain.core.Mapper<byte[], java.lang.String> mapper3 = this.getHighSpeedVideoSizes;
        byte[] rawAmount = input.getRawAmount();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rawAmount, "");
        double parseDouble = java.lang.Double.parseDouble(mapper3.map(rawAmount));
        com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.payment.engine.CardScheme, com.paypal.android.taptopay.domain.model.CardScheme> mapper4 = this.getHighResolutionOutputSizeshNQ4ISI;
        com.gemalto.mfs.mwsdk.payment.engine.CardScheme scheme = input.getScheme();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(scheme, "");
        com.paypal.android.taptopay.domain.model.CardScheme map3 = mapper4.map(scheme);
        com.paypal.android.taptopay.domain.core.Mapper<byte[], java.lang.String> mapper5 = this.getHighSpeedVideoSizes;
        byte[] trxDate = input.getTrxDate();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(trxDate, "");
        return new com.paypal.android.taptopay.domain.model.payment.TransactionContext(aid, amount, map, map2, parseDouble, map3, mapper5.map(trxDate), this.getHighSpeedVideoFpsRangesFor.map(java.lang.Byte.valueOf(input.getTrxType())));
    }

    public TransactionContextMapper() {
        this(null, null, null, null, 15, null);
    }
}
