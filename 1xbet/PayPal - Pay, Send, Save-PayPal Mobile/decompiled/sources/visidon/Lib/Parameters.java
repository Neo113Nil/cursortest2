package visidon.Lib;

/* loaded from: classes18.dex */
public class Parameters {
    public android.content.Context appContext;
    public java.lang.String databaseLocation;
    public visidon.Lib.VerificationAPI.DetectionMode detectionMode;
    public visidon.Lib.VerificationAPI.EnrollMode enrollMode;
    public visidon.Lib.VerificationAPI.LivenessDetection livenessDetection;
    public visidon.Lib.VerificationAPI.SecurityLevel securityLevel;
    public int imageWidth = 0;
    public int imageHeight = 0;

    public Parameters(android.content.Context context) {
        this.appContext = context;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(context.getFilesDir());
        sb.append("/database.db");
        this.databaseLocation = sb.toString();
        this.detectionMode = visidon.Lib.VerificationAPI.DetectionMode.VIDEO;
        this.securityLevel = visidon.Lib.VerificationAPI.SecurityLevel.MEDIUM;
        this.livenessDetection = visidon.Lib.VerificationAPI.LivenessDetection.OFF;
        this.enrollMode = visidon.Lib.VerificationAPI.EnrollMode.MANUAL;
    }
}
