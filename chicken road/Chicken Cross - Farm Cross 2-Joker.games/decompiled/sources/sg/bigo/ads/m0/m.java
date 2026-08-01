package sg.bigo.ads.m0;

import android.view.View;

/* loaded from: classes3.dex */
public final class m implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5353f f13120a;
    public final /* synthetic */ sg.bigo.ads.O.c b;

    public m(C5353f c5353f, sg.bigo.ads.O.c cVar) {
        this.f13120a = c5353f;
        this.b = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C5353f c5353f = this.f13120a;
        if (c5353f != null) {
            String str = this.b.d;
            c5353f.a(9, c5353f.i, System.currentTimeMillis() - c5353f.h);
            c5353f.a(str);
        }
    }
}
