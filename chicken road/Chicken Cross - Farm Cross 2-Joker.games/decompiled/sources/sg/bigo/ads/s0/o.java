package sg.bigo.ads.s0;

import android.content.Context;
import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13296a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ WeakReference c;
    public final /* synthetic */ p d;

    public o(p pVar, String str, Context context, WeakReference weakReference) {
        this.d = pVar;
        this.f13296a = str;
        this.b = context;
        this.c = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap b;
        if (this.d.b) {
            sg.bigo.ads.U.c a2 = AbstractC4962t.a(this.f13296a);
            b = a2 != null ? a2.f12561a : null;
        } else {
            b = AbstractC4962t.b(this.f13296a, this.b);
        }
        if (b == null) {
            return;
        }
        AbstractC5446j.b(new n(this, b));
    }
}
