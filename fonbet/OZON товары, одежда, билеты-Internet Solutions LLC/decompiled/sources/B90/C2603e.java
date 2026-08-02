package B90;

import E.InterfaceC2894j;
import android.view.View;
import androidx.core.view.C5353y0;
import androidx.preference.Preference;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ru.ozon.app.android.ugc.widgets.profileInputs.presentation.ProfileInputsViewHolder;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* renamed from: B90.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2603e implements Preference.d, I.a, androidx.core.view.D, SwipeRefreshLayout.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3144a;

    public /* synthetic */ C2603e(Object obj) {
        this.f3144a = obj;
    }

    @Override // I.a, qc.o
    public com.google.common.util.concurrent.m apply(Object obj) {
        return ((InterfaceC2894j) ((com.google.common.util.concurrent.m) this.f3144a).get()).b();
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.I((FintechPreferencesFragment) this.f3144a);
        return true;
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 keyboardInsetsListener$lambda$1;
        keyboardInsetsListener$lambda$1 = ProfileInputsViewHolder.keyboardInsetsListener$lambda$1((ProfileInputsViewHolder) this.f3144a, view, c5353y0);
        return keyboardInsetsListener$lambda$1;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
    public void onRefresh() {
        ob0.q.t((ob0.q) this.f3144a);
    }
}
