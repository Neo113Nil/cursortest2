package com.daon.sdk.face.module.analyzer;

/* loaded from: classes7.dex */
public class d extends com.daon.sdk.face.module.Analyzer implements com.daon.sdk.face.module.a {
    private final android.content.Context Camera2StreamConfigurationMap;
    private com.daon.face.authentication.DaonFaceV3 getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private com.daon.sdk.crypto.SecureStorage getHighSpeedVideoSizes;
    private final int getHighSpeedVideoSizesFor;
    private boolean getOutputMinFrameDuration = false;
    private final java.lang.Object getInputFormats = new java.lang.Object();
    private final java.util.concurrent.Semaphore getOutputFormats = new java.util.concurrent.Semaphore(0);
    private float getInputSizeshNQ4ISI = 0.0f;

    public d(final android.content.Context context, int i, int i2) {
        int i3 = 0;
        this.Camera2StreamConfigurationMap = context;
        this.getHighSpeedVideoFpsRanges = i2;
        com.daon.sdk.face.util.a.b(new java.lang.Runnable() { // from class: com.daon.sdk.face.module.analyzer.d$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.daon.sdk.face.module.analyzer.d.m9990$r8$lambda$kXto2VabTIiwA6UzeQSqT7zOY(com.daon.sdk.face.module.analyzer.d.this, context);
            }
        });
        if (i == 90) {
            i3 = 2;
        } else if (i == 180) {
            i3 = 3;
        } else if (i == 270) {
            i3 = 1;
        }
        this.getHighSpeedVideoSizesFor = i3;
    }

    private java.lang.Boolean getHighSpeedVideoSizes() {
        if (this.getOutputMinFrameDuration) {
            return java.lang.Boolean.TRUE;
        }
        boolean booleanValue = ((java.lang.Boolean) com.daon.sdk.face.util.a.b(new java.util.concurrent.Callable() { // from class: com.daon.sdk.face.module.analyzer.d$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.daon.sdk.face.module.analyzer.d.m9989$r8$lambda$EK9jyQB01v3bJz2EHHJhvOwlxU(com.daon.sdk.face.module.analyzer.d.this);
            }
        })).booleanValue();
        this.getOutputMinFrameDuration = booleanValue;
        return java.lang.Boolean.valueOf(booleanValue);
    }

    @Override // com.daon.sdk.face.module.Analyzer
    public void analyze(com.daon.sdk.face.YUV yuv, android.os.Bundle bundle, com.daon.sdk.face.module.Analyzer.AnalyzerCallback analyzerCallback) {
        startAnalyzer(yuv, bundle, analyzerCallback);
    }

    @Override // com.daon.sdk.face.module.Module
    public java.lang.String getName() {
        return com.daon.sdk.face.license.License.FEATURE_VERIFICATION;
    }

    @Override // com.daon.sdk.face.module.Module
    public boolean isSupported(com.daon.sdk.face.license.License license) {
        if (!license.supportsFeature(com.daon.sdk.face.license.License.FEATURE_VERIFICATION)) {
            return false;
        }
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            try {
                java.lang.Class.forName("com.daon.face.detector.DaonFaceDetector");
                java.lang.Class.forName("com.daon.face.authentication.DaonFaceV3");
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
            com.daon.face.authentication.DaonFaceV3 daonFaceV3 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (daonFaceV3 != null) {
                daonFaceV3.close();
            }
            this.getOutputMinFrameDuration = false;
        }
    }

    @Override // com.daon.sdk.face.module.Module
    public void reset() {
        stop();
        com.daon.sdk.face.util.a.b(new java.lang.Runnable() { // from class: com.daon.sdk.face.module.analyzer.d$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.daon.sdk.face.module.analyzer.d.$r8$lambda$goW2sulGSSrJ6iv0Ty7RqlXuTdQ(com.daon.sdk.face.module.analyzer.d.this);
            }
        });
    }

    @Override // com.daon.sdk.face.module.Analyzer
    public android.os.Bundle analyze(com.daon.sdk.face.YUV yuv, android.os.Bundle bundle) {
        if (yuv.isEmpty() || (this.getHighSpeedVideoFpsRanges & 32) != 32 || !b()) {
            return null;
        }
        android.os.Bundle Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(yuv, this.getHighSpeedVideoSizesFor);
        float f = Camera2StreamConfigurationMap.getFloat(com.daon.sdk.face.RecognitionResult.RESULT_FACE_RECOGNITION_SCORE);
        boolean z = f == 0.0f || java.lang.Math.abs(f - this.getInputSizeshNQ4ISI) > 0.01f;
        this.getInputSizeshNQ4ISI = f;
        if (z) {
            return Camera2StreamConfigurationMap;
        }
        return null;
    }

    private byte[] getHighSpeedVideoFpsRanges(com.daon.sdk.face.YUV yuv, int i) {
        java.lang.Throwable th;
        byte[] bArr;
        com.daon.face.authentication.DaonFaceV3Template daonFaceV3Template = null;
        r0 = null;
        byte[] serialize = null;
        com.daon.face.authentication.DaonFaceV3Template daonFaceV3Template2 = null;
        try {
            if (getHighSpeedVideoSizes().booleanValue()) {
                com.daon.face.authentication.DaonFaceV3Template daonFaceV3Template3 = (com.daon.face.authentication.DaonFaceV3Template) com.daon.sdk.face.util.a.b(new com.daon.sdk.face.module.analyzer.d$$ExternalSyntheticLambda4(this, i, yuv));
                if (daonFaceV3Template3 != null) {
                    try {
                        if (!daonFaceV3Template3.isEmpty()) {
                            serialize = daonFaceV3Template3.serialize();
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        daonFaceV3Template = daonFaceV3Template3;
                        if (daonFaceV3Template != null) {
                            daonFaceV3Template.close();
                            throw th;
                        }
                        throw th;
                    }
                }
                byte[] bArr2 = serialize;
                daonFaceV3Template2 = daonFaceV3Template3;
                bArr = bArr2;
            } else {
                bArr = null;
            }
            if (daonFaceV3Template2 != null) {
                daonFaceV3Template2.close();
            }
            return bArr;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    private android.os.Bundle getHighSpeedVideoSizes(com.daon.sdk.face.YUV yuv, int i) {
        android.os.Bundle bundle;
        synchronized (this) {
            bundle = new android.os.Bundle();
            if (!b()) {
                try {
                    byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(yuv, i);
                    this.getHighSpeedVideoFpsRangesFor = highSpeedVideoFpsRanges;
                    if (highSpeedVideoFpsRanges != null) {
                        com.daon.sdk.face.util.a.b(new java.util.concurrent.Callable() { // from class: com.daon.sdk.face.module.analyzer.d$$ExternalSyntheticLambda3
                            @Override // java.util.concurrent.Callable
                            public final java.lang.Object call() {
                                return com.daon.sdk.face.module.analyzer.d.$r8$lambda$Uta7edWu_2GcqFom2OgiyJiOt6g(com.daon.sdk.face.module.analyzer.d.this);
                            }
                        });
                    } else {
                        bundle.putInt(com.daon.sdk.face.Result.RESULT_ERROR_CODE, -1);
                        bundle.putString(com.daon.sdk.face.Result.RESULT_ERROR_MESSAGE, "Unable to create enrollment template");
                    }
                } catch (java.lang.Exception e) {
                    bundle.putInt(com.daon.sdk.face.Result.RESULT_ERROR_CODE, -2);
                    bundle.putString(com.daon.sdk.face.Result.RESULT_ERROR_MESSAGE, e.getMessage());
                } catch (com.daon.face.authentication.DaonFaceV3Exception e2) {
                    bundle.putInt(com.daon.sdk.face.Result.RESULT_ERROR_CODE, e2.getErrorCode());
                    bundle.putString(com.daon.sdk.face.Result.RESULT_ERROR_MESSAGE, e2.getMessage());
                }
            }
            bundle.putBoolean(com.daon.sdk.face.Result.RESULT_ENROLLED, b());
        }
        return bundle;
    }

    @Override // com.daon.sdk.face.module.a
    public boolean a() {
        return this.getOutputMinFrameDuration;
    }

    @Override // com.daon.sdk.face.module.a
    public android.os.Bundle a(com.daon.sdk.face.YUV yuv) {
        return getHighSpeedVideoSizes(yuv, this.getHighSpeedVideoSizesFor);
    }

    private android.os.Bundle Camera2StreamConfigurationMap(com.daon.sdk.face.YUV yuv, int i) {
        android.os.Bundle bundle;
        float f;
        synchronized (this) {
            bundle = new android.os.Bundle();
            try {
                try {
                    try {
                        this.getOutputFormats.acquire();
                        f = getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, yuv, i);
                    } catch (com.daon.face.authentication.DaonFaceV3Exception e) {
                        bundle.putInt(com.daon.sdk.face.Result.RESULT_ERROR_CODE, e.getErrorCode());
                        bundle.putString(com.daon.sdk.face.Result.RESULT_ERROR_MESSAGE, e.getMessage());
                        f = 0.0f;
                        this.getOutputFormats.release();
                        bundle.putFloat(com.daon.sdk.face.RecognitionResult.RESULT_FACE_RECOGNITION_SCORE, f);
                        return bundle;
                    }
                } catch (java.lang.Exception e2) {
                    bundle.putString(com.daon.sdk.face.Result.RESULT_ERROR_MESSAGE, e2.getMessage());
                    f = 0.0f;
                    this.getOutputFormats.release();
                    bundle.putFloat(com.daon.sdk.face.RecognitionResult.RESULT_FACE_RECOGNITION_SCORE, f);
                    return bundle;
                }
                this.getOutputFormats.release();
                bundle.putFloat(com.daon.sdk.face.RecognitionResult.RESULT_FACE_RECOGNITION_SCORE, f);
            } catch (java.lang.Throwable th) {
                this.getOutputFormats.release();
                throw th;
            }
        }
        return bundle;
    }

    @Override // com.daon.sdk.face.module.a
    public android.os.Bundle a(android.graphics.Bitmap bitmap) {
        return Camera2StreamConfigurationMap(new com.daon.sdk.face.YUV(bitmap), 0);
    }

    @Override // com.daon.sdk.face.module.a
    public android.os.Bundle a(byte[] bArr) {
        return getHighSpeedVideoSizes(bArr);
    }

    @Override // com.daon.sdk.face.module.a
    public float a(byte[] bArr, android.graphics.Bitmap bitmap) {
        return getHighSpeedVideoFpsRangesFor(bArr, new com.daon.sdk.face.YUV(bitmap), 0);
    }

    @Override // com.daon.sdk.face.module.a
    public float a(byte[] bArr, com.daon.sdk.face.YUV yuv, int i) {
        return getHighSpeedVideoFpsRangesFor(bArr, yuv, i == 90 ? 2 : i == 180 ? 3 : i == 270 ? 1 : 0);
    }

    @Override // com.daon.sdk.face.module.a
    public float a(byte[] bArr, byte[] bArr2) {
        java.lang.Throwable th;
        com.daon.face.authentication.DaonFaceV3Template daonFaceV3Template;
        com.daon.face.authentication.DaonFaceV3Template daonFaceV3Template2 = null;
        try {
            if (getHighSpeedVideoSizes().booleanValue()) {
                com.daon.face.authentication.DaonFaceV3Template daonFaceV3Template3 = new com.daon.face.authentication.DaonFaceV3Template();
                try {
                    daonFaceV3Template3.deserialize(bArr);
                    daonFaceV3Template = new com.daon.face.authentication.DaonFaceV3Template();
                    try {
                        daonFaceV3Template.deserialize(bArr2);
                        float match = 1.0f - com.daon.face.authentication.DaonFaceV3Template.match(daonFaceV3Template3, daonFaceV3Template);
                        r2 = match >= 0.0f ? match : 0.0f;
                        daonFaceV3Template2 = daonFaceV3Template3;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        daonFaceV3Template2 = daonFaceV3Template3;
                        if (daonFaceV3Template2 != null) {
                            daonFaceV3Template2.close();
                        }
                        if (daonFaceV3Template != null) {
                            daonFaceV3Template.close();
                            throw th;
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    daonFaceV3Template = null;
                }
            } else {
                daonFaceV3Template = null;
            }
            if (daonFaceV3Template2 != null) {
                daonFaceV3Template2.close();
            }
            if (daonFaceV3Template != null) {
                daonFaceV3Template.close();
            }
            return r2;
        } catch (java.lang.Throwable th4) {
            th = th4;
            daonFaceV3Template = null;
        }
    }

    @Override // com.daon.sdk.face.module.a
    public byte[] b(com.daon.sdk.face.YUV yuv) {
        return getHighSpeedVideoFpsRanges(yuv, 0);
    }

    @Override // com.daon.sdk.face.module.a
    public android.os.Bundle c(com.daon.sdk.face.YUV yuv) {
        return Camera2StreamConfigurationMap(yuv, this.getHighSpeedVideoSizesFor);
    }

    private android.os.Bundle getHighSpeedVideoSizes(byte[] bArr) {
        android.os.Bundle bundle;
        float f;
        synchronized (this) {
            bundle = new android.os.Bundle();
            try {
                try {
                    try {
                        this.getOutputFormats.acquire();
                        f = a(this.getHighSpeedVideoFpsRangesFor, bArr);
                    } catch (com.daon.face.authentication.DaonFaceV3Exception e) {
                        bundle.putInt(com.daon.sdk.face.Result.RESULT_ERROR_CODE, e.getErrorCode());
                        bundle.putString(com.daon.sdk.face.Result.RESULT_ERROR_MESSAGE, e.getMessage());
                        f = 0.0f;
                        this.getOutputFormats.release();
                        bundle.putFloat(com.daon.sdk.face.RecognitionResult.RESULT_FACE_RECOGNITION_SCORE, f);
                        return bundle;
                    }
                } catch (java.lang.Exception e2) {
                    bundle.putString(com.daon.sdk.face.Result.RESULT_ERROR_MESSAGE, e2.getMessage());
                    f = 0.0f;
                    this.getOutputFormats.release();
                    bundle.putFloat(com.daon.sdk.face.RecognitionResult.RESULT_FACE_RECOGNITION_SCORE, f);
                    return bundle;
                }
                this.getOutputFormats.release();
                bundle.putFloat(com.daon.sdk.face.RecognitionResult.RESULT_FACE_RECOGNITION_SCORE, f);
            } catch (java.lang.Throwable th) {
                this.getOutputFormats.release();
                throw th;
            }
        }
        return bundle;
    }

    @Override // com.daon.sdk.face.module.a
    public byte[] c(android.graphics.Bitmap bitmap) {
        return getHighSpeedVideoFpsRanges(new com.daon.sdk.face.YUV(bitmap), 0);
    }

    private float getHighSpeedVideoFpsRangesFor(byte[] bArr, com.daon.sdk.face.YUV yuv, int i) {
        com.daon.face.authentication.DaonFaceV3Template daonFaceV3Template;
        com.daon.face.authentication.DaonFaceV3Template daonFaceV3Template2 = null;
        try {
            float f = 0.0f;
            if (getHighSpeedVideoSizes().booleanValue()) {
                com.daon.face.authentication.DaonFaceV3Template daonFaceV3Template3 = (com.daon.face.authentication.DaonFaceV3Template) com.daon.sdk.face.util.a.b(new com.daon.sdk.face.module.analyzer.d$$ExternalSyntheticLambda4(this, i, yuv));
                if (daonFaceV3Template3 != null) {
                    try {
                        if (!daonFaceV3Template3.isEmpty()) {
                            daonFaceV3Template = new com.daon.face.authentication.DaonFaceV3Template();
                            try {
                                daonFaceV3Template.deserialize(bArr);
                                float match = 1.0f - com.daon.face.authentication.DaonFaceV3Template.match(daonFaceV3Template3, daonFaceV3Template);
                                if (match >= 0.0f) {
                                    f = match;
                                }
                                daonFaceV3Template2 = daonFaceV3Template3;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                daonFaceV3Template2 = daonFaceV3Template3;
                                if (daonFaceV3Template2 != null) {
                                    daonFaceV3Template2.close();
                                }
                                if (daonFaceV3Template != null) {
                                    daonFaceV3Template.close();
                                }
                                throw th;
                            }
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        daonFaceV3Template = null;
                    }
                }
                daonFaceV3Template = null;
                daonFaceV3Template2 = daonFaceV3Template3;
            } else {
                daonFaceV3Template = null;
            }
            if (daonFaceV3Template2 != null) {
                daonFaceV3Template2.close();
            }
            if (daonFaceV3Template != null) {
                daonFaceV3Template.close();
            }
            return f;
        } catch (java.lang.Throwable th3) {
            th = th3;
            daonFaceV3Template = null;
        }
    }

    @Override // com.daon.sdk.face.module.a
    public boolean b() {
        try {
            this.getOutputFormats.acquire();
        } catch (java.lang.InterruptedException unused) {
        }
        this.getOutputFormats.release();
        return this.getHighSpeedVideoFpsRangesFor != null;
    }

    @Override // com.daon.sdk.face.module.a
    public android.os.Bundle b(android.graphics.Bitmap bitmap) {
        return getHighSpeedVideoSizes(new com.daon.sdk.face.YUV(bitmap), 0);
    }

    public static /* synthetic */ com.daon.face.authentication.DaonFaceV3Template $r8$lambda$5xoswbctX6RFmbtalsfsckM2uxU(com.daon.sdk.face.module.analyzer.d dVar, int i, com.daon.sdk.face.YUV yuv) {
        if (i == 0) {
            return dVar.getHighResolutionOutputSizeshNQ4ISI.createTemplate(yuv.getData(), yuv.getWidth(), yuv.getHeight(), i, 0);
        }
        return dVar.getHighResolutionOutputSizeshNQ4ISI.createTemplate(yuv.getData(), yuv.getHeight(), yuv.getWidth(), i, 0);
    }

    /* renamed from: $r8$lambda$E-K9jyQB01v3bJz2EHHJhvOwlxU, reason: not valid java name */
    public static /* synthetic */ java.lang.Boolean m9989$r8$lambda$EK9jyQB01v3bJz2EHHJhvOwlxU(com.daon.sdk.face.module.analyzer.d dVar) {
        dVar.getHighResolutionOutputSizeshNQ4ISI = new com.daon.face.authentication.DaonFaceV3(dVar.Camera2StreamConfigurationMap.getAssets());
        return java.lang.Boolean.TRUE;
    }

    public static /* synthetic */ java.lang.Boolean $r8$lambda$Uta7edWu_2GcqFom2OgiyJiOt6g(com.daon.sdk.face.module.analyzer.d dVar) {
        dVar.getHighSpeedVideoSizes.write("face.template", dVar.getHighSpeedVideoFpsRangesFor);
        return java.lang.Boolean.TRUE;
    }

    public static /* synthetic */ void $r8$lambda$goW2sulGSSrJ6iv0Ty7RqlXuTdQ(com.daon.sdk.face.module.analyzer.d dVar) {
        try {
            dVar.getOutputFormats.acquire();
            dVar.getHighSpeedVideoSizes.remove("face.template");
            dVar.getHighSpeedVideoFpsRangesFor = null;
        } catch (java.lang.InterruptedException unused) {
        } finally {
            dVar.getOutputFormats.release();
        }
    }

    /* renamed from: $r8$lambda$kXto2VabTIi-wA6UzeQSqT7z-OY, reason: not valid java name */
    public static /* synthetic */ void m9990$r8$lambda$kXto2VabTIiwA6UzeQSqT7zOY(com.daon.sdk.face.module.analyzer.d dVar, android.content.Context context) {
        try {
            com.daon.sdk.crypto.SecureStorage storageInstance = com.daon.sdk.crypto.SecureStorageFactory.getStorageInstance(context);
            dVar.getHighSpeedVideoSizes = storageInstance;
            dVar.getHighSpeedVideoFpsRangesFor = storageInstance.read("face.template");
        } catch (java.lang.Exception unused) {
        }
        dVar.getOutputFormats.release();
    }
}
