package sg.bigo.ads.h;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.View;
import android.webkit.ValueCallback;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.common.view.RoundedImageView;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class M1 implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12840a;
    public final /* synthetic */ O1 b;

    public M1(O1 o1, RoundedImageView roundedImageView) {
        this.b = o1;
        this.f12840a = roundedImageView;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            O1 o1 = this.b;
            long j = ((o1.g > 0L ? 1 : (o1.g == 0L ? 0 : -1)) != 0 ? SystemClock.elapsedRealtime() - o1.g : 0L) > 15 ? 300L : 0L;
            Context context = this.f12840a.getContext();
            AbstractC5446j.e();
            this.f12840a.post(new L1(this, AbstractC4962t.a(context, bitmap), j, bitmap));
            return;
        }
        O1 o12 = this.b;
        View view = this.f12840a;
        o12.getClass();
        if (view != null) {
            synchronized (o12.h) {
                o12.h.put(view, this);
            }
        }
    }
}
