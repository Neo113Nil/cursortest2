package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class y31 {

    /* JADX INFO: renamed from: a */
    public bj1 f9141a;

    /* JADX INFO: renamed from: b */
    public ArrayList f9142b;

    /* JADX INFO: renamed from: a */
    public static long m5721a(C0629qs c0629qs, long j) {
        bj1 bj1Var = c0629qs.f6575d;
        ArrayList arrayList = c0629qs.f6582k;
        if (bj1Var instanceof fb0) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC0518ns interfaceC0518ns = (InterfaceC0518ns) arrayList.get(i);
            if (interfaceC0518ns instanceof C0629qs) {
                C0629qs c0629qs2 = (C0629qs) interfaceC0518ns;
                if (c0629qs2.f6575d != bj1Var) {
                    jMin = Math.min(jMin, m5721a(c0629qs2, ((long) c0629qs2.f6577f) + j));
                }
            }
        }
        C0629qs c0629qs3 = bj1Var.f897i;
        C0629qs c0629qs4 = bj1Var.f896h;
        if (c0629qs != c0629qs3) {
            return jMin;
        }
        long jMo712j = j - bj1Var.mo712j();
        return Math.min(Math.min(jMin, m5721a(c0629qs4, jMo712j)), jMo712j - ((long) c0629qs4.f6577f));
    }

    /* JADX INFO: renamed from: b */
    public static long m5722b(C0629qs c0629qs, long j) {
        bj1 bj1Var = c0629qs.f6575d;
        ArrayList arrayList = c0629qs.f6582k;
        if (bj1Var instanceof fb0) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC0518ns interfaceC0518ns = (InterfaceC0518ns) arrayList.get(i);
            if (interfaceC0518ns instanceof C0629qs) {
                C0629qs c0629qs2 = (C0629qs) interfaceC0518ns;
                if (c0629qs2.f6575d != bj1Var) {
                    jMax = Math.max(jMax, m5722b(c0629qs2, ((long) c0629qs2.f6577f) + j));
                }
            }
        }
        C0629qs c0629qs3 = bj1Var.f896h;
        C0629qs c0629qs4 = bj1Var.f897i;
        if (c0629qs != c0629qs3) {
            return jMax;
        }
        long jMo712j = bj1Var.mo712j() + j;
        return Math.max(Math.max(jMax, m5722b(c0629qs4, jMo712j)), jMo712j - ((long) c0629qs4.f6577f));
    }
}
