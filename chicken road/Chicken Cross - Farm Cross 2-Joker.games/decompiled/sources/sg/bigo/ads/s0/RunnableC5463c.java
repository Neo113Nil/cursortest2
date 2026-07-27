package sg.bigo.ads.s0;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.K0.AbstractC4964v;

/* renamed from: sg.bigo.ads.s0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5463c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13286a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ z d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Executor f;
    public final /* synthetic */ String g = null;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ k i;

    public RunnableC5463c(k kVar, String str, Context context, String str2, z zVar, String str3, Executor executor, boolean z) {
        this.i = kVar;
        this.f13286a = str;
        this.b = context;
        this.c = str2;
        this.d = zVar;
        this.e = str3;
        this.f = executor;
        this.h = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k kVar = this.i;
        String str = this.f13286a;
        Context context = this.b;
        kVar.getClass();
        sg.bigo.ads.U.c a2 = kVar instanceof v ? AbstractC4962t.a(str) : AbstractC4962t.a(str, context);
        if (a2 == null) {
            this.i.a(this.b, this.f, this.e, this.g, this.h, this.d);
            return;
        }
        this.i.a(this.b, this.c, a2);
        long a3 = AbstractC4964v.a(2, this.f13286a);
        this.i.getClass();
        this.i.e.post(new RunnableC5462b(this, a2, a3));
        new File(this.f13286a).setLastModified(System.currentTimeMillis());
        this.i.a(this.b);
    }
}
