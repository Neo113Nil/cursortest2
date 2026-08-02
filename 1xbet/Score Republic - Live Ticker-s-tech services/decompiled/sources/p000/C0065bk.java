package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: bk */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0065bk implements ju0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f899a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractActivityC0790v4 f900b;

    public /* synthetic */ C0065bk(AbstractActivityC0790v4 abstractActivityC0790v4, int i) {
        this.f899a = i;
        this.f900b = abstractActivityC0790v4;
    }

    @Override // p000.ju0
    /* JADX INFO: renamed from: a */
    public final void mo715a(AbstractActivityC0252gk abstractActivityC0252gk) {
        int i = this.f899a;
        AbstractActivityC0790v4 abstractActivityC0790v4 = this.f900b;
        switch (i) {
            case 0:
                abstractActivityC0252gk.getClass();
                Bundle bundleM849c = ((C0086c5) abstractActivityC0790v4.f2777m.f5011m).m849c("android:support:activity-result");
                if (bundleM849c != null) {
                    C0177ek c0177ek = abstractActivityC0790v4.f2781q;
                    LinkedHashMap linkedHashMap = c0177ek.f2099b;
                    LinkedHashMap linkedHashMap2 = c0177ek.f2098a;
                    Bundle bundle = c0177ek.f2104g;
                    ArrayList<Integer> integerArrayList = bundleM849c.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleM849c.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = bundleM849c.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        c0177ek.f2101d.addAll(stringArrayList2);
                    }
                    Bundle bundle2 = bundleM849c.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    if (bundle2 != null) {
                        bundle.putAll(bundle2);
                    }
                    int size = stringArrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        String str = stringArrayList.get(i2);
                        if (linkedHashMap.containsKey(str)) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (bundle.containsKey(str)) {
                                continue;
                            } else {
                                if (linkedHashMap2 instanceof sg0) {
                                    xe1.m5644p(linkedHashMap2, "kotlin.collections.MutableMap");
                                    throw null;
                                }
                                linkedHashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i2);
                        num2.getClass();
                        int iIntValue = num2.intValue();
                        String str2 = stringArrayList.get(i2);
                        str2.getClass();
                        String str3 = str2;
                        linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                        c0177ek.f2099b.put(str3, Integer.valueOf(iIntValue));
                    }
                    return;
                }
                return;
            default:
                e50 e50Var = (e50) abstractActivityC0790v4.f8056D.f793k;
                e50Var.f1954q.m4719b(e50Var, e50Var, null);
                return;
        }
    }
}
