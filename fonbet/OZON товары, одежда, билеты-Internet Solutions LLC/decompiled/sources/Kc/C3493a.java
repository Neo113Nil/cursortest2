package Kc;

import Gc.i;
import io.reactivex.x;
import java.util.concurrent.Callable;
import oc.C8691a;
import oc.b;
import oc.c;
import oc.e;
import sc.C9656b;

/* renamed from: Kc.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3493a {

    /* renamed from: a, reason: collision with root package name */
    static volatile Nl.a f15784a;

    static x a(Callable<x> callable) {
        try {
            x call = callable.call();
            C9656b.c(call, "Scheduler Callable result can't be null");
            return call;
        } catch (Throwable th2) {
            throw i.d(th2);
        }
    }

    public static x b(Callable<x> callable) {
        return a(callable);
    }

    public static x c(Callable<x> callable) {
        return a(callable);
    }

    public static void d(Callable callable) {
        a(callable);
    }

    public static x e(Callable<x> callable) {
        return a(callable);
    }

    public static void f(Throwable th2) {
        Nl.a aVar = f15784a;
        if (th2 == null) {
            th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th2 instanceof c) && !(th2 instanceof b) && !(th2 instanceof IllegalStateException) && !(th2 instanceof NullPointerException) && !(th2 instanceof IllegalArgumentException) && !(th2 instanceof C8691a)) {
            th2 = new e(th2);
        }
        if (aVar != null) {
            try {
                aVar.accept(th2);
                return;
            } catch (Throwable th3) {
                th3.printStackTrace();
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th3);
            }
        }
        th2.printStackTrace();
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }

    public static void g(Nl.a aVar) {
        f15784a = aVar;
    }
}
