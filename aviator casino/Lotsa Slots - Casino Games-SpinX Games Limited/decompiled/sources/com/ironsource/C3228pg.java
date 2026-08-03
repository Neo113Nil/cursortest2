package com.ironsource;

/* renamed from: com.ironsource.pg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3228pg {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.InterfaceC3216p4 f6559a;

    public C3228pg(com.ironsource.InterfaceC3216p4 currentTimeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f6559a = currentTimeProvider;
    }

    public final boolean a(long j, long j2) {
        long a2 = this.f6559a.a();
        return j2 <= 0 || j <= 0 || a2 < j || a2 - j > j2;
    }
}
