package D9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f6163a = new HashMap();

    b() {
    }

    final int[] a() {
        ArrayList arrayList = new ArrayList();
        int i11 = -1;
        for (Map.Entry entry : this.f6163a.entrySet()) {
            if (((Integer) entry.getValue()).intValue() > i11) {
                i11 = ((Integer) entry.getValue()).intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (((Integer) entry.getValue()).intValue() == i11) {
                arrayList.add(entry.getKey());
            }
        }
        return C9.a.b(arrayList);
    }

    final void b(int i11) {
        HashMap hashMap = this.f6163a;
        Integer num = (Integer) hashMap.get(Integer.valueOf(i11));
        if (num == null) {
            num = 0;
        }
        hashMap.put(Integer.valueOf(i11), Integer.valueOf(num.intValue() + 1));
    }
}
