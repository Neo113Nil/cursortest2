package androidx.camera.core.featuregroup.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0017\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Landroidx/camera/core/featuregroup/impl/UseCaseType;", "", "Ljava/lang/Class;", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/Class;)V", "", "toString", "()Ljava/lang/String;", "surfaceClass", "Ljava/lang/Class;", "getSurfaceClass", "()Ljava/lang/Class;", "Companion", "PREVIEW", "IMAGE_CAPTURE", "IMAGE_ANALYSIS", "VIDEO_CAPTURE", "STREAM_SHARING", "UNDEFINED"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UseCaseType {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.core.featuregroup.impl.UseCaseType.Companion INSTANCE;
    public static final androidx.camera.core.featuregroup.impl.UseCaseType IMAGE_ANALYSIS;
    public static final androidx.camera.core.featuregroup.impl.UseCaseType IMAGE_CAPTURE;
    public static final androidx.camera.core.featuregroup.impl.UseCaseType PREVIEW;
    public static final androidx.camera.core.featuregroup.impl.UseCaseType STREAM_SHARING;
    public static final androidx.camera.core.featuregroup.impl.UseCaseType UNDEFINED;
    public static final androidx.camera.core.featuregroup.impl.UseCaseType VIDEO_CAPTURE;
    private static final /* synthetic */ androidx.camera.core.featuregroup.impl.UseCaseType[] getHighSpeedVideoFpsRanges;
    private final java.lang.Class<?> surfaceClass;

    private UseCaseType(java.lang.String str, int i, java.lang.Class cls) {
        this.surfaceClass = cls;
    }

    public final java.lang.Class<?> getSurfaceClass() {
        return this.surfaceClass;
    }

    static {
        androidx.camera.core.featuregroup.impl.UseCaseType useCaseType = new androidx.camera.core.featuregroup.impl.UseCaseType("PREVIEW", 0, android.view.SurfaceHolder.class);
        PREVIEW = useCaseType;
        androidx.camera.core.featuregroup.impl.UseCaseType useCaseType2 = new androidx.camera.core.featuregroup.impl.UseCaseType("IMAGE_CAPTURE", 1, null);
        IMAGE_CAPTURE = useCaseType2;
        androidx.camera.core.featuregroup.impl.UseCaseType useCaseType3 = new androidx.camera.core.featuregroup.impl.UseCaseType("IMAGE_ANALYSIS", 2, null);
        IMAGE_ANALYSIS = useCaseType3;
        androidx.camera.core.featuregroup.impl.UseCaseType useCaseType4 = new androidx.camera.core.featuregroup.impl.UseCaseType("VIDEO_CAPTURE", 3, android.media.MediaCodec.class);
        VIDEO_CAPTURE = useCaseType4;
        androidx.camera.core.featuregroup.impl.UseCaseType useCaseType5 = new androidx.camera.core.featuregroup.impl.UseCaseType("STREAM_SHARING", 4, android.graphics.SurfaceTexture.class);
        STREAM_SHARING = useCaseType5;
        androidx.camera.core.featuregroup.impl.UseCaseType useCaseType6 = new androidx.camera.core.featuregroup.impl.UseCaseType("UNDEFINED", 5, null);
        UNDEFINED = useCaseType6;
        androidx.camera.core.featuregroup.impl.UseCaseType[] useCaseTypeArr = {useCaseType, useCaseType2, useCaseType3, useCaseType4, useCaseType5, useCaseType6};
        getHighSpeedVideoFpsRanges = useCaseTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(useCaseTypeArr);
        INSTANCE = new androidx.camera.core.featuregroup.impl.UseCaseType.Companion(null);
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        switch (androidx.camera.core.featuregroup.impl.UseCaseType.WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return "Preview";
            case 2:
                return "ImageCapture";
            case 3:
                return "ImageAnalysis";
            case 4:
                return "VideoCapture";
            case 5:
                return "StreamSharing";
            case 6:
                return "Undefined";
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0006\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\bH\u0007¢\u0006\u0004\b\u0006\u0010\tJ\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/camera/core/featuregroup/impl/UseCaseType$Companion;", "", "<init>", "()V", "Landroidx/camera/core/UseCase;", "Landroidx/camera/core/featuregroup/impl/UseCaseType;", "getFeatureGroupUseCaseType", "(Landroidx/camera/core/UseCase;)Landroidx/camera/core/featuregroup/impl/UseCaseType;", "Landroidx/camera/core/impl/UseCaseConfig;", "(Landroidx/camera/core/impl/UseCaseConfig;)Landroidx/camera/core/featuregroup/impl/UseCaseType;", "Landroidx/camera/core/featuregroup/impl/feature/FeatureTypeInternal;", "getAppConfiguredGroupableFeatureType$camera_core", "(Landroidx/camera/core/UseCase;)Landroidx/camera/core/featuregroup/impl/feature/FeatureTypeInternal;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.core.featuregroup.impl.UseCaseType getFeatureGroupUseCaseType(androidx.camera.core.UseCase useCase) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCase, "");
            if (useCase instanceof androidx.camera.core.Preview) {
                return androidx.camera.core.featuregroup.impl.UseCaseType.PREVIEW;
            }
            if (useCase instanceof androidx.camera.core.ImageCapture) {
                return androidx.camera.core.featuregroup.impl.UseCaseType.IMAGE_CAPTURE;
            }
            if (useCase instanceof androidx.camera.core.ImageAnalysis) {
                return androidx.camera.core.featuregroup.impl.UseCaseType.IMAGE_ANALYSIS;
            }
            if (androidx.camera.core.impl.utils.UseCaseUtil.isVideoCapture(useCase)) {
                return androidx.camera.core.featuregroup.impl.UseCaseType.VIDEO_CAPTURE;
            }
            if (useCase instanceof androidx.camera.core.streamsharing.StreamSharing) {
                return androidx.camera.core.featuregroup.impl.UseCaseType.STREAM_SHARING;
            }
            return androidx.camera.core.featuregroup.impl.UseCaseType.UNDEFINED;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.core.featuregroup.impl.UseCaseType getFeatureGroupUseCaseType(androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseConfig, "");
            int i = androidx.camera.core.featuregroup.impl.UseCaseType.Companion.WhenMappings.$EnumSwitchMapping$0[useCaseConfig.getCaptureType().ordinal()];
            if (i == 1) {
                return androidx.camera.core.featuregroup.impl.UseCaseType.IMAGE_ANALYSIS;
            }
            if (i == 2) {
                return androidx.camera.core.featuregroup.impl.UseCaseType.IMAGE_CAPTURE;
            }
            if (i == 3) {
                return androidx.camera.core.featuregroup.impl.UseCaseType.PREVIEW;
            }
            if (i == 4) {
                return androidx.camera.core.featuregroup.impl.UseCaseType.VIDEO_CAPTURE;
            }
            if (i == 5) {
                return androidx.camera.core.featuregroup.impl.UseCaseType.STREAM_SHARING;
            }
            return androidx.camera.core.featuregroup.impl.UseCaseType.UNDEFINED;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0089, code lost:
        
            return (androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal) r1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal getAppConfiguredGroupableFeatureType$camera_core(androidx.camera.core.UseCase useCase) {
            java.lang.Object obj;
            boolean hasDynamicRange;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCase, "");
            java.util.Iterator<E> it = androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                androidx.camera.core.featuregroup.impl.UseCaseType.Companion companion = androidx.camera.core.featuregroup.impl.UseCaseType.INSTANCE;
                int i = androidx.camera.core.featuregroup.impl.UseCaseType.Companion.WhenMappings.$EnumSwitchMapping$1[((androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal) obj).ordinal()];
                if (i == 1) {
                    hasDynamicRange = useCase.getAppConfig().hasDynamicRange();
                } else if (i == 2) {
                    hasDynamicRange = useCase.getAppConfig().hasTargetFrameRate();
                } else if (i == 3) {
                    if (useCase.getAppConfig().containsOption(androidx.camera.core.impl.UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE) || useCase.getAppConfig().containsOption(androidx.camera.core.impl.UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE)) {
                        break;
                    }
                } else if (i == 4) {
                    hasDynamicRange = useCase.getAppConfig().containsOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_OUTPUT_FORMAT);
                } else {
                    if (i != 5) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    hasDynamicRange = kotlin.jvm.internal.Intrinsics.areEqual(useCase.getAppConfig().retrieveOption(androidx.camera.core.impl.UseCaseConfig.OPTION_IS_VIDEO_QUALITY_SELECTOR_DEFAULT, java.lang.Boolean.TRUE), java.lang.Boolean.FALSE);
                }
                if (hasDynamicRange) {
                    break;
                }
            }
        }

        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.values().length];
                try {
                    iArr[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.PREVIEW.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.STREAM_SHARING.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.values().length];
                try {
                    iArr2[androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.DYNAMIC_RANGE.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                try {
                    iArr2[androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.FPS_RANGE.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                try {
                    iArr2[androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.VIDEO_STABILIZATION.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused8) {
                }
                try {
                    iArr2[androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.IMAGE_FORMAT.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused9) {
                }
                try {
                    iArr2[androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.RECORDING_QUALITY.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused10) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static androidx.camera.core.featuregroup.impl.UseCaseType[] values() {
        return (androidx.camera.core.featuregroup.impl.UseCaseType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static androidx.camera.core.featuregroup.impl.UseCaseType valueOf(java.lang.String str) {
        return (androidx.camera.core.featuregroup.impl.UseCaseType) java.lang.Enum.valueOf(androidx.camera.core.featuregroup.impl.UseCaseType.class, str);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.core.featuregroup.impl.UseCaseType getFeatureGroupUseCaseType(androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig) {
        return INSTANCE.getFeatureGroupUseCaseType(useCaseConfig);
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.camera.core.featuregroup.impl.UseCaseType.values().length];
            try {
                iArr[androidx.camera.core.featuregroup.impl.UseCaseType.PREVIEW.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.camera.core.featuregroup.impl.UseCaseType.IMAGE_CAPTURE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.camera.core.featuregroup.impl.UseCaseType.IMAGE_ANALYSIS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.camera.core.featuregroup.impl.UseCaseType.VIDEO_CAPTURE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.camera.core.featuregroup.impl.UseCaseType.STREAM_SHARING.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[androidx.camera.core.featuregroup.impl.UseCaseType.UNDEFINED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.core.featuregroup.impl.UseCaseType getFeatureGroupUseCaseType(androidx.camera.core.UseCase useCase) {
        return INSTANCE.getFeatureGroupUseCaseType(useCase);
    }

    public static kotlin.enums.EnumEntries<androidx.camera.core.featuregroup.impl.UseCaseType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
