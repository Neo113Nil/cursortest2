package p000;

import java.util.HashMap;

/* JADX INFO: renamed from: hz */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0304hz extends p41 {

    /* JADX INFO: renamed from: n */
    public final HashMap f3362n = new HashMap();

    @Override // p000.p41
    /* JADX INFO: renamed from: b */
    public final m41 mo2353b(Object obj) {
        return (m41) this.f3362n.get(obj);
    }

    @Override // p000.p41
    /* JADX INFO: renamed from: c */
    public final Object mo2354c(Object obj) {
        Object objMo2354c = super.mo2354c(obj);
        this.f3362n.remove(obj);
        return objMo2354c;
    }
}
