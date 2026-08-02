package p000;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zw1 implements ju1, InterfaceC0300hv, gp1 {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ zw1 f9974k = new zw1(0);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ zw1 f9975l = new zw1(1);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ zw1 f9976m = new zw1(2);

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ zw1 f9977n = new zw1(3);

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f9978j;

    public /* synthetic */ zw1(int i) {
        this.f9978j = i;
    }

    @Override // p000.ju1
    /* JADX INFO: renamed from: a */
    public Object mo153a() {
        switch (this.f9978j) {
            case 0:
                List list = jx1.f4164a;
                return (Boolean) is1.f3643a.get();
            case 1:
                List list2 = jx1.f4164a;
                return (Boolean) ks1.f4508a.get();
            case 2:
                return new Boolean(((Boolean) xr1.f9045a.get()).booleanValue());
            default:
                return new Boolean(((Boolean) ms1.f5156a.get()).booleanValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r3
      0x001b: PHI (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // p000.InterfaceC0300hv
    /* JADX INFO: renamed from: b */
    public C0263gv mo797b(Context context, String str, InterfaceC0225fv interfaceC0225fv) {
        C0263gv c0263gv = new C0263gv();
        c0263gv.f2941a = interfaceC0225fv.mo1893c(context, str);
        int i = 1;
        int iMo1892b = interfaceC0225fv.mo1892b(context, str, true);
        c0263gv.f2942b = iMo1892b;
        int i2 = c0263gv.f2941a;
        if (i2 == 0) {
            i2 = 0;
            if (iMo1892b == 0) {
                i = 0;
            } else if (i2 >= iMo1892b) {
                i = -1;
            }
        } else if (i2 >= iMo1892b) {
            i = -1;
        }
        c0263gv.f2943c = i;
        return c0263gv;
    }
}
