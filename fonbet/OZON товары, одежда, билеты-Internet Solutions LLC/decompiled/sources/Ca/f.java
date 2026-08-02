package Ca;

import S0.InterfaceC3978p0;
import com.vk.id.onetap.common.OneTapStyle;
import com.vk.id.onetap.xml.OneTap;
import ki0.InterfaceC7684a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class f implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4600b;

    public /* synthetic */ f(Object obj, int i11) {
        this.f4599a = i11;
        this.f4600b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit Content$lambda$19$lambda$18;
        switch (this.f4599a) {
            case 0:
                Content$lambda$19$lambda$18 = OneTap.Content$lambda$19$lambda$18((InterfaceC3978p0) this.f4600b, (OneTapStyle) obj);
                return Content$lambda$19$lambda$18;
            default:
                ki0.b bVar = (ki0.b) this.f4600b;
                bVar.getClass();
                return InterfaceC7684a.C1179a.a(bVar, (kotlin.coroutines.d) obj);
        }
    }
}
