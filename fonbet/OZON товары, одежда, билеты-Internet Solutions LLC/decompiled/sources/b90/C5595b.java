package b90;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import l80.f;
import r60.C9212c;
import ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase;
import x60.e;

/* renamed from: b90.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5595b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55743a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f55744b;

    public /* synthetic */ C5595b(Object obj, int i11) {
        this.f55743a = i11;
        this.f55744b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f55743a) {
            case 0:
                return C5596c.a((C5596c) this.f55744b);
            case 1:
                ((f) this.f55744b).l0(false);
                return Unit.f71690a;
            case 2:
                return C9212c.e((C9212c) this.f55744b);
            case 3:
                return Boolean.valueOf(e.e((e) this.f55744b));
            default:
                return FintechWebViewFragmentBase.v((FintechWebViewFragmentBase) this.f55744b);
        }
    }
}
