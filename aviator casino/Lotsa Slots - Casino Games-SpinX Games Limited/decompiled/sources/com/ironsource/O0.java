package com.ironsource;

/* loaded from: classes5.dex */
public class O0 {
    public static final int e = -1;

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.O0.a f5864a;
    private final long b;
    private final long c;
    private final long d;

    public enum a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        MANUAL_WITH_LOAD_ON_SHOW,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public O0(com.ironsource.O0.a aVar, long j, long j2, long j3) {
        this.f5864a = aVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public com.ironsource.O0.a a() {
        return this.f5864a;
    }

    public long b() {
        return this.d;
    }

    public long c() {
        return this.c;
    }

    public long d() {
        return this.b;
    }

    public boolean e() {
        com.ironsource.O0.a aVar = this.f5864a;
        return aVar == com.ironsource.O0.a.AUTOMATIC_LOAD_AFTER_CLOSE || aVar == com.ironsource.O0.a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    public boolean f() {
        com.ironsource.O0.a aVar = this.f5864a;
        return aVar == com.ironsource.O0.a.MANUAL || aVar == com.ironsource.O0.a.MANUAL_WITH_AUTOMATIC_RELOAD || aVar == com.ironsource.O0.a.MANUAL_WITH_LOAD_ON_SHOW;
    }
}
