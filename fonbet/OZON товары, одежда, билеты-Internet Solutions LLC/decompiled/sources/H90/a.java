package H90;

import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.preferences.presentation.testingFeaturesV2.TestingFeaturesV2EditFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10703a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentCallbacksC5392m f10704b;

    public /* synthetic */ a(ComponentCallbacksC5392m componentCallbacksC5392m, int i11) {
        this.f10703a = i11;
        this.f10704b = componentCallbacksC5392m;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10703a) {
            case 0:
                return TestingFeaturesV2EditFragment.u((TestingFeaturesV2EditFragment) this.f10704b);
            default:
                return ((f50.b) this.f10704b).getFactory();
        }
    }
}
