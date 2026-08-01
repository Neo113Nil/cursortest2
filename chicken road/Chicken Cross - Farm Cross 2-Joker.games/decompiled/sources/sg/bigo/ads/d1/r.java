package sg.bigo.ads.d1;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes3.dex */
public final class r implements View.OnTouchListener {
    public float b;
    public float c;
    public final /* synthetic */ s e;

    /* renamed from: a, reason: collision with root package name */
    public boolean f12740a = false;
    public final sg.bigo.ads.U.j d = new sg.bigo.ads.U.j();

    public r(s sVar) {
        this.e = sVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        u uVar;
        if (motionEvent.getActionMasked() == 0) {
            this.f12740a = true;
            this.b = motionEvent.getX();
            this.c = motionEvent.getY();
            this.d.f12564a = new Point((int) this.b, (int) this.c);
        } else if (motionEvent.getActionMasked() == 1) {
            if (this.f12740a) {
                this.f12740a = false;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                this.d.b = new Point(x, y);
                if (this.e.a(x, y) && (uVar = this.e.j) != null) {
                    uVar.a(this.d);
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.f12740a = false;
        }
        return true;
    }
}
