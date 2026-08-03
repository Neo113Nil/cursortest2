package com.ironsource;

/* renamed from: com.ironsource.ne, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3190ne {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3351we f6501a;
    private final com.ironsource.Se b;
    private final com.ironsource.C2988c9 c;

    public C3190ne(com.ironsource.C3351we sdkInitResponse, com.ironsource.Se se, com.ironsource.C2988c9 c2988c9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
        this.f6501a = sdkInitResponse;
        this.b = se;
        this.c = c2988c9;
    }

    public final com.ironsource.M1 a() {
        return this.f6501a.a().b().d();
    }

    public final com.ironsource.F1 b() {
        return this.f6501a.a().b().b();
    }

    public final com.ironsource.L5 c() {
        return this.f6501a.b();
    }

    public final com.ironsource.Ve d() {
        return this.f6501a.c();
    }

    public final com.ironsource.Fb e() {
        return this.f6501a.a().b().f();
    }

    public final com.ironsource.C2988c9 f() {
        return this.c;
    }

    public final com.ironsource.Ve.a g() {
        com.ironsource.Ve.a i = this.f6501a.c().i();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(i, "sdkInitResponse.fullResponse.origin");
        return i;
    }

    protected final com.ironsource.C3351we h() {
        return this.f6501a;
    }

    public final com.ironsource.Se i() {
        return this.b;
    }

    public /* synthetic */ C3190ne(com.ironsource.C3351we c3351we, com.ironsource.Se se, com.ironsource.C2988c9 c2988c9, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(c3351we, (i & 2) != 0 ? null : se, (i & 4) != 0 ? null : c2988c9);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3190ne(com.ironsource.C3190ne sdkConfig) {
        this(sdkConfig.f6501a, sdkConfig.b, sdkConfig.c);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
    }
}
