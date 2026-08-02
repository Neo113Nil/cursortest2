package N50;

import com.vk.id.internal.auth.ServiceCredentials;
import com.vk.id.internal.di.VKIDDepsProd;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.features.demo.presentation.DemoFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18705b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f18704a = i11;
        this.f18705b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ServiceCredentials serviceCredentials$lambda$0;
        switch (this.f18704a) {
            case 0:
                return ((DemoFragment) this.f18705b).getFactory();
            case 1:
                return Boolean.valueOf(Q90.n.a((Q90.n) this.f18705b));
            case 2:
                return d70.k.n((d70.k) this.f18705b);
            default:
                serviceCredentials$lambda$0 = VKIDDepsProd.serviceCredentials$lambda$0((VKIDDepsProd) this.f18705b);
                return serviceCredentials$lambda$0;
        }
    }
}
