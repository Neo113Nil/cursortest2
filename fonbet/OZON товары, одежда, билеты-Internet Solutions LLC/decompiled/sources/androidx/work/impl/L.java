package androidx.work.impl;

import android.annotation.SuppressLint;
import androidx.work.n;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes8.dex */
final class L implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f45322a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ M f45323b;

    L(M m11, String str) {
        this.f45323b = m11;
        this.f45322a = str;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"SyntheticAccessor"})
    public final void run() {
        String str = this.f45322a;
        M m11 = this.f45323b;
        try {
            try {
                n.a aVar = m11.f45341q.get();
                if (aVar == null) {
                    androidx.work.o.e().c(M.f45324s, m11.f45329e.f63801c + " returned a null result. Treating it as a failure.");
                } else {
                    androidx.work.o.e().a(M.f45324s, m11.f45329e.f63801c + " returned a " + aVar + ".");
                    m11.f45332h = aVar;
                }
                m11.f();
            } catch (InterruptedException e11) {
                e = e11;
                androidx.work.o.e().d(M.f45324s, str + " failed because it threw an exception/error", e);
                m11.f();
            } catch (CancellationException e12) {
                androidx.work.o.e().g(M.f45324s, str + " was cancelled", e12);
                m11.f();
            } catch (ExecutionException e13) {
                e = e13;
                androidx.work.o.e().d(M.f45324s, str + " failed because it threw an exception/error", e);
                m11.f();
            }
        } catch (Throwable th2) {
            m11.f();
            throw th2;
        }
    }
}
