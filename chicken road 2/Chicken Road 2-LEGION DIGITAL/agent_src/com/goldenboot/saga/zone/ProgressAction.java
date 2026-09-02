package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006JD\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJB\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lcom/goldenboot/saga/zone/ProgressAction;", "Lcom/goldenboot/saga/zone/BackgroundCollection;", "Lcom/goldenboot/saga/zone/TimelineShaper;", "pass", "Lcom/goldenboot/saga/zone/DrawableCustodian;", "readHeader", "(Lcom/goldenboot/saga/zone/TimelineShaper;Lcom/goldenboot/saga/zone/ServiceRegulator;)Ljava/lang/Object;", "T", "", "timeMillis", "Lkotlin/Function2;", "Lcom/goldenboot/saga/zone/ServiceRegulator;", "", "block", "detachFormat", "(JLcom/goldenboot/saga/zone/IconExporter;Lcom/goldenboot/saga/zone/ServiceRegulator;)Ljava/lang/Object;", "performValue", "Lcom/goldenboot/saga/zone/ScaleSaver;", "applyTask", "()J", "size", "Lcom/goldenboot/saga/zone/ShapeSender;", "resolveDelta", "extendedTouchPadding", "flattenToken", "()Lcom/goldenboot/saga/zone/DrawableCustodian;", "currentEvent", "Lcom/goldenboot/saga/zone/InitMerger;", "getViewConfiguration", "()Lcom/goldenboot/saga/zone/InitMerger;", "viewConfiguration", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ProgressAction extends BackgroundCollection {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class ActivityMutator {
        @Deprecated
        public static float applyTask(ProgressAction progressAction, long j) {
            return ProgressAction.super.disposeVersion(j);
        }

        @Deprecated
        public static float clipOrigin(ProgressAction progressAction, float f) {
            return ProgressAction.super.pushPatch(f);
        }

        @Deprecated
        public static long connectJob(ProgressAction progressAction, long j) {
            return ProgressAction.super.filterFormat(j);
        }

        @Deprecated
        public static <T> Object connectPatch(ProgressAction progressAction, long j, IconExporter iconExporter, ServiceRegulator serviceRegulator) {
            return ProgressAction.super.detachFormat(j, iconExporter, serviceRegulator);
        }

        @Deprecated
        public static int detachStream(ProgressAction progressAction, float f) {
            return ProgressAction.super.lookupStream(f);
        }

        @Deprecated
        public static ChipSnapshot drawField(ProgressAction progressAction, DpRect dpRect) {
            return ProgressAction.super.collectPolicy(dpRect);
        }

        @Deprecated
        public static float flushSample(ProgressAction progressAction, int i) {
            return ProgressAction.super.reduceSchema(i);
        }

        @Deprecated
        public static long growPayload(ProgressAction progressAction) {
            return ProgressAction.super.resolveDelta();
        }

        @Deprecated
        public static int injectMetric(ProgressAction progressAction, long j) {
            return ProgressAction.super.flattenAsset(j);
        }

        @Deprecated
        public static <T> Object notifyMessage(ProgressAction progressAction, long j, IconExporter iconExporter, ServiceRegulator serviceRegulator) {
            return ProgressAction.super.performValue(j, iconExporter, serviceRegulator);
        }

        @Deprecated
        public static long peekRevision(ProgressAction progressAction, float f) {
            return ProgressAction.super.filterPayload(f);
        }

        @Deprecated
        public static float popBlueprint(ProgressAction progressAction, float f) {
            return ProgressAction.super.purgeEdge(f);
        }

        @Deprecated
        public static long reduceScope(ProgressAction progressAction, int i) {
            return ProgressAction.super.broadcastPacket(i);
        }

        @Deprecated
        public static float releaseHeader(ProgressAction progressAction, long j) {
            return ProgressAction.super.packPackage(j);
        }

        @Deprecated
        public static long serializeOffset(ProgressAction progressAction, float f) {
            return ProgressAction.super.commitItem(f);
        }

        @Deprecated
        public static long updateTimer(ProgressAction progressAction, long j) {
            return ProgressAction.super.evictOrigin(j);
        }
    }

    static /* synthetic */ <T> Object escapeCurrency(ProgressAction progressAction, long j, IconExporter iconExporter, ServiceRegulator serviceRegulator) {
        return iconExporter.invoke(progressAction, serviceRegulator);
    }

    static /* synthetic */ Object reduceIndex(ProgressAction progressAction, TimelineShaper timelineShaper, ServiceRegulator serviceRegulator, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i & 1) != 0) {
            timelineShaper = TimelineShaper.notifyMessage;
        }
        return progressAction.readHeader(timelineShaper, serviceRegulator);
    }

    static /* synthetic */ <T> Object reduceTimezone(ProgressAction progressAction, long j, IconExporter iconExporter, ServiceRegulator serviceRegulator) {
        return iconExporter.invoke(progressAction, serviceRegulator);
    }

    long applyTask();

    default <T> Object detachFormat(long j, IconExporter iconExporter, ServiceRegulator serviceRegulator) {
        return escapeCurrency(this, j, iconExporter, serviceRegulator);
    }

    DrawableCustodian flattenToken();

    InitMerger getViewConfiguration();

    default <T> Object performValue(long j, IconExporter iconExporter, ServiceRegulator serviceRegulator) {
        return reduceTimezone(this, j, iconExporter, serviceRegulator);
    }

    Object readHeader(TimelineShaper timelineShaper, ServiceRegulator serviceRegulator);

    default long resolveDelta() {
        return ShapeSender.INSTANCE.injectMetric();
    }
}
