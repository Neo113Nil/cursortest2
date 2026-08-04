package C0;

import A1.AbstractC0021h;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AbstractC0021h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1308b;

    public o(u uVar, int i7) {
        this.f1308b = i7;
        new Rect();
        this.f364a = uVar;
    }

    @Override // A1.AbstractC0021h
    public final int d(View view) {
        switch (this.f1308b) {
            case 0:
                v vVar = (v) view.getLayoutParams();
                ((u) this.f364a).getClass();
                return view.getRight() + ((v) view.getLayoutParams()).f1321a.right + ((ViewGroup.MarginLayoutParams) vVar).rightMargin;
            default:
                v vVar2 = (v) view.getLayoutParams();
                ((u) this.f364a).getClass();
                return view.getBottom() + ((v) view.getLayoutParams()).f1321a.bottom + ((ViewGroup.MarginLayoutParams) vVar2).bottomMargin;
        }
    }

    @Override // A1.AbstractC0021h
    public final int e(View view) {
        switch (this.f1308b) {
            case 0:
                v vVar = (v) view.getLayoutParams();
                ((u) this.f364a).getClass();
                return (view.getLeft() - ((v) view.getLayoutParams()).f1321a.left) - ((ViewGroup.MarginLayoutParams) vVar).leftMargin;
            default:
                v vVar2 = (v) view.getLayoutParams();
                ((u) this.f364a).getClass();
                return (view.getTop() - ((v) view.getLayoutParams()).f1321a.top) - ((ViewGroup.MarginLayoutParams) vVar2).topMargin;
        }
    }

    @Override // A1.AbstractC0021h
    public final int g() {
        switch (this.f1308b) {
            case 0:
                u uVar = (u) this.f364a;
                return uVar.f1319f - uVar.t();
            default:
                u uVar2 = (u) this.f364a;
                return uVar2.f1320g - uVar2.r();
        }
    }

    @Override // A1.AbstractC0021h
    public final int h() {
        switch (this.f1308b) {
            case 0:
                return ((u) this.f364a).s();
            default:
                return ((u) this.f364a).u();
        }
    }

    @Override // A1.AbstractC0021h
    public final int i() {
        switch (this.f1308b) {
            case 0:
                u uVar = (u) this.f364a;
                return (uVar.f1319f - uVar.s()) - uVar.t();
            default:
                u uVar2 = (u) this.f364a;
                return (uVar2.f1320g - uVar2.u()) - uVar2.r();
        }
    }
}
