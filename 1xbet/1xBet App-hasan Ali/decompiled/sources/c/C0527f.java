package c;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: c.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0527f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0531j f7325a;

    public /* synthetic */ C0527f(AbstractActivityC0531j abstractActivityC0531j) {
        this.f7325a = abstractActivityC0531j;
    }

    public final void a(AbstractActivityC0531j abstractActivityC0531j) {
        kotlin.jvm.internal.l.f("it", abstractActivityC0531j);
        AbstractActivityC0531j abstractActivityC0531j2 = this.f7325a;
        Bundle u5 = ((v3.g) abstractActivityC0531j2.f7342n.f1750m).u("android:support:activity-result");
        if (u5 != null) {
            C0530i c0530i = abstractActivityC0531j2.f7346r;
            c0530i.getClass();
            ArrayList<Integer> integerArrayList = u5.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = u5.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = u5.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                c0530i.f7333c.addAll(stringArrayList2);
            }
            Bundle bundle = u5.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = c0530i.f;
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                LinkedHashMap linkedHashMap = c0530i.f7332b;
                boolean containsKey = linkedHashMap.containsKey(str);
                LinkedHashMap linkedHashMap2 = c0530i.f7331a;
                if (containsKey) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle2.containsKey(str)) {
                        kotlin.jvm.internal.z.a(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                kotlin.jvm.internal.l.e("get(...)", num2);
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                kotlin.jvm.internal.l.e("get(...)", str2);
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(intValue), str3);
                linkedHashMap.put(str3, Integer.valueOf(intValue));
            }
        }
    }
}
