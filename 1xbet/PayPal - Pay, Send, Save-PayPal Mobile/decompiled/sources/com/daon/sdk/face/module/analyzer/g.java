package com.daon.sdk.face.module.analyzer;

/* loaded from: classes7.dex */
public class g extends com.daon.sdk.face.module.Analyzer {
    private final android.content.Context Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private com.daon.research.clrmodule.ColourLightReflection getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private long getHighSpeedVideoSizesFor;
    private com.daon.research.clrmodule.ClrSequence getOutputSizes;
    private com.daon.sdk.face.LightReflectionView getOutputStallDuration;
    private final java.lang.Object getInputFormats = new java.lang.Object();
    private final android.os.Bundle getInputSizeshNQ4ISI = new android.os.Bundle();
    private float getOutputFormats = 1.0f;
    private int getOutputMinFrameDuration = 10;
    private int getOutputStallDurationlomOqCM = com.visa.cbp.getCertUsage.setODAData;
    private java.lang.String getOutputSizeshNQ4ISI = null;
    private boolean getOutputMinFrameDurationlomOqCM = false;
    private float isOutputSupportedForhNQ4ISI = 0.0f;
    private int getValidOutputFormatsForInputhNQ4ISI = 0;

    class a implements com.daon.sdk.face.LightReflectionView.LightReflectionViewCallback {
        a() {
        }

        @Override // com.daon.sdk.face.LightReflectionView.LightReflectionViewCallback
        public void onStart() {
            com.daon.sdk.face.module.analyzer.g.this.getHighSpeedVideoFpsRangesFor.startAnalysing();
        }

        @Override // com.daon.sdk.face.LightReflectionView.LightReflectionViewCallback
        public void onStop(boolean z) {
            if (z) {
                return;
            }
            com.daon.sdk.face.module.analyzer.g.this.flush();
        }
    }

    public g(android.content.Context context, int i) {
        this.Camera2StreamConfigurationMap = context;
        this.getHighSpeedVideoFpsRanges = i;
    }

    @Override // com.daon.sdk.face.module.Analyzer
    public void analyze(com.daon.sdk.face.YUV yuv, android.os.Bundle bundle, com.daon.sdk.face.module.Analyzer.AnalyzerCallback analyzerCallback) {
        startAnalyzer(yuv, bundle, analyzerCallback);
    }

    @Override // com.daon.sdk.face.module.Module
    public java.lang.String getName() {
        return com.daon.sdk.face.license.License.FEATURE_CLR;
    }

