package Ca;

import S0.InterfaceC3978p0;
import com.vk.id.auth.VKIDAuthUiParams;
import com.vk.id.onetap.compose.button.auth.VKIDButtonSmallKt;
import com.vk.id.onetap.xml.OneTap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l1.InterfaceC7825i0;
import m0.C7980b;
import ru.ozon.fintech.exchanger.datapass.ActionResult2;

/* loaded from: classes9.dex */
public final /* synthetic */ class p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4616a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4617b;

    public /* synthetic */ p(Object obj, int i11) {
        this.f4616a = i11;
        this.f4617b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit Content$lambda$29$lambda$28;
        Unit SmallButtonContent$lambda$22$lambda$15$lambda$14;
        switch (this.f4616a) {
            case 0:
                Content$lambda$29$lambda$28 = OneTap.Content$lambda$29$lambda$28((InterfaceC3978p0) this.f4617b, (VKIDAuthUiParams) obj);
                return Content$lambda$29$lambda$28;
            case 1:
                return F90.e.k0((F90.e) this.f4617b);
            case 2:
                SmallButtonContent$lambda$22$lambda$15$lambda$14 = VKIDButtonSmallKt.SmallButtonContent$lambda$22$lambda$15$lambda$14((C7980b) this.f4617b, (InterfaceC7825i0) obj);
                return SmallButtonContent$lambda$22$lambda$15$lambda$14;
            default:
                return y70.f.d0((y70.f) this.f4617b, (ActionResult2) obj);
        }
    }
}
