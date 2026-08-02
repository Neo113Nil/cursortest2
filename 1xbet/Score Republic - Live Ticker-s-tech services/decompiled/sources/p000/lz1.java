package p000;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class lz1 extends rk0 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ sz1 f4933g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz1(sz1 sz1Var) {
        super(20);
        this.f4933g = sz1Var;
    }

    @Override // p000.rk0
    /* JADX INFO: renamed from: a */
    public final Object mo3295a(Object obj) {
        String str = (String) obj;
        p80.m3860e(str);
        sz1 sz1Var = this.f4933g;
        sz1Var.m2988B();
        p80.m3860e(str);
        qt1 qt1Var = sz1Var.f1566k.f8823l;
        x62.m5533U(qt1Var);
        oq0 oq0VarM4157I0 = qt1Var.m4157I0(str);
        if (oq0VarM4157I0 == null) {
            return null;
        }
        ky1 ky1Var = ((f02) sz1Var.f7192j).f2247o;
        f02.m1560m(ky1Var);
        ky1Var.f4608w.m5313b(str, "Populate EES config from database on cache miss. appId");
        sz1Var.m4615I(str, sz1Var.m4616J(str, (byte[]) oq0VarM4157I0.f5841l));
        lz1 lz1Var = sz1Var.f7241t;
        lz1Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (lz1Var.f6868c) {
            Set<Map.Entry> setEntrySet = ((LinkedHashMap) lz1Var.f6867b.f3922k).entrySet();
            setEntrySet.getClass();
            for (Map.Entry entry : setEntrySet) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return (su1) linkedHashMap.get(str);
    }
}
