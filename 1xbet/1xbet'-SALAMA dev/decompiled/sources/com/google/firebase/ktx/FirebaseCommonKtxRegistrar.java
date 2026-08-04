package com.google.firebase.ktx;

import C0.A;
import Z3.b;
import Z3.c;
import Z3.d;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import p048g4.a;
import p048g4.i;
import p048g4.q;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        A a2 = a.a(new q(Z3.a.class, D6.A.class));
        a2.b(new i(new q(Z3.a.class, Executor.class), 1, 0));
        a2.f1216f = Q4.a.f5838b;
        a aVarE = a2.e();
        A a4 = a.a(new q(c.class, D6.A.class));
        a4.b(new i(new q(c.class, Executor.class), 1, 0));
        a4.f1216f = Q4.a.f5839c;
        a aVarE2 = a4.e();
        A a7 = a.a(new q(b.class, D6.A.class));
        a7.b(new i(new q(b.class, Executor.class), 1, 0));
        a7.f1216f = Q4.a.f5840d;
        a aVarE3 = a7.e();
        A a8 = a.a(new q(d.class, D6.A.class));
        a8.b(new i(new q(d.class, Executor.class), 1, 0));
        a8.f1216f = Q4.a.f5841e;
        return p050g6.i.M0(aVarE, aVarE2, aVarE3, a8.e());
    }
}
