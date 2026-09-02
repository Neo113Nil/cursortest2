package com.goldenboot.saga.zone;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001f\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR#\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0 8\u0006¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b\u001c\u0010\"R'\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u00050$j\b\u0012\u0004\u0012\u00020\u0005`%8\u0006¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b'\u0010(R'\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u00050$j\b\u0012\u0004\u0012\u00020\u0005`%8\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b*\u0010(¨\u0006,"}, d2 = {"Lcom/goldenboot/saga/zone/SheetInjector;", "", "<init>", "()V", "", "Landroid/view/View;", "views", "Landroid/view/ViewGroup;", "root", "", "isRtl", "Lcom/goldenboot/saga/zone/DpadBuilder;", "connectJob", "([Landroid/view/View;Landroid/view/ViewGroup;Z)V", "Lcom/goldenboot/saga/zone/SlotWorkflow;", "Landroid/graphics/Rect;", "growPayload", "Lcom/goldenboot/saga/zone/SlotWorkflow;", "releaseHeader", "()Lcom/goldenboot/saga/zone/SlotWorkflow;", "rectPool", "", "injectMetric", "I", "()I", "applyTask", "(I)V", "lastPoolIndex", "detachStream", "clipOrigin", "popBlueprint", "rtlMult", "Lcom/goldenboot/saga/zone/ParallelHeap;", "Lcom/goldenboot/saga/zone/ParallelHeap;", "()Lcom/goldenboot/saga/zone/ParallelHeap;", "rectByView", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "Ljava/util/Comparator;", "updateTimer", "()Ljava/util/Comparator;", "topsComparator", "flushSample", "sidesComparator", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class SheetInjector {

    /* renamed from: injectMetric, reason: from kotlin metadata */
    private static int lastPoolIndex;
    public static final SheetInjector evictLayout = new SheetInjector();

    /* renamed from: growPayload, reason: from kotlin metadata */
    private static final SlotWorkflow rectPool = new SlotWorkflow(0, 1, null);

    /* renamed from: detachStream, reason: from kotlin metadata */
    private static int rtlMult = 1;

    /* renamed from: releaseHeader, reason: from kotlin metadata */
    private static final ParallelHeap rectByView = TileRunner.growPayload();

    /* renamed from: clipOrigin, reason: from kotlin metadata */
    private static final Comparator<View> topsComparator = new Comparator() { // from class: com.goldenboot.saga.zone.ProxyGuard
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int peekRevision;
            peekRevision = SheetInjector.peekRevision((View) obj, (View) obj2);
            return peekRevision;
        }
    };

    /* renamed from: flushSample, reason: from kotlin metadata */
    private static final Comparator<View> sidesComparator = new Comparator() { // from class: com.goldenboot.saga.zone.PublisherBus
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int drawField;
            drawField = SheetInjector.drawField((View) obj, (View) obj2);
            return drawField;
        }
    };

    private SheetInjector() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int drawField(View view, View view2) {
        if (view == view2) {
            return 0;
        }
        ParallelHeap parallelHeap = rectByView;
        Object releaseHeader = parallelHeap.releaseHeader(view);
        Intrinsics.checkNotNull(releaseHeader);
        Rect rect = (Rect) releaseHeader;
        Object releaseHeader2 = parallelHeap.releaseHeader(view2);
        Intrinsics.checkNotNull(releaseHeader2);
        Rect rect2 = (Rect) releaseHeader2;
        int i = rect.left - rect2.left;
        return i == 0 ? (rect.right - rect2.right) * rtlMult : i * rtlMult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int peekRevision(View view, View view2) {
        if (view == view2) {
            return 0;
        }
        ParallelHeap parallelHeap = rectByView;
        Object releaseHeader = parallelHeap.releaseHeader(view);
        Intrinsics.checkNotNull(releaseHeader);
        Rect rect = (Rect) releaseHeader;
        Object releaseHeader2 = parallelHeap.releaseHeader(view2);
        Intrinsics.checkNotNull(releaseHeader2);
        Rect rect2 = (Rect) releaseHeader2;
        int i = rect.top - rect2.top;
        return i == 0 ? rect.bottom - rect2.bottom : i;
    }

    public final void applyTask(int i) {
        lastPoolIndex = i;
    }

    public final int clipOrigin() {
        return rtlMult;
    }

    public final void connectJob(View[] views, ViewGroup root, boolean isRtl) {
        int length = views.length;
        if (length < 2) {
            return;
        }
        int detachStream = length - rectPool.detachStream();
        for (int i = 0; i < detachStream; i++) {
            rectPool.drawField(new Rect());
        }
        for (View view : views) {
            SlotWorkflow slotWorkflow = rectPool;
            int i2 = lastPoolIndex;
            lastPoolIndex = i2 + 1;
            Rect rect = (Rect) slotWorkflow.injectMetric(i2);
            view.getDrawingRect(rect);
            root.offsetDescendantRectToMyCoords(view, rect);
            rectByView.decodePath(view, rect);
        }
        InsetsReader.filterPayload(views, topsComparator);
        Object releaseHeader = rectByView.releaseHeader(views[0]);
        Intrinsics.checkNotNull(releaseHeader);
        int i3 = ((Rect) releaseHeader).bottom;
        rtlMult = isRtl ? -1 : 1;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            Object releaseHeader2 = rectByView.releaseHeader(views[i5]);
            Intrinsics.checkNotNull(releaseHeader2);
            Rect rect2 = (Rect) releaseHeader2;
            if (rect2.top >= i3) {
                if (i5 - i4 > 1) {
                    InsetsReader.inflateEdge(views, sidesComparator, i4, i5);
                }
                i3 = rect2.bottom;
                i4 = i5;
            } else {
                i3 = Math.max(i3, rect2.bottom);
            }
        }
        if (length - i4 > 1) {
            InsetsReader.inflateEdge(views, sidesComparator, i4, length);
        }
        lastPoolIndex = 0;
        rectByView.drawField();
    }

    public final ParallelHeap detachStream() {
        return rectByView;
    }

    public final Comparator<View> flushSample() {
        return sidesComparator;
    }

    public final int injectMetric() {
        return lastPoolIndex;
    }

    public final void popBlueprint(int i) {
        rtlMult = i;
    }

    public final SlotWorkflow releaseHeader() {
        return rectPool;
    }

    public final Comparator<View> updateTimer() {
        return topsComparator;
    }
}
