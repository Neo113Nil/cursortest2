package com.paypal.oslo.downloads.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/ValidationType;", "", "<init>", "(Ljava/lang/String;I)V", "URL", "CONTENT_TYPE", "CHECKSUM", "FILE_SIZE", com.google.android.gms.stats.CodePackage.SECURITY}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ValidationType {
    public static final com.paypal.oslo.downloads.api.model.ValidationType CHECKSUM;
    public static final com.paypal.oslo.downloads.api.model.ValidationType CONTENT_TYPE;
    public static final com.paypal.oslo.downloads.api.model.ValidationType FILE_SIZE;
    public static final com.paypal.oslo.downloads.api.model.ValidationType SECURITY;
    public static final com.paypal.oslo.downloads.api.model.ValidationType URL;
    private static final /* synthetic */ com.paypal.oslo.downloads.api.model.ValidationType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private ValidationType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.downloads.api.model.ValidationType validationType = new com.paypal.oslo.downloads.api.model.ValidationType("URL", 0);
        URL = validationType;
        com.paypal.oslo.downloads.api.model.ValidationType validationType2 = new com.paypal.oslo.downloads.api.model.ValidationType("CONTENT_TYPE", 1);
        CONTENT_TYPE = validationType2;
        com.paypal.oslo.downloads.api.model.ValidationType validationType3 = new com.paypal.oslo.downloads.api.model.ValidationType("CHECKSUM", 2);
        CHECKSUM = validationType3;
        com.paypal.oslo.downloads.api.model.ValidationType validationType4 = new com.paypal.oslo.downloads.api.model.ValidationType("FILE_SIZE", 3);
        FILE_SIZE = validationType4;
        com.paypal.oslo.downloads.api.model.ValidationType validationType5 = new com.paypal.oslo.downloads.api.model.ValidationType(com.google.android.gms.stats.CodePackage.SECURITY, 4);
        SECURITY = validationType5;
        com.paypal.oslo.downloads.api.model.ValidationType[] validationTypeArr = {validationType, validationType2, validationType3, validationType4, validationType5};
        getHighSpeedVideoFpsRanges = validationTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(validationTypeArr);
    }

    public static com.paypal.oslo.downloads.api.model.ValidationType[] values() {
        return (com.paypal.oslo.downloads.api.model.ValidationType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.downloads.api.model.ValidationType valueOf(java.lang.String str) {
        return (com.paypal.oslo.downloads.api.model.ValidationType) java.lang.Enum.valueOf(com.paypal.oslo.downloads.api.model.ValidationType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.downloads.api.model.ValidationType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
