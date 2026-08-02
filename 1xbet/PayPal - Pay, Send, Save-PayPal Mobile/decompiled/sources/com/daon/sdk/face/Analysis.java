package com.daon.sdk.face;

/* loaded from: classes7.dex */
public class Analysis {
    private com.daon.sdk.face.Analysis.StateChangedListener Camera2StreamConfigurationMap;
    private com.daon.sdk.face.Analysis.EventDetectedListener getHighSpeedVideoFpsRangesFor;
    private com.daon.sdk.face.Analysis.AlertListener getInputFormats;
    private com.daon.sdk.face.Analysis.AnalysisListener getInputSizeshNQ4ISI;
    private int getHighSpeedVideoSizes = 5;
    private int getHighSpeedVideoFpsRanges = 0;
    private final java.util.ArrayList getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
    private final com.daon.sdk.face.ScoreBuffer getOutputFormats = new com.daon.sdk.face.ScoreBuffer(1, -1);

    public interface AlertListener {
        void alert(com.daon.sdk.face.Result result, int i);
    }

    public interface AnalysisListener {
        void analysis(com.daon.sdk.face.Result result, com.daon.sdk.face.YUV yuv);
    }

    public interface EventDetectedListener {
        void event(com.daon.sdk.face.Result result, int i, com.daon.sdk.face.YUV yuv);
    }

    public interface StateChangedListener {
        void state(com.daon.sdk.face.Result result, int i, com.daon.sdk.face.YUV yuv);
    }

    public com.daon.sdk.face.Analysis addAlertListener(com.daon.sdk.face.Analysis.AlertListener alertListener) {
        this.getInputFormats = alertListener;
        return this;
    }

    public com.daon.sdk.face.Analysis addAnalysisListener(com.daon.sdk.face.Analysis.AnalysisListener analysisListener) {
        this.getInputSizeshNQ4ISI = analysisListener;
        return this;
    }

    public com.daon.sdk.face.Analysis addEventDetectedListener(com.daon.sdk.face.Analysis.EventDetectedListener eventDetectedListener) {
        this.getHighSpeedVideoFpsRangesFor = eventDetectedListener;
        return this;
    }

    public com.daon.sdk.face.Analysis addStateChangedListener(com.daon.sdk.face.Analysis.StateChangedListener stateChangedListener) {
        this.Camera2StreamConfigurationMap = stateChangedListener;
        return this;
    }

    final void getHighSpeedVideoFpsRanges(final com.daon.sdk.face.Result result, final com.daon.sdk.face.YUV yuv, java.util.concurrent.Executor executor) {
        android.os.Bundle bundle = result.getBundle();
        float f = bundle.getFloat(com.daon.sdk.face.QualityResult.RESULT_IMAGE_BEST_SCORE);
        if (f > 0.0f) {
            this.getOutputFormats.add(yuv, f);
        }
        if (bundle.get(com.daon.sdk.face.LivenessResult.RESULT_STATE) != null) {
            final int i = bundle.getInt(com.daon.sdk.face.LivenessResult.RESULT_STATE);
            if (this.getHighSpeedVideoSizes != i) {
                if (i == 1) {
                    this.getHighResolutionOutputSizeshNQ4ISI.clear();
                    this.getOutputFormats.clear();
                }
                r5 = i == 5 ? getHighSpeedVideoSizes(bundle.getString(com.daon.sdk.face.LivenessResult.RESULT_IMAGE)) : null;
                if (this.Camera2StreamConfigurationMap != null) {
                    final com.daon.sdk.face.YUV yuv2 = r5 == null ? (com.daon.sdk.face.YUV) this.getOutputFormats.getBest(false) : r5;
                    executor.execute(new java.lang.Runnable() { // from class: com.daon.sdk.face.Analysis$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.daon.sdk.face.Analysis.this.Camera2StreamConfigurationMap.state(result, i, yuv2);
                        }
                    });
                }
            }
            this.getHighSpeedVideoSizes = i;
        }
        final int i2 = bundle.getInt(com.daon.sdk.face.LivenessResult.RESULT_ALERT);
        if (this.getInputFormats != null && i2 != this.getHighSpeedVideoFpsRanges && this.getHighSpeedVideoSizes != 4) {
            executor.execute(new java.lang.Runnable() { // from class: com.daon.sdk.face.Analysis$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    com.daon.sdk.face.Analysis.this.getInputFormats.alert(result, i2);
                }
            });
        }
        this.getHighSpeedVideoFpsRanges = i2;
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            if (result.getLivenessResult().isBlink()) {
                getHighSpeedVideoSizes(1, result, r5, executor);
            }
            if (result.getLivenessResult().isNod()) {
                getHighSpeedVideoSizes(2, result, r5, executor);
            }
            if (result.getLivenessResult().isShake()) {
                getHighSpeedVideoSizes(3, result, r5, executor);
            }
            if (result.getLivenessResult().isPassive()) {
                getHighSpeedVideoSizes(5, result, r5, executor);
            }
            if (result.getLivenessResult().spoofDetected()) {
                getHighSpeedVideoSizes(4, result, r5, executor);
            }
        }
        if (this.getInputSizeshNQ4ISI != null) {
            executor.execute(new java.lang.Runnable() { // from class: com.daon.sdk.face.Analysis$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    com.daon.sdk.face.Analysis.this.getInputSizeshNQ4ISI.analysis(result, yuv);
                }
            });
        }
    }

    private void getHighSpeedVideoSizes(final int i, final com.daon.sdk.face.Result result, final com.daon.sdk.face.YUV yuv, java.util.concurrent.Executor executor) {
        if (this.getHighResolutionOutputSizeshNQ4ISI.contains(java.lang.Integer.valueOf(i))) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.add(java.lang.Integer.valueOf(i));
        executor.execute(new java.lang.Runnable() { // from class: com.daon.sdk.face.Analysis$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.daon.sdk.face.Analysis.m9987$r8$lambda$kv0JNnCOwl7sXYIYKTjqAWuZu4(com.daon.sdk.face.Analysis.this, result, i, yuv);
            }
        });
    }

    private static com.daon.sdk.face.YUV getHighSpeedVideoSizes(java.lang.String str) {
        android.graphics.Bitmap decodeByteArray;
        try {
            byte[] read = com.daon.sdk.face.FileTools.read(null, str);
            if (read != null && (decodeByteArray = android.graphics.BitmapFactory.decodeByteArray(read, 0, read.length)) != null) {
                return new com.daon.sdk.face.YUV(decodeByteArray);
            }
        } catch (java.lang.Exception unused) {
        }
        return null;
    }

    /* renamed from: $r8$lambda$kv0JNnCOw-l7sXYIYKTjqAWuZu4, reason: not valid java name */
    public static /* synthetic */ void m9987$r8$lambda$kv0JNnCOwl7sXYIYKTjqAWuZu4(com.daon.sdk.face.Analysis analysis, com.daon.sdk.face.Result result, int i, com.daon.sdk.face.YUV yuv) {
        com.daon.sdk.face.Analysis.EventDetectedListener eventDetectedListener = analysis.getHighSpeedVideoFpsRangesFor;
        if (yuv == null) {
            yuv = (com.daon.sdk.face.YUV) analysis.getOutputFormats.getBest(false);
        }
        eventDetectedListener.event(result, i, yuv);
    }
}
