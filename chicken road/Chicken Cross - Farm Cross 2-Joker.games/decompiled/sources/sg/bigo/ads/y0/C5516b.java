package sg.bigo.ads.y0;

import java.util.concurrent.Executor;
import sg.bigo.ads.x0.AbstractC5503c;

/* renamed from: sg.bigo.ads.y0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5516b extends AbstractRunnableC5522h {
    public final /* synthetic */ C5517c f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5516b(C5517c c5517c, Executor executor, sg.bigo.ads.B0.c cVar, AbstractC5503c abstractC5503c) {
        super(executor, cVar, abstractC5503c);
        this.f = c5517c;
    }

    @Override // sg.bigo.ads.y0.AbstractRunnableC5522h
    public final void a(sg.bigo.ads.B0.c cVar, AbstractC5503c abstractC5503c) {
        C5517c c5517c = this.f;
        c5517c.a(new C5519e(cVar, null, null, c5517c.f13416a, c5517c.b), abstractC5503c, true);
    }
}
