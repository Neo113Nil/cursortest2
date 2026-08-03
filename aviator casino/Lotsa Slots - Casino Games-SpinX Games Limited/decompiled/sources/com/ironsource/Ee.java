package com.ironsource;

/* loaded from: classes5.dex */
public final class Ee {
    private static java.lang.Boolean b;

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.Ee f5686a = new com.ironsource.Ee();
    private static com.ironsource.De c = com.ironsource.De.NOT_INIT;

    private Ee() {
    }

    public final synchronized com.ironsource.De a() {
        return c;
    }

    public final com.ironsource.De b() {
        java.lang.Boolean bool = b;
        if (bool == null || kotlin.jvm.internal.Intrinsics.areEqual(bool, java.lang.Boolean.FALSE)) {
            return com.ironsource.De.NOT_INIT;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(bool, java.lang.Boolean.TRUE)) {
            return c;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final synchronized void a(com.ironsource.De de) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(de, "<set-?>");
        c = de;
    }

    public final void a(boolean z) {
        b = java.lang.Boolean.valueOf(z);
    }
}
