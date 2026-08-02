package visidon.Lib;

/* loaded from: classes18.dex */
public class FaceInfo {
    public int blink;
    public visidon.Lib.VerificationAPI.VerifyState faceRecognition;
    public android.graphics.Rect faceRect;
    private int getInputFormats;
    private int getOutputMinFrameDurationlomOqCM;
    private int getOutputSizes;
    private int getOutputStallDurationlomOqCM;
    public int livenessConfidence;
    public visidon.Lib.VerificationAPI.VerifyState livenessDetection;
    public int recognitionConfidence;
    public int smile;
    private int getOutputMinFrameDuration = -1;
    private int getHighResolutionOutputSizeshNQ4ISI = -1;
    private int getHighSpeedVideoSizes = -1;
    private int getHighSpeedVideoSizesFor = -1;
    private int getHighSpeedVideoFpsRanges = -1;
    private int getHighSpeedVideoFpsRangesFor = -1;
    private int getOutputFormats = -1;
    private int getInputSizeshNQ4ISI = -1;
    private int Camera2StreamConfigurationMap = -1;

    public FaceInfo(int[] iArr) {
        this.getOutputMinFrameDurationlomOqCM = 0;
        this.getOutputStallDurationlomOqCM = 0;
        this.getInputFormats = 0;
        this.getOutputSizes = 0;
        this.faceRect = new android.graphics.Rect(0, 0, 0, 0);
        this.smile = -1;
        this.recognitionConfidence = 0;
        this.livenessConfidence = 0;
        this.faceRecognition = visidon.Lib.VerificationAPI.VerifyState.ERROR;
        this.livenessDetection = visidon.Lib.VerificationAPI.VerifyState.ERROR;
        if (iArr != null) {
            if (iArr.length == 2) {
                this.faceRecognition = visidon.Lib.VerificationAPI.VerifyState.valuesCustom()[iArr[0]];
                this.livenessDetection = visidon.Lib.VerificationAPI.VerifyState.valuesCustom()[iArr[1]];
                return;
            }
            if (iArr.length == 10) {
                this.faceRecognition = visidon.Lib.VerificationAPI.VerifyState.valuesCustom()[iArr[0]];
                this.livenessDetection = visidon.Lib.VerificationAPI.VerifyState.valuesCustom()[iArr[1]];
                this.recognitionConfidence = iArr[2];
                this.livenessConfidence = iArr[3];
                this.smile = iArr[4];
                this.blink = iArr[5];
                int i = iArr[6];
                this.getOutputMinFrameDurationlomOqCM = i;
                int i2 = iArr[7];
                this.getOutputStallDurationlomOqCM = i2;
                this.getInputFormats = i + iArr[8];
                this.getOutputSizes = i2 + iArr[9];
                this.faceRect = new android.graphics.Rect(this.getOutputMinFrameDurationlomOqCM, this.getOutputStallDurationlomOqCM, this.getInputFormats, this.getOutputSizes);
            }
        }
    }
}
