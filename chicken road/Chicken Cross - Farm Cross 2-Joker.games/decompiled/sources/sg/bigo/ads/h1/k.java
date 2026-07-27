package sg.bigo.ads.h1;

import android.database.Cursor;
import java.util.ArrayList;
import sg.bigo.ads.b0.AbstractC5025b;
import sg.bigo.ads.c0.C5051b;

/* loaded from: classes3.dex */
public final class k extends r {
    public k(sg.bigo.ads.g1.a aVar) {
        super(aVar);
    }

    @Override // sg.bigo.ads.h1.r
    public final int c() {
        return this.f12971a.e;
    }

    @Override // sg.bigo.ads.h1.r
    public final ArrayList f() {
        Cursor a2 = AbstractC5025b.a("tb_event", "event_action = ? OR event_action = ?", new String[]{"impression", "clicked"}, "mtime DESC", this.f12971a.e);
        ArrayList arrayList = new ArrayList();
        if (a2 != null) {
            a2.getCount();
            while (a2.moveToNext()) {
                arrayList.add(new C5051b(a2));
            }
            a2.close();
        }
        return arrayList;
    }
}
