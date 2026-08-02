package Ea;

import Hg.c;
import com.vk.id.tracking.tracer.TrackingDeps;
import kotlin.jvm.functions.Function1;
import ru.ozon.fintech.network.models.TestingFeaturesDto;

/* loaded from: classes9.dex */
public final /* synthetic */ class b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7747a;

    public /* synthetic */ b(int i11) {
        this.f7747a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CharSequence featuresString$lambda$0;
        switch (this.f7747a) {
            case 0:
                return TrackingDeps.tracer$lambda$1((c.a.C0221a) obj);
            default:
                featuresString$lambda$0 = TestingFeaturesDto.getFeaturesString$lambda$0((String) obj);
                return featuresString$lambda$0;
        }
    }
}
