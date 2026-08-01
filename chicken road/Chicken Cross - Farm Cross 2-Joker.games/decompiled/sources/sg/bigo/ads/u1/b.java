package sg.bigo.ads.u1;

import android.content.ContentValues;
import com.adjust.sdk.Constants;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import sg.bigo.ads.b0.AbstractC5025b;
import sg.bigo.ads.c0.C5052c;

/* loaded from: classes3.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13334a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ g c;

    public b(g gVar, String str, AbstractMap abstractMap) {
        this.c = gVar;
        this.f13334a = str;
        this.b = abstractMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sg.bigo.ads.t1.a aVar = (sg.bigo.ads.t1.a) this.c.f13339a.c.get(this.f13334a);
        boolean z = aVar == null ? true : aVar.c;
        long currentTimeMillis = System.currentTimeMillis() + (((sg.bigo.ads.t1.a) this.c.f13339a.c.get(this.f13334a)) == null ? Constants.ONE_HOUR : r1.d);
        a aVar2 = new a(this.b, this.f13334a);
        g gVar = this.c;
        i iVar = gVar.c;
        C5052c a2 = aVar2.a(gVar.e, currentTimeMillis);
        synchronized (iVar) {
            iVar.b.add(a2);
            a2.toString();
            ContentValues contentValues = new ContentValues();
            contentValues.put("event_id", a2.b);
            contentValues.put("event_info", a2.c);
            contentValues.put("expired_ts", Long.valueOf(a2.d));
            contentValues.put("ext", a2.e);
            long j = a2.f;
            if (j == 0) {
                j = System.currentTimeMillis();
            }
            contentValues.put("ctime", Long.valueOf(j));
            long j2 = a2.g;
            if (j2 == 0) {
                j2 = System.currentTimeMillis();
            }
            contentValues.put("mtime", Long.valueOf(j2));
            a2.f12703a = AbstractC5025b.a("tb_stat", contentValues);
        }
        if (z) {
            Objects.toString(this.b);
            g.a(this.c);
        } else {
            Objects.toString(this.b);
            this.c.a();
        }
    }
}
