package sg.bigo.ads.h;

import android.graphics.Bitmap;

/* renamed from: sg.bigo.ads.h.u1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5212u1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f12932a;
    public final /* synthetic */ C5215v1 b;

    public RunnableC5212u1(C5215v1 c5215v1, Bitmap bitmap) {
        this.b = c5215v1;
        this.f12932a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f12935a.setImageBitmap(this.f12932a);
    }
}
