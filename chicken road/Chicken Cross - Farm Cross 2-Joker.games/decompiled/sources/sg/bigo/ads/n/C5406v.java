package sg.bigo.ads.n;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.transition.TransitionValues;
import sg.bigo.ads.K0.C4949f;

/* renamed from: sg.bigo.ads.n.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5406v extends C4949f {

    /* renamed from: a, reason: collision with root package name */
    public RectF f13195a;
    public RectF b;
    public RectF c;
    public float d = Float.NaN;
    public RectF e;
    public final /* synthetic */ C5408w f;

    public C5406v(C5408w c5408w) {
        this.f = c5408w;
    }

    @Override // sg.bigo.ads.K0.C4949f
    public final void a(Object obj, Object obj2) {
        if (obj != this.f.D || this.b == null || this.c == null || this.e == null || this.f13195a == null || !(obj2 instanceof PointF) || Float.isNaN(this.d)) {
            return;
        }
        PointF pointF = (PointF) obj2;
        if (this.b.centerX() != this.c.centerX()) {
            this.f.E.setTranslationY(this.d - (Math.abs(this.e.top - this.f13195a.bottom) * (Math.abs(pointF.x - this.b.left) / Math.abs(this.c.left - this.b.left))));
        } else {
            this.e.offsetTo(pointF.x, pointF.y);
            if (new RectF(this.f13195a).intersect(this.e)) {
                this.f.E.setTranslationY((this.d + this.e.top) - this.f13195a.bottom);
            }
        }
    }

    @Override // sg.bigo.ads.K0.C4949f
    public final void a(TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues.view == this.f.D) {
            Rect rect = (Rect) transitionValues.values.get("android:changeBounds:bounds");
            Rect rect2 = (Rect) transitionValues2.values.get("android:changeBounds:bounds");
            C5408w c5408w = this.f;
            Rect rect3 = new Rect(sg.bigo.ads.K0.X.a(c5408w.E, c5408w.N));
            this.f13195a = new RectF(rect3);
            if (rect3.intersect(rect2)) {
                this.b = new RectF(rect);
                this.c = new RectF(rect2);
                this.d = this.f.E.getTranslationY();
                this.e = new RectF(rect2);
            }
        }
    }
}
