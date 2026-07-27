package com.google.firebase.concurrent;

import B0.f;
import E.C0028c;
import G2.d;
import M1.a;
import M1.b;
import M1.c;
import N1.e;
import N1.m;
import N1.q;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final m f5312a = new m(new e(2));

    /* renamed from: b, reason: collision with root package name */
    public static final m f5313b = new m(new e(3));

    /* renamed from: c, reason: collision with root package name */
    public static final m f5314c = new m(new e(4));

    /* renamed from: d, reason: collision with root package name */
    public static final m f5315d = new m(new e(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        q qVar = new q(a.class, ScheduledExecutorService.class);
        q[] qVarArr = {new q(a.class, ExecutorService.class), new q(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            f.g(qVar2, "Null interface");
        }
        Collections.addAll(hashSet, qVarArr);
        N1.a aVar = new N1.a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C0028c(6), hashSet3);
        q qVar3 = new q(b.class, ScheduledExecutorService.class);
        q[] qVarArr2 = {new q(b.class, ExecutorService.class), new q(b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(qVar3);
        for (q qVar4 : qVarArr2) {
            f.g(qVar4, "Null interface");
        }
        Collections.addAll(hashSet4, qVarArr2);
        N1.a aVar2 = new N1.a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new C0028c(7), hashSet6);
        q qVar5 = new q(c.class, ScheduledExecutorService.class);
        q[] qVarArr3 = {new q(c.class, ExecutorService.class), new q(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(qVar5);
        for (q qVar6 : qVarArr3) {
            f.g(qVar6, "Null interface");
        }
        Collections.addAll(hashSet7, qVarArr3);
        N1.a aVar3 = new N1.a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new C0028c(8), hashSet9);
        d a6 = N1.a.a(new q(M1.d.class, Executor.class));
        a6.f939f = new C0028c(9);
        return Arrays.asList(aVar, aVar2, aVar3, a6.b());
    }
}
