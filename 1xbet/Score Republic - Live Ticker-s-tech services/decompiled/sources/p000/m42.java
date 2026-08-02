package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class m42 extends bs1 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f4976l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m42(String str, int i) {
        super(str);
        this.f4976l = i;
    }

    @Override // p000.bs1
    /* JADX INFO: renamed from: a */
    public final ht1 mo749a(f71 f71Var, List list) {
        int i = this.f4976l;
        nt1 nt1Var = ht1.f3330b;
        switch (i) {
            case 0:
                return nt1Var;
            case 1:
            case 2:
                return this;
            case 3:
                return new gr1(Double.valueOf(0.0d));
            default:
                return nt1Var;
        }
    }
}
