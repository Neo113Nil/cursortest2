package androidx.camera.viewfinder.core;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001e\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 92\u00020\u0001:\u0003:;9B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\"\u0010 \u001a\u00020\r8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b \u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\u00020\r8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010!\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u0016\u0010\u001d\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010'R\u0016\u0010)\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0016\u0010*\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0016\u0010+\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010'R\u0016\u0010-\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u0010'R\u0016\u0010\u001e\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010'R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u00100R\u0016\u00102\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u0010!R\u0016\u0010\u001a\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010'R\u0016\u00103\u001a\u00020/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00100R\u0016\u0010.\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010'R\u0016\u0010,\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010'R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0019\u001a\u0002048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u00105R\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010!R\u0011\u00108\u001a\u00020/8G¢\u0006\u0006\u001a\u0004\b6\u00107"}, d2 = {"Landroidx/camera/viewfinder/core/ZoomGestureDetector;", "", "Landroid/content/Context;", "context", "", "spanSlop", "minSpan", "Landroidx/camera/viewfinder/core/ZoomGestureDetector$OnZoomGestureListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;IILandroidx/camera/viewfinder/core/ZoomGestureDetector$OnZoomGestureListener;)V", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "getHighResolutionOutputSizeshNQ4ISI", "()F", "getHighSpeedVideoFpsRangesFor", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "coroutineCreation", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "getValidOutputFormatsForInputhNQ4ISI", "getOutputStallDurationlomOqCM", "Landroidx/camera/viewfinder/core/ZoomGestureDetector$OnZoomGestureListener;", "getHighSpeedVideoFpsRanges", "getInputSizeshNQ4ISI", "getOutputMinFrameDurationlomOqCM", "getHighSpeedVideoSizesFor", "isQuickZoomEnabled", "Z", "()Z", "setQuickZoomEnabled", "(Z)V", "isStylusZoomEnabled", "setStylusZoomEnabled", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "isOutputSupportedForhNQ4ISI", "getOutputFormats", "getOutputMinFrameDuration", "getInputFormats", "unwrapAs", "getOutputSizeshNQ4ISI", "isOutputSupportedFor", "", "J", "getOutputSizes", "getOutputStallDuration", "toString", "Landroid/view/GestureDetector;", "Landroid/view/GestureDetector;", "getTimeDelta", "()J", "timeDelta", "Companion", "ZoomEvent", "OnZoomGestureListener"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ZoomGestureDetector {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private float isOutputSupportedFor;

    /* renamed from: coroutineCreation, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private float unwrapAs;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private float getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.content.Context Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int isOutputSupportedForhNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private boolean coroutineCreation;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private long getOutputSizes;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private float getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private float getInputFormats;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private int getHighSpeedVideoSizesFor;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private boolean getOutputStallDuration;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private float getOutputStallDurationlomOqCM;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private android.view.GestureDetector getValidOutputFormatsForInputhNQ4ISI;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final androidx.camera.viewfinder.core.ZoomGestureDetector.OnZoomGestureListener getHighSpeedVideoFpsRanges;

    /* renamed from: getValidOutputFormatsForInputhNQ4ISI, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: isOutputSupportedFor, reason: from kotlin metadata */
    private float getOutputMinFrameDurationlomOqCM;

    /* renamed from: isOutputSupportedForhNQ4ISI, reason: from kotlin metadata */
    private float getOutputFormats;
    private boolean isQuickZoomEnabled;
    private boolean isStylusZoomEnabled;
    private long toString;

    /* renamed from: unwrapAs, reason: from kotlin metadata */
    private float getOutputSizeshNQ4ISI;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/viewfinder/core/ZoomGestureDetector$OnZoomGestureListener;", "", "Landroidx/camera/viewfinder/core/ZoomGestureDetector$ZoomEvent;", "zoomEvent", "", "onZoomEvent", "(Landroidx/camera/viewfinder/core/ZoomGestureDetector$ZoomEvent;)Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnZoomGestureListener {
        boolean onZoomEvent(androidx.camera.viewfinder.core.ZoomGestureDetector.ZoomEvent zoomEvent);
    }

    public ZoomGestureDetector(android.content.Context context, int i, int i2, androidx.camera.viewfinder.core.ZoomGestureDetector.OnZoomGestureListener onZoomGestureListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onZoomGestureListener, "");
        this.Camera2StreamConfigurationMap = context;
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        this.getHighSpeedVideoFpsRanges = onZoomGestureListener;
        this.isQuickZoomEnabled = true;
        this.isStylusZoomEnabled = true;
        this.getValidOutputFormatsForInputhNQ4ISI = new android.view.GestureDetector(context, new android.view.GestureDetector.SimpleOnGestureListener() { // from class: androidx.camera.viewfinder.core.ZoomGestureDetector$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(android.view.MotionEvent e) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
                androidx.camera.viewfinder.core.ZoomGestureDetector.this.isOutputSupportedFor = e.getX();
                androidx.camera.viewfinder.core.ZoomGestureDetector.this.unwrapAs = e.getY();
                androidx.camera.viewfinder.core.ZoomGestureDetector.this.isOutputSupportedForhNQ4ISI = 1;
                return true;
            }
        });
    }

    public /* synthetic */ ZoomGestureDetector(android.content.Context context, int i, int i2, androidx.camera.viewfinder.core.ZoomGestureDetector.OnZoomGestureListener onZoomGestureListener, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? android.view.ViewConfiguration.get(context).getScaledTouchSlop() * 2 : i, (i3 & 4) != 0 ? 0 : i2, onZoomGestureListener);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b&\u0018\u00002\u00020\u0001:\u0003\u0013\u0014\u0015B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010"}, d2 = {"Landroidx/camera/viewfinder/core/ZoomGestureDetector$ZoomEvent;", "", "", "p0", "", "p1", "p2", "<init>", "(JII)V", "eventTime", "J", "getEventTime", "()J", "focusX", com.visa.cbp.getEncExpo.warmup, "getFocusX", "()I", "focusY", "getFocusY", "Begin", "Move", "End"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class ZoomEvent {
        private final long eventTime;
        private final int focusX;
        private final int focusY;

        private ZoomEvent(long j, int i, int i2) {
            this.eventTime = j;
            this.focusX = i;
            this.focusY = i2;
        }

        public final long getEventTime() {
            return this.eventTime;
        }

        public final int getFocusX() {
            return this.focusX;
        }

        public final int getFocusY() {
            return this.focusY;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/viewfinder/core/ZoomGestureDetector$ZoomEvent$Begin;", "Landroidx/camera/viewfinder/core/ZoomGestureDetector$ZoomEvent;", "", "eventTime", "", "focusX", "focusY", "<init>", "(JII)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Begin extends androidx.camera.viewfinder.core.ZoomGestureDetector.ZoomEvent {
            public Begin(long j, int i, int i2) {
                super(j, i, i2, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/camera/viewfinder/core/ZoomGestureDetector$ZoomEvent$Move;", "Landroidx/camera/viewfinder/core/ZoomGestureDetector$ZoomEvent;", "", "eventTime", "", "focusX", "focusY", "", "incrementalScaleFactor", "<init>", "(JIIF)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getIncrementalScaleFactor", "()F"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Move extends androidx.camera.viewfinder.core.ZoomGestureDetector.ZoomEvent {
            private final float incrementalScaleFactor;

            public Move(long j, int i, int i2, float f) {
                super(j, i, i2, null);
                this.incrementalScaleFactor = f;
            }

            public final float getIncrementalScaleFactor() {
                return this.incrementalScaleFactor;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/camera/viewfinder/core/ZoomGestureDetector$ZoomEvent$End;", "Landroidx/camera/viewfinder/core/ZoomGestureDetector$ZoomEvent;", "", "eventTime", "", "focusX", "focusY", "", "incrementalScaleFactor", "<init>", "(JIIF)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getIncrementalScaleFactor", "()F"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class End extends androidx.camera.viewfinder.core.ZoomGestureDetector.ZoomEvent {
            private final float incrementalScaleFactor;

            public End(long j, int i, int i2, float f) {
                super(j, i, i2, null);
                this.incrementalScaleFactor = f;
            }

            public final float getIncrementalScaleFactor() {
                return this.incrementalScaleFactor;
            }
        }

        public /* synthetic */ ZoomEvent(long j, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(j, i, i2);
        }
    }

    /* renamed from: isQuickZoomEnabled, reason: from getter */
    public final boolean getIsQuickZoomEnabled() {
        return this.isQuickZoomEnabled;
    }

    public final void setQuickZoomEnabled(boolean z) {
        this.isQuickZoomEnabled = z;
    }

    /* renamed from: isStylusZoomEnabled, reason: from getter */
    public final boolean getIsStylusZoomEnabled() {
        return this.isStylusZoomEnabled;
    }

    public final void setStylusZoomEnabled(boolean z) {
        this.isStylusZoomEnabled = z;
    }

    public final boolean onTouchEvent(android.view.MotionEvent event) {
        float f;
        float f2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getOutputSizes = event.getEventTime();
        int actionMasked = event.getActionMasked();
        if (this.isQuickZoomEnabled) {
            this.getValidOutputFormatsForInputhNQ4ISI.onTouchEvent(event);
        }
        int pointerCount = event.getPointerCount();
        boolean z = (event.getButtonState() & 32) != 0;
        int i = this.isOutputSupportedForhNQ4ISI;
        boolean z2 = i == 2 && !z;
        boolean z3 = actionMasked == 1 || actionMasked == 3 || z2;
        float f3 = 0.0f;
        if (actionMasked == 0 || z3) {
            if (this.getOutputStallDuration) {
                this.getHighSpeedVideoFpsRanges.onZoomEvent(new androidx.camera.viewfinder.core.ZoomGestureDetector.ZoomEvent.End(this.getOutputSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, getHighResolutionOutputSizeshNQ4ISI()));
                this.getOutputStallDuration = false;
                this.getOutputStallDurationlomOqCM = 0.0f;
                this.isOutputSupportedForhNQ4ISI = 0;
            } else if (i != 0 && z3) {
                this.getOutputStallDuration = false;
                this.getOutputStallDurationlomOqCM = 0.0f;
                this.isOutputSupportedForhNQ4ISI = 0;
            }
            if (z3) {
                return true;
            }
        }
        if (!this.getOutputStallDuration && this.isStylusZoomEnabled && this.isOutputSupportedForhNQ4ISI == 0 && !z3 && z) {
            this.isOutputSupportedFor = event.getX();
            this.unwrapAs = event.getY();
            this.isOutputSupportedForhNQ4ISI = 2;
            this.getOutputStallDurationlomOqCM = 0.0f;
        }
        boolean z4 = actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z2;
        boolean z5 = actionMasked == 6;
        int actionIndex = z5 ? event.getActionIndex() : -1;
        int i2 = z5 ? pointerCount - 1 : pointerCount;
        if (this.isOutputSupportedForhNQ4ISI != 0) {
            f2 = this.isOutputSupportedFor;
            f = this.unwrapAs;
            this.coroutineCreation = event.getY() < f;
        } else {
            float f4 = 0.0f;
            float f5 = 0.0f;
            for (int i3 = 0; i3 < pointerCount; i3++) {
                if (actionIndex != i3) {
                    f4 += event.getX(i3);
                    f5 += event.getY(i3);
                }
            }
            float f6 = i2;
            float f7 = f4 / f6;
            f = f5 / f6;
            f2 = f7;
        }
        float f8 = 0.0f;
        for (int i4 = 0; i4 < pointerCount; i4++) {
            if (actionIndex != i4) {
                f3 += java.lang.Math.abs(event.getX(i4) - f2);
                f8 += java.lang.Math.abs(event.getY(i4) - f);
            }
        }
        float f9 = i2;
        float f10 = (f3 / f9) * 2.0f;
        float f11 = (f8 / f9) * 2.0f;
        float hypot = this.isOutputSupportedForhNQ4ISI != 0 ? f11 : (float) java.lang.Math.hypot(f10, f11);
        boolean z6 = this.getOutputStallDuration;
        this.getHighSpeedVideoFpsRangesFor = kotlin.math.MathKt.roundToInt(f2);
        int roundToInt = kotlin.math.MathKt.roundToInt(f);
        this.getHighSpeedVideoSizesFor = roundToInt;
        if (this.isOutputSupportedForhNQ4ISI == 0 && this.getOutputStallDuration && (hypot < this.getHighResolutionOutputSizeshNQ4ISI || z4)) {
            this.getHighSpeedVideoFpsRanges.onZoomEvent(new androidx.camera.viewfinder.core.ZoomGestureDetector.ZoomEvent.End(this.getOutputSizes, this.getHighSpeedVideoFpsRangesFor, roundToInt, getHighResolutionOutputSizeshNQ4ISI()));
            this.getOutputStallDuration = false;
            this.getOutputStallDurationlomOqCM = hypot;
        }
        if (z4) {
            this.getOutputMinFrameDuration = f10;
            this.getOutputSizeshNQ4ISI = f10;
            this.getInputFormats = f11;
            this.getOutputMinFrameDurationlomOqCM = f11;
            this.getInputSizeshNQ4ISI = hypot;
            this.getOutputFormats = hypot;
            this.getOutputStallDurationlomOqCM = hypot;
        }
        int i5 = this.isOutputSupportedForhNQ4ISI != 0 ? this.getHighSpeedVideoSizes : this.getHighResolutionOutputSizeshNQ4ISI;
        if (!this.getOutputStallDuration && hypot >= i5 && (z6 || java.lang.Math.abs(hypot - this.getOutputStallDurationlomOqCM) > this.getHighSpeedVideoSizes)) {
            this.getOutputMinFrameDuration = f10;
            this.getOutputSizeshNQ4ISI = f10;
            this.getInputFormats = f11;
            this.getOutputMinFrameDurationlomOqCM = f11;
            this.getInputSizeshNQ4ISI = hypot;
            this.getOutputFormats = hypot;
            long j = this.getOutputSizes;
            this.toString = j;
            this.getOutputStallDuration = this.getHighSpeedVideoFpsRanges.onZoomEvent(new androidx.camera.viewfinder.core.ZoomGestureDetector.ZoomEvent.Begin(j, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor));
        }
        if (actionMasked == 2) {
            this.getOutputMinFrameDuration = f10;
            this.getInputFormats = f11;
            this.getInputSizeshNQ4ISI = hypot;
            if (!this.getOutputStallDuration || this.getHighSpeedVideoFpsRanges.onZoomEvent(new androidx.camera.viewfinder.core.ZoomGestureDetector.ZoomEvent.Move(this.getOutputSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, getHighResolutionOutputSizeshNQ4ISI()))) {
                this.getOutputSizeshNQ4ISI = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDurationlomOqCM = this.getInputFormats;
                this.getOutputFormats = this.getInputSizeshNQ4ISI;
                this.toString = this.getOutputSizes;
            }
        }
        return true;
    }

    public final long getTimeDelta() {
        return this.getOutputSizes - this.toString;
    }

    private final float getHighResolutionOutputSizeshNQ4ISI() {
        boolean z = true;
        if (this.isOutputSupportedForhNQ4ISI != 0) {
            boolean z2 = this.coroutineCreation;
            if ((!z2 || this.getInputSizeshNQ4ISI >= this.getOutputFormats) && (z2 || this.getInputSizeshNQ4ISI <= this.getOutputFormats)) {
                z = false;
            }
            float abs = java.lang.Math.abs(1.0f - (this.getInputSizeshNQ4ISI / this.getOutputFormats)) * 0.5f;
            if (this.getOutputFormats <= this.getHighSpeedVideoSizes) {
                return 1.0f;
            }
            return z ? abs + 1.0f : 1.0f - abs;
        }
        float f = this.getOutputFormats;
        if (f > 0.0f) {
            return this.getInputSizeshNQ4ISI / f;
        }
        return 1.0f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZoomGestureDetector(android.content.Context context, androidx.camera.viewfinder.core.ZoomGestureDetector.OnZoomGestureListener onZoomGestureListener) {
        this(context, 0, 0, onZoomGestureListener, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onZoomGestureListener, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZoomGestureDetector(android.content.Context context, int i, androidx.camera.viewfinder.core.ZoomGestureDetector.OnZoomGestureListener onZoomGestureListener) {
        this(context, i, 0, onZoomGestureListener, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onZoomGestureListener, "");
    }
}
