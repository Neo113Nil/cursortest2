package com.ironsource;

/* renamed from: com.ironsource.a2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2945a2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.C2945a2 f6130a = new com.ironsource.C2945a2();
    public static final java.lang.String b = "trials_fail";
    public static final java.lang.String c = "parsing";
    public static final java.lang.String d = "other";
    public static final java.lang.String e = "disabled";
    public static final java.lang.String f = "-1";

    private C2945a2() {
    }

    public final java.lang.String a(boolean z) {
        if (!z) {
            return f;
        }
        return "fallback_" + java.lang.System.currentTimeMillis();
    }

    public static /* synthetic */ java.lang.String a(com.ironsource.C2945a2 c2945a2, boolean z, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return c2945a2.a(z, num);
    }

    public final java.lang.String a(boolean z, java.lang.Integer num) {
        if (z) {
            return ((num != null && num.intValue() == 1003) || (num != null && num.intValue() == 1008) || (num != null && num.intValue() == 1002)) ? c : ((num != null && num.intValue() == 1006) || (num != null && num.intValue() == 1001)) ? b : "other";
        }
        return e;
    }
}
