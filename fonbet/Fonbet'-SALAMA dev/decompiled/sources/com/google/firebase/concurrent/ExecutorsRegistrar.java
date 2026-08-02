package com.google.firebase.concurrent;

import C0.A;
import R5.M;
import Z3.a;
import Z3.b;
import Z3.c;
import Z3.d;
import com.google.firebase.components.ComponentRegistrar;
import g4.C1128a;
import g4.C1132e;
import g4.C1140m;
import g4.C1144q;
import h4.C1206i;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import p3.f;

/* loaded from: classes2.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final C1140m f11958a = new C1140m(new C1132e(2));

    /* renamed from: b, reason: collision with root package name */
    public static final C1140m f11959b = new C1140m(new C1132e(3));

    /* renamed from: c, reason: collision with root package name */
    public static final C1140m f11960c = new C1140m(new C1132e(4));

    /* renamed from: d, reason: collision with root package name */
    public static final C1140m f11961d = new C1140m(new C1132e(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C1144q c1144q = new C1144q(a.class, ScheduledExecutorService.class);
        C1144q[] c1144qArr = {new C1144q(a.class, ExecutorService.class), new C1144q(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(c1144q);
        for (C1144q c1144q2 : c1144qArr) {
            f.l(c1144q2, "Null interface");
        }
        Collections.addAll(hashSet, c1144qArr);
        C1128a c1128a = new C1128a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new M(27), hashSet3);
        C1144q c1144q3 = new C1144q(b.class, ScheduledExecutorService.class);
        C1144q[] c1144qArr2 = {new C1144q(b.class, ExecutorService.class), new C1144q(b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(c1144q3);
        for (C1144q c1144q4 : c1144qArr2) {
            f.l(c1144q4, "Null interface");
        }
        Collections.addAll(hashSet4, c1144qArr2);
        C1128a c1128a2 = new C1128a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new M(28), hashSet6);
        C1144q c1144q5 = new C1144q(c.class, ScheduledExecutorService.class);
        C1144q[] c1144qArr3 = {new C1144q(c.class, ExecutorService.class), new C1144q(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(c1144q5);
        for (C1144q c1144q6 : c1144qArr3) {
            f.l(c1144q6, "Null interface");
        }
        Collections.addAll(hashSet7, c1144qArr3);
        C1128a c1128a3 = new C1128a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new M(29), hashSet9);
        A a2 = C1128a.a(new C1144q(d.class, Executor.class));
        a2.f1216f = new C1206i(0);
        return Arrays.asList(c1128a, c1128a2, c1128a3, a2.e());
    }
}
