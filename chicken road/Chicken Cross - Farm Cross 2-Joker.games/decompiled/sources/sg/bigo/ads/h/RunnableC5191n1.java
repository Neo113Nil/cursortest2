package sg.bigo.ads.h;

import android.widget.ImageView;

/* renamed from: sg.bigo.ads.h.n1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5191n1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5194o1 f12909a;

    public RunnableC5191n1(C5194o1 c5194o1) {
        this.f12909a = c5194o1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5194o1 c5194o1 = this.f12909a;
        c5194o1.f12911a.setImageBitmap(c5194o1.b.j);
        this.f12909a.f12911a.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}
