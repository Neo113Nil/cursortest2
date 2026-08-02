package com.facebook.internal;

import java.util.EnumSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public enum B {
    /* JADX INFO: Fake field, exist only in values array */
    None(0),
    Enabled(1),
    RequireConfirm(2);

    public static final a Companion = new a();
    public static final EnumSet<B> b;
    public final long a;

    public static final class a {
    }

    static {
        EnumSet<B> allOf = EnumSet.allOf(B.class);
        Intrinsics.checkNotNullExpressionValue(allOf, "allOf(SmartLoginOption::class.java)");
        b = allOf;
    }

    B(long j) {
        this.a = j;
    }
}
