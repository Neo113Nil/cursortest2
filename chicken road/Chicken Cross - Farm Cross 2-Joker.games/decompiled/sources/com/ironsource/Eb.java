package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Eb {

    /* renamed from: a, reason: collision with root package name */
    private final int f7616a;
    private final int b;
    private final int c;
    private final boolean d;

    public Eb(JSONObject applicationLogger) {
        Intrinsics.checkNotNullParameter(applicationLogger, "applicationLogger");
        this.f7616a = applicationLogger.optInt(Fb.f7627a, 3);
        this.b = applicationLogger.optInt(Fb.b, 3);
        this.c = applicationLogger.optInt("console", 3);
        this.d = applicationLogger.optBoolean(Fb.d, false);
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.f7616a;
    }

    public final boolean d() {
        return this.d;
    }
}
