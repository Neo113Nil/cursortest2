package A0;

import Q2.C0375o;
import android.os.Bundle;
import c.AbstractActivityC0531j;
import c.C0530i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import t3.AbstractC2425d;

/* loaded from: classes.dex */
public final /* synthetic */ class N0 implements U1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f368b;

    public /* synthetic */ N0(int i, Object obj) {
        this.f367a = i;
        this.f368b = obj;
    }

    @Override // U1.d
    public final Bundle a() {
        W3.h[] hVarArr;
        switch (this.f367a) {
            case 0:
                Map d5 = ((Y.g) this.f368b).d();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : d5.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            case 1:
                C0375o c0375o = (C0375o) this.f368b;
                for (Map.Entry entry2 : X3.z.T((LinkedHashMap) c0375o.f5045o).entrySet()) {
                    c0375o.B((String) entry2.getKey(), ((s4.M) ((s4.v) entry2.getValue())).getValue());
                }
                for (Map.Entry entry3 : X3.z.T((LinkedHashMap) c0375o.f5043m).entrySet()) {
                    c0375o.B((String) entry3.getKey(), ((U1.d) entry3.getValue()).a());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) c0375o.f5042l;
                if (linkedHashMap.isEmpty()) {
                    hVarArr = new W3.h[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        arrayList.add(new W3.h((String) entry4.getKey(), entry4.getValue()));
                    }
                    hVarArr = (W3.h[]) arrayList.toArray(new W3.h[0]);
                }
                return AbstractC2425d.l((W3.h[]) Arrays.copyOf(hVarArr, hVarArr.length));
            default:
                Bundle bundle2 = new Bundle();
                C0530i c0530i = ((AbstractActivityC0531j) this.f368b).f7346r;
                c0530i.getClass();
                LinkedHashMap linkedHashMap2 = c0530i.f7332b;
                bundle2.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap2.values()));
                bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap2.keySet()));
                bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0530i.f7333c));
                bundle2.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(c0530i.f));
                return bundle2;
        }
    }
}
