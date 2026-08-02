package B90;

import androidx.concurrent.futures.b;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import ru.ozon.app.android.tabbar.OnBottomNavigationItemSelectedListener;
import ru.ozon.app.android.tabbar.ui.model.BottomMenuItem;
import ru.ozon.app.android.travel.feature.entry.fragment.OzonTravelFragment;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class U implements Preference.d, b.c, OnBottomNavigationItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3121a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3122b;

    public /* synthetic */ U(Object obj, Object obj2) {
        this.f3121a = obj;
        this.f3122b = obj2;
    }

    @Override // androidx.concurrent.futures.b.c
    public Object c(b.a aVar) {
        ((AtomicReference) this.f3121a).set(aVar);
        return C.o0.c(new StringBuilder(), (String) this.f3122b, "-Surface");
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.l0((FintechPreferencesFragment) this.f3121a, (EditTextPreference) this.f3122b);
        return true;
    }

    @Override // ru.ozon.app.android.tabbar.OnBottomNavigationItemSelectedListener
    public boolean onItemSelectedItem(BottomMenuItem bottomMenuItem, BottomMenuItem bottomMenuItem2) {
        boolean bindBottomNavigation$lambda$5;
        bindBottomNavigation$lambda$5 = OzonTravelFragment.bindBottomNavigation$lambda$5((OzonTravelFragment) this.f3121a, (List) this.f3122b, bottomMenuItem, bottomMenuItem2);
        return bindBottomNavigation$lambda$5;
    }
}
