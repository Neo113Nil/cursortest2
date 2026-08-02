package Q90;

import Q90.c;
import Sc.s;
import g30.InterfaceC6618a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.settings.models.AuthPinpad;
import ru.ozon.fintech.settings.models.AuthPinpadRequestDto;
import ru.ozon.fintech.settings.network.AuthPinpadNetwork;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.settings.domain.FeatureToggles$hasNewAppConfig$2", f = "FeatureToggles.kt", l = {515}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super AuthPinpad>, Object> {

    /* renamed from: d, reason: collision with root package name */
    long f23079d;

    /* renamed from: e, reason: collision with root package name */
    int f23080e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f23081f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(c cVar, kotlin.coroutines.d<? super e> dVar) {
        super(2, dVar);
        this.f23081f = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new e(this.f23081f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super AuthPinpad> dVar) {
        return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC6618a interfaceC6618a;
        AuthPinpadNetwork authPinpadNetwork;
        o oVar;
        String str;
        long j11;
        String str2;
        InterfaceC6618a interfaceC6618a2;
        String str3;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f23080e;
        c cVar = this.f23081f;
        try {
            if (i11 == 0) {
                s.b(obj);
                long currentTimeMillis = System.currentTimeMillis();
                authPinpadNetwork = cVar.f23061d;
                boolean r11 = cVar.r();
                oVar = cVar.f23060c;
                String a11 = oVar.a();
                str = cVar.f23068k;
                if (str == null) {
                    str = "";
                }
                AuthPinpadRequestDto authPinpadRequestDto = new AuthPinpadRequestDto(str);
                this.f23079d = currentTimeMillis;
                this.f23080e = 1;
                obj = authPinpadNetwork.authPinpad(r11, a11, authPinpadRequestDto, this);
                if (obj == aVar) {
                    return aVar;
                }
                j11 = currentTimeMillis;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j11 = this.f23079d;
                s.b(obj);
            }
            AuthPinpad authPinpad = (AuthPinpad) obj;
            str2 = cVar.f23068k;
            if (str2 != null) {
                str3 = cVar.f23068k;
                authPinpad.setRedirectToDeep(str3);
            }
            cVar.f23068k = null;
            cVar.y(false);
            authPinpad.setTimestamp(new Long(j11));
            interfaceC6618a2 = cVar.f23062e;
            InterfaceC6618a.C1033a.i(interfaceC6618a2, authPinpad.getRedirectTo(), true, null, authPinpad.toAnalyticsJson(authPinpad, c.a.a()), 4);
            return (AuthPinpad) obj;
        } catch (Exception e11) {
            interfaceC6618a = cVar.f23062e;
            InterfaceC6618a.C1033a.i(interfaceC6618a, "", false, e11.getLocalizedMessage(), null, 8);
            return null;
        }
    }
}
