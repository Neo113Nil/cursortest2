package L0;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;

/* loaded from: classes.dex */
public final class j extends Canvas {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f3013a;

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        boolean clipOutPath;
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            clipOutPath = canvas.clipOutPath(path);
            return clipOutPath;
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        boolean clipOutRect;
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            clipOutRect = canvas.clipOutRect(rectF);
            return clipOutRect;
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.clipPath(path, op);
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.clipRect(rectF, op);
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.disableZ();
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i, int i5, int i6, int i7) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawARGB(i, i5, i6, i7);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f, float f5, boolean z3, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawArc(rectF, f, f5, z3, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f, float f5, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, f, f5, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i, int i5, float[] fArr, int i6, int[] iArr, int i7, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, i, i5, fArr, i6, iArr, i7, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f, float f5, float f6, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawCircle(f, f5, f6, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawColor(i);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f, float f5, RectF rectF2, float f6, float f7, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawDoubleRoundRect(rectF, f, f5, rectF2, f6, f7, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i, float[] fArr, int i5, int i6, Font font, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawGlyphs(iArr, i, fArr, i5, i6, font, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f, float f5, float f6, float f7, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawLine(f, f5, f6, f7, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i, int i5, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawLines(fArr, i, i5, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawOval(rectF, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawPatch(ninePatch, rect, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f, float f5, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawPoint(f, f5, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i, int i5, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawPoints(fArr, i, i5, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i, int i5, float[] fArr, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawPosText(cArr, i, i5, fArr, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i, int i5, int i6) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawRGB(i, i5, i6);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawRect(rectF, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawRenderNode(renderNode);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f, float f5, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawRoundRect(rectF, f, f5, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i, int i5, float f, float f5, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawText(cArr, i, i5, f, f5, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i, int i5, Path path, float f, float f5, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawTextOnPath(cArr, i, i5, path, f, f5, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i, int i5, int i6, int i7, float f, float f5, boolean z3, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawTextRun(cArr, i, i5, i6, i7, f, f5, z3, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i, float[] fArr, int i5, float[] fArr2, int i6, int[] iArr, int i7, short[] sArr, int i8, int i9, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawVertices(vertexMode, i, fArr, i5, fArr2, i6, iArr, i7, sArr, i8, i9, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.enableZ();
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        Canvas canvas = this.f3013a;
        if (canvas == null) {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.getDensity();
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.getHeight();
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.getMatrix(matrix);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.getWidth();
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.restore();
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.restoreToCount(i);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.rotate(f);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.save();
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i);
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i, int i5) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i, i5);
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void scale(float f, float f5) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.scale(f, f5);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.setDensity(i);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.setDrawFilter(drawFilter);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void skew(float f, float f5) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.skew(f, f5);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void translate(float f, float f5) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.translate(f, f5);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f, float f5, float f6, float f7, float f8, float f9, boolean z3, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawArc(f, f5, f6, f7, f8, f9, z3, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j5) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawColor(j5);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawLines(fArr, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f, float f5, float f6, float f7, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawOval(f, f5, f6, f7, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawPicture(picture, rectF);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawPoints(fArr, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawPosText(str, fArr, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f, float f5, float f6, float f7, float f8, float f9, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawRoundRect(f, f5, f6, f7, f8, f9, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f, float f5, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawText(str, f, f5, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f, float f5, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawTextOnPath(str, path, f, f5, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        boolean quickReject;
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            quickReject = canvas.quickReject(rectF);
            return quickReject;
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i);
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.clipRect(rectF);
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawPicture(picture, rect);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f, float f5, float f6, float f7, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawRect(f, f5, f6, f7, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i, int i5, float f, float f5, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawText(str, i, i5, f, f5, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f5, float f6, float f7, Paint paint, int i) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.saveLayer(f, f5, f6, f7, paint, i);
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f5, float f6, float f7, int i, int i5) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f, f5, f6, f7, i, i5);
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        boolean clipOutRect;
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            clipOutRect = canvas.clipOutRect(rect);
            return clipOutRect;
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i5, float f, float f5, int i6, int i7, boolean z3, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i, i5, f, f5, i6, i7, z3, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawPatch(ninePatch, rectF, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i, int i5, float f, float f5, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawText(charSequence, i, i5, f, f5, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i, int i5, int i6, int i7, float f, float f5, boolean z3, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawTextRun(charSequence, i, i5, i6, i7, f, f5, z3, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f5, float f6, float f7, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.saveLayer(f, f5, f6, f7, paint);
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f5, float f6, float f7, int i) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f, f5, f6, f7, i);
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f5, float f6, float f7, Region.Op op) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.clipRect(f, f5, f6, f7, op);
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i5, int i6, int i7, int i8, int i9, boolean z3, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i, i5, i6, i7, i8, i9, z3, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, PorterDuff.Mode mode) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawColor(i, mode);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.quickReject(path, edgeType);
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f5, float f6, float f7) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.clipRect(f, f5, f6, f7);
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, BlendMode blendMode) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawColor(i, blendMode);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        boolean quickReject;
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            quickReject = canvas.quickReject(path);
            return quickReject;
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f, float f5, float f6, float f7) {
        boolean clipOutRect;
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            clipOutRect = canvas.clipOutRect(f, f5, f6, f7);
            return clipOutRect;
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i, int i5, int i6, int i7) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.clipRect(i, i5, i6, i7);
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i, int i5, int i6, int i7, float f, float f5, boolean z3, Paint paint) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawTextRun(measuredText, i, i5, i6, i7, f, f5, z3, paint);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j5, BlendMode blendMode) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            canvas.drawColor(j5, blendMode);
        } else {
            kotlin.jvm.internal.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f5, float f6, float f7, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            return canvas.quickReject(f, f5, f6, f7, edgeType);
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i, int i5, int i6, int i7) {
        boolean clipOutRect;
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            clipOutRect = canvas.clipOutRect(i, i5, i6, i7);
            return clipOutRect;
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f5, float f6, float f7) {
        boolean quickReject;
        Canvas canvas = this.f3013a;
        if (canvas != null) {
            quickReject = canvas.quickReject(f, f5, f6, f7);
            return quickReject;
        }
        kotlin.jvm.internal.l.k("nativeCanvas");
        throw null;
    }
}
