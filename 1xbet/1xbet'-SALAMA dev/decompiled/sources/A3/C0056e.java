package A3;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: A3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0056e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final HashMap f639o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f642c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final E f648i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ServiceConnectionC0055d f651m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IInterface f652n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f643d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f644e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f645f = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final B f649k = new IBinder.DeathRecipient() { // from class: A3.B
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C0056e c0056e = this.f625a;
            c0056e.f641b.b("reportBinderDeath", new Object[0]);
            if (c0056e.j.get() != null) {
                throw new ClassCastException();
            }
            c0056e.f641b.b("%s : Binder has died.", c0056e.f642c);
            Iterator it = c0056e.f643d.iterator();
            while (it.hasNext()) {
                ((A) it.next()).a(new RemoteException(String.valueOf(c0056e.f642c).concat(" : Binder has died.")));
            }
            c0056e.f643d.clear();
            synchronized (c0056e.f645f) {
                c0056e.e();
            }
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f650l = new AtomicInteger(0);
    public final WeakReference j = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [A3.B] */
    public C0056e(Context context, z zVar, String str, Intent intent, E e7) {
        this.f640a = context;
        this.f641b = zVar;
        this.f642c = str;
        this.f647h = intent;
        this.f648i = e7;
    }

    public static void b(C0056e c0056e, A a2) {
        IInterface iInterface = c0056e.f652n;
        ArrayList arrayList = c0056e.f643d;
        z zVar = c0056e.f641b;
        if (iInterface != null || c0056e.f646g) {
            if (!c0056e.f646g) {
                a2.run();
                return;
            } else {
                zVar.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(a2);
                return;
            }
        }
        zVar.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(a2);
        ServiceConnectionC0055d serviceConnectionC0055d = new ServiceConnectionC0055d(c0056e);
        c0056e.f651m = serviceConnectionC0055d;
        c0056e.f646g = true;
        if (c0056e.f640a.bindService(c0056e.f647h, serviceConnectionC0055d, 1)) {
            return;
        }
        zVar.b("Failed to bind to the service.", new Object[0]);
        c0056e.f646g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((A) it.next()).a(new f("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f639o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f642c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f642c, 10);
                    handlerThread.start();
                    map.put(this.f642c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f642c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(A a2, TaskCompletionSource taskCompletionSource) {
        a().post(new D(this, a2.c(), taskCompletionSource, a2));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f645f) {
            this.f644e.remove(taskCompletionSource);
        }
        a().post(new C0054c(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.f644e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f642c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
