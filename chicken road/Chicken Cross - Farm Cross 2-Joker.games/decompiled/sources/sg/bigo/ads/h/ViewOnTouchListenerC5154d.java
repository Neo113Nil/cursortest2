package sg.bigo.ads.h;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: sg.bigo.ads.h.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnTouchListenerC5154d implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC5204s f12877a;

    public ViewOnTouchListenerC5154d(AbstractC5204s abstractC5204s) {
        this.f12877a = abstractC5204s;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f12877a.X = (int) motionEvent.getX();
            this.f12877a.Y = (int) motionEvent.getY();
        } else if (action == 1) {
            AbstractC5204s abstractC5204s = this.f12877a;
            int i = abstractC5204s.X;
            int i2 = abstractC5204s.Y;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            abstractC5204s.getClass();
            if (Math.max(Math.abs(i - x), Math.abs(i2 - y)) > 10.0d) {
                this.f12877a.h0();
                sg.bigo.ads.C.l D = ((C5185l1) this.f12877a.e).D();
                int x2 = (int) motionEvent.getX();
                int y2 = (int) motionEvent.getY();
                AbstractC5204s abstractC5204s2 = this.f12877a;
                D.a(x2, y2, abstractC5204s2.X, abstractC5204s2.Y, 8, ((Integer) view.getTag()).intValue());
            }
        }
        return true;
    }
}
