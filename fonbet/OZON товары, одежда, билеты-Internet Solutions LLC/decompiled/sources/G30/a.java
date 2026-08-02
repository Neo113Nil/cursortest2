package G30;

import V70.d;
import android.content.UriMatcher;
import f50.C6438a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import l80.f;
import ru.ozon.fintech.base.content.BaseSharedPrefsContentProvider;
import ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesFragment;
import ru.ozon.fintech.preferences.presentation.testingFeaturesV2.TestingFeaturesV2EditFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9684b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f9683a = i11;
        this.f9684b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        UriMatcher matcher_delegate$lambda$1;
        boolean isStandaloneIntegration_delegate$lambda$1;
        Object obj = this.f9684b;
        switch (this.f9683a) {
            case 0:
                matcher_delegate$lambda$1 = BaseSharedPrefsContentProvider.matcher_delegate$lambda$1((BaseSharedPrefsContentProvider) obj);
                return matcher_delegate$lambda$1;
            case 1:
                return TestingFeaturesV2EditFragment.t((TestingFeaturesV2EditFragment) obj);
            case 2:
                return Long.valueOf(d.e((d) obj));
            case 3:
                isStandaloneIntegration_delegate$lambda$1 = OnboardingSlidesFragment.isStandaloneIntegration_delegate$lambda$1((OnboardingSlidesFragment) obj);
                return Boolean.valueOf(isStandaloneIntegration_delegate$lambda$1);
            case 4:
                return ((C6438a) obj).getFactory();
            default:
                int i11 = f.f72971Z;
                f fVar = (f) obj;
                fVar.f0();
                fVar.f0();
                return Unit.f71690a;
        }
    }
}
