package androidx.camera.camera2.pipe.internal;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\b\b\u0001\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0014\u0010\u0012\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0016\u0010\u001e\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u0016\u0010!\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c"}, d2 = {"Landroidx/camera/camera2/pipe/internal/CameraPipeLifetime;", "", "Lkotlinx/coroutines/Job;", "cameraPipeJob", "<init>", "(Lkotlinx/coroutines/Job;)V", "Landroidx/camera/camera2/pipe/internal/CameraPipeLifetime$ShutdownType;", "shutdownType", "Ljava/lang/Runnable;", "shutdownAction", "", "addShutdownAction", "(Landroidx/camera/camera2/pipe/internal/CameraPipeLifetime$ShutdownType;Ljava/lang/Runnable;)V", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/Runnable;)Z", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "shutdown", "()V", "()Lkotlin/Unit;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/Job;", "Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Z", "", "Ljava/util/List;", "getHighSpeedVideoSizesFor", "getOutputFormats", "getInputFormats", "getOutputMinFrameDuration", "getInputSizeshNQ4ISI", "Companion", "ShutdownType"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CameraPipeLifetime {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.List<java.lang.Runnable> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.Job Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getOutputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoSizes;
    private final java.util.List<java.lang.Runnable> getInputFormats;
    private boolean getInputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final java.util.List<java.lang.Runnable> getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoSizesFor;

    @javax.inject.Inject
    public CameraPipeLifetime(@androidx.camera.camera2.pipe.config.CameraPipeJob kotlinx.coroutines.Job job) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(job, "");
        this.Camera2StreamConfigurationMap = job;
        this.getHighSpeedVideoFpsRangesFor = new java.lang.Object();
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
        this.getHighSpeedVideoSizes = new java.lang.Object();
        this.getInputFormats = new java.util.ArrayList();
        this.getHighSpeedVideoSizesFor = new java.lang.Object();
        this.getOutputMinFrameDuration = new java.util.ArrayList();
    }

    public final void addShutdownAction(androidx.camera.camera2.pipe.internal.CameraPipeLifetime.ShutdownType shutdownType, java.lang.Runnable shutdownAction) {
        boolean highResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shutdownType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shutdownAction, "");
        int i = androidx.camera.camera2.pipe.internal.CameraPipeLifetime.WhenMappings.$EnumSwitchMapping$0[shutdownType.ordinal()];
        if (i == 1) {
            highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(shutdownAction);
        } else if (i == 2) {
            highResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap(shutdownAction);
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            highResolutionOutputSizeshNQ4ISI = getHighSpeedVideoSizes(shutdownAction);
        }
        if (highResolutionOutputSizeshNQ4ISI) {
            return;
        }
        androidx.camera.camera2.pipe.core.Log.INSTANCE.getERROR_LOGGABLE();
        shutdownAction.run();
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.Runnable p0) {
        boolean add;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            add = this.getHighResolutionOutputSizeshNQ4ISI ? false : this.getHighSpeedVideoFpsRanges.add(p0);
        }
        return add;
    }

    private final boolean Camera2StreamConfigurationMap(java.lang.Runnable p0) {
        boolean add;
        synchronized (this.getHighSpeedVideoSizes) {
            add = this.getOutputFormats ? false : this.getInputFormats.add(p0);
        }
        return add;
    }

    private final boolean getHighSpeedVideoSizes(java.lang.Runnable p0) {
        boolean add;
        synchronized (this.getHighSpeedVideoSizesFor) {
            add = this.getInputSizeshNQ4ISI ? false : this.getOutputMinFrameDuration.add(p0);
        }
        return add;
    }

    private final kotlin.Unit Camera2StreamConfigurationMap() {
        java.lang.Object runBlocking$default;
        kotlin.Unit unit;
        synchronized (this.getHighSpeedVideoSizes) {
            androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
            java.util.Iterator<java.lang.Runnable> it = this.getInputFormats.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new androidx.camera.camera2.pipe.internal.CameraPipeLifetime$shutdownScope$1$2(this, null), 1, null);
            unit = (kotlin.Unit) runBlocking$default;
        }
        return unit;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/camera/camera2/pipe/internal/CameraPipeLifetime$ShutdownType;", "", "<init>", "(Ljava/lang/String;I)V", "CAMERA", "SCOPE", "THREAD"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class ShutdownType {
        public static final androidx.camera.camera2.pipe.internal.CameraPipeLifetime.ShutdownType CAMERA;
        public static final androidx.camera.camera2.pipe.internal.CameraPipeLifetime.ShutdownType SCOPE;
        public static final androidx.camera.camera2.pipe.internal.CameraPipeLifetime.ShutdownType THREAD;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ androidx.camera.camera2.pipe.internal.CameraPipeLifetime.ShutdownType[] getHighSpeedVideoFpsRanges;

        private ShutdownType(java.lang.String str, int i) {
        }

        static {
            androidx.camera.camera2.pipe.internal.CameraPipeLifetime.ShutdownType shutdownType = new androidx.camera.camera2.pipe.internal.CameraPipeLifetime.ShutdownType("CAMERA", 0);
            CAMERA = shutdownType;
            androidx.camera.camera2.pipe.internal.CameraPipeLifetime.ShutdownType shutdownType2 = new androidx.camera.camera2.pipe.internal.CameraPipeLifetime.ShutdownType("SCOPE", 1);
            SCOPE = shutdownType2;
            androidx.camera.camera2.pipe.internal.CameraPipeLifetime.ShutdownType shutdownType3 = new androidx.camera.camera2.pipe.internal.CameraPipeLifetime.ShutdownType("THREAD", 2);
            THREAD = shutdownType3;
            androidx.camera.camera2.pipe.internal.CameraPipeLifetime.ShutdownType[] shutdownTypeArr = {shutdownType, shutdownType2, shutdownType3};
            getHighSpeedVideoFpsRanges = shutdownTypeArr;
            getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(shutdownTypeArr);
        }

        public static androidx.camera.camera2.pipe.internal.CameraPipeLifetime.ShutdownType[] values() {
            return (androidx.camera.camera2.pipe.internal.CameraPipeLifetime.ShutdownType[]) getHighSpeedVideoFpsRanges.clone();
        }

        public static androidx.camera.camera2.pipe.internal.CameraPipeLifetime.ShutdownType valueOf(java.lang.String str) {
            return (androidx.camera.camera2.pipe.internal.CameraPipeLifetime.ShutdownType) java.lang.Enum.valueOf(androidx.camera.camera2.pipe.internal.CameraPipeLifetime.ShutdownType.class, str);
        }

        public static kotlin.enums.EnumEntries<androidx.camera.camera2.pipe.internal.CameraPipeLifetime.ShutdownType> getEntries() {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    public final void shutdown() {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
            java.util.Iterator<java.lang.Runnable> it = this.getHighSpeedVideoFpsRanges.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        Camera2StreamConfigurationMap();
        synchronized (this.getHighSpeedVideoSizesFor) {
            androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
            java.util.Iterator<java.lang.Runnable> it2 = this.getOutputMinFrameDuration.iterator();
            while (it2.hasNext()) {
                it2.next().run();
            }
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.camera.camera2.pipe.internal.CameraPipeLifetime.ShutdownType.values().length];
            try {
                iArr[androidx.camera.camera2.pipe.internal.CameraPipeLifetime.ShutdownType.CAMERA.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.camera.camera2.pipe.internal.CameraPipeLifetime.ShutdownType.SCOPE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.camera.camera2.pipe.internal.CameraPipeLifetime.ShutdownType.THREAD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
