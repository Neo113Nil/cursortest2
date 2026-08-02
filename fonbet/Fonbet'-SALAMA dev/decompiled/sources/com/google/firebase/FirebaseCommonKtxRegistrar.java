package com.google.firebase;

import C0.A;
import Y3.b;
import Z3.a;
import Z3.c;
import Z3.d;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import g4.C1128a;
import g4.C1136i;
import g4.C1144q;
import g6.AbstractC1160i;
import java.util.List;
import java.util.concurrent.Executor;

@Keep
/* loaded from: classes2.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1128a> getComponents() {
        A a2 = C1128a.a(new C1144q(a.class, D6.A.class));
        a2.b(new C1136i(new C1144q(a.class, Executor.class), 1, 0));
        a2.f1216f = b.f7649b;
        C1128a e7 = a2.e();
        A a4 = C1128a.a(new C1144q(c.class, D6.A.class));
        a4.b(new C1136i(new C1144q(c.class, Executor.class), 1, 0));
        a4.f1216f = b.f7650c;
        C1128a e8 = a4.e();
        A a7 = C1128a.a(new C1144q(Z3.b.class, D6.A.class));
        a7.b(new C1136i(new C1144q(Z3.b.class, Executor.class), 1, 0));
        a7.f1216f = b.f7651d;
        C1128a e9 = a7.e();
        A a8 = C1128a.a(new C1144q(d.class, D6.A.class));
        a8.b(new C1136i(new C1144q(d.class, Executor.class), 1, 0));
        a8.f1216f = b.f7652e;
        return AbstractC1160i.M0(e7, e8, e9, a8.e());
    }
}
