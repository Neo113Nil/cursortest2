package B90;

import android.graphics.RectF;
import android.view.View;
import androidx.core.view.C5353y0;
import androidx.preference.Preference;
import ru.ozon.app.android.courieronmap.presentation.helper.CourierInfoBottomSheetHelper;
import ru.ozon.app.android.travel.pageconfigurator.fullScreen.FullScreenInsetsConfigurator;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;
import y7.InterfaceC10852c;

/* renamed from: B90.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2622y implements Preference.d, InterfaceC10852c, androidx.core.view.D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3235a;

    public /* synthetic */ C2622y(Object obj) {
        this.f3235a = obj;
    }

    @Override // y7.InterfaceC10852c
    public float a(RectF rectF) {
        float cornerRadius$lambda$9$lambda$7;
        cornerRadius$lambda$9$lambda$7 = CourierInfoBottomSheetHelper.setCornerRadius$lambda$9$lambda$7((CourierInfoBottomSheetHelper) this.f3235a, rectF);
        return cornerRadius$lambda$9$lambda$7;
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.Z((FintechPreferencesFragment) this.f3235a);
        return true;
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 insetsListener$lambda$0;
        insetsListener$lambda$0 = FullScreenInsetsConfigurator.insetsListener$lambda$0((FullScreenInsetsConfigurator) this.f3235a, view, c5353y0);
        return insetsListener$lambda$0;
    }
}
