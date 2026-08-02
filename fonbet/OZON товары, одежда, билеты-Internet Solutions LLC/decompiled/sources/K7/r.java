package K7;

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
public final class r {

    /* renamed from: n, reason: collision with root package name */
    private static final HashMap f15312n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Context f15313a;

    /* renamed from: b, reason: collision with root package name */
    private final h f15314b;

    /* renamed from: g, reason: collision with root package name */
    private boolean f15319g;

    /* renamed from: h, reason: collision with root package name */
    private final Intent f15320h;

    /* renamed from: l, reason: collision with root package name */
    private ServiceConnection f15324l;

    /* renamed from: m, reason: collision with root package name */
    private e f15325m;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f15316d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet f15317e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Object f15318f = new Object();

    /* renamed from: j, reason: collision with root package name */
    private final k f15322j = new IBinder.DeathRecipient() { // from class: K7.k
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            r.h(r.this);
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f15323k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    private final String f15315c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* renamed from: i, reason: collision with root package name */
    private final WeakReference f15321i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [K7.k] */
    public r(Context context, h hVar, Intent intent) {
        this.f15313a = context;
        this.f15314b = hVar;
        this.f15320h = intent;
    }

    public static void h(r rVar) {
        rVar.f15314b.d("reportBinderDeath", new Object[0]);
        n nVar = (n) rVar.f15321i.get();
        h hVar = rVar.f15314b;
        if (nVar != null) {
            hVar.d("calling onBinderDied", new Object[0]);
            nVar.zza();
        } else {
            String str = rVar.f15315c;
            hVar.d("%s : Binder has died.", str);
            ArrayList arrayList = rVar.f15316d;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((i) it.next()).c(new RemoteException(String.valueOf(str).concat(" : Binder has died.")));
            }
            arrayList.clear();
        }
        rVar.s();
    }

    static void m(r rVar, i iVar) {
        e eVar = rVar.f15325m;
        ArrayList arrayList = rVar.f15316d;
        h hVar = rVar.f15314b;
        if (eVar != null || rVar.f15319g) {
            if (!rVar.f15319g) {
                iVar.run();
                return;
            } else {
                hVar.d("Waiting to bind to the service.", new Object[0]);
                arrayList.add(iVar);
                return;
            }
        }
        hVar.d("Initiate binding to the service.", new Object[0]);
        arrayList.add(iVar);
        q qVar = new q(rVar);
        rVar.f15324l = qVar;
        rVar.f15319g = true;
        if (rVar.f15313a.bindService(rVar.f15320h, qVar, 1)) {
            return;
        }
        hVar.d("Failed to bind to the service.", new Object[0]);
        rVar.f15319g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((i) it.next()).c(new s("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    static /* bridge */ /* synthetic */ void n(r rVar) {
        rVar.f15314b.d("linkToDeath", new Object[0]);
        try {
            rVar.f15325m.asBinder().linkToDeath(rVar.f15322j, 0);
        } catch (RemoteException e11) {
            rVar.f15314b.c(e11, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void o(r rVar) {
        rVar.f15314b.d("unlinkToDeath", new Object[0]);
        rVar.f15325m.asBinder().unlinkToDeath(rVar.f15322j, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        synchronized (this.f15318f) {
            try {
                Iterator it = this.f15317e.iterator();
                while (it.hasNext()) {
                    ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f15315c).concat(" : Binder has died.")));
                }
                this.f15317e.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Handler c() {
        Handler handler;
        HashMap hashMap = f15312n;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f15315c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f15315c, 10);
                    handlerThread.start();
                    hashMap.put(this.f15315c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f15315c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f15325m;
    }

    public final void p(i iVar, final TaskCompletionSource taskCompletionSource) {
        synchronized (this.f15318f) {
            this.f15317e.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: K7.j
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    r.this.q(taskCompletionSource);
                }
            });
        }
        synchronized (this.f15318f) {
            try {
                if (this.f15323k.getAndIncrement() > 0) {
                    this.f15314b.a(new Object[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c().post(new l(this, iVar.b(), iVar));
    }

    final /* synthetic */ void q(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f15318f) {
            this.f15317e.remove(taskCompletionSource);
        }
    }

    public final void r(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f15318f) {
            this.f15317e.remove(taskCompletionSource);
        }
        synchronized (this.f15318f) {
            try {
                if (this.f15323k.get() > 0 && this.f15323k.decrementAndGet() > 0) {
                    this.f15314b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                } else {
                    c().post(new m(this));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
