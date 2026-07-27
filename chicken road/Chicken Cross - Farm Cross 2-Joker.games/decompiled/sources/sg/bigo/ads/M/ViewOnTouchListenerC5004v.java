package sg.bigo.ads.M;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: sg.bigo.ads.M.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnTouchListenerC5004v implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f12455a;

    public ViewOnTouchListenerC5004v(x xVar) {
        this.f12455a = xVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f12455a.s = motionEvent.getX();
            this.f12455a.t = motionEvent.getY();
            return true;
        }
        if (action != 1) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        x xVar = this.f12455a;
        int round = Math.round(xVar.s);
        int round2 = Math.round(this.f12455a.t);
        int round3 = Math.round(x);
        int round4 = Math.round(y);
        xVar.getClass();
        if (Math.max(Math.abs(round - round3), Math.abs(round2 - round4)) <= 30) {
            return false;
        }
        x.a(this.f12455a);
        return true;
    }
}
