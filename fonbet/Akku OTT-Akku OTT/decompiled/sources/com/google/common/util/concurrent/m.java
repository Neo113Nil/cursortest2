package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public abstract class m<V> extends l<V> implements u<V> {

    public static abstract class a<V> extends m<V> {
        public final com.google.common.util.concurrent.a a;

        public a(com.google.common.util.concurrent.a aVar) {
            this.a = aVar;
        }

        @Override // com.google.common.collect.A
        public final Object delegate() {
            return this.a;
        }
    }

    @Override // com.google.common.util.concurrent.u
    public final void addListener(Runnable runnable, Executor executor) {
        ((a) this).a.addListener(runnable, executor);
    }
}
