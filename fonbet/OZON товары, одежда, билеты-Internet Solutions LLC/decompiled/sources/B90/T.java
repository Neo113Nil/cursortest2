package B90;

import C.s0;
import a7.b;
import android.view.View;
import androidx.core.view.C5353y0;
import androidx.preference.Preference;
import java.io.Serializable;
import ru.ozon.app.android.returns.cancels.cancelReasons.presentation.reasons.SelectCancelReasonViewHolder;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class T implements Preference.c, s0.e, b.a, androidx.core.view.D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3120a;

    public /* synthetic */ T(Object obj) {
        this.f3120a = obj;
    }

    @Override // androidx.preference.Preference.c
    public void b(Preference preference, Serializable serializable) {
        FintechPreferencesFragment.K((FintechPreferencesFragment) this.f3120a, preference, serializable);
    }

    @Override // C.s0.e
    public void c(s0.d dVar) {
        ((W.K) this.f3120a).f32933s = dVar;
    }

    @Override // a7.b.a
    public Object execute() {
        return ((Z6.c) this.f3120a).k();
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 insetsListener$lambda$3;
        insetsListener$lambda$3 = SelectCancelReasonViewHolder.insetsListener$lambda$3((SelectCancelReasonViewHolder) this.f3120a, view, c5353y0);
        return insetsListener$lambda$3;
    }
}
