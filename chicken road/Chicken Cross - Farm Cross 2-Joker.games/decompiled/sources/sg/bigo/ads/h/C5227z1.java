package sg.bigo.ads.h;

import android.content.Context;
import android.graphics.Bitmap;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.q0.AbstractC5446j;

/* renamed from: sg.bigo.ads.h.z1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5227z1 implements P1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F1 f12948a;

    public C5227z1(F1 f1) {
        this.f12948a = f1;
    }

    @Override // sg.bigo.ads.h.P1
    public final void a() {
        Context context = this.f12948a.h.getContext();
        Bitmap bitmap = this.f12948a.j;
        AbstractC5446j.e();
        this.f12948a.h.post(new RunnableC5224y1(this, AbstractC4962t.a(context, bitmap)));
    }
}
