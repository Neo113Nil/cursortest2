package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.qf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4610qf {

    /* renamed from: a, reason: collision with root package name */
    private final String f8494a;
    private final String b;

    public C4610qf(String identifier, String baseConst) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(baseConst, "baseConst");
        this.f8494a = identifier;
        this.b = baseConst;
    }

    public final String a() {
        return this.f8494a + "_" + this.b;
    }
}
