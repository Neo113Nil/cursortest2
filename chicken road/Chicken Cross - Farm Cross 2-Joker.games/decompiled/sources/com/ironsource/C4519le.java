package com.ironsource;

import com.ironsource.Te;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.le, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4519le {

    /* renamed from: a, reason: collision with root package name */
    private final C4680ue f8316a;
    private final Qe b;
    private final C4371d9 c;

    public C4519le(C4680ue sdkInitResponse, Qe qe, C4371d9 c4371d9) {
        Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
        this.f8316a = sdkInitResponse;
        this.b = qe;
        this.c = c4371d9;
    }

    public final K1 a() {
        return this.f8316a.a().b().d();
    }

    public final D1 b() {
        return this.f8316a.a().b().b();
    }

    public final K5 c() {
        return this.f8316a.b();
    }

    public final Te d() {
        return this.f8316a.c();
    }

    public final Eb e() {
        return this.f8316a.a().b().f();
    }

    public final C4371d9 f() {
        return this.c;
    }

    public final Te.a g() {
        Te.a i = this.f8316a.c().i();
        Intrinsics.checkNotNullExpressionValue(i, "sdkInitResponse.fullResponse.origin");
        return i;
    }

    protected final C4680ue h() {
        return this.f8316a;
    }

    public final Qe i() {
        return this.b;
    }

    public /* synthetic */ C4519le(C4680ue c4680ue, Qe qe, C4371d9 c4371d9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4680ue, (i & 2) != 0 ? null : qe, (i & 4) != 0 ? null : c4371d9);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4519le(C4519le sdkConfig) {
        this(sdkConfig.f8316a, sdkConfig.b, sdkConfig.c);
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
    }
}
