package sg.bigo.ads.X0;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import sg.bigo.ads.b0.AbstractC5025b;
import sg.bigo.ads.c0.C5053d;

/* renamed from: sg.bigo.ads.X0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5009d implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        HashMap a2 = sg.bigo.ads.K0.B.a((String) sg.bigo.ads.F0.b.a("sp_ads", "landing_webview_close_info", "", 3));
        if (!sg.bigo.ads.K0.A.a(a2)) {
            sg.bigo.ads.s1.b.a("06002062", a2);
            sg.bigo.ads.F0.b.b("sp_ads", "landing_webview_close_info", "", 3);
        }
        ArrayList arrayList = new ArrayList();
        Cursor a3 = AbstractC5025b.a("tb_webview", null, null, null, -1);
        if (a3 != null) {
            while (a3.moveToNext()) {
                arrayList.add(new C5053d(a3));
            }
            a3.close();
        }
        arrayList.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C5053d c5053d = (C5053d) it.next();
            if (!TextUtils.isEmpty(c5053d.n) || !TextUtils.isEmpty(c5053d.o) || !TextUtils.isEmpty(c5053d.p)) {
                sg.bigo.ads.s1.b.a(c5053d);
                c5053d.toString();
            }
            AbstractC5025b.a("tb_webview", "_id=?", new String[]{String.valueOf(c5053d.f12704a)});
        }
    }
}
