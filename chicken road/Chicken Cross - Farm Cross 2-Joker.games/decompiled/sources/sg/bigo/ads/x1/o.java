package sg.bigo.ads.x1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Set;
import sg.bigo.ads.b0.AbstractC5025b;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f13399a;

    public o(p pVar) {
        this.f13399a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f13399a;
        Set set = pVar.f13400a;
        sg.bigo.ads.P.u uVar = pVar.c;
        AbstractC5025b.a("tb_tracker", "ctime < " + (System.currentTimeMillis() - 86400000), null);
        Cursor a2 = AbstractC5025b.a("tb_tracker", "last_retry_ts < " + System.currentTimeMillis(), null, "last_retry_ts", 10);
        ArrayList arrayList = new ArrayList();
        if (a2 != null) {
            while (a2.moveToNext()) {
                s sVar = new s(uVar, a2);
                arrayList.add(sVar);
                sVar.toString();
            }
            a2.close();
        }
        set.addAll(arrayList);
        p pVar2 = this.f13399a;
        pVar2.getClass();
        p.g = true;
        AbstractC5446j.a(pVar2.f);
        AbstractC5446j.a(1, null, pVar2.f, 20000L);
    }
}
