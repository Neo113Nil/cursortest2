package com.google.android.gms.common.api.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.collection.ArraySet;
import androidx.core.app.PendingIntentCompat;
import com.google.android.gms.common.C0852b;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.C0855e;
import com.google.android.gms.common.C0856f;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.AbstractC0861c;
import com.google.android.gms.common.internal.AbstractC0867i;
import com.google.android.gms.common.internal.C0864f;
import com.google.android.gms.common.internal.C0873o;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.C0876s;
import com.google.android.gms.common.internal.C0878u;
import com.google.android.gms.common.internal.C0880w;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.api.internal.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0833g implements Handler.Callback {

    @NonNull
    public static final Status r = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status s = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object t = new Object();

    @Nullable
    public static C0833g u;

    @Nullable
    public C0878u c;

    @Nullable
    public com.google.android.gms.common.internal.service.d d;
    public final Context e;
    public final C0855e f;
    public final com.google.android.gms.common.internal.G i;
    public final zau p;
    public volatile boolean q;
    public long a = 10000;
    public boolean b = false;
    public final AtomicInteger j = new AtomicInteger(1);
    public final AtomicInteger k = new AtomicInteger(0);
    public final ConcurrentHashMap l = new ConcurrentHashMap(5, 0.75f, 1);

    @Nullable
    public B m = null;
    public final ArraySet n = new ArraySet();
    public final ArraySet o = new ArraySet();

    public C0833g(Context context, Looper looper, C0855e c0855e) {
        this.q = true;
        this.e = context;
        zau zauVar = new zau(looper, this);
        this.p = zauVar;
        this.f = c0855e;
        this.i = new com.google.android.gms.common.internal.G(c0855e);
        if (DeviceProperties.isAuto(context)) {
            this.q = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (t) {
            try {
                C0833g c0833g = u;
                if (c0833g != null) {
                    c0833g.k.incrementAndGet();
                    zau zauVar = c0833g.p;
                    zauVar.sendMessageAtFrontOfQueue(zauVar.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Status e(C0828b c0828b, C0852b c0852b) {
        return new Status(17, androidx.fragment.app.u.a("API: ", c0828b.b.c, " is not available on this device. Connection failed with: ", String.valueOf(c0852b)), c0852b.c, c0852b);
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public static C0833g h(@NonNull Context context) {
        C0833g c0833g;
        HandlerThread handlerThread;
        synchronized (t) {
            if (u == null) {
                synchronized (AbstractC0867i.a) {
                    try {
                        handlerThread = AbstractC0867i.c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            AbstractC0867i.c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = AbstractC0867i.c;
                        }
                    } finally {
                    }
                }
                u = new C0833g(context.getApplicationContext(), handlerThread.getLooper(), C0855e.d);
            }
            c0833g = u;
        }
        return c0833g;
    }

    public final void b(@NonNull B b) {
        synchronized (t) {
            try {
                if (this.m != b) {
                    this.m = b;
                    this.n.clear();
                }
                this.n.addAll((Collection) b.e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @WorkerThread
    public final boolean c() {
        if (this.b) {
            return false;
        }
        C0876s c0876s = com.google.android.gms.common.internal.r.a().a;
        if (c0876s != null && !c0876s.b) {
            return false;
        }
        int i = this.i.a.get(203400000, -1);
        return i == -1 || i == 0;
    }

    @ResultIgnorabilityUnspecified
    public final boolean d(C0852b c0852b, int i) {
        PendingIntent pendingIntent;
        C0855e c0855e = this.f;
        c0855e.getClass();
        Context context = this.e;
        if (!com.google.android.gms.common.wrappers.b.a(context)) {
            boolean l = c0852b.l();
            int i2 = c0852b.b;
            if (l) {
                pendingIntent = c0852b.c;
            } else {
                pendingIntent = null;
                Intent a = c0855e.a(context, i2, null);
                if (a != null) {
                    pendingIntent = PendingIntentCompat.getActivity(context, 0, a, 134217728, false);
                }
            }
            if (pendingIntent != null) {
                int i3 = GoogleApiActivity.b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                c0855e.g(context, i2, PendingIntent.getActivity(context, 0, intent, zap.zaa | 134217728));
                return true;
            }
        }
        return false;
    }

    @ResultIgnorabilityUnspecified
    @WorkerThread
    public final K f(com.google.android.gms.common.api.g gVar) {
        C0828b apiKey = gVar.getApiKey();
        ConcurrentHashMap concurrentHashMap = this.l;
        K k = (K) concurrentHashMap.get(apiKey);
        if (k == null) {
            k = new K(this, gVar);
            concurrentHashMap.put(apiKey, k);
        }
        if (k.b.requiresSignIn()) {
            this.o.add(apiKey);
        }
        k.k();
        return k;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(TaskCompletionSource taskCompletionSource, int i, com.google.android.gms.common.api.g gVar) {
        U u2;
        C0833g c0833g;
        if (i == 0) {
            return;
        }
        C0828b apiKey = gVar.getApiKey();
        if (c()) {
            C0876s c0876s = com.google.android.gms.common.internal.r.a().a;
            boolean z = true;
            if (c0876s != null) {
                if (c0876s.b) {
                    boolean z2 = c0876s.c;
                    K k = (K) this.l.get(apiKey);
                    if (k != null) {
                        Object obj = k.b;
                        if (obj instanceof AbstractC0861c) {
                            AbstractC0861c abstractC0861c = (AbstractC0861c) obj;
                            if (abstractC0861c.hasConnectionInfo() && !abstractC0861c.isConnecting()) {
                                C0864f a = U.a(k, abstractC0861c, i);
                                if (a != null) {
                                    k.u++;
                                    z = a.c;
                                }
                            }
                        }
                    }
                    z = z2;
                }
            }
            c0833g = this;
            u2 = new U(c0833g, i, apiKey, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
            if (u2 == null) {
                Task task = taskCompletionSource.getTask();
                final zau zauVar = c0833g.p;
                zauVar.getClass();
                task.addOnCompleteListener(new Executor() { // from class: com.google.android.gms.common.api.internal.E
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        zauVar.post(runnable);
                    }
                }, u2);
                return;
            }
            return;
        }
        u2 = null;
        c0833g = this;
        if (u2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x02af  */
    @Override // android.os.Handler.Callback
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(@NonNull Message message) {
        K k;
        boolean z;
        C0854d[] g;
        int i = message.what;
        C0880w c0880w = C0880w.b;
        Context context = this.e;
        zau zauVar = this.p;
        ConcurrentHashMap concurrentHashMap = this.l;
        switch (i) {
            case 1:
                this.a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                zauVar.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    zauVar.sendMessageDelayed(zauVar.obtainMessage(12, (C0828b) it.next()), this.a);
                }
                return true;
            case 2:
                ((n0) message.obj).getClass();
                throw null;
            case 3:
                for (K k2 : concurrentHashMap.values()) {
                    C0875q.c(k2.v.p);
                    k2.t = null;
                    k2.k();
                }
                return true;
            case 4:
            case 8:
            case 13:
                W w = (W) message.obj;
                com.google.android.gms.common.api.g gVar = w.c;
                m0 m0Var = w.a;
                K k3 = (K) concurrentHashMap.get(gVar.getApiKey());
                if (k3 == null) {
                    k3 = f(w.c);
                }
                if (!k3.b.requiresSignIn() || this.k.get() == w.b) {
                    k3.l(m0Var);
                    return true;
                }
                m0Var.a(r);
                k3.o();
                return true;
            case 5:
                int i2 = message.arg1;
                C0852b c0852b = (C0852b) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        k = (K) it2.next();
                        if (k.p == i2) {
                        }
                    } else {
                        k = null;
                    }
                }
                if (k == null) {
                    new Exception();
                    return true;
                }
                if (c0852b.b != 13) {
                    k.b(e(k.c, c0852b));
                    return true;
                }
                int i3 = c0852b.b;
                this.f.getClass();
                AtomicBoolean atomicBoolean = com.google.android.gms.common.j.a;
                k.b(new Status(17, androidx.fragment.app.u.a("Error resolution was canceled by the user, original error message: ", C0852b.o(i3), ": ", c0852b.d), null, null));
                return true;
            case 6:
                if (context.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C0829c.b((Application) context.getApplicationContext());
                    ComponentCallbacks2C0829c componentCallbacks2C0829c = ComponentCallbacks2C0829c.e;
                    componentCallbacks2C0829c.a(new F(this));
                    AtomicBoolean atomicBoolean2 = componentCallbacks2C0829c.a;
                    AtomicBoolean atomicBoolean3 = componentCallbacks2C0829c.b;
                    if (!atomicBoolean3.get()) {
                        if (ProcessUtils.zza()) {
                            z = true;
                            if (!z) {
                                this.a = 300000L;
                                return true;
                            }
                        } else {
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                            ActivityManager.getMyMemoryState(runningAppProcessInfo);
                            if (!atomicBoolean3.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                                atomicBoolean2.set(true);
                            }
                        }
                    }
                    z = atomicBoolean2.get();
                    if (!z) {
                    }
                }
                return true;
            case 7:
                f((com.google.android.gms.common.api.g) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    K k4 = (K) concurrentHashMap.get(message.obj);
                    C0875q.c(k4.v.p);
                    if (k4.r) {
                        k4.k();
                        return true;
                    }
                }
                return true;
            case 10:
                ArraySet arraySet = this.o;
                Iterator<E> it3 = arraySet.iterator();
                while (it3.hasNext()) {
                    K k5 = (K) concurrentHashMap.remove((C0828b) it3.next());
                    if (k5 != null) {
                        k5.o();
                    }
                }
                arraySet.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    K k6 = (K) concurrentHashMap.get(message.obj);
                    C0833g c0833g = k6.v;
                    C0875q.c(c0833g.p);
                    boolean z2 = k6.r;
                    if (z2) {
                        C0828b c0828b = k6.c;
                        zau zauVar2 = k6.v.p;
                        if (z2) {
                            zauVar2.removeMessages(11, c0828b);
                            zauVar2.removeMessages(9, c0828b);
                            k6.r = false;
                        }
                        k6.b(c0833g.f.c(c0833g.e, C0856f.a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        k6.b.disconnect("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    ((K) concurrentHashMap.get(message.obj)).j(true);
                    return true;
                }
                return true;
            case 14:
                C c = (C) message.obj;
                C0828b c0828b2 = c.a;
                TaskCompletionSource taskCompletionSource = c.b;
                if (concurrentHashMap.containsKey(c0828b2)) {
                    taskCompletionSource.setResult(Boolean.valueOf(((K) concurrentHashMap.get(c0828b2)).j(false)));
                    return true;
                }
                taskCompletionSource.setResult(Boolean.FALSE);
                return true;
            case 15:
                L l = (L) message.obj;
                if (concurrentHashMap.containsKey(l.a)) {
                    K k7 = (K) concurrentHashMap.get(l.a);
                    if (k7.s.contains(l) && !k7.r) {
                        if (k7.b.isConnected()) {
                            k7.d();
                            return true;
                        }
                        k7.k();
                        return true;
                    }
                }
                return true;
            case 16:
                L l2 = (L) message.obj;
                if (concurrentHashMap.containsKey(l2.a)) {
                    K k8 = (K) concurrentHashMap.get(l2.a);
                    ArrayList arrayList = k8.s;
                    zau zauVar3 = k8.v.p;
                    LinkedList<m0> linkedList = k8.a;
                    if (arrayList.remove(l2)) {
                        zauVar3.removeMessages(15, l2);
                        zauVar3.removeMessages(16, l2);
                        C0854d c0854d = l2.b;
                        ArrayList arrayList2 = new ArrayList(linkedList.size());
                        for (m0 m0Var2 : linkedList) {
                            if ((m0Var2 instanceof S) && (g = ((S) m0Var2).g(k8)) != null && ArrayUtils.contains(g, c0854d)) {
                                arrayList2.add(m0Var2);
                            }
                        }
                        int size = arrayList2.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            m0 m0Var3 = (m0) arrayList2.get(i4);
                            linkedList.remove(m0Var3);
                            m0Var3.b(new com.google.android.gms.common.api.p(c0854d));
                        }
                    }
                }
                return true;
            case 17:
                C0878u c0878u = this.c;
                if (c0878u != null) {
                    if (c0878u.a > 0 || c()) {
                        if (this.d == null) {
                            this.d = new com.google.android.gms.common.internal.service.d(context, com.google.android.gms.common.internal.service.d.a, c0880w, g.a.c);
                        }
                        this.d.a(c0878u);
                    }
                    this.c = null;
                    return true;
                }
                return true;
            case 18:
                V v = (V) message.obj;
                long j = v.c;
                C0873o c0873o = v.a;
                int i5 = v.b;
                if (j == 0) {
                    C0878u c0878u2 = new C0878u(i5, Arrays.asList(c0873o));
                    if (this.d == null) {
                        this.d = new com.google.android.gms.common.internal.service.d(context, com.google.android.gms.common.internal.service.d.a, c0880w, g.a.c);
                    }
                    this.d.a(c0878u2);
                    return true;
                }
                C0878u c0878u3 = this.c;
                if (c0878u3 != null) {
                    List list = c0878u3.b;
                    if (c0878u3.a != i5 || (list != null && list.size() >= v.d)) {
                        zauVar.removeMessages(17);
                        C0878u c0878u4 = this.c;
                        if (c0878u4 != null) {
                            if (c0878u4.a > 0 || c()) {
                                if (this.d == null) {
                                    this.d = new com.google.android.gms.common.internal.service.d(context, com.google.android.gms.common.internal.service.d.a, c0880w, g.a.c);
                                }
                                this.d.a(c0878u4);
                            }
                            this.c = null;
                        }
                    } else {
                        C0878u c0878u5 = this.c;
                        if (c0878u5.b == null) {
                            c0878u5.b = new ArrayList();
                        }
                        c0878u5.b.add(c0873o);
                    }
                }
                if (this.c == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(c0873o);
                    this.c = new C0878u(i5, arrayList3);
                    zauVar.sendMessageDelayed(zauVar.obtainMessage(17), v.c);
                    return true;
                }
                return true;
            case 19:
                this.b = false;
                return true;
            default:
                return false;
        }
    }

    public final void i(@NonNull C0852b c0852b, int i) {
        if (d(c0852b, i)) {
            return;
        }
        zau zauVar = this.p;
        zauVar.sendMessage(zauVar.obtainMessage(5, i, 0, c0852b));
    }
}
