package A90;

import B4.C2584m;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f581b;

    public /* synthetic */ g(Object obj, int i11) {
        this.f580a = i11;
        this.f581b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f580a) {
            case 0:
                return ru.ozon.fintech.preferences.presentation.cbdc.a.d0((ru.ozon.fintech.preferences.presentation.cbdc.a) this.f581b);
            default:
                return l80.f.O((l80.f) this.f581b, (C2584m) obj);
        }
    }
}
