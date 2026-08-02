package D7;

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

/* loaded from: classes.dex */
public final class x {

    /* renamed from: n, reason: collision with root package name */
    private static final HashMap f6126n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Context f6127a;

    /* renamed from: b, reason: collision with root package name */
    private final n f6128b;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6133g;

    /* renamed from: h, reason: collision with root package name */
    private final Intent f6134h;

    /* renamed from: l, reason: collision with root package name */
    private ServiceConnection f6138l;

    /* renamed from: m, reason: collision with root package name */
    private h f6139m;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f6130d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet f6131e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Object f6132f = new Object();

    /* renamed from: j, reason: collision with root package name */
    private final q f6136j = new IBinder.DeathRecipient() { // from class: D7.q
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            x.j(x.this);
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f6137k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    private final String f6129c = "AppUpdateService";

    /* renamed from: i, reason: collision with root package name */
    private final WeakReference f6135i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [D7.q] */
    public x(Context context, n nVar, Intent intent) {
        this.f6127a = context;
        this.f6128b = nVar;
        this.f6134h = intent;
    }

    public static void j(x xVar) {
        xVar.f6128b.d("reportBinderDeath", new Object[0]);
        t tVar = (t) xVar.f6135i.get();
        if (tVar != null) {
            xVar.f6128b.d("calling onBinderDied", new Object[0]);
            tVar.zza();
        } else {
            xVar.f6128b.d("%s : Binder has died.", xVar.f6129c);
            Iterator it = xVar.f6130d.iterator();
            while (it.hasNext()) {
                ((o) it.next()).c(new RemoteException(String.valueOf(xVar.f6129c).concat(" : Binder has died.")));
            }
            xVar.f6130d.clear();
        }
        synchronized (xVar.f6132f) {
            xVar.v();
        }
    }

    static /* bridge */ /* synthetic */ void n(final x xVar, final TaskCompletionSource taskCompletionSource) {
        xVar.f6131e.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: D7.p
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                x.this.t(taskCompletionSource);
            }
        });
    }

    static void p(x xVar, o oVar) {
        h hVar = xVar.f6139m;
        ArrayList arrayList = xVar.f6130d;
        n nVar = xVar.f6128b;
        if (hVar != null || xVar.f6133g) {
            if (!xVar.f6133g) {
                oVar.run();
                return;
            } else {
                nVar.d("Waiting to bind to the service.", new Object[0]);
                arrayList.add(oVar);
                return;
            }
        }
        nVar.d("Initiate binding to the service.", new Object[0]);
        arrayList.add(oVar);
        w wVar = new w(xVar);
        xVar.f6138l = wVar;
        xVar.f6133g = true;
        if (xVar.f6127a.bindService(xVar.f6134h, wVar, 1)) {
            return;
        }
        nVar.d("Failed to bind to the service.", new Object[0]);
        xVar.f6133g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((o) it.next()).c(new y("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    static /* bridge */ /* synthetic */ void q(x xVar) {
        xVar.f6128b.d("linkToDeath", new Object[0]);
        try {
            xVar.f6139m.asBinder().linkToDeath(xVar.f6136j, 0);
        } catch (RemoteException e11) {
            xVar.f6128b.c(e11, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void r(x xVar) {
        xVar.f6128b.d("unlinkToDeath", new Object[0]);
        xVar.f6139m.asBinder().unlinkToDeath(xVar.f6136j, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        HashSet hashSet = this.f6131e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f6129c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }

    public final Handler c() {
        Handler handler;
        HashMap hashMap = f6126n;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f6129c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f6129c, 10);
                    handlerThread.start();
                    hashMap.put(this.f6129c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f6129c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f6139m;
    }

    public final void s(o oVar, TaskCompletionSource taskCompletionSource) {
        c().post(new r(this, oVar.b(), taskCompletionSource, oVar));
    }

    final /* synthetic */ void t(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f6132f) {
            this.f6131e.remove(taskCompletionSource);
        }
    }

    public final void u(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f6132f) {
            this.f6131e.remove(taskCompletionSource);
        }
        c().post(new s(this));
    }
}
