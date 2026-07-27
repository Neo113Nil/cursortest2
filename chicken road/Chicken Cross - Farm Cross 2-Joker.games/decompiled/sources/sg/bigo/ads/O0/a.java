package sg.bigo.ads.O0;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes3.dex */
public final class a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12473a = false;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f12473a = true;
        return super.onSingleTapUp(motionEvent);
    }
}
