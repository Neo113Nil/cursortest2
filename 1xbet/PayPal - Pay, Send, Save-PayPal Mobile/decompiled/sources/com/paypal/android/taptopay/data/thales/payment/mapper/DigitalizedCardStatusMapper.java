package com.paypal.android.taptopay.data.thales.payment.mapper;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/payment/mapper/DigitalizedCardStatusMapper;", "Lcom/paypal/android/taptopay/domain/core/Mapper;", "Lcom/gemalto/mfs/mwsdk/dcm/DigitalizedCardStatus;", "Lcom/paypal/android/taptopay/domain/model/payment/DigitizedCardStatus;", "Lcom/paypal/android/taptopay/data/thales/payment/mapper/DomainDigitizedCardStatus;", "Lcom/gemalto/mfs/mwsdk/dcm/DigitalizedCardState;", "Lcom/paypal/android/taptopay/domain/model/card/DigitizedCard$Status;", "digitalizedCardStateMapper", "<init>", "(Lcom/paypal/android/taptopay/domain/core/Mapper;)V", "input", "map", "(Lcom/gemalto/mfs/mwsdk/dcm/DigitalizedCardStatus;)Lcom/paypal/android/taptopay/domain/model/payment/DigitizedCardStatus;", "Camera2StreamConfigurationMap", "Lcom/paypal/android/taptopay/domain/core/Mapper;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DigitalizedCardStatusMapper implements com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus, com.paypal.android.taptopay.domain.model.payment.DigitizedCardStatus> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState, com.paypal.android.taptopay.domain.model.card.DigitizedCard.Status> getHighSpeedVideoFpsRangesFor;

    public DigitalizedCardStatusMapper(com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState, com.paypal.android.taptopay.domain.model.card.DigitizedCard.Status> mapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapper, "");
        this.getHighSpeedVideoFpsRangesFor = mapper;
    }

    public /* synthetic */ DigitalizedCardStatusMapper(com.paypal.android.taptopay.data.thales.payment.mapper.DigitalizedCardStateMapper digitalizedCardStateMapper, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.paypal.android.taptopay.data.thales.payment.mapper.DigitalizedCardStateMapper() : digitalizedCardStateMapper);
    }

    @Override // com.paypal.android.taptopay.domain.core.Mapper
    public final com.paypal.android.taptopay.domain.model.payment.DigitizedCardStatus map(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.lang.String expiryDate = input.getExpiryDate();
        int numberOfPaymentsLeft = input.getNumberOfPaymentsLeft();
        com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState, com.paypal.android.taptopay.domain.model.card.DigitizedCard.Status> mapper = this.getHighSpeedVideoFpsRangesFor;
        com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState state = input.getState();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(state, "");
        return new com.paypal.android.taptopay.domain.model.payment.DigitizedCardStatus(expiryDate, numberOfPaymentsLeft, mapper.map(state), input.needsReplenishment());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DigitalizedCardStatusMapper() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
