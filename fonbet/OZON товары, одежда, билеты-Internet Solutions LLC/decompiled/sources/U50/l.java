package U50;

import K1.K;
import S0.InterfaceC3978p0;
import com.vk.id.group.subscription.compose.util.TightWrapTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator;

/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27358b;

    public /* synthetic */ l(Object obj, int i11) {
        this.f27357a = i11;
        this.f27358b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit TightWrapText_pNBRTJQ$lambda$9$lambda$8;
        switch (this.f27357a) {
            case 0:
                return NativeBridgeConfigurator.f((NativeBridgeConfigurator) this.f27358b, (String) obj);
            default:
                TightWrapText_pNBRTJQ$lambda$9$lambda$8 = TightWrapTextKt.TightWrapText_pNBRTJQ$lambda$9$lambda$8((InterfaceC3978p0) this.f27358b, (K) obj);
                return TightWrapText_pNBRTJQ$lambda$9$lambda$8;
        }
    }
}
