package B90;

import E.InterfaceC2894j;
import android.view.View;
import androidx.core.view.C5353y0;
import androidx.preference.Preference;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import kotlin.jvm.functions.Function2;
import p3.InterfaceC8846f;
import qc.InterfaceC9021c;
import ru.ozon.app.android.orderdetails.cancelReasons.presentation.reasons.SelectCancelReasonViewHolder;
import ru.ozon.app.android.web.webview.cache.service.LocalStateActualizer;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;
import ru.ozon.id.ozonLimb.debug.OzonIdDebugActivity;

/* renamed from: B90.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2601c implements Preference.d, InterfaceC9021c, qc.h, I.a, androidx.core.view.D, InterfaceC8846f.a, SwipeRefreshLayout.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3138a;

    public /* synthetic */ C2601c(Object obj) {
        this.f3138a = obj;
    }

    @Override // qc.InterfaceC9021c
    public Object apply(Object obj, Object obj2) {
        Integer loadResources$lambda$4;
        loadResources$lambda$4 = LocalStateActualizer.loadResources$lambda$4((Function2) this.f3138a, (Integer) obj, obj2);
        return loadResources$lambda$4;
    }

    @Override // p3.InterfaceC8846f.a
    public InterfaceC8846f createDataSource() {
        return Z40.b.t((Z40.b) this.f3138a);
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.v0((FintechPreferencesFragment) this.f3138a);
        return true;
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 insetsListener$lambda$3;
        insetsListener$lambda$3 = SelectCancelReasonViewHolder.insetsListener$lambda$3((SelectCancelReasonViewHolder) this.f3138a, view, c5353y0);
        return insetsListener$lambda$3;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
    public void onRefresh() {
        OzonIdDebugActivity.J((OzonIdDebugActivity) this.f3138a);
    }

    @Override // I.a, qc.o
    public com.google.common.util.concurrent.m apply(Object obj) {
        return ((InterfaceC2894j) ((com.google.common.util.concurrent.m) this.f3138a).get()).a();
    }
}
