package sg.bigo.ads.j;

import android.graphics.Bitmap;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.s0.y;
import sg.bigo.ads.s0.z;

/* renamed from: sg.bigo.ads.j.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5253g implements z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC5254h f13000a;

    public C5253g(RunnableC5254h runnableC5254h) {
        this.f13000a = runnableC5254h;
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(int i, String str, y yVar) {
        RunnableC5254h runnableC5254h = this.f13000a;
        l lVar = runnableC5254h.e;
        AbstractC5446j.b(new RunnableC5254h(lVar, runnableC5254h.f13001a, lVar.p, runnableC5254h.c + 1, runnableC5254h.d));
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(Bitmap bitmap, y yVar) {
        RunnableC5254h runnableC5254h = this.f13000a;
        l lVar = runnableC5254h.e;
        l.a(lVar, runnableC5254h.d, lVar.p, runnableC5254h.c, bitmap, yVar);
    }
}
