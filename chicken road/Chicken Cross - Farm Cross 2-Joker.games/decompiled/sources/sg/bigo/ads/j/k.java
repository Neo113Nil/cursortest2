package sg.bigo.ads.j;

import android.content.Context;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.h.C5185l1;

/* loaded from: classes3.dex */
public final class k implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final int f13004a;
    public float c;
    public float d;
    public final /* synthetic */ l f;
    public boolean b = false;
    public final sg.bigo.ads.U.j e = new sg.bigo.ads.U.j();

    public k(l lVar, Context context) {
        this.f = lVar;
        this.f13004a = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.b = true;
            this.c = motionEvent.getX();
            this.d = motionEvent.getY();
            this.e.f12564a = new Point((int) this.c, (int) this.d);
        } else if (motionEvent.getActionMasked() == 1) {
            if (this.b) {
                this.b = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.e.b = new Point((int) x, (int) y);
                if (Math.abs(this.c - x) < this.f13004a && Math.abs(this.d - y) < this.f13004a) {
                    l lVar = this.f;
                    Ad ad = lVar.e;
                    lVar.a((ad instanceof sg.bigo.ads.E.e ? (sg.bigo.ads.E.e) ad : ad instanceof sg.bigo.ads.E.f ? (sg.bigo.ads.E.f) ad : ad instanceof C5185l1 ? ((C5185l1) ad).D() : (sg.bigo.ads.e.h) ad).k.e, this.e);
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.b = false;
        }
        return true;
    }
}
