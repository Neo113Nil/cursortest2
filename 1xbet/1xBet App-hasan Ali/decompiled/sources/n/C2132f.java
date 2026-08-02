package n;

import android.content.Context;
import android.view.View;
import game.betting133.sports1xbet.R;
import m.AbstractC2072j;
import m.C2074l;
import m.MenuC2070h;
import m.SubMenuC2080r;

/* renamed from: n.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2132f extends C2074l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f18244l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2140j f18245m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2132f(C2140j c2140j, Context context, MenuC2070h menuC2070h, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC2070h, true);
        this.f18245m = c2140j;
        this.f = 8388613;
        C2138i c2138i = c2140j.f18259F;
        this.f17958h = c2138i;
        AbstractC2072j abstractC2072j = this.i;
        if (abstractC2072j != null) {
            abstractC2072j.j(c2138i);
        }
    }

    @Override // m.C2074l
    public final void c() {
        switch (this.f18244l) {
            case 0:
                C2140j c2140j = this.f18245m;
                c2140j.f18256C = null;
                c2140j.getClass();
                super.c();
                break;
            default:
                C2140j c2140j2 = this.f18245m;
                MenuC2070h menuC2070h = c2140j2.f18262m;
                if (menuC2070h != null) {
                    menuC2070h.c(true);
                }
                c2140j2.f18255B = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2132f(C2140j c2140j, Context context, SubMenuC2080r subMenuC2080r, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC2080r, false);
        this.f18245m = c2140j;
        if ((subMenuC2080r.f17981x.f17947x & 32) != 32) {
            View view2 = c2140j.f18267r;
            this.f17956e = view2 == null ? c2140j.f18266q : view2;
        }
        C2138i c2138i = c2140j.f18259F;
        this.f17958h = c2138i;
        AbstractC2072j abstractC2072j = this.i;
        if (abstractC2072j != null) {
            abstractC2072j.j(c2138i);
        }
    }
}
