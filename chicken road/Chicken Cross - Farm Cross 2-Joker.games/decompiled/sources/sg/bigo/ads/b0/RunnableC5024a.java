package sg.bigo.ads.b0;

import android.content.Context;
import android.util.Log;
import sg.bigo.ads.X0.j;
import sg.bigo.ads.w0.AbstractC5496a;

/* renamed from: sg.bigo.ads.b0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5024a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12688a;
    public final /* synthetic */ j b;

    public RunnableC5024a(Context context, j jVar) {
        this.f12688a = context;
        this.b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5026c c5026c;
        try {
            Context context = this.f12688a;
            synchronized (C5026c.class) {
                if (C5026c.f12690a == null) {
                    C5026c.f12690a = new C5026c(context);
                }
                c5026c = C5026c.f12690a;
            }
            AbstractC5025b.c = c5026c.getWritableDatabase();
        } catch (Throwable th) {
            AbstractC5025b.a(Log.getStackTraceString(th), this.f12688a);
            try {
                AbstractC5025b.c = C5026c.a(this.f12688a).getWritableDatabase();
            } catch (Throwable th2) {
                AbstractC5496a.a("DbHelper", "can't get db final," + th2.getMessage());
                AbstractC5025b.c = null;
            }
        }
        AbstractC5025b.b.set(true);
        AbstractC5025b.f12689a = null;
        if (this.b != null) {
            if (AbstractC5025b.c != null) {
                AbstractC5025b.a("tb_addata", "end_time < " + System.currentTimeMillis(), null);
            } else {
                sg.bigo.ads.s1.b.a(3000, 10101, "", (sg.bigo.ads.P.c) null);
            }
        }
    }
}
