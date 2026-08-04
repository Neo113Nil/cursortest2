package com.google.firebase.auth;

import C0.A;
import I4.j;
import M4.e;
import M4.f;
import Y3.i;
import Z3.c;
import Z3.d;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p042f4.C0896e;
import p042f4.InterfaceC0893b;
import p048g4.a;
import p048g4.b;
import p048g4.q;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static FirebaseAuth lambda$getComponents$0(q qVar, q qVar2, q qVar3, q qVar4, q qVar5, b bVar) {
        i iVar = (i) bVar.a(i.class);
        N4.b bVarD = bVar.d(p026d4.b.class);
        N4.b bVarD2 = bVar.d(f.class);
        return new C0896e(iVar, bVarD, bVarD2, (Executor) bVar.f(qVar2), (Executor) bVar.f(qVar3), (ScheduledExecutorService) bVar.f(qVar4), (Executor) bVar.f(qVar5));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<a> getComponents() {
        q qVar = new q(Z3.a.class, Executor.class);
        q qVar2 = new q(Z3.b.class, Executor.class);
        q qVar3 = new q(c.class, Executor.class);
        q qVar4 = new q(c.class, ScheduledExecutorService.class);
        q qVar5 = new q(d.class, Executor.class);
        A a2 = new A(FirebaseAuth.class, new Class[]{InterfaceC0893b.class});
        a2.b(p048g4.i.b(i.class));
        a2.b(new p048g4.i(1, 1, f.class));
        a2.b(new p048g4.i(qVar, 1, 0));
        a2.b(new p048g4.i(qVar2, 1, 0));
        a2.b(new p048g4.i(qVar3, 1, 0));
        a2.b(new p048g4.i(qVar4, 1, 0));
        a2.b(new p048g4.i(qVar5, 1, 0));
        a2.b(p048g4.i.a(p026d4.b.class));
        j jVar = new j(7);
        jVar.f3678b = qVar;
        jVar.f3679c = qVar2;
        jVar.f3680d = qVar3;
        jVar.f3681e = qVar4;
        jVar.f3682f = qVar5;
        a2.f1216f = jVar;
        a aVarE = a2.e();
        e eVar = new e();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(e.class));
        return Arrays.asList(aVarE, new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new B1.e(eVar), hashSet3), Q0.a.h("fire-auth", "23.1.0"));
    }
}
