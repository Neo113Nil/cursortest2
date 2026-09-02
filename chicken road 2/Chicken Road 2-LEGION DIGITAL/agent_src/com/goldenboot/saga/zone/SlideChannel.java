package com.goldenboot.saga.zone;

import androidx.compose.ui.layout.GradientActivator;
import com.goldenboot.saga.zone.ContentRepository;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u0000 \u0089\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u008a\u0001\u008b\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010 \u001a\u00020\n2\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001e0\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$J\u0018\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0086\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020'2\u0006\u0010&\u001a\u00020%H&¢\u0006\u0004\b*\u0010)J\u000f\u0010+\u001a\u00020\nH ¢\u0006\u0004\b+\u0010\u0005J\u0013\u0010-\u001a\u00020\n*\u00020,H\u0004¢\u0006\u0004\b-\u0010.J\u001d\u00101\u001a\u00020/2\u0006\u0010\t\u001a\u00020\b2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b3\u00104J]\u0010?\u001a\u00020>2\u0006\u00105\u001a\u00020'2\u0006\u00106\u001a\u00020'2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020'072\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\n\u0018\u0001092\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\n09H\u0016¢\u0006\u0004\b?\u0010@J\u0019\u0010B\u001a\u00020\n2\b\u0010A\u001a\u0004\u0018\u00010>H\u0000¢\u0006\u0004\bB\u0010CJ\u001d\u0010E\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010D\u001a\u00020/¢\u0006\u0004\bE\u0010FJ\u001d\u0010G\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010D\u001a\u00020/¢\u0006\u0004\bG\u0010FR\u001c\u0010K\u001a\b\u0018\u00010HR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR$\u0010N\u001a\u0010\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\n\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010Q\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\"\u0010W\u001a\u00020\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010$R\"\u0010[\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010S\u001a\u0004\bY\u0010U\"\u0004\bZ\u0010$R\"\u0010_\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\\\u0010S\u001a\u0004\b]\u0010U\"\u0004\b^\u0010$R\u0017\u0010d\u001a\u00020<8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u0018\u0010h\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR0\u0010l\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001e0\u001d\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010o\u001a\u00060HR\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0014\u0010r\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0016\u0010u\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0016\u0010w\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\bv\u0010tR\u0014\u0010y\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\bx\u0010UR\u0014\u0010\u0007\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0014\u0010\u007f\u001a\u00020|8&X¦\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0017\u0010\u0082\u0001\u001a\u00020>8 X \u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0083\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0016\u0010\u0088\u0001\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010U¨\u0006\u008c\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/SlideChannel;", "Landroidx/compose/ui/layout/GradientActivator;", "Lcom/goldenboot/saga/zone/HoverMutex;", "Lcom/goldenboot/saga/zone/ShadowBuilder;", "<init>", "()V", "Lcom/goldenboot/saga/zone/ContentRepository;", "layoutNode", "Landroidx/compose/ui/layout/GlowCache;", "ruler", "Lcom/goldenboot/saga/zone/DpadBuilder;", "offerToken", "(Lcom/goldenboot/saga/zone/ContentRepository;Landroidx/compose/ui/layout/GlowCache;)V", "drainCache", "(Landroidx/compose/ui/layout/GlowCache;)Lcom/goldenboot/saga/zone/SlideChannel;", "ancestor", "", "growPool", "(Lcom/goldenboot/saga/zone/ContentRepository;Lcom/goldenboot/saga/zone/ContentRepository;)Z", "Lcom/goldenboot/saga/zone/GradientLoader;", "placeableResult", "Lcom/goldenboot/saga/zone/FontReporter;", "positionOnScreen", "Lcom/goldenboot/saga/zone/ScaleSaver;", "size", "saveHash", "(Lcom/goldenboot/saga/zone/GradientLoader;JJ)V", "stopLocale", "(Lcom/goldenboot/saga/zone/GradientLoader;)V", "Lcom/goldenboot/saga/zone/CustomStore;", "Lcom/goldenboot/saga/zone/GlobalTask;", "layoutNodes", "broadcastModule", "(Lcom/goldenboot/saga/zone/CustomStore;)V", "newMFR", "writeRequest", "(Z)V", "Lcom/goldenboot/saga/zone/BottomBarActivator;", "alignmentLine", "", "storeCharset", "(Lcom/goldenboot/saga/zone/BottomBarActivator;)I", "disconnectSession", "savePool", "Lcom/goldenboot/saga/zone/BridgeSerializer;", "processFormat", "(Lcom/goldenboot/saga/zone/BridgeSerializer;)V", "", "defaultValue", "resetTask", "(Landroidx/compose/ui/layout/GlowCache;F)F", "trimOrigin", "(Landroidx/compose/ui/layout/GlowCache;)V", "width", "height", "", "alignmentLines", "Lkotlin/Function1;", "Lcom/goldenboot/saga/zone/BoxStage;", "rulers", "Landroidx/compose/ui/layout/GradientActivator$ActivityMutator;", "placementBlock", "Lcom/goldenboot/saga/zone/ContentConfigurator;", "cacheStack", "(IILjava/util/Map;Lcom/goldenboot/saga/zone/TouchRecord;Lcom/goldenboot/saga/zone/TouchRecord;)Lcom/goldenboot/saga/zone/ContentConfigurator;", "result", "resumeRecord", "(Lcom/goldenboot/saga/zone/ContentConfigurator;)V", "value", "popIndex", "(Landroidx/compose/ui/layout/GlowCache;F)V", "dispatchEvent", "Lcom/goldenboot/saga/zone/SlideChannel$FeedbackFlow;", "purgeNode", "Lcom/goldenboot/saga/zone/SlideChannel$FeedbackFlow;", "_rulerScope", "drawRequest", "Lcom/goldenboot/saga/zone/TouchRecord;", "rulersLambda", "gatherAdapter", "Lcom/goldenboot/saga/zone/GradientLoader;", "cachedRulerPlaceableResult", "decodePath", "Z", "drawConfig", "()Z", "encodeManifest", "isPlacedUnderMotionFrameOfReference", "drawScope", "detachModel", "renderPattern", "isShallowPlacing", "expandArgs", "loadSettings", "emitCharset", "isPlacingForAlignment", "findTask", "Landroidx/compose/ui/layout/GradientActivator$ActivityMutator;", "peekField", "()Landroidx/compose/ui/layout/GradientActivator$ActivityMutator;", "placementScope", "Lcom/goldenboot/saga/zone/LifecycleMutex;", "mergeLocale", "Lcom/goldenboot/saga/zone/LifecycleMutex;", "rulerValues", "Lcom/goldenboot/saga/zone/ParallelHeap;", "syncScope", "Lcom/goldenboot/saga/zone/ParallelHeap;", "rulerReaders", "fetchOptions", "()Lcom/goldenboot/saga/zone/SlideChannel$FeedbackFlow;", "rulerScope", "attachNode", "()J", "position", "insertLocale", "()Lcom/goldenboot/saga/zone/SlideChannel;", "child", "measureTimezone", "parent", "confirmSignature", "hasMeasureResult", "broadcastPayload", "()Lcom/goldenboot/saga/zone/ContentRepository;", "Lcom/goldenboot/saga/zone/PagerReducer;", "dispatchTimezone", "()Lcom/goldenboot/saga/zone/PagerReducer;", "coordinates", "resolveParams", "()Lcom/goldenboot/saga/zone/ContentConfigurator;", "measureResult", "Lcom/goldenboot/saga/zone/AbstractSlot;", "scheduleTemplate", "()Lcom/goldenboot/saga/zone/AbstractSlot;", "alignmentLinesOwner", "saveBlueprint", "isLookingAhead", "flattenPackage", "FeedbackFlow", "BounceHandler", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class SlideChannel extends androidx.compose.ui.layout.GradientActivator implements HoverMutex, ShadowBuilder {
    public static final int injectConstraint = 0;

    /* renamed from: decodePath, reason: from kotlin metadata */
    private boolean isPlacedUnderMotionFrameOfReference;

    /* renamed from: drawRequest, reason: from kotlin metadata */
    private TouchRecord rulersLambda;

    /* renamed from: drawScope, reason: from kotlin metadata */
    private boolean isShallowPlacing;

    /* renamed from: expandArgs, reason: from kotlin metadata */
    private boolean isPlacingForAlignment;

    /* renamed from: findTask, reason: from kotlin metadata */
    private final GradientActivator.ActivityMutator placementScope = androidx.compose.ui.layout.LongPressPipe.evictLayout(this);

    /* renamed from: gatherAdapter, reason: from kotlin metadata */
    private GradientLoader cachedRulerPlaceableResult;

    /* renamed from: mergeLocale, reason: from kotlin metadata */
    private LifecycleMutex rulerValues;

    /* renamed from: purgeNode, reason: from kotlin metadata */
    private FeedbackFlow _rulerScope;

    /* renamed from: syncScope, reason: from kotlin metadata */
    private ParallelHeap rulerReaders;
    private static final TouchRecord storeCharset = ActivityMutator.reduceScope;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/goldenboot/saga/zone/GradientLoader;", "result", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(Lcom/goldenboot/saga/zone/GradientLoader;)V"}, k = 3, mv = {2, 0, 0})
    public static final class ActivityMutator extends Lambda implements TouchRecord {
        public static final ActivityMutator reduceScope = new ActivityMutator();

        public ActivityMutator() {
            super(1);
        }

        public final void evictLayout(GradientLoader gradientLoader) {
            if (gradientLoader.connectPool()) {
                gradientLoader.getPlaceable().stopLocale(gradientLoader);
            }
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            evictLayout((GradientLoader) obj);
            return DpadBuilder.evictLayout;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/goldenboot/saga/zone/SlideChannel$EndpointList", "Lcom/goldenboot/saga/zone/ContentConfigurator;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "popBlueprint", "()V", "", "getWidth", "()I", "width", "getHeight", "height", "", "Lcom/goldenboot/saga/zone/BottomBarActivator;", "injectConstraint", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Lcom/goldenboot/saga/zone/BoxStage;", "drawField", "()Lcom/goldenboot/saga/zone/TouchRecord;", "rulers", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EndpointList implements ContentConfigurator {
        final /* synthetic */ SlideChannel clipOrigin;
        final /* synthetic */ TouchRecord detachStream;
        final /* synthetic */ int evictLayout;
        final /* synthetic */ int growPayload;
        final /* synthetic */ Map<BottomBarActivator, Integer> injectMetric;
        final /* synthetic */ TouchRecord releaseHeader;

        public EndpointList(int i, int i2, Map<BottomBarActivator, Integer> map, TouchRecord touchRecord, TouchRecord touchRecord2, SlideChannel slideChannel) {
            this.evictLayout = i;
            this.growPayload = i2;
            this.injectMetric = map;
            this.detachStream = touchRecord;
            this.releaseHeader = touchRecord2;
            this.clipOrigin = slideChannel;
        }

        @Override // com.goldenboot.saga.zone.ContentConfigurator
        /* renamed from: drawField, reason: from getter */
        public TouchRecord getDetachStream() {
            return this.detachStream;
        }

        @Override // com.goldenboot.saga.zone.ContentConfigurator
        /* renamed from: getHeight, reason: from getter */
        public int getGrowPayload() {
            return this.growPayload;
        }

        @Override // com.goldenboot.saga.zone.ContentConfigurator
        /* renamed from: getWidth, reason: from getter */
        public int getEvictLayout() {
            return this.evictLayout;
        }

        @Override // com.goldenboot.saga.zone.ContentConfigurator
        public Map<BottomBarActivator, Integer> injectConstraint() {
            return this.injectMetric;
        }

        @Override // com.goldenboot.saga.zone.ContentConfigurator
        public void popBlueprint() {
            this.releaseHeader.invoke(this.clipOrigin.getPlacementScope());
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0004¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000b\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0004¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010!\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019\"\u0004\b \u0010\u001bR\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'¨\u0006+"}, d2 = {"Lcom/goldenboot/saga/zone/SlideChannel$FeedbackFlow;", "Lcom/goldenboot/saga/zone/BoxStage;", "<init>", "(Lcom/goldenboot/saga/zone/SlideChannel;)V", "Landroidx/compose/ui/layout/GlowCache;", "", "value", "Lcom/goldenboot/saga/zone/DpadBuilder;", "saveEdge", "(Landroidx/compose/ui/layout/GlowCache;F)V", "Landroidx/compose/ui/layout/ListFormatter;", "saveEntry", "(Landroidx/compose/ui/layout/ListFormatter;F)V", "", "reduceScope", "Z", "popBlueprint", "()Z", "storeCharset", "(Z)V", "coordinatesAccessed", "Lcom/goldenboot/saga/zone/FontReporter;", "notifyMessage", "J", "injectConstraint", "()J", "queryModel", "(J)V", "positionOnScreen", "Lcom/goldenboot/saga/zone/ScaleSaver;", "connectPatch", "applyTask", "unlockMessage", "size", "Lcom/goldenboot/saga/zone/PagerReducer;", "dispatchTimezone", "()Lcom/goldenboot/saga/zone/PagerReducer;", "coordinates", "getDensity", "()F", "density", "formatPosition", "fontScale", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class FeedbackFlow implements BoxStage {

        /* renamed from: reduceScope, reason: from kotlin metadata */
        private boolean coordinatesAccessed;

        /* renamed from: notifyMessage, reason: from kotlin metadata */
        private long positionOnScreen = FontReporter.INSTANCE.evictLayout();

        /* renamed from: connectPatch, reason: from kotlin metadata */
        private long size = ScaleSaver.INSTANCE.evictLayout();

        public FeedbackFlow() {
        }

        /* renamed from: applyTask, reason: from getter */
        public final long getSize() {
            return this.size;
        }

        @Override // com.goldenboot.saga.zone.BoxStage
        public PagerReducer dispatchTimezone() {
            this.coordinatesAccessed = true;
            PagerReducer dispatchTimezone = SlideChannel.this.dispatchTimezone();
            if (FontReporter.drawField(this.positionOnScreen, FontReporter.INSTANCE.evictLayout())) {
                this.positionOnScreen = RegionListener.flushSample(WatcherSensor.updateTimer(dispatchTimezone));
                this.size = dispatchTimezone.applyTask();
            }
            SlideChannel.this.getLayoutNode().getLayoutDelegate().inflateEdge();
            return dispatchTimezone;
        }

        @Override // com.goldenboot.saga.zone.SequenceFacilitator
        /* renamed from: formatPosition */
        public float getFontScale() {
            return SlideChannel.this.getFontScale();
        }

        @Override // com.goldenboot.saga.zone.BackgroundCollection
        public float getDensity() {
            return SlideChannel.this.getDensity();
        }

        /* renamed from: injectConstraint, reason: from getter */
        public final long getPositionOnScreen() {
            return this.positionOnScreen;
        }

        /* renamed from: popBlueprint, reason: from getter */
        public final boolean getCoordinatesAccessed() {
            return this.coordinatesAccessed;
        }

        public final void queryModel(long j) {
            this.positionOnScreen = j;
        }

        @Override // com.goldenboot.saga.zone.BoxStage
        public void saveEdge(androidx.compose.ui.layout.GlowCache glowCache, float f) {
            SlideChannel.this.popIndex(glowCache, f);
        }

        @Override // com.goldenboot.saga.zone.BoxStage
        public void saveEntry(androidx.compose.ui.layout.ListFormatter listFormatter, float f) {
            SlideChannel.this.dispatchEvent(listFormatter, f);
        }

        public final void storeCharset(boolean z) {
            this.coordinatesAccessed = z;
        }

        public final void unlockMessage(long j) {
            this.size = j;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "()V"}, k = 3, mv = {2, 0, 0})
    public static final class LayerUseCase extends Lambda implements ElevationNode {
        final /* synthetic */ GradientLoader attachConfig;
        final /* synthetic */ long connectPatch;
        final /* synthetic */ long notifyMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayerUseCase(long j, long j2, GradientLoader gradientLoader) {
            super(0);
            this.notifyMessage = j;
            this.connectPatch = j2;
            this.attachConfig = gradientLoader;
        }

        public final void evictLayout() {
            SlideChannel.this.fetchOptions().storeCharset(false);
            SlideChannel.this.fetchOptions().queryModel(this.notifyMessage);
            SlideChannel.this.fetchOptions().unlockMessage(this.connectPatch);
            TouchRecord detachStream = this.attachConfig.getResult().getDetachStream();
            if (detachStream != null) {
                detachStream.invoke(SlideChannel.this.fetchOptions());
            }
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        public /* bridge */ /* synthetic */ Object invoke() {
            evictLayout();
            return DpadBuilder.evictLayout;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void broadcastModule(CustomStore layoutNodes) {
        ContentRepository contentRepository;
        Object[] objArr = layoutNodes.growPayload;
        long[] jArr = layoutNodes.evictLayout;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (contentRepository = (ContentRepository) ((GlobalTask) objArr[(i << 3) + i3]).get()) != null) {
                        if (saveBlueprint()) {
                            contentRepository.createConstraint(false);
                        } else {
                            contentRepository.initItem(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final SlideChannel drainCache(androidx.compose.ui.layout.GlowCache ruler) {
        while (true) {
            LifecycleMutex lifecycleMutex = this.rulerValues;
            if (lifecycleMutex != null && lifecycleMutex.growPayload(ruler)) {
                return this;
            }
            SlideChannel measureTimezone = this.measureTimezone();
            if (measureTimezone == null) {
                return this;
            }
            this = measureTimezone;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FeedbackFlow fetchOptions() {
        FeedbackFlow feedbackFlow = this._rulerScope;
        if (feedbackFlow != null) {
            return feedbackFlow;
        }
        FeedbackFlow feedbackFlow2 = new FeedbackFlow();
        this._rulerScope = feedbackFlow2;
        return feedbackFlow2;
    }

    private final boolean growPool(ContentRepository contentRepository, ContentRepository contentRepository2) {
        if (contentRepository == contentRepository2) {
            return true;
        }
        ContentRepository acquireAsset = contentRepository.acquireAsset();
        if (acquireAsset != null) {
            return growPool(acquireAsset, contentRepository2);
        }
        return false;
    }

    public static /* synthetic */ void normalizeKey(SlideChannel slideChannel, GradientLoader gradientLoader, long j, long j2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: captureRulers-OSxE8f4");
        }
        if ((i & 2) != 0) {
            j = FontReporter.INSTANCE.evictLayout();
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = ScaleSaver.INSTANCE.evictLayout();
        }
        slideChannel.saveHash(gradientLoader, j3, j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void offerToken(ContentRepository layoutNode, androidx.compose.ui.layout.GlowCache ruler) {
        char c;
        long j;
        long j2;
        long j3;
        ParallelHeap parallelHeap;
        ParallelHeap parallelHeap2;
        int i;
        int i2;
        Object releaseHeader;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i3;
        char c2;
        long j5;
        int i4;
        int i5;
        int i6;
        boolean z;
        ParallelHeap parallelHeap3 = this.rulerReaders;
        char c3 = 7;
        long j6 = -9187201950435737472L;
        int i7 = 8;
        if (parallelHeap3 != null) {
            Object[] objArr = parallelHeap3.injectMetric;
            long[] jArr3 = parallelHeap3.evictLayout;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i8 = 0;
                j2 = 128;
                while (true) {
                    long j7 = jArr3[i8];
                    j3 = 255;
                    if ((((~j7) << c3) & j7 & j6) != j6) {
                        int i9 = 8 - ((~(i8 - length)) >>> 31);
                        int i10 = 0;
                        while (i10 < i9) {
                            if ((j7 & 255) < 128) {
                                c2 = c3;
                                CustomStore customStore = (CustomStore) objArr[(i8 << 3) + i10];
                                j5 = j6;
                                Object[] objArr2 = customStore.growPayload;
                                long[] jArr4 = customStore.evictLayout;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i7;
                                    int i12 = 0;
                                    while (true) {
                                        int i13 = length2;
                                        long j8 = jArr4[i12];
                                        jArr2 = jArr3;
                                        j4 = j7;
                                        if ((((~j8) << c2) & j8 & j5) != j5) {
                                            int i14 = 8 - ((~(i12 - i13)) >>> 31);
                                            int i15 = 0;
                                            while (i15 < i14) {
                                                if ((j8 & 255) < 128) {
                                                    int i16 = (i12 << 3) + i15;
                                                    ContentRepository contentRepository = (ContentRepository) ((GlobalTask) objArr2[i16]).get();
                                                    i5 = i15;
                                                    if (contentRepository != null) {
                                                        boolean popBlueprint = contentRepository.popBlueprint();
                                                        i6 = i10;
                                                        if (popBlueprint) {
                                                            z = true;
                                                            if (z) {
                                                                customStore.findTask(i16);
                                                            }
                                                        }
                                                    } else {
                                                        i6 = i10;
                                                    }
                                                    z = false;
                                                    if (z) {
                                                    }
                                                } else {
                                                    i5 = i15;
                                                    i6 = i10;
                                                }
                                                j8 >>= i11;
                                                i15 = i5 + 1;
                                                i10 = i6;
                                            }
                                            i3 = i10;
                                            if (i14 != i11) {
                                                break;
                                            }
                                        } else {
                                            i3 = i10;
                                        }
                                        length2 = i13;
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        j7 = j4;
                                        i10 = i3;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j7;
                                    i3 = i10;
                                }
                                i4 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j7;
                                i3 = i10;
                                c2 = c3;
                                j5 = j6;
                                i4 = i7;
                            }
                            i7 = i4;
                            j7 = j4 >> i4;
                            c3 = c2;
                            j6 = j5;
                            i10 = i3 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j6;
                        if (i9 != i7) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j6;
                    }
                    if (i8 == length) {
                        break;
                    }
                    i8++;
                    c3 = c;
                    j6 = j;
                    jArr3 = jArr;
                    i7 = 8;
                }
                parallelHeap = this.rulerReaders;
                if (parallelHeap != null) {
                    long[] jArr5 = parallelHeap.evictLayout;
                    int length3 = jArr5.length - 2;
                    if (length3 >= 0) {
                        int i17 = 0;
                        while (true) {
                            long j9 = jArr5[i17];
                            if ((((~j9) << c) & j9 & j) != j) {
                                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                                for (int i19 = 0; i19 < i18; i19++) {
                                    if ((j9 & j3) < j2) {
                                        int i20 = (i17 << 3) + i19;
                                        if (((CustomStore) parallelHeap.injectMetric[i20]).detachStream()) {
                                            parallelHeap.drawRequest(i20);
                                        }
                                    }
                                    j9 >>= 8;
                                }
                                if (i18 != 8) {
                                    break;
                                }
                            }
                            if (i17 == length3) {
                                break;
                            } else {
                                i17++;
                            }
                        }
                    }
                }
                parallelHeap2 = this.rulerReaders;
                DefaultConstructorMarker defaultConstructorMarker = null;
                if (parallelHeap2 != null) {
                    i = 0;
                    i2 = 1;
                    parallelHeap2 = new ParallelHeap(i, i2, defaultConstructorMarker);
                    this.rulerReaders = parallelHeap2;
                } else {
                    i = 0;
                    i2 = 1;
                }
                releaseHeader = parallelHeap2.releaseHeader(ruler);
                if (releaseHeader == null) {
                    releaseHeader = new CustomStore(i, i2, defaultConstructorMarker);
                    parallelHeap2.decodePath(ruler, releaseHeader);
                }
                ((CustomStore) releaseHeader).decodePath(new GlobalTask(layoutNode));
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j2 = 128;
        j3 = 255;
        parallelHeap = this.rulerReaders;
        if (parallelHeap != null) {
        }
        parallelHeap2 = this.rulerReaders;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        if (parallelHeap2 != null) {
        }
        releaseHeader = parallelHeap2.releaseHeader(ruler);
        if (releaseHeader == null) {
        }
        ((CustomStore) releaseHeader).decodePath(new GlobalTask(layoutNode));
    }

    private final void saveHash(GradientLoader placeableResult, long positionOnScreen, long size) {
        ProxyInitializer snapshotObserver;
        ParallelHeap parallelHeap = this.rulerReaders;
        LifecycleMutex lifecycleMutex = this.rulerValues;
        if (lifecycleMutex == null) {
            lifecycleMutex = new LifecycleMutex();
            this.rulerValues = lifecycleMutex;
        }
        CarouselHelper owner = getLayoutNode().getOwner();
        if (owner != null && (snapshotObserver = owner.getSnapshotObserver()) != null) {
            snapshotObserver.applyTask(placeableResult, storeCharset, new LayerUseCase(positionOnScreen, size, placeableResult));
        }
        lifecycleMutex.detachStream(saveBlueprint(), this, parallelHeap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopLocale(GradientLoader placeableResult) {
        if (this.isPlacingForAlignment) {
            return;
        }
        TouchRecord detachStream = placeableResult.getResult().getDetachStream();
        ParallelHeap parallelHeap = this.rulerReaders;
        if (detachStream != null) {
            normalizeKey(this, placeableResult, 0L, 0L, 6, null);
            this.rulersLambda = detachStream;
            return;
        }
        if (parallelHeap != null) {
            Object[] objArr = parallelHeap.injectMetric;
            long[] jArr = parallelHeap.evictLayout;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                broadcastModule((CustomStore) objArr[(i << 3) + i3]);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            parallelHeap.drawField();
        }
    }

    /* renamed from: attachNode */
    public abstract long getPosition();

    /* renamed from: broadcastPayload */
    public abstract ContentRepository getLayoutNode();

    @Override // androidx.compose.ui.layout.PanelUtil
    public ContentConfigurator cacheStack(int width, int height, Map<BottomBarActivator, Integer> alignmentLines, TouchRecord rulers, TouchRecord placementBlock) {
        if (!((width & (-16777216)) == 0 && ((-16777216) & height) == 0)) {
            PagerBridge.applyTask("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new EndpointList(width, height, alignmentLines, rulers, placementBlock, this);
    }

    public abstract boolean confirmSignature();

    /* renamed from: detachModel, reason: from getter */
    public final boolean getIsShallowPlacing() {
        return this.isShallowPlacing;
    }

    public abstract int disconnectSession(BottomBarActivator alignmentLine);

    public final void dispatchEvent(androidx.compose.ui.layout.GlowCache ruler, float value) {
        LifecycleMutex lifecycleMutex = this.rulerValues;
        if (lifecycleMutex == null) {
            lifecycleMutex = new LifecycleMutex();
            this.rulerValues = lifecycleMutex;
        }
        if (getLayoutDirection() != LabelCache.reduceScope) {
            value = getWidth() - value;
        }
        lifecycleMutex.releaseHeader(ruler, value);
    }

    public abstract PagerReducer dispatchTimezone();

    @Override // com.goldenboot.saga.zone.ShadowBuilder
    /* renamed from: drawConfig, reason: from getter */
    public boolean getIsPlacedUnderMotionFrameOfReference() {
        return this.isPlacedUnderMotionFrameOfReference;
    }

    public final void emitCharset(boolean z) {
        this.isPlacingForAlignment = z;
    }

    public void encodeManifest(boolean z) {
        this.isPlacedUnderMotionFrameOfReference = z;
    }

    public abstract SlideChannel insertLocale();

    /* renamed from: loadSettings, reason: from getter */
    public final boolean getIsPlacingForAlignment() {
        return this.isPlacingForAlignment;
    }

    public abstract SlideChannel measureTimezone();

    /* renamed from: peekField, reason: from getter */
    public final GradientActivator.ActivityMutator getPlacementScope() {
        return this.placementScope;
    }

    public final void popIndex(androidx.compose.ui.layout.GlowCache ruler, float value) {
        LifecycleMutex lifecycleMutex = this.rulerValues;
        if (lifecycleMutex == null) {
            lifecycleMutex = new LifecycleMutex();
            this.rulerValues = lifecycleMutex;
        }
        lifecycleMutex.releaseHeader(ruler, value);
    }

    public final void processFormat(BridgeSerializer bridgeSerializer) {
        ClickDelta injectConstraint2;
        BridgeSerializer wrapped = bridgeSerializer.getWrapped();
        if (!Intrinsics.areEqual(wrapped != null ? wrapped.getLayoutNode() : null, bridgeSerializer.getLayoutNode())) {
            bridgeSerializer.scheduleTemplate().injectConstraint().connectPatch();
            return;
        }
        AbstractSlot offerHash = bridgeSerializer.scheduleTemplate().offerHash();
        if (offerHash == null || (injectConstraint2 = offerHash.injectConstraint()) == null) {
            return;
        }
        injectConstraint2.connectPatch();
    }

    public final void renderPattern(boolean z) {
        this.isShallowPlacing = z;
    }

    public final float resetTask(androidx.compose.ui.layout.GlowCache ruler, float defaultValue) {
        if (this.isPlacingForAlignment) {
            return defaultValue;
        }
        SlideChannel slideChannel = this;
        while (true) {
            LifecycleMutex lifecycleMutex = slideChannel.rulerValues;
            float injectMetric = lifecycleMutex != null ? lifecycleMutex.injectMetric(ruler, Float.NaN) : Float.NaN;
            if (!Float.isNaN(injectMetric)) {
                slideChannel.offerToken(getLayoutNode(), ruler);
                return ruler.evictLayout(injectMetric, slideChannel.dispatchTimezone(), dispatchTimezone());
            }
            SlideChannel measureTimezone = slideChannel.measureTimezone();
            if (measureTimezone == null) {
                slideChannel.offerToken(getLayoutNode(), ruler);
                return defaultValue;
            }
            slideChannel = measureTimezone;
        }
    }

    public abstract ContentConfigurator resolveParams();

    public final void resumeRecord(ContentConfigurator result) {
        char c;
        char c2;
        ParallelHeap parallelHeap = this.rulerReaders;
        char c3 = 7;
        if (result == null) {
            if (parallelHeap != null) {
                Object[] objArr = parallelHeap.injectMetric;
                long[] jArr = parallelHeap.evictLayout;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((j & 255) < 128) {
                                    broadcastModule((CustomStore) objArr[(i << 3) + i3]);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            if (parallelHeap != null) {
                parallelHeap.drawField();
            }
            LifecycleMutex lifecycleMutex = this.rulerValues;
            if (lifecycleMutex != null) {
                lifecycleMutex.evictLayout();
                return;
            }
            return;
        }
        if (this.isPlacingForAlignment) {
            return;
        }
        TouchRecord detachStream = result.getDetachStream();
        if (detachStream != null) {
            boolean z = this.rulersLambda != detachStream;
            long evictLayout = FontReporter.INSTANCE.evictLayout();
            long evictLayout2 = ScaleSaver.INSTANCE.evictLayout();
            if (!z && fetchOptions().getCoordinatesAccessed()) {
                PagerReducer dispatchTimezone = dispatchTimezone();
                evictLayout = RegionListener.flushSample(WatcherSensor.updateTimer(dispatchTimezone));
                evictLayout2 = dispatchTimezone.applyTask();
                z = (FontReporter.drawField(evictLayout, fetchOptions().getPositionOnScreen()) && ScaleSaver.updateTimer(evictLayout2, fetchOptions().getSize())) ? false : true;
            }
            long j2 = evictLayout;
            long j3 = evictLayout2;
            if (z) {
                GradientLoader gradientLoader = this.cachedRulerPlaceableResult;
                if (gradientLoader != null) {
                    gradientLoader.injectMetric(result);
                } else {
                    gradientLoader = new GradientLoader(result, this);
                    this.cachedRulerPlaceableResult = gradientLoader;
                }
                saveHash(gradientLoader, j2, j3);
                this.rulersLambda = result.getDetachStream();
                return;
            }
            return;
        }
        if (parallelHeap != null) {
            Object[] objArr2 = parallelHeap.injectMetric;
            long[] jArr2 = parallelHeap.evictLayout;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i4 = 0;
                while (true) {
                    long j4 = jArr2[i4];
                    if ((((~j4) << c3) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length2)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j4 & 255) < 128) {
                                c2 = c3;
                                broadcastModule((CustomStore) objArr2[(i4 << 3) + i6]);
                            } else {
                                c2 = c3;
                            }
                            j4 >>= 8;
                            i6++;
                            c3 = c2;
                        }
                        c = c3;
                        if (i5 != 8) {
                            break;
                        }
                    } else {
                        c = c3;
                    }
                    if (i4 == length2) {
                        break;
                    }
                    i4++;
                    c3 = c;
                }
            }
            parallelHeap.drawField();
        }
    }

    public boolean saveBlueprint() {
        return false;
    }

    public abstract void savePool();

    public abstract AbstractSlot scheduleTemplate();

    @Override // com.goldenboot.saga.zone.DimenFormatter
    public final int storeCharset(BottomBarActivator alignmentLine) {
        int disconnectSession;
        if (confirmSignature() && (disconnectSession = disconnectSession(alignmentLine)) != Integer.MIN_VALUE) {
            return disconnectSession + (alignmentLine instanceof FadeReporter ? FontReporter.serializeOffset(getApparentToRealOffset()) : FontReporter.notifyMessage(getApparentToRealOffset()));
        }
        return Integer.MIN_VALUE;
    }

    public final void trimOrigin(androidx.compose.ui.layout.GlowCache ruler) {
        ParallelHeap parallelHeap = drainCache(ruler).rulerReaders;
        CustomStore customStore = parallelHeap != null ? (CustomStore) parallelHeap.purgeNode(ruler) : null;
        if (customStore != null) {
            broadcastModule(customStore);
        }
    }

    @Override // com.goldenboot.saga.zone.ShadowBuilder
    public void writeRequest(boolean newMFR) {
        SlideChannel measureTimezone = measureTimezone();
        ContentRepository layoutNode = measureTimezone != null ? measureTimezone.getLayoutNode() : null;
        if (Intrinsics.areEqual(layoutNode, getLayoutNode())) {
            encodeManifest(newMFR);
            return;
        }
        if ((layoutNode != null ? layoutNode.growCallback() : null) != ContentRepository.EndpointList.connectPatch) {
            if ((layoutNode != null ? layoutNode.growCallback() : null) != ContentRepository.EndpointList.attachConfig) {
                return;
            }
        }
        encodeManifest(newMFR);
    }
}
