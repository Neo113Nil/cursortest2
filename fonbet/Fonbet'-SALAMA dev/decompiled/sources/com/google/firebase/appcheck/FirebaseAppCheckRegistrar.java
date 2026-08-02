package com.google.firebase.appcheck;

import C0.A;
import E4.s;
import M4.e;
import M4.f;
import Y3.i;
import Z3.a;
import Z3.b;
import Z3.c;
import Z3.d;
import b4.C0784d;
import com.google.firebase.components.ComponentRegistrar;
import d4.InterfaceC0965b;
import g4.C1128a;
import g4.C1136i;
import g4.C1144q;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public class FirebaseAppCheckRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C1144q c1144q = new C1144q(d.class, Executor.class);
        C1144q c1144q2 = new C1144q(c.class, Executor.class);
        C1144q c1144q3 = new C1144q(a.class, Executor.class);
        C1144q c1144q4 = new C1144q(b.class, ScheduledExecutorService.class);
        A a2 = new A(C0784d.class, new Class[]{InterfaceC0965b.class});
        a2.f1213c = "fire-app-check";
        a2.b(C1136i.b(i.class));
        a2.b(new C1136i(c1144q, 1, 0));
        a2.b(new C1136i(c1144q2, 1, 0));
        a2.b(new C1136i(c1144q3, 1, 0));
        a2.b(new C1136i(c1144q4, 1, 0));
        a2.b(C1136i.a(f.class));
        a2.f1216f = new s(c1144q, c1144q2, c1144q3, c1144q4);
        if (!(a2.f1211a == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        a2.f1211a = 1;
        C1128a e7 = a2.e();
        e eVar = new e();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(C1144q.a(e.class));
        return Arrays.asList(e7, new C1128a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new B1.e(eVar), hashSet3), Q0.a.h("fire-app-check", "18.0.0"));
    }
}
