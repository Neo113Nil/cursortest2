package com.ironsource;

/* loaded from: classes5.dex */
public final class Fb {

    /* renamed from: a, reason: collision with root package name */
    private final int f5704a;
    private final int b;
    private final int c;
    private final boolean d;

    public Fb(org.json.JSONObject applicationLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationLogger, "applicationLogger");
        this.f5704a = applicationLogger.optInt(com.ironsource.Gb.f5725a, 3);
        this.b = applicationLogger.optInt(com.ironsource.Gb.b, 3);
        this.c = applicationLogger.optInt("console", 3);
        this.d = applicationLogger.optBoolean(com.ironsource.Gb.d, false);
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.f5704a;
    }

    public final boolean d() {
        return this.d;
    }
}
