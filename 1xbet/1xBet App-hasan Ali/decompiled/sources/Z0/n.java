package Z0;

import A0.F;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import g0.AbstractC1961f;
import g0.C1956a;
import g0.InterfaceC1964i;
import z0.AbstractC2749f;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6325l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f6326m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i) {
        super(1);
        this.f6325l = i;
        this.f6326m = oVar;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f6325l) {
            case 0:
                C1956a c1956a = (C1956a) obj;
                o oVar = this.f6326m;
                View c5 = k.c(oVar);
                if (!c5.isFocused() && !c5.hasFocus()) {
                    if (!AbstractC1961f.y(c5, AbstractC1961f.C(c1956a.f17013a), k.b(((F) AbstractC2749f.w(oVar)).getFocusOwner(), AbstractC2749f.x(oVar), c5))) {
                        c1956a.f17014b = true;
                    }
                }
                return W3.o.f6046a;
            default:
                C1956a c1956a2 = (C1956a) obj;
                o oVar2 = this.f6326m;
                View c6 = k.c(oVar2);
                if (c6.hasFocus()) {
                    InterfaceC1964i focusOwner = ((F) AbstractC2749f.w(oVar2)).getFocusOwner();
                    View x5 = AbstractC2749f.x(oVar2);
                    if (c6 instanceof ViewGroup) {
                        Rect b3 = k.b(focusOwner, x5, c6);
                        Integer C5 = AbstractC1961f.C(c1956a2.f17013a);
                        int intValue = C5 != null ? C5.intValue() : 130;
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View view = oVar2.f6329y;
                        View findNextFocus = view != null ? focusFinder.findNextFocus((ViewGroup) x5, view, intValue) : focusFinder.findNextFocusFromRect((ViewGroup) x5, b3, intValue);
                        if (findNextFocus != null && k.a(c6, findNextFocus)) {
                            findNextFocus.requestFocus(intValue, b3);
                            c1956a2.f17014b = true;
                        } else if (!x5.requestFocus()) {
                            throw new IllegalStateException("host view did not take focus");
                        }
                    } else if (!x5.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                }
                return W3.o.f6046a;
        }
    }
}
