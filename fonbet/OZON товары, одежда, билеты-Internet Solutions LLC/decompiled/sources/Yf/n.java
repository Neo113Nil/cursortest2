package Yf;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.NonNull;

/* loaded from: classes10.dex */
public final class n extends Yf.b<c> {

    /* renamed from: i, reason: collision with root package name */
    private final GestureDetector f34976i;

    /* renamed from: j, reason: collision with root package name */
    final c f34977j;

    final class a implements c {
        a() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            n nVar = n.this;
            return nVar.b(10) && ((c) nVar.f34925h).onDoubleTap(motionEvent);
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            n nVar = n.this;
            return nVar.b(11) && ((c) nVar.f34925h).onDoubleTapEvent(motionEvent);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            n nVar = n.this;
            return nVar.b(9) && ((c) nVar.f34925h).onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f11) {
            n nVar = n.this;
            return nVar.b(7) && ((c) nVar.f34925h).onFling(motionEvent, motionEvent2, f7, f11);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            n nVar = n.this;
            if (nVar.b(6)) {
                ((c) nVar.f34925h).onLongPress(motionEvent);
            }
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f11) {
            n nVar = n.this;
            return nVar.b(0) && ((c) nVar.f34925h).onScroll(motionEvent, motionEvent2, f7, f11);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onShowPress(MotionEvent motionEvent) {
            n nVar = n.this;
            if (nVar.b(8)) {
                ((c) nVar.f34925h).onShowPress(motionEvent);
            }
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            n nVar = n.this;
            return nVar.b(12) && ((c) nVar.f34925h).onSingleTapConfirmed(motionEvent);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            n nVar = n.this;
            return nVar.b(5) && ((c) nVar.f34925h).onSingleTapUp(motionEvent);
        }
    }

    public static class b implements c {
        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f11) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onShowPress(MotionEvent motionEvent) {
        }
    }

    public interface c extends GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    }

    public n(Context context, Yf.a aVar) {
        super(context, aVar);
        a aVar2 = new a();
        this.f34977j = aVar2;
        this.f34976i = new GestureDetector(context, aVar2);
    }

    @Override // Yf.b
    protected final boolean a(@NonNull MotionEvent motionEvent) {
        return this.f34976i.onTouchEvent(motionEvent);
    }
}
