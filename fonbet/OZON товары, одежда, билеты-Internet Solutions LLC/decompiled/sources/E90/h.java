package E90;

import android.view.MenuItem;
import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.fintech.preferences.presentation.playground.InputPlaygroundFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7662a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7663b;

    public /* synthetic */ h(Object obj, int i11) {
        this.f7662a = i11;
        this.f7663b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7662a) {
            case 0:
                return InputPlaygroundFragment.t((InputPlaygroundFragment) this.f7663b, (MenuItem) obj);
            default:
                return v50.j.f((v50.j) this.f7663b, (View) obj);
        }
    }
}
