package R4;

import G0.F;
import G0.P;
import Q4.AbstractC0149c;

/* loaded from: classes.dex */
public final class g extends P {

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0149c f2682c;

    /* renamed from: d, reason: collision with root package name */
    public int f2683d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(F f3, AbstractC0149c json) {
        super(f3);
        kotlin.jvm.internal.i.e(json, "json");
        this.f2682c = json;
    }

    @Override // G0.P
    public final void a() {
        this.f796a = true;
        this.f2683d++;
    }

    @Override // G0.P
    public final void b() {
        this.f796a = false;
        i("\n");
        int i2 = this.f2683d;
        for (int i3 = 0; i3 < i2; i3++) {
            i(this.f2682c.f2501a.f2532g);
        }
    }

    @Override // G0.P
    public final void c() {
        if (this.f796a) {
            this.f796a = false;
        } else {
            b();
        }
    }

    @Override // G0.P
    public final void l() {
        f(' ');
    }

    @Override // G0.P
    public final void m() {
        this.f2683d--;
    }
}
