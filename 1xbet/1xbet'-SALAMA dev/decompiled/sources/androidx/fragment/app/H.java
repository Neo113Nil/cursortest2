package androidx.fragment.app;

import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9356a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f9357b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t6.g f9358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f9359d;

    public H(Q q7) {
        this.f9359d = q7;
    }

    public final void a() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        Q q7 = this.f9359d;
        if (zIsLoggable) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + q7);
        }
        C0681a c0681a = q7.f9390h;
        if (c0681a != null) {
            c0681a.f9446q = false;
            c0681a.d(false);
            q7.A(true);
            q7.E();
            Iterator it = q7.f9394m.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        q7.f9390h = null;
    }
}
