package com.google.firebase.auth;

import C0.A;
import I4.j;
import M4.e;
import M4.f;
import N4.b;
import Y3.i;
import Z3.a;
import Z3.c;
import Z3.d;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import d4.InterfaceC0965b;
import f4.C1093e;
import f4.InterfaceC1090b;
import g4.C1128a;
import g4.C1136i;
import g4.C1144q;
import g4.InterfaceC1129b;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

@Keep
/* loaded from: classes2.dex */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static FirebaseAuth lambda$getComponents$0(C1144q c1144q, C1144q c1144q2, C1144q c1144q3, C1144q c1144q4, C1144q c1144q5, InterfaceC1129b interfaceC1129b) {
        i iVar = (i) interfaceC1129b.a(i.class);
        b d7 = interfaceC1129b.d(InterfaceC0965b.class);
        b d8 = interfaceC1129b.d(f.class);
        return new C1093e(iVar, d7, d8, (Executor) interfaceC1129b.f(c1144q2), (Executor) interfaceC1129b.f(c1144q3), (ScheduledExecutorService) interfaceC1129b.f(c1144q4), (Executor) interfaceC1129b.f(c1144q5));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C1128a> getComponents() {
        C1144q c1144q = new C1144q(a.class, Executor.class);
        C1144q c1144q2 = new C1144q(Z3.b.class, Executor.class);
        C1144q c1144q3 = new C1144q(c.class, Executor.class);
        C1144q c1144q4 = new C1144q(c.class, ScheduledExecutorService.class);
        C1144q c1144q5 = new C1144q(d.class, Executor.class);
        A a2 = new A(FirebaseAuth.class, new Class[]{InterfaceC1090b.class});
        a2.b(C1136i.b(i.class));
        a2.b(new C1136i(1, 1, f.class));
        a2.b(new C1136i(c1144q, 1, 0));
        a2.b(new C1136i(c1144q2, 1, 0));
        a2.b(new C1136i(c1144q3, 1, 0));
        a2.b(new C1136i(c1144q4, 1, 0));
        a2.b(new C1136i(c1144q5, 1, 0));
        a2.b(C1136i.a(InterfaceC0965b.class));
        j jVar = new j(7);
        jVar.f3678b = c1144q;
        jVar.f3679c = c1144q2;
        jVar.f3680d = c1144q3;
        jVar.f3681e = c1144q4;
        jVar.f3682f = c1144q5;
        a2.f1216f = jVar;
        C1128a e7 = a2.e();
        e eVar = new e();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(C1144q.a(e.class));
        return Arrays.asList(e7, new C1128a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new B1.e(eVar), hashSet3), Q0.a.h("fire-auth", "23.1.0"));
    }
}
