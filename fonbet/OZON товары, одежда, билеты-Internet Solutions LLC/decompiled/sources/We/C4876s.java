package We;

import cf.C5824e;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: We.s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4876s {

    /* renamed from: b, reason: collision with root package name */
    private ThreadPoolExecutor f33803b;

    /* renamed from: a, reason: collision with root package name */
    private int f33802a = 5;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<C5824e.a> f33804c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque<C5824e.a> f33805d = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque<C5824e> f33806e = new ArrayDeque<>();

    private final void c(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            Unit unit = Unit.f71690a;
        }
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void f() {
        int size;
        int i11;
        ThreadPoolExecutor threadPoolExecutor;
        byte[] bArr = Ye.b.f34900a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<C5824e.a> it = this.f33804c.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    C5824e.a asyncCall = it.next();
                    if (this.f33805d.size() < 64) {
                        if (asyncCall.c().get() < this.f33802a) {
                            it.remove();
                            asyncCall.c().incrementAndGet();
                            Intrinsics.checkNotNullExpressionValue(asyncCall, "asyncCall");
                            arrayList.add(asyncCall);
                            this.f33805d.add(asyncCall);
                        }
                    }
                }
                synchronized (this) {
                    this.f33805d.size();
                    this.f33806e.size();
                }
                size = arrayList.size();
                for (i11 = 0; i11 < size; i11++) {
                    C5824e.a aVar = (C5824e.a) arrayList.get(i11);
                    synchronized (this) {
                        try {
                            if (this.f33803b == null) {
                                this.f33803b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Ye.b.y(Ye.b.f34906g + " Dispatcher", false));
                            }
                            threadPoolExecutor = this.f33803b;
                            Intrinsics.f(threadPoolExecutor);
                        } finally {
                        }
                    }
                    aVar.a(threadPoolExecutor);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Unit unit = Unit.f71690a;
        size = arrayList.size();
        while (i11 < size) {
        }
    }

    public final void a(@NotNull C5824e.a call) {
        C5824e.a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (this) {
            try {
                this.f33804c.add(call);
                if (!call.b().j()) {
                    String d11 = call.d();
                    Iterator<C5824e.a> it = this.f33805d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator<C5824e.a> it2 = this.f33804c.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    aVar = null;
                                    break;
                                } else {
                                    aVar = it2.next();
                                    if (Intrinsics.d(aVar.d(), d11)) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            aVar = it.next();
                            if (Intrinsics.d(aVar.d(), d11)) {
                                break;
                            }
                        }
                    }
                    if (aVar != null) {
                        call.e(aVar);
                    }
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f();
    }

    public final synchronized void b(@NotNull C5824e call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f33806e.add(call);
    }

    public final void d(@NotNull C5824e.a call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.c().decrementAndGet();
        c(this.f33805d, call);
    }

    public final void e(@NotNull C5824e call) {
        Intrinsics.checkNotNullParameter(call, "call");
        c(this.f33806e, call);
    }

    @NotNull
    public final synchronized List<InterfaceC4865g> g() {
        List<InterfaceC4865g> unmodifiableList;
        try {
            ArrayDeque<C5824e> arrayDeque = this.f33806e;
            ArrayDeque<C5824e.a> arrayDeque2 = this.f33805d;
            ArrayList arrayList = new ArrayList(C7714v.z(arrayDeque2, 10));
            Iterator<C5824e.a> it = arrayDeque2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().b());
            }
            unmodifiableList = Collections.unmodifiableList(C7714v.p0(arrayList, arrayDeque));
            Intrinsics.checkNotNullExpressionValue(unmodifiableList, "Collections.unmodifiable…yncCalls.map { it.call })");
        } catch (Throwable th2) {
            throw th2;
        }
        return unmodifiableList;
    }

    public final void h() {
        synchronized (this) {
            this.f33802a = 20;
            Unit unit = Unit.f71690a;
        }
        f();
    }
}
