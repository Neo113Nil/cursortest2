package A0;

import P.AbstractC0329z;
import P.C0305m0;
import P.C0315s;
import P.C0326x0;
import c.AbstractActivityC0531j;

/* loaded from: classes.dex */
public final class H0 extends AbstractC0012b {

    /* renamed from: s, reason: collision with root package name */
    public final C0305m0 f275s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f276t;

    public H0(AbstractActivityC0531j abstractActivityC0531j) {
        super(abstractActivityC0531j);
        this.f275s = AbstractC0329z.t(null);
    }

    @Override // A0.AbstractC0012b
    public final void a(int i, C0315s c0315s) {
        c0315s.Z(420213850);
        int i5 = (c0315s.h(this) ? 4 : 2) | i;
        if (c0315s.P(i5 & 1, (i5 & 3) != 2)) {
            i4.e eVar = (i4.e) this.f275s.getValue();
            if (eVar == null) {
                c0315s.X(-1238798753);
            } else {
                c0315s.X(98586082);
                eVar.invoke(c0315s, 0);
            }
            c0315s.q(false);
        } else {
            c0315s.S();
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0009a(i, 1, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return H0.class.getName();
    }

    @Override // A0.AbstractC0012b
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f276t;
    }

    public final void setContent(i4.e eVar) {
        this.f276t = true;
        this.f275s.setValue(eVar);
        if (isAttachedToWindow()) {
            if (this.f466n == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
            c();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
