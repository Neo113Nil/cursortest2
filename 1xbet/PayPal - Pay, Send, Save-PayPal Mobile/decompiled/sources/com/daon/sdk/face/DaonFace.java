package com.daon.sdk.face;

/* loaded from: classes7.dex */
public class DaonFace {
    public static final int ANALYSIS_OPTION_ACCURACY_HIGH = 8;
    public static final int ANALYSIS_OPTION_ALL_ORIENTATIONS = 2;
    public static final int ANALYSIS_OPTION_FIRST = 1;
    public static final int ANALYSIS_OPTION_ICAO = 5;
    public static final int ANALYSIS_OPTION_NONE = 0;
    public static final int OPTION_DEFAULT = 77;
    public static final int OPTION_DEVICE_POSITION = 8;
    public static final int OPTION_LIVENESS = 64;
    public static final int OPTION_LIVENESS_BLINK = 1;
    public static final int OPTION_LIVENESS_CLR = 128;
    public static final int OPTION_LIVENESS_HMD = 2;
    public static final int OPTION_LIVENESS_PASSIVE = 64;
    public static final int OPTION_LIVENESS_V2 = 512;
    public static final int OPTION_MASK = 256;
    public static int OPTION_NONE = 0;
    public static final int OPTION_QUALITY = 4;
    public static final int OPTION_RECOGNITION = 16;
    public static final int OPTION_RECOGNITION_CONTINUOUS = 32;
    private final java.util.concurrent.Executor getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizesFor;
    private final int getInputFormats;
    private com.daon.sdk.face.module.Analyzer getInputSizeshNQ4ISI;
    private android.os.Bundle getOutputFormats;
    private com.daon.sdk.face.module.a getOutputMinFrameDuration;
    private final android.os.Bundle getOutputMinFrameDurationlomOqCM;
    private boolean getOutputSizes;
    private final com.daon.sdk.face.license.License getOutputSizeshNQ4ISI;
    private final android.content.Context getOutputStallDuration;
    private final java.util.ArrayList getOutputStallDurationlomOqCM;
    private boolean getValidOutputFormatsForInputhNQ4ISI;
    private com.daon.sdk.face.Analysis toString;
    private static final java.lang.Object getHighSpeedVideoSizes = new java.lang.Object();
    private static final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();

    @java.lang.Deprecated
    public interface AnalysisCallback extends com.daon.sdk.face.Analysis.AnalysisListener {
        @Override // com.daon.sdk.face.Analysis.AnalysisListener
        default void analysis(com.daon.sdk.face.Result result, com.daon.sdk.face.YUV yuv) {
            onAnalysisResult(yuv, result);
        }

        default void onAnalysisData(android.os.Bundle bundle) {
        }

        default void onAnalysisError(java.lang.String str) {
        }

        void onAnalysisResult(com.daon.sdk.face.YUV yuv, com.daon.sdk.face.Result result);
    }

    public static class Face {
        private final com.daon.sdk.face.QualityResult Camera2StreamConfigurationMap;
        private final android.graphics.Bitmap getHighSpeedVideoFpsRangesFor;
        private final int getHighSpeedVideoSizes;

        Face(android.graphics.Bitmap bitmap, com.daon.sdk.face.QualityResult qualityResult, int i) {
            this.getHighSpeedVideoFpsRangesFor = bitmap;
            this.Camera2StreamConfigurationMap = qualityResult;
            this.getHighSpeedVideoSizes = i;
        }

        public android.graphics.Bitmap getBitmap() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public com.daon.sdk.face.QualityResult getQuality() {
            return this.Camera2StreamConfigurationMap;
        }

        public int getRotation() {
            return this.getHighSpeedVideoSizes;
        }

        public float getScore() {
            return this.Camera2StreamConfigurationMap.getScore() + this.Camera2StreamConfigurationMap.getFaceFoundScore();
        }
    }

    static class b implements java.util.Comparator {
        private b() {
        }

        @Override // java.util.Comparator
        public /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
            return java.lang.Float.compare(((com.daon.sdk.face.DaonFace.Face) obj2).getScore(), ((com.daon.sdk.face.DaonFace.Face) obj).getScore());
        }

