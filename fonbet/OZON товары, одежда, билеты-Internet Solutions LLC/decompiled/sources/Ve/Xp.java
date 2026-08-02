package Ve;

import Ae.InterfaceC2397i;
import android.content.Context;
import kotlin.Unit;
import spay.sdk.view.SPayTextView;

/* loaded from: classes10.dex */
public final class Xp implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Hp f30416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f30417b;

    public Xp(Hp hp2, Context context) {
        this.f30416a = hp2;
        this.f30417b = context;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        Uf uf2 = (Uf) obj;
        Hp hp2 = this.f30416a;
        SPayTextView sPayTextView = hp2.f29179c;
        Pq pq = uf2.f30126a;
        Context context = this.f30417b;
        sPayTextView.setText(E.f(pq, context));
        hp2.f29178b.setText(E.f(uf2.f30127b, context));
        return Unit.f71690a;
    }
}
