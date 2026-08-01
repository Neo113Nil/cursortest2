package sg.bigo.ads.Y0;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import sg.bigo.ads.b0.AbstractC5025b;
import sg.bigo.ads.c0.C5053d;

/* loaded from: classes3.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12638a;
    public final /* synthetic */ x b;

    public l(x xVar, int i) {
        this.b = xVar;
        this.f12638a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = new ArrayList();
        Cursor a2 = AbstractC5025b.a("tb_webview", null, null, null, -1);
        if (a2 != null) {
            while (a2.moveToNext()) {
                arrayList.add(new C5053d(a2));
            }
            a2.close();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C5053d c5053d = (C5053d) it.next();
            c5053d.m = this.f12638a;
            c5053d.l = System.currentTimeMillis() - this.b.D;
            if (!TextUtils.isEmpty(c5053d.n) || !TextUtils.isEmpty(c5053d.o) || !TextUtils.isEmpty(c5053d.p)) {
                sg.bigo.ads.s1.b.a(c5053d);
                c5053d.toString();
            }
            AbstractC5025b.a("tb_webview", "_id=?", new String[]{String.valueOf(c5053d.f12704a)});
        }
        if (this.f12638a != 2) {
            this.b.M().post(new k(this));
        }
    }
}
