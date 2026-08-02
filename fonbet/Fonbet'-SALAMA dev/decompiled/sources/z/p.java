package z;

import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f18341b;

    public /* synthetic */ p(ViewGroup viewGroup, int i7) {
        this.f18340a = i7;
        this.f18341b = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18340a) {
            case 0:
                this.f18341b.setNestedScrollingEnabled(true);
                break;
            default:
                ((MotionLayout) this.f18341b).f8843N0.a();
                break;
        }
    }
}
