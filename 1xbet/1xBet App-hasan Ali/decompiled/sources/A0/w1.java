package A0;

import android.view.View;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import game.betting133.sports1xbet.R;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class w1 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f587k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ P.F0 f588l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ View f589m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(P.F0 f02, View view, a4.c cVar) {
        super(2, cVar);
        this.f588l = f02;
        this.f589m = view;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new w1(this.f588l, this.f589m, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((w1) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f587k;
        W3.o oVar = W3.o.f6046a;
        P.F0 f02 = this.f588l;
        View view = this.f589m;
        try {
            if (i == 0) {
                G4.l.N(obj);
                this.f587k = 1;
                Object h3 = s4.C.h(f02.f4307t, new P.A0(2, null), this);
                if (h3 != enumC0510a) {
                    h3 = oVar;
                }
                if (h3 == enumC0510a) {
                    return enumC0510a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                G4.l.N(obj);
            }
            if (G1.b(view) == f02) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            return oVar;
        } finally {
            if (G1.b(view) == f02) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
        }
    }
}
