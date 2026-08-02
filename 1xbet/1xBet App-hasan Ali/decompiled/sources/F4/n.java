package F4;

import java.io.IOException;

/* loaded from: classes.dex */
public final class n extends B4.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f1608e;
    public final /* synthetic */ int f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f1609g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, o oVar, int i, long j5) {
        super(str, true);
        this.f1608e = oVar;
        this.f = i;
        this.f1609g = j5;
    }

    @Override // B4.a
    public final long a() {
        o oVar = this.f1608e;
        try {
            oVar.f1616G.n(this.f, this.f1609g);
            return -1L;
        } catch (IOException e3) {
            oVar.b(2, 2, e3);
            return -1L;
        }
    }
}
