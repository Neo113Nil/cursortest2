package sg.bigo.ads.D1;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes3.dex */
public final class c implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f12256a;

    public c(k kVar) {
        this.f12256a = kVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f12256a.t.set(false);
        this.f12256a.s.onTouchEvent(motionEvent);
        return false;
    }
}
