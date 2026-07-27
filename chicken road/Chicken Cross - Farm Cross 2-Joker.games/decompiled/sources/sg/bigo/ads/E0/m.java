package sg.bigo.ads.E0;

import android.graphics.Paint;
import android.view.View;

/* loaded from: classes3.dex */
public final class m extends n {
    public final int d;

    public m(View view, Paint paint, int i) {
        super(view, paint, i);
        this.d = paint.getColor();
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
        ((Paint) obj).setColor(i);
        this.f12272a.getBackground().invalidateSelf();
    }

    @Override // sg.bigo.ads.E0.n
    public final void a(boolean z) {
        Object obj;
        if (this.f12272a == null || (obj = this.b) == null) {
            return;
        }
        ((Paint) obj).setColor(z ? this.d : this.c);
        this.f12272a.getBackground().invalidateSelf();
    }
}
