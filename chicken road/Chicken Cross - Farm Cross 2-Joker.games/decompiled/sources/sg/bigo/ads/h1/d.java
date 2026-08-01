package sg.bigo.ads.h1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import sg.bigo.ads.b0.AbstractC5025b;
import sg.bigo.ads.c0.C5051b;

/* loaded from: classes3.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f12959a;

    public d(e eVar) {
        this.f12959a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e eVar = this.f12959a;
        eVar.b.c.a(eVar.f12960a, true);
        h hVar = this.f12959a.b.c;
        synchronized (hVar) {
            if (hVar.b.isEmpty()) {
                Cursor a2 = AbstractC5025b.a("tb_event", null, null, "mtime DESC", Math.round(hVar.f12963a.f12797a * 0.8f));
                ArrayList arrayList = new ArrayList();
                if (a2 != null) {
                    a2.getCount();
                    while (a2.moveToNext()) {
                        arrayList.add(new C5051b(a2));
                    }
                    a2.close();
                }
                Iterator it = hVar.c.iterator();
                while (it.hasNext()) {
                    arrayList.remove((C5051b) it.next());
                }
                hVar.b.addAll(arrayList);
            }
        }
        if (this.f12959a.b.c.a()) {
            return;
        }
        this.f12959a.b.b();
    }
}
