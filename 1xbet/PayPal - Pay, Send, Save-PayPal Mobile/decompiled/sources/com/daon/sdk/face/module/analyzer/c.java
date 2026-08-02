package com.daon.sdk.face.module.analyzer;

/* loaded from: classes7.dex */
public class c extends com.daon.sdk.face.module.Analyzer {
    private final android.content.Context getHighSpeedVideoSizesFor;
    private com.daon.face.quality.DaonFaceQuality getInputFormats;
    private int getOutputMinFrameDurationlomOqCM;
    private java.util.concurrent.Future getOutputStallDuration;
    private long Camera2StreamConfigurationMap = 0;
    private int getHighSpeedVideoSizes = 200;
    private float getHighSpeedVideoFpsRanges = 10.0f;
    private float getHighSpeedVideoFpsRangesFor = 10.0f;
    private android.os.Bundle getHighResolutionOutputSizeshNQ4ISI = null;
    private boolean getInputSizeshNQ4ISI = true;
    private final android.os.Bundle getOutputMinFrameDuration = new android.os.Bundle();
    private final java.lang.Object getOutputFormats = new java.lang.Object();

    class b implements java.util.concurrent.Callable {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
        public java.lang.Boolean call() {
            android.content.res.AssetManager assets = com.daon.sdk.face.module.analyzer.c.this.getHighSpeedVideoSizesFor.getAssets();
            com.daon.sdk.face.module.analyzer.c.this.getInputFormats = new com.daon.face.quality.DaonFaceQuality(assets);
            com.daon.sdk.face.module.analyzer.c.this.getOutputMinFrameDuration.clear();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(com.daon.sdk.face.module.analyzer.c.this.getHighSpeedVideoSizesFor.getFilesDir().getAbsolutePath());
            sb.append("/daon");
            java.lang.String obj = sb.toString();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(obj);
            sb2.append(java.io.File.separator);
            sb2.append("DaonFaceQualityConfig.xml");
            java.lang.String obj2 = sb2.toString();
            try {
                com.daon.sdk.face.module.analyzer.c.getHighResolutionOutputSizeshNQ4ISI(assets, com.daon.sdk.face.license.License.FEATURE_QUALITY, "DaonFaceQualityConfig.xml", obj);
            } catch (java.io.IOException unused) {
            }
            if (new java.io.File(obj2).exists()) {
                com.daon.sdk.face.module.analyzer.c.this.getInputFormats.loadConfigXML(obj2);
            }
            com.daon.sdk.face.module.analyzer.c cVar = com.daon.sdk.face.module.analyzer.c.this;
            cVar.Camera2StreamConfigurationMap(cVar.getHighResolutionOutputSizeshNQ4ISI);
            return java.lang.Boolean.TRUE;
        }

        /* synthetic */ b(com.daon.sdk.face.module.analyzer.c cVar, byte b) {
            this();
        }
    }

    public c(android.content.Context context, int i) {
        this.getOutputMinFrameDurationlomOqCM = 0;
        this.getHighSpeedVideoSizesFor = context;
        if (i == 90) {
            this.getOutputMinFrameDurationlomOqCM = 2;
        } else if (i == 180) {
            this.getOutputMinFrameDurationlomOqCM = 3;
        } else if (i == 270) {
            this.getOutputMinFrameDurationlomOqCM = 1;
        }
    }

    @Override // com.daon.sdk.face.module.Analyzer
    public void analyze(com.daon.sdk.face.YUV yuv, android.os.Bundle bundle, com.daon.sdk.face.module.Analyzer.AnalyzerCallback analyzerCallback) {
        startAnalyzer(yuv, bundle, analyzerCallback);
    }

    @Override // com.daon.sdk.face.module.Module
    public java.lang.String getName() {
        return com.daon.sdk.face.license.License.FEATURE_QUALITY;
    }

