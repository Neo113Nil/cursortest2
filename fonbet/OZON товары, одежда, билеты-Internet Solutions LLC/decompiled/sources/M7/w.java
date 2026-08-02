package M7;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class w {

    /* renamed from: n, reason: collision with root package name */
    private static final HashMap f17528n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Context f17529a;

    /* renamed from: b, reason: collision with root package name */
    private final m f17530b;

    /* renamed from: g, reason: collision with root package name */
    private boolean f17535g;

    /* renamed from: h, reason: collision with root package name */
    private final Intent f17536h;

    /* renamed from: l, reason: collision with root package name */
    private ServiceConnection f17540l;

    /* renamed from: m, reason: collision with root package name */
    private j f17541m;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f17532d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet f17533e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Object f17534f = new Object();

    /* renamed from: j, reason: collision with root package name */
    private final p f17538j = new IBinder.DeathRecipient() { // from class: M7.p
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            w.h(w.this);
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f17539k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    private final String f17531c = "IntegrityService";

    /* renamed from: i, reason: collision with root package name */
    private final WeakReference f17537i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [M7.p] */
    public w(Context context, m mVar, Intent intent) {
        this.f17529a = context;
        this.f17530b = mVar;
        this.f17536h = intent;
    }

    public static void h(w wVar) {
        wVar.f17530b.d("reportBinderDeath", new Object[0]);
        s sVar = (s) wVar.f17537i.get();
        m mVar = wVar.f17530b;
        if (sVar != null) {
            mVar.d("calling onBinderDied", new Object[0]);
            sVar.a();
        } else {
            String str = wVar.f17531c;
            mVar.d("%s : Binder has died.", str);
            ArrayList arrayList = wVar.f17532d;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((n) it.next()).a(new RemoteException(String.valueOf(str).concat(" : Binder has died.")));
            }
            arrayList.clear();
        }
        wVar.s();
    }

    static void m(w wVar, n nVar) {
        j jVar = wVar.f17541m;
        ArrayList arrayList = wVar.f17532d;
        m mVar = wVar.f17530b;
        if (jVar != null || wVar.f17535g) {
            if (!wVar.f17535g) {
                nVar.run();
                return;
            } else {
                mVar.d("Waiting to bind to the service.", new Object[0]);
                arrayList.add(nVar);
                return;
            }
        }
        mVar.d("Initiate binding to the service.", new Object[0]);
        arrayList.add(nVar);
        v vVar = new v(wVar);
        wVar.f17540l = vVar;
        wVar.f17535g = true;
        if (wVar.f17529a.bindService(wVar.f17536h, vVar, 1)) {
            return;
        }
        mVar.d("Failed to bind to the service.", new Object[0]);
        wVar.f17535g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((n) it.next()).a(new x("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    static /* bridge */ /* synthetic */ void n(w wVar) {
        wVar.f17530b.d("linkToDeath", new Object[0]);
        try {
            wVar.f17541m.asBinder().linkToDeath(wVar.f17538j, 0);
        } catch (RemoteException e11) {
            wVar.f17530b.c(e11, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void o(w wVar) {
        wVar.f17530b.d("unlinkToDeath", new Object[0]);
        wVar.f17541m.asBinder().unlinkToDeath(wVar.f17538j, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        synchronized (this.f17534f) {
            try {
                Iterator it = this.f17533e.iterator();
                while (it.hasNext()) {
                    ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f17531c).concat(" : Binder has died.")));
                }
                this.f17533e.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Handler c() {
        Handler handler;
        HashMap hashMap = f17528n;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f17531c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f17531c, 10);
                    handlerThread.start();
                    hashMap.put(this.f17531c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f17531c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f17541m;
    }

    public final void p(n nVar, final TaskCompletionSource taskCompletionSource) {
        synchronized (this.f17534f) {
            this.f17533e.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: M7.o
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    w.this.q(taskCompletionSource);
                }
            });
        }
        synchronized (this.f17534f) {
            try {
                if (this.f17539k.getAndIncrement() > 0) {
                    this.f17530b.a(new Object[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c().post(new q(this, nVar.c(), nVar));
    }

    final /* synthetic */ void q(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f17534f) {
            this.f17533e.remove(taskCompletionSource);
        }
    }

    public final void r(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f17534f) {
            this.f17533e.remove(taskCompletionSource);
        }
        synchronized (this.f17534f) {
            try {
                if (this.f17539k.get() > 0 && this.f17539k.decrementAndGet() > 0) {
                    this.f17530b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                } else {
                    c().post(new r(this));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
