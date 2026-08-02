package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;
import androidx.work.impl.M;
import g5.C6627B;
import g5.C6643p;
import i5.C7009b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class p implements InterfaceC5476d {

    /* renamed from: m, reason: collision with root package name */
    private static final String f45468m = androidx.work.o.i("Processor");

    /* renamed from: b, reason: collision with root package name */
    private Context f45470b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.work.c f45471c;

    /* renamed from: d, reason: collision with root package name */
    private C7009b f45472d;

    /* renamed from: e, reason: collision with root package name */
    private WorkDatabase f45473e;

    /* renamed from: i, reason: collision with root package name */
    private List<r> f45477i;

    /* renamed from: g, reason: collision with root package name */
    private HashMap f45475g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private HashMap f45474f = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private HashSet f45478j = new HashSet();

    /* renamed from: k, reason: collision with root package name */
    private final ArrayList f45479k = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    private PowerManager.WakeLock f45469a = null;

    /* renamed from: l, reason: collision with root package name */
    private final Object f45480l = new Object();

    /* renamed from: h, reason: collision with root package name */
    private HashMap f45476h = new HashMap();

    /* loaded from: classes8.dex */
    private static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private p f45481a;

        /* renamed from: b, reason: collision with root package name */
        @NonNull
        private final C6643p f45482b;

        /* renamed from: c, reason: collision with root package name */
        @NonNull
        private androidx.work.impl.utils.futures.c f45483c;

        a(@NonNull p pVar, @NonNull C6643p c6643p, @NonNull androidx.work.impl.utils.futures.c cVar) {
            this.f45481a = pVar;
            this.f45482b = c6643p;
            this.f45483c = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            boolean z11;
            try {
                z11 = ((Boolean) this.f45483c.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z11 = true;
            }
            this.f45481a.b(this.f45482b, z11);
        }
    }

    public p(@NonNull Context context, @NonNull androidx.work.c cVar, @NonNull C7009b c7009b, @NonNull WorkDatabase workDatabase, @NonNull List list) {
        this.f45470b = context;
        this.f45471c = cVar;
        this.f45472d = c7009b;
        this.f45473e = workDatabase;
        this.f45477i = list;
    }

    public static /* synthetic */ C6627B a(p pVar, ArrayList arrayList, String str) {
        WorkDatabase workDatabase = pVar.f45473e;
        arrayList.addAll(workDatabase.g().c(str));
        return workDatabase.f().m(str);
    }

    private static boolean e(M m11, @NonNull String str) {
        String str2 = f45468m;
        if (m11 == null) {
            androidx.work.o.e().a(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        m11.e();
        androidx.work.o.e().a(str2, "WorkerWrapper interrupted for " + str);
        return true;
    }

    private void n() {
        synchronized (this.f45480l) {
            try {
                if (this.f45474f.isEmpty()) {
                    try {
                        this.f45470b.startService(androidx.work.impl.foreground.b.g(this.f45470b));
                    } catch (Throwable th2) {
                        androidx.work.o.e().d(f45468m, "Unable to stop foreground service", th2);
                    }
                    PowerManager.WakeLock wakeLock = this.f45469a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f45469a = null;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.work.impl.InterfaceC5476d
    public final void b(@NonNull C6643p c6643p, boolean z11) {
        synchronized (this.f45480l) {
            try {
                M m11 = (M) this.f45475g.get(c6643p.b());
                if (m11 != null && c6643p.equals(m11.b())) {
                    this.f45475g.remove(c6643p.b());
                }
                androidx.work.o.e().a(f45468m, p.class.getSimpleName() + " " + c6643p.b() + " executed; reschedule = " + z11);
                Iterator it = this.f45479k.iterator();
                while (it.hasNext()) {
                    ((InterfaceC5476d) it.next()).b(c6643p, z11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(@NonNull InterfaceC5476d interfaceC5476d) {
        synchronized (this.f45480l) {
            this.f45479k.add(interfaceC5476d);
        }
    }

    public final C6627B d(@NonNull String str) {
        synchronized (this.f45480l) {
            try {
                M m11 = (M) this.f45474f.get(str);
                if (m11 == null) {
                    m11 = (M) this.f45475g.get(str);
                }
                if (m11 == null) {
                    return null;
                }
                return m11.c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean f(@NonNull String str) {
        boolean contains;
        synchronized (this.f45480l) {
            contains = this.f45478j.contains(str);
        }
        return contains;
    }

    public final boolean g(@NonNull String str) {
        boolean z11;
        synchronized (this.f45480l) {
            try {
                z11 = this.f45475g.containsKey(str) || this.f45474f.containsKey(str);
            } finally {
            }
        }
        return z11;
    }

    public final boolean h(@NonNull String str) {
        boolean containsKey;
        synchronized (this.f45480l) {
            containsKey = this.f45474f.containsKey(str);
        }
        return containsKey;
    }

    public final void i(@NonNull InterfaceC5476d interfaceC5476d) {
        synchronized (this.f45480l) {
            this.f45479k.remove(interfaceC5476d);
        }
    }

    public final void j(@NonNull String str, @NonNull androidx.work.h hVar) {
        synchronized (this.f45480l) {
            try {
                androidx.work.o.e().f(f45468m, "Moving WorkSpec (" + str + ") to the foreground");
                M m11 = (M) this.f45475g.remove(str);
                if (m11 != null) {
                    if (this.f45469a == null) {
                        PowerManager.WakeLock b11 = h5.u.b(this.f45470b, "ProcessorForegroundLck");
                        this.f45469a = b11;
                        b11.acquire();
                    }
                    this.f45474f.put(str, m11);
                    androidx.core.content.a.startForegroundService(this.f45470b, androidx.work.impl.foreground.b.d(this.f45470b, m11.b(), hVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean k(@NonNull t tVar, WorkerParameters.a aVar) {
        Throwable th2;
        C6643p a11 = tVar.a();
        final String b11 = a11.b();
        final ArrayList arrayList = new ArrayList();
        C6627B c6627b = (C6627B) this.f45473e.runInTransaction(new Callable() { // from class: androidx.work.impl.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p.a(p.this, arrayList, b11);
            }
        });
        if (c6627b == null) {
            androidx.work.o.e().k(f45468m, "Didn't find WorkSpec for id " + a11);
            this.f45472d.b().execute(new IU.e(4, this, a11));
            return false;
        }
        synchronized (this.f45480l) {
            try {
                try {
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
            try {
                if (g(b11)) {
                    Set set = (Set) this.f45476h.get(b11);
                    if (((t) set.iterator().next()).a().a() == a11.a()) {
                        set.add(tVar);
                        androidx.work.o.e().a(f45468m, "Work " + a11 + " is already enqueued for processing");
                    } else {
                        this.f45472d.b().execute(new IU.e(4, this, a11));
                    }
                    return false;
                }
                if (c6627b.c() != a11.a()) {
                    this.f45472d.b().execute(new IU.e(4, this, a11));
                    return false;
                }
                M.a aVar2 = new M.a(this.f45470b, this.f45471c, this.f45472d, this, this.f45473e, c6627b, arrayList);
                aVar2.d(this.f45477i);
                aVar2.c(aVar);
                M b12 = aVar2.b();
                androidx.work.impl.utils.futures.c a12 = b12.a();
                a12.a(new a(this, tVar.a(), a12), this.f45472d.b());
                this.f45475g.put(b11, b12);
                HashSet hashSet = new HashSet();
                hashSet.add(tVar);
                this.f45476h.put(b11, hashSet);
                this.f45472d.c().execute(b12);
                androidx.work.o.e().a(f45468m, p.class.getSimpleName() + ": processing " + a11);
                return true;
            } catch (Throwable th5) {
                th2 = th5;
                throw th2;
            }
        }
    }

    public final void l(@NonNull String str) {
        M m11;
        boolean z11;
        synchronized (this.f45480l) {
            try {
                androidx.work.o.e().a(f45468m, "Processor cancelling " + str);
                this.f45478j.add(str);
                m11 = (M) this.f45474f.remove(str);
                z11 = m11 != null;
                if (m11 == null) {
                    m11 = (M) this.f45475g.remove(str);
                }
                if (m11 != null) {
                    this.f45476h.remove(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(m11, str);
        if (z11) {
            n();
        }
    }

    public final void m(@NonNull String str) {
        synchronized (this.f45480l) {
            this.f45474f.remove(str);
            n();
        }
    }

    public final boolean o(@NonNull t tVar) {
        M m11;
        String b11 = tVar.a().b();
        synchronized (this.f45480l) {
            try {
                androidx.work.o.e().a(f45468m, "Processor stopping foreground work " + b11);
                m11 = (M) this.f45474f.remove(b11);
                if (m11 != null) {
                    this.f45476h.remove(b11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return e(m11, b11);
    }

    public final boolean p(@NonNull t tVar) {
        String b11 = tVar.a().b();
        synchronized (this.f45480l) {
            try {
                M m11 = (M) this.f45475g.remove(b11);
                if (m11 == null) {
                    androidx.work.o.e().a(f45468m, "WorkerWrapper could not be found for " + b11);
                    return false;
                }
                Set set = (Set) this.f45476h.get(b11);
                if (set != null && set.contains(tVar)) {
                    androidx.work.o.e().a(f45468m, "Processor stopping background work " + b11);
                    this.f45476h.remove(b11);
                    return e(m11, b11);
                }
                return false;
            } finally {
            }
        }
    }
}
