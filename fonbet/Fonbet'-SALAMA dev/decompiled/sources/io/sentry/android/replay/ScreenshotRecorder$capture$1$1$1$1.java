package io.sentry.android.replay;

import Y4.D;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import f6.C1111d;
import io.sentry.android.replay.util.TextLayout;
import io.sentry.android.replay.util.ViewsKt;
import io.sentry.android.replay.viewhierarchy.ViewHierarchyNode;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import t6.h;
import t6.i;

/* loaded from: classes2.dex */
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
        C1111d c1111d;
        Integer dominantColor;
        Paint maskingPaint;
        Paint maskingPaint2;
        Bitmap bitmap;
        int dominantColorForRect;
        h.e(viewHierarchyNode, "node");
        if (viewHierarchyNode.getShouldMask() && viewHierarchyNode.getWidth() > 0 && viewHierarchyNode.getHeight() > 0) {
            if (viewHierarchyNode.getVisibleRect() == null) {
                return Boolean.FALSE;
            }
            if (viewHierarchyNode instanceof ViewHierarchyNode.ImageViewHierarchyNode) {
                List D7 = D.D(viewHierarchyNode.getVisibleRect());
                ScreenshotRecorder screenshotRecorder = this.this$0;
                bitmap = screenshotRecorder.screenshot;
                dominantColorForRect = screenshotRecorder.dominantColorForRect(bitmap, viewHierarchyNode.getVisibleRect());
                c1111d = new C1111d(D7, Integer.valueOf(dominantColorForRect));
            } else {
                if (viewHierarchyNode instanceof ViewHierarchyNode.TextViewHierarchyNode) {
                    ViewHierarchyNode.TextViewHierarchyNode textViewHierarchyNode = (ViewHierarchyNode.TextViewHierarchyNode) viewHierarchyNode;
                    TextLayout layout = textViewHierarchyNode.getLayout();
                    c1111d = new C1111d(ViewsKt.getVisibleRects(textViewHierarchyNode.getLayout(), viewHierarchyNode.getVisibleRect(), textViewHierarchyNode.getPaddingLeft(), textViewHierarchyNode.getPaddingTop()), Integer.valueOf(((layout == null || (dominantColor = layout.getDominantTextColor()) == null) && (dominantColor = textViewHierarchyNode.getDominantColor()) == null) ? -16777216 : dominantColor.intValue()));
                } else {
                    c1111d = new C1111d(D.D(viewHierarchyNode.getVisibleRect()), -16777216);
                }
            }
            List list = (List) c1111d.f13000a;
            int intValue = ((Number) c1111d.f13001b).intValue();
            maskingPaint = this.this$0.getMaskingPaint();
            maskingPaint.setColor(intValue);
            Canvas canvas = this.$canvas;
            ScreenshotRecorder screenshotRecorder2 = this.this$0;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                RectF rectF = new RectF((Rect) it.next());
                maskingPaint2 = screenshotRecorder2.getMaskingPaint();
                canvas.drawRoundRect(rectF, 10.0f, 10.0f, maskingPaint2);
            }
            if (this.this$0.getOptions().getReplayController().isDebugMaskingOverlayEnabled()) {
                this.$debugMasks.addAll(list);
            }
        }
        return Boolean.TRUE;
    }
}
