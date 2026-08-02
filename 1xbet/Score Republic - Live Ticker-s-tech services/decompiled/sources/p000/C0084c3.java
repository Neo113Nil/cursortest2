package p000;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: c3 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0084c3 extends vk1 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f1077e;

    public /* synthetic */ C0084c3(int i) {
        this.f1077e = i;
    }

    @Override // p000.vk1
    /* JADX INFO: renamed from: e */
    public final Object mo843e(Intent intent, int i) {
        switch (this.f1077e) {
            case 0:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArrayExtra) {
                            if (str != null) {
                                arrayList2.add(str);
                            }
                        }
                        Iterator it = arrayList2.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList3 = new ArrayList(Math.min(arrayList2.size(), arrayList.size()));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList3.add(new kv0(it.next(), it2.next()));
                        }
                        return fm0.m1882H(arrayList3);
                    }
                }
                return C0448lw.f4914j;
            case 1:
                return new C0004a3(intent, i);
            default:
                return new C0004a3(intent, i);
        }
    }
}
