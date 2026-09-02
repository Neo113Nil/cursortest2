package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000fJ\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000fJ\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u000fJ\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000fJ\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR+\u0010 \u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010\u000b¨\u0006!"}, d2 = {"Lcom/goldenboot/saga/zone/ListenerBuffer;", "", "Lcom/goldenboot/saga/zone/ContentRepository;", "layoutNode", "Lcom/goldenboot/saga/zone/FlexMaterializer;", "policy", "<init>", "(Lcom/goldenboot/saga/zone/ContentRepository;Lcom/goldenboot/saga/zone/FlexMaterializer;)V", "measurePolicy", "Lcom/goldenboot/saga/zone/DpadBuilder;", "connectJob", "(Lcom/goldenboot/saga/zone/FlexMaterializer;)V", "", "height", "updateTimer", "(I)I", "width", "flushSample", "detachStream", "injectMetric", "popBlueprint", "applyTask", "clipOrigin", "releaseHeader", "evictLayout", "Lcom/goldenboot/saga/zone/ContentRepository;", "()Lcom/goldenboot/saga/zone/ContentRepository;", "<set-?>", "growPayload", "Lcom/goldenboot/saga/zone/SlotDispatcher;", "()Lcom/goldenboot/saga/zone/FlexMaterializer;", "drawField", "measurePolicyState", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListenerBuffer {
    public static final int injectMetric = 8;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final ContentRepository layoutNode;

    /* renamed from: growPayload, reason: from kotlin metadata */
    private final SlotDispatcher measurePolicyState;

    public ListenerBuffer(ContentRepository contentRepository, FlexMaterializer flexMaterializer) {
        this.layoutNode = contentRepository;
        this.measurePolicyState = StylusDetector.releaseHeader(flexMaterializer, null, 2, null);
    }

    private final void drawField(FlexMaterializer flexMaterializer) {
        this.measurePolicyState.setValue(flexMaterializer);
    }

    private final FlexMaterializer growPayload() {
        return (FlexMaterializer) this.measurePolicyState.getValue();
    }

    public final int applyTask(int width) {
        return growPayload().releaseHeader(this.layoutNode.searchHolder(), this.layoutNode.serializeTask(), width);
    }

    public final int clipOrigin(int height) {
        return growPayload().injectMetric(this.layoutNode.searchHolder(), this.layoutNode.serializeTask(), height);
    }

    public final void connectJob(FlexMaterializer measurePolicy) {
        drawField(measurePolicy);
    }

    public final int detachStream(int height) {
        return growPayload().injectMetric(this.layoutNode.searchHolder(), this.layoutNode.injectField(), height);
    }

    /* renamed from: evictLayout, reason: from getter */
    public final ContentRepository getLayoutNode() {
        return this.layoutNode;
    }

    public final int flushSample(int width) {
        return growPayload().releaseHeader(this.layoutNode.searchHolder(), this.layoutNode.injectField(), width);
    }

    public final int injectMetric(int width) {
        return growPayload().growPayload(this.layoutNode.searchHolder(), this.layoutNode.injectField(), width);
    }

    public final int popBlueprint(int height) {
        return growPayload().detachStream(this.layoutNode.searchHolder(), this.layoutNode.serializeTask(), height);
    }

    public final int releaseHeader(int width) {
        return growPayload().growPayload(this.layoutNode.searchHolder(), this.layoutNode.serializeTask(), width);
    }

    public final int updateTimer(int height) {
        return growPayload().detachStream(this.layoutNode.searchHolder(), this.layoutNode.injectField(), height);
    }
}
