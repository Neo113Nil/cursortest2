package androidx.camera.extensions;

/* loaded from: classes6.dex */
final class ExtensionsInfo {
    static final androidx.camera.extensions.internal.VendorExtender getHighSpeedVideoFpsRangesFor = new androidx.camera.extensions.internal.VendorExtender() { // from class: androidx.camera.extensions.ExtensionsInfo.1
    };
    final androidx.camera.core.CameraProvider Camera2StreamConfigurationMap;
    androidx.camera.extensions.VendorExtenderFactory getHighResolutionOutputSizeshNQ4ISI;
    final androidx.camera.extensions.internal.Camera2ExtensionsInfo getHighSpeedVideoFpsRanges;

    ExtensionsInfo(androidx.camera.core.CameraProvider cameraProvider, android.content.Context context) {
        this.Camera2StreamConfigurationMap = cameraProvider;
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            this.getHighSpeedVideoFpsRanges = new androidx.camera.extensions.internal.Camera2ExtensionsInfo((android.hardware.camera2.CameraManager) context.getSystemService(android.hardware.camera2.CameraManager.class));
        } else {
            this.getHighSpeedVideoFpsRanges = null;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.camera.extensions.VendorExtenderFactory() { // from class: androidx.camera.extensions.ExtensionsInfo$$ExternalSyntheticLambda0
            @Override // androidx.camera.extensions.VendorExtenderFactory
            public final androidx.camera.extensions.internal.VendorExtender createVendorExtender(int i) {
                return android.os.Build.VERSION.SDK_INT >= 33 ? new androidx.camera.extensions.internal.Camera2ExtensionsVendorExtender(i, (androidx.camera.extensions.internal.Camera2ExtensionsInfoProvider) java.util.Objects.requireNonNull(androidx.camera.extensions.ExtensionsInfo.this.getHighSpeedVideoFpsRanges)) : androidx.camera.extensions.ExtensionsInfo.getHighSpeedVideoFpsRangesFor;
            }
        };
    }

    final boolean getHighSpeedVideoFpsRangesFor(androidx.camera.core.CameraSelector cameraSelector, int i) {
        androidx.camera.core.CameraSelector.Builder.fromSelector(cameraSelector).addCameraFilter(new androidx.camera.extensions.ExtensionCameraFilter(getHighSpeedVideoFpsRanges(i), this.getHighResolutionOutputSizeshNQ4ISI.createVendorExtender(i)));
        return !r3.build().filter(this.Camera2StreamConfigurationMap.getAvailableCameraInfos()).isEmpty();
    }

    final android.util.Range<java.lang.Long> Camera2StreamConfigurationMap(androidx.camera.core.CameraSelector cameraSelector, int i) {
        java.util.List<androidx.camera.core.CameraInfo> filter = androidx.camera.core.CameraSelector.Builder.fromSelector(cameraSelector).addCameraFilter(new androidx.camera.extensions.ExtensionCameraFilter(getHighSpeedVideoFpsRanges(i), this.getHighResolutionOutputSizeshNQ4ISI.createVendorExtender(i))).build().filter(this.Camera2StreamConfigurationMap.getAvailableCameraInfos());
        if (filter.isEmpty()) {
            return null;
        }
        androidx.camera.core.CameraInfo cameraInfo = filter.get(0);
        try {
            androidx.camera.extensions.internal.VendorExtender createVendorExtender = this.getHighResolutionOutputSizeshNQ4ISI.createVendorExtender(i);
            createVendorExtender.init(cameraInfo);
            return createVendorExtender.getEstimatedCaptureLatencyRange(null);
        } catch (java.lang.NoSuchMethodError unused) {
            return null;
        }
    }

