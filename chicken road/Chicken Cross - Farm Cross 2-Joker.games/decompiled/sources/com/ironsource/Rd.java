package com.ironsource;

import com.ironsource.C4665u;
import com.ironsource.L7;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Rd {

    /* renamed from: a, reason: collision with root package name */
    private final C4659tb f7878a;
    private final Map<String, C4665u.d> b;
    private final Map<String, C4665u.d> c;

    public Rd(C4659tb tools, Map<String, C4665u.d> map, Map<String, C4665u.d> map2) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        this.f7878a = tools;
        this.b = map;
        this.c = map2;
    }

    private final void b(L7.a aVar, String str, String str2, Integer num) {
        Object a2 = a(str2, num);
        if (Result.m8086isSuccessimpl(a2)) {
            Intrinsics.checkNotNull(str2);
            Intrinsics.checkNotNull(num);
            aVar.a(str, str2, num.intValue());
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(a2);
        if (m8082exceptionOrNullimpl != null) {
            this.f7878a.b(str, 3004, m8082exceptionOrNullimpl.getMessage());
        }
    }

    public final void a(L7.a rewardService) {
        Intrinsics.checkNotNullParameter(rewardService, "rewardService");
        Map<String, C4665u.d> map = this.c;
        if (map != null && (r0 = map.entrySet().iterator()) != null) {
            for (Map.Entry<String, C4665u.d> entry : map.entrySet()) {
                String key = entry.getKey();
                Pd f = entry.getValue().f();
                if (f != null) {
                    b(rewardService, key, f.b(), f.a());
                }
            }
        }
        Map<String, C4665u.d> map2 = this.b;
        if (map2 == null || (r0 = map2.entrySet().iterator()) == null) {
            return;
        }
        for (Map.Entry<String, C4665u.d> entry2 : map2.entrySet()) {
            String key2 = entry2.getKey();
            Pd a2 = entry2.getValue().a();
            if (a2 != null) {
                a(rewardService, key2, a2.b(), a2.a());
            }
        }
    }

    private final void a(L7.a aVar, String str, String str2, Integer num) {
        Object a2 = a(str2, num);
        if (Result.m8086isSuccessimpl(a2)) {
            Intrinsics.checkNotNull(str2);
            Intrinsics.checkNotNull(num);
            aVar.b(str, str2, num.intValue());
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(a2);
        if (m8082exceptionOrNullimpl != null) {
            this.f7878a.b(str, 3004, m8082exceptionOrNullimpl.getMessage());
        }
    }

    private final Object a(String str, Integer num) {
        if (str != null && num != null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m8079constructorimpl(Unit.INSTANCE);
        }
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m8079constructorimpl(ResultKt.createFailure(new Exception("name - " + str + " or amount - " + num + " is not provided or invalid")));
    }
}
