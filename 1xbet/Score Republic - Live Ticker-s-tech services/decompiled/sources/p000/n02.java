package p000;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class n02 implements Callable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5234j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f5235k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ String f5236l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ String f5237m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ b12 f5238n;

    public /* synthetic */ n02(b12 b12Var, String str, String str2, String str3, int i) {
        this.f5234j = i;
        this.f5235k = str;
        this.f5236l = str2;
        this.f5237m = str3;
        this.f5238n = b12Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f5234j;
        String str = this.f5237m;
        String str2 = this.f5236l;
        String str3 = this.f5235k;
        b12 b12Var = this.f5238n;
        switch (i) {
            case 0:
                b12Var.f681b.m5550W();
                qt1 qt1Var = b12Var.f681b.f8823l;
                x62.m5533U(qt1Var);
                return qt1Var.m4198y0(str3, str2, str);
            case 1:
                b12Var.f681b.m5550W();
                qt1 qt1Var2 = b12Var.f681b.f8823l;
                x62.m5533U(qt1Var2);
                return qt1Var2.m4198y0(str3, str2, str);
            case 2:
                b12Var.f681b.m5550W();
                qt1 qt1Var3 = b12Var.f681b.f8823l;
                x62.m5533U(qt1Var3);
                return qt1Var3.m4146C0(str3, str2, str);
            default:
                b12Var.f681b.m5550W();
                qt1 qt1Var4 = b12Var.f681b.f8823l;
                x62.m5533U(qt1Var4);
                return qt1Var4.m4146C0(str3, str2, str);
        }
    }
}
