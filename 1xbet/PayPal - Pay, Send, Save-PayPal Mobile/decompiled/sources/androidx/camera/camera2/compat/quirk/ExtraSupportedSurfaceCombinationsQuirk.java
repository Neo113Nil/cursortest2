package androidx.camera.camera2.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;", "Landroidx/camera/core/impl/Quirk;", "<init>", "()V", "", "cameraId", "", "Landroidx/camera/core/impl/SurfaceCombination;", "getExtraSupportedSurfaceCombinations", "(Ljava/lang/String;)Ljava/util/List;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExtraSupportedSurfaceCombinationsQuirk implements androidx.camera.core.impl.Quirk {
    private static final androidx.camera.core.impl.SurfaceCombination Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.Companion INSTANCE;
    private static final androidx.camera.core.impl.SurfaceCombination getHighResolutionOutputSizeshNQ4ISI;
    private static final androidx.camera.core.impl.SurfaceCombination getHighSpeedVideoFpsRanges;
    private static final java.util.Set<java.lang.String> getHighSpeedVideoFpsRangesFor;
    private static final java.util.Set<java.lang.String> getHighSpeedVideoSizes;

    public final java.util.List<androidx.camera.core.impl.SurfaceCombination> getExtraSupportedSurfaceCombinations(java.lang.String cameraId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
        androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.Companion companion = INSTANCE;
        if (!companion.isSamsungS7$camera_camera2()) {
            if (companion.supportExtraLevel3ConfigurationsGoogleDevice$camera_camera2() || companion.supportExtraLevel3ConfigurationsSamsungDevice$camera_camera2()) {
                return kotlin.collections.CollectionsKt.listOf(getHighSpeedVideoFpsRanges);
            }
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (kotlin.jvm.internal.Intrinsics.areEqual(cameraId, "1")) {
            arrayList.add(getHighResolutionOutputSizeshNQ4ISI);
        }
        return arrayList;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0006"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk$Companion;", "", "<init>", "()V", "", "isEnabled", "()Z", "supportExtraLevel3ConfigurationsGoogleDevice$camera_camera2", "supportExtraLevel3ConfigurationsSamsungDevice$camera_camera2", "Landroidx/camera/core/impl/SurfaceCombination;", "createFullYuvPrivYuvConfiguration$camera_camera2", "()Landroidx/camera/core/impl/SurfaceCombination;", "createFullYuvYuvYuvConfiguration$camera_camera2", "createLevel3PrivPrivYuvSubsetConfiguration$camera_camera2", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/core/impl/SurfaceCombination;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "", "", "Ljava/util/Set;", "getHighSpeedVideoFpsRangesFor", "isSamsungS7$camera_camera2", "isSamsungS7"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean isEnabled() {
            return isSamsungS7$camera_camera2() || supportExtraLevel3ConfigurationsGoogleDevice$camera_camera2() || supportExtraLevel3ConfigurationsSamsungDevice$camera_camera2();
        }

        public final boolean isSamsungS7$camera_camera2() {
            return kotlin.text.StringsKt.equals("heroqltevzw", android.os.Build.DEVICE, true) || kotlin.text.StringsKt.equals("heroqltetmo", android.os.Build.DEVICE, true);
        }

        public final boolean supportExtraLevel3ConfigurationsGoogleDevice$camera_camera2() {
            if (!androidx.camera.camera2.compat.quirk.Device.INSTANCE.isGoogleDevice()) {
                return false;
            }
            java.lang.String str = android.os.Build.MODEL;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
            java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            return androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.getHighSpeedVideoSizes.contains(upperCase);
        }

        public final boolean supportExtraLevel3ConfigurationsSamsungDevice$camera_camera2() {
            if (!androidx.camera.camera2.compat.quirk.Device.INSTANCE.isSamsungDevice()) {
                return false;
            }
            java.lang.String str = android.os.Build.MODEL;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
            java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            java.util.Iterator it = androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.getHighSpeedVideoFpsRangesFor.iterator();
            while (it.hasNext()) {
                if (kotlin.text.StringsKt.startsWith$default(upperCase, (java.lang.String) it.next(), false, 2, (java.lang.Object) null)) {
                    return true;
                }
            }
            return false;
        }

        public final androidx.camera.core.impl.SurfaceCombination createFullYuvPrivYuvConfiguration$camera_camera2() {
            androidx.camera.core.impl.SurfaceCombination surfaceCombination = new androidx.camera.core.impl.SurfaceCombination();
            surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.Companion.create$default(androidx.camera.core.impl.SurfaceConfig.INSTANCE, androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV, androidx.camera.core.impl.SurfaceConfig.ConfigSize.VGA, null, 4, null));
            surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.Companion.create$default(androidx.camera.core.impl.SurfaceConfig.INSTANCE, androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV, androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
            surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.Companion.create$default(androidx.camera.core.impl.SurfaceConfig.INSTANCE, androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV, androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
            return surfaceCombination;
        }

        public final androidx.camera.core.impl.SurfaceCombination createFullYuvYuvYuvConfiguration$camera_camera2() {
            androidx.camera.core.impl.SurfaceCombination surfaceCombination = new androidx.camera.core.impl.SurfaceCombination();
            surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.Companion.create$default(androidx.camera.core.impl.SurfaceConfig.INSTANCE, androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV, androidx.camera.core.impl.SurfaceConfig.ConfigSize.VGA, null, 4, null));
            surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.Companion.create$default(androidx.camera.core.impl.SurfaceConfig.INSTANCE, androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV, androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
            surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.Companion.create$default(androidx.camera.core.impl.SurfaceConfig.INSTANCE, androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV, androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
            return surfaceCombination;
        }

        public final androidx.camera.core.impl.SurfaceCombination createLevel3PrivPrivYuvSubsetConfiguration$camera_camera2() {
            androidx.camera.core.impl.SurfaceCombination surfaceCombination = new androidx.camera.core.impl.SurfaceCombination();
            surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.Companion.create$default(androidx.camera.core.impl.SurfaceConfig.INSTANCE, androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV, androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
            surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.Companion.create$default(androidx.camera.core.impl.SurfaceConfig.INSTANCE, androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV, androidx.camera.core.impl.SurfaceConfig.ConfigSize.VGA, null, 4, null));
            surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.Companion.create$default(androidx.camera.core.impl.SurfaceConfig.INSTANCE, androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV, androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
            return surfaceCombination;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.Companion companion = new androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.Companion(null);
        INSTANCE = companion;
        getHighResolutionOutputSizeshNQ4ISI = companion.createFullYuvPrivYuvConfiguration$camera_camera2();
        Camera2StreamConfigurationMap = companion.createFullYuvYuvYuvConfiguration$camera_camera2();
        getHighSpeedVideoFpsRanges = companion.createLevel3PrivPrivYuvSubsetConfiguration$camera_camera2();
        getHighSpeedVideoSizes = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO", "PIXEL 9", "PIXEL 9 PRO", "PIXEL 9 PRO XL", "PIXEL 9 PRO FOLD"});
        getHighSpeedVideoFpsRangesFor = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26", "SM-S931", "SM-S936", "SM-S937", "SM-S938", "SCG31", "SCG32", "SC-51F", "SC-52F"});
    }
}
