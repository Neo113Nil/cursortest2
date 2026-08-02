package com.payair.logic.remote.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/payair/logic/remote/model/ResponseStartTokenizeDto;", "Lcom/payair/model/StartTokenizeData;", "toStartTokenizeData", "(Lcom/payair/logic/remote/model/ResponseStartTokenizeDto;)Lcom/payair/model/StartTokenizeData;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ResponseStartTokenizeDtoKt {
    public static final com.payair.model.StartTokenizeData toStartTokenizeData(com.payair.logic.remote.model.ResponseStartTokenizeDto responseStartTokenizeDto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseStartTokenizeDto, "");
        return new com.payair.model.StartTokenizeData(responseStartTokenizeDto.getTermsAndConditionsAssetId(), responseStartTokenizeDto.getTokenizationSessionId(), responseStartTokenizeDto.getCardReference(), responseStartTokenizeDto.getLast4Digits(), responseStartTokenizeDto.getAssetUrl(), responseStartTokenizeDto.getExpirationTimestamp(), responseStartTokenizeDto.getIssuerPanReference(), responseStartTokenizeDto.getPanEnrollmentId());
    }
}
