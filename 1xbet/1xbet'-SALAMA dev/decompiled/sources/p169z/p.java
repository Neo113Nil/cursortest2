package p169z;

import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f18347b;

    public /* synthetic */ p(ViewGroup viewGroup, int i7) {
        this.f18346a = i7;
        this.f18347b = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18346a) {
            case 0:
                this.f18347b.setNestedScrollingEnabled(true);
                break;
            default:
                ((MotionLayout) this.f18347b).f8843N0.a();
                break;
        }
    }
}
