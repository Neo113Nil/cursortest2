package sg.bigo.ads.A;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes3.dex */
public final class b implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rect f12209a;
    public final /* synthetic */ View b;

    public b(Rect rect, View view) {
        this.f12209a = rect;
        this.b = view;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f12209a.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        if (motionEvent.getActionMasked() != 0) {
            return true;
        }
        this.b.onTouchEvent(motionEvent);
        return true;
    }
}
