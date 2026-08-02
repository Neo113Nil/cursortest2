package w1;

import java.lang.ref.WeakReference;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class G0 extends FutureTask {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f17383a;

    public G0(Runnable runnable, Object obj) {
        super(runnable, obj);
        new WeakReference(null);
        this.f17383a = new WeakReference(runnable);
    }
}
