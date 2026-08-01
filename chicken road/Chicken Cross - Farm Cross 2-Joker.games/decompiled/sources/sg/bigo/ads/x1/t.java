package sg.bigo.ads.x1;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import sg.bigo.ads.b0.AbstractC5025b;

/* loaded from: classes3.dex */
public abstract class t {
    public static void a(s sVar) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2;
        CopyOnWriteArrayList copyOnWriteArrayList3;
        CopyOnWriteArrayList copyOnWriteArrayList4 = sVar.r;
        if (copyOnWriteArrayList4 == null || copyOnWriteArrayList4.size() != 0 || (copyOnWriteArrayList = sVar.s) == null || copyOnWriteArrayList.size() != 0 || (copyOnWriteArrayList2 = sVar.t) == null || copyOnWriteArrayList2.size() != 0 || (copyOnWriteArrayList3 = sVar.u) == null || copyOnWriteArrayList3.size() != 0) {
            sg.bigo.ads.d0.b.b(sVar);
            return;
        }
        String valueOf = String.valueOf(sVar.f13403a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(valueOf);
        arrayList.size();
        StringBuilder sb = new StringBuilder("_id in (");
        int i = 0;
        while (i < arrayList.size()) {
            sb.append(i == 0 ? "?" : ",?");
            i++;
        }
        sb.append(")");
        AbstractC5025b.a("tb_tracker", sb.toString(), (String[]) arrayList.toArray(new String[0]));
    }
}
