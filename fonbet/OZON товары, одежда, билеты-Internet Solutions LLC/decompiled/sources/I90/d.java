package I90;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.fintech.features.offline.presentation.pay.OfflinePayFragment;
import ru.ozon.fintech.ui.ActionResult2UI;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12056a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12057b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f12056a = i11;
        this.f12057b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f12056a) {
            case 0:
                return f.f0((f) this.f12057b, (ActionResult2UI) obj);
            case 1:
                return OfflinePayFragment.w((OfflinePayFragment) this.f12057b, (View) obj);
            default:
                return z90.e.s0((z90.e) this.f12057b);
        }
    }
}
