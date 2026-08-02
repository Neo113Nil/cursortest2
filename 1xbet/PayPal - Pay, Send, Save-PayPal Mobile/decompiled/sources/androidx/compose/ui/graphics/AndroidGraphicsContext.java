package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 '2\u00020\u0001:\u0002'(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\n\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\n\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0014\u0010\u0013\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\n\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010!R\u0014\u0010\u001c\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010&\u001a\u00020 8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%"}, d2 = {"Landroidx/compose/ui/graphics/AndroidGraphicsContext;", "Landroidx/compose/ui/graphics/GraphicsContext;", "Landroid/view/ViewGroup;", "p0", "<init>", "(Landroid/view/ViewGroup;)V", "", "getHighSpeedVideoFpsRanges", "()V", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "(Landroid/content/Context;)V", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "createGraphicsLayer", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "releaseGraphicsLayer", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "getHighSpeedVideoSizes", "(Landroid/view/ViewGroup;)Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "Landroid/view/View;", "", "(Landroid/view/View;)J", "Landroid/view/ViewGroup;", "getHighResolutionOutputSizeshNQ4ISI", "", "Ljava/lang/Object;", "getOutputMinFrameDuration", "Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "", "Z", "Landroidx/compose/ui/graphics/shadow/ShadowContext;", "Landroidx/compose/ui/graphics/shadow/ShadowContext;", "Landroid/content/ComponentCallbacks2;", "Landroid/content/ComponentCallbacks2;", "getShadowContext", "()Landroidx/compose/ui/graphics/shadow/ShadowContext;", "getOutputFormats", "Companion", "UniqueDrawingIdApi29"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AndroidGraphicsContext implements androidx.compose.ui.graphics.GraphicsContext {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.AndroidGraphicsContext.Companion INSTANCE = new androidx.compose.ui.graphics.AndroidGraphicsContext.Companion(null);
    private static boolean isRenderNodeCompatible = true;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.shadow.ShadowContext getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.view.ViewGroup getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.layer.view.DrawChildContainer getHighSpeedVideoFpsRangesFor;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoSizes = new java.lang.Object();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.ComponentCallbacks2 getOutputMinFrameDuration = new android.content.ComponentCallbacks2() { // from class: androidx.compose.ui.graphics.AndroidGraphicsContext.1
        @Override // android.content.ComponentCallbacks
        public final void onConfigurationChanged(android.content.res.Configuration newConfig) {
        }

        @Override // android.content.ComponentCallbacks
        public final void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public final void onTrimMemory(int level) {
            if (level >= 40) {
                androidx.compose.ui.graphics.AndroidGraphicsContext.this.getHighSpeedVideoFpsRanges();
            }
        }
    };

    public AndroidGraphicsContext(android.view.ViewGroup viewGroup) {
        this.getHighResolutionOutputSizeshNQ4ISI = viewGroup;
        if (viewGroup.isAttachedToWindow()) {
            Camera2StreamConfigurationMap(viewGroup.getContext());
        }
        viewGroup.addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.graphics.AndroidGraphicsContext.2
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(android.view.View v) {
                androidx.compose.ui.graphics.AndroidGraphicsContext.this.Camera2StreamConfigurationMap(v.getContext());
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(android.view.View v) {
                androidx.compose.ui.graphics.AndroidGraphicsContext.this.getHighSpeedVideoFpsRangesFor(v.getContext());
                androidx.compose.ui.graphics.AndroidGraphicsContext.this.getHighSpeedVideoFpsRanges();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRanges() {
        androidx.compose.ui.graphics.shadow.ShadowContext shadowContext = this.getHighSpeedVideoFpsRanges;
        if (shadowContext != null) {
            shadowContext.clearCache();
        }
        this.getHighSpeedVideoFpsRanges = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Camera2StreamConfigurationMap(android.content.Context p0) {
        if (this.Camera2StreamConfigurationMap) {
            return;
        }
        p0.getApplicationContext().registerComponentCallbacks(this.getOutputMinFrameDuration);
        this.Camera2StreamConfigurationMap = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRangesFor(android.content.Context p0) {
        if (this.Camera2StreamConfigurationMap) {
            p0.getApplicationContext().unregisterComponentCallbacks(this.getOutputMinFrameDuration);
            this.Camera2StreamConfigurationMap = false;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public final androidx.compose.ui.graphics.layer.GraphicsLayer createGraphicsLayer() {
        androidx.compose.ui.graphics.layer.GraphicsViewLayer graphicsViewLayer;
        androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer;
        synchronized (this.getHighSpeedVideoSizes) {
            long Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI);
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                graphicsViewLayer = new androidx.compose.ui.graphics.layer.GraphicsLayerV29(Camera2StreamConfigurationMap, null, null, 6, null);
            } else if (isRenderNodeCompatible) {
                try {
                    graphicsViewLayer = new androidx.compose.ui.graphics.layer.GraphicsLayerV23(this.getHighResolutionOutputSizeshNQ4ISI, Camera2StreamConfigurationMap, null, null, 12, null);
                } catch (java.lang.Throwable unused) {
                    isRenderNodeCompatible = false;
                    graphicsViewLayer = new androidx.compose.ui.graphics.layer.GraphicsViewLayer(getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI), Camera2StreamConfigurationMap, null, null, 12, null);
                }
            } else {
                graphicsViewLayer = new androidx.compose.ui.graphics.layer.GraphicsViewLayer(getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI), Camera2StreamConfigurationMap, null, null, 12, null);
            }
            graphicsLayer = new androidx.compose.ui.graphics.layer.GraphicsLayer(graphicsViewLayer);
        }
        return graphicsLayer;
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public final androidx.compose.ui.graphics.shadow.ShadowContext getShadowContext() {
        androidx.compose.ui.graphics.shadow.ShadowContext shadowContext = this.getHighSpeedVideoFpsRanges;
        if (shadowContext != null) {
            return shadowContext;
        }
        androidx.compose.ui.graphics.shadow.ShadowContext ShadowContext = androidx.compose.ui.graphics.shadow.AndroidShadowContext_androidKt.ShadowContext();
        this.getHighSpeedVideoFpsRanges = ShadowContext;
        return ShadowContext;
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public final void releaseGraphicsLayer(androidx.compose.ui.graphics.layer.GraphicsLayer p0) {
        synchronized (this.getHighSpeedVideoSizes) {
            p0.release$ui_graphics();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    private final androidx.compose.ui.graphics.layer.view.DrawChildContainer getHighSpeedVideoSizes(android.view.ViewGroup p0) {
        androidx.compose.ui.graphics.layer.view.DrawChildContainer drawChildContainer = this.getHighSpeedVideoFpsRangesFor;
        if (drawChildContainer != null) {
            return drawChildContainer;
        }
        androidx.compose.ui.graphics.layer.view.ViewLayerContainer viewLayerContainer = new androidx.compose.ui.graphics.layer.view.ViewLayerContainer(p0.getContext());
        p0.addView(viewLayerContainer);
        this.getHighSpeedVideoFpsRangesFor = viewLayerContainer;
        return viewLayerContainer;
    }

    private static long Camera2StreamConfigurationMap(android.view.View p0) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.compose.ui.graphics.AndroidGraphicsContext.UniqueDrawingIdApi29.getHighSpeedVideoFpsRanges(p0);
        }
        return -1L;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/graphics/AndroidGraphicsContext$Companion;", "", "<init>", "()V", "", "isRenderNodeCompatible", "Z", "()Z", "setRenderNodeCompatible", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean isRenderNodeCompatible() {
            return androidx.compose.ui.graphics.AndroidGraphicsContext.isRenderNodeCompatible;
        }

        public final void setRenderNodeCompatible(boolean z) {
            androidx.compose.ui.graphics.AndroidGraphicsContext.isRenderNodeCompatible = z;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/AndroidGraphicsContext$UniqueDrawingIdApi29;", "", "<init>", "()V", "Landroid/view/View;", "p0", "", "getHighSpeedVideoFpsRanges", "(Landroid/view/View;)J"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class UniqueDrawingIdApi29 {
        public static final androidx.compose.ui.graphics.AndroidGraphicsContext.UniqueDrawingIdApi29 INSTANCE = new androidx.compose.ui.graphics.AndroidGraphicsContext.UniqueDrawingIdApi29();

        private UniqueDrawingIdApi29() {
        }

        @kotlin.jvm.JvmStatic
        public static final long getHighSpeedVideoFpsRanges(android.view.View p0) {
            return p0.getUniqueDrawingId();
        }
    }
}
