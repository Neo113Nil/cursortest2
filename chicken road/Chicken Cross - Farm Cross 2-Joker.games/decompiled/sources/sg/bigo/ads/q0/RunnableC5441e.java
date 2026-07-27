package sg.bigo.ads.q0;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import sg.bigo.ads.w0.AbstractC5496a;

/* renamed from: sg.bigo.ads.q0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5441e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f13252a;
    public final /* synthetic */ Runnable b = null;
    public final /* synthetic */ boolean c = false;
    public final /* synthetic */ Looper d;

    public RunnableC5441e(Runnable runnable, Looper looper) {
        this.f13252a = runnable;
        this.d = looper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakHashMap weakHashMap = AbstractC5446j.h;
        synchronized (weakHashMap) {
            weakHashMap.remove(this.f13252a);
        }
        if (AbstractC5446j.i) {
            this.f13252a.run();
        } else {
            try {
                this.f13252a.run();
            } catch (Throwable th) {
                AbstractC5496a.a(2, 6, "ThreadManager", "An error occurred while running a task: \n" + Log.getStackTraceString(th));
                ArrayList arrayList = AbstractC5446j.j;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC5437a) it.next()).a(th);
                    }
                }
            }
        }
        HandlerThread handlerThread = AbstractC5446j.f13257a;
        if (this.b != null) {
            if (this.c || this.d == AbstractC5446j.g.getLooper()) {
                AbstractC5446j.g.post(this.b);
            } else {
                new Handler(this.d).post(this.b);
            }
        }
    }
}
