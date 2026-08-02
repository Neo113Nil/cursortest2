package p000;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ol0 implements Comparator {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ ol0 f5782k = new ol0(5);

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5783j;

    public /* synthetic */ ol0(int i) {
        this.f5783j = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2 = 3;
        switch (this.f5783j) {
            case 0:
                nl0 nl0Var = (nl0) obj2;
                ((jt0) ((nl0) obj)).getClass();
                try {
                    Class.forName("android.app.Application", false, jt0.class.getClassLoader());
                    i = 8;
                } catch (Exception unused) {
                    i = 3;
                }
                ((jt0) nl0Var).getClass();
                try {
                    Class.forName("android.app.Application", false, jt0.class.getClassLoader());
                    i2 = 8;
                } catch (Exception unused2) {
                }
                return i - i2;
            case 1:
                return ((a91) obj).f85k - ((a91) obj2).f85k;
            case 2:
                ci1 ci1Var = (ci1) obj;
                ci1 ci1Var2 = (ci1) obj2;
                if (ci1Var.m947a() > ci1Var2.m947a()) {
                    return -1;
                }
                return ci1Var.m947a() < ci1Var2.m947a() ? 1 : 0;
            case 3:
                int iM2767b = j11.m2767b(obj);
                int iM2767b2 = j11.m2767b(obj2);
                if (iM2767b != iM2767b2) {
                    if (iM2767b == 0 || iM2767b2 == 0) {
                        throw null;
                    }
                    return iM2767b - iM2767b2;
                }
                int iM292o = AbstractC0024an.m292o(iM2767b);
                if (iM292o == 0) {
                    return ((Boolean) obj).compareTo((Boolean) obj2);
                }
                if (iM292o == 1) {
                    return ((String) obj).compareTo((String) obj2);
                }
                if (iM292o == 2) {
                    return ((Long) obj).compareTo((Long) obj2);
                }
                if (iM292o == 3) {
                    return ((Double) obj).compareTo((Double) obj2);
                }
                throw null;
            case 4:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            default:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
        }
    }
}
