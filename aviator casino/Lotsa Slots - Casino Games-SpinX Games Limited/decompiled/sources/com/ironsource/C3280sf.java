package com.ironsource;

/* renamed from: com.ironsource.sf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3280sf {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6727a;
    private final java.lang.String b;

    public C3280sf(java.lang.String identifier, java.lang.String baseConst) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseConst, "baseConst");
        this.f6727a = identifier;
        this.b = baseConst;
    }

    public final java.lang.String a() {
        return this.f6727a + "_" + this.b;
    }
}
