package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;

/* loaded from: classes.dex */
public final class Yf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final File f6864a;

    /* renamed from: b, reason: collision with root package name */
    public final Function f6865b;

    /* renamed from: c, reason: collision with root package name */
    public final Consumer f6866c;

    /* renamed from: d, reason: collision with root package name */
    public final Consumer f6867d;

    /* renamed from: e, reason: collision with root package name */
    public final C0516ga f6868e;
    public final InterfaceC0475el f;

    public Yf(File file, Function function, Consumer consumer, Consumer consumer2, C0516ga c0516ga, InterfaceC0475el interfaceC0475el) {
        this.f6864a = file;
        this.f6865b = function;
        this.f6866c = consumer;
        this.f6867d = consumer2;
        this.f6868e = c0516ga;
        this.f = interfaceC0475el;
    }

    public static final void a(File file) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6864a.exists()) {
            E9 b3 = this.f6868e.b(this.f6864a.getName());
            Consumer consumer = this.f6866c;
            try {
                b3.f5904a.lock();
                b3.f5905b.a();
            } catch (Throwable unused) {
            }
            if (!this.f6864a.exists()) {
                consumer.consume(this.f6864a);
                b3.c();
                C0516ga c0516ga = this.f6868e;
                String name = this.f6864a.getName();
                synchronized (c0516ga) {
                    c0516ga.f7366b.remove(name);
                }
                return;
            }
            Object apply = this.f6865b.apply(this.f6864a);
            if (apply != null) {
                if (this.f.a(apply)) {
                    this.f6867d.consume(apply);
                } else {
                    consumer = new Qo();
                }
            }
            consumer.consume(this.f6864a);
            b3.c();
            this.f6868e.a(this.f6864a.getName());
        }
    }
}
