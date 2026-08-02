package D90;

import com.vk.id.internal.auth.AuthActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.preferences.presentation.nativebridge.FintechNativeBridgeTestingFragment;
import v50.p;
import v50.r;
import v50.t;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6193a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6194b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f6193a = i11;
        this.f6194b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit onPause$lambda$9;
        switch (this.f6193a) {
            case 0:
                return ((FintechNativeBridgeTestingFragment) this.f6194b).getFactory();
            case 1:
                return S50.a.a((S50.a) this.f6194b);
            case 2:
                ((ru.ozon.fintech.features.offline.presentation.select.a) this.f6194b).A0(true);
                return Unit.f71690a;
            case 3:
                onPause$lambda$9 = AuthActivity.onPause$lambda$9((AuthActivity) this.f6194b);
                return onPause$lambda$9;
            default:
                r rVar = r.f102402a;
                String str = (String) this.f6194b;
                p.a k11 = rVar.k(str);
                if (k11 == null) {
                    k11 = t.f102407a.j(str);
                }
                if (k11 != null) {
                    k11.dismiss();
                }
                return Unit.f71690a;
        }
    }
}
