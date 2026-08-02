package B90;

import androidx.preference.Preference;
import ru.ozon.app.android.fresh.feature.entry.OzonFreshActivity;
import ru.ozon.app.android.storefront.core.atoms.views.RangeFilterView;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;
import s6.InterfaceC9601a;
import w2.C10411b;
import w2.C10416g;

/* loaded from: classes3.dex */
public final /* synthetic */ class A implements Preference.d, InterfaceC9601a, C10411b.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3097a;

    public /* synthetic */ A(Object obj) {
        this.f3097a = obj;
    }

    @Override // s6.InterfaceC9601a
    public void a(Number number, Number number2) {
        RangeFilterView._init_$lambda$0((RangeFilterView) this.f3097a, number, number2);
    }

    @Override // w2.C10411b.d
    public void b(C10416g c10416g) {
        OzonFreshActivity.launchSplashScreen$lambda$2$lambda$1((OzonFreshActivity) this.f3097a, c10416g);
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.c0((FintechPreferencesFragment) this.f3097a);
        return true;
    }
}
