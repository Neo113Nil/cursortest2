package com.daon.sdk.face.module.analyzer;

/* loaded from: classes7.dex */
public class i extends com.daon.sdk.face.module.Analyzer {
    private static final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();
    private static boolean getHighSpeedVideoFpsRangesFor = false;
    private final boolean Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final android.content.Context getHighSpeedVideoSizes;
    private java.util.concurrent.Future getOutputSizes;
    private int getInputSizeshNQ4ISI = 640;
    private int getOutputFormats = androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND;
    private boolean getInputFormats = false;
    private float getOutputMinFrameDuration = 0.4f;
    private visidon.Lib.VerificationAPI.DetectionMode getHighSpeedVideoSizesFor = visidon.Lib.VerificationAPI.DetectionMode.VIDEO;

    public i(android.content.Context context, int i, boolean z) {
        this.getHighSpeedVideoSizes = context;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.Camera2StreamConfigurationMap = z;
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getOutputSizes == null) {
            this.getOutputSizes = com.daon.sdk.face.util.a.a(new java.util.concurrent.Callable() { // from class: com.daon.sdk.face.module.analyzer.i$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    java.lang.Boolean valueOf;
                    valueOf = java.lang.Boolean.valueOf(com.daon.sdk.face.module.analyzer.i.this.getHighSpeedVideoFpsRangesFor(visidon.Lib.VerificationAPI.DetectionMode.VIDEO));
                    return valueOf;
                }
            });
        }
        try {
            java.util.concurrent.Future future = this.getOutputSizes;
            if (future == null || !future.isDone()) {
                return false;
            }
            return ((java.lang.Boolean) this.getOutputSizes.get()).booleanValue();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // com.daon.sdk.face.module.Analyzer
    public android.os.Bundle analyze(android.graphics.Bitmap bitmap) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (bitmap != null) {
            getHighSpeedVideoFpsRangesFor(visidon.Lib.VerificationAPI.DetectionMode.STILL);
            bundle.putParcelable(com.daon.sdk.face.RecognitionResult.RESULT_FACE_POSITION_PORTRAIT, visidon.Lib.VerificationAPI.verifyFaceExtended(new com.daon.sdk.face.YUV(bitmap).getData()).faceRect);
        }
        return bundle;
    }

    @Override // com.daon.sdk.face.module.Module
    public java.lang.String getName() {
        return com.daon.sdk.face.license.License.FEATURE_BLINK;
    }

    @Override // com.daon.sdk.face.module.Module
    public boolean isSupported(com.daon.sdk.face.license.License license) {
        return true;
    }

    @Override // com.daon.sdk.face.module.Analyzer, com.daon.sdk.face.module.Module
    public void onConfigurationChanged(android.os.Bundle bundle) {
        if (bundle != null) {
            float f = bundle.getFloat(com.daon.sdk.face.Config.BLINK_THRESHOLD);
            if (f != 0.0f) {
                if (f > 0.0f) {
                    this.getOutputMinFrameDuration = f;
                } else {
                    this.getOutputMinFrameDuration = 0.4f;
                }
            }
        }
    }

    @Override // com.daon.sdk.face.module.Analyzer, com.daon.sdk.face.module.Module
    public void onImageSizeChanged(int i, int i2) {
        synchronized (getHighSpeedVideoFpsRanges) {
            this.getInputSizeshNQ4ISI = i;
            this.getOutputFormats = i2;
            stop();
        }
    }

    @Override // com.daon.sdk.face.module.Analyzer, com.daon.sdk.face.module.Module
    public void stop() {
        synchronized (this) {
            super.stop();
            synchronized (getHighSpeedVideoFpsRanges) {
                if (getHighSpeedVideoFpsRangesFor) {
                    getHighSpeedVideoFpsRangesFor = false;
                    visidon.Lib.VerificationAPI.release();
                }
                java.util.concurrent.Future future = this.getOutputSizes;
                if (future != null) {
                    future.cancel(true);
                }
                this.getOutputSizes = null;
            }
        }
    }

    private boolean getHighSpeedVideoFpsRangesFor(visidon.Lib.VerificationAPI.DetectionMode detectionMode) {
        boolean z = true;
        if (getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoSizesFor == detectionMode) {
            return true;
        }
        synchronized (getHighSpeedVideoFpsRanges) {
            getHighSpeedVideoFpsRangesFor = false;
            this.getHighSpeedVideoSizesFor = detectionMode;
            byte[] bArr = new byte[1572];
            for (int i = 0; i < 3144; i += 2) {
                bArr[i / 2] = (byte) ((java.lang.Character.digit("26f596b34af29c73f6a07dca9e2a854dc814888ffcc8eb693c6fcba00c3d66c682055aaf682a2190b55d6686a19d4b83042ec539900324c8f53569219d459767767308419c6bce86cf90b7ede9febbc2a9b219620c730184078b78bb7123506af057b879367b767733005d186a0812df6da6ac7995af2ad22feed2fdba122e7feb1f4dcb6799b5e1e2ab66db0f4dba35df2b63f08dd470ad47e9de706449bf0e432a40b4dd145cec01946a7ab237cd9d95f78007ec1bf3dc470b01589655339019edbbde6402f6d22c9566159f9c7240e0c9de01aeb341349f249c3d209dfb17dbf0d34a4ff35cefd0aecff48a1bd2d89cd22bac4a875c575e2e5f5ccbe245c9638216da65b339d3fa8d1b12bb12a4213d99836d9829dce7c1042e5f0d0481f5aa2d397fa78357e3a5f5a1da4bc67d563232d2d279c4cc208be3460e4ed70b09958b82574e2cf535bddb9d912d30628f0d5d4656f025e4f3f32d4c3d0dd650245b96e23ecde2e56ee7f45d75f3a1981d7d079b011d06f966e36c16db1de58a78ccf6abb0f7ddf6c6f1f974064a480530fedb6ec4e74c346e044461c9f3a10b8e0d34761d7bc778321749c7708ece91baf445f44e8d870973e37ea7597354f3da5ec669bf6dae5802d9c5274021d011fe9bc7da8c8e980adeb7db53b91e29702532546a51201d9d66765be7ebadd9bf601298b6ad78f022c54133955a707a0447fdb0e4e00c54c6c72a02527055ad9e208cdc45dcdbffd270f85b5451bcecfa3ded21aaa5b7fd543cfa67439995646185ffc0ed257eca6819c71de91a3b093196db4680817cdaa836e6fa3aa18f155394762dfd1575b4af0cd14d5766f9d6dfb0b163948feb787be038fa14b0b08749c82113f184339c9bbb83f228b4afc372992d3bc52f72cec103f110d37d28bf562afae7bc73f7a7d8515d0d37365a152e80a7b74fc5b6680dda0d841ed37e525d8ea08b2ff5321b996b4799416279fbb096de4d36b00b255b3e2c50ff95da5f89edebd85d89b143d2702d3ddfcdec0e52f28a2ab0bcb48124426f027ac7f2542f3eb5a6d7d776d154d75413ba0a17361dd9e739003a4919d205fcb5dbfc62a65fe0e64d8bbf699158350b5111d3578f5d326d6c8afe82fac80b154536d13aab7ebc7cd7d0897aacfc2081b412aaf0bc60ebffddd0d58c24d15145c75933b645cf3234e03132060d7a28d72413b365d014d8e42a3538411b626a4c00a1f1de9ea51b497bc65d43d6c7c72e2e19d000c624aca1fc8a60e7b9533232323a8b7af7faaea78d8186c650ba606adcaace054b8116b7656af705101426a8af35062a72b4d9b96edfbc9fb3332abce0ca84d8d847b8f7f26ce379cfa14d0ee16edf57d41af918ea16ad182be7c5a42f9fbc9da788d11440ad8f0986838a41ce0db633fbe514296bc935b255180f20d00fd0ad8f3d55d0c2ebe7fe4730a2ee2f63c892b59143b94b7f4e5b7d5ea735c721e58ff27a85b5673114fa1757c8edb8fc5e17ce6433c34a9cea516d15e28ded54ab3edf5dd7d7fd31181c456c78a9816ea2993334ac8d686e567c961d7c60e2a100712f6e8d77f641785360bcbb5e710c7e9958041b4fa0dab94569b6fefc64d49c08c80832c437104538fe7eea187703462f7986afec2816d8a361abf753534ae3285ab37f75a89fc46c5e3dfd28feeac6b0b21349604f013d18a5d6034e26bfde200ff9aa0d4c63ade777e2c8c563140cec71407c915c3efb209797ea7cd62f4047ab008783a07197b396b47f34b94982e60575fb250b4deba53b55be0d7713064a7a5476ad887c38c7370ee6f712ff4d57a47da7138237fd31f26d0a1a5350707e6729d7c376ff07f74f4324dadd709af3196e1902a41895b407010f3e7f4c88af49c06fcb60b2ca2b964c56913c71d0a31d5ee2c78cb4f0e2cccc48c4ff0910136959178481e5919ab4ddf5337db49fac9eff6915bf7da44f56914457020e0cec0051d154aded738c8bc53360d23f78059cff02a3f77f3d39e9a3c21efdf469ad095525e55d5c122c70a0e894d4913ea651520933626324d5915b403b2be16144363f8d562f4402758b2ae83c674933b32167276668b4cc8d1f58312a7de20795595332f15c81f74e52b92013525e16fdc43d4699750f3ea51b82e9e681e9bd750d4256368a0dd148303700bde149162c0072c34c15761b2604e47c556490ca7166ebbf440cf52e".charAt(i), 16) << 4) + java.lang.Character.digit("26f596b34af29c73f6a07dca9e2a854dc814888ffcc8eb693c6fcba00c3d66c682055aaf682a2190b55d6686a19d4b83042ec539900324c8f53569219d459767767308419c6bce86cf90b7ede9febbc2a9b219620c730184078b78bb7123506af057b879367b767733005d186a0812df6da6ac7995af2ad22feed2fdba122e7feb1f4dcb6799b5e1e2ab66db0f4dba35df2b63f08dd470ad47e9de706449bf0e432a40b4dd145cec01946a7ab237cd9d95f78007ec1bf3dc470b01589655339019edbbde6402f6d22c9566159f9c7240e0c9de01aeb341349f249c3d209dfb17dbf0d34a4ff35cefd0aecff48a1bd2d89cd22bac4a875c575e2e5f5ccbe245c9638216da65b339d3fa8d1b12bb12a4213d99836d9829dce7c1042e5f0d0481f5aa2d397fa78357e3a5f5a1da4bc67d563232d2d279c4cc208be3460e4ed70b09958b82574e2cf535bddb9d912d30628f0d5d4656f025e4f3f32d4c3d0dd650245b96e23ecde2e56ee7f45d75f3a1981d7d079b011d06f966e36c16db1de58a78ccf6abb0f7ddf6c6f1f974064a480530fedb6ec4e74c346e044461c9f3a10b8e0d34761d7bc778321749c7708ece91baf445f44e8d870973e37ea7597354f3da5ec669bf6dae5802d9c5274021d011fe9bc7da8c8e980adeb7db53b91e29702532546a51201d9d66765be7ebadd9bf601298b6ad78f022c54133955a707a0447fdb0e4e00c54c6c72a02527055ad9e208cdc45dcdbffd270f85b5451bcecfa3ded21aaa5b7fd543cfa67439995646185ffc0ed257eca6819c71de91a3b093196db4680817cdaa836e6fa3aa18f155394762dfd1575b4af0cd14d5766f9d6dfb0b163948feb787be038fa14b0b08749c82113f184339c9bbb83f228b4afc372992d3bc52f72cec103f110d37d28bf562afae7bc73f7a7d8515d0d37365a152e80a7b74fc5b6680dda0d841ed37e525d8ea08b2ff5321b996b4799416279fbb096de4d36b00b255b3e2c50ff95da5f89edebd85d89b143d2702d3ddfcdec0e52f28a2ab0bcb48124426f027ac7f2542f3eb5a6d7d776d154d75413ba0a17361dd9e739003a4919d205fcb5dbfc62a65fe0e64d8bbf699158350b5111d3578f5d326d6c8afe82fac80b154536d13aab7ebc7cd7d0897aacfc2081b412aaf0bc60ebffddd0d58c24d15145c75933b645cf3234e03132060d7a28d72413b365d014d8e42a3538411b626a4c00a1f1de9ea51b497bc65d43d6c7c72e2e19d000c624aca1fc8a60e7b9533232323a8b7af7faaea78d8186c650ba606adcaace054b8116b7656af705101426a8af35062a72b4d9b96edfbc9fb3332abce0ca84d8d847b8f7f26ce379cfa14d0ee16edf57d41af918ea16ad182be7c5a42f9fbc9da788d11440ad8f0986838a41ce0db633fbe514296bc935b255180f20d00fd0ad8f3d55d0c2ebe7fe4730a2ee2f63c892b59143b94b7f4e5b7d5ea735c721e58ff27a85b5673114fa1757c8edb8fc5e17ce6433c34a9cea516d15e28ded54ab3edf5dd7d7fd31181c456c78a9816ea2993334ac8d686e567c961d7c60e2a100712f6e8d77f641785360bcbb5e710c7e9958041b4fa0dab94569b6fefc64d49c08c80832c437104538fe7eea187703462f7986afec2816d8a361abf753534ae3285ab37f75a89fc46c5e3dfd28feeac6b0b21349604f013d18a5d6034e26bfde200ff9aa0d4c63ade777e2c8c563140cec71407c915c3efb209797ea7cd62f4047ab008783a07197b396b47f34b94982e60575fb250b4deba53b55be0d7713064a7a5476ad887c38c7370ee6f712ff4d57a47da7138237fd31f26d0a1a5350707e6729d7c376ff07f74f4324dadd709af3196e1902a41895b407010f3e7f4c88af49c06fcb60b2ca2b964c56913c71d0a31d5ee2c78cb4f0e2cccc48c4ff0910136959178481e5919ab4ddf5337db49fac9eff6915bf7da44f56914457020e0cec0051d154aded738c8bc53360d23f78059cff02a3f77f3d39e9a3c21efdf469ad095525e55d5c122c70a0e894d4913ea651520933626324d5915b403b2be16144363f8d562f4402758b2ae83c674933b32167276668b4cc8d1f58312a7de20795595332f15c81f74e52b92013525e16fdc43d4699750f3ea51b82e9e681e9bd750d4256368a0dd148303700bde149162c0072c34c15761b2604e47c556490ca7166ebbf440cf52e".charAt(i + 1), 16));
            }
            visidon.Lib.VerificationAPI.InitState loadLicense = visidon.Lib.VerificationAPI.loadLicense(bArr);
            visidon.Lib.VerificationAPI.InitState initState = visidon.Lib.VerificationAPI.InitState.OK;
            if (loadLicense == initState) {
                visidon.Lib.Parameters parameters = new visidon.Lib.Parameters(this.getHighSpeedVideoSizes);
                parameters.imageHeight = this.getOutputFormats;
                parameters.imageWidth = this.getInputSizeshNQ4ISI;
                parameters.detectionMode = this.getHighSpeedVideoSizesFor;
                parameters.securityLevel = visidon.Lib.VerificationAPI.SecurityLevel.MEDIUM;
                boolean z2 = this.Camera2StreamConfigurationMap;
                parameters.livenessDetection = z2 ? visidon.Lib.VerificationAPI.LivenessDetection.HIGH : visidon.Lib.VerificationAPI.LivenessDetection.OFF;
                if (z2) {
                    int i2 = parameters.imageWidth;
                    int i3 = parameters.imageHeight;
                }
                if (visidon.Lib.VerificationAPI.initialize(parameters) != initState) {
                    z = false;
                }
                getHighSpeedVideoFpsRangesFor = z;
                visidon.Lib.VerificationAPI.getVersion();
            }
        }
        return getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.daon.sdk.face.module.Analyzer
    public void analyze(com.daon.sdk.face.YUV yuv, android.os.Bundle bundle, com.daon.sdk.face.module.Analyzer.AnalyzerCallback analyzerCallback) {
        getHighResolutionOutputSizeshNQ4ISI();
        startAnalyzer(yuv, bundle, 1, 0, analyzerCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0086 A[Catch: all -> 0x00a4, TryCatch #0 {, blocks: (B:4:0x0008, B:6:0x000c, B:8:0x0012, B:10:0x0036, B:12:0x0072, B:14:0x0086, B:17:0x008f, B:20:0x0095, B:21:0x00a0, B:23:0x009b, B:27:0x0056), top: B:3:0x0008 }] */
    @Override // com.daon.sdk.face.module.Analyzer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public android.os.Bundle analyze(com.daon.sdk.face.YUV yuv, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        synchronized (getHighSpeedVideoFpsRanges) {
            if (getHighSpeedVideoFpsRangesFor && !yuv.isEmpty()) {
                visidon.Lib.FaceInfo verifyFaceExtended = visidon.Lib.VerificationAPI.verifyFaceExtended(yuv.getData());
                float f = verifyFaceExtended.livenessConfidence / 100.0f;
                bundle2.putParcelable(com.daon.sdk.face.RecognitionResult.RESULT_FACE_POSITION, verifyFaceExtended.faceRect);
                android.graphics.Rect rect = verifyFaceExtended.faceRect;
                android.graphics.Rect rect2 = new android.graphics.Rect();
                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 90) {
                    if (i == 270) {
                        int i2 = rect.top;
                        rect2.left = i2;
                        rect2.top = this.getInputSizeshNQ4ISI - rect.right;
                        rect2.right = i2 + rect.height();
                        rect2.bottom = rect2.top + rect.width();
                    }
                    bundle2.putParcelable(com.daon.sdk.face.RecognitionResult.RESULT_FACE_POSITION_PORTRAIT, rect);
                    boolean z = true;
                    bundle2.putInt("result.liveness.tracker.blink", !verifyFaceExtended.faceRect.isEmpty() ? 1 : 0);
                    if (this.Camera2StreamConfigurationMap) {
                        if (f <= this.getOutputMinFrameDuration) {
                            z = false;
                        }
                        if (this.getInputFormats && z) {
                            bundle2.putBoolean(com.daon.sdk.face.LivenessResult.RESULT_ACTION_BLINK, false);
                        } else {
                            bundle2.putBoolean(com.daon.sdk.face.LivenessResult.RESULT_ACTION_BLINK, z);
                        }
                        this.getInputFormats = z;
                    }
                } else {
                    int i3 = this.getOutputFormats - rect.bottom;
                    rect2.left = i3;
                    rect2.top = rect.left;
                    rect2.right = i3 + rect.height();
                    rect2.bottom = rect2.top + rect.width();
                }
                rect = rect2;
                bundle2.putParcelable(com.daon.sdk.face.RecognitionResult.RESULT_FACE_POSITION_PORTRAIT, rect);
                boolean z2 = true;
                bundle2.putInt("result.liveness.tracker.blink", !verifyFaceExtended.faceRect.isEmpty() ? 1 : 0);
                if (this.Camera2StreamConfigurationMap) {
                }
            }
        }
        return bundle2;
    }
}
