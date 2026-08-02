package p000;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class lf1 implements hq0 {

    /* JADX INFO: renamed from: b */
    public static final lf1 f4798b = new lf1(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4799a;

    public /* synthetic */ lf1(int i) {
        this.f4799a = i;
    }

    @Override // p000.hq0
    /* JADX INFO: renamed from: a */
    public final boolean mo639a(Object obj) {
        switch (this.f4799a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // p000.hq0
    /* JADX INFO: renamed from: b */
    public final gq0 mo640b(Object obj, int i, int i2, uu0 uu0Var) {
        switch (this.f4799a) {
            case 0:
                return new gq0(new us0(obj), new C0170ed(1, obj));
            case 1:
                File file = (File) obj;
                return new gq0(new us0(file), new C0170ed(0, file));
            default:
                return null;
        }
    }
}
