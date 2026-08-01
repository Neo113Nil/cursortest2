package sg.bigo.ads.z;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: sg.bigo.ads.z.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnTouchListenerC5524b implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f13422a;

    public ViewOnTouchListenerC5524b(g gVar) {
        this.f13422a = gVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        g gVar = this.f13422a;
        if (gVar.q == null) {
            gVar.q = new sg.bigo.ads.O0.b(this.f13422a.f12687a);
        }
        this.f13422a.q.onTouchEvent(motionEvent);
        return false;
    }
}
