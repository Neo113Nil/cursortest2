package com.google.firebase.appcheck;

import C0.A;
import E4.s;
import M4.e;
import M4.f;
import Z3.a;
import Z3.b;
import Z3.c;
import Z3.d;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p048g4.i;
import p048g4.q;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseAppCheckRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        q qVar = new q(d.class, Executor.class);
        q qVar2 = new q(c.class, Executor.class);
        q qVar3 = new q(a.class, Executor.class);
        q qVar4 = new q(b.class, ScheduledExecutorService.class);
        A a2 = new A(p014b4.d.class, new Class[]{p026d4.b.class});
        a2.f1213c = "fire-app-check";
        a2.b(i.b(Y3.i.class));
        a2.b(new i(qVar, 1, 0));
        a2.b(new i(qVar2, 1, 0));
        a2.b(new i(qVar3, 1, 0));
        a2.b(new i(qVar4, 1, 0));
        a2.b(i.a(f.class));
        a2.f1216f = new s(qVar, qVar2, qVar3, qVar4);
        if (!(a2.f1211a == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        a2.f1211a = 1;
        p048g4.a aVarE = a2.e();
        e eVar = new e();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(e.class));
        return Arrays.asList(aVarE, new p048g4.a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new B1.e(eVar), hashSet3), Q0.a.h("fire-app-check", "18.0.0"));
    }
}
