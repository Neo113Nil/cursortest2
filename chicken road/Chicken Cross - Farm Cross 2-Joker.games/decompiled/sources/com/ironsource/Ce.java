package com.ironsource;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ce {
    private static Boolean b;

    /* renamed from: a, reason: collision with root package name */
    public static final Ce f7585a = new Ce();
    private static Be c = Be.NOT_INIT;

    private Ce() {
    }

    public final synchronized Be a() {
        return c;
    }

    public final Be b() {
        Boolean bool = b;
        if (bool == null ? true : Intrinsics.areEqual(bool, Boolean.FALSE)) {
            return Be.NOT_INIT;
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            return c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final synchronized void a(Be be) {
        Intrinsics.checkNotNullParameter(be, "<set-?>");
        c = be;
    }

    public final void a(boolean z) {
        b = Boolean.valueOf(z);
    }
}
