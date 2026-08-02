package com.daon.sdk.face.module.analyzer;

/* loaded from: classes7.dex */
public class b extends com.daon.sdk.face.module.Analyzer {
    private final android.content.Context Camera2StreamConfigurationMap;
    private com.daon.face.passivelivenessv1.DaonFacePassiveLivenessV1 getHighSpeedVideoFpsRanges;
    private long getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private java.util.concurrent.Future getValidOutputFormatsForInputhNQ4ISI;
    private java.util.concurrent.Future toString;
    private final java.lang.Object getHighSpeedVideoFpsRangesFor = new java.lang.Object();
    private boolean getHighSpeedVideoSizes = false;
    private long getOutputMinFrameDuration = 0;
    private int getInputFormats = 0;
    private com.daon.sdk.face.module.analyzer.b.EnumC0056b getHighSpeedVideoSizesFor = com.daon.sdk.face.module.analyzer.b.EnumC0056b.NONE;
    private int getOutputSizeshNQ4ISI = 20000;
    private int getOutputStallDuration = 500;
    private int getOutputStallDurationlomOqCM = 0;
    private boolean getOutputSizes = false;
    private int getOutputMinFrameDurationlomOqCM = 80;
    private int isOutputSupportedFor = 10;
    private double isOutputSupportedForhNQ4ISI = 0.5d;
    private boolean unwrapAs = false;
    int getHighResolutionOutputSizeshNQ4ISI = 1024;

