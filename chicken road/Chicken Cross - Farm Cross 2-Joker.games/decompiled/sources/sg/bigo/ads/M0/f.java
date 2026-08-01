package sg.bigo.ads.M0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes3.dex */
public final class f extends BitmapDrawable {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f12461a;
    public final g b;

    public f(g gVar, Bitmap bitmap) {
        super(gVar.f12462a.getResources(), bitmap);
        this.b = gVar;
        this.f12461a = new Paint();
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        b bVar = this.b.d.c;
        if (bVar != null) {
            this.f12461a.setColor(bVar.f);
            canvas.drawRect(getBounds(), this.f12461a);
        }
    }
}
