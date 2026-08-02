package A30;

import androidx.lifecycle.z0;
import kotlin.jvm.functions.Function0;
import qa0.C9016a;
import ru.ozon.fintech.features.cbottomstories.presentation.StoriesFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f347b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f346a = i11;
        this.f347b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        z0.b factory;
        switch (this.f346a) {
            case 0:
                return b.a((b) this.f347b);
            case 1:
                factory = ((StoriesFragment) this.f347b).getFactory();
                return factory;
            case 2:
                return G90.a.d0((G90.a) this.f347b);
            default:
                return C9016a.c((C9016a) this.f347b);
        }
    }
}
