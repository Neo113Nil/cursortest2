package m1;

import j1.C1054b;
import j1.C1055c;
import j1.InterfaceC1059g;

/* loaded from: classes.dex */
public final class g implements InterfaceC1059g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f10109a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10110b = false;

    /* renamed from: c, reason: collision with root package name */
    public C1055c f10111c;

    /* renamed from: d, reason: collision with root package name */
    public final e f10112d;

    public g(e eVar) {
        this.f10112d = eVar;
    }

    @Override // j1.InterfaceC1059g
    public final InterfaceC1059g b(String str) {
        if (this.f10109a) {
            throw new C1054b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f10109a = true;
        this.f10112d.c(this.f10111c, str, this.f10110b);
        return this;
    }

    @Override // j1.InterfaceC1059g
    public final InterfaceC1059g c(boolean z3) {
        if (this.f10109a) {
            throw new C1054b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f10109a = true;
        this.f10112d.b(this.f10111c, z3 ? 1 : 0, this.f10110b);
        return this;
    }
}
