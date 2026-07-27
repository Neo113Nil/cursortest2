package sg.bigo.ads.n;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.webkit.ValueCallback;
import sg.bigo.ads.h.AbstractC5140Q;
import sg.bigo.ads.u.C5481b;

/* renamed from: sg.bigo.ads.n.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5381i implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f13172a;
    public final /* synthetic */ C5383j b;

    public C5381i(C5383j c5383j, long j) {
        this.b = c5383j;
        this.f13172a = j;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        Integer a2 = sg.bigo.ads.E0.p.a(bitmap);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(this.b.f13174a.u.getResources(), bitmap);
        bitmapDrawable.setAlpha(0);
        C5481b.a(this.b.f13174a.u, "adview_background_main_tag", bitmapDrawable);
        AbstractC5140Q.a(0, 255, this.f13172a, new C5377g(bitmapDrawable), new C5379h());
        if (a2 != null) {
            this.b.f13174a.s.a(a2.intValue());
        }
    }
}
