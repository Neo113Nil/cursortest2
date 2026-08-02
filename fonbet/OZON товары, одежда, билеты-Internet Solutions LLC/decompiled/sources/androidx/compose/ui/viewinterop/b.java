package androidx.compose.ui.viewinterop;

import D1.AbstractC2813m;
import D1.C2809k;
import D1.x0;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;
import c2.C5730d;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j1.h;
import j1.l;
import j1.m;
import j1.o;
import j1.r;
import j1.x;
import j1.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class b extends e.c implements o, ViewTreeObserver.OnGlobalFocusChangeListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private View f41170a;

    /* synthetic */ class a extends C7735q implements Function1<j1.c, r> {
        @NotNull
        public final r b(int i11) {
            r rVar;
            r rVar2;
            r rVar3;
            b bVar = (b) this.receiver;
            bVar.getClass();
            View c11 = C5730d.c(bVar);
            if (c11.isFocused() || c11.hasFocus()) {
                rVar = r.f68738b;
                return rVar;
            }
            if (h.b(c11, h.c(i11), C5730d.b(((AndroidComposeView) C2809k.g(bVar)).q(), (View) C2809k.g(bVar), c11))) {
                rVar3 = r.f68738b;
                return rVar3;
            }
            rVar2 = r.f68739c;
            return rVar2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ r invoke(j1.c cVar) {
            return b(cVar.d());
        }
    }

    /* renamed from: androidx.compose.ui.viewinterop.b$b, reason: collision with other inner class name */
    /* synthetic */ class C0753b extends C7735q implements Function1<j1.c, r> {
        @NotNull
        public final r b(int i11) {
            return ((b) this.receiver).J1(i11);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ r invoke(j1.c cVar) {
            return b(cVar.d());
        }
    }

    private final FocusTargetNode I1() {
        if (!getNode().isAttached()) {
            A1.a.b("visitLocalDescendants called on an unattached node");
            throw null;
        }
        e.c node = getNode();
        if ((node.getAggregateChildKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            boolean z11 = false;
            for (e.c child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                if ((child$ui_release.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                    e.c cVar = child$ui_release;
                    U0.b bVar = null;
                    while (cVar != null) {
                        if (cVar instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) cVar;
                            if (z11) {
                                return focusTargetNode;
                            }
                            z11 = true;
                        } else if ((cVar.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0 && (cVar instanceof AbstractC2813m)) {
                            int i11 = 0;
                            for (e.c J12 = ((AbstractC2813m) cVar).J1(); J12 != null; J12 = J12.getChild$ui_release()) {
                                if ((J12.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                    i11++;
                                    if (i11 == 1) {
                                        cVar = J12;
                                    } else {
                                        if (bVar == null) {
                                            bVar = new U0.b(new e.c[16]);
                                        }
                                        if (cVar != null) {
                                            bVar.b(cVar);
                                            cVar = null;
                                        }
                                        bVar.b(J12);
                                    }
                                }
                            }
                            if (i11 == 1) {
                            }
                        }
                        cVar = C2809k.b(bVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @NotNull
    public final r J1(int i11) {
        r rVar;
        r rVar2;
        r rVar3;
        r rVar4;
        View c11 = C5730d.c(this);
        if (!c11.hasFocus()) {
            rVar4 = r.f68738b;
            return rVar4;
        }
        l q11 = ((AndroidComposeView) C2809k.g(this)).q();
        View view = (View) C2809k.g(this);
        if (!(c11 instanceof ViewGroup)) {
            if (!view.requestFocus()) {
                throw new IllegalStateException("host view did not take focus");
            }
            rVar3 = r.f68738b;
            return rVar3;
        }
        Rect b11 = C5730d.b(q11, view, c11);
        Integer c12 = h.c(i11);
        int intValue = c12 != null ? c12.intValue() : 130;
        FocusFinder focusFinder = FocusFinder.getInstance();
        View view2 = this.f41170a;
        View findNextFocus = view2 != null ? focusFinder.findNextFocus((ViewGroup) view, view2, intValue) : focusFinder.findNextFocusFromRect((ViewGroup) view, b11, intValue);
        if (findNextFocus != null && C5730d.a(c11, findNextFocus)) {
            findNextFocus.requestFocus(intValue, b11);
            rVar2 = r.f68739c;
            return rVar2;
        }
        if (!view.requestFocus()) {
            throw new IllegalStateException("host view did not take focus");
        }
        rVar = r.f68738b;
        return rVar;
    }

    @Override // androidx.compose.ui.e.c
    public final void onAttach() {
        super.onAttach();
        C5730d.c(this).addOnAttachStateChangeListener(this);
    }

    @Override // androidx.compose.ui.e.c
    public final void onDetach() {
        C5730d.c(this).removeOnAttachStateChangeListener(this);
        this.f41170a = null;
        super.onDetach();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z11;
        if (C2809k.f(this).f0() == null) {
            return;
        }
        View c11 = C5730d.c(this);
        l q11 = ((AndroidComposeView) C2809k.g(this)).q();
        x0 g10 = C2809k.g(this);
        boolean z12 = (view == null || view.equals(g10) || !C5730d.a(c11, view)) ? false : true;
        boolean z13 = (view2 == null || view2.equals(g10) || !C5730d.a(c11, view2)) ? false : true;
        if (z12 && z13) {
            this.f41170a = view2;
            return;
        }
        if (!z13) {
            if (!z12) {
                this.f41170a = null;
                return;
            }
            this.f41170a = null;
            if (I1().O1().a()) {
                q11.e(8, false, false);
                return;
            }
            return;
        }
        this.f41170a = view2;
        FocusTargetNode I12 = I1();
        if (I12.O1().b()) {
            return;
        }
        x b11 = q11.b();
        try {
            z11 = b11.f68745c;
            if (z11) {
                x.b(b11);
            }
            x.a(b11);
            y.h(I12);
            x.c(b11);
        } catch (Throwable th2) {
            x.c(b11);
            throw th2;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NotNull View view) {
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NotNull View view) {
        view.getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }

    @Override // j1.o
    public final void y0(@NotNull m mVar) {
        mVar.a(false);
        mVar.d(new a(1, this, b.class, "onEnter", "onEnter-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0));
        mVar.b(new C0753b(1, this, b.class, "onExit", "onExit-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0));
    }
}
