package org.betup.ui.fragment.wheeloffortune.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.fragment.wheeloffortune.model.WheelSegment;
import org.betup.ui.views.ComposeUtils;

/* compiled from: WheelDrawUtils.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"drawWheel", "", "segments", "", "Lorg/betup/ui/fragment/wheeloffortune/model/WheelSegment;", "drawScope", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "context", "Landroid/content/Context;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WheelDrawUtilsKt {
    public static final void drawWheel(List<WheelSegment> segments, DrawScope drawScope, Context context) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(drawScope, "drawScope");
        Intrinsics.checkNotNullParameter(context, "context");
        char c = 2;
        float f = 2;
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo5730getSizeNHjbRc() >> 32)) / f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo5730getSizeNHjbRc() & 4294967295L)) / f;
        long m4919constructorimpl = Offset.m4919constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
        float min = Math.min(Float.intBitsToFloat((int) (drawScope.mo5730getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (drawScope.mo5730getSizeNHjbRc() & 4294967295L))) / f;
        float size = 360.0f / segments.size();
        int i = 0;
        for (Object obj : segments) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            WheelSegment wheelSegment = (WheelSegment) obj;
            float f2 = (i * size) - 90.0f;
            long m14323getColor0d7_KjU = wheelSegment.m14323getColor0d7_KjU();
            int i3 = (int) (m4919constructorimpl >> 32);
            float intBitsToFloat3 = Float.intBitsToFloat(i3) - min;
            int i4 = (int) (m4919constructorimpl & 4294967295L);
            float intBitsToFloat4 = Float.intBitsToFloat(i4) - min;
            float f3 = min * f;
            float f4 = f;
            DrawScope.m5709drawArcyD3GUKo$default(drawScope, m14323getColor0d7_KjU, f2, size, true, Offset.m4919constructorimpl((Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L)), Size.m4987constructorimpl((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L)), 0.0f, null, null, 0, 960, null);
            Brush brush = ComposeUtils.AppBrushPalette.ButtonBackgroundGold.INSTANCE.getBrush();
            float intBitsToFloat5 = Float.intBitsToFloat(i3) - min;
            float intBitsToFloat6 = Float.intBitsToFloat(i4) - min;
            DrawScope.m5708drawArcillE91I$default(drawScope, brush, f2, size, true, Offset.m4919constructorimpl((Float.floatToRawIntBits(intBitsToFloat5) << 32) | (Float.floatToRawIntBits(intBitsToFloat6) & 4294967295L)), Size.m4987constructorimpl((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L)), 0.0f, new Stroke(2.0f, 0.0f, 0, 0, null, 30, null), null, 0, 832, null);
            float f5 = f2 + (size / f4);
            float f6 = 0.68f * min;
            double d = f5;
            float intBitsToFloat7 = Float.intBitsToFloat(i3) + (((float) Math.cos(Math.toRadians(d))) * f6);
            float intBitsToFloat8 = Float.intBitsToFloat(i4) + (f6 * ((float) Math.sin(Math.toRadians(d))));
            Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(drawScope.getDrawContext().getCanvas());
            nativeCanvas.save();
            nativeCanvas.rotate(f5 + 180.0f, intBitsToFloat7, intBitsToFloat8);
            Paint paint = new Paint();
            paint.setColor(-16777216);
            paint.setTextSize(0.1f * min);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setAntiAlias(true);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            paint.setFakeBoldText(true);
            paint.setShadowLayer(0.02f * min, 0.0f, 0.0f, -1);
            paint.getTextBounds(wheelSegment.getText(), 0, wheelSegment.getText().length(), new Rect());
            nativeCanvas.drawText(wheelSegment.getText(), intBitsToFloat7, intBitsToFloat8 + (r2.height() / 2), paint);
            nativeCanvas.restore();
            i = i2;
            f = f4;
            c = c;
        }
    }
}
