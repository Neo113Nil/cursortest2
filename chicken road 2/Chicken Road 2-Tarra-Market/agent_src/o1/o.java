package o1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class o extends j1.a {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6310b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6311c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f6313e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, boolean z2, int i2, int i3) {
        super("OkHttp %s ping %08x%08x", rVar.f6322d, Integer.valueOf(i2), Integer.valueOf(i3));
        this.f6313e = rVar;
        this.f6310b = z2;
        this.f6311c = i2;
        this.f6312d = i3;
    }

    @Override // j1.a
    public final void a() {
        boolean z2;
        r rVar = this.f6313e;
        boolean z3 = this.f6310b;
        int i2 = this.f6311c;
        int i3 = this.f6312d;
        if (z3) {
            rVar.getClass();
        } else {
            synchronized (rVar) {
                z2 = rVar.f6329k;
                rVar.f6329k = true;
            }
            if (z2) {
                rVar.b();
                return;
            }
        }
        try {
            rVar.f6336r.k(z3, i2, i3);
        } catch (IOException unused) {
            rVar.b();
        }
    }
}
