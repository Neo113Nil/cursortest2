package p155w1;

import java.lang.ref.WeakReference;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public final class G0 extends FutureTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f17389a;

    public G0(Runnable runnable, Object obj) {
        super(runnable, obj);
        new WeakReference(null);
        this.f17389a = new WeakReference(runnable);
    }
}
