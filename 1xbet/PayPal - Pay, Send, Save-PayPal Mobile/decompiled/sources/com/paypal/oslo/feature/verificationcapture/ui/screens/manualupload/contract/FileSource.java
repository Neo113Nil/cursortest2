package com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/FileSource;", "", "<init>", "(Ljava/lang/String;I)V", "GALLERY", "FILE_PICKER", "CAMERA", "SDK_CAPTURE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FileSource {
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.FileSource CAMERA;
    private static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.FileSource[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.FileSource FILE_PICKER;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.FileSource GALLERY;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.FileSource SDK_CAPTURE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private FileSource(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.FileSource fileSource = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.FileSource("GALLERY", 0);
        GALLERY = fileSource;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.FileSource fileSource2 = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.FileSource("FILE_PICKER", 1);
        FILE_PICKER = fileSource2;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.FileSource fileSource3 = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.FileSource("CAMERA", 2);
        CAMERA = fileSource3;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.FileSource fileSource4 = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.FileSource("SDK_CAPTURE", 3);
        SDK_CAPTURE = fileSource4;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.FileSource[] fileSourceArr = {fileSource, fileSource2, fileSource3, fileSource4};
        Camera2StreamConfigurationMap = fileSourceArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(fileSourceArr);
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.FileSource[] values() {
        return (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.FileSource[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.FileSource valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.FileSource) java.lang.Enum.valueOf(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.FileSource.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.FileSource> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
