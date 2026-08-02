package com.google.common.util.concurrent;

import com.google.common.util.concurrent.k;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes4.dex */
public final class y<V> extends k.a<V> implements RunnableFuture<V> {
    public volatile a a;

    public final class a extends s<V> {
        public final Callable<V> c;

        public a(Callable<V> callable) {
            callable.getClass();
            this.c = callable;
        }

        @Override // com.google.common.util.concurrent.s
        public final void a(Throwable th) {
            y.this.setException(th);
        }

        @Override // com.google.common.util.concurrent.s
        public final void b(V v) {
            y.this.set(v);
        }

        @Override // com.google.common.util.concurrent.s
        public final boolean d() {
            return y.this.isDone();
        }

        @Override // com.google.common.util.concurrent.s
        public final V e() throws Exception {
            return this.c.call();
        }

        @Override // com.google.common.util.concurrent.s
        public final String f() {
            return this.c.toString();
        }
    }

    public y(Callable<V> callable) {
        this.a = new a(callable);
    }

    @Override // com.google.common.util.concurrent.a
    public final void afterDone() {
        a aVar;
        super.afterDone();
        if (wasInterrupted() && (aVar = this.a) != null) {
            aVar.c();
        }
        this.a = null;
    }

    @Override // com.google.common.util.concurrent.a
    public final String pendingToString() {
        a aVar = this.a;
        if (aVar == null) {
            return super.pendingToString();
        }
        return "task=[" + aVar + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.run();
        }
        this.a = null;
    }
}
