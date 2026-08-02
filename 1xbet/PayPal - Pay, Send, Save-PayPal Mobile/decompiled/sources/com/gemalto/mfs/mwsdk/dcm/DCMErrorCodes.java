package com.gemalto.mfs.mwsdk.dcm;

/* loaded from: classes3.dex */
public enum DCMErrorCodes {
    TOKENID_MISSING(2000),
    DC_TOKENID_MISSING(2001),
    SCHEME_MISSING(2002),
    DC_SCHEME_MISSING(androidx.media3.common.PlaybackException.ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE),
    BOTH_TOKENID_MISSING(androidx.media3.common.PlaybackException.ERROR_CODE_IO_BAD_HTTP_STATUS),
    BOTH_SCHEME_MISSING(androidx.media3.common.PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND),
    ADDITIONAL_DATA_MISSING(androidx.media3.common.PlaybackException.ERROR_CODE_IO_NO_PERMISSION),
    PRODUCTID_MISSING(androidx.media3.common.PlaybackException.ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED),
    PAN_LAST4DIGITS_MISSING(androidx.media3.common.PlaybackException.ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE),
    PPSE_FCI_MISSING(2009),
    AIDINFO_MISSING(2010),
    AIDINFO_AID_MISSING(2011),
    AIDINFO_PAYMENT_FCI_MISSING(2012),
    AIDINFO_GPORESPONSE_MISSING(2013),
    AIDINFO_CAP_MISSING(2014),
    RECORDS_MISSING(2015),
    RECORDS_SFI_MISSING(2016),
    RECORDS_RECORDNUMBER_MISSING(2017),
    RECORDS_RECORDVALUE_MISSING(2018),
    ALTERNATE_AIDINFO_MISSING(2019),
    ALTERNATE_AIDINFO_AID_MISSING(com.paypal.oslo.feature.taxanddocumentcenter.domain.calculator.AllTransactionsStatementCalculator.FALLBACK_YEAR),
    ALTERNATE_AIDINFO_PAYMENT_FCI_MISSING(2021),
    ALTERNATE_AIDINFO_GPORESPONSE_MISSING(2022),
    ALTERNATE_AIDINFO_CAP_MISSING(2023),
    ADDITIONAL_DATA_ODA_CERTIFICATE_EXPIRY_MISSING(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl.SECOND_YEAR),
    ODA_PRIVATE_KEY_MISSING(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl.FIRST_YEAR),
    ODA_GPORESPONSEODA_MISSING(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAccountSummaryRepository.MOCK_PAYMENT_DUE_YEAR),
    NUMBER_OF_CREDS_NULL(2027),
    MINIMUM_PAYMENT_CREDS_NULL(2028),
    WRONG_DIGITALIZED_CARD_STATE(2029),
    CARD_HAS_PROVISIONED_NULL(2030),
    NEXT_ATC_INDEX_NULL(com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode.Type.ALL),
    CACHED_ATC_NULL(2032),
    KEY_TYPE_NULL(2033),
    MINDAY_NULL(2034),
    ATC_START_INDEX_NULL(2035),
    REP_COUNTER_NULL(2036),
    LUK_PAY_REMAINING_NULL(2037),
    ATC_NULL(2038),
    ALTERNATE_GPORESPONSEODA_MISSING(2039),
    ADDITIONAL_DATA_PAN_EXPIRY_DATE_MISSING(2040),
    CONTACTLESS_DATA_MISSING(2041),
    KEY_EXPIRY_DATE_NULL(2042),
    DIVERSIFIER_NULL(2043),
    TIMESTAMP_NULL(2044),
    DKI_NULL(2045),
    MAX_NO_OF_PAYMENT_NULL(2046),
    PAYMENT_TYPE_NULL(2047),
    CREDS_STATUS_NULL(2048),
    CAP_NOT_SUPPORT_ODA(2049),
    PROFILE_VALIDATION_FAILED(org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_CLIPPING_PATH_NAME);

    private final int getHighSpeedVideoFpsRangesFor;

    DCMErrorCodes(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public final int getIntValue() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
