package sg.bigo.ads.M0;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import sg.bigo.ads.i0.AbstractC5246a;

/* loaded from: classes3.dex */
public final class a extends AbstractC5246a {
    public b c;

    @Override // sg.bigo.ads.i0.AbstractC5246a, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f12992a;
        if (drawable == null) {
            return;
        }
        if ((drawable instanceof f) && ((f) drawable).b.e) {
            return;
        }
        if (this.c == null) {
            super.draw(canvas);
            return;
        }
        Path path = new Path();
        Rect rect = new Rect();
        b bVar = this.c;
        bVar.getClass();
        float f = bVar.f12458a;
        float f2 = bVar.b;
        float f3 = bVar.c;
        float f4 = bVar.d;
        float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
        Rect rect2 = this.c.e;
        if (rect2 == null) {
            rect2 = new Rect();
        }
        rect.left = rect2.left;
        rect.top = rect2.top;
        rect.right = rect2.right;
        rect.bottom = rect2.bottom;
        Rect bounds = getBounds();
        Rect rect3 = new Rect(rect.left, rect.top, bounds.width() - rect.right, bounds.height() - rect.bottom);
        path.addRoundRect(new RectF(rect3), fArr, Path.Direction.CW);
        canvas.clipPath(path);
        super.draw(canvas);
        Drawable drawable2 = this.c.i;
        if (drawable2 != null) {
            drawable2.setBounds(rect3);
            drawable2.draw(canvas);
        }
    }
}
