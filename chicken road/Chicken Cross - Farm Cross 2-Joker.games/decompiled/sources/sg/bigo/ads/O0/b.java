package sg.bigo.ads.O0;

import android.content.Context;
import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import sg.bigo.ads.U.j;

/* loaded from: classes3.dex */
public final class b extends GestureDetector {

    /* renamed from: a, reason: collision with root package name */
    public final a f12474a;
    public long b;
    public final j c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(Context context) {
        super(context, r0);
        a aVar = new a();
        this.b = -1L;
        this.c = new j();
        this.f12474a = aVar;
        setIsLongpressEnabled(false);
    }

    @Override // android.view.GestureDetector
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f12474a.f12473a = false;
            this.b = System.currentTimeMillis();
            this.c.f12564a = new Point(Math.round(motionEvent.getX()), Math.round(motionEvent.getY()));
        } else if (motionEvent.getActionMasked() == 1) {
            this.c.b = new Point(Math.round(motionEvent.getX()), Math.round(motionEvent.getY()));
        }
        return super.onTouchEvent(motionEvent);
    }
}
