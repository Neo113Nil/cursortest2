package androidx.profileinstaller;

/* loaded from: classes7.dex */
public class ProfileVersion {
    public static final int MIN_SUPPORTED_SDK = 24;
    static final byte[] getOutputFormats = {48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 0};
    static final byte[] getInputFormats = {48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 48, 0};
    static final byte[] Camera2StreamConfigurationMap = {48, 48, 57, 0};
    static final byte[] getHighSpeedVideoFpsRangesFor = {48, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 0};
    static final byte[] getHighSpeedVideoFpsRanges = {48, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 0};
    static final byte[] getHighResolutionOutputSizeshNQ4ISI = {48, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 0};
    static final byte[] getHighSpeedVideoSizes = {48, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 0};

    private ProfileVersion() {
    }

    static java.lang.String Camera2StreamConfigurationMap(byte[] bArr) {
        return (java.util.Arrays.equals(bArr, getHighSpeedVideoFpsRanges) || java.util.Arrays.equals(bArr, getHighSpeedVideoFpsRangesFor)) ? io.ktor.sse.ServerSentEventKt.COLON : "!";
    }
}
