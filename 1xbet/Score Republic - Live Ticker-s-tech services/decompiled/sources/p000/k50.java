package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class k50 implements InterfaceC0048b3 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f4286j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ t50 f4287k;

    public /* synthetic */ k50(t50 t50Var, int i) {
        this.f4286j = i;
        this.f4287k = t50Var;
    }

    @Override // p000.InterfaceC0048b3
    /* JADX INFO: renamed from: f */
    public final void mo585f(Object obj) {
        int i = this.f4286j;
        t50 t50Var = this.f4287k;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                }
                p50 p50Var = (p50) t50Var.f7286F.pollFirst();
                if (p50Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = p50Var.f5989j;
                    if (t50Var.f7299c.m1663i(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    }
                }
                break;
            default:
                C0004a3 c0004a3 = (C0004a3) obj;
                p50 p50Var2 = (p50) t50Var.f7286F.pollFirst();
                if (p50Var2 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    String str2 = p50Var2.f5989j;
                    int i3 = p50Var2.f5990k;
                    c50 c50VarM1663i = t50Var.f7299c.m1663i(str2);
                    if (c50VarM1663i == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str2);
                    } else {
                        c50VarM1663i.m874p(i3, c0004a3.f29j, c0004a3.f30k);
                    }
                }
                break;
        }
    }
}
