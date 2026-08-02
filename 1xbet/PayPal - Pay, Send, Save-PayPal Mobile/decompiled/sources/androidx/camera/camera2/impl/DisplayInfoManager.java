package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 )2\u00020\u0001:\u0001)B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"R\u0014\u0010\u0019\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010("}, d2 = {"Landroidx/camera/camera2/impl/DisplayInfoManager;", "", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "refreshPreviewSize", "()V", "Landroid/util/Size;", "getPreviewSize", "()Landroid/util/Size;", "", "Landroid/view/Display;", "getHighResolutionOutputSizeshNQ4ISI", "()[Landroid/view/Display;", "", "skipStateOffDisplay", "getMaxSizeDisplay", "(Z)Landroid/view/Display;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/compat/workaround/MaxPreviewSize;", "getHighSpeedVideoSizesFor", "Landroidx/camera/camera2/compat/workaround/MaxPreviewSize;", "Landroidx/camera/camera2/compat/workaround/DisplaySizeCorrector;", "getInputFormats", "Landroidx/camera/camera2/compat/workaround/DisplaySizeCorrector;", "getHighSpeedVideoSizes", "getOutputFormats", "Ljava/lang/Object;", "getOutputMinFrameDuration", "[Landroid/view/Display;", "getHighSpeedVideoFpsRanges", "Landroid/hardware/display/DisplayManager$DisplayListener;", "Landroid/hardware/display/DisplayManager$DisplayListener;", "Camera2StreamConfigurationMap", "Landroid/hardware/display/DisplayManager;", "getInputSizeshNQ4ISI", "Landroid/hardware/display/DisplayManager;", "getOutputSizeshNQ4ISI", "Landroid/util/Size;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DisplayInfoManager {
    private static volatile androidx.camera.camera2.impl.DisplayInfoManager getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.hardware.display.DisplayManager.DisplayListener Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.compat.workaround.MaxPreviewSize getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.camera.camera2.compat.workaround.DisplaySizeCorrector getHighSpeedVideoSizes;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.hardware.display.DisplayManager getInputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private volatile android.view.Display[] getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private volatile android.util.Size getHighSpeedVideoSizesFor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.impl.DisplayInfoManager.Companion INSTANCE = new androidx.camera.camera2.impl.DisplayInfoManager.Companion(null);
    private static final android.util.Size Camera2StreamConfigurationMap = new android.util.Size(1920, 1080);
    private static final android.util.Size getHighResolutionOutputSizeshNQ4ISI = new android.util.Size(320, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
    private static final android.util.Size getHighSpeedVideoSizes = new android.util.Size(640, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND);

    /* JADX WARN: Multi-variable type inference failed */
    private DisplayInfoManager(android.content.Context context) {
        this.getHighSpeedVideoFpsRangesFor = new androidx.camera.camera2.compat.workaround.MaxPreviewSize(null, 1, 0 == true ? 1 : 0);
        this.getHighSpeedVideoSizes = new androidx.camera.camera2.compat.workaround.DisplaySizeCorrector();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
        android.hardware.display.DisplayManager.DisplayListener displayListener = new android.hardware.display.DisplayManager.DisplayListener() { // from class: androidx.camera.camera2.impl.DisplayInfoManager$displayListener$1
            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayAdded(int displayId) {
                java.lang.Object obj;
                obj = androidx.camera.camera2.impl.DisplayInfoManager.this.getHighResolutionOutputSizeshNQ4ISI;
                androidx.camera.camera2.impl.DisplayInfoManager displayInfoManager = androidx.camera.camera2.impl.DisplayInfoManager.this;
                synchronized (obj) {
                    displayInfoManager.getHighSpeedVideoFpsRanges = null;
                    displayInfoManager.getHighSpeedVideoSizesFor = null;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayRemoved(int displayId) {
                java.lang.Object obj;
                obj = androidx.camera.camera2.impl.DisplayInfoManager.this.getHighResolutionOutputSizeshNQ4ISI;
                androidx.camera.camera2.impl.DisplayInfoManager displayInfoManager = androidx.camera.camera2.impl.DisplayInfoManager.this;
                synchronized (obj) {
                    displayInfoManager.getHighSpeedVideoFpsRanges = null;
                    displayInfoManager.getHighSpeedVideoSizesFor = null;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayChanged(int displayId) {
                java.lang.Object obj;
                obj = androidx.camera.camera2.impl.DisplayInfoManager.this.getHighResolutionOutputSizeshNQ4ISI;
                androidx.camera.camera2.impl.DisplayInfoManager displayInfoManager = androidx.camera.camera2.impl.DisplayInfoManager.this;
                synchronized (obj) {
                    displayInfoManager.getHighSpeedVideoFpsRanges = null;
                    displayInfoManager.getHighSpeedVideoSizesFor = null;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
        };
        this.Camera2StreamConfigurationMap = displayListener;
        java.lang.Object systemService = context.getSystemService(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) systemService;
        displayManager.registerDisplayListener(displayListener, new android.os.Handler(android.os.Looper.getMainLooper()));
        this.getInputFormats = displayManager;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011"}, d2 = {"Landroidx/camera/camera2/impl/DisplayInfoManager$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/camera/camera2/impl/DisplayInfoManager;", "getInstance", "(Landroid/content/Context;)Landroidx/camera/camera2/impl/DisplayInfoManager;", "", "releaseInstance", "Landroid/util/Size;", "Camera2StreamConfigurationMap", "Landroid/util/Size;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/impl/DisplayInfoManager;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.camera.camera2.impl.DisplayInfoManager getInstance(android.content.Context context) {
            androidx.camera.camera2.impl.DisplayInfoManager displayInfoManager;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            androidx.camera.camera2.impl.DisplayInfoManager displayInfoManager2 = androidx.camera.camera2.impl.DisplayInfoManager.getHighSpeedVideoFpsRangesFor;
            if (displayInfoManager2 != null) {
                return displayInfoManager2;
            }
            synchronized (this) {
                displayInfoManager = androidx.camera.camera2.impl.DisplayInfoManager.getHighSpeedVideoFpsRangesFor;
                if (displayInfoManager == null) {
                    android.content.Context persistentApplicationContext = androidx.camera.core.impl.utils.ContextUtil.getPersistentApplicationContext(context);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(persistentApplicationContext, "");
                    displayInfoManager = new androidx.camera.camera2.impl.DisplayInfoManager(persistentApplicationContext, null);
                    androidx.camera.camera2.impl.DisplayInfoManager.Companion companion = androidx.camera.camera2.impl.DisplayInfoManager.INSTANCE;
                    androidx.camera.camera2.impl.DisplayInfoManager.getHighSpeedVideoFpsRangesFor = displayInfoManager;
                }
            }
            return displayInfoManager;
        }

        public final void releaseInstance() {
            androidx.camera.camera2.impl.DisplayInfoManager displayInfoManager = androidx.camera.camera2.impl.DisplayInfoManager.getHighSpeedVideoFpsRangesFor;
            if (displayInfoManager != null) {
                synchronized (androidx.camera.camera2.impl.DisplayInfoManager.INSTANCE) {
                    displayInfoManager.getInputFormats.unregisterDisplayListener(displayInfoManager.Camera2StreamConfigurationMap);
                    androidx.camera.camera2.impl.DisplayInfoManager.Companion companion = androidx.camera.camera2.impl.DisplayInfoManager.INSTANCE;
                    androidx.camera.camera2.impl.DisplayInfoManager.getHighSpeedVideoFpsRangesFor = null;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void refreshPreviewSize() {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighSpeedVideoSizesFor = getHighSpeedVideoFpsRangesFor();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final android.util.Size getPreviewSize() {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            if (this.getHighSpeedVideoSizesFor != null) {
                android.util.Size size = this.getHighSpeedVideoSizesFor;
                kotlin.jvm.internal.Intrinsics.checkNotNull(size, "");
                return size;
            }
            this.getHighSpeedVideoSizesFor = getHighSpeedVideoFpsRangesFor();
            android.util.Size size2 = this.getHighSpeedVideoSizesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(size2);
            return size2;
        }
    }

    private final android.view.Display[] getHighResolutionOutputSizeshNQ4ISI() {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            android.view.Display[] displayArr = this.getHighSpeedVideoFpsRanges;
            if (displayArr != null) {
                return displayArr;
            }
            android.view.Display[] displays = this.getInputFormats.getDisplays();
            this.getHighSpeedVideoFpsRanges = displays;
            kotlin.jvm.internal.Intrinsics.checkNotNull(displays);
            return displays;
        }
    }

    public static /* synthetic */ android.view.Display getMaxSizeDisplay$default(androidx.camera.camera2.impl.DisplayInfoManager displayInfoManager, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return displayInfoManager.getMaxSizeDisplay(z);
    }

    public final android.view.Display getMaxSizeDisplay(boolean skipStateOffDisplay) {
        android.view.Display[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        if (highResolutionOutputSizeshNQ4ISI.length == 1) {
            return highResolutionOutputSizeshNQ4ISI[0];
        }
        android.view.Display display = null;
        int i = -1;
        int i2 = -1;
        android.view.Display display2 = null;
        for (android.view.Display display3 : highResolutionOutputSizeshNQ4ISI) {
            android.graphics.Point point = new android.graphics.Point();
            display3.getRealSize(point);
            if (point.x * point.y > i) {
                i = point.x * point.y;
                display = display3;
            }
            if (display3.getState() != 1 && point.x * point.y > i2) {
                i2 = point.x * point.y;
                display2 = display3;
            }
        }
        if (skipStateOffDisplay && display2 != null) {
            display = display2;
        }
        if (display != null) {
            return display;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("No displays found from ");
        java.lang.String arrays = java.util.Arrays.toString(highResolutionOutputSizeshNQ4ISI);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays, "");
        sb.append(arrays);
        sb.append('!');
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }

    private final android.util.Size getHighSpeedVideoFpsRangesFor() {
        android.graphics.Point point = new android.graphics.Point();
        getMaxSizeDisplay(false).getRealSize(point);
        android.util.Size size = new android.util.Size(point.x, point.y);
        if (androidx.camera.core.internal.utils.SizeUtil.isSmallerByArea(size, getHighResolutionOutputSizeshNQ4ISI) && (size = this.getHighSpeedVideoSizes.getDisplaySize()) == null) {
            size = getHighSpeedVideoSizes;
        }
        if (size.getHeight() > size.getWidth()) {
            size = new android.util.Size(size.getHeight(), size.getWidth());
        }
        android.util.Size size2 = Camera2StreamConfigurationMap;
        if (androidx.camera.core.internal.utils.SizeUtil.isSmallerByArea(size2, size)) {
            size = size2;
        }
        return this.getHighSpeedVideoFpsRangesFor.getMaxPreviewResolution(size);
    }

    public /* synthetic */ DisplayInfoManager(android.content.Context context, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }
}
