package Ca;

import S0.InterfaceC3978p0;
import com.vk.id.onetap.compose.button.auth.VKIDButtonSmallKt;
import com.vk.id.onetap.xml.OneTap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l1.InterfaceC7825i0;
import m0.C7980b;
import ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase;

/* loaded from: classes9.dex */
public final /* synthetic */ class q implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4619b;

    public /* synthetic */ q(Object obj, int i11) {
        this.f4618a = i11;
        this.f4619b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit Content$lambda$34$lambda$33;
        Unit SmallButtonContent$lambda$22$lambda$17$lambda$16;
        switch (this.f4618a) {
            case 0:
                Content$lambda$34$lambda$33 = OneTap.Content$lambda$34$lambda$33((InterfaceC3978p0) this.f4619b, (Set) obj);
                return Content$lambda$34$lambda$33;
            case 1:
                return F90.e.f0((F90.e) this.f4619b);
            case 2:
                SmallButtonContent$lambda$22$lambda$17$lambda$16 = VKIDButtonSmallKt.SmallButtonContent$lambda$22$lambda$17$lambda$16((C7980b) this.f4619b, (InterfaceC7825i0) obj);
                return SmallButtonContent$lambda$22$lambda$17$lambda$16;
            default:
                ((FintechWebViewFragmentBase) this.f4619b).N().B1((String) obj);
                return Unit.f71690a;
        }
    }
}
