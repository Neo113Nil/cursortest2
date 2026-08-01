package sg.bigo.ads.z1;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13438a = new ArrayList();
    public final ArrayList b = new ArrayList();

    public static a a(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                return aVar;
            }
        }
        return null;
    }
}
