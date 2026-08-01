package sg.bigo.ads.s0;

import android.graphics.Bitmap;

/* renamed from: sg.bigo.ads.s0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5468h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f13290a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ y c;

    public RunnableC5468h(z zVar, Bitmap bitmap, y yVar) {
        this.f13290a = zVar;
        this.b = bitmap;
        this.c = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13290a.a(this.b, this.c);
    }
}
