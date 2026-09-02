package com.goldenboot.saga.zone;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000 12\u00020\u0001:\u000223B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010/¨\u00064"}, d2 = {"Lcom/goldenboot/saga/zone/ReceiverThrottle;", "Lcom/goldenboot/saga/zone/LayerBenchmark;", "Landroid/view/ViewGroup;", "ownerView", "<init>", "(Landroid/view/ViewGroup;)V", "Lcom/goldenboot/saga/zone/DpadBuilder;", "applyTask", "()V", "Landroid/content/Context;", "context", "connectJob", "(Landroid/content/Context;)V", "peekRevision", "Lcom/goldenboot/saga/zone/SectionSensor;", "drawField", "(Landroid/view/ViewGroup;)Lcom/goldenboot/saga/zone/SectionSensor;", "Landroid/view/View;", "view", "", "popBlueprint", "(Landroid/view/View;)J", "Lcom/goldenboot/saga/zone/BottomBarEvaluator;", "injectMetric", "()Lcom/goldenboot/saga/zone/BottomBarEvaluator;", "layer", "evictLayout", "(Lcom/goldenboot/saga/zone/BottomBarEvaluator;)V", "Landroid/view/ViewGroup;", "", "growPayload", "Ljava/lang/Object;", "lock", "Lcom/goldenboot/saga/zone/SectionSensor;", "viewLayerContainer", "", "detachStream", "Z", "componentCallbackRegistered", "Lcom/goldenboot/saga/zone/RegionBridge;", "releaseHeader", "Lcom/goldenboot/saga/zone/RegionBridge;", "shadowCache", "Landroid/content/ComponentCallbacks2;", "clipOrigin", "Landroid/content/ComponentCallbacks2;", "componentCallback", "()Lcom/goldenboot/saga/zone/RegionBridge;", "shadowContext", "flushSample", "FeedbackFlow", "LayerUseCase", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class ReceiverThrottle implements LayerBenchmark {

    /* renamed from: flushSample, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean updateTimer = true;

    /* renamed from: detachStream, reason: from kotlin metadata */
    private boolean componentCallbackRegistered;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final ViewGroup ownerView;

    /* renamed from: injectMetric, reason: from kotlin metadata */
    private SectionSensor viewLayerContainer;

    /* renamed from: releaseHeader, reason: from kotlin metadata */
    private RegionBridge shadowCache;

    /* renamed from: growPayload, reason: from kotlin metadata */
    private final Object lock = new Object();

    /* renamed from: clipOrigin, reason: from kotlin metadata */
    private final ComponentCallbacks2 componentCallback = new ActivityMutator();

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/goldenboot/saga/zone/ReceiverThrottle$BounceHandler", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Lcom/goldenboot/saga/zone/DpadBuilder;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BounceHandler implements View.OnAttachStateChangeListener {
        public BounceHandler() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
            ReceiverThrottle.this.connectJob(v.getContext());
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            ReceiverThrottle.this.peekRevision(v.getContext());
            ReceiverThrottle.this.applyTask();
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/goldenboot/saga/zone/ReceiverThrottle$FeedbackFlow;", "", "<init>", "()V", "", "isRenderNodeCompatible", "Z", "evictLayout", "()Z", "growPayload", "(Z)V", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.ReceiverThrottle$FeedbackFlow, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean evictLayout() {
            return ReceiverThrottle.updateTimer;
        }

        public final void growPayload(boolean z) {
            ReceiverThrottle.updateTimer = z;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/goldenboot/saga/zone/ReceiverThrottle$LayerUseCase;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "evictLayout", "(Landroid/view/View;)J", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LayerUseCase {
        public static final LayerUseCase evictLayout = new LayerUseCase();

        private LayerUseCase() {
        }

        public static final long evictLayout(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public ReceiverThrottle(ViewGroup viewGroup) {
        this.ownerView = viewGroup;
        if (viewGroup.isAttachedToWindow()) {
            connectJob(viewGroup.getContext());
        }
        viewGroup.addOnAttachStateChangeListener(new BounceHandler());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTask() {
        RegionBridge regionBridge = this.shadowCache;
        if (regionBridge != null) {
            regionBridge.growPayload();
        }
        this.shadowCache = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void connectJob(Context context) {
        if (this.componentCallbackRegistered) {
            return;
        }
        context.getApplicationContext().registerComponentCallbacks(this.componentCallback);
        this.componentCallbackRegistered = true;
    }

    private final SectionSensor drawField(ViewGroup ownerView) {
        SectionSensor sectionSensor = this.viewLayerContainer;
        if (sectionSensor != null) {
            return sectionSensor;
        }
        LayerWriter layerWriter = new LayerWriter(ownerView.getContext());
        ownerView.addView(layerWriter);
        this.viewLayerContainer = layerWriter;
        return layerWriter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void peekRevision(Context context) {
        if (this.componentCallbackRegistered) {
            context.getApplicationContext().unregisterComponentCallbacks(this.componentCallback);
            this.componentCallbackRegistered = false;
        }
    }

    private final long popBlueprint(View view) {
        return LayerUseCase.evictLayout(view);
    }

    @Override // com.goldenboot.saga.zone.LayerBenchmark
    public void evictLayout(BottomBarEvaluator layer) {
        synchronized (this.lock) {
            layer.connectComponent();
            DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
        }
    }

    @Override // com.goldenboot.saga.zone.LayerBenchmark
    public RegionBridge growPayload() {
        RegionBridge regionBridge = this.shadowCache;
        if (regionBridge != null) {
            return regionBridge;
        }
        RegionBridge evictLayout = StartupBridge.evictLayout();
        this.shadowCache = evictLayout;
        return evictLayout;
    }

    @Override // com.goldenboot.saga.zone.LayerBenchmark
    public BottomBarEvaluator injectMetric() {
        BottomBarEvaluator bottomBarEvaluator;
        synchronized (this.lock) {
            bottomBarEvaluator = new BottomBarEvaluator(new SwipeFlow(popBlueprint(this.ownerView), null, null, 6, null));
        }
        return bottomBarEvaluator;
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/goldenboot/saga/zone/ReceiverThrottle$ActivityMutator", "Landroid/content/ComponentCallbacks2;", "Landroid/content/res/Configuration;", "newConfig", "Lcom/goldenboot/saga/zone/DpadBuilder;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "", "level", "onTrimMemory", "(I)V", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActivityMutator implements ComponentCallbacks2 {
        public ActivityMutator() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int level) {
            if (level >= 40) {
                ReceiverThrottle.this.applyTask();
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration newConfig) {
        }
    }
}
