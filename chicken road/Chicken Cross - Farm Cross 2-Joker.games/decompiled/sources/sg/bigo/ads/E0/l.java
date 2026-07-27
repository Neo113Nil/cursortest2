package sg.bigo.ads.E0;

import android.graphics.drawable.ColorDrawable;
import android.view.View;

/* loaded from: classes3.dex */
public final class l extends n {
    public final int d;

    public l(View view, ColorDrawable colorDrawable, int i) {
        super(view, colorDrawable, i);
        if (colorDrawable != null) {
            colorDrawable.mutate();
        }
        this.d = colorDrawable != null ? colorDrawable.getColor() : 0;
    }

    @Override // sg.bigo.ads.E0.n
    public final int a() {
        return this.d;
    }

    @Override // sg.bigo.ads.E0.n
    public final void a(int i) {
        Object obj;
        if (this.f12272a == null || (obj = this.b) == null) {
            return;
        }
        ((ColorDrawable) obj).setColor(i);
        ((ColorDrawable) this.b).invalidateSelf();
    }

    @Override // sg.bigo.ads.E0.n
    public final void a(boolean z) {
        Object obj;
        if (this.f12272a == null || (obj = this.b) == null) {
            return;
        }
        ((ColorDrawable) obj).setColor(z ? this.d : this.c);
        ((ColorDrawable) this.b).invalidateSelf();
    }
}
