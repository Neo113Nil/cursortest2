package B50;

import com.vk.id.internal.di.VKIDDepsProd;
import com.vk.id.internal.store.InternalVKIDPrefsStore;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.preferences.presentation.testingFeaturesV1.TestingFeaturesV1EditFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2831b;

    public /* synthetic */ f(Object obj, int i11) {
        this.f2830a = i11;
        this.f2831b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InternalVKIDPrefsStore prefsStore$lambda$25;
        switch (this.f2830a) {
            case 0:
                return h.t((h) this.f2831b);
            case 1:
                return TestingFeaturesV1EditFragment.v((TestingFeaturesV1EditFragment) this.f2831b);
            default:
                prefsStore$lambda$25 = VKIDDepsProd.prefsStore$lambda$25((VKIDDepsProd) this.f2831b);
                return prefsStore$lambda$25;
        }
    }
}
