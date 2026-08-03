package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class R3 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Q3 f4888a;

    /* renamed from: b, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.C0870z9 f4889b;

    /* renamed from: c, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.C0870z9 f4890c;

    public R3() {
        this(new io.appmetrica.analytics.impl.Q3());
    }

    public final io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor a() {
        if (this.f4889b == null) {
            synchronized (this) {
                try {
                    if (this.f4889b == null) {
                        this.f4888a.getClass();
                        io.appmetrica.analytics.impl.HandlerThreadC0277cb a2 = io.appmetrica.analytics.impl.C0870z9.a("IAA-CDE");
                        this.f4889b = new io.appmetrica.analytics.impl.C0870z9(a2, a2.getLooper(), new android.os.Handler(a2.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f4889b;
    }

    public final io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor b() {
        if (this.f4890c == null) {
            synchronized (this) {
                try {
                    if (this.f4890c == null) {
                        this.f4888a.getClass();
                        io.appmetrica.analytics.impl.HandlerThreadC0277cb a2 = io.appmetrica.analytics.impl.C0870z9.a("IAA-CRS");
                        this.f4890c = new io.appmetrica.analytics.impl.C0870z9(a2, a2.getLooper(), new android.os.Handler(a2.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f4890c;
    }

    public R3(io.appmetrica.analytics.impl.Q3 q3) {
        this.f4888a = q3;
    }
}