    static abstract /* synthetic */ class a {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[com.daon.sdk.face.module.analyzer.b.EnumC0056b.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[com.daon.sdk.face.module.analyzer.b.EnumC0056b.INIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[com.daon.sdk.face.module.analyzer.b.EnumC0056b.START.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[com.daon.sdk.face.module.analyzer.b.EnumC0056b.TRACKING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                Camera2StreamConfigurationMap[com.daon.sdk.face.module.analyzer.b.EnumC0056b.ANALYZING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                Camera2StreamConfigurationMap[com.daon.sdk.face.module.analyzer.b.EnumC0056b.DONE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: com.daon.sdk.face.module.analyzer.b$b, reason: collision with other inner class name */
    enum EnumC0056b {
        NONE,
        INIT,
        START,
        TRACKING,
        ANALYZING,
        DONE
    }

    public b(android.content.Context context, int i) {
        this.getOutputFormats = 0;
        this.Camera2StreamConfigurationMap = context;
        if (i == 90) {
            this.getOutputFormats = 1;
        } else if (i == 180) {
            this.getOutputFormats = 3;
        }
        if (i == 270) {
            this.getOutputFormats = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013b, code lost:
    
        r0.putString(com.daon.sdk.face.LivenessResult.RESULT_IMAGE, r3);
        com.daon.sdk.face.FileTools.write(r14.Camera2StreamConfigurationMap, com.daon.sdk.face.LivenessResult.RESULT_IMAGE, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ android.os.Bundle getHighSpeedVideoFpsRanges() {
        java.lang.String highResolutionOutputSizeshNQ4ISI;
        com.daon.face.passivelivenessv1.DaonFacePassiveLivenessV1 daonFacePassiveLivenessV1;
        byte[] bestFrameRGBArray;
        android.os.Bundle bundle = new android.os.Bundle();
        if (!this.getHighSpeedVideoSizes) {
            return bundle;
        }
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            com.daon.face.passivelivenessv1.DaonFacePassiveLivenessV1 daonFacePassiveLivenessV12 = this.getHighSpeedVideoFpsRanges;
            if (daonFacePassiveLivenessV12 != null) {
                byte[] bArr = null;
                byte[] createTemplate = this.getOutputSizes ? daonFacePassiveLivenessV12.createTemplate(this.getOutputMinFrameDurationlomOqCM) : null;
                int doLivenessAssessment = this.getHighSpeedVideoFpsRanges.doLivenessAssessment();
                double scoreLiveness = doLivenessAssessment == 0 ? this.getHighSpeedVideoFpsRanges.getScoreLiveness() : 0.0d;
                bundle.putFloat(com.daon.sdk.face.LivenessResult.RESULT_SCORE, (float) scoreLiveness);
                if (scoreLiveness >= this.isOutputSupportedForhNQ4ISI) {
                    bundle.putBoolean(com.daon.sdk.face.LivenessResult.RESULT_LIVENESS, true);
                    bundle.putBoolean(com.daon.sdk.face.LivenessResult.RESULT_SPOOF, false);
                    bundle.putInt(com.daon.sdk.face.LivenessResult.RESULT_ALERT, doLivenessAssessment != 2 ? doLivenessAssessment != 3 ? doLivenessAssessment != 4 ? doLivenessAssessment != 5 ? 0 : 12 : 11 : 13 : 10);
                } else {
                    bundle.putBoolean(com.daon.sdk.face.LivenessResult.RESULT_LIVENESS, false);
                    bundle.putBoolean(com.daon.sdk.face.LivenessResult.RESULT_SPOOF, true);
                    bundle.putInt(com.daon.sdk.face.LivenessResult.RESULT_ALERT, 9);
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(this.Camera2StreamConfigurationMap.getFilesDir().getAbsolutePath());
                sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                java.lang.String obj = sb.toString();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(obj);
                sb2.append(com.daon.sdk.face.LivenessResult.RESULT_TEMPLATE);
                java.lang.String obj2 = sb2.toString();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(obj);
                sb3.append(com.daon.sdk.face.LivenessResult.RESULT_IMAGE);
                java.lang.String obj3 = sb3.toString();
                if (createTemplate != null) {
                    bundle.putString(com.daon.sdk.face.LivenessResult.RESULT_TEMPLATE, obj2);
                    com.daon.sdk.face.FileTools.write(this.Camera2StreamConfigurationMap, com.daon.sdk.face.LivenessResult.RESULT_TEMPLATE, createTemplate);
                } else {
                    com.daon.sdk.face.FileTools.delete(new java.io.File(obj2));
                }
                if (scoreLiveness >= this.isOutputSupportedForhNQ4ISI && (daonFacePassiveLivenessV1 = this.getHighSpeedVideoFpsRanges) != null && (bestFrameRGBArray = daonFacePassiveLivenessV1.getBestFrameRGBArray()) != null && bestFrameRGBArray.length > 0) {
                    int[] iArr = new int[bestFrameRGBArray.length / 3];
                    for (int i = 0; i < bestFrameRGBArray.length; i += 3) {
                        iArr[i / 3] = ((bestFrameRGBArray[i] & 255) << 16) | (-16777216) | ((bestFrameRGBArray[i + 1] & 255) << 8) | (bestFrameRGBArray[i + 2] & 255);
                    }
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(iArr, (int) this.getHighSpeedVideoFpsRanges.getBestFrameWidth(), (int) this.getHighSpeedVideoFpsRanges.getBestFrameHeight(), android.graphics.Bitmap.Config.ARGB_8888);
                    int imageOrientation = com.daon.sdk.face.CameraTools.getImageOrientation(this.Camera2StreamConfigurationMap);
                    if (imageOrientation == 270) {
                        imageOrientation = 90;
                    } else if (imageOrientation == 90) {
                        imageOrientation = 270;
                    }
                    android.graphics.Bitmap rotate = com.daon.sdk.face.BitmapTools.rotate(createBitmap, imageOrientation, false);
                    bArr = com.daon.sdk.face.BitmapTools.compress(rotate, 100);
                    rotate.recycle();
                }
                com.daon.sdk.face.FileTools.delete(new java.io.File(obj3));
                if (this.unwrapAs && (highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(scoreLiveness, bundle)) != null) {
                    bundle.putString(com.daon.sdk.face.LivenessResult.RESULT_DEBUG, highResolutionOutputSizeshNQ4ISI);
                }
            }
        }
        return bundle;
    }

    private boolean getHighSpeedVideoFpsRanges(final int i, final int i2) {
        if (this.toString == null) {
            synchronized (this.getHighSpeedVideoFpsRangesFor) {
                this.toString = com.daon.sdk.face.util.a.a(new java.util.concurrent.Callable() { // from class: com.daon.sdk.face.module.analyzer.b$$ExternalSyntheticLambda0
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        return com.daon.sdk.face.module.analyzer.b.$r8$lambda$JUfQlGh82Rvu3ERUDbTQqgur238(com.daon.sdk.face.module.analyzer.b.this, i, i2);
                    }
                });
            }
        }
        java.util.concurrent.Future future = this.toString;
        if (future == null || !future.isDone()) {
            return false;
        }
        return ((java.lang.Boolean) this.toString.get()).booleanValue();
    }

    @Override // com.daon.sdk.face.module.Analyzer
    public void analyze(com.daon.sdk.face.YUV yuv, android.os.Bundle bundle, com.daon.sdk.face.module.Analyzer.AnalyzerCallback analyzerCallback) {
        startAnalyzer(yuv, bundle, analyzerCallback);
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
                try {
                    java.lang.Class.forName("com.daon.face.quality.DaonFaceQuality");
                    java.lang.Class.forName("com.daon.face.detector.DaonFaceDetector");
                    java.lang.Class.forName("com.daon.face.authentication.DaonFaceV3");
                    java.lang.Class.forName("com.daon.face.passivelivenessv1.DaonFacePassiveLivenessV1");
                    android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
                    return true;
                } catch (java.lang.Error e) {
                    e.getLocalizedMessage();
                    return false;
                }
            } catch (java.lang.ClassNotFoundException e2) {
                e2.getLocalizedMessage();
                return false;
            }
        } finally {
            android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    @Override // com.daon.sdk.face.module.Analyzer
    public void onAnalysisStopped() {
        super.onAnalysisStopped();
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            try {
                com.daon.face.passivelivenessv1.DaonFacePassiveLivenessV1 daonFacePassiveLivenessV1 = this.getHighSpeedVideoFpsRanges;
                if (daonFacePassiveLivenessV1 != null) {
                    daonFacePassiveLivenessV1.clearFrameData();
                    this.getHighSpeedVideoFpsRanges.close();
                }
            } catch (java.lang.Exception unused) {
            }
            java.util.concurrent.Future future = this.toString;
            if (future != null) {
                future.cancel(true);
            }
            this.toString = null;
        }
    }

    @Override // com.daon.sdk.face.module.Analyzer, com.daon.sdk.face.module.Module
    public void onConfigurationChanged(android.os.Bundle bundle) {
        if (bundle != null) {
            int i = bundle.getInt(com.daon.sdk.face.Config.LIVENESS_START_DELAY, this.getOutputStallDuration);
            this.getOutputStallDuration = i;
            if (i <= 0) {
                this.getOutputStallDuration = 500;
            }
            this.getOutputSizeshNQ4ISI = bundle.getInt(com.daon.sdk.face.Config.LIVENESS_TIMEOUT, this.getOutputSizeshNQ4ISI);
            this.getOutputMinFrameDurationlomOqCM = bundle.getInt(com.daon.sdk.face.Config.LIVENESS_TEMPLATE_QUALITY, this.getOutputMinFrameDurationlomOqCM);
            this.isOutputSupportedFor = bundle.getInt(com.daon.sdk.face.Config.LIVENESS_ANALYSIS_FRAME_COUNT, this.isOutputSupportedFor);
            this.getOutputSizes = bundle.getBoolean(com.daon.sdk.face.Config.LIVENESS_TEMPLATE, this.getOutputSizes);
            this.isOutputSupportedForhNQ4ISI = bundle.getDouble(com.daon.sdk.face.Config.LIVENESS_THRESHOLD, this.isOutputSupportedForhNQ4ISI);
            this.unwrapAs = bundle.getBoolean(com.daon.sdk.face.Config.LIVENESS_DEBUG, this.unwrapAs);
        }
    }

    @Override // com.daon.sdk.face.module.Module
    public void reset() {
        super.reset();
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            try {
                com.daon.face.passivelivenessv1.DaonFacePassiveLivenessV1 daonFacePassiveLivenessV1 = this.getHighSpeedVideoFpsRanges;
                if (daonFacePassiveLivenessV1 != null) {
                    daonFacePassiveLivenessV1.clearFrameData();
                    this.getHighSpeedVideoFpsRanges.setNativeRotation(this.getOutputFormats);
                    this.getHighSpeedVideoFpsRanges.setNativeColorSpace(2);
                    this.getHighSpeedVideoFpsRanges.setDevicePlatform(2);
                    this.getHighSpeedVideoFpsRanges.setContinuity(0);
                }
            } catch (java.lang.Exception unused) {
            }
            this.getHighSpeedVideoSizesFor = com.daon.sdk.face.module.analyzer.b.EnumC0056b.NONE;
            this.getInputSizeshNQ4ISI = 0L;
            this.getOutputMinFrameDuration = 0L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r2v23, types: [android.content.Context] */
    @Override // com.daon.sdk.face.module.Analyzer
    public android.os.Bundle analyze(com.daon.sdk.face.YUV yuv, android.os.Bundle bundle) {
        com.daon.sdk.face.module.analyzer.b.EnumC0056b enumC0056b;
        android.os.Bundle bundle2;
        com.daon.sdk.face.module.analyzer.b.EnumC0056b enumC0056b2;
        com.daon.sdk.face.module.analyzer.b.EnumC0056b enumC0056b3;
        android.os.Bundle bundle3;
        com.daon.sdk.face.module.analyzer.b.EnumC0056b enumC0056b4;
        com.daon.sdk.face.module.analyzer.b.EnumC0056b enumC0056b5;
        long j;
        ?? r15;
        com.daon.sdk.face.module.analyzer.b.EnumC0056b enumC0056b6;
        android.os.Bundle bundle4 = new android.os.Bundle();
        try {
            enumC0056b2 = this.getHighSpeedVideoSizesFor;
            enumC0056b3 = com.daon.sdk.face.module.analyzer.b.EnumC0056b.DONE;
        } catch (java.lang.Error e) {
            e = e;
            enumC0056b = bundle4;
            bundle2 = enumC0056b;
            bundle2.putString(com.daon.sdk.face.Result.RESULT_ERROR_MESSAGE, e.getMessage());
            bundle2.putInt(com.daon.sdk.face.LivenessResult.RESULT_TARGET_POSITION, this.getOutputStallDurationlomOqCM);
            return bundle2;
        } catch (java.lang.Exception e2) {
            e = e2;
            enumC0056b = bundle4;
            bundle2 = enumC0056b;
            bundle2.putString(com.daon.sdk.face.Result.RESULT_ERROR_MESSAGE, e.getMessage());
            bundle2.putInt(com.daon.sdk.face.LivenessResult.RESULT_TARGET_POSITION, this.getOutputStallDurationlomOqCM);
            return bundle2;
        } catch (com.daon.face.passivelivenessv1.DaonFacePassiveLivenessV1Exception e3) {
            e = e3;
            enumC0056b = bundle4;
        }
        if (enumC0056b2 == enumC0056b3) {
            getHighSpeedVideoFpsRanges(enumC0056b3, -1, bundle4);
            return bundle4;
        }
        boolean highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(yuv.getHeight(), yuv.getWidth());
        this.getHighSpeedVideoSizes = highSpeedVideoFpsRanges;
        if (highSpeedVideoFpsRanges) {
            com.daon.sdk.face.Result result = new com.daon.sdk.face.Result(bundle);
            double d = result.getBundle().getFloat(com.daon.sdk.face.Result.RESULT_SENSOR_ACC_X);
            double d2 = result.getBundle().getFloat(com.daon.sdk.face.Result.RESULT_SENSOR_ACC_Y);
            double d3 = result.getBundle().getFloat(com.daon.sdk.face.Result.RESULT_SENSOR_ACC_Z);
            if (this.getOutputMinFrameDuration != 0 && java.lang.System.currentTimeMillis() - this.getOutputMinFrameDuration >= this.getOutputSizeshNQ4ISI) {
                getHighSpeedVideoFpsRanges(enumC0056b3, 15, bundle4);
            }
            if (this.getInputSizeshNQ4ISI == 0) {
                this.getInputSizeshNQ4ISI = yuv.getTimestamp();
            }
            long timestamp = yuv.getTimestamp() - this.getInputSizeshNQ4ISI;
            com.daon.sdk.face.module.analyzer.b.EnumC0056b enumC0056b7 = this.getHighSpeedVideoSizesFor;
            enumC0056b = com.daon.sdk.face.module.analyzer.b.EnumC0056b.ANALYZING;
            try {
                if (enumC0056b7 == enumC0056b || enumC0056b7 == enumC0056b3) {
                    enumC0056b4 = enumC0056b3;
                    enumC0056b5 = enumC0056b;
                    j = timestamp;
                    r15 = 0;
                    bundle3 = bundle4;
                } else {
                    synchronized (this.getHighSpeedVideoFpsRangesFor) {
                        try {
                            enumC0056b4 = enumC0056b3;
                            enumC0056b5 = enumC0056b;
                            byte[] a2 = com.daon.sdk.renderscript.Toolkit.f2846a.a(yuv.getData(), yuv.getWidth(), yuv.getHeight(), com.daon.sdk.renderscript.c.b);
                            com.daon.face.passivelivenessv1.DaonFacePassiveLivenessV1 daonFacePassiveLivenessV1 = this.getHighSpeedVideoFpsRanges;
                            bundle3 = bundle4;
                            if (daonFacePassiveLivenessV1 != null) {
                                double d4 = timestamp;
                                r15 = 0;
                                j = timestamp;
                                try {
                                    daonFacePassiveLivenessV1.queryPreviewSensorData(d, d2, d3, d4);
                                    this.getOutputStallDurationlomOqCM = this.getHighSpeedVideoFpsRanges.queryPreviewFrameData(a2, d4);
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            } else {
                                j = timestamp;
                                r15 = 0;
                            }
                            if (this.unwrapAs) {
                                ?? r2 = this.Camera2StreamConfigurationMap;
                                int i = this.getOutputStallDurationlomOqCM;
                                if (a2 != null) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    sb.append(r2.getExternalFilesDir(r15));
                                    sb.append("/frames");
                                    java.lang.String obj = sb.toString();
                                    new java.io.File(obj).mkdir();
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                    sb2.append(obj);
                                    sb2.append("/pos");
                                    sb2.append(i);
                                    sb2.append("-");
                                    sb2.append(new java.util.Date().getTime());
                                    sb2.append(com.paypal.oslo.feature.revolvingcreditacquisition.utils.FileNameConstants.IMAGE_FILE_SUFFIX);
                                    java.lang.String obj2 = sb2.toString();
                                    int length = a2.length / 4;
                                    int[] iArr = new int[length];
                                    int i2 = 0;
                                    int i3 = 0;
                                    while (i3 < length) {
                                        iArr[i3] = ((a2[i2 + 3] & 255) << 24) | ((a2[i2] & 255) << 16) | ((a2[i2 + 1] & 255) << 8) | (a2[i2 + 2] & 255);
                                        i3++;
                                        i2 += 4;
                                    }
                                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(640, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, android.graphics.Bitmap.Config.ARGB_8888);
                                    createBitmap.setPixels(iArr, 0, 640, 0, 0, 640, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND);
                                    byte[] compress = com.daon.sdk.face.BitmapTools.compress(createBitmap, 100);
                                    try {
                                        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(obj2);
                                        fileOutputStream.write(compress);
                                        fileOutputStream.close();
                                    } catch (java.lang.Exception unused) {
                                    }
                                    createBitmap.recycle();
                                }
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                        }
                    }
                }
                enumC0056b6 = this.getHighSpeedVideoSizesFor;
            } catch (java.lang.Error e4) {
                e = e4;
                bundle2 = enumC0056b;
                bundle2.putString(com.daon.sdk.face.Result.RESULT_ERROR_MESSAGE, e.getMessage());
                bundle2.putInt(com.daon.sdk.face.LivenessResult.RESULT_TARGET_POSITION, this.getOutputStallDurationlomOqCM);
                return bundle2;
            } catch (java.lang.Exception e5) {
                e = e5;
                bundle2 = enumC0056b;
                bundle2.putString(com.daon.sdk.face.Result.RESULT_ERROR_MESSAGE, e.getMessage());
                bundle2.putInt(com.daon.sdk.face.LivenessResult.RESULT_TARGET_POSITION, this.getOutputStallDurationlomOqCM);
                return bundle2;
            } catch (com.daon.face.passivelivenessv1.DaonFacePassiveLivenessV1Exception e6) {
                e = e6;
                bundle2 = enumC0056b;
                bundle2.putInt(com.daon.sdk.face.Result.RESULT_ERROR_CODE, e.getErrorCode());
                bundle2.putString(com.daon.sdk.face.Result.RESULT_ERROR_MESSAGE, e.getMessage());
                bundle2.putInt(com.daon.sdk.face.LivenessResult.RESULT_TARGET_POSITION, this.getOutputStallDurationlomOqCM);
                return bundle2;
            }
            if (enumC0056b6 != com.daon.sdk.face.module.analyzer.b.EnumC0056b.NONE || j == 0) {
                com.daon.sdk.face.module.analyzer.b.EnumC0056b enumC0056b8 = com.daon.sdk.face.module.analyzer.b.EnumC0056b.INIT;
                if (enumC0056b6 == enumC0056b8) {
                    if (this.unwrapAs) {
                        Camera2StreamConfigurationMap(this.getOutputStallDurationlomOqCM);
                    }
                    switch (this.getOutputStallDurationlomOqCM) {
                        case -4:
                        case 4:
                            getHighSpeedVideoFpsRanges(enumC0056b8, 2, bundle3);
                            break;
                        case -3:
                        case 1:
                            getHighSpeedVideoFpsRanges(com.daon.sdk.face.module.analyzer.b.EnumC0056b.START, 8, bundle3);
                            break;
                        case -2:
                        case 2:
                            getHighSpeedVideoFpsRanges(com.daon.sdk.face.module.analyzer.b.EnumC0056b.START, 0, bundle3);
                            break;
                        case -1:
                        case 3:
                            getHighSpeedVideoFpsRanges(com.daon.sdk.face.module.analyzer.b.EnumC0056b.START, 7, bundle3);
                            break;
                        case 0:
                            getHighSpeedVideoFpsRanges(enumC0056b8, 1, bundle3);
                            break;
                    }
                } else {
                    com.daon.sdk.face.module.analyzer.b.EnumC0056b enumC0056b9 = com.daon.sdk.face.module.analyzer.b.EnumC0056b.START;
                    if (enumC0056b6 == enumC0056b9) {
                        getHighSpeedVideoFpsRanges(enumC0056b9, 0, bundle3);
                        if (this.getOutputMinFrameDuration == 0) {
                            this.getOutputMinFrameDuration = java.lang.System.currentTimeMillis();
                        }
                        if (java.lang.System.currentTimeMillis() - this.getOutputMinFrameDuration >= this.getOutputStallDuration) {
                            getHighSpeedVideoFpsRanges(com.daon.sdk.face.module.analyzer.b.EnumC0056b.TRACKING, -1, bundle3);
                        }
                    } else {
                        com.daon.sdk.face.module.analyzer.b.EnumC0056b enumC0056b10 = com.daon.sdk.face.module.analyzer.b.EnumC0056b.TRACKING;
                        if (enumC0056b6 == enumC0056b10) {
                            getHighSpeedVideoFpsRanges(enumC0056b10, 0, bundle3);
                            if (this.unwrapAs) {
                                Camera2StreamConfigurationMap(this.getOutputStallDurationlomOqCM);
                            }
                            switch (this.getOutputStallDurationlomOqCM) {
                                case -4:
                                case 4:
                                    getHighSpeedVideoFpsRanges(enumC0056b10, 2, bundle3);
                                    this.getInputFormats = 0;
                                    break;
                                case -3:
                                case 1:
                                    getHighSpeedVideoFpsRanges(enumC0056b10, 8, bundle3);
                                    this.getInputFormats = 0;
                                    break;
                                case -2:
                                case 2:
                                    int i4 = this.getInputFormats + 1;
                                    this.getInputFormats = i4;
                                    if (i4 <= this.isOutputSupportedFor) {
                                        getHighSpeedVideoFpsRanges(enumC0056b10, 0, bundle3);
                                        break;
                                    } else {
                                        getHighSpeedVideoFpsRanges(enumC0056b5, 0, bundle3);
                                        if (this.getValidOutputFormatsForInputhNQ4ISI == null) {
                                            this.getValidOutputFormatsForInputhNQ4ISI = com.daon.sdk.face.util.a.a(new java.util.concurrent.Callable() { // from class: com.daon.sdk.face.module.analyzer.b$$ExternalSyntheticLambda1
                                                @Override // java.util.concurrent.Callable
                                                public final java.lang.Object call() {
                                                    android.os.Bundle highSpeedVideoFpsRanges2;
                                                    highSpeedVideoFpsRanges2 = com.daon.sdk.face.module.analyzer.b.this.getHighSpeedVideoFpsRanges();
                                                    return highSpeedVideoFpsRanges2;
                                                }
                                            });
                                            break;
                                        }
                                    }
                                    break;
                                case -1:
                                case 3:
                                    getHighSpeedVideoFpsRanges(enumC0056b10, 7, bundle3);
                                    this.getInputFormats = 0;
                                    break;
                                case 0:
                                    getHighSpeedVideoFpsRanges(enumC0056b10, 1, bundle3);
                                    this.getInputFormats = 0;
                                    break;
                            }
                        } else {
                            com.daon.sdk.face.module.analyzer.b.EnumC0056b enumC0056b11 = enumC0056b5;
                            if (enumC0056b6 == enumC0056b11) {
                                getHighSpeedVideoFpsRanges(enumC0056b11, 0, bundle3);
                                java.util.concurrent.Future future = this.getValidOutputFormatsForInputhNQ4ISI;
                                if (future != null && future.isDone()) {
                                    bundle2 = (android.os.Bundle) this.getValidOutputFormatsForInputhNQ4ISI.get();
                                    try {
                                        getHighSpeedVideoFpsRanges(enumC0056b4, -1, bundle2);
                                    } catch (java.lang.Error e7) {
                                        e = e7;
                                        bundle2.putString(com.daon.sdk.face.Result.RESULT_ERROR_MESSAGE, e.getMessage());
                                        bundle2.putInt(com.daon.sdk.face.LivenessResult.RESULT_TARGET_POSITION, this.getOutputStallDurationlomOqCM);
                                        return bundle2;
                                    } catch (java.lang.Exception e8) {
                                        e = e8;
                                        bundle2.putString(com.daon.sdk.face.Result.RESULT_ERROR_MESSAGE, e.getMessage());
                                        bundle2.putInt(com.daon.sdk.face.LivenessResult.RESULT_TARGET_POSITION, this.getOutputStallDurationlomOqCM);
                                        return bundle2;
                                    } catch (com.daon.face.passivelivenessv1.DaonFacePassiveLivenessV1Exception e9) {
                                        e = e9;
                                        bundle2.putInt(com.daon.sdk.face.Result.RESULT_ERROR_CODE, e.getErrorCode());
                                        bundle2.putString(com.daon.sdk.face.Result.RESULT_ERROR_MESSAGE, e.getMessage());
                                        bundle2.putInt(com.daon.sdk.face.LivenessResult.RESULT_TARGET_POSITION, this.getOutputStallDurationlomOqCM);
                                        return bundle2;
                                    }
                                    bundle2.putInt(com.daon.sdk.face.LivenessResult.RESULT_TARGET_POSITION, this.getOutputStallDurationlomOqCM);
                                    return bundle2;
                                }
                            } else {
                                com.daon.sdk.face.module.analyzer.b.EnumC0056b enumC0056b12 = enumC0056b4;
                                if (enumC0056b6 == enumC0056b12) {
                                    getHighSpeedVideoFpsRanges(enumC0056b12, -1, bundle3);
                                }
                            }
                        }
                    }
                }
            } else {
                this.getValidOutputFormatsForInputhNQ4ISI = r15;
                this.getInputSizeshNQ4ISI = 0L;
                this.getOutputMinFrameDuration = 0L;
                this.getInputFormats = 0;
                getHighSpeedVideoFpsRanges(com.daon.sdk.face.module.analyzer.b.EnumC0056b.INIT, 1, bundle3);
            }
        } else {
            bundle3 = bundle4;
        }
        bundle2 = bundle3;
        bundle2.putInt(com.daon.sdk.face.LivenessResult.RESULT_TARGET_POSITION, this.getOutputStallDurationlomOqCM);
        return bundle2;
    }

    private java.lang.String getHighResolutionOutputSizeshNQ4ISI(double d, android.os.Bundle bundle) {
        try {
            java.io.File externalFilesDir = this.Camera2StreamConfigurationMap.getExternalFilesDir(null);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(externalFilesDir);
            sb.append("/frames");
            java.io.File file = new java.io.File(sb.toString());
            long round = java.lang.Math.round(d * 100.0d);
            java.util.Date date = new java.util.Date();
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("MMddyyyy-HHmmss", java.util.Locale.US);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("/dfl-");
            sb2.append(round);
            sb2.append("-");
            sb2.append(simpleDateFormat.format(date));
            sb2.append(".zip");
            java.lang.String obj = sb2.toString();
            java.io.File[] listFiles = com.daon.sdk.face.FileTools.listFiles(file);
            java.lang.String string = bundle.getString(com.daon.sdk.face.LivenessResult.RESULT_IMAGE);
            java.lang.String string2 = bundle.getString(com.daon.sdk.face.LivenessResult.RESULT_TEMPLATE);
            if (string != null && string2 != null) {
                listFiles = (java.io.File[]) java.util.Arrays.copyOf(listFiles, listFiles.length + 2);
                listFiles[listFiles.length - 1] = new java.io.File(string);
                listFiles[listFiles.length - 2] = new java.io.File(string2);
            } else if (string != null) {
                listFiles = (java.io.File[]) java.util.Arrays.copyOf(listFiles, listFiles.length + 1);
                listFiles[listFiles.length - 1] = new java.io.File(string);
            } else if (string2 != null) {
                listFiles = (java.io.File[]) java.util.Arrays.copyOf(listFiles, listFiles.length + 1);
                listFiles[listFiles.length - 1] = new java.io.File(string2);
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(externalFilesDir);
            sb3.append(obj);
            a(listFiles, sb3.toString());
            com.daon.sdk.face.FileTools.deleteDirectory(file);
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(externalFilesDir);
            sb4.append(obj);
            return sb4.toString();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public void a(java.io.File[] fileArr, java.lang.String str) {
        java.util.zip.ZipOutputStream zipOutputStream = new java.util.zip.ZipOutputStream(new java.io.BufferedOutputStream(new java.io.FileOutputStream(str)));
        byte[] bArr = new byte[this.getHighResolutionOutputSizeshNQ4ISI];
        for (java.io.File file : fileArr) {
            java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file), this.getHighResolutionOutputSizeshNQ4ISI);
            zipOutputStream.putNextEntry(new java.util.zip.ZipEntry(file.getName()));
            while (true) {
                int read = bufferedInputStream.read(bArr, 0, this.getHighResolutionOutputSizeshNQ4ISI);
                if (read != -1) {
                    zipOutputStream.write(bArr, 0, read);
                }
            }
            bufferedInputStream.close();
        }
        zipOutputStream.close();
    }

    private void getHighSpeedVideoFpsRanges(com.daon.sdk.face.module.analyzer.b.EnumC0056b enumC0056b, int i, android.os.Bundle bundle) {
        this.getHighSpeedVideoSizesFor = enumC0056b;
        int i2 = com.daon.sdk.face.module.analyzer.b.a.Camera2StreamConfigurationMap[enumC0056b.ordinal()];
        if (i2 == 1) {
            bundle.putInt(com.daon.sdk.face.LivenessResult.RESULT_STATE, 1);
        } else if (i2 == 2) {
            bundle.putInt(com.daon.sdk.face.LivenessResult.RESULT_STATE, 2);
        } else if (i2 == 3) {
            bundle.putInt(com.daon.sdk.face.LivenessResult.RESULT_STATE, 3);
        } else if (i2 == 4) {
            bundle.putInt(com.daon.sdk.face.LivenessResult.RESULT_STATE, 4);
        } else if (i2 == 5) {
            bundle.putInt(com.daon.sdk.face.LivenessResult.RESULT_STATE, 5);
        }
        if (i >= 0) {
            bundle.putInt(com.daon.sdk.face.LivenessResult.RESULT_ALERT, i);
        }
    }

    private static java.lang.String Camera2StreamConfigurationMap(int i) {
        if (i == -4) {
            return "ALERT_FACE_NOT_CENTERED";
        }
        if (i == -3) {
            return "ALERT_FACE_TOO_FAR";
        }
        if (i == -1) {
            return "ALERT_FACE_TOO_NEAR";
        }
        if (i == 0) {
            return "ALERT_FACE_NOT_DETECTED";
        }
        if (i == 1) {
            return "ALERT_FACE_TOO_FAR";
        }
        if (i == 3) {
            return "ALERT_FACE_TOO_NEAR";
        }
        if (i != 4) {
            return "ALERT_NONE";
        }
        return "ALERT_FACE_NOT_CENTERED";
    }

    public static /* synthetic */ java.lang.Boolean $r8$lambda$JUfQlGh82Rvu3ERUDbTQqgur238(com.daon.sdk.face.module.analyzer.b bVar, int i, int i2) {
        com.daon.face.passivelivenessv1.DaonFacePassiveLivenessV1 daonFacePassiveLivenessV1 = new com.daon.face.passivelivenessv1.DaonFacePassiveLivenessV1(bVar.Camera2StreamConfigurationMap.getAssets());
        bVar.getHighSpeedVideoFpsRanges = daonFacePassiveLivenessV1;
        daonFacePassiveLivenessV1.setNativeRotation(bVar.getOutputFormats);
        bVar.getHighSpeedVideoFpsRanges.setUprightFrameWidth(i);
        bVar.getHighSpeedVideoFpsRanges.setUprightFrameHeight(i2);
        bVar.getHighSpeedVideoFpsRanges.setNativeColorSpace(2);
        bVar.getHighSpeedVideoFpsRanges.setDevicePlatform(2);
        bVar.getHighSpeedVideoFpsRanges.setContinuity(0);
        return java.lang.Boolean.TRUE;
    }
}
