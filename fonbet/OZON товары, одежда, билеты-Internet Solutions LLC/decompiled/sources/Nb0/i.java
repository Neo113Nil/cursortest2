package Nb0;

import B0.C2454a;
import De.C2862e;
import De.s;
import Sc.InterfaceC4008j;
import Vb0.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import dc0.C6178x;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.AuthActionDTO;
import ru.ozon.id.nativeauth.data.models.DeeplinkOtpFlowDTO;
import ru.ozon.id.nativeauth.data.models.EntryDTO;
import ru.ozon.id.nativeauth.data.models.FastEntryActionDTO;
import ru.ozon.id.nativeauth.data.models.OtpDTO;
import wc0.InterfaceC10500a;
import xc0.C10702a;
import xe.C10720e0;
import xe.C10727i;
import xe.I;
import xe.L0;
import xe.N;
import xe.X0;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Ib0.e> f18930a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final I f18931b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C6178x f18932c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2862e f18933d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f18934e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f18935f;

    public i() {
        throw null;
    }

    public i(InterfaceC4008j authRepository, InterfaceC4008j actionAuthRepository, InterfaceC4008j authEvents, C6178x currentUserRepository) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        L0 mainDispatcher = s.f6650a;
        Intrinsics.checkNotNullParameter(authRepository, "authRepository");
        Intrinsics.checkNotNullParameter(actionAuthRepository, "actionAuthRepository");
        Intrinsics.checkNotNullParameter(authEvents, "authEvents");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        this.f18930a = authEvents;
        this.f18931b = mainDispatcher;
        this.f18932c = currentUserRepository;
        this.f18933d = N.a(X0.b());
        this.f18934e = authRepository;
        this.f18935f = actionAuthRepository;
    }

    public static final /* synthetic */ a a(i iVar) {
        iVar.getClass();
        return m();
    }

    public static final Object b(i iVar, a aVar, kotlin.coroutines.d dVar) {
        return C10727i.f(iVar.f18931b, new c(iVar, aVar, true, null), dVar);
    }

    public static final InterfaceC10500a c(i iVar) {
        return (InterfaceC10500a) iVar.f18935f.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d0, code lost:
    
        if (r13 == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
    
        if (r13 != r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x007b, code lost:
    
        if (r13 == r0) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(i iVar, String str, String str2, kotlin.coroutines.jvm.internal.c cVar) {
        e eVar;
        int i11;
        EntryDTO.SubmitButtonDTO submitButton;
        String action;
        i iVar2;
        String str3;
        String str4;
        iVar.getClass();
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i12 = eVar.f18910i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eVar.f18910i = i12 - LinearLayoutManager.INVALID_OFFSET;
                e eVar2 = eVar;
                Object obj = eVar2.f18908g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = eVar2.f18910i;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    C10702a p11 = iVar.p();
                    eVar2.f18905d = iVar;
                    eVar2.f18906e = str2;
                    eVar2.f18910i = 1;
                    obj = p11.p(str, eVar2);
                } else if (i11 == 1) {
                    str2 = eVar2.f18906e;
                    iVar = eVar2.f18905d;
                    Sc.s.b(obj);
                } else if (i11 == 2) {
                    str3 = eVar2.f18907f;
                    str4 = eVar2.f18906e;
                    iVar2 = eVar2.f18905d;
                    Sc.s.b(obj);
                    eVar2.f18905d = iVar2;
                    eVar2.f18906e = str4;
                    eVar2.f18907f = str3;
                    eVar2.f18910i = 3;
                    obj = iVar2.q((FastEntryActionDTO) obj, eVar2);
                } else {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Sc.s.b(obj);
                            return obj;
                        }
                        str3 = eVar2.f18907f;
                        str4 = eVar2.f18906e;
                        iVar2 = eVar2.f18905d;
                        Sc.s.b(obj);
                        String str5 = str4;
                        i iVar3 = iVar2;
                        FastEntryActionDTO fastEntryActionDTO = (FastEntryActionDTO) obj;
                        if (fastEntryActionDTO == null) {
                            iVar3.getClass();
                            return m();
                        }
                        eVar2.f18905d = null;
                        eVar2.f18906e = null;
                        eVar2.f18907f = null;
                        eVar2.f18910i = 5;
                        Object r11 = iVar3.r(fastEntryActionDTO, str3, null, str5, eVar2);
                        return r11 == aVar ? aVar : r11;
                    }
                    str3 = eVar2.f18907f;
                    str4 = eVar2.f18906e;
                    iVar2 = eVar2.f18905d;
                    Sc.s.b(obj);
                    String str6 = (String) obj;
                    if (str6 == null) {
                        iVar2.getClass();
                        return m();
                    }
                    eVar2.f18905d = iVar2;
                    eVar2.f18906e = str4;
                    eVar2.f18907f = str3;
                    eVar2.f18910i = 4;
                    obj = iVar2.v(str6, str4, eVar2);
                }
                submitButton = ((EntryDTO) obj).getSubmitButton();
                if (submitButton != null || (action = submitButton.getAction()) == null) {
                    iVar.getClass();
                    return m();
                }
                C10702a p12 = iVar.p();
                eVar2.f18905d = iVar;
                eVar2.f18906e = str2;
                eVar2.f18907f = action;
                eVar2.f18910i = 2;
                obj = InterfaceC10500a.C2252a.a(p12, action, null, eVar2, 14);
                if (obj != aVar) {
                    String str7 = str2;
                    iVar2 = iVar;
                    str3 = action;
                    str4 = str7;
                    eVar2.f18905d = iVar2;
                    eVar2.f18906e = str4;
                    eVar2.f18907f = str3;
                    eVar2.f18910i = 3;
                    obj = iVar2.q((FastEntryActionDTO) obj, eVar2);
                }
            }
        }
        eVar = new e(iVar, cVar);
        e eVar22 = eVar;
        Object obj2 = eVar22.f18908g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eVar22.f18910i;
        if (i11 != 0) {
        }
        submitButton = ((EntryDTO) obj2).getSubmitButton();
        if (submitButton != null) {
        }
        iVar.getClass();
        return m();
    }

    public static final a h(i iVar, FastEntryActionDTO.ErrorDTO errorDTO) {
        iVar.getClass();
        b.a.b(Vb0.b.f28514a, errorDTO.toString());
        return m();
    }

    public static final /* synthetic */ a k(i iVar, FastEntryActionDTO fastEntryActionDTO) {
        iVar.getClass();
        return u(fastEntryActionDTO);
    }

    private static a m() {
        return new a(false, null);
    }

    static Object o(i iVar, a aVar, kotlin.coroutines.d dVar) {
        return C10727i.f(iVar.f18931b, new c(iVar, aVar, false, null), dVar);
    }

    private final C10702a p() {
        return (C10702a) this.f18934e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(FastEntryActionDTO fastEntryActionDTO, kotlin.coroutines.jvm.internal.c cVar) {
        d dVar;
        int i11;
        String otpToken;
        String deeplink;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i12 = dVar.f18904f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar.f18904f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = dVar.f18902d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = dVar.f18904f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    AuthActionDTO.StatusDTO status = fastEntryActionDTO.getStatus();
                    if (status != null && (deeplink = status.getDeeplink()) != null) {
                        return deeplink;
                    }
                    AuthActionDTO.StatusDTO status2 = fastEntryActionDTO.getStatus();
                    if (status2 == null || (otpToken = status2.getOtpToken()) == null) {
                        return null;
                    }
                    C10702a p11 = p();
                    dVar.f18904f = 1;
                    obj = p11.b(otpToken, dVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return ((DeeplinkOtpFlowDTO) obj).getDeeplink();
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f18902d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dVar.f18904f;
        if (i11 != 0) {
        }
        return ((DeeplinkOtpFlowDTO) obj2).getDeeplink();
    }

    private final Object r(FastEntryActionDTO fastEntryActionDTO, String str, Map map, String str2, kotlin.coroutines.jvm.internal.c cVar) {
        AuthActionDTO.StatusDTO status = fastEntryActionDTO.getStatus();
        String otpResponseToken = status != null ? status.getOtpResponseToken() : null;
        if (fastEntryActionDTO.getError() != null) {
            b.a.b(Vb0.b.f28514a, fastEntryActionDTO.getError().toString());
            return m();
        }
        if (otpResponseToken != null) {
            return s(str, otpResponseToken, str2, map, cVar);
        }
        AuthActionDTO.StatusDTO status2 = fastEntryActionDTO.getStatus();
        return status2 != null ? Intrinsics.d(status2.isCompleted(), Boolean.TRUE) : false ? u(fastEntryActionDTO) : m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(String str, String str2, String str3, Map map, kotlin.coroutines.jvm.internal.c cVar) {
        f fVar;
        int i11;
        i iVar;
        FastEntryActionDTO fastEntryActionDTO;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i12 = fVar.f18917j;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                fVar.f18917j = i12 - LinearLayoutManager.INVALID_OFFSET;
                f fVar2 = fVar;
                Object obj = fVar2.f18915h;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = fVar2.f18917j;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    C10702a p11 = p();
                    Tc.d builder = new Tc.d();
                    if (map != null) {
                        builder.putAll(map);
                    }
                    builder.put("otpResponseToken", str2);
                    Unit unit = Unit.f71690a;
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    Tc.d u11 = builder.u();
                    fVar2.f18911d = this;
                    fVar2.f18912e = str;
                    fVar2.f18913f = map;
                    fVar2.f18914g = str3;
                    fVar2.f18917j = 1;
                    obj = InterfaceC10500a.C2252a.a(p11, str, u11, fVar2, 12);
                    if (obj != aVar) {
                        iVar = this;
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return obj;
                }
                str3 = fVar2.f18914g;
                map = fVar2.f18913f;
                str = fVar2.f18912e;
                i iVar2 = fVar2.f18911d;
                Sc.s.b(obj);
                iVar = iVar2;
                String str4 = str;
                String str5 = str3;
                Map map2 = map;
                fastEntryActionDTO = (FastEntryActionDTO) obj;
                if (fastEntryActionDTO.getError() == null) {
                    FastEntryActionDTO.ErrorDTO error = fastEntryActionDTO.getError();
                    iVar.getClass();
                    b.a.b(Vb0.b.f28514a, error.toString());
                    return m();
                }
                AuthActionDTO.StatusDTO status = fastEntryActionDTO.getStatus();
                if (status != null ? Intrinsics.d(status.isCompleted(), Boolean.TRUE) : false) {
                    iVar.getClass();
                    return u(fastEntryActionDTO);
                }
                AuthActionDTO.StatusDTO status2 = fastEntryActionDTO.getStatus();
                if ((status2 != null ? status2.getOtpToken() : null) == null) {
                    iVar.getClass();
                    return m();
                }
                String otpToken = fastEntryActionDTO.getStatus().getOtpToken();
                fVar2.f18911d = null;
                fVar2.f18912e = null;
                fVar2.f18913f = null;
                fVar2.f18914g = null;
                fVar2.f18917j = 2;
                Object t2 = iVar.t(otpToken, str5, str4, map2, fVar2);
                return t2 == aVar ? aVar : t2;
            }
        }
        fVar = new f(this, cVar);
        f fVar22 = fVar;
        Object obj2 = fVar22.f18915h;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = fVar22.f18917j;
        if (i11 != 0) {
        }
        String str42 = str;
        String str52 = str3;
        Map map22 = map;
        fastEntryActionDTO = (FastEntryActionDTO) obj2;
        if (fastEntryActionDTO.getError() == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(String str, String str2, String str3, Map map, kotlin.coroutines.jvm.internal.c cVar) {
        g gVar;
        Object obj;
        Wc.a aVar;
        int i11;
        Map map2;
        i iVar;
        String str4;
        String str5;
        FastEntryActionDTO fastEntryActionDTO;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i12 = gVar.f18924j;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                gVar.f18924j = i12 - LinearLayoutManager.INVALID_OFFSET;
                g gVar2 = gVar;
                obj = gVar2.f18922h;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = gVar2.f18924j;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    C10702a p11 = p();
                    gVar2.f18918d = this;
                    gVar2.f18919e = str2;
                    gVar2.f18920f = str3;
                    gVar2.f18921g = map;
                    gVar2.f18924j = 1;
                    obj = p11.b(str, gVar2);
                    if (obj != aVar) {
                        map2 = map;
                        iVar = this;
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                        return obj;
                    }
                    map2 = gVar2.f18921g;
                    String str6 = gVar2.f18920f;
                    String str7 = gVar2.f18919e;
                    iVar = gVar2.f18918d;
                    Sc.s.b(obj);
                    str5 = str6;
                    str4 = str7;
                    Map map3 = map2;
                    i iVar2 = iVar;
                    fastEntryActionDTO = (FastEntryActionDTO) obj;
                    if (fastEntryActionDTO != null) {
                        iVar2.getClass();
                        return m();
                    }
                    gVar2.f18918d = null;
                    gVar2.f18919e = null;
                    gVar2.f18920f = null;
                    gVar2.f18921g = null;
                    gVar2.f18924j = 3;
                    Object r11 = iVar2.r(fastEntryActionDTO, str5, map3, str4, gVar2);
                    return r11 == aVar ? aVar : r11;
                }
                Map map4 = gVar2.f18921g;
                str3 = gVar2.f18920f;
                str2 = gVar2.f18919e;
                i iVar3 = gVar2.f18918d;
                Sc.s.b(obj);
                iVar = iVar3;
                map2 = map4;
                String deeplink = ((DeeplinkOtpFlowDTO) obj).getDeeplink();
                gVar2.f18918d = iVar;
                gVar2.f18919e = str2;
                gVar2.f18920f = str3;
                gVar2.f18921g = map2;
                gVar2.f18924j = 2;
                obj = iVar.v(deeplink, str2, gVar2);
                if (obj != aVar) {
                    str4 = str2;
                    str5 = str3;
                    Map map32 = map2;
                    i iVar22 = iVar;
                    fastEntryActionDTO = (FastEntryActionDTO) obj;
                    if (fastEntryActionDTO != null) {
                    }
                }
            }
        }
        gVar = new g(this, cVar);
        g gVar22 = gVar;
        obj = gVar22.f18922h;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = gVar22.f18924j;
        if (i11 != 0) {
        }
        String deeplink2 = ((DeeplinkOtpFlowDTO) obj).getDeeplink();
        gVar22.f18918d = iVar;
        gVar22.f18919e = str2;
        gVar22.f18920f = str3;
        gVar22.f18921g = map2;
        gVar22.f18924j = 2;
        obj = iVar.v(deeplink2, str2, gVar22);
        if (obj != aVar) {
        }
    }

    private static a u(FastEntryActionDTO fastEntryActionDTO) {
        FastEntryActionDTO.FastEntryDataDTO data = fastEntryActionDTO.getData();
        boolean z11 = (data != null ? data.getAuthToken() : null) != null;
        AuthActionDTO.StatusDTO status = fastEntryActionDTO.getStatus();
        return new a(z11, status != null ? status.getDeeplink() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(String str, String str2, kotlin.coroutines.jvm.internal.c cVar) {
        h hVar;
        int i11;
        i iVar;
        OtpDTO.Input input;
        String name;
        String action;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i12 = hVar.f18929h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                hVar.f18929h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = hVar.f18927f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = hVar.f18929h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    C10702a p11 = p();
                    hVar.f18925d = this;
                    hVar.f18926e = str2;
                    hVar.f18929h = 1;
                    obj = p11.q(str, hVar);
                    if (obj != aVar) {
                        iVar = this;
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return obj;
                }
                str2 = hVar.f18926e;
                iVar = hVar.f18925d;
                Sc.s.b(obj);
                OtpDTO otpDTO = (OtpDTO) obj;
                input = otpDTO.getInput();
                if (input != null || (name = input.getName()) == null || (action = otpDTO.getAction()) == null) {
                    return null;
                }
                C10702a p12 = iVar.p();
                Map b11 = C2454a.b(name, str2);
                hVar.f18925d = null;
                hVar.f18926e = null;
                hVar.f18929h = 2;
                Object a11 = InterfaceC10500a.C2252a.a(p12, action, b11, hVar, 12);
                return a11 == aVar ? aVar : a11;
            }
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.f18927f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = hVar.f18929h;
        if (i11 != 0) {
        }
        OtpDTO otpDTO2 = (OtpDTO) obj2;
        input = otpDTO2.getInput();
        if (input != null) {
        }
        return null;
    }

    public final void n(@NotNull String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter("111111", "otp");
        td0.f.b(this.f18933d, null, new b(this, phone, null));
    }
}
