package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import p000.C0270h1;
import p000.C0473mk;
import p000.C0768uj;
import p000.C0805vj;
import p000.InterfaceC0391kc;
import p000.InterfaceC0833wa;
import p000.ci0;
import p000.cz0;
import p000.df1;
import p000.dh0;
import p000.kd0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a */
    public static final dh0 f1355a = new dh0(new C0473mk(1));

    /* JADX INFO: renamed from: b */
    public static final dh0 f1356b = new dh0(new C0473mk(2));

    /* JADX INFO: renamed from: c */
    public static final dh0 f1357c = new dh0(new C0473mk(3));

    /* JADX INFO: renamed from: d */
    public static final dh0 f1358d = new dh0(new C0473mk(4));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        cz0 cz0Var = new cz0(InterfaceC0833wa.class, ScheduledExecutorService.class);
        cz0[] cz0VarArr = {new cz0(InterfaceC0833wa.class, ExecutorService.class), new cz0(InterfaceC0833wa.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(cz0Var);
        for (cz0 cz0Var2 : cz0VarArr) {
            kd0.m3010f(cz0Var2, "Null interface");
        }
        Collections.addAll(hashSet, cz0VarArr);
        C0805vj c0805vj = new C0805vj(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C0270h1(26), hashSet3);
        cz0 cz0Var3 = new cz0(InterfaceC0391kc.class, ScheduledExecutorService.class);
        cz0[] cz0VarArr2 = {new cz0(InterfaceC0391kc.class, ExecutorService.class), new cz0(InterfaceC0391kc.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(cz0Var3);
        for (cz0 cz0Var4 : cz0VarArr2) {
            kd0.m3010f(cz0Var4, "Null interface");
        }
        Collections.addAll(hashSet4, cz0VarArr2);
        C0805vj c0805vj2 = new C0805vj(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new C0270h1(27), hashSet6);
        cz0 cz0Var5 = new cz0(ci0.class, ScheduledExecutorService.class);
        cz0[] cz0VarArr3 = {new cz0(ci0.class, ExecutorService.class), new cz0(ci0.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(cz0Var5);
        for (cz0 cz0Var6 : cz0VarArr3) {
            kd0.m3010f(cz0Var6, "Null interface");
        }
        Collections.addAll(hashSet7, cz0VarArr3);
        C0805vj c0805vj3 = new C0805vj(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new C0270h1(28), hashSet9);
        C0768uj c0768ujM5163a = C0805vj.m5163a(new cz0(df1.class, Executor.class));
        c0768ujM5163a.f7826f = new C0270h1(29);
        return Arrays.asList(c0805vj, c0805vj2, c0805vj3, c0768ujM5163a.m4927b());
    }
}
