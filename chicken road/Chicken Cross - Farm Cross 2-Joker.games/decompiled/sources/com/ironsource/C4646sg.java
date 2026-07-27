package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.sg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4646sg {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4527m4 f8667a;

    public C4646sg(InterfaceC4527m4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f8667a = currentTimeProvider;
    }

    public final boolean a(long j, long j2) {
        long a2 = this.f8667a.a();
        return j2 <= 0 || j <= 0 || a2 < j || a2 - j > j2;
    }
}
