package P70;

import com.vk.id.internal.di.VKIDDepsProd;
import com.vk.id.internal.user.UserDataFetcher;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.features.pinpad.presentation.pinpad.PinPadFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21931a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21932b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f21931a = i11;
        this.f21932b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        UserDataFetcher userDataFetcher$lambda$12;
        switch (this.f21931a) {
            case 0:
                return ((PinPadFragment) this.f21932b).getFactory();
            case 1:
                return g30.d.f2((g30.d) this.f21932b);
            default:
                userDataFetcher$lambda$12 = VKIDDepsProd.userDataFetcher$lambda$12((VKIDDepsProd) this.f21932b);
                return userDataFetcher$lambda$12;
        }
    }
}
