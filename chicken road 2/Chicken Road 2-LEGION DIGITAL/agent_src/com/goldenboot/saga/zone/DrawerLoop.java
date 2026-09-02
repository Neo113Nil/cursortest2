package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001dB\u001d\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t\u0082\u0001\u0013\u001e\u001f !\"#$%&'()*+,-./0¨\u00061"}, d2 = {"Lcom/goldenboot/saga/zone/DrawerLoop;", "", "", "isCurve", "isQuad", "<init>", "(ZZ)V", "evictLayout", "Z", "()Z", "growPayload", "BounceHandler", "ClipboardState", "StylusConverter", "RemoteCallback", "EndpointList", "HoverThrottle", "LayerUseCase", "PanelUtil", "TriggerResolver", "HeaderUtil", "FeedbackFlow", "TransitionThrottle", "PluginInterpreter", "CardSampler", "ScopedMigration", "SheetLink", "RestoreToggle", "MorphDirector", "ActivityMutator", "Lcom/goldenboot/saga/zone/DrawerLoop$ActivityMutator;", "Lcom/goldenboot/saga/zone/DrawerLoop$BounceHandler;", "Lcom/goldenboot/saga/zone/DrawerLoop$FeedbackFlow;", "Lcom/goldenboot/saga/zone/DrawerLoop$LayerUseCase;", "Lcom/goldenboot/saga/zone/DrawerLoop$EndpointList;", "Lcom/goldenboot/saga/zone/DrawerLoop$StylusConverter;", "Lcom/goldenboot/saga/zone/DrawerLoop$ScopedMigration;", "Lcom/goldenboot/saga/zone/DrawerLoop$PluginInterpreter;", "Lcom/goldenboot/saga/zone/DrawerLoop$RestoreToggle;", "Lcom/goldenboot/saga/zone/DrawerLoop$MorphDirector;", "Lcom/goldenboot/saga/zone/DrawerLoop$HeaderUtil;", "Lcom/goldenboot/saga/zone/DrawerLoop$HoverThrottle;", "Lcom/goldenboot/saga/zone/DrawerLoop$RemoteCallback;", "Lcom/goldenboot/saga/zone/DrawerLoop$ClipboardState;", "Lcom/goldenboot/saga/zone/DrawerLoop$CardSampler;", "Lcom/goldenboot/saga/zone/DrawerLoop$TransitionThrottle;", "Lcom/goldenboot/saga/zone/DrawerLoop$SheetLink;", "Lcom/goldenboot/saga/zone/DrawerLoop$PanelUtil;", "Lcom/goldenboot/saga/zone/DrawerLoop$TriggerResolver;", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class DrawerLoop {

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final boolean isCurve;

    /* renamed from: growPayload, reason: from kotlin metadata */
    private final boolean isQuad;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJV\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b$\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b%\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b'\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b(\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b)\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b*\u0010\u000e¨\u0006+"}, d2 = {"Lcom/goldenboot/saga/zone/DrawerLoop$ActivityMutator;", "Lcom/goldenboot/saga/zone/DrawerLoop;", "", "horizontalEllipseRadius", "verticalEllipseRadius", "theta", "", "isMoreThanHalf", "isPositiveArc", "arcStartX", "arcStartY", "<init>", "(FFFZZFF)V", "injectMetric", "()F", "detachStream", "releaseHeader", "clipOrigin", "()Z", "flushSample", "updateTimer", "applyTask", "popBlueprint", "(FFFZZFF)Lcom/goldenboot/saga/zone/DrawerLoop$ActivityMutator;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "F", "serializeOffset", "notifyMessage", "reduceScope", "Z", "connectPatch", "attachConfig", "connectJob", "peekRevision", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.DrawerLoop$ActivityMutator, reason: from toString */
    public static final /* data */ class ArcTo extends DrawerLoop {

        /* renamed from: applyTask, reason: from kotlin metadata and from toString */
        private final float arcStartY;

        /* renamed from: clipOrigin, reason: from kotlin metadata and from toString */
        private final boolean isMoreThanHalf;

        /* renamed from: detachStream, reason: from kotlin metadata and from toString */
        private final float verticalEllipseRadius;

        /* renamed from: flushSample, reason: from kotlin metadata and from toString */
        private final boolean isPositiveArc;

        /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
        private final float horizontalEllipseRadius;

        /* renamed from: releaseHeader, reason: from kotlin metadata and from toString */
        private final float theta;

        /* renamed from: updateTimer, reason: from kotlin metadata and from toString */
        private final float arcStartX;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ArcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(r2, r2, 3, null);
            boolean z3 = false;
            this.horizontalEllipseRadius = f;
            this.verticalEllipseRadius = f2;
            this.theta = f3;
            this.isMoreThanHalf = z;
            this.isPositiveArc = z2;
            this.arcStartX = f4;
            this.arcStartY = f5;
        }

        public static /* synthetic */ ArcTo drawField(ArcTo arcTo, float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, int i, Object obj) {
            if ((i & 1) != 0) {
                f = arcTo.horizontalEllipseRadius;
            }
            if ((i & 2) != 0) {
                f2 = arcTo.verticalEllipseRadius;
            }
            if ((i & 4) != 0) {
                f3 = arcTo.theta;
            }
            if ((i & 8) != 0) {
                z = arcTo.isMoreThanHalf;
            }
            if ((i & 16) != 0) {
                z2 = arcTo.isPositiveArc;
            }
            if ((i & 32) != 0) {
                f4 = arcTo.arcStartX;
            }
            if ((i & 64) != 0) {
                f5 = arcTo.arcStartY;
            }
            float f6 = f4;
            float f7 = f5;
            boolean z3 = z2;
            float f8 = f3;
            return arcTo.popBlueprint(f, f2, f8, z, z3, f6, f7);
        }

        /* renamed from: applyTask, reason: from getter */
        public final float getArcStartY() {
            return this.arcStartY;
        }

        /* renamed from: attachConfig, reason: from getter */
        public final boolean getIsPositiveArc() {
            return this.isPositiveArc;
        }

        /* renamed from: clipOrigin, reason: from getter */
        public final boolean getIsMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        /* renamed from: connectJob, reason: from getter */
        public final float getArcStartX() {
            return this.arcStartX;
        }

        public final boolean connectPatch() {
            return this.isMoreThanHalf;
        }

        /* renamed from: detachStream, reason: from getter */
        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ArcTo)) {
                return false;
            }
            ArcTo arcTo = (ArcTo) other;
            return Float.compare(this.horizontalEllipseRadius, arcTo.horizontalEllipseRadius) == 0 && Float.compare(this.verticalEllipseRadius, arcTo.verticalEllipseRadius) == 0 && Float.compare(this.theta, arcTo.theta) == 0 && this.isMoreThanHalf == arcTo.isMoreThanHalf && this.isPositiveArc == arcTo.isPositiveArc && Float.compare(this.arcStartX, arcTo.arcStartX) == 0 && Float.compare(this.arcStartY, arcTo.arcStartY) == 0;
        }

        public final boolean flushSample() {
            return this.isPositiveArc;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.horizontalEllipseRadius) * 31) + Float.hashCode(this.verticalEllipseRadius)) * 31) + Float.hashCode(this.theta)) * 31) + Boolean.hashCode(this.isMoreThanHalf)) * 31) + Boolean.hashCode(this.isPositiveArc)) * 31) + Float.hashCode(this.arcStartX)) * 31) + Float.hashCode(this.arcStartY);
        }

        /* renamed from: injectMetric, reason: from getter */
        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        public final float notifyMessage() {
            return this.verticalEllipseRadius;
        }

        public final float peekRevision() {
            return this.arcStartY;
        }

        public final ArcTo popBlueprint(float horizontalEllipseRadius, float verticalEllipseRadius, float theta, boolean isMoreThanHalf, boolean isPositiveArc, float arcStartX, float arcStartY) {
            return new ArcTo(horizontalEllipseRadius, verticalEllipseRadius, theta, isMoreThanHalf, isPositiveArc, arcStartX, arcStartY);
        }

        /* renamed from: reduceScope, reason: from getter */
        public final float getTheta() {
            return this.theta;
        }

        public final float releaseHeader() {
            return this.theta;
        }

        public final float serializeOffset() {
            return this.horizontalEllipseRadius;
        }

        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.horizontalEllipseRadius + ", verticalEllipseRadius=" + this.verticalEllipseRadius + ", theta=" + this.theta + ", isMoreThanHalf=" + this.isMoreThanHalf + ", isPositiveArc=" + this.isPositiveArc + ", arcStartX=" + this.arcStartX + ", arcStartY=" + this.arcStartY + ')';
        }

        public final float updateTimer() {
            return this.arcStartX;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/goldenboot/saga/zone/DrawerLoop$BounceHandler;", "Lcom/goldenboot/saga/zone/DrawerLoop;", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BounceHandler extends DrawerLoop {
        public static final BounceHandler injectMetric = new BounceHandler();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private BounceHandler() {
            super(r2, r2, 3, null);
            boolean z = false;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001d\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001e\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001f\u0010\n¨\u0006 "}, d2 = {"Lcom/goldenboot/saga/zone/DrawerLoop$CardSampler;", "Lcom/goldenboot/saga/zone/DrawerLoop;", "", "dx1", "dy1", "dx2", "dy2", "<init>", "(FFFF)V", "injectMetric", "()F", "detachStream", "releaseHeader", "clipOrigin", "flushSample", "(FFFF)Lcom/goldenboot/saga/zone/DrawerLoop$CardSampler;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "applyTask", "drawField", "popBlueprint", "connectJob", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.DrawerLoop$CardSampler, reason: from toString */
    public static final /* data */ class RelativeQuadTo extends DrawerLoop {

        /* renamed from: clipOrigin, reason: from kotlin metadata and from toString */
        private final float dy2;

        /* renamed from: detachStream, reason: from kotlin metadata and from toString */
        private final float dy1;

        /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
        private final float dx1;

        /* renamed from: releaseHeader, reason: from kotlin metadata and from toString */
        private final float dx2;

        public RelativeQuadTo(float f, float f2, float f3, float f4) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.dx1 = f;
            this.dy1 = f2;
            this.dx2 = f3;
            this.dy2 = f4;
        }

        public static /* synthetic */ RelativeQuadTo updateTimer(RelativeQuadTo relativeQuadTo, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeQuadTo.dx1;
            }
            if ((i & 2) != 0) {
                f2 = relativeQuadTo.dy1;
            }
            if ((i & 4) != 0) {
                f3 = relativeQuadTo.dx2;
            }
            if ((i & 8) != 0) {
                f4 = relativeQuadTo.dy2;
            }
            return relativeQuadTo.flushSample(f, f2, f3, f4);
        }

        /* renamed from: applyTask, reason: from getter */
        public final float getDx1() {
            return this.dx1;
        }

        /* renamed from: clipOrigin, reason: from getter */
        public final float getDy2() {
            return this.dy2;
        }

        public final float connectJob() {
            return this.dy2;
        }

        /* renamed from: detachStream, reason: from getter */
        public final float getDy1() {
            return this.dy1;
        }

        public final float drawField() {
            return this.dy1;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RelativeQuadTo)) {
                return false;
            }
            RelativeQuadTo relativeQuadTo = (RelativeQuadTo) other;
            return Float.compare(this.dx1, relativeQuadTo.dx1) == 0 && Float.compare(this.dy1, relativeQuadTo.dy1) == 0 && Float.compare(this.dx2, relativeQuadTo.dx2) == 0 && Float.compare(this.dy2, relativeQuadTo.dy2) == 0;
        }

        public final RelativeQuadTo flushSample(float dx1, float dy1, float dx2, float dy2) {
            return new RelativeQuadTo(dx1, dy1, dx2, dy2);
        }

        public int hashCode() {
            return (((((Float.hashCode(this.dx1) * 31) + Float.hashCode(this.dy1)) * 31) + Float.hashCode(this.dx2)) * 31) + Float.hashCode(this.dy2);
        }

        public final float injectMetric() {
            return this.dx1;
        }

        /* renamed from: popBlueprint, reason: from getter */
        public final float getDx2() {
            return this.dx2;
        }

        public final float releaseHeader() {
            return this.dx2;
        }

        public String toString() {
            return "RelativeQuadTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ')';
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0019\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/goldenboot/saga/zone/DrawerLoop$ClipboardState;", "Lcom/goldenboot/saga/zone/DrawerLoop;", "", "dx", "dy", "<init>", "(FF)V", "injectMetric", "()F", "detachStream", "releaseHeader", "(FF)Lcom/goldenboot/saga/zone/DrawerLoop$ClipboardState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "flushSample", "updateTimer", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.DrawerLoop$ClipboardState, reason: from toString */
    public static final /* data */ class RelativeMoveTo extends DrawerLoop {

        /* renamed from: detachStream, reason: from kotlin metadata and from toString */
        private final float dy;

        /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
        private final float dx;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RelativeMoveTo(float f, float f2) {
            super(r2, r2, 3, null);
            boolean z = false;
            this.dx = f;
            this.dy = f2;
        }

        public static /* synthetic */ RelativeMoveTo clipOrigin(RelativeMoveTo relativeMoveTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeMoveTo.dx;
            }
            if ((i & 2) != 0) {
                f2 = relativeMoveTo.dy;
            }
            return relativeMoveTo.releaseHeader(f, f2);
        }

        /* renamed from: detachStream, reason: from getter */
        public final float getDy() {
            return this.dy;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RelativeMoveTo)) {
                return false;
            }
            RelativeMoveTo relativeMoveTo = (RelativeMoveTo) other;
            return Float.compare(this.dx, relativeMoveTo.dx) == 0 && Float.compare(this.dy, relativeMoveTo.dy) == 0;
        }

        /* renamed from: flushSample, reason: from getter */
        public final float getDx() {
            return this.dx;
        }

        public int hashCode() {
            return (Float.hashCode(this.dx) * 31) + Float.hashCode(this.dy);
        }

        public final float injectMetric() {
            return this.dx;
        }

        public final RelativeMoveTo releaseHeader(float dx, float dy) {
            return new RelativeMoveTo(dx, dy);
        }

        public String toString() {
            return "RelativeMoveTo(dx=" + this.dx + ", dy=" + this.dy + ')';
        }

        public final float updateTimer() {
            return this.dy;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0019\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/goldenboot/saga/zone/DrawerLoop$EndpointList;", "Lcom/goldenboot/saga/zone/DrawerLoop;", "", "x", "y", "<init>", "(FF)V", "injectMetric", "()F", "detachStream", "releaseHeader", "(FF)Lcom/goldenboot/saga/zone/DrawerLoop$EndpointList;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "flushSample", "updateTimer", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.DrawerLoop$EndpointList, reason: from toString */
    public static final /* data */ class LineTo extends DrawerLoop {

        /* renamed from: detachStream, reason: from kotlin metadata and from toString */
        private final float y;

        /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
        private final float x;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public LineTo(float f, float f2) {
            super(r2, r2, 3, null);
            boolean z = false;
            this.x = f;
            this.y = f2;
        }

        public static /* synthetic */ LineTo clipOrigin(LineTo lineTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = lineTo.x;
            }
            if ((i & 2) != 0) {
                f2 = lineTo.y;
            }
            return lineTo.releaseHeader(f, f2);
        }

        /* renamed from: detachStream, reason: from getter */
        public final float getY() {
            return this.y;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LineTo)) {
                return false;
            }
            LineTo lineTo = (LineTo) other;
            return Float.compare(this.x, lineTo.x) == 0 && Float.compare(this.y, lineTo.y) == 0;
        }

        /* renamed from: flushSample, reason: from getter */
        public final float getX() {
            return this.x;
        }

        public int hashCode() {
            return (Float.hashCode(this.x) * 31) + Float.hashCode(this.y);
        }

        public final float injectMetric() {
            return this.x;
        }

        public final LineTo releaseHeader(float x, float y) {
            return new LineTo(x, y);
        }

        public String toString() {
            return "LineTo(x=" + this.x + ", y=" + this.y + ')';
        }

        public final float updateTimer() {
            return this.y;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b!\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b\"\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b#\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b$\u0010\fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b%\u0010\f¨\u0006&"}, d2 = {"Lcom/goldenboot/saga/zone/DrawerLoop$FeedbackFlow;", "Lcom/goldenboot/saga/zone/DrawerLoop;", "", "x1", "y1", "x2", "y2", "x3", "y3", "<init>", "(FFFFFF)V", "injectMetric", "()F", "detachStream", "releaseHeader", "clipOrigin", "flushSample", "updateTimer", "applyTask", "(FFFFFF)Lcom/goldenboot/saga/zone/DrawerLoop$FeedbackFlow;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "drawField", "serializeOffset", "connectJob", "reduceScope", "peekRevision", "notifyMessage", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.DrawerLoop$FeedbackFlow, reason: from toString */
    public static final /* data */ class CurveTo extends DrawerLoop {

        /* renamed from: clipOrigin, reason: from kotlin metadata and from toString */
        private final float y2;

        /* renamed from: detachStream, reason: from kotlin metadata and from toString */
        private final float y1;

        /* renamed from: flushSample, reason: from kotlin metadata and from toString */
        private final float x3;

        /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
        private final float x1;

        /* renamed from: releaseHeader, reason: from kotlin metadata and from toString */
        private final float x2;

        /* renamed from: updateTimer, reason: from kotlin metadata and from toString */
        private final float y3;

        public CurveTo(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, null);
            this.x1 = f;
            this.y1 = f2;
            this.x2 = f3;
            this.y2 = f4;
            this.x3 = f5;
            this.y3 = f6;
        }

        public static /* synthetic */ CurveTo popBlueprint(CurveTo curveTo, float f, float f2, float f3, float f4, float f5, float f6, int i, Object obj) {
            if ((i & 1) != 0) {
                f = curveTo.x1;
            }
            if ((i & 2) != 0) {
                f2 = curveTo.y1;
            }
            if ((i & 4) != 0) {
                f3 = curveTo.x2;
            }
            if ((i & 8) != 0) {
                f4 = curveTo.y2;
            }
            if ((i & 16) != 0) {
                f5 = curveTo.x3;
            }
            if ((i & 32) != 0) {
                f6 = curveTo.y3;
            }
            float f7 = f5;
            float f8 = f6;
            return curveTo.applyTask(f, f2, f3, f4, f7, f8);
        }

        public final CurveTo applyTask(float x1, float y1, float x2, float y2, float x3, float y3) {
            return new CurveTo(x1, y1, x2, y2, x3, y3);
        }

        /* renamed from: clipOrigin, reason: from getter */
        public final float getY2() {
            return this.y2;
        }

        /* renamed from: connectJob, reason: from getter */
        public final float getX2() {
            return this.x2;
        }

        /* renamed from: detachStream, reason: from getter */
        public final float getY1() {
            return this.y1;
        }

        /* renamed from: drawField, reason: from getter */
        public final float getX1() {
            return this.x1;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CurveTo)) {
                return false;
            }
            CurveTo curveTo = (CurveTo) other;
            return Float.compare(this.x1, curveTo.x1) == 0 && Float.compare(this.y1, curveTo.y1) == 0 && Float.compare(this.x2, curveTo.x2) == 0 && Float.compare(this.y2, curveTo.y2) == 0 && Float.compare(this.x3, curveTo.x3) == 0 && Float.compare(this.y3, curveTo.y3) == 0;
        }

        /* renamed from: flushSample, reason: from getter */
        public final float getX3() {
            return this.x3;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.x1) * 31) + Float.hashCode(this.y1)) * 31) + Float.hashCode(this.x2)) * 31) + Float.hashCode(this.y2)) * 31) + Float.hashCode(this.x3)) * 31) + Float.hashCode(this.y3);
        }

        public final float injectMetric() {
            return this.x1;
        }

        /* renamed from: notifyMessage, reason: from getter */
        public final float getY3() {
            return this.y3;
        }

        public final float peekRevision() {
            return this.x3;
        }

        public final float reduceScope() {
            return this.y2;
        }

        public final float releaseHeader() {
            return this.x2;
        }

        public final float serializeOffset() {
            return this.y1;
        }

        public String toString() {
            return "CurveTo(x1=" + this.x1 + ", y1=" + this.y1 + ", x2=" + this.x2 + ", y2=" + this.y2 + ", x3=" + this.x3 + ", y3=" + this.y3 + ')';
        }

        public final float updateTimer() {
            return this.y3;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b!\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b\"\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b#\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b$\u0010\fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b%\u0010\f¨\u0006&"}, d2 = {"Lcom/goldenboot/saga/zone/DrawerLoop$HeaderUtil;", "Lcom/goldenboot/saga/zone/DrawerLoop;", "", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "<init>", "(FFFFFF)V", "injectMetric", "()F", "detachStream", "releaseHeader", "clipOrigin", "flushSample", "updateTimer", "applyTask", "(FFFFFF)Lcom/goldenboot/saga/zone/DrawerLoop$HeaderUtil;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "drawField", "serializeOffset", "connectJob", "reduceScope", "peekRevision", "notifyMessage", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.DrawerLoop$HeaderUtil, reason: from toString */
    public static final /* data */ class RelativeCurveTo extends DrawerLoop {

        /* renamed from: clipOrigin, reason: from kotlin metadata and from toString */
        private final float dy2;

        /* renamed from: detachStream, reason: from kotlin metadata and from toString */
        private final float dy1;

        /* renamed from: flushSample, reason: from kotlin metadata and from toString */
        private final float dx3;

        /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
        private final float dx1;

        /* renamed from: releaseHeader, reason: from kotlin metadata and from toString */
        private final float dx2;

        /* renamed from: updateTimer, reason: from kotlin metadata and from toString */
        private final float dy3;

        public RelativeCurveTo(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, null);
            this.dx1 = f;
            this.dy1 = f2;
            this.dx2 = f3;
            this.dy2 = f4;
            this.dx3 = f5;
            this.dy3 = f6;
        }

        public static /* synthetic */ RelativeCurveTo popBlueprint(RelativeCurveTo relativeCurveTo, float f, float f2, float f3, float f4, float f5, float f6, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeCurveTo.dx1;
            }
            if ((i & 2) != 0) {
                f2 = relativeCurveTo.dy1;
            }
            if ((i & 4) != 0) {
                f3 = relativeCurveTo.dx2;
            }
            if ((i & 8) != 0) {
                f4 = relativeCurveTo.dy2;
            }
            if ((i & 16) != 0) {
                f5 = relativeCurveTo.dx3;
            }
            if ((i & 32) != 0) {
                f6 = relativeCurveTo.dy3;
            }
            float f7 = f5;
            float f8 = f6;
            return relativeCurveTo.applyTask(f, f2, f3, f4, f7, f8);
        }

        public final RelativeCurveTo applyTask(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3) {
            return new RelativeCurveTo(dx1, dy1, dx2, dy2, dx3, dy3);
        }

        /* renamed from: clipOrigin, reason: from getter */
        public final float getDy2() {
            return this.dy2;
        }

        /* renamed from: connectJob, reason: from getter */
        public final float getDx2() {
            return this.dx2;
        }

        /* renamed from: detachStream, reason: from getter */
        public final float getDy1() {
            return this.dy1;
        }

        /* renamed from: drawField, reason: from getter */
        public final float getDx1() {
            return this.dx1;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RelativeCurveTo)) {
                return false;
            }
            RelativeCurveTo relativeCurveTo = (RelativeCurveTo) other;
            return Float.compare(this.dx1, relativeCurveTo.dx1) == 0 && Float.compare(this.dy1, relativeCurveTo.dy1) == 0 && Float.compare(this.dx2, relativeCurveTo.dx2) == 0 && Float.compare(this.dy2, relativeCurveTo.dy2) == 0 && Float.compare(this.dx3, relativeCurveTo.dx3) == 0 && Float.compare(this.dy3, relativeCurveTo.dy3) == 0;
        }

        /* renamed from: flushSample, reason: from getter */
        public final float getDx3() {
            return this.dx3;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.dx1) * 31) + Float.hashCode(this.dy1)) * 31) + Float.hashCode(this.dx2)) * 31) + Float.hashCode(this.dy2)) * 31) + Float.hashCode(this.dx3)) * 31) + Float.hashCode(this.dy3);
        }

        public final float injectMetric() {
            return this.dx1;
        }

        /* renamed from: notifyMessage, reason: from getter */
        public final float getDy3() {
            return this.dy3;
        }

        public final float peekRevision() {
            return this.dx3;
        }

        public final float reduceScope() {
            return this.dy2;
        }

        public final float releaseHeader() {
            return this.dx2;
        }

        public final float serializeOffset() {
            return this.dy1;
        }

        public String toString() {
            return "RelativeCurveTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ", dx3=" + this.dx3 + ", dy3=" + this.dy3 + ')';
        }

        public final float updateTimer() {
            return this.dy3;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/goldenboot/saga/zone/DrawerLoop$HoverThrottle;", "Lcom/goldenboot/saga/zone/DrawerLoop;", "", "dx", "<init>", "(F)V", "injectMetric", "()F", "detachStream", "(F)Lcom/goldenboot/saga/zone/DrawerLoop$HoverThrottle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "clipOrigin", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.DrawerLoop$HoverThrottle, reason: from toString */
    public static final /* data */ class RelativeHorizontalTo extends DrawerLoop {

        /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
        private final float dx;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RelativeHorizontalTo(float f) {
            super(r2, r2, 3, null);
            boolean z = false;
            this.dx = f;
        }

        public static /* synthetic */ RelativeHorizontalTo releaseHeader(RelativeHorizontalTo relativeHorizontalTo, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeHorizontalTo.dx;
            }
            return relativeHorizontalTo.detachStream(f);
        }

        /* renamed from: clipOrigin, reason: from getter */
        public final float getDx() {
            return this.dx;
        }

        public final RelativeHorizontalTo detachStream(float dx) {
            return new RelativeHorizontalTo(dx);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RelativeHorizontalTo) && Float.compare(this.dx, ((RelativeHorizontalTo) other).dx) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.dx);
        }

        public final float injectMetric() {
            return this.dx;
        }

        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.dx + ')';
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/goldenboot/saga/zone/DrawerLoop$LayerUseCase;", "Lcom/goldenboot/saga/zone/DrawerLoop;", "", "x", "<init>", "(F)V", "injectMetric", "()F", "detachStream", "(F)Lcom/goldenboot/saga/zone/DrawerLoop$LayerUseCase;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "clipOrigin", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.DrawerLoop$LayerUseCase, reason: from toString */
    public static final /* data */ class HorizontalTo extends DrawerLoop {

        /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
        private final float x;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public HorizontalTo(float f) {
            super(r2, r2, 3, null);
            boolean z = false;
            this.x = f;
        }

        public static /* synthetic */ HorizontalTo releaseHeader(HorizontalTo horizontalTo, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = horizontalTo.x;
            }
            return horizontalTo.detachStream(f);
        }

        /* renamed from: clipOrigin, reason: from getter */
        public final float getX() {
            return this.x;
        }

        public final HorizontalTo detachStream(float x) {
            return new HorizontalTo(x);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HorizontalTo) && Float.compare(this.x, ((HorizontalTo) other).x) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.x);
        }

        public final float injectMetric() {
            return this.x;
        }

        public String toString() {
            return "HorizontalTo(x=" + this.x + ')';
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJV\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b$\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b%\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b'\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b(\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b)\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b*\u0010\u000e¨\u0006+"}, d2 = {"Lcom/goldenboot/saga/zone/DrawerLoop$MorphDirector;", "Lcom/goldenboot/saga/zone/DrawerLoop;", "", "horizontalEllipseRadius", "verticalEllipseRadius", "theta", "", "isMoreThanHalf", "isPositiveArc", "arcStartDx", "arcStartDy", "<init>", "(FFFZZFF)V", "injectMetric", "()F", "detachStream", "releaseHeader", "clipOrigin", "()Z", "flushSample", "updateTimer", "applyTask", "popBlueprint", "(FFFZZFF)Lcom/goldenboot/saga/zone/DrawerLoop$MorphDirector;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "F", "serializeOffset", "notifyMessage", "reduceScope", "Z", "connectPatch", "attachConfig", "connectJob", "peekRevision", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.DrawerLoop$MorphDirector, reason: from toString */
    public static final /* data */ class RelativeArcTo extends DrawerLoop {

        /* renamed from: applyTask, reason: from kotlin metadata and from toString */
        private final float arcStartDy;

        /* renamed from: clipOrigin, reason: from kotlin metadata and from toString */
        private final boolean isMoreThanHalf;

        /* renamed from: detachStream, reason: from kotlin metadata and from toString */
        private final float verticalEllipseRadius;

        /* renamed from: flushSample, reason: from kotlin metadata and from toString */
        private final boolean isPositiveArc;

        /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
        private final float horizontalEllipseRadius;

        /* renamed from: releaseHeader, reason: from kotlin metadata and from toString */
        private final float theta;

        /* renamed from: updateTimer, reason: from kotlin metadata and from toString */
        private final float arcStartDx;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RelativeArcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(r2, r2, 3, null);
            boolean z3 = false;
            this.horizontalEllipseRadius = f;
            this.verticalEllipseRadius = f2;
            this.theta = f3;
            this.isMoreThanHalf = z;
            this.isPositiveArc = z2;
            this.arcStartDx = f4;
            this.arcStartDy = f5;
        }

        public static /* synthetic */ RelativeArcTo drawField(RelativeArcTo relativeArcTo, float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeArcTo.horizontalEllipseRadius;
            }
            if ((i & 2) != 0) {
                f2 = relativeArcTo.verticalEllipseRadius;
            }
            if ((i & 4) != 0) {
                f3 = relativeArcTo.theta;
            }
            if ((i & 8) != 0) {
                z = relativeArcTo.isMoreThanHalf;
            }
            if ((i & 16) != 0) {
                z2 = relativeArcTo.isPositiveArc;
            }
            if ((i & 32) != 0) {
                f4 = relativeArcTo.arcStartDx;
            }
            if ((i & 64) != 0) {
                f5 = relativeArcTo.arcStartDy;
            }
            float f6 = f4;
            float f7 = f5;
            boolean z3 = z2;
            float f8 = f3;
            return relativeArcTo.popBlueprint(f, f2, f8, z, z3, f6, f7);
        }

        /* renamed from: applyTask, reason: from getter */
        public final float getArcStartDy() {
            return this.arcStartDy;
        }

        /* renamed from: attachConfig, reason: from getter */
        public final boolean getIsPositiveArc() {
            return this.isPositiveArc;
        }

        /* renamed from: clipOrigin, reason: from getter */
        public final boolean getIsMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        /* renamed from: connectJob, reason: from getter */
        public final float getArcStartDx() {
            return this.arcStartDx;
        }

        public final boolean connectPatch() {
            return this.isMoreThanHalf;
        }

        /* renamed from: detachStream, reason: from getter */
        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RelativeArcTo)) {
                return false;
            }
            RelativeArcTo relativeArcTo = (RelativeArcTo) other;
            return Float.compare(this.horizontalEllipseRadius, relativeArcTo.horizontalEllipseRadius) == 0 && Float.compare(this.verticalEllipseRadius, relativeArcTo.verticalEllipseRadius) == 0 && Float.compare(this.theta, relativeArcTo.theta) == 0 && this.isMoreThanHalf == relativeArcTo.isMoreThanHalf && this.isPositiveArc == relativeArcTo.isPositiveArc && Float.compare(this.arcStartDx, relativeArcTo.arcStartDx) == 0 && Float.compare(this.arcStartDy, relativeArcTo.arcStartDy) == 0;
        }

        public final boolean flushSample() {
            return this.isPositiveArc;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.horizontalEllipseRadius) * 31) + Float.hashCode(this.verticalEllipseRadius)) * 31) + Float.hashCode(this.theta)) * 31) + Boolean.hashCode(this.isMoreThanHalf)) * 31) + Boolean.hashCode(this.isPositiveArc)) * 31) + Float.hashCode(this.arcStartDx)) * 31) + Float.hashCode(this.arcStartDy);
        }

        /* renamed from: injectMetric, reason: from getter */
        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        public final float notifyMessage() {
            return this.verticalEllipseRadius;
        }

        public final float peekRevision() {
            return this.arcStartDy;
        }

        public final RelativeArcTo popBlueprint(float horizontalEllipseRadius, float verticalEllipseRadius, float theta, boolean isMoreThanHalf, boolean isPositiveArc, float arcStartDx, float arcStartDy) {
            return new RelativeArcTo(horizontalEllipseRadius, verticalEllipseRadius, theta, isMoreThanHalf, isPositiveArc, arcStartDx, arcStartDy);
        }

        /* renamed from: reduceScope, reason: from getter */
        public final float getTheta() {
            return this.theta;
        }

        public final float releaseHeader() {
            return this.theta;
        }

        public final float serializeOffset() {
            return this.horizontalEllipseRadius;
        }

        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.horizontalEllipseRadius + ", verticalEllipseRadius=" + this.verticalEllipseRadius + ", theta=" + this.theta + ", isMoreThanHalf=" + this.isMoreThanHalf + ", isPositiveArc=" + this.isPositiveArc + ", arcStartDx=" + this.arcStartDx + ", arcStartDy=" + this.arcStartDy + ')';
        }

        public final float updateTimer() {
            return this.arcStartDx;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/goldenboot/saga/zone/DrawerLoop$PanelUtil;", "Lcom/goldenboot/saga/zone/DrawerLoop;", "", "dy", "<init>", "(F)V", "injectMetric", "()F", "detachStream", "(F)Lcom/goldenboot/saga/zone/DrawerLoop$PanelUtil;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "clipOrigin", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.DrawerLoop$PanelUtil, reason: from toString */
    public static final /* data */ class RelativeVerticalTo extends DrawerLoop {

        /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
        private final float dy;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RelativeVerticalTo(float f) {
            super(r2, r2, 3, null);
            boolean z = false;
            this.dy = f;
        }

        public static /* synthetic */ RelativeVerticalTo releaseHeader(RelativeVerticalTo relativeVerticalTo, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeVerticalTo.dy;
            }
            return relativeVerticalTo.detachStream(f);
        }

        /* renamed from: clipOrigin, reason: from getter */
        public final float getDy() {
            return this.dy;
        }

        public final RelativeVerticalTo detachStream(float dy) {
            return new RelativeVerticalTo(dy);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RelativeVerticalTo) && Float.compare(this.dy, ((RelativeVerticalTo) other).dy) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.dy);
        }

        public final float injectMetric() {
            return this.dy;
        }

        public String toString() {
            return "RelativeVerticalTo(dy=" + this.dy + ')';
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001d\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001e\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001f\u0010\n¨\u0006 "}, d2 = {"Lcom/goldenboot/saga/zone/DrawerLoop$PluginInterpreter;", "Lcom/goldenboot/saga/zone/DrawerLoop;", "", "x1", "y1", "x2", "y2", "<init>", "(FFFF)V", "injectMetric", "()F", "detachStream", "releaseHeader", "clipOrigin", "flushSample", "(FFFF)Lcom/goldenboot/saga/zone/DrawerLoop$PluginInterpreter;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "applyTask", "drawField", "popBlueprint", "connectJob", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.DrawerLoop$PluginInterpreter, reason: from toString */
    public static final /* data */ class ReflectiveCurveTo extends DrawerLoop {

        /* renamed from: clipOrigin, reason: from kotlin metadata and from toString */
        private final float y2;

        /* renamed from: detachStream, reason: from kotlin metadata and from toString */
        private final float y1;

        /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
        private final float x1;

        /* renamed from: releaseHeader, reason: from kotlin metadata and from toString */
        private final float x2;

        public ReflectiveCurveTo(float f, float f2, float f3, float f4) {
            super(true, false, 2, null);
            this.x1 = f;
            this.y1 = f2;
            this.x2 = f3;
            this.y2 = f4;
        }

        public static /* synthetic */ ReflectiveCurveTo updateTimer(ReflectiveCurveTo reflectiveCurveTo, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = reflectiveCurveTo.x1;
            }
            if ((i & 2) != 0) {
                f2 = reflectiveCurveTo.y1;
            }
            if ((i & 4) != 0) {
                f3 = reflectiveCurveTo.x2;
            }
            if ((i & 8) != 0) {
                f4 = reflectiveCurveTo.y2;
            }
            return reflectiveCurveTo.flushSample(f, f2, f3, f4);
        }

        /* renamed from: applyTask, reason: from getter */
        public final float getX1() {
            return this.x1;
        }

        /* renamed from: clipOrigin, reason: from getter */
        public final float getY2() {
            return this.y2;
        }

        public final float connectJob() {
            return this.y2;
        }

        /* renamed from: detachStream, reason: from getter */
        public final float getY1() {
            return this.y1;
        }

        public final float drawField() {
            return this.y1;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReflectiveCurveTo)) {
                return false;
            }
            ReflectiveCurveTo reflectiveCurveTo = (ReflectiveCurveTo) other;
            return Float.compare(this.x1, reflectiveCurveTo.x1) == 0 && Float.compare(this.y1, reflectiveCurveTo.y1) == 0 && Float.compare(this.x2, reflectiveCurveTo.x2) == 0 && Float.compare(this.y2, reflectiveCurveTo.y2) == 0;
        }

        public final ReflectiveCurveTo flushSample(float x1, float y1, float x2, float y2) {
            return new ReflectiveCurveTo(x1, y1, x2, y2);
        }

        public int hashCode() {
            return (((((Float.hashCode(this.x1) * 31) + Float.hashCode(this.y1)) * 31) + Float.hashCode(this.x2)) * 31) + Float.hashCode(this.y2);
        }

        public final float injectMetric() {
            return this.x1;
        }

        /* renamed from: popBlueprint, reason: from getter */
        public final float getX2() {
            return this.x2;
        }

        public final float releaseHeader() {
            return this.x2;
        }

        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.x1 + ", y1=" + this.y1 + ", x2=" + this.x2 + ", y2=" + this.y2 + ')';
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0019\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/goldenboot/saga/zone/DrawerLoop$RemoteCallback;", "Lcom/goldenboot/saga/zone/DrawerLoop;", "", "dx", "dy", "<init>", "(FF)V", "injectMetric", "()F", "detachStream", "releaseHeader", "(FF)Lcom/goldenboot/saga/zone/DrawerLoop$RemoteCallback;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "flushSample", "updateTimer", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.DrawerLoop$RemoteCallback, reason: from toString */
    public static final /* data */ class RelativeLineTo extends DrawerLoop {

        /* renamed from: detachStream, reason: from kotlin metadata and from toString */
        private final float dy;

        /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
        private final float dx;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RelativeLineTo(float f, float f2) {
            super(r2, r2, 3, null);
            boolean z = false;
            this.dx = f;
            this.dy = f2;
        }

        public static /* synthetic */ RelativeLineTo clipOrigin(RelativeLineTo relativeLineTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeLineTo.dx;
            }
            if ((i & 2) != 0) {
                f2 = relativeLineTo.dy;
            }
            return relativeLineTo.releaseHeader(f, f2);
        }

        /* renamed from: detachStream, reason: from getter */
        public final float getDy() {
            return this.dy;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RelativeLineTo)) {
                return false;
            }
            RelativeLineTo relativeLineTo = (RelativeLineTo) other;
            return Float.compare(this.dx, relativeLineTo.dx) == 0 && Float.compare(this.dy, relativeLineTo.dy) == 0;
        }

        /* renamed from: flushSample, reason: from getter */
        public final float getDx() {
            return this.dx;
        }

        public int hashCode() {
            return (Float.hashCode(this.dx) * 31) + Float.hashCode(this.dy);
        }

        public final float injectMetric() {
            return this.dx;
        }

        public final RelativeLineTo releaseHeader(float dx, float dy) {
            return new RelativeLineTo(dx, dy);
        }

        public String toString() {
            return "RelativeLineTo(dx=" + this.dx + ", dy=" + this.dy + ')';
        }

        public final float updateTimer() {
            return this.dy;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0019\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/goldenboot/saga/zone/DrawerLoop$RestoreToggle;", "Lcom/goldenboot/saga/zone/DrawerLoop;", "", "x", "y", "<init>", "(FF)V", "injectMetric", "()F", "detachStream", "releaseHeader", "(FF)Lcom/goldenboot/saga/zone/DrawerLoop$RestoreToggle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "flushSample", "updateTimer", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.DrawerLoop$RestoreToggle, reason: from toString */
    public static final /* data */ class ReflectiveQuadTo extends DrawerLoop {

        /* renamed from: detachStream, reason: from kotlin metadata and from toString */
        private final float y;

        /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
        private final float x;

        public ReflectiveQuadTo(float f, float f2) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.x = f;
            this.y = f2;
        }

        public static /* synthetic */ ReflectiveQuadTo clipOrigin(ReflectiveQuadTo reflectiveQuadTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = reflectiveQuadTo.x;
            }
            if ((i & 2) != 0) {
                f2 = reflectiveQuadTo.y;
            }
            return reflectiveQuadTo.releaseHeader(f, f2);
        }

        /* renamed from: detachStream, reason: from getter */
        public final float getY() {
            return this.y;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReflectiveQuadTo)) {
                return false;
            }
            ReflectiveQuadTo reflectiveQuadTo = (ReflectiveQuadTo) other;
            return Float.compare(this.x, reflectiveQuadTo.x) == 0 && Float.compare(this.y, reflectiveQuadTo.y) == 0;
        }

        /* renamed from: flushSample, reason: from getter */
        public final float getX() {
            return this.x;
        }

        public int hashCode() {
            return (Float.hashCode(this.x) * 31) + Float.hashCode(this.y);
        }

        public final float injectMetric() {
            return this.x;
        }

        public final ReflectiveQuadTo releaseHeader(float x, float y) {
            return new ReflectiveQuadTo(x, y);
        }

        public String toString() {
            return "ReflectiveQuadTo(x=" + this.x + ", y=" + this.y + ')';
        }

        public final float updateTimer() {
            return this.y;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001d\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001e\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001f\u0010\n¨\u0006 "}, d2 = {"Lcom/goldenboot/saga/zone/DrawerLoop$ScopedMigration;", "Lcom/goldenboot/saga/zone/DrawerLoop;", "", "x1", "y1", "x2", "y2", "<init>", "(FFFF)V", "injectMetric", "()F", "detachStream", "releaseHeader", "clipOrigin", "flushSample", "(FFFF)Lcom/goldenboot/saga/zone/DrawerLoop$ScopedMigration;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "applyTask", "drawField", "popBlueprint", "connectJob", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.DrawerLoop$ScopedMigration, reason: from toString */
    public static final /* data */ class QuadTo extends DrawerLoop {

        /* renamed from: clipOrigin, reason: from kotlin metadata and from toString */
        private final float y2;

        /* renamed from: detachStream, reason: from kotlin metadata and from toString */
        private final float y1;

        /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
        private final float x1;

        /* renamed from: releaseHeader, reason: from kotlin metadata and from toString */
        private final float x2;

        public QuadTo(float f, float f2, float f3, float f4) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.x1 = f;
            this.y1 = f2;
            this.x2 = f3;
            this.y2 = f4;
        }

        public static /* synthetic */ QuadTo updateTimer(QuadTo quadTo, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = quadTo.x1;
            }
            if ((i & 2) != 0) {
                f2 = quadTo.y1;
            }
            if ((i & 4) != 0) {
                f3 = quadTo.x2;
            }
            if ((i & 8) != 0) {
                f4 = quadTo.y2;
            }
            return quadTo.flushSample(f, f2, f3, f4);
        }

        /* renamed from: applyTask, reason: from getter */
        public final float getX1() {
            return this.x1;
        }

        /* renamed from: clipOrigin, reason: from getter */
        public final float getY2() {
            return this.y2;
        }

        public final float connectJob() {
            return this.y2;
        }

        /* renamed from: detachStream, reason: from getter */
        public final float getY1() {
            return this.y1;
        }

        public final float drawField() {
            return this.y1;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuadTo)) {
                return false;
            }
            QuadTo quadTo = (QuadTo) other;
            return Float.compare(this.x1, quadTo.x1) == 0 && Float.compare(this.y1, quadTo.y1) == 0 && Float.compare(this.x2, quadTo.x2) == 0 && Float.compare(this.y2, quadTo.y2) == 0;
        }

        public final QuadTo flushSample(float x1, float y1, float x2, float y2) {
            return new QuadTo(x1, y1, x2, y2);
        }

        public int hashCode() {
            return (((((Float.hashCode(this.x1) * 31) + Float.hashCode(this.y1)) * 31) + Float.hashCode(this.x2)) * 31) + Float.hashCode(this.y2);
        }

        public final float injectMetric() {
            return this.x1;
        }

        /* renamed from: popBlueprint, reason: from getter */
        public final float getX2() {
            return this.x2;
        }

        public final float releaseHeader() {
            return this.x2;
        }

        public String toString() {
            return "QuadTo(x1=" + this.x1 + ", y1=" + this.y1 + ", x2=" + this.x2 + ", y2=" + this.y2 + ')';
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0019\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/goldenboot/saga/zone/DrawerLoop$SheetLink;", "Lcom/goldenboot/saga/zone/DrawerLoop;", "", "dx", "dy", "<init>", "(FF)V", "injectMetric", "()F", "detachStream", "releaseHeader", "(FF)Lcom/goldenboot/saga/zone/DrawerLoop$SheetLink;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "flushSample", "updateTimer", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.DrawerLoop$SheetLink, reason: from toString */
    public static final /* data */ class RelativeReflectiveQuadTo extends DrawerLoop {

        /* renamed from: detachStream, reason: from kotlin metadata and from toString */
        private final float dy;

        /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
        private final float dx;

        public RelativeReflectiveQuadTo(float f, float f2) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.dx = f;
            this.dy = f2;
        }

        public static /* synthetic */ RelativeReflectiveQuadTo clipOrigin(RelativeReflectiveQuadTo relativeReflectiveQuadTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeReflectiveQuadTo.dx;
            }
            if ((i & 2) != 0) {
                f2 = relativeReflectiveQuadTo.dy;
            }
            return relativeReflectiveQuadTo.releaseHeader(f, f2);
        }

        /* renamed from: detachStream, reason: from getter */
        public final float getDy() {
            return this.dy;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RelativeReflectiveQuadTo)) {
                return false;
            }
            RelativeReflectiveQuadTo relativeReflectiveQuadTo = (RelativeReflectiveQuadTo) other;
            return Float.compare(this.dx, relativeReflectiveQuadTo.dx) == 0 && Float.compare(this.dy, relativeReflectiveQuadTo.dy) == 0;
        }

        /* renamed from: flushSample, reason: from getter */
        public final float getDx() {
            return this.dx;
        }

        public int hashCode() {
            return (Float.hashCode(this.dx) * 31) + Float.hashCode(this.dy);
        }

        public final float injectMetric() {
            return this.dx;
        }

        public final RelativeReflectiveQuadTo releaseHeader(float dx, float dy) {
            return new RelativeReflectiveQuadTo(dx, dy);
        }

        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.dx + ", dy=" + this.dy + ')';
        }

        public final float updateTimer() {
            return this.dy;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0019\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/goldenboot/saga/zone/DrawerLoop$StylusConverter;", "Lcom/goldenboot/saga/zone/DrawerLoop;", "", "x", "y", "<init>", "(FF)V", "injectMetric", "()F", "detachStream", "releaseHeader", "(FF)Lcom/goldenboot/saga/zone/DrawerLoop$StylusConverter;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "flushSample", "updateTimer", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.DrawerLoop$StylusConverter, reason: from toString */
    public static final /* data */ class MoveTo extends DrawerLoop {

        /* renamed from: detachStream, reason: from kotlin metadata and from toString */
        private final float y;

        /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
        private final float x;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public MoveTo(float f, float f2) {
            super(r2, r2, 3, null);
            boolean z = false;
            this.x = f;
            this.y = f2;
        }

        public static /* synthetic */ MoveTo clipOrigin(MoveTo moveTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = moveTo.x;
            }
            if ((i & 2) != 0) {
                f2 = moveTo.y;
            }
            return moveTo.releaseHeader(f, f2);
        }

        /* renamed from: detachStream, reason: from getter */
        public final float getY() {
            return this.y;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MoveTo)) {
                return false;
            }
            MoveTo moveTo = (MoveTo) other;
            return Float.compare(this.x, moveTo.x) == 0 && Float.compare(this.y, moveTo.y) == 0;
        }

        /* renamed from: flushSample, reason: from getter */
        public final float getX() {
            return this.x;
        }

        public int hashCode() {
            return (Float.hashCode(this.x) * 31) + Float.hashCode(this.y);
        }

        public final float injectMetric() {
            return this.x;
        }

        public final MoveTo releaseHeader(float x, float y) {
            return new MoveTo(x, y);
        }

        public String toString() {
            return "MoveTo(x=" + this.x + ", y=" + this.y + ')';
        }

        public final float updateTimer() {
            return this.y;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001d\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001e\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001f\u0010\n¨\u0006 "}, d2 = {"Lcom/goldenboot/saga/zone/DrawerLoop$TransitionThrottle;", "Lcom/goldenboot/saga/zone/DrawerLoop;", "", "dx1", "dy1", "dx2", "dy2", "<init>", "(FFFF)V", "injectMetric", "()F", "detachStream", "releaseHeader", "clipOrigin", "flushSample", "(FFFF)Lcom/goldenboot/saga/zone/DrawerLoop$TransitionThrottle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "applyTask", "drawField", "popBlueprint", "connectJob", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.DrawerLoop$TransitionThrottle, reason: from toString */
    public static final /* data */ class RelativeReflectiveCurveTo extends DrawerLoop {

        /* renamed from: clipOrigin, reason: from kotlin metadata and from toString */
        private final float dy2;

        /* renamed from: detachStream, reason: from kotlin metadata and from toString */
        private final float dy1;

        /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
        private final float dx1;

        /* renamed from: releaseHeader, reason: from kotlin metadata and from toString */
        private final float dx2;

        public RelativeReflectiveCurveTo(float f, float f2, float f3, float f4) {
            super(true, false, 2, null);
            this.dx1 = f;
            this.dy1 = f2;
            this.dx2 = f3;
            this.dy2 = f4;
        }

        public static /* synthetic */ RelativeReflectiveCurveTo updateTimer(RelativeReflectiveCurveTo relativeReflectiveCurveTo, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeReflectiveCurveTo.dx1;
            }
            if ((i & 2) != 0) {
                f2 = relativeReflectiveCurveTo.dy1;
            }
            if ((i & 4) != 0) {
                f3 = relativeReflectiveCurveTo.dx2;
            }
            if ((i & 8) != 0) {
                f4 = relativeReflectiveCurveTo.dy2;
            }
            return relativeReflectiveCurveTo.flushSample(f, f2, f3, f4);
        }

        /* renamed from: applyTask, reason: from getter */
        public final float getDx1() {
            return this.dx1;
        }

        /* renamed from: clipOrigin, reason: from getter */
        public final float getDy2() {
            return this.dy2;
        }

        public final float connectJob() {
            return this.dy2;
        }

        /* renamed from: detachStream, reason: from getter */
        public final float getDy1() {
            return this.dy1;
        }

        public final float drawField() {
            return this.dy1;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RelativeReflectiveCurveTo)) {
                return false;
            }
            RelativeReflectiveCurveTo relativeReflectiveCurveTo = (RelativeReflectiveCurveTo) other;
            return Float.compare(this.dx1, relativeReflectiveCurveTo.dx1) == 0 && Float.compare(this.dy1, relativeReflectiveCurveTo.dy1) == 0 && Float.compare(this.dx2, relativeReflectiveCurveTo.dx2) == 0 && Float.compare(this.dy2, relativeReflectiveCurveTo.dy2) == 0;
        }

        public final RelativeReflectiveCurveTo flushSample(float dx1, float dy1, float dx2, float dy2) {
            return new RelativeReflectiveCurveTo(dx1, dy1, dx2, dy2);
        }

        public int hashCode() {
            return (((((Float.hashCode(this.dx1) * 31) + Float.hashCode(this.dy1)) * 31) + Float.hashCode(this.dx2)) * 31) + Float.hashCode(this.dy2);
        }

        public final float injectMetric() {
            return this.dx1;
        }

        /* renamed from: popBlueprint, reason: from getter */
        public final float getDx2() {
            return this.dx2;
        }

        public final float releaseHeader() {
            return this.dx2;
        }

        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ')';
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/goldenboot/saga/zone/DrawerLoop$TriggerResolver;", "Lcom/goldenboot/saga/zone/DrawerLoop;", "", "y", "<init>", "(F)V", "injectMetric", "()F", "detachStream", "(F)Lcom/goldenboot/saga/zone/DrawerLoop$TriggerResolver;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "clipOrigin", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.DrawerLoop$TriggerResolver, reason: from toString */
    public static final /* data */ class VerticalTo extends DrawerLoop {

        /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
        private final float y;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public VerticalTo(float f) {
            super(r2, r2, 3, null);
            boolean z = false;
            this.y = f;
        }

        public static /* synthetic */ VerticalTo releaseHeader(VerticalTo verticalTo, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = verticalTo.y;
            }
            return verticalTo.detachStream(f);
        }

        /* renamed from: clipOrigin, reason: from getter */
        public final float getY() {
            return this.y;
        }

        public final VerticalTo detachStream(float y) {
            return new VerticalTo(y);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VerticalTo) && Float.compare(this.y, ((VerticalTo) other).y) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.y);
        }

        public final float injectMetric() {
            return this.y;
        }

        public String toString() {
            return "VerticalTo(y=" + this.y + ')';
        }
    }

    public /* synthetic */ DrawerLoop(boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2);
    }

    /* renamed from: evictLayout, reason: from getter */
    public final boolean getIsCurve() {
        return this.isCurve;
    }

    /* renamed from: growPayload, reason: from getter */
    public final boolean getIsQuad() {
        return this.isQuad;
    }

    private DrawerLoop(boolean z, boolean z2) {
        this.isCurve = z;
        this.isQuad = z2;
    }

    public /* synthetic */ DrawerLoop(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, null);
    }
}
