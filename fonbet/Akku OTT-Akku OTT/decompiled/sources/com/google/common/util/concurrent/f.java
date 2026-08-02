package com.google.common.util.concurrent;

import com.google.common.collect.E;
import com.google.common.collect.y0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* loaded from: classes4.dex */
public abstract class f<InputT, OutputT> extends g<OutputT> {
    public static final t f = new t(f.class);
    public E<? extends u<? extends InputT>> e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("OUTPUT_FUTURE_DONE", 0);
            a = aVar;
            a aVar2 = new a("ALL_INPUT_FUTURES_PROCESSED", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public final void a(E<? extends Future<? extends InputT>> e) {
        int a2 = g.c.a(this);
        com.google.common.base.k.i(a2 >= 0, "Less than 0 remaining futures");
        if (a2 == 0) {
            if (e != null) {
                y0<? extends Future<? extends InputT>> it = e.iterator();
                while (it.hasNext()) {
                    Future<? extends InputT> next = it.next();
                    if (!next.isCancelled()) {
                        boolean z = false;
                        while (true) {
                            try {
                                next.get();
                                break;
                            } catch (InterruptedException unused) {
                                z = true;
                            } catch (Throwable th) {
                                if (z) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z) {
                            try {
                                Thread.currentThread().interrupt();
                            } catch (ExecutionException e2) {
                                c(e2.getCause());
                            } catch (Throwable th2) {
                                c(th2);
                            }
                        }
                    }
                }
            }
            this.a = null;
            b();
            d(a.b);
        }
    }

    @Override // com.google.common.util.concurrent.a
    public final void afterDone() {
        super.afterDone();
        E<? extends u<? extends InputT>> e = this.e;
        d(a.a);
        if (isCancelled() && (e != null)) {
            boolean wasInterrupted = wasInterrupted();
            y0<? extends u<? extends InputT>> it = e.iterator();
            while (it.hasNext()) {
                it.next().cancel(wasInterrupted);
            }
        }
    }

    public abstract void b();

    public final void c(Throwable th) {
        th.getClass();
        boolean z = th instanceof Error;
        if (z) {
            f.a().log(Level.SEVERE, z ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
        }
    }

    public void d(a aVar) {
        this.e = null;
    }

    @Override // com.google.common.util.concurrent.a
    public final String pendingToString() {
        E<? extends u<? extends InputT>> e = this.e;
        if (e == null) {
            return super.pendingToString();
        }
        return "futures=" + e;
    }
}
