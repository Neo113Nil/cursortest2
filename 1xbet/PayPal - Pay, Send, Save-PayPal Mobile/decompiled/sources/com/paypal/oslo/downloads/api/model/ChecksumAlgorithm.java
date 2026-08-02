package com.paypal.oslo.downloads.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/ChecksumAlgorithm;", "", "<init>", "(Ljava/lang/String;I)V", "MD5", "SHA1", "SHA256", "SHA512"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ChecksumAlgorithm {
    private static final /* synthetic */ com.paypal.oslo.downloads.api.model.ChecksumAlgorithm[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.downloads.api.model.ChecksumAlgorithm MD5;
    public static final com.paypal.oslo.downloads.api.model.ChecksumAlgorithm SHA1;
    public static final com.paypal.oslo.downloads.api.model.ChecksumAlgorithm SHA256;
    public static final com.paypal.oslo.downloads.api.model.ChecksumAlgorithm SHA512;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private ChecksumAlgorithm(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.downloads.api.model.ChecksumAlgorithm checksumAlgorithm = new com.paypal.oslo.downloads.api.model.ChecksumAlgorithm("MD5", 0);
        MD5 = checksumAlgorithm;
        com.paypal.oslo.downloads.api.model.ChecksumAlgorithm checksumAlgorithm2 = new com.paypal.oslo.downloads.api.model.ChecksumAlgorithm("SHA1", 1);
        SHA1 = checksumAlgorithm2;
        com.paypal.oslo.downloads.api.model.ChecksumAlgorithm checksumAlgorithm3 = new com.paypal.oslo.downloads.api.model.ChecksumAlgorithm("SHA256", 2);
        SHA256 = checksumAlgorithm3;
        com.paypal.oslo.downloads.api.model.ChecksumAlgorithm checksumAlgorithm4 = new com.paypal.oslo.downloads.api.model.ChecksumAlgorithm("SHA512", 3);
        SHA512 = checksumAlgorithm4;
        com.paypal.oslo.downloads.api.model.ChecksumAlgorithm[] checksumAlgorithmArr = {checksumAlgorithm, checksumAlgorithm2, checksumAlgorithm3, checksumAlgorithm4};
        Camera2StreamConfigurationMap = checksumAlgorithmArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(checksumAlgorithmArr);
    }

    public static com.paypal.oslo.downloads.api.model.ChecksumAlgorithm[] values() {
        return (com.paypal.oslo.downloads.api.model.ChecksumAlgorithm[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.downloads.api.model.ChecksumAlgorithm valueOf(java.lang.String str) {
        return (com.paypal.oslo.downloads.api.model.ChecksumAlgorithm) java.lang.Enum.valueOf(com.paypal.oslo.downloads.api.model.ChecksumAlgorithm.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.downloads.api.model.ChecksumAlgorithm> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
