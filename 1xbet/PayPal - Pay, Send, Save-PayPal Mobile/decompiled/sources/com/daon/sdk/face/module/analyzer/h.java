package com.daon.sdk.face.module.analyzer;

/* loaded from: classes7.dex */
public class h extends com.daon.sdk.face.module.Analyzer {
    private com.daon.sdk.face.liveness.SensoryFaceRecognizer getHighResolutionOutputSizeshNQ4ISI;
    private long getHighSpeedVideoFpsRangesFor;
    private int Camera2StreamConfigurationMap = 200;
    private final android.os.Bundle getHighSpeedVideoSizes = new android.os.Bundle();

    public h(android.content.Context context, int i, android.os.Bundle bundle) {
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            try {
                java.lang.Class.forName("com.daon.sdk.face.liveness.SensoryFaceRecognizer");
                this.getHighResolutionOutputSizeshNQ4ISI = new com.daon.sdk.face.liveness.SensoryFaceRecognizer(context, i);
                this.getHighSpeedVideoFpsRangesFor = java.lang.System.currentTimeMillis();
                onConfigurationChanged(bundle);
            } catch (java.lang.ClassNotFoundException e) {
                e.getLocalizedMessage();
            }
        } finally {
            android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    @Override // com.daon.sdk.face.module.Analyzer
    public void analyze(com.daon.sdk.face.YUV yuv, android.os.Bundle bundle, com.daon.sdk.face.module.Analyzer.AnalyzerCallback analyzerCallback) {
        synchronized (this) {
            startAnalyzer(yuv, bundle, 1, 0, analyzerCallback);
        }
    }

    @Override // com.daon.sdk.face.module.Module
    public java.lang.String getName() {
        return com.daon.sdk.face.license.License.FEATURE_LIVENESS;
    }

    @Override // com.daon.sdk.face.module.Module
    public boolean isSupported(com.daon.sdk.face.license.License license) {
        if (!license.supportsFeature(com.daon.sdk.face.license.License.FEATURE_LIVENESS)) {
            return false;
        }
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            try {
                java.lang.Class.forName("com.daon.sdk.face.liveness.SensoryFaceRecognizer");
                android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
                return true;
            } catch (java.lang.ClassNotFoundException e) {
                e.getLocalizedMessage();
                android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
                return false;
            }
        } catch (java.lang.Throwable th) {
            android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    @Override // com.daon.sdk.face.module.Analyzer
    public void onAnalysisStopped() {
        reset();
    }

    @Override // com.daon.sdk.face.module.Analyzer, com.daon.sdk.face.module.Module
    public void onConfigurationChanged(android.os.Bundle bundle) {
        if (bundle != null) {
            int i = bundle.getInt(com.daon.sdk.face.Config.LIVENESS_FRAME_RATE);
            if (i != 0) {
                if (i > 0) {
                    this.Camera2StreamConfigurationMap = 1000 / i;
                } else {
                    this.Camera2StreamConfigurationMap = 1;
                }
            }
            this.getHighSpeedVideoSizes.putAll(bundle);
        }
    }

    @Override // com.daon.sdk.face.module.Module
    public void reset() {
        com.daon.sdk.face.liveness.SensoryFaceRecognizer sensoryFaceRecognizer = this.getHighResolutionOutputSizeshNQ4ISI;
        if (sensoryFaceRecognizer != null) {
            sensoryFaceRecognizer.stop();
        }
    }

    @Override // com.daon.sdk.face.module.Analyzer
    public android.os.Bundle analyze(com.daon.sdk.face.YUV yuv, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (!yuv.isEmpty() && this.getHighResolutionOutputSizeshNQ4ISI != null) {
            boolean isTrackingFace = new com.daon.sdk.face.Result(bundle).isTrackingFace();
            long timestamp = yuv.getTimestamp();
            long j = this.getHighSpeedVideoFpsRangesFor;
            if (!isTrackingFace || timestamp - j >= this.Camera2StreamConfigurationMap) {
                this.getHighSpeedVideoFpsRangesFor = java.lang.System.currentTimeMillis();
                android.os.Bundle analyze = this.getHighResolutionOutputSizeshNQ4ISI.analyze(yuv.getData(), yuv.getWidth(), yuv.getHeight(), this.getHighSpeedVideoSizes);
                if (analyze != null) {
                    bundle2.putAll(analyze);
                    if (analyze.containsKey("status.score")) {
                        bundle2.putFloat(com.daon.sdk.face.LivenessResult.RESULT_SCORE, analyze.getFloat("status.score"));
                    }
                    int i = analyze.getInt("status.face");
                    if (i == 1) {
                        bundle2.putInt("result.liveness.tracker.liveness", 1);
                    } else if (i == 2) {
                        bundle2.putInt("result.liveness.tracker.liveness", 2);
                    } else {
                        bundle2.putInt("result.liveness.tracker.liveness", 0);
                    }
                    bundle2.putInt(com.daon.sdk.face.LivenessResult.RESULT_STATE, analyze.getInt("status.state"));
                    bundle2.putBoolean(getName(), i > 0);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(getName());
                    sb.append(".frames");
                    bundle2.putInt(sb.toString(), analyze.getInt("status.frames"));
                    if (analyze.getBoolean("status.spoof")) {
                        bundle2.putBoolean(com.daon.sdk.face.LivenessResult.RESULT_LIVENESS, false);
                        bundle2.putBoolean(com.daon.sdk.face.LivenessResult.RESULT_SPOOF, true);
                        bundle2.putInt(com.daon.sdk.face.LivenessResult.RESULT_ALERT, 9);
                        return bundle2;
                    }
                    bundle2.putBoolean(com.daon.sdk.face.LivenessResult.RESULT_LIVENESS, analyze.getBoolean("status.liveness"));
                    bundle2.putBoolean(com.daon.sdk.face.LivenessResult.RESULT_SPOOF, false);
                    bundle2.putInt(com.daon.sdk.face.LivenessResult.RESULT_ALERT, 0);
                    return bundle2;
                }
                bundle2.putInt("result.liveness.tracker.liveness", 0);
                bundle2.putBoolean(com.daon.sdk.face.LivenessResult.RESULT_LIVENESS, false);
                bundle2.putBoolean(com.daon.sdk.face.LivenessResult.RESULT_SPOOF, false);
            }
        }
        return bundle2;
    }
}
