package com.google.firebase.concurrent;

import C0.A;
import R5.M;
import Z3.a;
import Z3.b;
import Z3.c;
import Z3.d;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import p048g4.e;
import p048g4.m;
import p048g4.q;
import p056h4.i;
import p113p3.f;

/* JADX INFO: loaded from: classes2.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f11958a = new m(new e(2));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f11959b = new m(new e(3));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f11960c = new m(new e(4));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f11961d = new m(new e(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        q qVar = new q(a.class, ScheduledExecutorService.class);
        q[] qVarArr = {new q(a.class, ExecutorService.class), new q(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            f.l(qVar2, "Null interface");
        }
        Collections.addAll(hashSet, qVarArr);
        p048g4.a aVar = new p048g4.a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new M(27), hashSet3);
        q qVar3 = new q(b.class, ScheduledExecutorService.class);
        q[] qVarArr2 = {new q(b.class, ExecutorService.class), new q(b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(qVar3);
        for (q qVar4 : qVarArr2) {
            f.l(qVar4, "Null interface");
        }
        Collections.addAll(hashSet4, qVarArr2);
        p048g4.a aVar2 = new p048g4.a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new M(28), hashSet6);
        q qVar5 = new q(c.class, ScheduledExecutorService.class);
        q[] qVarArr3 = {new q(c.class, ExecutorService.class), new q(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(qVar5);
        for (q qVar6 : qVarArr3) {
            f.l(qVar6, "Null interface");
        }
        Collections.addAll(hashSet7, qVarArr3);
        p048g4.a aVar3 = new p048g4.a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new M(29), hashSet9);
        A a2 = p048g4.a.a(new q(d.class, Executor.class));
        a2.f1216f = new i(0);
        return Arrays.asList(aVar, aVar2, aVar3, a2.e());
    }
}
