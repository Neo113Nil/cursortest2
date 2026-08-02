package androidx.camera.extensions.internal;

/* loaded from: classes6.dex */
public final class ExtensionsUseCaseConfigFactory implements androidx.camera.core.impl.UseCaseConfigFactory {
    private final androidx.camera.extensions.internal.ImageAnalysisConfigProvider Camera2StreamConfigurationMap;
    private final androidx.camera.extensions.internal.ImageCaptureConfigProvider getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.camera.extensions.internal.PreviewConfigProvider getHighSpeedVideoSizes;

    public ExtensionsUseCaseConfigFactory(androidx.camera.extensions.internal.VendorExtender vendorExtender) {
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.camera.extensions.internal.ImageCaptureConfigProvider(vendorExtender);
        this.getHighSpeedVideoSizes = new androidx.camera.extensions.internal.PreviewConfigProvider(vendorExtender);
        this.Camera2StreamConfigurationMap = new androidx.camera.extensions.internal.ImageAnalysisConfigProvider(vendorExtender);
    }

    /* renamed from: androidx.camera.extensions.internal.ExtensionsUseCaseConfigFactory$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;

        static {
            int[] iArr = new int[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.PREVIEW.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    @Override // androidx.camera.core.impl.UseCaseConfigFactory
    public final androidx.camera.core.impl.Config getConfig(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType, int i) {
        androidx.camera.core.impl.MutableOptionsBundle from;
        int i2 = androidx.camera.extensions.internal.ExtensionsUseCaseConfigFactory.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[captureType.ordinal()];
        if (i2 == 1) {
            from = androidx.camera.core.impl.MutableOptionsBundle.from((androidx.camera.core.impl.Config) this.getHighResolutionOutputSizeshNQ4ISI.getConfig());
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return null;
                    }
                    throw new java.lang.IllegalArgumentException("Should not go here. VideoCapture is supported by recording the preview stream when Extension is enabled.");
                }
                androidx.camera.core.impl.ImageAnalysisConfig config = this.Camera2StreamConfigurationMap.getConfig();
                java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> supportedResolutions = config.getSupportedResolutions(null);
                if (supportedResolutions != null) {
                    for (android.util.Pair<java.lang.Integer, android.util.Size[]> pair : supportedResolutions) {
                        int intValue = ((java.lang.Integer) pair.first).intValue();
                        android.util.Size[] sizeArr = (android.util.Size[]) pair.second;
                        if (intValue == 35 && sizeArr != null && sizeArr.length > 0) {
                            from = androidx.camera.core.impl.MutableOptionsBundle.from((androidx.camera.core.impl.Config) config);
                        }
                    }
                }
                throw new java.lang.IllegalArgumentException("ImageAnalysis is not supported when Extension is enabled on this device. Check ExtensionsManager.isImageAnalysisSupported before binding the ImageAnalysis use case.");
            }
            from = androidx.camera.core.impl.MutableOptionsBundle.from((androidx.camera.core.impl.Config) this.getHighSpeedVideoSizes.getConfig());
        }
        from.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_ZSL_DISABLED, java.lang.Boolean.TRUE);
        return androidx.camera.core.impl.OptionsBundle.from(from);
    }
}
