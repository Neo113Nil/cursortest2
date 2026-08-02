package L1;

import Sc.InterfaceC3999a;
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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class V extends Canvas {

    /* renamed from: a, reason: collision with root package name */
    private Canvas f16168a;

    public final void a(@NotNull Canvas canvas) {
        this.f16168a = canvas;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(@NotNull Path path) {
        C3545i c3545i = C3545i.f16190a;
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return c3545i.a(canvas, path);
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(@NotNull RectF rectF) {
        C3545i c3545i = C3545i.f16190a;
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return c3545i.e(canvas, rectF);
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final boolean clipPath(@NotNull Path path, @NotNull Region.Op op) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.clipPath(path, op);
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final boolean clipRect(@NotNull RectF rectF, @NotNull Region.Op op) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.clipRect(rectF, op);
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        C3551o c3551o = C3551o.f16191a;
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            c3551o.a(canvas);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i11, int i12, int i13, int i14) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawARGB(i11, i12, i13, i14);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(@NotNull RectF rectF, float f7, float f11, boolean z11, @NotNull Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawArc(rectF, f7, f11, z11, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(@NotNull Bitmap bitmap, float f7, float f11, Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, f7, f11, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(@NotNull Bitmap bitmap, int i11, int i12, @NotNull float[] fArr, int i13, int[] iArr, int i14, Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, i11, i12, fArr, i13, iArr, i14, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f7, float f11, float f12, @NotNull Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawCircle(f7, f11, f12, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i11) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawColor(i11);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(@NotNull RectF rectF, float f7, float f11, @NotNull RectF rectF2, float f12, float f13, @NotNull Paint paint) {
        C3551o c3551o = C3551o.f16191a;
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            c3551o.e(canvas, rectF, f7, f11, rectF2, f12, f13, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(@NotNull int[] iArr, int i11, @NotNull float[] fArr, int i12, int i13, @NotNull Font font, @NotNull Paint paint) {
        C3558w c3558w = C3558w.f16193a;
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            c3558w.a(canvas, iArr, i11, fArr, i12, i13, font, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f7, float f11, float f12, float f13, @NotNull Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawLine(f7, f11, f12, f13, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(@NotNull float[] fArr, int i11, int i12, @NotNull Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawLines(fArr, i11, i12, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(@NotNull RectF rectF, @NotNull Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawOval(rectF, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(@NotNull Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(@NotNull NinePatch ninePatch, @NotNull Rect rect, Paint paint) {
        C3558w c3558w = C3558w.f16193a;
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            c3558w.b(canvas, ninePatch, rect, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPath(@NotNull Path path, @NotNull Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(@NotNull Picture picture) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f7, float f11, @NotNull Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawPoint(f7, f11, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i11, int i12, @NotNull Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawPoints(fArr, i11, i12, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final void drawPosText(@NotNull char[] cArr, int i11, int i12, @NotNull float[] fArr, @NotNull Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawPosText(cArr, i11, i12, fArr, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i11, int i12, int i13) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawRGB(i11, i12, i13);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(@NotNull RectF rectF, @NotNull Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawRect(rectF, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(@NotNull RenderNode renderNode) {
        C3551o c3551o = C3551o.f16191a;
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            c3551o.g(canvas, renderNode);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(@NotNull RectF rectF, float f7, float f11, @NotNull Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawRoundRect(rectF, f7, f11, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(@NotNull char[] cArr, int i11, int i12, float f7, float f11, @NotNull Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawText(cArr, i11, i12, f7, f11, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(@NotNull char[] cArr, int i11, int i12, @NotNull Path path, float f7, float f11, @NotNull Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawTextOnPath(cArr, i11, i12, path, f7, f11, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(@NotNull char[] cArr, int i11, int i12, int i13, int i14, float f7, float f11, boolean z11, @NotNull Paint paint) {
        C3544h c3544h = C3544h.f16189a;
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            c3544h.b(canvas, cArr, i11, i12, i13, i14, f7, f11, z11, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(@NotNull Canvas.VertexMode vertexMode, int i11, @NotNull float[] fArr, int i12, float[] fArr2, int i13, int[] iArr, int i14, short[] sArr, int i15, int i16, @NotNull Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawVertices(vertexMode, i11, fArr, i12, fArr2, i13, iArr, i14, sArr, i15, i16, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        C3551o c3551o = C3551o.f16191a;
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            c3551o.i(canvas);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(@NotNull Rect rect) {
        Canvas canvas = this.f16168a;
        if (canvas == null) {
            Intrinsics.n("nativeCanvas");
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
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.getDensity();
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.getHeight();
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final void getMatrix(@NotNull Matrix matrix) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.getMatrix(matrix);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.getWidth();
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final boolean quickReject(@NotNull RectF rectF, @NotNull Canvas.EdgeType edgeType) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.restore();
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i11) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.restoreToCount(i11);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f7) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.rotate(f7);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.save();
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final int saveLayer(RectF rectF, Paint paint, int i11) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i11);
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final int saveLayerAlpha(RectF rectF, int i11, int i12) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i11, i12);
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void scale(float f7, float f11) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.scale(f7, f11);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i11) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.setDensity(i11);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.setDrawFilter(drawFilter);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void skew(float f7, float f11) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.skew(f7, f11);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void translate(float f7, float f11) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.translate(f7, f11);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(@NotNull Rect rect) {
        C3545i c3545i = C3545i.f16190a;
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return c3545i.d(canvas, rect);
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(@NotNull Path path) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final boolean clipRect(@NotNull Rect rect, @NotNull Region.Op op) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f7, float f11, float f12, float f13, float f14, float f15, boolean z11, @NotNull Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawArc(f7, f11, f12, f13, f14, f15, z11, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(@NotNull Bitmap bitmap, Rect rect, @NotNull RectF rectF, Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j11) {
        C3551o c3551o = C3551o.f16191a;
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            c3551o.c(canvas, j11);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(@NotNull float[] fArr, @NotNull Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawLines(fArr, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f7, float f11, float f12, float f13, @NotNull Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawOval(f7, f11, f12, f13, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(@NotNull NinePatch ninePatch, @NotNull RectF rectF, Paint paint) {
        C3558w c3558w = C3558w.f16193a;
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            c3558w.c(canvas, ninePatch, rectF, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(@NotNull Picture picture, @NotNull RectF rectF) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawPicture(picture, rectF);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(@NotNull float[] fArr, @NotNull Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawPoints(fArr, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final void drawPosText(@NotNull String str, @NotNull float[] fArr, @NotNull Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawPosText(str, fArr, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(@NotNull Rect rect, @NotNull Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f7, float f11, float f12, float f13, float f14, float f15, @NotNull Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawRoundRect(f7, f11, f12, f13, f14, f15, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(@NotNull String str, float f7, float f11, @NotNull Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawText(str, f7, f11, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(@NotNull String str, @NotNull Path path, float f7, float f11, @NotNull Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawTextOnPath(str, path, f7, f11, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(@NotNull RectF rectF) {
        C3554s c3554s = C3554s.f16192a;
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return c3554s.c(canvas, rectF);
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i11) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i11);
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f7, float f11, float f12, float f13) {
        C3545i c3545i = C3545i.f16190a;
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return c3545i.b(canvas, f7, f11, f12, f13);
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(@NotNull RectF rectF) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.clipRect(rectF);
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(@NotNull Bitmap bitmap, Rect rect, @NotNull Rect rect2, Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i11, @NotNull PorterDuff.Mode mode) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawColor(i11, mode);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(@NotNull Picture picture, @NotNull Rect rect) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawPicture(picture, rect);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f7, float f11, float f12, float f13, @NotNull Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawRect(f7, f11, f12, f13, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(@NotNull String str, int i11, int i12, float f7, float f11, @NotNull Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawText(str, i11, i12, f7, f11, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final boolean quickReject(@NotNull Path path, @NotNull Canvas.EdgeType edgeType) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.quickReject(path, edgeType);
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final int saveLayer(float f7, float f11, float f12, float f13, Paint paint, int i11) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.saveLayer(f7, f11, f12, f13, paint, i11);
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final int saveLayerAlpha(float f7, float f11, float f12, float f13, int i11, int i12) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f7, f11, f12, f13, i11, i12);
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i11, int i12, int i13, int i14) {
        C3545i c3545i = C3545i.f16190a;
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return c3545i.c(canvas, i11, i12, i13, i14);
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(@NotNull Rect rect) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final void drawBitmap(@NotNull int[] iArr, int i11, int i12, float f7, float f11, int i13, int i14, boolean z11, Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i11, i12, f7, f11, i13, i14, z11, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i11, @NotNull BlendMode blendMode) {
        C3551o c3551o = C3551o.f16191a;
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            c3551o.b(canvas, i11, blendMode);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(@NotNull CharSequence charSequence, int i11, int i12, float f7, float f11, @NotNull Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawText(charSequence, i11, i12, f7, f11, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(@NotNull Path path) {
        C3554s c3554s = C3554s.f16192a;
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return c3554s.b(canvas, path);
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f7, float f11, float f12, float f13, Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.saveLayer(f7, f11, f12, f13, paint);
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f7, float f11, float f12, float f13, int i11) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f7, f11, f12, f13, i11);
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final boolean clipRect(float f7, float f11, float f12, float f13, @NotNull Region.Op op) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.clipRect(f7, f11, f12, f13, op);
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final void drawBitmap(@NotNull int[] iArr, int i11, int i12, int i13, int i14, int i15, int i16, boolean z11, Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i11, i12, i13, i14, i15, i16, z11, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j11, @NotNull BlendMode blendMode) {
        C3551o c3551o = C3551o.f16191a;
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            c3551o.d(canvas, j11, blendMode);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(@NotNull RectF rectF, @NotNull float[] fArr, @NotNull RectF rectF2, @NotNull float[] fArr2, @NotNull Paint paint) {
        C3551o c3551o = C3551o.f16191a;
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            c3551o.f(canvas, rectF, fArr, rectF2, fArr2, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(@NotNull CharSequence charSequence, int i11, int i12, int i13, int i14, float f7, float f11, boolean z11, @NotNull Paint paint) {
        C3544h c3544h = C3544h.f16189a;
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            c3544h.a(canvas, charSequence, i11, i12, i13, i14, f7, f11, z11, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final boolean quickReject(float f7, float f11, float f12, float f13, @NotNull Canvas.EdgeType edgeType) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.quickReject(f7, f11, f12, f13, edgeType);
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f7, float f11, float f12, float f13) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.clipRect(f7, f11, f12, f13);
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(@NotNull Bitmap bitmap, @NotNull Matrix matrix, Paint paint) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f7, float f11, float f12, float f13) {
        C3554s c3554s = C3554s.f16192a;
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return c3554s.a(canvas, f7, f11, f12, f13);
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i11, int i12, int i13, int i14) {
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            return canvas.clipRect(i11, i12, i13, i14);
        }
        Intrinsics.n("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(@NotNull MeasuredText measuredText, int i11, int i12, int i13, int i14, float f7, float f11, boolean z11, @NotNull Paint paint) {
        C3551o c3551o = C3551o.f16191a;
        Canvas canvas = this.f16168a;
        if (canvas != null) {
            c3551o.h(canvas, measuredText, i11, i12, i13, i14, f7, f11, z11, paint);
        } else {
            Intrinsics.n("nativeCanvas");
            throw null;
        }
    }
}
