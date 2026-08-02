package com.paypal.oslo.feature.verificationcapture.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "", "<init>", "(Ljava/lang/String;I)V", com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.FRONT, com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.BACK}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DocumentSide {
    public static final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide BACK;
    public static final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide FRONT;
    private static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private DocumentSide(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide = new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide(com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.FRONT, 0);
        FRONT = documentSide;
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide2 = new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide(com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.BACK, 1);
        BACK = documentSide2;
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide[] documentSideArr = {documentSide, documentSide2};
        getHighSpeedVideoFpsRanges = documentSideArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(documentSideArr);
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide[] values() {
        return (com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide) java.lang.Enum.valueOf(com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
