package com.daon.sdk.face.module.analyzer;

/* loaded from: classes7.dex */
public class a extends com.daon.sdk.face.module.Analyzer {
    private com.daon.face.maskdetector.DaonFaceMaskDetector Camera2StreamConfigurationMap;
    private final android.content.Context getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private java.util.concurrent.Future getOutputMinFrameDuration;
    private final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();
    private java.lang.Float getHighResolutionOutputSizeshNQ4ISI = java.lang.Float.valueOf(0.7f);
    private int getInputSizeshNQ4ISI = 500;
    private long getOutputFormats = 0;

    enum b {
        PENDING,
        DISABLED,
        INITIALIZED
    }

    class c implements java.util.concurrent.Callable {
        private c() {
        }

        /* synthetic */ c(com.daon.sdk.face.module.analyzer.a aVar, byte b) {
            this();
        }

        @Override // java.util.concurrent.Callable
        public /* synthetic */ java.lang.Object call() {
            if (!com.daon.sdk.face.module.analyzer.a.this.isSupported(null)) {
                return com.daon.sdk.face.module.analyzer.a.b.DISABLED;
            }
            com.daon.sdk.face.module.analyzer.a.this.Camera2StreamConfigurationMap = new com.daon.face.maskdetector.DaonFaceMaskDetector(com.daon.sdk.face.module.analyzer.a.this.getHighSpeedVideoFpsRangesFor.getAssets());
            return com.daon.sdk.face.module.analyzer.a.b.INITIALIZED;
        }
    }

    public a(android.content.Context context, int i) {
        this.getHighSpeedVideoSizes = 0;
        this.getHighSpeedVideoFpsRangesFor = context;
        if (i == 90) {
            this.getHighSpeedVideoSizes = 2;
        } else if (i == 180) {
            this.getHighSpeedVideoSizes = 3;
        } else if (i == 270) {
            this.getHighSpeedVideoSizes = 1;
        }
    }

    @Override // com.daon.sdk.face.module.Analyzer
    public void analyze(com.daon.sdk.face.YUV yuv, android.os.Bundle bundle, com.daon.sdk.face.module.Analyzer.AnalyzerCallback analyzerCallback) {
        startAnalyzer(yuv, bundle, analyzerCallback);
    }

    @Override // com.daon.sdk.face.module.Module
    public java.lang.String getName() {
        return com.daon.sdk.face.license.License.FEATURE_MASK;
    }

