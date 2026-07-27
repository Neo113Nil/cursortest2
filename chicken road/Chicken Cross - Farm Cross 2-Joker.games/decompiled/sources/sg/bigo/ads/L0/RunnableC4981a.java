package sg.bigo.ads.L0;

import android.graphics.Bitmap;

/* renamed from: sg.bigo.ads.L0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4981a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f12404a;
    public final /* synthetic */ C4982b b;

    public RunnableC4981a(Bitmap bitmap, C4982b c4982b) {
        this.b = c4982b;
        this.f12404a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f12405a.setImageBitmapInternal(this.f12404a);
    }
}
