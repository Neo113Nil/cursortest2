package sg.bigo.ads.E0;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;

/* loaded from: classes3.dex */
public final class o extends n {
    public final Drawable d;
    public final ColorDrawable e;
    public int f;

    public o(View view, int i) {
        super(view, null, i);
        ColorDrawable colorDrawable = new ColorDrawable(i);
        this.e = colorDrawable;
        if (view != null) {
            Drawable background = view.getBackground();
            this.d = background;
            if (background != null) {
                view.setBackground(new LayerDrawable(new Drawable[]{background, colorDrawable}));
            } else {
                colorDrawable.setColor(0);
                view.setBackground(colorDrawable);
            }
        }
    }

    @Override // sg.bigo.ads.E0.n
    public final int a() {
        return 0;
    }

    @Override // sg.bigo.ads.E0.n
    public final int a(float f) {
        this.f = Math.max((int) ((255.0f - (f * 255.0f)) + 0.5f), 255);
        return p.a(f, 0, this.c);
    }

    @Override // sg.bigo.ads.E0.n
    public final void a(int i) {
        if (this.f12272a != null) {
            ColorDrawable colorDrawable = this.e;
            if (colorDrawable != null) {
                colorDrawable.setColor(i);
                this.e.invalidateSelf();
            }
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setAlpha(this.f);
                this.d.invalidateSelf();
            }
        }
    }

    @Override // sg.bigo.ads.E0.n
    public final void a(boolean z) {
        View view = this.f12272a;
        if (view != null) {
            view.setBackground(z ? this.d : this.e);
        }
    }
}