        /* synthetic */ b(byte b) {
            this();
        }
    }

    public DaonFace(android.content.Context context) throws java.lang.Exception {
        this(context, 77);
    }

    public boolean addAnalyzer(com.daon.sdk.face.module.Analyzer analyzer) {
        if (analyzer == null) {
            return false;
        }
        synchronized (getHighSpeedVideoSizes) {
            java.util.Iterator it = this.getOutputStallDurationlomOqCM.iterator();
            while (it.hasNext()) {
                if (analyzer.getName().equals(((com.daon.sdk.face.module.Module) it.next()).getName())) {
                    return true;
                }
            }
            if (!analyzer.isSupported(this.getOutputSizeshNQ4ISI)) {
                return false;
            }
            return this.getOutputStallDurationlomOqCM.add(analyzer);
        }
    }

    public com.daon.sdk.face.Analysis analyze(com.daon.sdk.face.YUV yuv) {
        return analyze(yuv, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public java.util.List<com.daon.sdk.face.DaonFace.Face> analyzeFaces(android.graphics.Bitmap bitmap) {
        return analyzeFaces(bitmap, 3);
    }

    public void clear() {
        com.daon.sdk.face.module.a aVar = this.getOutputMinFrameDuration;
        if (aVar != null) {
            aVar.reset();
        }
    }

    public com.daon.sdk.face.EnrollResult enroll(byte[] bArr) {
        com.daon.sdk.face.module.a aVar = this.getOutputMinFrameDuration;
        return aVar != null ? new com.daon.sdk.face.EnrollResult(aVar.a(new com.daon.sdk.face.YUV(bArr, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges))) : new com.daon.sdk.face.EnrollResult(new android.os.Bundle());
    }

    public android.os.Bundle getConfiguration() {
        return this.getOutputFormats;
    }

    public android.util.Size getImageSize() {
        return new android.util.Size(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
    }

    public com.daon.sdk.face.license.License getLicense() {
        return this.getOutputSizeshNQ4ISI;
    }

    public int getOptions() {
        return this.getHighSpeedVideoSizesFor;
    }

    public com.daon.sdk.face.QualityResult getQuality(android.graphics.Bitmap bitmap, boolean z) {
        if (bitmap == null || this.getInputSizeshNQ4ISI == null) {
            return null;
        }
        if (z && (bitmap = com.daon.sdk.face.BitmapTools.rotate(bitmap, (360 - this.getInputFormats) % 360)) == null) {
            return null;
        }
        setImageSize(bitmap.getWidth(), bitmap.getHeight());
        android.os.Bundle analyze = this.getInputSizeshNQ4ISI.analyze(bitmap);
        if (analyze != null) {
            return new com.daon.sdk.face.QualityResult(analyze);
        }
        return null;
    }

    public boolean isEnrolled() {
        com.daon.sdk.face.module.a aVar = this.getOutputMinFrameDuration;
        return aVar != null && aVar.b();
    }

    public boolean isOptionEnabled(int i) {
        return (this.getHighSpeedVideoSizesFor & i) == i;
    }

    public boolean isReady() {
        com.daon.sdk.face.module.a aVar = this.getOutputMinFrameDuration;
        return aVar == null || aVar.a();
    }

    public com.daon.sdk.face.RecognitionResult match(byte[] bArr, android.graphics.Bitmap bitmap) throws java.lang.Exception {
        com.daon.sdk.face.module.a aVar = this.getOutputMinFrameDuration;
        float a2 = aVar != null ? aVar.a(bArr, bitmap) : 0.0f;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putFloat(com.daon.sdk.face.RecognitionResult.RESULT_FACE_RECOGNITION_SCORE, a2);
        return new com.daon.sdk.face.RecognitionResult(bundle);
    }

    public com.daon.sdk.face.RecognitionResult recognize(com.daon.sdk.face.YUV yuv) {
        com.daon.sdk.face.module.a aVar = this.getOutputMinFrameDuration;
        return aVar != null ? new com.daon.sdk.face.RecognitionResult(aVar.c(yuv)) : new com.daon.sdk.face.RecognitionResult(new android.os.Bundle());
    }

    public void removeAnalyzer(com.daon.sdk.face.module.Analyzer analyzer) {
        synchronized (getHighSpeedVideoSizes) {
            analyzer.stop();
            this.getOutputStallDurationlomOqCM.remove(analyzer);
        }
    }

    public void reset() {
        getHighSpeedVideoFpsRanges((android.os.Bundle) null);
        this.toString = new com.daon.sdk.face.Analysis();
        synchronized (getHighSpeedVideoSizes) {
            this.getValidOutputFormatsForInputhNQ4ISI = false;
        }
    }

    public void setConfiguration(android.os.Bundle bundle) {
        this.getOutputFormats = bundle;
        synchronized (getHighSpeedVideoSizes) {
            java.util.Iterator it = this.getOutputStallDurationlomOqCM.iterator();
            while (it.hasNext()) {
                ((com.daon.sdk.face.module.Module) it.next()).onConfigurationChanged(bundle);
            }
        }
    }

    public void setConsolidateResults(boolean z) {
        this.getOutputSizes = z;
    }

    public void setImageSize(int i, int i2) {
        if (this.getHighSpeedVideoFpsRangesFor == i && this.getHighSpeedVideoFpsRanges == i2) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoFpsRanges = i2;
        Camera2StreamConfigurationMap(i, i2);
    }

    public void setLightReflectionView(com.daon.sdk.face.LightReflectionView lightReflectionView) {
        java.util.Iterator it = this.getOutputStallDurationlomOqCM.iterator();
        while (it.hasNext()) {
            com.daon.sdk.face.module.Module module = (com.daon.sdk.face.module.Module) it.next();
            if (module.getName().equals(com.daon.sdk.face.license.License.FEATURE_CLR)) {
                ((com.daon.sdk.face.module.analyzer.g) module).a(lightReflectionView);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x001c, code lost:
    
        if ((r9 & 32) == 32) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setOptions(int i) {
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            this.getOutputMinFrameDuration = null;
            getHighSpeedVideoFpsRanges(com.daon.sdk.face.license.License.FEATURE_VERIFICATION);
            if ((i & 16) != 16) {
            }
            com.daon.sdk.face.module.analyzer.d dVar = new com.daon.sdk.face.module.analyzer.d(this.getOutputStallDuration, this.getInputFormats, i);
            this.getOutputMinFrameDuration = dVar;
            if ((i & 32) == 32) {
                addAnalyzer(dVar);
            }
            if ((i & 4) == 4) {
                com.daon.sdk.face.module.analyzer.c cVar = new com.daon.sdk.face.module.analyzer.c(this.getOutputStallDuration, this.getInputFormats);
                this.getInputSizeshNQ4ISI = cVar;
                addAnalyzer(cVar);
                bundle.putFloat(com.daon.sdk.face.QualityResult.RESULT_FACE_CONTINUITY_SCORE, this.getOutputMinFrameDurationlomOqCM.getFloat(com.daon.sdk.face.QualityResult.RESULT_FACE_CONTINUITY_SCORE));
                bundle.putBoolean(com.daon.sdk.face.QualityResult.RESULT_FACE_CONTINUITY, this.getOutputMinFrameDurationlomOqCM.getBoolean(com.daon.sdk.face.QualityResult.RESULT_FACE_CONTINUITY));
            } else {
                getHighSpeedVideoFpsRanges(com.daon.sdk.face.license.License.FEATURE_QUALITY);
            }
            if ((i & 2) == 2) {
                addAnalyzer(new com.daon.sdk.face.module.analyzer.f(this.getOutputStallDuration, this.getInputFormats));
            } else {
                getHighSpeedVideoFpsRanges(com.daon.sdk.face.license.License.FEATURE_HMD);
            }
            if ((i & 512) == 512) {
                addAnalyzer(new com.daon.sdk.face.module.analyzer.b(this.getOutputStallDuration, this.getInputFormats));
            } else if ((i & 64) != 64) {
                getHighSpeedVideoFpsRanges(com.daon.sdk.face.license.License.FEATURE_LIVENESS);
            } else if (!addAnalyzer(new com.daon.sdk.face.module.analyzer.h(this.getOutputStallDuration, this.getInputFormats, null))) {
                addAnalyzer(new com.daon.sdk.face.module.analyzer.b(this.getOutputStallDuration, this.getInputFormats));
            }
            if ((i & 128) == 128) {
                addAnalyzer(new com.daon.sdk.face.module.analyzer.g(this.getOutputStallDuration, this.getInputFormats));
            } else {
                getHighSpeedVideoFpsRanges(com.daon.sdk.face.license.License.FEATURE_CLR);
            }
            if ((i & 8) == 8) {
                addAnalyzer(new com.daon.sdk.face.module.analyzer.e(this.getOutputStallDuration, this.getInputFormats));
            } else {
                getHighSpeedVideoFpsRanges(com.daon.sdk.face.license.License.FEATURE_POSITION);
            }
            if ((i & 256) == 256) {
                addAnalyzer(new com.daon.sdk.face.module.analyzer.a(this.getOutputStallDuration, this.getInputFormats));
            } else {
                getHighSpeedVideoFpsRanges(com.daon.sdk.face.license.License.FEATURE_MASK);
            }
            getHighSpeedVideoFpsRanges(com.daon.sdk.face.license.License.FEATURE_BLINK);
            if ((i & 1) == 1) {
                addAnalyzer(new com.daon.sdk.face.module.analyzer.i(this.getOutputStallDuration, this.getInputFormats, true));
            } else {
                addAnalyzer(new com.daon.sdk.face.module.analyzer.i(this.getOutputStallDuration, this.getInputFormats, false));
            }
            for (java.lang.String str : this.getOutputMinFrameDurationlomOqCM.keySet()) {
                if (str.startsWith(com.daon.sdk.face.LivenessResult.RESULT_TRACKER)) {
                    bundle.putInt(str, this.getOutputMinFrameDurationlomOqCM.getInt(str));
                }
            }
            this.getHighSpeedVideoSizesFor = i;
            Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
            setConfiguration(this.getOutputFormats);
            getHighSpeedVideoFpsRanges(bundle);
        } catch (java.lang.Exception e) {
            e.getLocalizedMessage();
        }
    }

    public void stop() {
        synchronized (getHighSpeedVideoSizes) {
            java.util.Iterator it = this.getOutputStallDurationlomOqCM.iterator();
            while (it.hasNext()) {
                ((com.daon.sdk.face.module.Analyzer) it.next()).stop();
            }
            com.daon.sdk.face.module.a aVar = this.getOutputMinFrameDuration;
            if (aVar != null) {
                aVar.stop();
            }
            synchronized (Camera2StreamConfigurationMap) {
                this.getOutputMinFrameDurationlomOqCM.clear();
            }
            this.toString = new com.daon.sdk.face.Analysis();
            this.getValidOutputFormatsForInputhNQ4ISI = true;
        }
    }

    public byte[] template(android.graphics.Bitmap bitmap) throws java.lang.Exception {
        com.daon.sdk.face.module.a aVar = this.getOutputMinFrameDuration;
        if (aVar != null) {
            return aVar.c(bitmap);
        }
        return null;
    }

    private void Camera2StreamConfigurationMap(int i, int i2) {
        com.daon.sdk.face.module.a aVar = this.getOutputMinFrameDuration;
        if (aVar != null) {
            aVar.onImageSizeChanged(i, i2);
        }
        synchronized (getHighSpeedVideoSizes) {
            java.util.Iterator it = this.getOutputStallDurationlomOqCM.iterator();
            while (it.hasNext()) {
                ((com.daon.sdk.face.module.Module) it.next()).onImageSizeChanged(i, i2);
            }
        }
    }

    public com.daon.sdk.face.Analysis analyze(com.daon.sdk.face.YUV yuv, final java.util.concurrent.Executor executor) {
        if (yuv == null) {
            return this.toString;
        }
        if (executor == null) {
            return this.toString;
        }
        setImageSize(yuv.getWidth(), yuv.getHeight());
        synchronized (getHighSpeedVideoSizes) {
            com.daon.sdk.face.YUV copy = yuv.copy();
            if (copy.isEmpty()) {
                return this.toString;
            }
            java.util.Iterator it = this.getOutputStallDurationlomOqCM.iterator();
            while (it.hasNext()) {
                ((com.daon.sdk.face.module.Analyzer) it.next()).analyze(copy, this.getOutputMinFrameDurationlomOqCM, new com.daon.sdk.face.module.Analyzer.AnalyzerCallback() { // from class: com.daon.sdk.face.DaonFace$$ExternalSyntheticLambda1
                    @Override // com.daon.sdk.face.module.Analyzer.AnalyzerCallback
                    public final void onAnalysisComplete(java.lang.String str, android.os.Bundle bundle, com.daon.sdk.face.YUV yuv2) {
                        com.daon.sdk.face.DaonFace.$r8$lambda$jI4DveDsBztYWpN2ykJtK0ZtoBA(com.daon.sdk.face.DaonFace.this, executor, str, bundle, yuv2);
                    }
                });
            }
            return this.toString;
        }
    }

    public java.util.List<com.daon.sdk.face.DaonFace.Face> analyzeFaces(android.graphics.Bitmap bitmap, int i) {
        byte b2 = 0;
        java.util.List<com.daon.sdk.face.DaonFace.Face> Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bitmap, 0, i);
        boolean z = (i & 2) == 2;
        boolean z2 = (i & 1) == 1;
        if (z) {
            if (!z2 || Camera2StreamConfigurationMap2.size() == 0) {
                java.util.List Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(bitmap, 90, i);
                if (Camera2StreamConfigurationMap3.size() > 0) {
                    Camera2StreamConfigurationMap2.addAll(Camera2StreamConfigurationMap3);
                }
            }
            if (!z2 || Camera2StreamConfigurationMap2.size() == 0) {
                java.util.List Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap(bitmap, 270, i);
                if (Camera2StreamConfigurationMap4.size() > 0) {
                    Camera2StreamConfigurationMap2.addAll(Camera2StreamConfigurationMap4);
                }
            }
            if (!z2 || Camera2StreamConfigurationMap2.size() == 0) {
                java.util.List Camera2StreamConfigurationMap5 = Camera2StreamConfigurationMap(bitmap, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, i);
                if (Camera2StreamConfigurationMap5.size() > 0) {
                    Camera2StreamConfigurationMap2.addAll(Camera2StreamConfigurationMap5);
                }
            }
        }
        Camera2StreamConfigurationMap2.sort(new com.daon.sdk.face.DaonFace.b(b2));
        return Camera2StreamConfigurationMap2;
    }

    public DaonFace(android.content.Context context, int i, java.io.InputStream inputStream) throws java.lang.Exception {
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.getHighSpeedVideoFpsRanges = 0;
        this.getOutputMinFrameDuration = null;
        this.getInputSizeshNQ4ISI = null;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.getOutputStallDurationlomOqCM = arrayList;
        this.getOutputMinFrameDurationlomOqCM = new android.os.Bundle();
        this.getOutputSizes = true;
        this.getValidOutputFormatsForInputhNQ4ISI = false;
        com.daon.sdk.face.license.License license = new com.daon.sdk.face.license.License(inputStream);
        if (license.isVerified()) {
            java.lang.String packageName = context.getPackageName();
            java.lang.String packageName2 = license.getPackageName();
            if (packageName.startsWith(packageName2)) {
                if (!license.hasExpired()) {
                    this.getOutputSizeshNQ4ISI = license;
                    this.getOutputStallDuration = context;
                    this.getHighSpeedVideoSizesFor = i;
                    int imageOrientation = com.daon.sdk.face.CameraTools.getImageOrientation(context);
                    this.getInputFormats = imageOrientation;
                    this.toString = new com.daon.sdk.face.Analysis();
                    this.getHighResolutionOutputSizeshNQ4ISI = androidx.core.content.ContextCompat.getMainExecutor(context);
                    if ((i & 16) == 16 || (i & 32) == 32) {
                        com.daon.sdk.face.module.analyzer.d dVar = new com.daon.sdk.face.module.analyzer.d(context, imageOrientation, i);
                        this.getOutputMinFrameDuration = dVar;
                        if ((i & 32) == 32) {
                            addAnalyzer(dVar);
                        }
                    }
                    if ((i & 4) == 4) {
                        com.daon.sdk.face.module.analyzer.c cVar = new com.daon.sdk.face.module.analyzer.c(context, imageOrientation);
                        this.getInputSizeshNQ4ISI = cVar;
                        addAnalyzer(cVar);
                    }
                    if ((i & 2) == 2) {
                        addAnalyzer(new com.daon.sdk.face.module.analyzer.f(context, imageOrientation));
                    }
                    if ((i & 512) == 512) {
                        addAnalyzer(new com.daon.sdk.face.module.analyzer.b(context, imageOrientation));
                    } else if ((i & 64) == 64 && !addAnalyzer(new com.daon.sdk.face.module.analyzer.h(context, imageOrientation, null))) {
                        addAnalyzer(new com.daon.sdk.face.module.analyzer.b(context, imageOrientation));
                    }
                    if ((i & 128) == 128) {
                        this.getHighSpeedVideoSizesFor = i | 8;
                        addAnalyzer(new com.daon.sdk.face.module.analyzer.g(context, imageOrientation));
                    }
                    if ((i & 1) == 1) {
                        addAnalyzer(new com.daon.sdk.face.module.analyzer.i(context, imageOrientation, true));
                    } else {
                        addAnalyzer(new com.daon.sdk.face.module.analyzer.i(context, imageOrientation, false));
                    }
                    if ((i & 8) == 8) {
                        addAnalyzer(new com.daon.sdk.face.module.analyzer.e(context, imageOrientation));
                    }
                    if ((i & 256) == 256) {
                        addAnalyzer(new com.daon.sdk.face.module.analyzer.a(context, imageOrientation));
                    }
                    arrayList.size();
                    new java.lang.Thread(new java.lang.Runnable() { // from class: com.daon.sdk.face.DaonFace$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.daon.sdk.renderscript.Toolkit.f2846a;
                        }
                    }).start();
                    return;
                }
                throw new java.lang.Exception("License has expired");
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Package name mismatch.\n\n");
            sb.append(packageName);
            sb.append("\n\nLicense:\n");
            sb.append(packageName2);
            throw new java.lang.Exception(sb.toString());
        }
        throw new java.lang.Exception("Unable to verify license");
    }

    private void getHighSpeedVideoFpsRanges(java.lang.String str) {
        com.daon.sdk.face.module.Analyzer analyzer;
        synchronized (getHighSpeedVideoSizes) {
            java.util.Iterator it = this.getOutputStallDurationlomOqCM.iterator();
            while (true) {
                if (!it.hasNext()) {
                    analyzer = null;
                    break;
                }
                com.daon.sdk.face.module.Module module = (com.daon.sdk.face.module.Module) it.next();
                if (str.equals(module.getName())) {
                    analyzer = (com.daon.sdk.face.module.Analyzer) module;
                    break;
                }
            }
            if (analyzer != null) {
                analyzer.stop();
                this.getOutputStallDurationlomOqCM.remove(analyzer);
            }
        }
    }

    public byte[] template(com.daon.sdk.face.YUV yuv) throws java.lang.Exception {
        com.daon.sdk.face.module.a aVar = this.getOutputMinFrameDuration;
        if (aVar != null) {
            return aVar.b(yuv);
        }
        return null;
    }

    public com.daon.sdk.face.EnrollResult enroll(android.graphics.Bitmap bitmap) {
        com.daon.sdk.face.module.a aVar = this.getOutputMinFrameDuration;
        if (aVar != null) {
            return new com.daon.sdk.face.EnrollResult(aVar.b(bitmap));
        }
        return new com.daon.sdk.face.EnrollResult(new android.os.Bundle());
    }

    public com.daon.sdk.face.RecognitionResult recognize(android.graphics.Bitmap bitmap) {
        com.daon.sdk.face.module.a aVar = this.getOutputMinFrameDuration;
        if (aVar != null) {
            return new com.daon.sdk.face.RecognitionResult(aVar.a(bitmap));
        }
        return new com.daon.sdk.face.RecognitionResult(new android.os.Bundle());
    }

    public com.daon.sdk.face.RecognitionResult match(byte[] bArr, byte[] bArr2) throws java.lang.Exception {
        com.daon.sdk.face.module.a aVar = this.getOutputMinFrameDuration;
        float a2 = aVar != null ? aVar.a(bArr, bArr2) : 0.0f;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putFloat(com.daon.sdk.face.RecognitionResult.RESULT_FACE_RECOGNITION_SCORE, a2);
        return new com.daon.sdk.face.RecognitionResult(bundle);
    }

    public void setConfiguration(com.daon.sdk.face.Config.Builder builder) {
        setConfiguration(builder.getBundle());
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(com.daon.sdk.face.Result result) {
        return !result.getRecognitionResult().getFaceRectangle().isEmpty() && result.getQualityResult().hasFace() && result.getQualityResult().hasAcceptableFrontalPose();
    }

    public com.daon.sdk.face.RecognitionResult recognize(byte[] bArr) {
        com.daon.sdk.face.module.a aVar = this.getOutputMinFrameDuration;
        if (aVar != null) {
            return new com.daon.sdk.face.RecognitionResult(aVar.a(bArr));
        }
        return new com.daon.sdk.face.RecognitionResult(new android.os.Bundle());
    }

    private void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        synchronized (getHighSpeedVideoSizes) {
            java.util.Iterator it = this.getOutputStallDurationlomOqCM.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.daon.sdk.face.module.Module module = (com.daon.sdk.face.module.Module) it.next();
                if (str.equals(module.getName())) {
                    module.stop();
                    break;
                }
            }
            this.toString = new com.daon.sdk.face.Analysis();
        }
    }

    public com.daon.sdk.face.RecognitionResult match(byte[] bArr, com.daon.sdk.face.YUV yuv, int i) throws java.lang.Exception {
        com.daon.sdk.face.module.a aVar = this.getOutputMinFrameDuration;
        float a2 = aVar != null ? aVar.a(bArr, yuv, i) : 0.0f;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putFloat(com.daon.sdk.face.RecognitionResult.RESULT_FACE_RECOGNITION_SCORE, a2);
        return new com.daon.sdk.face.RecognitionResult(bundle);
    }

    @java.lang.Deprecated
    public void stop(int i) {
        if ((i & 4) == 4) {
            getHighResolutionOutputSizeshNQ4ISI(com.daon.sdk.face.license.License.FEATURE_QUALITY);
        }
        if ((i & 2) == 2) {
            getHighResolutionOutputSizeshNQ4ISI(com.daon.sdk.face.license.License.FEATURE_HMD);
        }
        if ((i & 64) == 64) {
            getHighResolutionOutputSizeshNQ4ISI(com.daon.sdk.face.license.License.FEATURE_LIVENESS);
        }
        if ((i & 512) == 512) {
            getHighResolutionOutputSizeshNQ4ISI(com.daon.sdk.face.license.License.FEATURE_LIVENESS);
        }
        if ((i & 8) == 8) {
            getHighResolutionOutputSizeshNQ4ISI(com.daon.sdk.face.license.License.FEATURE_POSITION);
        }
        if ((i & 1) == 1) {
            getHighResolutionOutputSizeshNQ4ISI(com.daon.sdk.face.license.License.FEATURE_BLINK);
        }
    }

    private java.util.List Camera2StreamConfigurationMap(android.graphics.Bitmap bitmap, int i, int i2) {
        android.graphics.Bitmap rotate;
        com.daon.sdk.face.DaonFace.Face highSpeedVideoSizes;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z = (i2 & 5) == 5;
        if ((!z || (i != 90 && i != 270)) && (rotate = com.daon.sdk.face.BitmapTools.rotate(bitmap, i)) != null) {
            boolean z2 = rotate.getHeight() > rotate.getWidth();
            java.util.List<android.graphics.Bitmap> splitImage = com.daon.sdk.face.BitmapTools.splitImage(rotate, 2, 0.1f);
            if (z) {
                if (!z2 && splitImage.size() > 1) {
                    com.daon.sdk.face.DaonFace.Face highSpeedVideoSizes2 = getHighSpeedVideoSizes(splitImage.get(i != 0 ? 1 : 0), i);
                    if (highSpeedVideoSizes2 != null) {
                        arrayList.add(highSpeedVideoSizes2);
                        return arrayList;
                    }
                }
            } else {
                java.util.Iterator<android.graphics.Bitmap> it = splitImage.iterator();
                while (it.hasNext()) {
                    com.daon.sdk.face.DaonFace.Face highSpeedVideoSizes3 = getHighSpeedVideoSizes(it.next(), i);
                    if (highSpeedVideoSizes3 != null) {
                        arrayList.add(highSpeedVideoSizes3);
                    }
                }
                if ((i2 & 8) == 8 && (highSpeedVideoSizes = getHighSpeedVideoSizes(rotate, i)) != null) {
                    arrayList.add(highSpeedVideoSizes);
                }
            }
        }
        return arrayList;
    }

    public com.daon.sdk.face.Result analyze(android.graphics.Bitmap bitmap) {
        com.daon.sdk.face.Result result;
        if (bitmap == null) {
            return null;
        }
        synchronized (getHighSpeedVideoSizes) {
            setImageSize(bitmap.getWidth(), bitmap.getHeight());
            android.os.Bundle bundle = new android.os.Bundle();
            java.util.Iterator it = this.getOutputStallDurationlomOqCM.iterator();
            while (it.hasNext()) {
                android.os.Bundle analyze = ((com.daon.sdk.face.module.Analyzer) it.next()).analyze(bitmap);
                if (analyze != null) {
                    bundle.putAll(analyze);
                }
            }
            result = new com.daon.sdk.face.Result(bundle, this.getOutputFormats, this.getHighSpeedVideoSizesFor);
        }
        return result;
    }

    private com.daon.sdk.face.DaonFace.Face getHighSpeedVideoSizes(android.graphics.Bitmap bitmap, int i) {
        com.daon.sdk.face.Result highSpeedVideoSizes = getHighSpeedVideoSizes(bitmap);
        if (!getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes)) {
            return null;
        }
        android.graphics.Rect faceRectangle = highSpeedVideoSizes.getRecognitionResult().getFaceRectangle();
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        double width2 = faceRectangle.width();
        int height2 = faceRectangle.top - ((int) (faceRectangle.height() * 0.5d));
        faceRectangle.top = height2;
        int i2 = (int) (width2 * 0.2d);
        faceRectangle.bottom += i2;
        int i3 = faceRectangle.left - i2;
        faceRectangle.left = i3;
        faceRectangle.right += i2;
        if (i3 < 0 || height2 < 0 || i3 + faceRectangle.width() > width || faceRectangle.top + faceRectangle.height() > height) {
            return null;
        }
        android.graphics.Bitmap crop = com.daon.sdk.face.BitmapTools.crop(bitmap, faceRectangle);
        com.daon.sdk.face.Result highSpeedVideoSizes2 = getHighSpeedVideoSizes(crop);
        if (getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes2)) {
            return new com.daon.sdk.face.DaonFace.Face(crop, new com.daon.sdk.face.QualityResult(new android.os.Bundle(highSpeedVideoSizes2.getQualityResult().getBundle())), i);
        }
        return null;
    }

    private com.daon.sdk.face.Result getHighSpeedVideoSizes(android.graphics.Bitmap bitmap) {
        com.daon.sdk.face.Result result;
        android.os.Bundle analyze;
        synchronized (getHighSpeedVideoSizes) {
            setImageSize(bitmap.getWidth(), bitmap.getHeight());
            android.os.Bundle bundle = new android.os.Bundle();
            java.util.Iterator it = this.getOutputStallDurationlomOqCM.iterator();
            while (it.hasNext()) {
                com.daon.sdk.face.module.Analyzer analyzer = (com.daon.sdk.face.module.Analyzer) it.next();
                if (analyzer.getName().equals(com.daon.sdk.face.license.License.FEATURE_QUALITY) && (analyze = analyzer.analyze(bitmap)) != null) {
                    bundle.putAll(analyze);
                }
            }
            result = new com.daon.sdk.face.Result(bundle, this.getOutputFormats, this.getHighSpeedVideoSizesFor);
        }
        return result;
    }

    private void getHighSpeedVideoFpsRanges(android.os.Bundle bundle) {
        synchronized (Camera2StreamConfigurationMap) {
            this.getOutputMinFrameDurationlomOqCM.clear();
            if (bundle != null) {
                this.getOutputMinFrameDurationlomOqCM.putAll(bundle);
            }
        }
        java.util.Iterator it = this.getOutputStallDurationlomOqCM.iterator();
        while (it.hasNext()) {
            ((com.daon.sdk.face.module.Analyzer) it.next()).reset();
        }
    }

    private static java.io.InputStream getHighSpeedVideoFpsRanges(android.content.Context context, java.lang.String str) {
        try {
            return context.getAssets().open(str);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ void $r8$lambda$jI4DveDsBztYWpN2ykJtK0ZtoBA(com.daon.sdk.face.DaonFace daonFace, java.util.concurrent.Executor executor, java.lang.String str, android.os.Bundle bundle, com.daon.sdk.face.YUV yuv) {
        synchronized (Camera2StreamConfigurationMap) {
            daonFace.getOutputMinFrameDurationlomOqCM.putAll(bundle);
            if (daonFace.getOutputSizes) {
                com.daon.sdk.face.Result deepCopy = new com.daon.sdk.face.Result(daonFace.getOutputMinFrameDurationlomOqCM, daonFace.getOutputFormats, daonFace.getHighSpeedVideoSizesFor).deepCopy();
                if (deepCopy.getHighSpeedVideoFpsRangesFor.getString(com.daon.sdk.face.Result.RESULT_ERROR) != null) {
                    daonFace.toString.getHighSpeedVideoFpsRanges(deepCopy, null, executor);
                    daonFace.stop();
                } else if (str.equals(com.daon.sdk.face.license.License.FEATURE_BLINK)) {
                    daonFace.toString.getHighSpeedVideoFpsRanges(deepCopy, yuv, executor);
                }
            } else {
                daonFace.toString.getHighSpeedVideoFpsRanges(new com.daon.sdk.face.Result(bundle, daonFace.getOutputFormats, daonFace.getHighSpeedVideoSizesFor), yuv, executor);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DaonFace(android.content.Context context, int i) throws java.lang.Exception {
        this(context, i, r0 == null ? getHighSpeedVideoFpsRanges(context, "daon-face.lic") : r0);
        java.io.InputStream highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(context, "license.txt");
    }
}
