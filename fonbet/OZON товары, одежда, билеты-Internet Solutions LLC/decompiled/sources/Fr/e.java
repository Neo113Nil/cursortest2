package Fr;

import Hh.C3140a;
import ru.ozon.app.android.account.locale.app.data.LocaleFetchAction;
import ru.ozon.app.android.composer.di.modules.RetainComposerPerformanceAnalyticsModule;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.abtool.OnChangeFeatureListener;
import xe.M;

/* loaded from: classes6.dex */
public final /* synthetic */ class e implements OnChangeFeatureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9551a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9552b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9553c;

    public /* synthetic */ e(int i11, Object obj, Object obj2) {
        this.f9551a = i11;
        this.f9552b = obj;
        this.f9553c = obj2;
    }

    @Override // ru.ozon.app.android.network.abtool.OnChangeFeatureListener
    public final void onChangeFeature() {
        switch (this.f9551a) {
            case 0:
                RetainComposerPerformanceAnalyticsModule.Companion.provideFpsTracker$lambda$1$lambda$0((C3140a) this.f9552b, (FeatureService) this.f9553c);
                break;
            default:
                LocaleFetchAction.fetch$lambda$0((M) this.f9552b, (LocaleFetchAction) this.f9553c);
                break;
        }
    }
}
