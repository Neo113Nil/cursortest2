package p000;

import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ua0 extends y40 {

    /* JADX INFO: renamed from: w */
    public final AbstractC0959zp f7734w;

    /* JADX INFO: renamed from: x */
    public final lj0 f7735x;

    public ua0(AbstractC0959zp abstractC0959zp, lj0 lj0Var) {
        a90.m127k(abstractC0959zp, "delegate");
        this.f7734w = abstractC0959zp;
        a90.m127k(lj0Var, "healthListener");
        this.f7735x = lj0Var;
    }

    @Override // p000.y40
    /* JADX INFO: renamed from: G */
    public final AbstractC0959zp mo2154G() {
        return this.f7734w;
    }

    @Override // p000.AbstractC0959zp
    /* JADX INFO: renamed from: e */
    public final C0831w8 mo2156e() {
        C0831w8 c0831w8Mo2156e = this.f7734w.mo2156e();
        c0831w8Mo2156e.getClass();
        Boolean bool = Boolean.TRUE;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(mj0.f5056d, bool);
        for (Map.Entry entry : c0831w8Mo2156e.f8455a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((C0794v8) entry.getKey(), entry.getValue());
            }
        }
        return new C0831w8(identityHashMap);
    }

    @Override // p000.AbstractC0959zp
    /* JADX INFO: renamed from: u */
    public final void mo2158u(lj0 lj0Var) {
        this.f7734w.mo2158u(new ta0(0, this, lj0Var));
    }
}
