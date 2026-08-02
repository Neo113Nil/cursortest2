package F4;

import F4.AbstractC3028h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: F4.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3033m<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f8919a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0<Boolean> f8920b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ReentrantLock f8921c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ArrayList f8922d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8923e;

    /* JADX WARN: Multi-variable type inference failed */
    public C3033m(@NotNull Function1<? super T, Unit> callbackInvoker, Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(callbackInvoker, "callbackInvoker");
        this.f8919a = (AbstractC7737t) callbackInvoker;
        this.f8920b = function0;
        this.f8921c = new ReentrantLock();
        this.f8922d = new ArrayList();
    }

    public final boolean a() {
        return this.f8923e;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    public final void b() {
        if (this.f8923e) {
            return;
        }
        ReentrantLock reentrantLock = this.f8921c;
        reentrantLock.lock();
        try {
            if (this.f8923e) {
                return;
            }
            this.f8923e = true;
            ArrayList arrayList = this.f8922d;
            List U02 = C7714v.U0(arrayList);
            arrayList.clear();
            Unit unit = Unit.f71690a;
            if (U02 == null) {
                return;
            }
            Iterator<T> it = U02.iterator();
            while (it.hasNext()) {
                this.f8919a.invoke(it.next());
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    public final void c(T t2) {
        Function0<Boolean> function0 = this.f8920b;
        boolean z11 = true;
        if (function0 != null && ((Boolean) ((AbstractC3028h.g) function0).invoke()).booleanValue()) {
            b();
        }
        boolean z12 = this.f8923e;
        ?? r22 = this.f8919a;
        if (z12) {
            r22.invoke(t2);
            return;
        }
        ReentrantLock reentrantLock = this.f8921c;
        reentrantLock.lock();
        try {
            if (this.f8923e) {
                Unit unit = Unit.f71690a;
            } else {
                this.f8922d.add(t2);
                z11 = false;
            }
            reentrantLock.unlock();
            if (z11) {
                r22.invoke(t2);
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void d(T t2) {
        ReentrantLock reentrantLock = this.f8921c;
        reentrantLock.lock();
        try {
            this.f8922d.remove(t2);
        } finally {
            reentrantLock.unlock();
        }
    }
}