    final void getHighSpeedVideoFpsRangesFor(final int i) {
        final androidx.camera.core.impl.Identifier create = androidx.camera.core.impl.Identifier.create(getHighSpeedVideoFpsRanges(i));
        if (androidx.camera.core.impl.ExtendedCameraConfigProviderStore.getConfigProvider(create) == androidx.camera.core.impl.CameraConfigProvider.EMPTY) {
            androidx.camera.core.impl.ExtendedCameraConfigProviderStore.addConfig(create, new androidx.camera.core.impl.CameraConfigProvider() { // from class: androidx.camera.extensions.ExtensionsInfo$$ExternalSyntheticLambda1
                @Override // androidx.camera.core.impl.CameraConfigProvider
                public final androidx.camera.core.impl.CameraConfig getConfig(androidx.camera.core.CameraInfo cameraInfo, android.content.Context context) {
                    androidx.camera.extensions.ExtensionsInfo extensionsInfo = androidx.camera.extensions.ExtensionsInfo.this;
                    int i2 = i;
                    androidx.camera.core.impl.Identifier identifier = create;
                    androidx.camera.extensions.internal.VendorExtender createVendorExtender = extensionsInfo.getHighResolutionOutputSizeshNQ4ISI.createVendorExtender(i2);
                    createVendorExtender.init(cameraInfo);
                    androidx.camera.extensions.internal.ExtensionsUseCaseConfigFactory extensionsUseCaseConfigFactory = new androidx.camera.extensions.internal.ExtensionsUseCaseConfigFactory(createVendorExtender);
                    androidx.camera.extensions.ExtensionsConfig.Builder builder = new androidx.camera.extensions.ExtensionsConfig.Builder();
                    builder.getHighSpeedVideoFpsRangesFor.insertOption(androidx.camera.extensions.ExtensionsConfig.getHighSpeedVideoFpsRanges, java.lang.Integer.valueOf(i2));
                    builder.getHighSpeedVideoFpsRangesFor.insertOption(androidx.camera.core.impl.CameraConfig.OPTION_USECASE_CONFIG_FACTORY, extensionsUseCaseConfigFactory);
                    builder.getHighSpeedVideoFpsRangesFor.insertOption(androidx.camera.core.impl.CameraConfig.OPTION_COMPATIBILITY_ID, identifier);
                    builder.getHighSpeedVideoFpsRangesFor.insertOption(androidx.camera.core.impl.CameraConfig.OPTION_ZSL_DISABLED, java.lang.Boolean.TRUE);
                    builder.getHighSpeedVideoFpsRangesFor.insertOption(androidx.camera.core.impl.CameraConfig.OPTION_POSTVIEW_SUPPORTED, java.lang.Boolean.valueOf(createVendorExtender.isPostviewAvailable()));
                    builder.getHighSpeedVideoFpsRangesFor.insertOption(androidx.camera.core.impl.CameraConfig.OPTION_CAPTURE_PROCESS_PROGRESS_SUPPORTED, java.lang.Boolean.valueOf(createVendorExtender.isCaptureProcessProgressAvailable()));
                    builder.getHighSpeedVideoFpsRangesFor.insertOption(androidx.camera.core.impl.CameraConfig.OPTION_USE_CASE_COMBINATION_REQUIRED_RULE, 1);
                    builder.getHighSpeedVideoFpsRangesFor.insertOption(androidx.camera.core.impl.CameraConfig.OPTION_POSTVIEW_FORMAT_SELECTOR, new androidx.camera.extensions.internal.compat.workaround.PostviewFormatValidator().getPostviewFormatSelector());
                    androidx.camera.core.impl.SessionProcessor createSessionProcessor = createVendorExtender.createSessionProcessor(context);
                    if (createSessionProcessor != null) {
                        builder.getHighSpeedVideoFpsRangesFor.insertOption(androidx.camera.core.impl.CameraConfig.OPTION_SESSION_PROCESSOR, createSessionProcessor);
                    }
                    return new androidx.camera.extensions.ExtensionsConfig(builder.getHighSpeedVideoFpsRangesFor);
                }
            });
        }
    }

    static java.lang.String getHighSpeedVideoFpsRanges(int i) {
        if (i == 0) {
            return ":camera:camera-extensions-EXTENSION_MODE_NONE";
        }
        if (i == 1) {
            return ":camera:camera-extensions-EXTENSION_MODE_BOKEH";
        }
        if (i == 2) {
            return ":camera:camera-extensions-EXTENSION_MODE_HDR";
        }
        if (i == 3) {
            return ":camera:camera-extensions-EXTENSION_MODE_NIGHT";
        }
        if (i == 4) {
            return ":camera:camera-extensions-EXTENSION_MODE_FACE_RETOUCH";
        }
        if (i == 5) {
            return ":camera:camera-extensions-EXTENSION_MODE_AUTO";
        }
        throw new java.lang.IllegalArgumentException("Invalid extension mode!");
    }
}