    @Override // com.daon.sdk.face.module.Module
    public boolean isSupported(com.daon.sdk.face.license.License license) {
        if (!license.supportsFeature(com.daon.sdk.face.license.License.FEATURE_CLR)) {
            return false;
        }
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            try {
                java.lang.Class.forName("com.daon.research.clrmodule.ColourLightReflection");
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
        synchronized (this.getInputFormats) {
            com.daon.research.clrmodule.ColourLightReflection colourLightReflection = this.getHighSpeedVideoFpsRangesFor;
            if (colourLightReflection != null) {
                colourLightReflection.stopAnalysing();
                this.getHighSpeedVideoFpsRangesFor.destroy();
                this.getHighSpeedVideoFpsRangesFor = null;
            }
            this.getInputSizeshNQ4ISI.clear();
        }
    }

    @Override // com.daon.sdk.face.module.Analyzer, com.daon.sdk.face.module.Module
    public void onConfigurationChanged(android.os.Bundle bundle) {
        if (bundle != null) {
            this.getOutputFormats = bundle.getFloat(com.daon.sdk.face.Config.CLR_PITCH_DELTA, this.getOutputFormats);
            this.getOutputStallDurationlomOqCM = bundle.getInt(com.daon.sdk.face.Config.CLR_SEQUENCE_DURATION, this.getOutputStallDurationlomOqCM);
            this.getOutputMinFrameDuration = bundle.getInt(com.daon.sdk.face.Config.CLR_SEQUENCE_LENGTH, this.getOutputMinFrameDuration);
            this.getOutputSizeshNQ4ISI = bundle.getString(com.daon.sdk.face.Config.CLR_SEQUENCE_COLORS);
        }
    }

    @Override // com.daon.sdk.face.module.Analyzer, com.daon.sdk.face.module.Module
    public void onImageSizeChanged(int i, int i2) {
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        onAnalysisStopped();
    }

    public void a(com.daon.sdk.face.LightReflectionView lightReflectionView) {
        this.getOutputStallDuration = lightReflectionView;
        lightReflectionView.init(new com.daon.sdk.face.module.analyzer.g.a());
    }

    @Override // com.daon.sdk.face.module.Analyzer
    public android.os.Bundle analyze(com.daon.sdk.face.YUV yuv, android.os.Bundle bundle) {
        synchronized (this.getInputFormats) {
            if (yuv.isEmpty()) {
                this.getHighSpeedVideoFpsRangesFor.stopAnalysing();
                this.getInputSizeshNQ4ISI.putFloat(com.daon.sdk.face.LivenessResult.RESULT_SCORE, this.getHighSpeedVideoFpsRangesFor.computeLiveness(this.getOutputSizes));
                this.getInputSizeshNQ4ISI.putInt(com.daon.sdk.face.LivenessResult.RESULT_STATE, 5);
            } else {
                com.daon.research.clrmodule.ColourLightReflection colourLightReflection = this.getHighSpeedVideoFpsRangesFor;
                if (colourLightReflection == null) {
                    if (colourLightReflection == null) {
                        this.getHighSpeedVideoFpsRangesFor = new com.daon.research.clrmodule.ColourLightReflection(this.Camera2StreamConfigurationMap);
                    }
                    this.getHighSpeedVideoFpsRangesFor.initialise(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, -12.0f);
                    this.getHighSpeedVideoSizesFor = 0L;
                    this.getInputSizeshNQ4ISI.putInt(com.daon.sdk.face.LivenessResult.RESULT_STATE, 1);
                } else {
                    if (this.getHighSpeedVideoSizesFor == 0) {
                        this.getHighSpeedVideoSizesFor = yuv.getTimestamp();
                    }
                    float[] addFrame = this.getHighSpeedVideoFpsRangesFor.addFrame(yuv.getData(), yuv.getTimestamp() - this.getHighSpeedVideoSizesFor);
                    if (addFrame[0] <= 0.0f || addFrame[1] <= 0.0f) {
                        this.getHighSpeedVideoSizesFor = 0L;
                        if (this.getOutputMinFrameDurationlomOqCM) {
                            this.getOutputStallDuration.stop();
                            this.getOutputMinFrameDurationlomOqCM = false;
                        }
                        this.getInputSizeshNQ4ISI.putInt(com.daon.sdk.face.LivenessResult.RESULT_STATE, 3);
                    } else if (!this.getOutputMinFrameDurationlomOqCM) {
                        float f = bundle.getFloat(com.daon.sdk.face.Result.RESULT_SENSOR_PITCH, 90.0f);
                        if (f < 90.0f && f > 60.0f) {
                            if (java.lang.Math.abs(this.isOutputSupportedForhNQ4ISI - f) < this.getOutputFormats) {
                                this.getValidOutputFormatsForInputhNQ4ISI++;
                            } else {
                                this.getValidOutputFormatsForInputhNQ4ISI = 0;
                            }
                            if (this.getValidOutputFormatsForInputhNQ4ISI > 10) {
                                this.getValidOutputFormatsForInputhNQ4ISI = 0;
                                this.getInputSizeshNQ4ISI.putInt(com.daon.sdk.face.LivenessResult.RESULT_STATE, 4);
                                if (this.getOutputSizeshNQ4ISI != null) {
                                    this.getOutputSizes = new com.daon.research.clrmodule.ClrSequence(this.getOutputSizeshNQ4ISI, com.daon.research.clrmodule.ClrSequence.SequenceType.SEQUENCE_RANDOM_FORCED_TRANSITIONS, this.getOutputStallDurationlomOqCM);
                                } else {
                                    this.getOutputSizes = new com.daon.research.clrmodule.ClrSequence(com.daon.research.clrmodule.ClrSequence.SequenceType.SEQUENCE_RANDOM_FORCED_TRANSITIONS, this.getOutputStallDurationlomOqCM, this.getOutputMinFrameDuration);
                                }
                                this.getOutputStallDuration.start(this.getOutputSizes);
                                this.getOutputMinFrameDurationlomOqCM = true;
                            } else {
                                this.isOutputSupportedForhNQ4ISI = f;
                            }
                        }
                    }
                }
            }
        }
        return this.getInputSizeshNQ4ISI;
    }
}
