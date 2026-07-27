package sg.bigo.ads.y;

import android.graphics.Rect;
import android.view.View;
import sg.bigo.ads.K0.W;
import sg.bigo.ads.e0.C5085c;

/* renamed from: sg.bigo.ads.y.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5509a implements W {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f13407a;

    public C5509a(i iVar) {
        this.f13407a = iVar;
    }

    @Override // sg.bigo.ads.K0.W
    public final void a(View view, Rect rect, Rect rect2) {
        i iVar = this.f13407a;
        C5085c c5085c = iVar.f;
        if (c5085c != null) {
            c5085c.a(iVar.q, 0);
        }
    }
}
