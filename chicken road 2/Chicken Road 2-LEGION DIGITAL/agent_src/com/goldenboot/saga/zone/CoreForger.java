package com.goldenboot.saga.zone;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u0012R.\u0010\u001b\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\"\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R6\u0010*\u001a\b\u0012\u0004\u0012\u00020$0#2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020$0#8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u00101\u001a\u00020+2\u0006\u0010\r\u001a\u00020+8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R*\u00104\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001d\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u0010!R*\u00107\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001d\u001a\u0004\b5\u0010\u001f\"\u0004\b6\u0010!R.\u0010;\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010\u0016\u001a\u0004\b9\u0010\u0018\"\u0004\b:\u0010\u001aR*\u0010?\u001a\u00020<2\u0006\u0010\r\u001a\u00020<8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010,\u001a\u0004\b=\u0010.\"\u0004\b>\u00100R*\u0010C\u001a\u00020@2\u0006\u0010\r\u001a\u00020@8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010,\u001a\u0004\bA\u0010.\"\u0004\bB\u00100R*\u0010F\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010\u001d\u001a\u0004\bD\u0010\u001f\"\u0004\bE\u0010!R*\u0010I\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010\u001d\u001a\u0004\bG\u0010\u001f\"\u0004\bH\u0010!R*\u0010L\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010\u001d\u001a\u0004\bJ\u0010\u001f\"\u0004\bK\u0010!R*\u0010O\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\u001d\u001a\u0004\bM\u0010\u001f\"\u0004\bN\u0010!R\u0016\u0010R\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010QR\u0016\u0010S\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010QR\u0016\u0010T\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010QR\u0018\u0010W\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010VR\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010YR\u0016\u0010[\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010YR\u001b\u0010_\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010]\u001a\u0004\b8\u0010^¨\u0006`"}, d2 = {"Lcom/goldenboot/saga/zone/CoreForger;", "Lcom/goldenboot/saga/zone/NavBarShaper;", "<init>", "()V", "Lcom/goldenboot/saga/zone/DpadBuilder;", "inflateEdge", "queryModel", "Lcom/goldenboot/saga/zone/StepperAdministrator;", "evictLayout", "(Lcom/goldenboot/saga/zone/StepperAdministrator;)V", "", "toString", "()Ljava/lang/String;", "value", "injectMetric", "Ljava/lang/String;", "flushSample", "drawRequest", "(Ljava/lang/String;)V", "name", "Lcom/goldenboot/saga/zone/LayerTunnel;", "detachStream", "Lcom/goldenboot/saga/zone/LayerTunnel;", "releaseHeader", "()Lcom/goldenboot/saga/zone/LayerTunnel;", "inflateAdapter", "(Lcom/goldenboot/saga/zone/LayerTunnel;)V", "fill", "", "F", "clipOrigin", "()F", "purgeNode", "(F)V", "fillAlpha", "", "Lcom/goldenboot/saga/zone/DrawerLoop;", "Ljava/util/List;", "updateTimer", "()Ljava/util/List;", "gatherAdapter", "(Ljava/util/List;)V", "pathData", "Lcom/goldenboot/saga/zone/ChannelValidator;", "I", "applyTask", "()I", "decodePath", "(I)V", "pathFillType", "connectJob", "expandArgs", "strokeAlpha", "notifyMessage", "flattenPackage", "strokeLineWidth", "popBlueprint", "drawField", "drawScope", "stroke", "Lcom/goldenboot/saga/zone/ListMulticaster;", "peekRevision", "findTask", "strokeLineCap", "Lcom/goldenboot/saga/zone/RotateFacilitator;", "serializeOffset", "mergeLocale", "strokeLineJoin", "reduceScope", "syncScope", "strokeLineMiter", "resetDelta", "filterPayload", "trimPathStart", "connectPatch", "injectConstraint", "trimPathEnd", "attachConfig", "storeCharset", "trimPathOffset", "", "Z", "isPathDirty", "isStrokeDirty", "isTrimPathDirty", "Lcom/goldenboot/saga/zone/FramePhase;", "Lcom/goldenboot/saga/zone/FramePhase;", "strokeStyle", "Lcom/goldenboot/saga/zone/ServiceFetcher;", "Lcom/goldenboot/saga/zone/ServiceFetcher;", "path", "renderPath", "Lcom/goldenboot/saga/zone/AccentSanitizer;", "Lcom/goldenboot/saga/zone/LayoutSynthesizer;", "()Lcom/goldenboot/saga/zone/AccentSanitizer;", "pathMeasure", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoreForger extends NavBarShaper {
    public static final int decodePath = 8;

    /* renamed from: applyTask, reason: from kotlin metadata */
    private float strokeLineWidth;

    /* renamed from: attachConfig, reason: from kotlin metadata */
    private boolean isStrokeDirty;

    /* renamed from: clipOrigin, reason: from kotlin metadata */
    private List<? extends DrawerLoop> pathData;

    /* renamed from: connectJob, reason: from kotlin metadata */
    private int strokeLineJoin;

    /* renamed from: connectPatch, reason: from kotlin metadata */
    private boolean isPathDirty;

    /* renamed from: detachStream, reason: from kotlin metadata */
    private LayerTunnel fill;

    /* renamed from: drawField, reason: from kotlin metadata */
    private int strokeLineCap;

    /* renamed from: drawRequest, reason: from kotlin metadata */
    private ServiceFetcher renderPath;

    /* renamed from: flushSample, reason: from kotlin metadata */
    private int pathFillType;

    /* renamed from: gatherAdapter, reason: from kotlin metadata */
    private final LayoutSynthesizer pathMeasure;

    /* renamed from: inflateAdapter, reason: from kotlin metadata */
    private Stroke strokeStyle;

    /* renamed from: injectMetric, reason: from kotlin metadata */
    private String name;

    /* renamed from: notifyMessage, reason: from kotlin metadata */
    private float trimPathOffset;

    /* renamed from: peekRevision, reason: from kotlin metadata */
    private float strokeLineMiter;

    /* renamed from: popBlueprint, reason: from kotlin metadata */
    private LayerTunnel stroke;

    /* renamed from: purgeNode, reason: from kotlin metadata */
    private final ServiceFetcher path;

    /* renamed from: reduceScope, reason: from kotlin metadata */
    private float trimPathEnd;

    /* renamed from: releaseHeader, reason: from kotlin metadata */
    private float fillAlpha;

    /* renamed from: resetDelta, reason: from kotlin metadata */
    private boolean isTrimPathDirty;

    /* renamed from: serializeOffset, reason: from kotlin metadata */
    private float trimPathStart;

    /* renamed from: updateTimer, reason: from kotlin metadata */
    private float strokeAlpha;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/goldenboot/saga/zone/AccentSanitizer;", "evictLayout", "()Lcom/goldenboot/saga/zone/AccentSanitizer;"}, k = 3, mv = {2, 0, 0})
    public static final class ActivityMutator extends Lambda implements ElevationNode {
        public static final ActivityMutator reduceScope = new ActivityMutator();

        public ActivityMutator() {
            super(0);
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final AccentSanitizer invoke() {
            return CanvasBridge.evictLayout();
        }
    }

    public CoreForger() {
        super(null);
        this.name = "";
        this.fillAlpha = 1.0f;
        this.pathData = SlideBeacon.updateTimer();
        this.pathFillType = SlideBeacon.injectMetric();
        this.strokeAlpha = 1.0f;
        this.strokeLineCap = SlideBeacon.detachStream();
        this.strokeLineJoin = SlideBeacon.releaseHeader();
        this.strokeLineMiter = 4.0f;
        this.trimPathEnd = 1.0f;
        this.isPathDirty = true;
        this.isStrokeDirty = true;
        ServiceFetcher evictLayout = DelegateAnalyzer.evictLayout();
        this.path = evictLayout;
        this.renderPath = evictLayout;
        this.pathMeasure = InternalPropagator.growPayload(BundleChannel.connectPatch, ActivityMutator.reduceScope);
    }

    private final void inflateEdge() {
        BaseProbe.detachStream(this.pathData, this.path);
        queryModel();
    }

    private final AccentSanitizer popBlueprint() {
        return (AccentSanitizer) this.pathMeasure.getValue();
    }

    private final void queryModel() {
        if (this.trimPathStart == 0.0f && this.trimPathEnd == 1.0f) {
            this.renderPath = this.path;
            return;
        }
        if (Intrinsics.areEqual(this.renderPath, this.path)) {
            this.renderPath = DelegateAnalyzer.evictLayout();
        } else {
            int injectConstraint = this.renderPath.injectConstraint();
            this.renderPath.connectComponent();
            this.renderPath.findTask(injectConstraint);
        }
        popBlueprint().releaseHeader(this.path, false);
        float length = popBlueprint().getLength();
        float f = this.trimPathStart;
        float f2 = this.trimPathOffset;
        float f3 = ((f + f2) % 1.0f) * length;
        float f4 = ((this.trimPathEnd + f2) % 1.0f) * length;
        if (f3 <= f4) {
            popBlueprint().growPayload(f3, f4, this.renderPath, true);
        } else {
            popBlueprint().growPayload(f3, length, this.renderPath, true);
            popBlueprint().growPayload(0.0f, f4, this.renderPath, true);
        }
    }

    /* renamed from: applyTask, reason: from getter */
    public final int getPathFillType() {
        return this.pathFillType;
    }

    /* renamed from: attachConfig, reason: from getter */
    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    /* renamed from: clipOrigin, reason: from getter */
    public final float getFillAlpha() {
        return this.fillAlpha;
    }

    /* renamed from: connectJob, reason: from getter */
    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    /* renamed from: connectPatch, reason: from getter */
    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    public final void decodePath(int i) {
        this.pathFillType = i;
        this.renderPath.findTask(i);
        injectMetric();
    }

    /* renamed from: drawField, reason: from getter */
    public final LayerTunnel getStroke() {
        return this.stroke;
    }

    public final void drawRequest(String str) {
        this.name = str;
        injectMetric();
    }

    public final void drawScope(LayerTunnel layerTunnel) {
        this.stroke = layerTunnel;
        injectMetric();
    }

    @Override // com.goldenboot.saga.zone.NavBarShaper
    public void evictLayout(StepperAdministrator stepperAdministrator) {
        Stroke stroke;
        if (this.isPathDirty) {
            inflateEdge();
        } else if (this.isTrimPathDirty) {
            queryModel();
        }
        this.isPathDirty = false;
        this.isTrimPathDirty = false;
        LayerTunnel layerTunnel = this.fill;
        if (layerTunnel != null) {
            StepperAdministrator.saveMessage(stepperAdministrator, this.renderPath, layerTunnel, this.fillAlpha, null, null, 0, 56, null);
        }
        LayerTunnel layerTunnel2 = this.stroke;
        if (layerTunnel2 != null) {
            Stroke stroke2 = this.strokeStyle;
            if (this.isStrokeDirty || stroke2 == null) {
                Stroke stroke3 = new Stroke(this.strokeLineWidth, this.strokeLineMiter, this.strokeLineCap, this.strokeLineJoin, null, 16, null);
                this.strokeStyle = stroke3;
                this.isStrokeDirty = false;
                stroke = stroke3;
            } else {
                stroke = stroke2;
            }
            StepperAdministrator.saveMessage(stepperAdministrator, this.renderPath, layerTunnel2, this.strokeAlpha, stroke, null, 0, 48, null);
        }
    }

    public final void expandArgs(float f) {
        this.strokeAlpha = f;
        injectMetric();
    }

    public final void filterPayload(float f) {
        this.trimPathStart = f;
        this.isTrimPathDirty = true;
        injectMetric();
    }

    public final void findTask(int i) {
        this.strokeLineCap = i;
        this.isStrokeDirty = true;
        injectMetric();
    }

    public final void flattenPackage(float f) {
        this.strokeLineWidth = f;
        this.isStrokeDirty = true;
        injectMetric();
    }

    /* renamed from: flushSample, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final void gatherAdapter(List<? extends DrawerLoop> list) {
        this.pathData = list;
        this.isPathDirty = true;
        injectMetric();
    }

    public final void inflateAdapter(LayerTunnel layerTunnel) {
        this.fill = layerTunnel;
        injectMetric();
    }

    public final void injectConstraint(float f) {
        this.trimPathEnd = f;
        this.isTrimPathDirty = true;
        injectMetric();
    }

    public final void mergeLocale(int i) {
        this.strokeLineJoin = i;
        this.isStrokeDirty = true;
        injectMetric();
    }

    /* renamed from: notifyMessage, reason: from getter */
    public final float getStrokeLineWidth() {
        return this.strokeLineWidth;
    }

    /* renamed from: peekRevision, reason: from getter */
    public final int getStrokeLineCap() {
        return this.strokeLineCap;
    }

    public final void purgeNode(float f) {
        this.fillAlpha = f;
        injectMetric();
    }

    /* renamed from: reduceScope, reason: from getter */
    public final float getStrokeLineMiter() {
        return this.strokeLineMiter;
    }

    /* renamed from: releaseHeader, reason: from getter */
    public final LayerTunnel getFill() {
        return this.fill;
    }

    /* renamed from: resetDelta, reason: from getter */
    public final float getTrimPathStart() {
        return this.trimPathStart;
    }

    /* renamed from: serializeOffset, reason: from getter */
    public final int getStrokeLineJoin() {
        return this.strokeLineJoin;
    }

    public final void storeCharset(float f) {
        this.trimPathOffset = f;
        this.isTrimPathDirty = true;
        injectMetric();
    }

    public final void syncScope(float f) {
        this.strokeLineMiter = f;
        this.isStrokeDirty = true;
        injectMetric();
    }

    public String toString() {
        return this.path.toString();
    }

    public final List<DrawerLoop> updateTimer() {
        return this.pathData;
    }
}
