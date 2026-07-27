package c;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f2484a;

    public /* synthetic */ d(k kVar) {
        this.f2484a = kVar;
    }

    public final void a() {
        k kVar = this.f2484a;
        Bundle a3 = ((V.e) kVar.f2505e.f1608c).a("android:support:activity-result");
        if (a3 != null) {
            f fVar = kVar.f2510k;
            fVar.getClass();
            ArrayList<Integer> integerArrayList = a3.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a3.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            fVar.f2491d = a3.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            Bundle bundle = a3.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = fVar.f2493g;
            bundle2.putAll(bundle);
            for (int i3 = 0; i3 < stringArrayList.size(); i3++) {
                String str = stringArrayList.get(i3);
                HashMap hashMap = fVar.f2489b;
                boolean containsKey = hashMap.containsKey(str);
                HashMap hashMap2 = fVar.f2488a;
                if (containsKey) {
                    Integer num = (Integer) hashMap.remove(str);
                    if (!bundle2.containsKey(str)) {
                        hashMap2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i3);
                num2.intValue();
                String str2 = stringArrayList.get(i3);
                hashMap2.put(num2, str2);
                hashMap.put(str2, num2);
            }
        }
    }
}
