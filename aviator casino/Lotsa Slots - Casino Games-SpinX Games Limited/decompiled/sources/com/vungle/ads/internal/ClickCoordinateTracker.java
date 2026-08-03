package com.vungle.ads.internal;

/* compiled from: ClickCoordinateTracker.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0004\u001c\u001d\u001e\u001fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010¨\u0006 ²\u0006\n\u0010!\u001a\u00020\"X\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/ClickCoordinateTracker;", "", "context", "Landroid/content/Context;", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "(Landroid/content/Context;Lcom/vungle/ads/internal/model/AdPayload;)V", "currentClick", "Lcom/vungle/ads/internal/ClickCoordinateTracker$ClickCoordinate;", "getCurrentClick$vungle_ads_release$annotations", "()V", "getCurrentClick$vungle_ads_release", "()Lcom/vungle/ads/internal/ClickCoordinateTracker$ClickCoordinate;", "deviceHeight", "", "getDeviceHeight", "()I", "deviceWidth", "getDeviceWidth", "requestedHeight", "getRequestedHeight", "requestedWidth", "getRequestedWidth", "sendClickCoordinates", "", "trackCoordinate", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "ClickCoordinate", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "Coordinate", "DeviceScreenInfo", "vungle-ads_release", "tpatSender", "Lcom/vungle/ads/internal/network/TpatSender;"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class ClickCoordinateTracker {
    private static final java.lang.String TAG = "ClickCoordinateTracker";
    private final com.vungle.ads.internal.model.AdPayload advertisement;
    private final android.content.Context context;
    private final com.vungle.ads.internal.ClickCoordinateTracker.ClickCoordinate currentClick;
    private static final java.lang.String MACRO_REQ_WIDTH = java.util.regex.Pattern.quote("{{{req_width}}}");
    private static final java.lang.String MACRO_REQ_HEIGHT = java.util.regex.Pattern.quote("{{{req_height}}}");
    private static final java.lang.String MACRO_WIDTH = java.util.regex.Pattern.quote("{{{width}}}");
    private static final java.lang.String MACRO_HEIGHT = java.util.regex.Pattern.quote("{{{height}}}");
    private static final java.lang.String MACRO_DOWN_X = java.util.regex.Pattern.quote("{{{down_x}}}");
    private static final java.lang.String MACRO_DOWN_Y = java.util.regex.Pattern.quote("{{{down_y}}}");
    private static final java.lang.String MACRO_UP_X = java.util.regex.Pattern.quote("{{{up_x}}}");
    private static final java.lang.String MACRO_UP_Y = java.util.regex.Pattern.quote("{{{up_y}}}");

    public static /* synthetic */ void getCurrentClick$vungle_ads_release$annotations() {
    }

    public ClickCoordinateTracker(android.content.Context context, com.vungle.ads.internal.model.AdPayload advertisement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        this.context = context;
        this.advertisement = advertisement;
        this.currentClick = new com.vungle.ads.internal.ClickCoordinateTracker.ClickCoordinate(new com.vungle.ads.internal.ClickCoordinateTracker.Coordinate(Integer.MIN_VALUE, Integer.MIN_VALUE), new com.vungle.ads.internal.ClickCoordinateTracker.Coordinate(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    /* renamed from: getCurrentClick$vungle_ads_release, reason: from getter */
    public final com.vungle.ads.internal.ClickCoordinateTracker.ClickCoordinate getCurrentClick() {
        return this.currentClick;
    }

    public final void trackCoordinate(android.view.MotionEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        if (this.advertisement.isClickCoordinatesTrackingEnabled()) {
            int action = event.getAction();
            if (action == 0) {
                this.currentClick.setDownCoordinate(new com.vungle.ads.internal.ClickCoordinateTracker.Coordinate((int) event.getX(), (int) event.getY()));
            } else {
                if (action != 1) {
                    return;
                }
                this.currentClick.setUpCoordinate(new com.vungle.ads.internal.ClickCoordinateTracker.Coordinate((int) event.getX(), (int) event.getY()));
                if (this.currentClick.ready()) {
                    sendClickCoordinates();
                }
            }
        }
    }

    private final void sendClickCoordinates() {
        java.util.List<java.lang.String> tpatUrls$default = com.vungle.ads.internal.model.AdPayload.getTpatUrls$default(this.advertisement, com.vungle.ads.internal.Constants.TPAT_CLICK_COORDINATES, null, null, 6, null);
        java.util.List list = tpatUrls$default;
        if (list == null || list.isEmpty()) {
            new com.vungle.ads.TpatError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty urls for tpat: video.clickCoordinates").setLogEntry$vungle_ads_release(this.advertisement.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
            return;
        }
        int requestedWidth = getRequestedWidth();
        int requestedHeight = getRequestedHeight();
        int requestedWidth2 = getRequestedWidth();
        int requestedHeight2 = getRequestedHeight();
        com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
        final android.content.Context context = this.context;
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.network.TpatSender>() { // from class: com.vungle.ads.internal.ClickCoordinateTracker$sendClickCoordinates$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.TpatSender, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.network.TpatSender invoke() {
                return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.network.TpatSender.class);
            }
        });
        for (java.lang.String str : tpatUrls$default) {
            java.lang.String MACRO_REQ_WIDTH2 = MACRO_REQ_WIDTH;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(MACRO_REQ_WIDTH2, "MACRO_REQ_WIDTH");
            java.lang.String replace = new kotlin.text.Regex(MACRO_REQ_WIDTH2).replace(str, java.lang.String.valueOf(requestedWidth));
            java.lang.String MACRO_REQ_HEIGHT2 = MACRO_REQ_HEIGHT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(MACRO_REQ_HEIGHT2, "MACRO_REQ_HEIGHT");
            java.lang.String replace2 = new kotlin.text.Regex(MACRO_REQ_HEIGHT2).replace(replace, java.lang.String.valueOf(requestedHeight));
            java.lang.String MACRO_WIDTH2 = MACRO_WIDTH;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(MACRO_WIDTH2, "MACRO_WIDTH");
            java.lang.String replace3 = new kotlin.text.Regex(MACRO_WIDTH2).replace(replace2, java.lang.String.valueOf(requestedWidth2));
            java.lang.String MACRO_HEIGHT2 = MACRO_HEIGHT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(MACRO_HEIGHT2, "MACRO_HEIGHT");
            java.lang.String replace4 = new kotlin.text.Regex(MACRO_HEIGHT2).replace(replace3, java.lang.String.valueOf(requestedHeight2));
            java.lang.String MACRO_DOWN_X2 = MACRO_DOWN_X;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(MACRO_DOWN_X2, "MACRO_DOWN_X");
            java.lang.String replace5 = new kotlin.text.Regex(MACRO_DOWN_X2).replace(replace4, java.lang.String.valueOf(this.currentClick.getDownCoordinate().getX()));
            java.lang.String MACRO_DOWN_Y2 = MACRO_DOWN_Y;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(MACRO_DOWN_Y2, "MACRO_DOWN_Y");
            java.lang.String replace6 = new kotlin.text.Regex(MACRO_DOWN_Y2).replace(replace5, java.lang.String.valueOf(this.currentClick.getDownCoordinate().getY()));
            java.lang.String MACRO_UP_X2 = MACRO_UP_X;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(MACRO_UP_X2, "MACRO_UP_X");
            java.lang.String replace7 = new kotlin.text.Regex(MACRO_UP_X2).replace(replace6, java.lang.String.valueOf(this.currentClick.getUpCoordinate().getX()));
            java.lang.String MACRO_UP_Y2 = MACRO_UP_Y;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(MACRO_UP_Y2, "MACRO_UP_Y");
            com.vungle.ads.internal.network.TpatSender.sendTpat$default(m10405sendClickCoordinates$lambda0(lazy), new com.vungle.ads.internal.network.TpatRequest.Builder(new kotlin.text.Regex(MACRO_UP_Y2).replace(replace7, java.lang.String.valueOf(this.currentClick.getUpCoordinate().getY()))).tpatKey(com.vungle.ads.internal.Constants.COORDINATE).build(), false, 2, null);
        }
    }

    /* renamed from: sendClickCoordinates$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.network.TpatSender m10405sendClickCoordinates$lambda0(kotlin.Lazy<com.vungle.ads.internal.network.TpatSender> lazy) {
        return lazy.getValue();
    }

    /* compiled from: ClickCoordinateTracker.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/vungle/ads/internal/ClickCoordinateTracker$Coordinate;", "", "x", "", "y", "(II)V", "getX", "()I", "getY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Coordinate {
        private final int x;
        private final int y;

        public static /* synthetic */ com.vungle.ads.internal.ClickCoordinateTracker.Coordinate copy$default(com.vungle.ads.internal.ClickCoordinateTracker.Coordinate coordinate, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = coordinate.x;
            }
            if ((i3 & 2) != 0) {
                i2 = coordinate.y;
            }
            return coordinate.copy(i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getX() {
            return this.x;
        }

        /* renamed from: component2, reason: from getter */
        public final int getY() {
            return this.y;
        }

        public final com.vungle.ads.internal.ClickCoordinateTracker.Coordinate copy(int x, int y) {
            return new com.vungle.ads.internal.ClickCoordinateTracker.Coordinate(x, y);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.vungle.ads.internal.ClickCoordinateTracker.Coordinate)) {
                return false;
            }
            com.vungle.ads.internal.ClickCoordinateTracker.Coordinate coordinate = (com.vungle.ads.internal.ClickCoordinateTracker.Coordinate) other;
            return this.x == coordinate.x && this.y == coordinate.y;
        }

        public int hashCode() {
            return (this.x * 31) + this.y;
        }

        public java.lang.String toString() {
            return "Coordinate(x=" + this.x + ", y=" + this.y + ')';
        }

        public Coordinate(int i, int i2) {
            this.x = i;
            this.y = i2;
        }

        public final int getX() {
            return this.x;
        }

        public final int getY() {
            return this.y;
        }
    }

    /* compiled from: ClickCoordinateTracker.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0006\u0010\u0014\u001a\u00020\u0010J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/vungle/ads/internal/ClickCoordinateTracker$ClickCoordinate;", "", "downCoordinate", "Lcom/vungle/ads/internal/ClickCoordinateTracker$Coordinate;", "upCoordinate", "(Lcom/vungle/ads/internal/ClickCoordinateTracker$Coordinate;Lcom/vungle/ads/internal/ClickCoordinateTracker$Coordinate;)V", "getDownCoordinate", "()Lcom/vungle/ads/internal/ClickCoordinateTracker$Coordinate;", "setDownCoordinate", "(Lcom/vungle/ads/internal/ClickCoordinateTracker$Coordinate;)V", "getUpCoordinate", "setUpCoordinate", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", com.ironsource.X3.i.s, "toString", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class ClickCoordinate {
        private com.vungle.ads.internal.ClickCoordinateTracker.Coordinate downCoordinate;
        private com.vungle.ads.internal.ClickCoordinateTracker.Coordinate upCoordinate;

        public static /* synthetic */ com.vungle.ads.internal.ClickCoordinateTracker.ClickCoordinate copy$default(com.vungle.ads.internal.ClickCoordinateTracker.ClickCoordinate clickCoordinate, com.vungle.ads.internal.ClickCoordinateTracker.Coordinate coordinate, com.vungle.ads.internal.ClickCoordinateTracker.Coordinate coordinate2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                coordinate = clickCoordinate.downCoordinate;
            }
            if ((i & 2) != 0) {
                coordinate2 = clickCoordinate.upCoordinate;
            }
            return clickCoordinate.copy(coordinate, coordinate2);
        }

        /* renamed from: component1, reason: from getter */
        public final com.vungle.ads.internal.ClickCoordinateTracker.Coordinate getDownCoordinate() {
            return this.downCoordinate;
        }

        /* renamed from: component2, reason: from getter */
        public final com.vungle.ads.internal.ClickCoordinateTracker.Coordinate getUpCoordinate() {
            return this.upCoordinate;
        }

        public final com.vungle.ads.internal.ClickCoordinateTracker.ClickCoordinate copy(com.vungle.ads.internal.ClickCoordinateTracker.Coordinate downCoordinate, com.vungle.ads.internal.ClickCoordinateTracker.Coordinate upCoordinate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downCoordinate, "downCoordinate");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(upCoordinate, "upCoordinate");
            return new com.vungle.ads.internal.ClickCoordinateTracker.ClickCoordinate(downCoordinate, upCoordinate);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.vungle.ads.internal.ClickCoordinateTracker.ClickCoordinate)) {
                return false;
            }
            com.vungle.ads.internal.ClickCoordinateTracker.ClickCoordinate clickCoordinate = (com.vungle.ads.internal.ClickCoordinateTracker.ClickCoordinate) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.downCoordinate, clickCoordinate.downCoordinate) && kotlin.jvm.internal.Intrinsics.areEqual(this.upCoordinate, clickCoordinate.upCoordinate);
        }

        public int hashCode() {
            return (this.downCoordinate.hashCode() * 31) + this.upCoordinate.hashCode();
        }

        public java.lang.String toString() {
            return "ClickCoordinate(downCoordinate=" + this.downCoordinate + ", upCoordinate=" + this.upCoordinate + ')';
        }

        public ClickCoordinate(com.vungle.ads.internal.ClickCoordinateTracker.Coordinate downCoordinate, com.vungle.ads.internal.ClickCoordinateTracker.Coordinate upCoordinate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downCoordinate, "downCoordinate");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(upCoordinate, "upCoordinate");
            this.downCoordinate = downCoordinate;
            this.upCoordinate = upCoordinate;
        }

        public final com.vungle.ads.internal.ClickCoordinateTracker.Coordinate getDownCoordinate() {
            return this.downCoordinate;
        }

        public final void setDownCoordinate(com.vungle.ads.internal.ClickCoordinateTracker.Coordinate coordinate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coordinate, "<set-?>");
            this.downCoordinate = coordinate;
        }

        public final com.vungle.ads.internal.ClickCoordinateTracker.Coordinate getUpCoordinate() {
            return this.upCoordinate;
        }

        public final void setUpCoordinate(com.vungle.ads.internal.ClickCoordinateTracker.Coordinate coordinate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coordinate, "<set-?>");
            this.upCoordinate = coordinate;
        }

        public final boolean ready() {
            return (this.downCoordinate.getX() == Integer.MIN_VALUE || this.downCoordinate.getY() == Integer.MIN_VALUE || this.upCoordinate.getX() == Integer.MIN_VALUE || this.upCoordinate.getY() == Integer.MIN_VALUE) ? false : true;
        }
    }

    private final int getRequestedWidth() {
        int adWidth = this.advertisement.adWidth();
        if (adWidth == 0) {
            return getDeviceWidth();
        }
        return com.vungle.ads.internal.util.ViewUtility.INSTANCE.dpToPixels(this.context, adWidth);
    }

    private final int getRequestedHeight() {
        int adHeight = this.advertisement.adHeight();
        if (adHeight == 0) {
            return getDeviceHeight();
        }
        return com.vungle.ads.internal.util.ViewUtility.INSTANCE.dpToPixels(this.context, adHeight);
    }

    private final int getDeviceWidth() {
        return new com.vungle.ads.internal.ClickCoordinateTracker.DeviceScreenInfo(this.context).getDeviceWidth();
    }

    private final int getDeviceHeight() {
        return new com.vungle.ads.internal.ClickCoordinateTracker.DeviceScreenInfo(this.context).getDeviceHeight();
    }

    /* compiled from: ClickCoordinateTracker.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\bHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/vungle/ads/internal/ClickCoordinateTracker$DeviceScreenInfo;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "deviceHeight", "", "getDeviceHeight", "()I", "deviceWidth", "getDeviceWidth", "dm", "Landroid/util/DisplayMetrics;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class DeviceScreenInfo {
        private final android.content.Context context;
        private final android.util.DisplayMetrics dm;

        public static /* synthetic */ com.vungle.ads.internal.ClickCoordinateTracker.DeviceScreenInfo copy$default(com.vungle.ads.internal.ClickCoordinateTracker.DeviceScreenInfo deviceScreenInfo, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = deviceScreenInfo.context;
            }
            return deviceScreenInfo.copy(context);
        }

        /* renamed from: component1, reason: from getter */
        public final android.content.Context getContext() {
            return this.context;
        }

        public final com.vungle.ads.internal.ClickCoordinateTracker.DeviceScreenInfo copy(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            return new com.vungle.ads.internal.ClickCoordinateTracker.DeviceScreenInfo(context);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.vungle.ads.internal.ClickCoordinateTracker.DeviceScreenInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.context, ((com.vungle.ads.internal.ClickCoordinateTracker.DeviceScreenInfo) other).context);
        }

        public int hashCode() {
            return this.context.hashCode();
        }

        public java.lang.String toString() {
            return "DeviceScreenInfo(context=" + this.context + ')';
        }

        public DeviceScreenInfo(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            this.dm = displayMetrics;
            java.lang.Object systemService = context.getSystemService("window");
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            ((android.view.WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        }

        public final android.content.Context getContext() {
            return this.context;
        }

        public final int getDeviceWidth() {
            return this.dm.widthPixels;
        }

        public final int getDeviceHeight() {
            return this.dm.heightPixels;
        }
    }
}
