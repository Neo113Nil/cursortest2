package p000;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class e71 implements Comparator {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ aa0 f1993j;

    public e71(aa0 aa0Var) {
        this.f1993j = aa0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        aa0 aa0Var = this.f1993j;
        int iM166q = aa0Var.m166q(obj) - aa0Var.m166q(obj2);
        return iM166q != 0 ? iM166q : obj.getClass().getName().compareTo(obj2.getClass().getName());
    }
}
