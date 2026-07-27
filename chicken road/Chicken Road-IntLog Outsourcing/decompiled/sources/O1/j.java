package O1;

import android.os.Process;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2256a;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f2257b;

    public /* synthetic */ j(Runnable runnable, int i2) {
        this.f2256a = i2;
        this.f2257b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2256a) {
            case 0:
                this.f2257b.run();
                break;
            case 1:
                try {
                    this.f2257b.run();
                    break;
                } catch (Exception e3) {
                    AbstractC1341c.h("Executor", "Background execution failure.", e3);
                    return;
                }
            default:
                Process.setThreadPriority(0);
                this.f2257b.run();
                break;
        }
    }

    public String toString() {
        switch (this.f2256a) {
            case 0:
                return this.f2257b.toString();
            default:
                return super.toString();
        }
    }
}
