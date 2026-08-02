package androidx.camera.core.impl.stabilization;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Landroidx/camera/core/impl/stabilization/VideoStabilization;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "UNSPECIFIED", "OFF", "ON", "PREVIEW"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VideoStabilization {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.core.impl.stabilization.VideoStabilization.Companion INSTANCE;
    public static final androidx.camera.core.impl.stabilization.VideoStabilization OFF;
    public static final androidx.camera.core.impl.stabilization.VideoStabilization ON;
    public static final androidx.camera.core.impl.stabilization.VideoStabilization PREVIEW;
    public static final androidx.camera.core.impl.stabilization.VideoStabilization UNSPECIFIED;
    private static final /* synthetic */ androidx.camera.core.impl.stabilization.VideoStabilization[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private VideoStabilization(java.lang.String str, int i) {
    }

    static {
        androidx.camera.core.impl.stabilization.VideoStabilization videoStabilization = new androidx.camera.core.impl.stabilization.VideoStabilization("UNSPECIFIED", 0);
        UNSPECIFIED = videoStabilization;
        androidx.camera.core.impl.stabilization.VideoStabilization videoStabilization2 = new androidx.camera.core.impl.stabilization.VideoStabilization("OFF", 1);
        OFF = videoStabilization2;
        androidx.camera.core.impl.stabilization.VideoStabilization videoStabilization3 = new androidx.camera.core.impl.stabilization.VideoStabilization("ON", 2);
        ON = videoStabilization3;
        androidx.camera.core.impl.stabilization.VideoStabilization videoStabilization4 = new androidx.camera.core.impl.stabilization.VideoStabilization("PREVIEW", 3);
        PREVIEW = videoStabilization4;
        androidx.camera.core.impl.stabilization.VideoStabilization[] videoStabilizationArr = {videoStabilization, videoStabilization2, videoStabilization3, videoStabilization4};
        getHighSpeedVideoFpsRanges = videoStabilizationArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(videoStabilizationArr);
        INSTANCE = new androidx.camera.core.impl.stabilization.VideoStabilization.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/camera/core/impl/stabilization/VideoStabilization$Companion;", "", "<init>", "()V", "", "previewStabilizationMode", "videoStabilizationMode", "Landroidx/camera/core/impl/stabilization/VideoStabilization;", "from$camera_core", "(II)Landroidx/camera/core/impl/stabilization/VideoStabilization;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ androidx.camera.core.impl.stabilization.VideoStabilization from$camera_core$default(androidx.camera.core.impl.stabilization.VideoStabilization.Companion companion, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            return companion.from$camera_core(i, i2);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.core.impl.stabilization.VideoStabilization from$camera_core(int previewStabilizationMode, int videoStabilizationMode) {
            if (previewStabilizationMode == 1 || videoStabilizationMode == 1) {
                return androidx.camera.core.impl.stabilization.VideoStabilization.OFF;
            }
            if (previewStabilizationMode == 2) {
                return androidx.camera.core.impl.stabilization.VideoStabilization.PREVIEW;
            }
            if (videoStabilizationMode == 2) {
                return androidx.camera.core.impl.stabilization.VideoStabilization.ON;
            }
            return androidx.camera.core.impl.stabilization.VideoStabilization.UNSPECIFIED;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static androidx.camera.core.impl.stabilization.VideoStabilization[] values() {
        return (androidx.camera.core.impl.stabilization.VideoStabilization[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static androidx.camera.core.impl.stabilization.VideoStabilization valueOf(java.lang.String str) {
        return (androidx.camera.core.impl.stabilization.VideoStabilization) java.lang.Enum.valueOf(androidx.camera.core.impl.stabilization.VideoStabilization.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.camera.core.impl.stabilization.VideoStabilization> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
