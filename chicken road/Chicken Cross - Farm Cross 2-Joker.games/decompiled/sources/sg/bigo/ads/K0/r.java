package sg.bigo.ads.K0;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12363a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ ValueCallback c;

    public r(Context context, Bitmap bitmap, sg.bigo.ads.G.b bVar) {
        this.f12363a = context;
        this.b = bitmap;
        this.c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f12363a;
        Bitmap bitmap = this.b;
        AbstractC5446j.e();
        AbstractC5446j.a(2, null, new RunnableC4960q(this, AbstractC4962t.a(context, bitmap)), 0L);
    }
}
