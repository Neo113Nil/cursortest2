package A0;

import android.view.Choreographer;
import java.util.ArrayList;

/* renamed from: A0.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0054q0 implements Choreographer.FrameCallback, Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0055r0 f551k;

    public ChoreographerFrameCallbackC0054q0(C0055r0 c0055r0) {
        this.f551k = c0055r0;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j5) {
        this.f551k.f557n.removeCallbacks(this);
        C0055r0.H(this.f551k);
        C0055r0 c0055r0 = this.f551k;
        synchronized (c0055r0.f558o) {
            if (c0055r0.f563t) {
                c0055r0.f563t = false;
                ArrayList arrayList = c0055r0.f560q;
                c0055r0.f560q = c0055r0.f561r;
                c0055r0.f561r = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j5);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0055r0.H(this.f551k);
        C0055r0 c0055r0 = this.f551k;
        synchronized (c0055r0.f558o) {
            if (c0055r0.f560q.isEmpty()) {
                c0055r0.f556m.removeFrameCallback(this);
                c0055r0.f563t = false;
            }
        }
    }
}
