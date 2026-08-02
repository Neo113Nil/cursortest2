package com.daon.sdk.face.module.analyzer;

/* loaded from: classes7.dex */
public class f extends com.daon.sdk.face.module.Analyzer {
    private final android.os.Bundle Camera2StreamConfigurationMap = new android.os.Bundle();
    private int getHighResolutionOutputSizeshNQ4ISI;
    private com.daon.sdk.face.hmd.HMD getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final android.content.Context getHighSpeedVideoSizes;
    private java.util.concurrent.Future getHighSpeedVideoSizesFor;

    public f(android.content.Context context, int i) {
        this.getHighSpeedVideoSizes = context;
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    private boolean Camera2StreamConfigurationMap(final int i, final int i2) {
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = com.daon.sdk.face.util.a.a(new java.util.concurrent.Callable() { // from class: com.daon.sdk.face.module.analyzer.f$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return com.daon.sdk.face.module.analyzer.f.m9991$r8$lambda$Gi0rhbHNffOvH2NljINeNeIgto(com.daon.sdk.face.module.analyzer.f.this, i, i2);
                }
            });
        }
        try {
            java.util.concurrent.Future future = this.getHighSpeedVideoSizesFor;
            if (future == null || !future.isDone()) {
                return false;
            }
            return ((java.lang.Boolean) this.getHighSpeedVideoSizesFor.get()).booleanValue();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // com.daon.sdk.face.module.Analyzer
    public void analyze(com.daon.sdk.face.YUV yuv, android.os.Bundle bundle, com.daon.sdk.face.module.Analyzer.AnalyzerCallback analyzerCallback) {
        if (Camera2StreamConfigurationMap(yuv.getWidth(), yuv.getHeight())) {
            startAnalyzer(yuv, bundle, 1, 0, analyzerCallback);
        }
    }

    @Override // com.daon.sdk.face.module.Module
    public java.lang.String getName() {
        return com.daon.sdk.face.license.License.FEATURE_HMD;
    }

    @Override // com.daon.sdk.face.module.Module
    public boolean isSupported(com.daon.sdk.face.license.License license) {
        if (!license.supportsFeature(com.daon.sdk.face.license.License.FEATURE_HMD)) {
            return false;
        }
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            try {
                java.lang.Class.forName("com.daon.sdk.face.hmd.HMD");
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

    @Override // com.daon.sdk.face.module.Analyzer, com.daon.sdk.face.module.Module
    public void onConfigurationChanged(android.os.Bundle bundle) {
        com.daon.sdk.face.hmd.HMD hmd = this.getHighSpeedVideoFpsRanges;
        if (hmd == null || bundle == null) {
            return;
        }
        hmd.setConfig(bundle);
    }

    @Override // com.daon.sdk.face.module.Analyzer, com.daon.sdk.face.module.Module
    public void stop() {
        synchronized (this) {
            super.stop();
            com.daon.sdk.face.hmd.HMD hmd = this.getHighSpeedVideoFpsRanges;
            if (hmd != null) {
                hmd.stop();
                this.getHighSpeedVideoFpsRanges.destroy();
            }
            java.util.concurrent.Future future = this.getHighSpeedVideoSizesFor;
            if (future != null) {
                future.cancel(true);
            }
            this.getHighSpeedVideoSizesFor = null;
        }
    }

    @Override // com.daon.sdk.face.module.Analyzer
    public android.os.Bundle analyze(com.daon.sdk.face.YUV yuv, android.os.Bundle bundle) {
        byte[] data;
        if (!yuv.isEmpty() && this.getHighSpeedVideoFpsRanges != null) {
            if (this.getHighSpeedVideoFpsRangesFor == 180) {
                data = yuv.rotate180().getData();
            } else {
                data = yuv.getData();
            }
            try {
                android.os.Bundle processImage = this.getHighSpeedVideoFpsRanges.processImage(data);
                if (processImage != null && processImage.getInt("hmd.status.hmd") == 3) {
                    this.Camera2StreamConfigurationMap.clear();
                    this.Camera2StreamConfigurationMap.putBoolean(com.daon.sdk.face.LivenessResult.RESULT_ACTION_NOD, false);
                    this.Camera2StreamConfigurationMap.putBoolean(com.daon.sdk.face.LivenessResult.RESULT_ACTION_SHAKE, false);
                    this.Camera2StreamConfigurationMap.putInt("result.liveness.tracker.hmd", processImage.getInt("hmd.status.tracker"));
                    int i = processImage.getInt("hmd.quality.alerts.highestpriority");
                    if (i > 2 && i < 9) {
                        this.Camera2StreamConfigurationMap.putInt(com.daon.sdk.face.LivenessResult.RESULT_ALERT, i);
                    } else {
                        this.Camera2StreamConfigurationMap.putInt(com.daon.sdk.face.LivenessResult.RESULT_ALERT, 0);
                    }
                    int i2 = 1;
                    if (processImage.getBoolean("hmd.motion.detected")) {
                        int i3 = processImage.getInt("hmd.motion.type");
                        if (i3 == 2 && this.getHighResolutionOutputSizeshNQ4ISI != 2) {
                            this.Camera2StreamConfigurationMap.putBoolean(com.daon.sdk.face.LivenessResult.RESULT_ACTION_SHAKE, true);
                        } else if (i3 == 3 && this.getHighResolutionOutputSizeshNQ4ISI != 3) {
                            this.Camera2StreamConfigurationMap.putBoolean(com.daon.sdk.face.LivenessResult.RESULT_ACTION_NOD, true);
                        }
                        i2 = i3;
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI = i2;
                }
            } catch (java.lang.Error e) {
                e.getLocalizedMessage();
                android.os.Bundle bundle2 = this.Camera2StreamConfigurationMap;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("HMD: ");
                sb.append(e.getLocalizedMessage());
                bundle2.putString(com.daon.sdk.face.Result.RESULT_ERROR, sb.toString());
                this.getHighSpeedVideoFpsRanges = null;
            }
        }
        return this.Camera2StreamConfigurationMap;
    }

    /* renamed from: $r8$lambda$G-i0rhbHNffOvH2NljINeNeIgto, reason: not valid java name */
    public static /* synthetic */ java.lang.Boolean m9991$r8$lambda$Gi0rhbHNffOvH2NljINeNeIgto(com.daon.sdk.face.module.analyzer.f fVar, int i, int i2) {
        com.daon.sdk.face.hmd.HMD hmd = new com.daon.sdk.face.hmd.HMD();
        fVar.getHighSpeedVideoFpsRanges = hmd;
        hmd.initialise(fVar.getHighSpeedVideoSizes);
        com.daon.sdk.face.hmd.HMD hmd2 = fVar.getHighSpeedVideoFpsRanges;
        int i3 = fVar.getHighSpeedVideoFpsRangesFor;
        if (i3 == 180) {
            i3 = 0;
        }
        hmd2.start(i, i2, i3, 0);
        return java.lang.Boolean.valueOf(fVar.getHighSpeedVideoFpsRanges.isStarted());
    }
}