    @Override // com.daon.sdk.face.module.Module
    public boolean isSupported(com.daon.sdk.face.license.License license) {
        if (!license.supportsFeature(com.daon.sdk.face.license.License.FEATURE_QUALITY)) {
            return false;
        }
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            try {
                java.lang.Class.forName("com.daon.face.quality.DaonFaceQuality");
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
        super.onAnalysisStopped();
        synchronized (this.getOutputFormats) {
            com.daon.face.quality.DaonFaceQuality daonFaceQuality = this.getInputFormats;
            if (daonFaceQuality != null) {
                daonFaceQuality.close();
            }
            java.util.concurrent.Future future = this.getOutputStallDuration;
            if (future != null) {
                future.cancel(true);
            }
            this.getOutputStallDuration = null;
        }
    }

    @Override // com.daon.sdk.face.module.Analyzer, com.daon.sdk.face.module.Module
    public void onConfigurationChanged(android.os.Bundle bundle) {
        if (bundle != null) {
            this.getHighResolutionOutputSizeshNQ4ISI = bundle;
            int i = bundle.getInt(com.daon.sdk.face.Config.QUALITY_FRAME_RATE);
            if (i != 0) {
                if (i > 0) {
                    this.getHighSpeedVideoSizes = 1000 / i;
                } else {
                    this.getHighSpeedVideoSizes = 0;
                }
            }
            this.getInputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI.getBoolean(com.daon.sdk.face.Config.QUALITY_TRACKING, this.getInputSizeshNQ4ISI);
            float f = this.getHighResolutionOutputSizeshNQ4ISI.getFloat(com.daon.sdk.face.Config.QUALITY_THRESHOLD_RANGE, this.getHighSpeedVideoFpsRanges);
            if (f >= 0.0f && f <= 100.0f) {
                this.getHighSpeedVideoFpsRanges = f;
            }
            float f2 = this.getHighResolutionOutputSizeshNQ4ISI.getFloat(com.daon.sdk.face.Config.QUALITY_THRESHOLD_CENTERED, this.getHighSpeedVideoFpsRangesFor);
            if (f2 >= 5.0f && f2 <= 100.0f) {
                this.getHighSpeedVideoFpsRangesFor = f2;
            }
            Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    @Override // com.daon.sdk.face.module.Analyzer
    public android.os.Bundle analyze(com.daon.sdk.face.YUV yuv, android.os.Bundle bundle) {
        java.util.concurrent.LinkedBlockingQueue<com.daon.sdk.face.YUV> linkedBlockingQueue;
        if (yuv.isEmpty()) {
            return null;
        }
        android.os.Bundle highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(yuv, this.getInputSizeshNQ4ISI, this.getOutputMinFrameDurationlomOqCM);
        if (!highSpeedVideoFpsRangesFor.getBoolean(com.daon.sdk.face.QualityResult.RESULT_FACE_FOUND) && (linkedBlockingQueue = this.queue) != null) {
            linkedBlockingQueue.clear();
        }
        return highSpeedVideoFpsRangesFor;
    }

    @Override // com.daon.sdk.face.module.Analyzer
    public android.os.Bundle analyze(android.graphics.Bitmap bitmap) {
        this.Camera2StreamConfigurationMap = 0L;
        return getHighSpeedVideoFpsRangesFor(new com.daon.sdk.face.YUV(bitmap), false, 0);
    }

    @Override // com.daon.sdk.face.module.Analyzer
    public android.os.Bundle analyze(com.daon.sdk.face.YUV yuv) {
        this.Camera2StreamConfigurationMap = 0L;
        return getHighSpeedVideoFpsRangesFor(yuv, false, this.getOutputMinFrameDurationlomOqCM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Camera2StreamConfigurationMap(android.os.Bundle bundle) {
        if (this.getInputFormats == null || bundle == null) {
            return;
        }
        try {
            float f = bundle.getFloat(com.daon.sdk.face.Config.QUALITY_THRESHOLD_FACE);
            if (f > 0.0f) {
                this.getInputFormats.setThresholdFaceConfidence(f);
            }
            float f2 = bundle.getFloat(com.daon.sdk.face.Config.QUALITY_THRESHOLD_FACE_ONE_ONLY);
            if (f2 > 0.0f) {
                this.getInputFormats.setThresholdOnlyOneFaceConfidence(f2);
            }
            float f3 = bundle.getFloat(com.daon.sdk.face.Config.QUALITY_THRESHOLD_EYES);
            if (f3 > 0.0f) {
                this.getInputFormats.setThresholdEyesFoundConfidence(f3);
            }
            float f4 = bundle.getFloat(com.daon.sdk.face.Config.QUALITY_THRESHOLD_EYES_OPEN);
            if (f4 > 0.0f) {
                this.getInputFormats.setThresholdEyesOpenConfidence(f4);
            }
            float f5 = bundle.getFloat(com.daon.sdk.face.Config.QUALITY_THRESHOLD_LIGHTING);
            if (f5 > 0.0f) {
                this.getInputFormats.setThresholdUniformLightingConfidence(f5);
            }
            float f6 = bundle.getFloat(com.daon.sdk.face.Config.QUALITY_THRESHOLD_FACE_FRONTAL);
            if (f6 > 0.0f) {
                this.getInputFormats.setThresholdFrontalPoseConfidence(f6);
            }
            float f7 = bundle.getFloat(com.daon.sdk.face.Config.QUALITY_THRESHOLD_SCORE);
            if (f7 > 0.0f) {
                this.getInputFormats.setThresholdGlobalFaceQualityScore(f7);
            }
            float f8 = bundle.getFloat(com.daon.sdk.face.Config.QUALITY_THRESHOLD_MIN_FACE_SIZE);
            if (f8 > 0.0f) {
                this.getInputFormats.setMinFaceDetectionSize(f8);
            }
            int i = bundle.getInt(com.daon.sdk.face.Config.QUALITY_THRESHOLD_EYE_DISTANCE);
            if (i > 0) {
                this.getInputFormats.setThresholdInterEyesDistance(i);
            }
            int i2 = bundle.getInt(com.daon.sdk.face.Config.QUALITY_THRESHOLD_FACE_ANGLE);
            if (i2 > 0) {
                this.getInputFormats.setThresholdRollAngleInDegrees(i2);
            }
            int i3 = bundle.getInt(com.daon.sdk.face.Config.QUALITY_THRESHOLD_SHARPNESS);
            if (i3 > 0) {
                this.getInputFormats.setThresholdSharpness(i3);
            }
            int i4 = bundle.getInt(com.daon.sdk.face.Config.QUALITY_THRESHOLD_EXPOSURE);
            if (i4 > 0) {
                this.getInputFormats.setThresholdExposure(i4);
            }
            int i5 = bundle.getInt(com.daon.sdk.face.Config.QUALITY_THRESHOLD_GRAYSCALE_DENSITY);
            if (i5 > 0) {
                this.getInputFormats.setThresholdGrayscaleDensity(i5);
            }
        } catch (java.lang.Exception e) {
            e.getLocalizedMessage();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private android.os.Bundle getHighSpeedVideoFpsRangesFor(com.daon.sdk.face.YUV yuv, boolean z, int i) {
        boolean booleanValue;
        android.os.Bundle bundle = new android.os.Bundle();
        if (yuv.getTimestamp() - this.Camera2StreamConfigurationMap >= this.getHighSpeedVideoSizes) {
            this.Camera2StreamConfigurationMap = java.lang.System.currentTimeMillis();
            try {
                synchronized (this.getOutputFormats) {
                    boolean z2 = false;
                    z2 = false;
                    z2 = false;
                    if (this.getOutputStallDuration == null) {
                        this.getOutputStallDuration = com.daon.sdk.face.util.a.a(new com.daon.sdk.face.module.analyzer.c.b(this, z2 ? (byte) 1 : (byte) 0));
                    }
                    java.util.concurrent.Future future = this.getOutputStallDuration;
                    if (future != null) {
                        if (!z) {
                            booleanValue = ((java.lang.Boolean) future.get()).booleanValue();
                        } else if (future.isDone()) {
                            booleanValue = ((java.lang.Boolean) this.getOutputStallDuration.get()).booleanValue();
                        }
                        if (booleanValue) {
                            if (i == 0) {
                                this.getInputFormats.ProcessFrame(yuv.getData(), yuv.getWidth(), yuv.getHeight(), i, 0, z);
                            } else if (i == 3) {
                                com.daon.sdk.face.YUV rotate180 = yuv.rotate180();
                                this.getInputFormats.ProcessFrame(rotate180.getData(), rotate180.getWidth(), rotate180.getHeight(), 0, 0, z);
                            } else {
                                this.getInputFormats.ProcessFrame(yuv.getData(), yuv.getHeight(), yuv.getWidth(), i, 0, z);
                            }
                            float faceFoundConfidence = this.getInputFormats.getFaceFoundConfidence();
                            if (z) {
                                faceFoundConfidence = getHighSpeedVideoSizes(this.getInputFormats.getFaceFoundConfidence(), this.getInputFormats.getThresholdFaceConfidence(), this.getOutputMinFrameDuration.getFloat(com.daon.sdk.face.QualityResult.RESULT_FACE_FOUND_SCORE));
                                if (this.getHighSpeedVideoFpsRanges > 0.0f) {
                                    faceFoundConfidence -= faceFoundConfidence % 0.05f;
                                }
                            }
                            int interEyesDistance = this.getInputFormats.getInterEyesDistance();
                            if (z) {
                                interEyesDistance = java.lang.Math.round(getHighSpeedVideoSizes(this.getInputFormats.getInterEyesDistance(), this.getInputFormats.getThresholdInterEyesDistance(), this.getOutputMinFrameDuration.getInt(com.daon.sdk.face.QualityResult.RESULT_EYES_DISTANCE_SCORE)));
                                if (this.getHighSpeedVideoFpsRanges > 0.0f) {
                                    interEyesDistance -= interEyesDistance % 5;
                                }
                            }
                            boolean z3 = interEyesDistance >= this.getInputFormats.getThresholdInterEyesDistance();
                            float globalFaceQualityScore = this.getInputFormats.getGlobalFaceQualityScore();
                            if (z) {
                                globalFaceQualityScore = getHighSpeedVideoSizes(this.getInputFormats.getGlobalFaceQualityScore(), this.getInputFormats.getThresholdGlobalFaceQualityScore(), this.getOutputMinFrameDuration.getFloat(com.daon.sdk.face.QualityResult.RESULT_GLOBAL_QUALITY_SCORE));
                                if (this.getHighSpeedVideoFpsRanges > 0.0f) {
                                    globalFaceQualityScore -= globalFaceQualityScore % 0.05f;
                                }
                            }
                            boolean z4 = globalFaceQualityScore >= this.getInputFormats.getThresholdGlobalFaceQualityScore();
                            boolean z5 = this.getInputFormats.getFaceFoundConfidence() >= this.getInputFormats.getThresholdFaceConfidence();
                            bundle.putBoolean(com.daon.sdk.face.QualityResult.RESULT_FACE_FOUND, z5);
                            bundle.putBoolean(com.daon.sdk.face.QualityResult.RESULT_FACE_ONE_ONLY, this.getInputFormats.isOnlyOneFacePass());
                            bundle.putBoolean(com.daon.sdk.face.QualityResult.RESULT_FACE_CONTINUITY, this.getInputFormats.isFaceContinuityPass());
                            bundle.putBoolean(com.daon.sdk.face.QualityResult.RESULT_FACE_FRONTAL, this.getInputFormats.isFrontalPosePass());
                            bundle.putBoolean(com.daon.sdk.face.QualityResult.RESULT_EYES_FOUND, this.getInputFormats.isEyesFoundPass());
                            bundle.putBoolean(com.daon.sdk.face.QualityResult.RESULT_EYES_OPEN, this.getInputFormats.isEyesFoundPass() && this.getInputFormats.isEyesOpenPass());
                            bundle.putBoolean(com.daon.sdk.face.QualityResult.RESULT_EYES_DISTANCE, z3);
                            bundle.putBoolean(com.daon.sdk.face.QualityResult.RESULT_POSE_ANGLE, this.getInputFormats.isPoseAngleRollPass());
                            bundle.putBoolean(com.daon.sdk.face.QualityResult.RESULT_LIGHTING, this.getInputFormats.isUniformLightingPass());
                            bundle.putBoolean(com.daon.sdk.face.QualityResult.RESULT_SHARPNESS, this.getInputFormats.isSharpnessPass());
                            bundle.putBoolean(com.daon.sdk.face.QualityResult.RESULT_EXPOSURE, this.getInputFormats.isExposurePass());
                            bundle.putBoolean(com.daon.sdk.face.QualityResult.RESULT_GRAYSCALE_DENSITY, this.getInputFormats.isGrayscaleDensityPass());
                            bundle.putBoolean(com.daon.sdk.face.QualityResult.RESULT_GLOBAL_QUALITY, z4);
                            bundle.putFloat(com.daon.sdk.face.QualityResult.RESULT_FACE_FOUND_SCORE, faceFoundConfidence);
                            bundle.putFloat(com.daon.sdk.face.QualityResult.RESULT_FACE_ONE_ONLY_SCORE, this.getInputFormats.getOnlyOneFaceConfidence());
                            bundle.putFloat(com.daon.sdk.face.QualityResult.RESULT_FACE_CONTINUITY_SCORE, this.getInputFormats.getFaceContinuityConfidence());
                            bundle.putFloat(com.daon.sdk.face.QualityResult.RESULT_FACE_FRONTAL_SCORE, this.getInputFormats.getFrontalPoseConfidence());
                            bundle.putFloat(com.daon.sdk.face.QualityResult.RESULT_EYES_FOUND_SCORE, this.getInputFormats.getEyesFoundConfidence());
                            bundle.putFloat(com.daon.sdk.face.QualityResult.RESULT_EYES_OPEN_SCORE, this.getInputFormats.getEyesOpenConfidence());
                            bundle.putInt(com.daon.sdk.face.QualityResult.RESULT_EYES_DISTANCE_SCORE, interEyesDistance);
                            bundle.putInt(com.daon.sdk.face.QualityResult.RESULT_POSE_ANGLE_SCORE, this.getInputFormats.getPoseAngleRoll());
                            bundle.putFloat(com.daon.sdk.face.QualityResult.RESULT_LIGHTING_SCORE, this.getInputFormats.getUniformLightingConfidence());
                            bundle.putInt(com.daon.sdk.face.QualityResult.RESULT_SHARPNESS_SCORE, this.getInputFormats.getSharpness());
                            bundle.putInt(com.daon.sdk.face.QualityResult.RESULT_EXPOSURE_SCORE, this.getInputFormats.getExposure());
                            bundle.putInt(com.daon.sdk.face.QualityResult.RESULT_GRAYSCALE_DENSITY_SCORE, this.getInputFormats.getGrayscaleDensity());
                            bundle.putFloat(com.daon.sdk.face.QualityResult.RESULT_GLOBAL_QUALITY_SCORE, globalFaceQualityScore);
                            if (z) {
                                bundle.putInt("result.liveness.tracker.quality", (this.getInputFormats.isFaceContinuityPass() || z5) ? 1 : 0);
                            }
                            android.os.Parcelable point = new android.graphics.Point(-1, -1);
                            android.os.Parcelable point2 = new android.graphics.Point(-1, -1);
                            android.graphics.Rect rect = new android.graphics.Rect();
                            if (z5 && this.getInputFormats.isEyesFoundPass()) {
                                point = new android.graphics.Point(this.getInputFormats.getLeftEyePositionX(), this.getInputFormats.getLeftEyePositionY());
                                point2 = new android.graphics.Point(this.getInputFormats.getRightEyePositionX(), this.getInputFormats.getRightEyePositionY());
                            }
                            bundle.putParcelable(com.daon.sdk.face.QualityResult.RESULT_EYES_LEFT_POSITION, point);
                            bundle.putParcelable(com.daon.sdk.face.QualityResult.RESULT_EYES_RIGHT_POSITION, point2);
                            if (z5) {
                                rect = new android.graphics.Rect(this.getInputFormats.getFaceBoxUpperLeftCornerX(), this.getInputFormats.getFaceBoxUpperLeftCornerY(), this.getInputFormats.getFaceBoxLowerRightCornerX(), this.getInputFormats.getFaceBoxLowerRightCornerY());
                            }
                            bundle.putParcelable(com.daon.sdk.face.QualityResult.RESULT_FACE_RECTANGLE, rect);
                            int centerX = rect.centerX();
                            int centerY = rect.centerY();
                            int width = yuv.getWidth();
                            int height = yuv.getHeight();
                            float f = i == 0 ? width : height;
                            float f2 = i == 0 ? height : width;
                            float f3 = this.getHighSpeedVideoFpsRangesFor;
                            float f4 = (f * f3) / 100.0f;
                            float f5 = (f2 * f3) / 100.0f;
                            float f6 = (i == 0 ? width : height) / 2.0f;
                            float f7 = (i == 0 ? height : width) / 2.0f;
                            float f8 = centerX;
                            java.lang.Object[] objArr = f8 < f6 + f4 && f8 > f6 - f4;
                            float f9 = centerY;
                            if (f9 < f7 + f5 && f9 > f7 - f5 && objArr != false) {
                                z2 = true;
                            }
                            bundle.putBoolean(com.daon.sdk.face.QualityResult.RESULT_FACE_CENTERED, z2);
                            float f10 = (bundle.getFloat(com.daon.sdk.face.QualityResult.RESULT_EYES_FOUND_SCORE) * bundle.getFloat(com.daon.sdk.face.QualityResult.RESULT_EYES_OPEN_SCORE)) + bundle.getFloat(com.daon.sdk.face.QualityResult.RESULT_GLOBAL_QUALITY_SCORE) + bundle.getInt(com.daon.sdk.face.QualityResult.RESULT_EYES_DISTANCE_SCORE);
                            bundle.putFloat(com.daon.sdk.face.QualityResult.RESULT_IMAGE_QUALITY_SCORE, f10);
                            if (z4 && z3 && z2 && this.getInputFormats.isEyesOpenPass()) {
                                bundle.putFloat(com.daon.sdk.face.QualityResult.RESULT_IMAGE_BEST_SCORE, f10);
                            } else {
                                bundle.putFloat(com.daon.sdk.face.QualityResult.RESULT_IMAGE_BEST_SCORE, 0.0f);
                            }
                        }
                    }
                }
            } catch (com.daon.face.quality.DaonFaceQualityException e) {
                bundle.putInt(com.daon.sdk.face.Result.RESULT_ERROR_CODE, e.getErrorCode());
                bundle.putString(com.daon.sdk.face.Result.RESULT_ERROR_MESSAGE, e.getMessage());
            } catch (java.lang.Error e2) {
                e = e2;
                bundle.putString(com.daon.sdk.face.Result.RESULT_ERROR_MESSAGE, e.getMessage());
            } catch (java.lang.Exception e3) {
                e = e3;
                bundle.putString(com.daon.sdk.face.Result.RESULT_ERROR_MESSAGE, e.getMessage());
            }
        }
        this.getOutputMinFrameDuration.putAll(bundle);
        return bundle;
    }

    private float getHighSpeedVideoSizes(float f, float f2, float f3) {
        if (f < f2) {
            float f4 = this.getHighSpeedVideoFpsRanges;
            if (f4 > 0.0f && f3 >= f2 && ((f4 * f2) / 100.0f) + f >= f2) {
                return f3;
            }
        }
        return f;
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(android.content.res.AssetManager assetManager, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.io.File file = new java.io.File(str3);
        if (!file.exists()) {
            file.mkdirs();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        java.lang.String str4 = java.io.File.separator;
        sb.append(str4);
        sb.append(str2);
        java.io.InputStream open = assetManager.open(sb.toString());
        try {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str3);
            sb2.append(str4);
            sb2.append(str2);
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(sb2.toString());
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = open.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        open.close();
                        return;
                    }
                }
            } finally {
            }
        } catch (java.lang.Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
