package androidx.camera.core.impl.utils;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u0005*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/camera/core/impl/utils/UseCaseUtil;", "", "<init>", "()V", "", "Landroidx/camera/core/UseCase;", "", "containsVideoCapture", "(Ljava/util/Collection;)Z", "isVideoCapture", "(Landroidx/camera/core/UseCase;)Z", "Lkotlin/Function1;", "Landroidx/camera/core/impl/UseCaseConfig;", "configProvider", "Landroidx/camera/core/impl/stabilization/VideoStabilization;", "getVideoStabilization", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Landroidx/camera/core/impl/stabilization/VideoStabilization;", "findVideoCapture", "(Ljava/util/Collection;)Landroidx/camera/core/UseCase;", "Landroidx/camera/core/Preview;", "findPreview", "(Ljava/util/Collection;)Landroidx/camera/core/Preview;", "Landroidx/camera/core/ImageCapture;", "findImageCapture", "(Ljava/util/Collection;)Landroidx/camera/core/ImageCapture;", "Landroidx/camera/core/ImageAnalysis;", "findImageAnalysis", "(Ljava/util/Collection;)Landroidx/camera/core/ImageAnalysis;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UseCaseUtil {
    public static final androidx.camera.core.impl.utils.UseCaseUtil INSTANCE = new androidx.camera.core.impl.utils.UseCaseUtil();

    private UseCaseUtil() {
    }

    @kotlin.jvm.JvmStatic
    public static final boolean containsVideoCapture(java.util.Collection<? extends androidx.camera.core.UseCase> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        for (androidx.camera.core.UseCase useCase : collection) {
            if (useCase != null && isVideoCapture(useCase)) {
                return true;
            }
        }
        return false;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isVideoCapture(androidx.camera.core.UseCase useCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCase, "");
        if (useCase.getCurrentConfig().containsOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_TYPE)) {
            return useCase.getCurrentConfig().getCaptureType() == androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(useCase);
        sb.append(" UseCase does not have capture type.");
        androidx.camera.core.Logger.e("UseCaseUtil", sb.toString());
        return false;
    }

    public static /* synthetic */ androidx.camera.core.impl.stabilization.VideoStabilization getVideoStabilization$default(java.util.Collection collection, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.camera.core.impl.utils.UseCaseUtil$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return androidx.camera.core.impl.utils.UseCaseUtil.$r8$lambda$M5Tm0HjWhdy66TpzSL1OyPbufao((androidx.camera.core.UseCase) obj2);
                }
            };
        }
        return getVideoStabilization(collection, function1);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.core.impl.stabilization.VideoStabilization getVideoStabilization(java.util.Collection<? extends androidx.camera.core.UseCase> collection, kotlin.jvm.functions.Function1<? super androidx.camera.core.UseCase, ? extends androidx.camera.core.impl.UseCaseConfig<?>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.camera.core.impl.stabilization.VideoStabilization.Companion companion = androidx.camera.core.impl.stabilization.VideoStabilization.INSTANCE;
        java.util.Collection<? extends androidx.camera.core.UseCase> collection2 = collection;
        java.util.Iterator<T> it = collection2.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            int previewStabilizationMode = function1.invoke((androidx.camera.core.UseCase) it.next()).getPreviewStabilizationMode();
            if (previewStabilizationMode != 0) {
                if (i2 != previewStabilizationMode && i2 != 0) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected configurations: Overwriting current previewStabilizationMode(");
                    sb.append(i2);
                    sb.append(") with useCasePreviewStabilization(");
                    sb.append(previewStabilizationMode);
                    sb.append(")!");
                    androidx.camera.core.Logger.w("UseCaseUtil", sb.toString());
                }
                i2 = previewStabilizationMode;
            }
        }
        java.util.Iterator<T> it2 = collection2.iterator();
        while (it2.hasNext()) {
            int videoStabilizationMode = function1.invoke((androidx.camera.core.UseCase) it2.next()).getVideoStabilizationMode();
            if (videoStabilizationMode != 0) {
                if (i != videoStabilizationMode && i != 0) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unexpected configurations: Overwriting current videoStabilizationMode(");
                    sb2.append(i);
                    sb2.append(") with useCaseVideoStabilization(");
                    sb2.append(videoStabilizationMode);
                    sb2.append(")!");
                    androidx.camera.core.Logger.w("UseCaseUtil", sb2.toString());
                }
                i = videoStabilizationMode;
            }
        }
        return companion.from$camera_core(i2, i);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.core.UseCase findVideoCapture(java.util.Collection<? extends androidx.camera.core.UseCase> collection) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        java.util.Iterator<T> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (isVideoCapture((androidx.camera.core.UseCase) obj)) {
                break;
            }
        }
        return (androidx.camera.core.UseCase) obj;
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.core.Preview findPreview(java.util.Collection<? extends androidx.camera.core.UseCase> collection) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        java.util.Iterator<T> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((androidx.camera.core.UseCase) obj) instanceof androidx.camera.core.Preview) {
                break;
            }
        }
        if (obj instanceof androidx.camera.core.Preview) {
            return (androidx.camera.core.Preview) obj;
        }
        return null;
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.core.ImageCapture findImageCapture(java.util.Collection<? extends androidx.camera.core.UseCase> collection) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        java.util.Iterator<T> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((androidx.camera.core.UseCase) obj) instanceof androidx.camera.core.ImageCapture) {
                break;
            }
        }
        if (obj instanceof androidx.camera.core.ImageCapture) {
            return (androidx.camera.core.ImageCapture) obj;
        }
        return null;
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.core.ImageAnalysis findImageAnalysis(java.util.Collection<? extends androidx.camera.core.UseCase> collection) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        java.util.Iterator<T> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((androidx.camera.core.UseCase) obj) instanceof androidx.camera.core.ImageAnalysis) {
                break;
            }
        }
        if (obj instanceof androidx.camera.core.ImageAnalysis) {
            return (androidx.camera.core.ImageAnalysis) obj;
        }
        return null;
    }

    public static /* synthetic */ androidx.camera.core.impl.UseCaseConfig $r8$lambda$M5Tm0HjWhdy66TpzSL1OyPbufao(androidx.camera.core.UseCase useCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCase, "");
        return useCase.getCurrentConfig();
    }
}
