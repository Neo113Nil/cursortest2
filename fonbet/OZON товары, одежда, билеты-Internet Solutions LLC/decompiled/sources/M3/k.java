package M3;

import M3.d;
import M3.j;
import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes8.dex */
final class k extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d.a {

    /* renamed from: c, reason: collision with root package name */
    private final a f17364c;

    /* renamed from: e, reason: collision with root package name */
    private final GestureDetector f17366e;

    /* renamed from: a, reason: collision with root package name */
    private final PointF f17362a = new PointF();

    /* renamed from: b, reason: collision with root package name */
    private final PointF f17363b = new PointF();

    /* renamed from: d, reason: collision with root package name */
    private final float f17365d = 25.0f;

    /* renamed from: f, reason: collision with root package name */
    private volatile float f17367f = 3.1415927f;

    public interface a {
    }

    public k(Context context, a aVar) {
        this.f17364c = aVar;
        this.f17366e = new GestureDetector(context, this);
    }

    @Override // M3.d.a
    public final void a(float f7, float[] fArr) {
        this.f17367f = -f7;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f17362a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f11) {
        float x11 = (motionEvent2.getX() - this.f17362a.x) / this.f17365d;
        float y11 = motionEvent2.getY();
        PointF pointF = this.f17362a;
        float f12 = (y11 - pointF.y) / this.f17365d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d11 = this.f17367f;
        float cos = (float) Math.cos(d11);
        float sin = (float) Math.sin(d11);
        PointF pointF2 = this.f17363b;
        pointF2.x -= (cos * x11) - (sin * f12);
        float f13 = (cos * f12) + (sin * x11) + pointF2.y;
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        ((j.a) this.f17364c).b(this.f17363b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return j.this.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f17366e.onTouchEvent(motionEvent);
    }
}
