package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface da {

    public static final class a {
        public static CBError.Impression a(da daVar, String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return CBError.Impression.INTERNAL;
        }
    }

    void A();

    void C();

    void D();

    void a(float f);

    void a(float f, float f2);

    void a(k3 k3Var);

    void a(re reVar);

    void a(uj ujVar);

    void a(List list, Integer num);

    void a(boolean z, String str);

    void b(float f);

    void b(k3 k3Var);

    CBError.Impression c(String str);

    void c();

    void c(k3 k3Var);

    void d(k3 k3Var);

    void d(String str);

    void e(String str);

    void f();

    String h();

    void i();

    void m();

    String o();

    String q();

    String r();

    void t();

    String u();

    void v();

    String x();

    void y();

    void z();
}
