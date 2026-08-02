package com.paypal.oslo.downloads.api.validation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/downloads/api/validation/ContentValidationType;", "", "<init>", "(Ljava/lang/String;I)V", "MIME_TYPE", "CHECKSUM", "FILE_ACCESS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ContentValidationType {
    public static final com.paypal.oslo.downloads.api.validation.ContentValidationType CHECKSUM;
    public static final com.paypal.oslo.downloads.api.validation.ContentValidationType FILE_ACCESS;
    public static final com.paypal.oslo.downloads.api.validation.ContentValidationType MIME_TYPE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.downloads.api.validation.ContentValidationType[] getHighSpeedVideoFpsRangesFor;

    private ContentValidationType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.downloads.api.validation.ContentValidationType contentValidationType = new com.paypal.oslo.downloads.api.validation.ContentValidationType("MIME_TYPE", 0);
        MIME_TYPE = contentValidationType;
        com.paypal.oslo.downloads.api.validation.ContentValidationType contentValidationType2 = new com.paypal.oslo.downloads.api.validation.ContentValidationType("CHECKSUM", 1);
        CHECKSUM = contentValidationType2;
        com.paypal.oslo.downloads.api.validation.ContentValidationType contentValidationType3 = new com.paypal.oslo.downloads.api.validation.ContentValidationType("FILE_ACCESS", 2);
        FILE_ACCESS = contentValidationType3;
        com.paypal.oslo.downloads.api.validation.ContentValidationType[] contentValidationTypeArr = {contentValidationType, contentValidationType2, contentValidationType3};
        getHighSpeedVideoFpsRangesFor = contentValidationTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(contentValidationTypeArr);
    }

    public static com.paypal.oslo.downloads.api.validation.ContentValidationType[] values() {
        return (com.paypal.oslo.downloads.api.validation.ContentValidationType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.downloads.api.validation.ContentValidationType valueOf(java.lang.String str) {
        return (com.paypal.oslo.downloads.api.validation.ContentValidationType) java.lang.Enum.valueOf(com.paypal.oslo.downloads.api.validation.ContentValidationType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.downloads.api.validation.ContentValidationType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
