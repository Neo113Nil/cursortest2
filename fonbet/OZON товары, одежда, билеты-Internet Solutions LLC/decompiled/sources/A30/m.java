package A30;

import Ae.C0;
import Ae.E0;
import B30.f;
import D30.a;
import D30.f;
import H30.q;
import Sc.C4001c;
import Sc.s;
import We.M;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.squareup.moshi.D;
import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Converter;
import retrofit2.HttpException;
import retrofit2.Response;
import retrofit2.Retrofit;
import ru.ozon.fintech.auth.domain.external.ExternalFintechAuth;
import ru.ozon.fintech.auth.network.AuthNetworkApiV2;
import ru.ozon.fintech.auth.network.dto.AuthCreateBiometricTokenRequestDto;
import ru.ozon.fintech.auth.network.dto.AuthCreateBiometricTokenResponseDto;
import ru.ozon.fintech.auth.network.dto.AuthLoginRequestDto;
import ru.ozon.fintech.auth.network.dto.AuthLoginResponseDto;
import ru.ozon.fintech.auth.network.dto.AuthLoginResponseErrorDto;
import ru.ozon.fintech.auth.network.dto.AuthThrottleStatusResponseDto;
import ru.ozon.fintech.settings.models.AppConfig;
import xe.C10720e0;
import xe.C10754w;
import xe.InterfaceC10750u;
import xe.L0;
import ze.EnumC11113a;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f378a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f379b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Q90.c f380c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Retrofit f381d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Moshi f382e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final S80.b f383f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final AuthNetworkApiV2 f384g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final B30.f f385h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private ExternalFintechAuth f386i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private b f387j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final B30.a f388k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f389l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f390m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final C0 f391n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final ArrayList f392o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final ArrayList f393p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private D30.f f394q;

    public m(@NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull Q90.c featureToggles, @NotNull Retrofit retrofit, @NotNull Moshi moshi, @NotNull S80.b fintechNavigation, @NotNull AuthNetworkApiV2 authNetworkApiV2, @NotNull B30.f biometricSecurityStorage, @NotNull ExternalFintechAuth externalFintechAuth, @NotNull b fastEntryManager, @NotNull B30.a biometricAuthManager) {
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(authNetworkApiV2, "authNetworkApiV2");
        Intrinsics.checkNotNullParameter(biometricSecurityStorage, "biometricSecurityStorage");
        Intrinsics.checkNotNullParameter(externalFintechAuth, "externalFintechAuth");
        Intrinsics.checkNotNullParameter(fastEntryManager, "fastEntryManager");
        Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
        this.f378a = fintechAnalyticInteractor;
        this.f379b = fintechSettings;
        this.f380c = featureToggles;
        this.f381d = retrofit;
        this.f382e = moshi;
        this.f383f = fintechNavigation;
        this.f384g = authNetworkApiV2;
        this.f385h = biometricSecurityStorage;
        this.f386i = externalFintechAuth;
        this.f387j = fastEntryManager;
        this.f388k = biometricAuthManager;
        this.f389l = true;
        this.f390m = new LinkedHashSet();
        this.f391n = E0.a(0, 1, EnumC11113a.DROP_OLDEST);
        this.f392o = new ArrayList();
        this.f393p = new ArrayList();
        this.f394q = externalFintechAuth.isOzonSignedIn() ? new f.b(0) : f.c.f5781a;
    }

    public static Unit a(m mVar, AppConfig it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Iterator it2 = mVar.f393p.iterator();
        while (it2.hasNext()) {
            ((Function0) it2.next()).invoke();
        }
        return Unit.f71690a;
    }

    public static Unit b(m mVar, B60.b bVar, f.c success) {
        Intrinsics.checkNotNullParameter(success, "success");
        if (!(success instanceof f.c.b)) {
            mVar.f387j.c(false);
        }
        bVar.invoke(success);
        return Unit.f71690a;
    }

    public final void A(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f392o.add(listener);
    }

    public final void B(@NotNull d70.g listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f393p.add(listener);
    }

    public final void C(boolean z11) {
        this.f386i.setAdParam(z11);
    }

    public final void D(boolean z11) {
        this.f389l = z11;
    }

    public final void E() {
        this.f394q = f.a.f5780a;
        C0 c02 = this.f391n;
        Intrinsics.g(c02, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableSharedFlow<ru.ozon.fintech.auth.models.UserWeb>");
        c02.tryEmit(this.f394q);
    }

    public final Object F(@NotNull String str, @NotNull kotlin.coroutines.d<? super D30.c> dVar) {
        return this.f386i.tryAuthDomain(str, dVar);
    }

    public final Object d(String str, @NotNull kotlin.coroutines.d dVar) {
        this.f379b.getClass();
        return this.f384g.authCreateBiometricToken(new AuthCreateBiometricTokenRequestDto(ru.ozon.fintech.settings.domain.a.h(), str, null, null), dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
    
        if (r12 == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0101, code lost:
    
        if (r12 == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012b, code lost:
    
        if (r12 == r3) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, @NotNull kotlin.coroutines.jvm.internal.c cVar) throws Exception {
        g gVar;
        int i11;
        m mVar;
        Response<?> response;
        M errorBody;
        List list;
        try {
            if (cVar instanceof g) {
                gVar = (g) cVar;
                int i12 = gVar.f361g;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    gVar.f361g = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = gVar.f359e;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = gVar.f361g;
                    if (i11 != 0) {
                        s.b(obj);
                        try {
                            AuthNetworkApiV2 authNetworkApiV2 = this.f384g;
                            AuthLoginRequestDto authLoginRequestDto = new AuthLoginRequestDto(str, null, str2);
                            gVar.f358d = this;
                            gVar.f361g = 1;
                            obj = authNetworkApiV2.authLogin(authLoginRequestDto, gVar);
                            if (obj != aVar) {
                                mVar = this;
                            }
                        } catch (HttpException e11) {
                            e = e11;
                            mVar = this;
                            response = e.response();
                            mVar.getClass();
                            Converter responseBodyConverter = mVar.f381d.responseBodyConverter(D.e(List.class, AuthLoginResponseErrorDto.class), new Annotation[0]);
                            if (response != null) {
                                try {
                                    errorBody = response.errorBody();
                                } catch (Exception unused) {
                                }
                                if (errorBody != null) {
                                    list = (List) responseBodyConverter.convert(errorBody);
                                    AuthLoginResponseErrorDto authLoginResponseErrorDto = list != null ? (AuthLoginResponseErrorDto) C7714v.M(list) : null;
                                    if (e.code() == 400) {
                                        if (Intrinsics.d(authLoginResponseErrorDto != null ? authLoginResponseErrorDto.getMessage() : null, AuthLoginResponseErrorDto.WRONG_PASSWORD)) {
                                            gVar.f358d = null;
                                            gVar.f361g = 2;
                                            obj = mVar.f(gVar);
                                        }
                                    }
                                    if (e.code() == 400) {
                                        if (Intrinsics.d(authLoginResponseErrorDto != null ? authLoginResponseErrorDto.getMessage() : null, AuthLoginResponseErrorDto.INCORRECT_PIN_CODE)) {
                                            gVar.f358d = null;
                                            gVar.f361g = 3;
                                            obj = mVar.f(gVar);
                                        }
                                    }
                                    if (e.code() == 400) {
                                        if (Intrinsics.d(authLoginResponseErrorDto != null ? authLoginResponseErrorDto.getMessage() : null, AuthLoginResponseErrorDto.LOGIN_THROTTLED)) {
                                            gVar.f358d = null;
                                            gVar.f361g = 4;
                                            obj = mVar.f(gVar);
                                        }
                                    }
                                    if (e.code() == 400) {
                                        if (Intrinsics.d(authLoginResponseErrorDto != null ? authLoginResponseErrorDto.getMessage() : null, AuthLoginResponseErrorDto.NEED_USE_PASSWORD)) {
                                            return a.f.f5770a;
                                        }
                                    }
                                    if (e.code() == 400) {
                                        if (Intrinsics.d(authLoginResponseErrorDto != null ? authLoginResponseErrorDto.getMessage() : null, AuthLoginResponseErrorDto.DBO_BLOCKED_NEED_CHANGE_PIN_CODE)) {
                                            return a.C0130a.f5764a;
                                        }
                                    }
                                    if (e.code() == 400) {
                                        if (Intrinsics.d(authLoginResponseErrorDto != null ? authLoginResponseErrorDto.getMessage() : null, AuthLoginResponseErrorDto.EMPTY_BANK_PHONE)) {
                                            return a.b.f5765a;
                                        }
                                    }
                                    return a.h.f5772a;
                                }
                            }
                            list = null;
                            if (list != null) {
                            }
                            if (e.code() == 400) {
                            }
                            if (e.code() == 400) {
                            }
                            if (e.code() == 400) {
                            }
                            if (e.code() == 400) {
                            }
                            if (e.code() == 400) {
                            }
                            if (e.code() == 400) {
                            }
                            return a.h.f5772a;
                        }
                        return aVar;
                    }
                    if (i11 != 1) {
                        if (i11 == 2) {
                            s.b(obj);
                            return new a.i((D30.e) obj);
                        }
                        if (i11 == 3) {
                            s.b(obj);
                            return new a.d((D30.e) obj);
                        }
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return new a.e((D30.e) obj);
                    }
                    mVar = gVar.f358d;
                    try {
                        s.b(obj);
                    } catch (HttpException e12) {
                        e = e12;
                        response = e.response();
                        mVar.getClass();
                        Converter responseBodyConverter2 = mVar.f381d.responseBodyConverter(D.e(List.class, AuthLoginResponseErrorDto.class), new Annotation[0]);
                        if (response != null) {
                        }
                        list = null;
                        if (list != null) {
                        }
                        if (e.code() == 400) {
                        }
                        if (e.code() == 400) {
                        }
                        if (e.code() == 400) {
                        }
                        if (e.code() == 400) {
                        }
                        if (e.code() == 400) {
                        }
                        if (e.code() == 400) {
                        }
                        return a.h.f5772a;
                    }
                    AuthLoginResponseDto authLoginResponseDto = (AuthLoginResponseDto) obj;
                    CookieManager.getInstance().flush();
                    return new a.c(authLoginResponseDto.getChallengeID(), authLoginResponseDto.getSignToken());
                }
            }
            if (i11 != 0) {
            }
            AuthLoginResponseDto authLoginResponseDto2 = (AuthLoginResponseDto) obj;
            CookieManager.getInstance().flush();
            return new a.c(authLoginResponseDto2.getChallengeID(), authLoginResponseDto2.getSignToken());
        } catch (Exception unused2) {
            return a.g.f5771a;
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.f359e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = gVar.f361g;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        h hVar;
        int i11;
        try {
            if (cVar instanceof h) {
                hVar = (h) cVar;
                int i12 = hVar.f364f;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    hVar.f364f = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = hVar.f362d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = hVar.f364f;
                    if (i11 != 0) {
                        s.b(obj);
                        AuthNetworkApiV2 authNetworkApiV2 = this.f384g;
                        hVar.f364f = 1;
                        obj = authNetworkApiV2.authThrottleStatus(hVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    AuthThrottleStatusResponseDto authThrottleStatusResponseDto = (AuthThrottleStatusResponseDto) obj;
                    return new D30.e(authThrottleStatusResponseDto.getLockedUntil(), authThrottleStatusResponseDto.getLoginMistakeLimit());
                }
            }
            if (i11 != 0) {
            }
            AuthThrottleStatusResponseDto authThrottleStatusResponseDto2 = (AuthThrottleStatusResponseDto) obj;
            return new D30.e(authThrottleStatusResponseDto2.getLockedUntil(), authThrottleStatusResponseDto2.getLoginMistakeLimit());
        } catch (Exception unused) {
            return null;
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.f362d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = hVar.f364f;
    }

    public final AuthCreateBiometricTokenResponseDto g(@NotNull String bioJson) {
        Intrinsics.checkNotNullParameter(bioJson, "bioJson");
        return (AuthCreateBiometricTokenResponseDto) q.a(this.f382e, bioJson, AuthCreateBiometricTokenResponseDto.class);
    }

    @NotNull
    public final String h(@NotNull AuthCreateBiometricTokenResponseDto authCreateBiometricTokenResponseDto) {
        Intrinsics.checkNotNullParameter(authCreateBiometricTokenResponseDto, "authCreateBiometricTokenResponseDto");
        try {
            return this.f382e.c(AuthCreateBiometricTokenResponseDto.class).toJson(authCreateBiometricTokenResponseDto);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return "";
        }
    }

    @NotNull
    public final f.c i(String str, @NotNull String token, boolean z11) {
        Intrinsics.checkNotNullParameter(token, "token");
        if (str == null) {
            Intrinsics.checkNotNullParameter("tokenId != null", "msg");
            return new f.c.a.b("tokenId != null");
        }
        b bVar = this.f387j;
        bVar.f(str);
        bVar.c(z11);
        return this.f385h.h(str, token, z11);
    }

    public final void j(@NotNull r activity, boolean z11, String str, @NotNull B60.b result) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(result, "result");
        b bVar = this.f387j;
        if (str != null) {
            bVar.f(str);
        }
        bVar.c(z11);
        this.f385h.f(activity, str, z11, new d(this, result, 0));
    }

    public final void k(@NotNull String phone, @NotNull String otp, long j11) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(otp, "otp");
        this.f386i.forceSignIn(phone, otp, j11);
    }

    @NotNull
    public final Map<String, String> l() {
        return this.f386i.getAdditionalHeaders();
    }

    public final String m() {
        Exception b11;
        Exception b12;
        String d11 = this.f387j.d();
        f.b a11 = d11 != null ? this.f385h.a(d11) : null;
        String a12 = a11 != null ? a11.a() : null;
        this.f378a.J0((a11 == null || (b12 = a11.b()) == null) ? null : b12.getLocalizedMessage(), (a11 == null || (b11 = a11.b()) == null) ? null : C4001c.b(b11), d11, !(a12 == null || a12.length() == 0), u());
        if (a11 != null) {
            return a11.a();
        }
        return null;
    }

    public final boolean n() {
        return this.f389l;
    }

    @NotNull
    public final Map<String, String> o() {
        return this.f386i.getOzonIdHeaders();
    }

    public final String p() {
        return this.f386i.getUserOzonId();
    }

    @NotNull
    public final D30.f q() {
        return this.f394q;
    }

    @NotNull
    public final C0 r() {
        return this.f391n;
    }

    @NotNull
    public final LinkedHashSet s() {
        return this.f390m;
    }

    public final boolean t() {
        return this.f387j.b();
    }

    public final boolean u() {
        return this.f388k.b() && this.f387j.e();
    }

    public final boolean v() {
        return this.f386i.isOzonSignedIn();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e4, code lost:
    
        if (xe.C10727i.f(r12, r13, r0) == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
    
        if (xe.C10727i.f(r12, r13, r0) == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
    
        if (r2.x(r3, r0) == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(boolean z11, @NotNull kotlin.coroutines.jvm.internal.c cVar) throws Exception {
        i iVar;
        int i11;
        m mVar;
        String str;
        m mVar2;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i12 = iVar.f370i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                iVar.f370i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = iVar.f368g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = iVar.f370i;
                if (i11 != 0) {
                    s.b(obj);
                    ExternalFintechAuth externalFintechAuth = this.f386i;
                    String userOzonId = externalFintechAuth.getUserOzonId();
                    String i13 = userOzonId != null ? this.f385h.i(userOzonId) : null;
                    if (this.f379b.isStandAloneIntegration()) {
                        InterfaceC10750u<Boolean> a11 = C10754w.a();
                        externalFintechAuth.logOutOzonId(a11);
                        iVar.f365d = this;
                        iVar.f366e = i13;
                        iVar.f367f = z11;
                        iVar.f370i = 1;
                        obj = a11.s(iVar);
                        if (obj != aVar) {
                            str = i13;
                            mVar2 = this;
                            if (((Boolean) obj).booleanValue()) {
                            }
                            return Unit.f71690a;
                        }
                    } else {
                        iVar.f365d = this;
                        iVar.f367f = z11;
                        iVar.f370i = 4;
                        if (x(i13, iVar) != aVar) {
                            mVar = this;
                            if (z11) {
                            }
                            return Unit.f71690a;
                        }
                    }
                    return aVar;
                }
                if (i11 == 1) {
                    z11 = iVar.f367f;
                    String str2 = iVar.f366e;
                    m mVar3 = iVar.f365d;
                    s.b(obj);
                    str = str2;
                    mVar2 = mVar3;
                    if (((Boolean) obj).booleanValue()) {
                        iVar.f365d = mVar2;
                        iVar.f366e = null;
                        iVar.f367f = z11;
                        iVar.f370i = 2;
                    }
                    return Unit.f71690a;
                }
                if (i11 == 2) {
                    z11 = iVar.f367f;
                    mVar2 = iVar.f365d;
                    s.b(obj);
                    if (z11) {
                        C10720e0 c10720e0 = C10720e0.f105451a;
                        L0 l02 = De.s.f6650a;
                        j jVar = new j(mVar2, null);
                        iVar.f365d = null;
                        iVar.f370i = 3;
                    }
                    return Unit.f71690a;
                }
                if (i11 == 3) {
                    s.b(obj);
                    return Unit.f71690a;
                }
                if (i11 != 4) {
                    if (i11 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                z11 = iVar.f367f;
                mVar = iVar.f365d;
                s.b(obj);
                if (z11) {
                    C10720e0 c10720e02 = C10720e0.f105451a;
                    L0 l03 = De.s.f6650a;
                    k kVar = new k(mVar, null);
                    iVar.f365d = null;
                    iVar.f370i = 5;
                }
                return Unit.f71690a;
            }
        }
        iVar = new i(this, cVar);
        Object obj2 = iVar.f368g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = iVar.f370i;
        if (i11 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e A[LOOP:0: B:13:0x0068->B:15:0x006e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        l lVar;
        int i11;
        m mVar;
        Iterator it;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i12 = lVar.f377h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                lVar.f377h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = lVar.f375f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = lVar.f377h;
                if (i11 != 0) {
                    s.b(obj);
                    this.f389l = true;
                    ru.ozon.fintech.settings.domain.a aVar2 = this.f379b;
                    aVar2.C(true);
                    aVar2.z();
                    this.f380c.l();
                    lVar.f373d = this;
                    lVar.f374e = str;
                    lVar.f377h = 1;
                    if (this.f384g.logOut(lVar) == aVar) {
                        return aVar;
                    }
                    mVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = lVar.f374e;
                    mVar = lVar.f373d;
                    s.b(obj);
                }
                if (str != null) {
                    mVar.f385h.g(str, new f(0));
                }
                it = mVar.f392o.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                mVar.f394q = f.c.f5781a;
                C0 c02 = mVar.f391n;
                Intrinsics.g(c02, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableSharedFlow<ru.ozon.fintech.auth.models.UserWeb>");
                c02.tryEmit(mVar.f394q);
                mVar.f378a.j1(null);
                return Unit.f71690a;
            }
        }
        lVar = new l(this, cVar);
        Object obj2 = lVar.f375f;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = lVar.f377h;
        if (i11 != 0) {
        }
        if (str != null) {
        }
        it = mVar.f392o.iterator();
        while (it.hasNext()) {
        }
        mVar.f394q = f.c.f5781a;
        C0 c022 = mVar.f391n;
        Intrinsics.g(c022, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableSharedFlow<ru.ozon.fintech.auth.models.UserWeb>");
        c022.tryEmit(mVar.f394q);
        mVar.f378a.j1(null);
        return Unit.f71690a;
    }

    public final Object y(@NotNull kotlin.coroutines.d dVar) throws Exception {
        this.f378a.j1(this.f386i.getUserOzonId());
        this.f394q = new f.b(0);
        C0 c02 = this.f391n;
        Intrinsics.g(c02, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableSharedFlow<ru.ozon.fintech.auth.models.UserWeb>");
        c02.tryEmit(this.f394q);
        Q90.c cVar = this.f380c;
        cVar.m();
        Function1 function1 = new Function1() { // from class: A30.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m.a(m.this, (AppConfig) obj);
            }
        };
        cVar.l();
        Object v11 = cVar.v(function1, (kotlin.coroutines.jvm.internal.c) dVar);
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (v11 != aVar) {
            v11 = Unit.f71690a;
        }
        return v11 == aVar ? v11 : Unit.f71690a;
    }

    public final Object z(@NotNull WebView webView, @NotNull WebResourceRequest webResourceRequest, @NotNull WebResourceResponse webResourceResponse, @NotNull kotlin.coroutines.d<? super D30.c> dVar) {
        return this.f386i.reAuthOnWebViewReceivedHttpError(webView, webResourceRequest, webResourceResponse, dVar);
    }
}
