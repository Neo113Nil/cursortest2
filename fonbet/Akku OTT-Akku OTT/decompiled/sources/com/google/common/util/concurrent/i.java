package com.google.common.util.concurrent;

import com.google.common.util.concurrent.f;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes4.dex */
public final class i<V> extends f<Object, V> {
    public a i;

    public final class a extends i<V>.b<V> {
        public final p e;

        public a(p pVar) {
            super();
            this.e = pVar;
        }

        @Override // com.google.common.util.concurrent.s
        public final V e() throws Exception {
            this.e.call();
            return null;
        }

        @Override // com.google.common.util.concurrent.s
        public final String f() {
            return this.e.toString();
        }
    }

    public abstract class b<T> extends s<T> {
        public final j c = j.a;

        public b() {
        }

        @Override // com.google.common.util.concurrent.s
        public final void a(Throwable th) {
            i iVar = i.this;
            iVar.i = null;
            if (th instanceof ExecutionException) {
                iVar.setException(((ExecutionException) th).getCause());
            } else if (th instanceof CancellationException) {
                iVar.cancel(false);
            } else {
                iVar.setException(th);
            }
        }

        @Override // com.google.common.util.concurrent.s
        public final void b(T t) {
            i.this.i = null;
            i.this.set(t);
        }

        @Override // com.google.common.util.concurrent.s
        public final boolean d() {
            return i.this.isDone();
        }
    }

    @Override // com.google.common.util.concurrent.f
    public final void b() {
        a aVar = this.i;
        if (aVar != null) {
            try {
                aVar.c.getClass();
                aVar.run();
            } catch (RejectedExecutionException e) {
                i.this.setException(e);
            }
        }
    }

    @Override // com.google.common.util.concurrent.f
    public final void d(f.a aVar) {
        this.e = null;
        if (aVar == f.a.a) {
            this.i = null;
        }
    }

    @Override // com.google.common.util.concurrent.a
    public final void interruptTask() {
        a aVar = this.i;
        if (aVar != null) {
            aVar.c();
        }
    }
}
