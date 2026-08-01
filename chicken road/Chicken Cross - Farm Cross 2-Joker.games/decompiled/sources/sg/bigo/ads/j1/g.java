package sg.bigo.ads.j1;

import android.view.MotionEvent;
import android.view.View;
import sg.bigo.ads.E1.i;

/* loaded from: classes3.dex */
public final class g implements View.OnTouchListener, i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f13011a;

    public g(h hVar) {
        this.f13011a = hVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.f13011a.l = true;
        }
        return this.f13011a.b(motionEvent);
    }
}