    @Override // com.daon.sdk.face.module.Module
    public boolean isSupported(com.daon.sdk.face.license.License license) {
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            java.lang.Class.forName("com.daon.face.maskdetector.DaonFaceMaskDetector");
            android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (java.lang.Throwable th) {
            android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    @Override // com.daon.sdk.face.module.Analyzer
    public void onAnalysisStopped() {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            com.daon.face.maskdetector.DaonFaceMaskDetector daonFaceMaskDetector = this.Camera2StreamConfigurationMap;
            if (daonFaceMaskDetector != null) {
                daonFaceMaskDetector.close();
            }
            java.util.concurrent.Future future = this.getOutputMinFrameDuration;
            if (future != null) {
                future.cancel(true);
            }
            this.getOutputMinFrameDuration = null;
        }
    }

    @Override // com.daon.sdk.face.module.Analyzer, com.daon.sdk.face.module.Module
    public void onConfigurationChanged(android.os.Bundle bundle) {
        if (bundle != null) {
            float f = bundle.getFloat(com.daon.sdk.face.Config.MASK_THRESHOLD);
            if (f > 0.0f && f < 1.0f) {
                this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Float.valueOf(f);
            }
            int i = bundle.getInt(com.daon.sdk.face.Config.MASK_FRAME_RATE);
            if (i > 0) {
                this.getInputSizeshNQ4ISI = 1000 / i;
            } else {
                this.getInputSizeshNQ4ISI = 500;
            }
        }
    }

    @Override // com.daon.sdk.face.module.Analyzer
    public android.os.Bundle analyze(com.daon.sdk.face.YUV yuv, android.os.Bundle bundle) {
        if (yuv.isEmpty() || yuv.getTimestamp() - this.getOutputFormats < this.getInputSizeshNQ4ISI) {
            return null;
        }
        this.getOutputFormats = java.lang.System.currentTimeMillis();
        return getHighSpeedVideoFpsRanges(yuv, true, this.getHighSpeedVideoSizes);
    }

    @Override // com.daon.sdk.face.module.Analyzer
    public android.os.Bundle analyze(android.graphics.Bitmap bitmap) {
        return getHighSpeedVideoFpsRanges(new com.daon.sdk.face.YUV(com.daon.sdk.face.BitmapTools.makeEvenDimensions(bitmap)), false, 0);
    }

    @Override // com.daon.sdk.face.module.Analyzer
    public android.os.Bundle analyze(com.daon.sdk.face.YUV yuv) {
        return getHighSpeedVideoFpsRanges(yuv, false, this.getHighSpeedVideoSizes);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private android.os.Bundle getHighSpeedVideoFpsRanges(com.daon.sdk.face.YUV yuv, boolean z, int i) {
        com.daon.sdk.face.module.analyzer.a.b bVar;
        com.daon.face.maskdetector.DaonFaceMaskDetectorData daonFaceMaskDetectorData;
        com.daon.face.maskdetector.DaonFaceMaskDetector.Result detectSingleFace;
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.Object[] objArr = 0;
        float f = 0.0f;
        if (yuv != null && !yuv.isEmpty()) {
            try {
                synchronized (this.getHighSpeedVideoFpsRanges) {
                    if (this.getOutputMinFrameDuration == null) {
                        this.getOutputMinFrameDuration = com.daon.sdk.face.util.a.a(new com.daon.sdk.face.module.analyzer.a.c(this, objArr == true ? 1 : 0));
                    }
                    java.util.concurrent.Future future = this.getOutputMinFrameDuration;
                    if (future == null) {
                        bVar = com.daon.sdk.face.module.analyzer.a.b.DISABLED;
                    } else if (!z) {
                        bVar = (com.daon.sdk.face.module.analyzer.a.b) future.get();
                    } else if (future.isDone()) {
                        bVar = (com.daon.sdk.face.module.analyzer.a.b) this.getOutputMinFrameDuration.get();
                    } else {
                        bVar = com.daon.sdk.face.module.analyzer.a.b.PENDING;
                    }
                    if (bVar == com.daon.sdk.face.module.analyzer.a.b.INITIALIZED) {
                        com.daon.face.maskdetector.DetectorParams detectorParams = new com.daon.face.maskdetector.DetectorParams();
                        com.daon.face.maskdetector.DaonFaceMaskDetectorData daonFaceMaskDetectorData2 = new com.daon.face.maskdetector.DaonFaceMaskDetectorData();
                        byte[] data = yuv.getData();
                        if (i == 0) {
                            detectSingleFace = this.Camera2StreamConfigurationMap.detectSingleFace(data, yuv.getWidth(), yuv.getHeight(), i, 0, daonFaceMaskDetectorData2, detectorParams);
                            daonFaceMaskDetectorData = daonFaceMaskDetectorData2;
                        } else if (i == 3) {
                            com.daon.sdk.face.YUV rotate180 = yuv.rotate180();
                            detectSingleFace = this.Camera2StreamConfigurationMap.detectSingleFace(data, rotate180.getWidth(), rotate180.getHeight(), 0, 0, daonFaceMaskDetectorData2, detectorParams);
                            daonFaceMaskDetectorData = daonFaceMaskDetectorData2;
                        } else {
                            daonFaceMaskDetectorData = daonFaceMaskDetectorData2;
                            detectSingleFace = this.Camera2StreamConfigurationMap.detectSingleFace(data, yuv.getHeight(), yuv.getWidth(), i, 0, daonFaceMaskDetectorData2, detectorParams);
                        }
                        bundle.putInt("result.liveness.tracker.mask", detectSingleFace == com.daon.face.maskdetector.DaonFaceMaskDetector.Result.single_face ? 1 : 0);
                        float f2 = (float) daonFaceMaskDetectorData.maskConfidence;
                        if (!z || daonFaceMaskDetectorData.leftMouthY < (yuv.getWidth() * 3.0d) / 4.0d) {
                            f = f2;
                        }
                        bundle.putFloat(com.daon.sdk.face.QualityResult.RESULT_FACE_MASK_SCORE, f);
                        bundle.putBoolean(com.daon.sdk.face.QualityResult.RESULT_FACE_MASK, f >= this.getHighResolutionOutputSizeshNQ4ISI.floatValue());
                    }
                }
                return bundle;
            } catch (java.lang.Error e) {
                e = e;
                bundle.putString(com.daon.sdk.face.Result.RESULT_ERROR_MESSAGE, e.getMessage());
                return bundle;
            } catch (java.lang.Exception e2) {
                e = e2;
                bundle.putString(com.daon.sdk.face.Result.RESULT_ERROR_MESSAGE, e.getMessage());
                return bundle;
            } catch (com.daon.face.maskdetector.DaonFaceMaskDetectorException e3) {
                bundle.putInt(com.daon.sdk.face.Result.RESULT_ERROR_CODE, e3.getErrorCode());
                bundle.putString(com.daon.sdk.face.Result.RESULT_ERROR_MESSAGE, e3.getMessage());
                return bundle;
            }
        }
        bundle.putFloat(com.daon.sdk.face.QualityResult.RESULT_FACE_MASK_SCORE, 0.0f);
        bundle.putBoolean(com.daon.sdk.face.QualityResult.RESULT_FACE_MASK, false);
        return bundle;
    }
}
