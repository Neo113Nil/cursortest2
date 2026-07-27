package sg.bigo.ads.t;

import android.graphics.PointF;
import sg.bigo.ads.K0.C4949f;

/* loaded from: classes3.dex */
public final class s extends C4949f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f13318a;

    public s(v vVar) {
        this.f13318a = vVar;
    }

    @Override // sg.bigo.ads.K0.C4949f
    public final void a(Object obj, Object obj2) {
        if (obj == this.f13318a.w0 && (obj2 instanceof PointF)) {
            PointF pointF = (PointF) obj2;
            int measuredWidth = (int) (r0.getMeasuredWidth() - pointF.x);
            this.f13318a.b(measuredWidth, (int) (r0.s0 - pointF.y));
        }
    }
}
