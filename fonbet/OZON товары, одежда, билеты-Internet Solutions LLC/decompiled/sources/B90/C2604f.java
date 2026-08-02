package B90;

import android.view.View;
import androidx.core.view.C5353y0;
import androidx.preference.Preference;
import java.io.Serializable;
import ru.ozon.app.android.di.module.NavigationDependenciesModule;
import ru.ozon.app.android.messenger.utils.KeyboardVisibilityObserver;
import ru.ozon.app.android.navigation.NativePageDomainsInteractor;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* renamed from: B90.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2604f implements Preference.c, GZ.d, androidx.core.view.D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3147a;

    public /* synthetic */ C2604f(Object obj) {
        this.f3147a = obj;
    }

    @Override // GZ.d
    public boolean a(String str) {
        boolean provideNavigationConfig$lambda$0;
        provideNavigationConfig$lambda$0 = NavigationDependenciesModule.provideNavigationConfig$lambda$0((NativePageDomainsInteractor) this.f3147a, str);
        return provideNavigationConfig$lambda$0;
    }

    @Override // androidx.preference.Preference.c
    public void b(Preference preference, Serializable serializable) {
        FintechPreferencesFragment.b0((FintechPreferencesFragment) this.f3147a);
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 registerListener$lambda$0;
        registerListener$lambda$0 = KeyboardVisibilityObserver.registerListener$lambda$0((KeyboardVisibilityObserver) this.f3147a, view, c5353y0);
        return registerListener$lambda$0;
    }
}
