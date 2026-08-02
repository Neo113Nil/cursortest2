package Nl;

import android.content.Context;
import gj0.InterfaceC6744a;
import hj0.C6961a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qc.g;
import qc.q;
import ru.ozon.app.android.favorites.domain.favoritemanager.eventmap.FavoriteEventMapImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements g, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19607b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f19606a = i11;
        this.f19607b = obj;
    }

    public InterfaceC6744a a() {
        InterfaceC6744a interfaceC6744a;
        C6961a c6961a;
        Context context = (Context) this.f19607b;
        C6961a.C1072a c1072a = C6961a.f65570d;
        Context context2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getApplicationContext(...)");
        Intrinsics.checkNotNullParameter(context2, "context");
        interfaceC6744a = C6961a.f65571e;
        if (interfaceC6744a != null) {
            return interfaceC6744a;
        }
        synchronized (c1072a) {
            c6961a = new C6961a(context2);
            C6961a.f65571e = c6961a;
        }
        return c6961a;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f19606a) {
            case 0:
                ((Function1) this.f19607b).invoke(obj);
                break;
            default:
                ((Function1) this.f19607b).invoke(obj);
                break;
        }
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean observeEvents$lambda$0;
        observeEvents$lambda$0 = FavoriteEventMapImpl.observeEvents$lambda$0((Function1) this.f19607b, obj);
        return observeEvents$lambda$0;
    }
}
