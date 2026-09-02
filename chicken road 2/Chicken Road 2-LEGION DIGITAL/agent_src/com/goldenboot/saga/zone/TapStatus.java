package com.goldenboot.saga.zone;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class TapStatus extends LocalEdge {
    public final /* synthetic */ AtomicReferenceArray clipOrigin;
    public final PipelineUploader releaseHeader;

    public TapStatus(long j, TapStatus tapStatus, PipelineUploader pipelineUploader, int i) {
        super(j, tapStatus, i);
        this.releaseHeader = pipelineUploader;
        this.clipOrigin = new AtomicReferenceArray(StylusImporter.growPayload * 2);
    }

    @Override // com.goldenboot.saga.zone.LocalEdge
    public int attachConfig() {
        return StylusImporter.growPayload;
    }

    public final Object decodePath(int i, Object obj) {
        return expandArgs().getAndSet((i * 2) + 1, obj);
    }

    public final boolean drawRequest(int i, Object obj, Object obj2) {
        return SocketRing.evictLayout(expandArgs(), (i * 2) + 1, obj, obj2);
    }

    public final PipelineUploader drawScope() {
        PipelineUploader pipelineUploader = this.releaseHeader;
        Intrinsics.checkNotNull(pipelineUploader);
        return pipelineUploader;
    }

    public final /* synthetic */ AtomicReferenceArray expandArgs() {
        return this.clipOrigin;
    }

    public final void filterPayload(int i, Object obj) {
        injectConstraint(i, obj);
    }

    public final Object findTask(int i) {
        return expandArgs().get(i * 2);
    }

    public final Object flattenPackage(int i) {
        Object findTask = findTask(i);
        gatherAdapter(i);
        return findTask;
    }

    public final void gatherAdapter(int i) {
        injectConstraint(i, null);
    }

    public final void injectConstraint(int i, Object obj) {
        expandArgs().set(i * 2, obj);
    }

    public final Object mergeLocale(int i) {
        return expandArgs().get((i * 2) + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0062, code lost:
    
        gatherAdapter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0065, code lost:
    
        if (r0 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0067, code lost:
    
        r3 = drawScope().notifyMessage;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006d, code lost:
    
        if (r3 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x006f, code lost:
    
        com.goldenboot.saga.zone.WatcherCheckpoint.evictLayout(r3, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // com.goldenboot.saga.zone.LocalEdge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void resetDelta(int i, Throwable th, LongPressGateway longPressGateway) {
        TouchRecord touchRecord;
        RowMutex rowMutex;
        RowMutex rowMutex2;
        RowMutex rowMutex3;
        RowMutex rowMutex4;
        RowMutex rowMutex5;
        int i2 = StylusImporter.growPayload;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        Object findTask = findTask(i);
        while (true) {
            Object mergeLocale = mergeLocale(i);
            if (!(mergeLocale instanceof RuntimeSegment) && !(mergeLocale instanceof AlphaTransformer)) {
                rowMutex = StylusImporter.popBlueprint;
                if (mergeLocale == rowMutex) {
                    break;
                }
                rowMutex2 = StylusImporter.drawField;
                if (mergeLocale == rowMutex2) {
                    break;
                }
                rowMutex3 = StylusImporter.flushSample;
                if (mergeLocale != rowMutex3) {
                    rowMutex4 = StylusImporter.clipOrigin;
                    if (mergeLocale != rowMutex4) {
                        rowMutex5 = StylusImporter.applyTask;
                        if (mergeLocale == rowMutex5 || mergeLocale == StylusImporter.detachStream || mergeLocale == StylusImporter.expandArgs()) {
                            return;
                        }
                        throw new IllegalStateException(("unexpected state: " + mergeLocale).toString());
                    }
                } else {
                    continue;
                }
            } else {
                if (drawRequest(i, mergeLocale, z ? StylusImporter.popBlueprint : StylusImporter.drawField)) {
                    gatherAdapter(i);
                    syncScope(i, !z);
                    if (!z || (touchRecord = drawScope().notifyMessage) == null) {
                        return;
                    }
                    WatcherCheckpoint.evictLayout(touchRecord, findTask, longPressGateway);
                    return;
                }
            }
        }
    }

    public final void storeCharset(int i, Object obj) {
        expandArgs().set((i * 2) + 1, obj);
    }

    public final void syncScope(int i, boolean z) {
        if (z) {
            drawScope().updateRule((this.injectMetric * StylusImporter.growPayload) + i);
        }
        inflateAdapter();
    }
}
