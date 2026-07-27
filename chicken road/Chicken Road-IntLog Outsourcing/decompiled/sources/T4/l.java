package T4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b2.AbstractC0279e;
import g4.AbstractC0465j;
import java.io.InterruptedIOException;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f2901a;

    /* renamed from: b, reason: collision with root package name */
    public int f2902b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2903c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractCollection f2904d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2905e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2906f;

    public l() {
        this.f2901a = 64;
        this.f2902b = 5;
        this.f2904d = new ArrayDeque();
        this.f2905e = new ArrayDeque();
        this.f2906f = new ArrayDeque();
    }

    public static void d(l lVar, X4.o oVar, X4.r rVar, X4.o oVar2, int i2) {
        k kVar;
        if ((i2 & 1) != 0) {
            oVar = null;
        }
        if ((i2 & 2) != 0) {
            rVar = null;
        }
        if ((i2 & 4) != 0) {
            oVar2 = null;
        }
        lVar.getClass();
        TimeZone timeZone = U4.e.f3179a;
        boolean isShutdown = ((ThreadPoolExecutor) lVar.a()).isShutdown();
        synchronized (lVar) {
            if (rVar != null) {
                try {
                    if (!((ArrayDeque) lVar.f2906f).remove(rVar)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (oVar2 != null) {
                oVar2.f3585b.decrementAndGet();
                if (!((ArrayDeque) lVar.f2905e).remove(oVar2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (oVar != null) {
                ((ArrayDeque) lVar.f2904d).add(oVar);
                X4.o b6 = lVar.b(((q) oVar.f3586c.f3590b.f1783c).f2926d);
                if (b6 != null) {
                    oVar.f3585b = b6.f3585b;
                }
            }
            if ((rVar != null || oVar2 != null) && (isShutdown || ((ArrayDeque) lVar.f2905e).isEmpty())) {
                ((ArrayDeque) lVar.f2906f).isEmpty();
            }
            if (isShutdown) {
                List S02 = AbstractC0465j.S0((ArrayDeque) lVar.f2904d);
                ((ArrayDeque) lVar.f2904d).clear();
                kVar = new k(S02);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) lVar.f2904d).iterator();
                kotlin.jvm.internal.i.d(it, "iterator(...)");
                while (it.hasNext()) {
                    X4.o oVar3 = (X4.o) it.next();
                    if (((ArrayDeque) lVar.f2905e).size() >= lVar.f2901a) {
                        break;
                    }
                    if (oVar3.f3585b.get() < lVar.f2902b) {
                        it.remove();
                        oVar3.f3585b.incrementAndGet();
                        arrayList.add(oVar3);
                        ((ArrayDeque) lVar.f2905e).add(oVar3);
                    }
                }
                kVar = new k(arrayList);
            }
        }
        int size = kVar.f2900a.size();
        for (int i3 = 0; i3 < size; i3++) {
            X4.o oVar4 = (X4.o) kVar.f2900a.get(i3);
            if (oVar4 != oVar) {
                X4.r rVar2 = oVar4.f3586c;
            }
            if (isShutdown) {
                oVar4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                oVar4.f3586c.h(interruptedIOException);
                ((x3.b) oVar4.f3584a.f146b).accept(interruptedIOException);
            } else {
                ExecutorService a6 = lVar.a();
                oVar4.getClass();
                X4.r rVar3 = oVar4.f3586c;
                kotlin.jvm.internal.i.e(rVar3.f3589a.f2960a, "<this>");
                try {
                    try {
                        ((ThreadPoolExecutor) a6).execute(oVar4);
                    } catch (RejectedExecutionException e3) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e3);
                        oVar4.f3586c.h(interruptedIOException2);
                        ((x3.b) oVar4.f3584a.f146b).accept(interruptedIOException2);
                        rVar3.f3589a.f2960a.c(oVar4);
                    }
                } catch (Throwable th2) {
                    rVar3.f3589a.f2960a.c(oVar4);
                    throw th2;
                }
            }
        }
    }

    public synchronized ExecutorService a() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f2903c) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String name = U4.e.f3180b + " Dispatcher";
                kotlin.jvm.internal.i.e(name, "name");
                this.f2903c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new U4.d(name, false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f2903c;
            kotlin.jvm.internal.i.b(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public X4.o b(String str) {
        Iterator it = ((ArrayDeque) this.f2905e).iterator();
        kotlin.jvm.internal.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            X4.o oVar = (X4.o) it.next();
            if (kotlin.jvm.internal.i.a(((q) oVar.f3586c.f3590b.f1783c).f2926d, str)) {
                return oVar;
            }
        }
        Iterator it2 = ((ArrayDeque) this.f2904d).iterator();
        kotlin.jvm.internal.i.d(it2, "iterator(...)");
        while (it2.hasNext()) {
            X4.o oVar2 = (X4.o) it2.next();
            if (kotlin.jvm.internal.i.a(((q) oVar2.f3586c.f3590b.f1783c).f2926d, str)) {
                return oVar2;
            }
        }
        return null;
    }

    public void c(X4.o call) {
        kotlin.jvm.internal.i.e(call, "call");
        d(this, null, null, call, 3);
    }

    public void e(int i2) {
        RecyclerView recyclerView = (RecyclerView) this.f2906f;
        if (i2 < 0 || i2 >= recyclerView.f4655e0.a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i2 + "(" + i2 + "). Item count:" + recyclerView.f4655e0.a() + recyclerView.h());
        }
        W.B b6 = recyclerView.f4655e0;
        boolean z = b6.f3260c;
        ArrayList arrayList = (ArrayList) this.f2903c;
        if (arrayList.size() > 0) {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
        ArrayList arrayList2 = (ArrayList) recyclerView.f4652d.f313d;
        if (arrayList2.size() > 0) {
            RecyclerView.j((View) arrayList2.get(0));
            throw null;
        }
        ArrayList arrayList3 = (ArrayList) this.f2904d;
        if (arrayList3.size() > 0) {
            arrayList3.get(0).getClass();
            throw new ClassCastException();
        }
        int C2 = recyclerView.f4650c.C(i2, 0);
        if (C2 >= 0) {
            throw null;
        }
        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i2 + "(offset:" + C2 + ").state:" + b6.a() + recyclerView.h());
    }

    public void f() {
        W.t tVar = ((RecyclerView) this.f2906f).f4662i;
        this.f2902b = this.f2901a;
        ArrayList arrayList = (ArrayList) this.f2904d;
        int size = arrayList.size() - 1;
        if (size < 0 || arrayList.size() <= this.f2902b) {
            return;
        }
        AbstractC0279e.o(arrayList.get(size));
        int[] iArr = RecyclerView.f4627o0;
        throw null;
    }

    public l(RecyclerView recyclerView) {
        this.f2906f = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f2903c = arrayList;
        this.f2904d = new ArrayList();
        Collections.unmodifiableList(arrayList);
        this.f2901a = 2;
        this.f2902b = 2;
    }
}
