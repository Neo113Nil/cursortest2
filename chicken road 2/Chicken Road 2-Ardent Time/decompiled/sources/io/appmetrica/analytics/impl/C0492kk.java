package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.kk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0492kk {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0466jk f6308a;

    /* renamed from: b, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.C0870z9 f6309b;

    /* renamed from: c, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.C0870z9 f6310c;

    /* renamed from: d, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.C0870z9 f6311d;

    /* renamed from: e, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.C0870z9 f6312e;

    /* renamed from: f, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.C0870z9 f6313f;

    /* renamed from: g, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.C0870z9 f6314g;

    /* renamed from: h, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.ExecutorC0440ik f6315h;

    public C0492kk() {
        this(new io.appmetrica.analytics.impl.C0466jk());
    }

    public final io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor a() {
        if (this.f6314g == null) {
            synchronized (this) {
                try {
                    if (this.f6314g == null) {
                        this.f6308a.getClass();
                        io.appmetrica.analytics.impl.HandlerThreadC0277cb a2 = io.appmetrica.analytics.impl.C0870z9.a("IAA-SDE");
                        this.f6314g = new io.appmetrica.analytics.impl.C0870z9(a2, a2.getLooper(), new android.os.Handler(a2.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f6314g;
    }

    public final io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor b() {
        if (this.f6311d == null) {
            synchronized (this) {
                try {
                    if (this.f6311d == null) {
                        this.f6308a.getClass();
                        io.appmetrica.analytics.impl.HandlerThreadC0277cb a2 = io.appmetrica.analytics.impl.C0870z9.a("IAA-SMH-1");
                        this.f6311d = new io.appmetrica.analytics.impl.C0870z9(a2, a2.getLooper(), new android.os.Handler(a2.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f6311d;
    }

    public final io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c() {
        if (this.f6312e == null) {
            synchronized (this) {
                try {
                    if (this.f6312e == null) {
                        this.f6308a.getClass();
                        io.appmetrica.analytics.impl.HandlerThreadC0277cb a2 = io.appmetrica.analytics.impl.C0870z9.a("IAA-SNTPE");
                        this.f6312e = new io.appmetrica.analytics.impl.C0870z9(a2, a2.getLooper(), new android.os.Handler(a2.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f6312e;
    }

    public final io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor d() {
        if (this.f6310c == null) {
            synchronized (this) {
                try {
                    if (this.f6310c == null) {
                        this.f6308a.getClass();
                        io.appmetrica.analytics.impl.HandlerThreadC0277cb a2 = io.appmetrica.analytics.impl.C0870z9.a("IAA-STE");
                        this.f6310c = new io.appmetrica.analytics.impl.C0870z9(a2, a2.getLooper(), new android.os.Handler(a2.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f6310c;
    }

    public C0492kk(io.appmetrica.analytics.impl.C0466jk c0466jk) {
        new java.util.HashMap();
        this.f6308a = c0466jk;
    }
}
