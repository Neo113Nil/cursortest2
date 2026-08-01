package sg.bigo.ads.K0;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import sg.bigo.ads.q0.AbstractC5446j;

/* renamed from: sg.bigo.ads.K0.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4958o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12360a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ ValueCallback c;

    public RunnableC4958o(Context context, Bitmap bitmap, ValueCallback valueCallback) {
        this.f12360a = context;
        this.b = bitmap;
        this.c = valueCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap a2 = AbstractC4962t.a(this.f12360a, this.b);
        if (this.c != null) {
            AbstractC5446j.b(new RunnableC4957n(this, a2));
        }
    }
}
