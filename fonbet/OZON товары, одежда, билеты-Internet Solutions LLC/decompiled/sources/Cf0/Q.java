package Cf0;

import We.B;
import dg0.C6198a;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf0.AbstractC8922e;
import pf0.EnumC8923f;
import q20.InterfaceC8979b;

/* loaded from: classes7.dex */
public final class Q implements We.B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC8922e f4882a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC8979b f4883b;

    public Q(@NotNull AbstractC8922e interceptor, @NotNull InterfaceC8979b debugFeaturesAccessLevelApi) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        Intrinsics.checkNotNullParameter(debugFeaturesAccessLevelApi, "debugFeaturesAccessLevelApi");
        this.f4882a = interceptor;
        this.f4883b = debugFeaturesAccessLevelApi;
    }

    @NotNull
    public final Pair<String, EnumC8923f> a() {
        AbstractC8922e abstractC8922e = this.f4882a;
        return new Pair<>(abstractC8922e.getKey(), abstractC8922e.getType());
    }

    @Override // We.B
    @NotNull
    public final We.L intercept(@NotNull B.a chain) {
        q20.c cVar;
        Intrinsics.checkNotNullParameter(chain, "chain");
        q20.c c11 = this.f4883b.c();
        AbstractC8922e abstractC8922e = this.f4882a;
        pf0.j ozonNetworkDevToolsLevel = abstractC8922e.getOzonNetworkDevToolsLevel();
        Intrinsics.checkNotNullParameter(ozonNetworkDevToolsLevel, "<this>");
        int i11 = C6198a.f61623a[ozonNetworkDevToolsLevel.ordinal()];
        if (i11 == 1) {
            cVar = q20.c.QA_BUILDS_OR_AUTOTEST;
        } else if (i11 == 2) {
            cVar = q20.c.PROD_BUILDS_OZON_QA;
        } else if (i11 == 3) {
            cVar = q20.c.PROD_BUILDS_OZON_EMPLOYEE;
        } else {
            if (i11 != 4) {
                throw new Sc.o();
            }
            cVar = q20.c.PROD_BUILDS_ALL_USERS;
        }
        return c11.compareTo(cVar) <= 0 ? abstractC8922e.getInterceptor().intercept(chain) : chain.proceed(chain.request());
    }
}
