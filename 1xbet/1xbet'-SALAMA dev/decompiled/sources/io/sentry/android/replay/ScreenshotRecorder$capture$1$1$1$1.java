package io.sentry.android.replay;

import Y4.D;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import io.sentry.android.replay.util.TextLayout;
import io.sentry.android.replay.util.ViewsKt;
import io.sentry.android.replay.viewhierarchy.ViewHierarchyNode;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import p044f6.d;
import t6.h;
import t6.i;

/* JADX INFO: loaded from: classes2.dex */
public final class ScreenshotRecorder$capture$1$1$1$1 extends i implements Function1 {
    final /* synthetic */ Canvas $canvas;
    final /* synthetic */ List<Rect> $debugMasks;
    final /* synthetic */ ScreenshotRecorder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenshotRecorder$capture$1$1$1$1(ScreenshotRecorder screenshotRecorder, List<Rect> list, Canvas canvas) {
        super(1);
        this.this$0 = screenshotRecorder;
        this.$debugMasks = list;
        this.$canvas = canvas;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ViewHierarchyNode viewHierarchyNode) {
        d dVar;
        Integer dominantColor;
        h.e(viewHierarchyNode, "node");
        if (viewHierarchyNode.getShouldMask() && viewHierarchyNode.getWidth() > 0 && viewHierarchyNode.getHeight() > 0) {
            if (viewHierarchyNode.getVisibleRect() == null) {
                return Boolean.FALSE;
            }
            if (viewHierarchyNode instanceof ViewHierarchyNode.ImageViewHierarchyNode) {
                List listD = D.D(viewHierarchyNode.getVisibleRect());
                ScreenshotRecorder screenshotRecorder = this.this$0;
                dVar = new d(listD, Integer.valueOf(screenshotRecorder.dominantColorForRect(screenshotRecorder.screenshot, viewHierarchyNode.getVisibleRect())));
            } else {
                if (viewHierarchyNode instanceof ViewHierarchyNode.TextViewHierarchyNode) {
                    ViewHierarchyNode.TextViewHierarchyNode textViewHierarchyNode = (ViewHierarchyNode.TextViewHierarchyNode) viewHierarchyNode;
                    TextLayout layout = textViewHierarchyNode.getLayout();
                    dVar = new d(ViewsKt.getVisibleRects(textViewHierarchyNode.getLayout(), viewHierarchyNode.getVisibleRect(), textViewHierarchyNode.getPaddingLeft(), textViewHierarchyNode.getPaddingTop()), Integer.valueOf(((layout == null || (dominantColor = layout.getDominantTextColor()) == null) && (dominantColor = textViewHierarchyNode.getDominantColor()) == null) ? -16777216 : dominantColor.intValue()));
                } else {
                    dVar = new d(D.D(viewHierarchyNode.getVisibleRect()), -16777216);
                }
            }
            List list = (List) dVar.f13006a;
            this.this$0.getMaskingPaint().setColor(((Number) dVar.f13007b).intValue());
            Canvas canvas = this.$canvas;
            ScreenshotRecorder screenshotRecorder2 = this.this$0;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                canvas.drawRoundRect(new RectF((Rect) it.next()), 10.0f, 10.0f, screenshotRecorder2.getMaskingPaint());
            }
            if (this.this$0.getOptions().getReplayController().isDebugMaskingOverlayEnabled()) {
                this.$debugMasks.addAll(list);
            }
        }
        return Boolean.TRUE;
    }
}
