package sg.bigo.ads.M0;

import android.view.TextureView;
import android.view.View;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f12460a;

    public e(g gVar) {
        this.f12460a = gVar;
    }

    public final void a(View view) {
        if (view instanceof TextureView) {
            g gVar = this.f12460a;
            gVar.m.put((TextureView) view, gVar);
            this.f12460a.l++;
        }
    }
}
