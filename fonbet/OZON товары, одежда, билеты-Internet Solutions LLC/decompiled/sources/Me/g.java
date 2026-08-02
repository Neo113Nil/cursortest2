package Me;

import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase;

/* loaded from: classes10.dex */
public final /* synthetic */ class g implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17917b;

    public /* synthetic */ g(Object obj, int i11) {
        this.f17916a = i11;
        this.f17917b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17916a) {
            case 0:
                return Integer.valueOf(h.g((h) this.f17917b));
            default:
                return ((FintechWebViewFragmentBase) this.f17917b).getFactory();
        }
    }
}
