package com.ironsource;

/* loaded from: classes5.dex */
public final class Sd {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3312ub f5964a;
    private final java.util.Map<java.lang.String, com.ironsource.C3300u.d> b;
    private final java.util.Map<java.lang.String, com.ironsource.C3300u.d> c;

    public Sd(com.ironsource.C3312ub tools, java.util.Map<java.lang.String, com.ironsource.C3300u.d> map, java.util.Map<java.lang.String, com.ironsource.C3300u.d> map2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tools, "tools");
        this.f5964a = tools;
        this.b = map;
        this.c = map2;
    }

    private final void b(com.ironsource.N7.a aVar, java.lang.String str, java.lang.String str2, java.lang.Integer num) {
        java.lang.Object a2 = a(str2, num);
        if (kotlin.Result.m10805isSuccessimpl(a2)) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
            kotlin.jvm.internal.Intrinsics.checkNotNull(num);
            aVar.a(str, str2, num.intValue());
        }
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(a2);
        if (m10801exceptionOrNullimpl != null) {
            this.f5964a.b(str, 3004, m10801exceptionOrNullimpl.getMessage());
        }
    }

    public final void a(com.ironsource.N7.a rewardService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardService, "rewardService");
        java.util.Map<java.lang.String, com.ironsource.C3300u.d> map = this.c;
        if (map != null && (r0 = map.entrySet().iterator()) != null) {
            for (java.util.Map.Entry<java.lang.String, com.ironsource.C3300u.d> entry : map.entrySet()) {
                java.lang.String key = entry.getKey();
                com.ironsource.Qd f = entry.getValue().f();
                if (f != null) {
                    b(rewardService, key, f.b(), f.a());
                }
            }
        }
        java.util.Map<java.lang.String, com.ironsource.C3300u.d> map2 = this.b;
        if (map2 == null || (r0 = map2.entrySet().iterator()) == null) {
            return;
        }
        for (java.util.Map.Entry<java.lang.String, com.ironsource.C3300u.d> entry2 : map2.entrySet()) {
            java.lang.String key2 = entry2.getKey();
            com.ironsource.Qd a2 = entry2.getValue().a();
            if (a2 != null) {
                a(rewardService, key2, a2.b(), a2.a());
            }
        }
    }

    private final void a(com.ironsource.N7.a aVar, java.lang.String str, java.lang.String str2, java.lang.Integer num) {
        java.lang.Object a2 = a(str2, num);
        if (kotlin.Result.m10805isSuccessimpl(a2)) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
            kotlin.jvm.internal.Intrinsics.checkNotNull(num);
            aVar.b(str, str2, num.intValue());
        }
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(a2);
        if (m10801exceptionOrNullimpl != null) {
            this.f5964a.b(str, 3004, m10801exceptionOrNullimpl.getMessage());
        }
    }

    private final java.lang.Object a(java.lang.String str, java.lang.Integer num) {
        if (str != null && num != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        }
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("name - " + str + " or amount - " + num + " is not provided or invalid")));
    }
}
