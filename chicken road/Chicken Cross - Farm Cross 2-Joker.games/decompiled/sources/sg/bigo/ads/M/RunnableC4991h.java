package sg.bigo.ads.M;

import android.net.Uri;
import sg.bigo.ads.K0.AbstractC4962t;

/* renamed from: sg.bigo.ads.M.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4991h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12445a;
    public final /* synthetic */ C5002t b;

    public RunnableC4991h(C5002t c5002t, String str) {
        this.b = c5002t;
        this.f12445a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5002t.p = AbstractC4962t.b(Uri.parse(this.f12445a).getPath(), this.b.j.k.e);
        this.b.f();
    }
}
