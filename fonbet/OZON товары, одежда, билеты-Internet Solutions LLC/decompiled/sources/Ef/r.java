package Ef;

import Hf.AbstractC3139b;
import Hf.w;
import Jf.AbstractC3395a;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class r extends AbstractC3395a {

    /* renamed from: a, reason: collision with root package name */
    private final w f7962a = new w();

    /* renamed from: b, reason: collision with root package name */
    private o f7963b = new o();

    @Override // Jf.AbstractC3395a, Jf.c
    public final void a(n nVar) {
        StringBuilder c11 = this.f7963b.c();
        if (c11.length() > 0) {
            nVar.f(c11.toString(), this.f7962a);
        }
    }

    @Override // Jf.AbstractC3395a, Jf.c
    public final boolean d() {
        return true;
    }

    @Override // Jf.c
    public final AbstractC3139b e() {
        return this.f7962a;
    }

    @Override // Jf.AbstractC3395a, Jf.c
    public final void f(CharSequence charSequence) {
        this.f7963b.d(charSequence);
    }

    @Override // Jf.AbstractC3395a, Jf.c
    public final void g() {
        if (this.f7963b.c().length() == 0) {
            this.f7962a.l();
        }
    }

    @Override // Jf.c
    public final b h(h hVar) {
        if (hVar.q()) {
            return null;
        }
        return b.a(hVar.m());
    }

    public final StringBuilder i() {
        return this.f7963b.c();
    }

    public final ArrayList j() {
        return this.f7963b.b();
    }
}
