package com.chuckerteam.chucker.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/chuckerteam/chucker/api/ExportFormat;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "extension", "Ljava/lang/String;", "getExtension", "()Ljava/lang/String;", "LOG", "HAR"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExportFormat {
    private static final /* synthetic */ com.chuckerteam.chucker.api.ExportFormat[] Camera2StreamConfigurationMap;
    public static final com.chuckerteam.chucker.api.ExportFormat HAR;
    public static final com.chuckerteam.chucker.api.ExportFormat LOG;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private final java.lang.String extension;

    private ExportFormat(java.lang.String str, int i, java.lang.String str2) {
        this.extension = str2;
    }

    public final java.lang.String getExtension() {
        return this.extension;
    }

    static {
        com.chuckerteam.chucker.api.ExportFormat exportFormat = new com.chuckerteam.chucker.api.ExportFormat("LOG", 0, com.payair.db.TokenDetailsDaoInternal.ASSET_FILE_NAME_EXTENSION);
        LOG = exportFormat;
        com.chuckerteam.chucker.api.ExportFormat exportFormat2 = new com.chuckerteam.chucker.api.ExportFormat("HAR", 1, "har");
        HAR = exportFormat2;
        com.chuckerteam.chucker.api.ExportFormat[] exportFormatArr = {exportFormat, exportFormat2};
        Camera2StreamConfigurationMap = exportFormatArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(exportFormatArr);
    }

    public static com.chuckerteam.chucker.api.ExportFormat[] values() {
        return (com.chuckerteam.chucker.api.ExportFormat[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.chuckerteam.chucker.api.ExportFormat valueOf(java.lang.String str) {
        return (com.chuckerteam.chucker.api.ExportFormat) java.lang.Enum.valueOf(com.chuckerteam.chucker.api.ExportFormat.class, str);
    }

    public static kotlin.enums.EnumEntries<com.chuckerteam.chucker.api.ExportFormat> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
