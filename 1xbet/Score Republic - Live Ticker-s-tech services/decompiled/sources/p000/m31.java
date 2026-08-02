package p000;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class m31 extends wo1 {

    /* JADX INFO: renamed from: d */
    public final wo1 f4966d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ n31 f4967e;

    public m31(n31 n31Var, wo1 wo1Var) {
        this.f4967e = n31Var;
        this.f4966d = wo1Var;
    }

    @Override // p000.wo1
    /* JADX INFO: renamed from: q */
    public final void mo1230q(ja1 ja1Var) {
        this.f4966d.mo1230q(ja1Var);
        this.f4967e.f5281j.execute(new RunnableC0944za(9, this));
    }

    @Override // p000.wo1
    /* JADX INFO: renamed from: r */
    public final void mo1231r(er0 er0Var) {
        C0831w8 c0831w8 = er0Var.f2170b;
        C0794v8 c0794v8 = n31.f5278k;
        if (c0831w8.f8455a.get(c0794v8) != null) {
            C0270h1.m2191g("RetryingNameResolver can only be used once to wrap a NameResolver");
            return;
        }
        List list = Collections.EMPTY_LIST;
        C0831w8 c0831w9 = C0831w8.f8454b;
        List list2 = er0Var.f2169a;
        dr0 dr0Var = er0Var.f2171c;
        c0831w8.getClass();
        l31 l31Var = new l31(this.f4967e);
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(c0794v8, l31Var);
        for (Map.Entry entry : c0831w8.f8455a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((C0794v8) entry.getKey(), entry.getValue());
            }
        }
        this.f4966d.mo1231r(new er0(list2, new C0831w8(identityHashMap), dr0Var));
    }
}
