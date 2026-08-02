package R70;

import androidx.lifecycle.z0;
import com.vk.id.internal.auth.AuthProvidersChooserDefault;
import com.vk.id.internal.di.VKIDDepsProd;
import i70.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n70.EnumC8449a;
import ru.ozon.fintech.features.pinpad.presentation.sheethow.PinPadSheetHow;
import ru.ozon.fintech.preferences.presentation.antifraud.AntifraudJsonFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24775a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24776b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f24775a = i11;
        this.f24776b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AuthProvidersChooserDefault authProvidersChooser$lambda$13;
        switch (this.f24775a) {
            case 0:
                return ((PinPadSheetHow) this.f24776b).getFactory();
            case 1:
                return W40.a.a((W40.a) this.f24776b);
            case 2:
                ((l) this.f24776b).E0(EnumC8449a.TRANSFER_WITHOUT_INTERNET, null);
                return Unit.f71690a;
            case 3:
                authProvidersChooser$lambda$13 = VKIDDepsProd.authProvidersChooser$lambda$13((VKIDDepsProd) this.f24776b);
                return authProvidersChooser$lambda$13;
            default:
                z0.b bVar = ((AntifraudJsonFragment) this.f24776b).f96637b;
                if (bVar != null) {
                    return bVar;
                }
                Intrinsics.n("factory");
                throw null;
        }
    }
}
