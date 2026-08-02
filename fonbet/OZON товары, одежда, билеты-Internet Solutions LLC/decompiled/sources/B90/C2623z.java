package B90;

import android.graphics.RectF;
import androidx.preference.Preference;
import ru.ozon.app.android.courieronmap.presentation.helper.CourierInfoBottomSheetHelper;
import ru.ozon.app.android.fresh.feature.entry.OzonFreshActivity;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;
import w2.C10411b;
import y7.InterfaceC10852c;

/* renamed from: B90.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2623z implements Preference.d, InterfaceC10852c, C10411b.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3236a;

    public /* synthetic */ C2623z(Object obj) {
        this.f3236a = obj;
    }

    @Override // y7.InterfaceC10852c
    public float a(RectF rectF) {
        float cornerRadius$lambda$9$lambda$8;
        cornerRadius$lambda$9$lambda$8 = CourierInfoBottomSheetHelper.setCornerRadius$lambda$9$lambda$8((CourierInfoBottomSheetHelper) this.f3236a, rectF);
        return cornerRadius$lambda$9$lambda$8;
    }

    @Override // w2.C10411b.c
    public boolean b() {
        boolean launchSplashScreen$lambda$2$lambda$0;
        launchSplashScreen$lambda$2$lambda$0 = OzonFreshActivity.launchSplashScreen$lambda$2$lambda$0((OzonFreshActivity) this.f3236a);
        return launchSplashScreen$lambda$2$lambda$0;
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.P((FintechPreferencesFragment) this.f3236a);
        return true;
    }
}
