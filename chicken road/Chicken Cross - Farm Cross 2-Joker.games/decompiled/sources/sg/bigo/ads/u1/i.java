package sg.bigo.ads.u1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import sg.bigo.ads.K0.H;
import sg.bigo.ads.b0.AbstractC5025b;
import sg.bigo.ads.c0.C5052c;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.t1.b f13341a;
    public final Set b;
    public final Set c;

    public i(sg.bigo.ads.t1.b bVar) {
        this.f13341a = bVar;
        this.b = H.a(bVar.f13324a);
        this.c = H.a(bVar.f13324a);
        sg.bigo.ads.v1.c.f13361a.submit(new sg.bigo.ads.v1.a(new h(this)));
    }

    public final synchronized void a(List list, boolean z) {
        this.c.removeAll(list);
        if (z) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((C5052c) it.next()).f12703a));
            }
            arrayList.size();
            StringBuilder sb = new StringBuilder("_id in (");
            int i = 0;
            while (i < arrayList.size()) {
                sb.append(i == 0 ? "?" : ",?");
                i++;
            }
            sb.append(")");
            AbstractC5025b.a("tb_stat", sb.toString(), (String[]) arrayList.toArray(new String[0]));
        } else {
            this.b.addAll(list);
        }
    }

    public final ArrayList a() {
        Cursor a2 = AbstractC5025b.a("tb_stat", null, null, "mtime DESC", Math.round(this.f13341a.f13324a * 0.8f));
        ArrayList arrayList = new ArrayList();
        if (a2 != null) {
            a2.getCount();
            while (a2.moveToNext()) {
                arrayList.add(new C5052c(a2));
            }
            a2.close();
        }
        return arrayList;
    }
}
