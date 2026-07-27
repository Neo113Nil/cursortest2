package U;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: U.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0075o extends Q.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1580b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0075o(u uVar, int i3) {
        super(uVar);
        this.f1580b = i3;
    }

    @Override // Q.b
    public final int b(View view) {
        switch (this.f1580b) {
            case 0:
                v vVar = (v) view.getLayoutParams();
                ((u) this.f1156a).getClass();
                return view.getRight() + ((v) view.getLayoutParams()).f1591a.right + ((ViewGroup.MarginLayoutParams) vVar).rightMargin;
            default:
                v vVar2 = (v) view.getLayoutParams();
                ((u) this.f1156a).getClass();
                return view.getBottom() + ((v) view.getLayoutParams()).f1591a.bottom + ((ViewGroup.MarginLayoutParams) vVar2).bottomMargin;
        }
    }

    @Override // Q.b
    public final int c(View view) {
        switch (this.f1580b) {
            case 0:
                v vVar = (v) view.getLayoutParams();
                ((u) this.f1156a).getClass();
                return (view.getLeft() - ((v) view.getLayoutParams()).f1591a.left) - ((ViewGroup.MarginLayoutParams) vVar).leftMargin;
            default:
                v vVar2 = (v) view.getLayoutParams();
                ((u) this.f1156a).getClass();
                return (view.getTop() - ((v) view.getLayoutParams()).f1591a.top) - ((ViewGroup.MarginLayoutParams) vVar2).topMargin;
        }
    }

    @Override // Q.b
    public final int d() {
        switch (this.f1580b) {
            case 0:
                u uVar = (u) this.f1156a;
                return uVar.f - uVar.t();
            default:
                u uVar2 = (u) this.f1156a;
                return uVar2.f1590g - uVar2.r();
        }
    }

    @Override // Q.b
    public final int e() {
        switch (this.f1580b) {
            case 0:
                return ((u) this.f1156a).s();
            default:
                return ((u) this.f1156a).u();
        }
    }

    @Override // Q.b
    public final int f() {
        switch (this.f1580b) {
            case 0:
                u uVar = (u) this.f1156a;
                return (uVar.f - uVar.s()) - uVar.t();
            default:
                u uVar2 = (u) this.f1156a;
                return (uVar2.f1590g - uVar2.u()) - uVar2.r();
        }
    }
}
