package sg.bigo.ads.k1;

import android.content.Context;
import android.graphics.Rect;
import sg.bigo.ads.K0.AbstractC4963u;

/* loaded from: classes3.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13022a;
    public final Rect b = new Rect();
    public final Rect c = new Rect();
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final Rect g = new Rect();
    public final Rect h = new Rect();
    public final Rect i = new Rect();

    public Q(Context context) {
        this.f13022a = context.getApplicationContext();
    }

    public final void a(Rect rect, Rect rect2) {
        rect2.set(AbstractC4963u.a(this.f13022a, rect.left), AbstractC4963u.a(this.f13022a, rect.top), AbstractC4963u.a(this.f13022a, rect.right), AbstractC4963u.a(this.f13022a, rect.bottom));
    }
}
