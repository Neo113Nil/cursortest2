package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.cardview.widget.CardView;

/* loaded from: classes8.dex */
final class a implements c {
    private static d l(b bVar) {
        return (d) ((CardView.a) bVar).a();
    }

    @Override // androidx.cardview.widget.c
    public final float a(b bVar) {
        return l(bVar).d();
    }

    @Override // androidx.cardview.widget.c
    public final float b(b bVar) {
        return l(bVar).c();
    }

    @Override // androidx.cardview.widget.c
    public final float c(b bVar) {
        return a(bVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public final float d(b bVar) {
        return CardView.this.getElevation();
    }

    @Override // androidx.cardview.widget.c
    public final void e(b bVar) {
        if (!CardView.this.getUseCompatPadding()) {
            ((CardView.a) bVar).c(0, 0, 0, 0);
            return;
        }
        float b11 = b(bVar);
        float a11 = a(bVar);
        CardView.a aVar = (CardView.a) bVar;
        CardView cardView = CardView.this;
        int ceil = (int) Math.ceil(e.a(b11, a11, cardView.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(e.b(b11, a11, cardView.getPreventCornerOverlap()));
        aVar.c(ceil, ceil2, ceil, ceil2);
    }

    @Override // androidx.cardview.widget.c
    public final float f(b bVar) {
        return a(bVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public final void g(b bVar, float f7) {
        l(bVar).g(f7);
    }

    @Override // androidx.cardview.widget.c
    public final void h(b bVar, float f7) {
        CardView.this.setElevation(f7);
    }

    @Override // androidx.cardview.widget.c
    public final ColorStateList i(b bVar) {
        return l(bVar).b();
    }

    @Override // androidx.cardview.widget.c
    public final void j(CardView.a aVar, Context context, ColorStateList colorStateList, float f7, float f11, float f12) {
        aVar.b(new d(colorStateList, f7));
        CardView cardView = CardView.this;
        cardView.setClipToOutline(true);
        cardView.setElevation(f11);
        ((d) aVar.a()).f(f12, cardView.getUseCompatPadding(), cardView.getPreventCornerOverlap());
        e(aVar);
    }

    @Override // androidx.cardview.widget.c
    public final void k(b bVar, ColorStateList colorStateList) {
        l(bVar).e(colorStateList);
    }
}
