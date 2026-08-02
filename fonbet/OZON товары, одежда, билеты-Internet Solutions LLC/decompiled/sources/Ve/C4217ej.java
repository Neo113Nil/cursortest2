package Ve;

import Ae.InterfaceC2397i;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.ej, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4217ej implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S0 f30936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f30937b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4699va f30938c;

    public C4217ej(S0 s02, Context context, C4699va c4699va) {
        this.f30936a = s02;
        this.f30937b = context;
        this.f30938c = c4699va;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        C4221en c4221en = (C4221en) obj;
        Integer f7 = c4221en.f();
        Context context = this.f30937b;
        C4699va c4699va = this.f30938c;
        S0 s02 = this.f30936a;
        String str = c4221en.f30946g;
        if (f7 != null) {
            ConstraintLayout constraintLayout = s02.f29929e.f29858a;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "spaySloIncludeCompoundWallet.root");
            constraintLayout.setVisibility(0);
            ConstraintLayout constraintLayout2 = s02.f29930f.f32058a;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "spaySloIncludeSelectedCard.root");
            Rj rj2 = s02.f29929e;
            ConstraintLayout constraintLayout3 = rj2.f29858a;
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "spaySloIncludeCompoundWallet.root");
            constraintLayout2.setVisibility(constraintLayout3.getVisibility() != 0 ? 0 : 8);
            rj2.f29860c.setText(E.f(c4221en.h(), context));
            Integer f11 = c4221en.f();
            String quantityString = f11 != null ? c4699va.getResources().getQuantityString(f11.intValue(), AbstractC4656tp.a(c4221en.a()), new Integer(AbstractC4656tp.a(c4221en.a()))) : null;
            rj2.f29861d.setText(c4221en.e() ? c4699va.getString(c4221en.d(), c4221en.c(), quantityString) : c4699va.getString(c4221en.d(), c4221en.b(), c4221en.c(), quantityString));
            rj2.f29862e.a(str);
        } else {
            ConstraintLayout constraintLayout4 = s02.f29929e.f29858a;
            Intrinsics.checkNotNullExpressionValue(constraintLayout4, "spaySloIncludeCompoundWallet.root");
            constraintLayout4.setVisibility(8);
            C4622sk c4622sk = s02.f29930f;
            ConstraintLayout constraintLayout5 = c4622sk.f32058a;
            Intrinsics.checkNotNullExpressionValue(constraintLayout5, "spaySloIncludeSelectedCard.root");
            ConstraintLayout constraintLayout6 = s02.f29929e.f29858a;
            Intrinsics.checkNotNullExpressionValue(constraintLayout6, "spaySloIncludeCompoundWallet.root");
            constraintLayout5.setVisibility(constraintLayout6.getVisibility() != 0 ? 0 : 8);
            c4622sk.f32062e.setText(E.f(c4221en.h(), context));
            c4622sk.f32061d.setText(c4221en.e() ? c4699va.getString(c4221en.d(), c4221en.c()) : c4699va.getString(c4221en.d(), c4221en.b(), c4221en.c()));
            c4622sk.f32059b.a(str);
        }
        return Unit.f71690a;
    }
}
