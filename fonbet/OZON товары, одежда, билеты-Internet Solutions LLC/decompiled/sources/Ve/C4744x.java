package Ve;

import Ae.C2399j;
import Ae.I0;
import B0.C2454a;
import W2.f;
import We.E;
import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;
import h3.C6788a;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import spay.sdk.api.ErrorCode;
import spay.sdk.api.SPaySdkInitConfig;
import spay.sdk.domain.model.AuthMethod;
import spay.sdk.domain.model.MerchantData;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.request.CreateBindingOtpRequestBody;
import spay.sdk.domain.model.request.PaymentTokenRequestBody;
import spay.sdk.domain.model.request.SdkAuthRequestBody;
import spay.sdk.domain.model.request.SessionIdRequestBody;
import spay.sdk.domain.model.response.SPaySdkConfig;
import spay.sdk.domain.model.response.SessionIdResponseBody;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;
import xe.C10720e0;
import xe.C10727i;

/* renamed from: Ve.x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4744x extends androidx.lifecycle.w0 implements InterfaceC4572qr {

    /* renamed from: A, reason: collision with root package name */
    public final O8 f32396A;

    /* renamed from: B, reason: collision with root package name */
    public final C4150c9 f32397B;

    /* renamed from: C, reason: collision with root package name */
    public final Nh f32398C;

    /* renamed from: D, reason: collision with root package name */
    public final Xi f32399D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f32400E;

    /* renamed from: F, reason: collision with root package name */
    public final Ae.x0 f32401F;

    /* renamed from: G, reason: collision with root package name */
    public final Ae.x0 f32402G;

    /* renamed from: H, reason: collision with root package name */
    public Hd f32403H;

    /* renamed from: I, reason: collision with root package name */
    public CountDownTimerC4352ja f32404I;

    /* renamed from: J, reason: collision with root package name */
    public long f32405J;

    /* renamed from: K, reason: collision with root package name */
    public final long f32406K;

    /* renamed from: L, reason: collision with root package name */
    public final C4390kj f32407L;

    /* renamed from: M, reason: collision with root package name */
    public final Ii f32408M;

    /* renamed from: N, reason: collision with root package name */
    public final Ae.M0 f32409N;

    /* renamed from: O, reason: collision with root package name */
    public final Ae.x0 f32410O;

    /* renamed from: P, reason: collision with root package name */
    public final Ae.x0 f32411P;

    /* renamed from: a, reason: collision with root package name */
    public final Ib f32412a;

    /* renamed from: b, reason: collision with root package name */
    public final Vm f32413b;

    /* renamed from: c, reason: collision with root package name */
    public final C4790yh f32414c;

    /* renamed from: d, reason: collision with root package name */
    public final C4183dd f32415d;

    /* renamed from: e, reason: collision with root package name */
    public final C4091a8 f32416e;

    /* renamed from: f, reason: collision with root package name */
    public final C4748x3 f32417f;

    /* renamed from: g, reason: collision with root package name */
    public final La f32418g;

    /* renamed from: h, reason: collision with root package name */
    public final Dk f32419h;

    /* renamed from: i, reason: collision with root package name */
    public final Up f32420i;

    /* renamed from: j, reason: collision with root package name */
    public final C4442md f32421j;

    /* renamed from: k, reason: collision with root package name */
    public final C4248fl f32422k;

    /* renamed from: l, reason: collision with root package name */
    public final C4776y3 f32423l;

    /* renamed from: m, reason: collision with root package name */
    public final Y9 f32424m;

    /* renamed from: n, reason: collision with root package name */
    public final C4646tf f32425n;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC4686uq f32426o;

    /* renamed from: p, reason: collision with root package name */
    public final Hi f32427p;

    /* renamed from: q, reason: collision with root package name */
    public final C4806z5 f32428q;

    /* renamed from: r, reason: collision with root package name */
    public final Te f32429r;

    /* renamed from: s, reason: collision with root package name */
    public final Be f32430s;

    /* renamed from: t, reason: collision with root package name */
    public final C4363jl f32431t;

    /* renamed from: u, reason: collision with root package name */
    public final Q f32432u;

    /* renamed from: v, reason: collision with root package name */
    public final C4186dg f32433v;

    /* renamed from: w, reason: collision with root package name */
    public final Bj f32434w;

    /* renamed from: x, reason: collision with root package name */
    public final Wh f32435x;

    /* renamed from: y, reason: collision with root package name */
    public final Zc f32436y;

    /* renamed from: z, reason: collision with root package name */
    public final C4177d7 f32437z;

    public C4744x(Ib sPayStorage, Vm sPayDataContract, C4790yh getSessionIdUseCase, C4183dd getPaymentTokenUseCase, C4091a8 getPaymentOrderUseCase, C4748x3 getPayOnlineUseCase, La checkDeviceUseCase, Dk getDeviceInfoUseCase, Up getIpAddressUseCase, C4442md orderScreenInteractor, C4248fl featuresHandler, C4776y3 bankAuthenticationContract, Y9 sPaySdkReducer, C4646tf getSdkAuthUseCase, InterfaceC4686uq authHandler, Hi paymentTokenFraudMonReviewUseCase, Vl sPaySdkConfigRepository, C4806z5 resourceManager, Te metricFacade, Be sslInteractor, C4363jl lazyNetworkModule, Q getLocalSessionIdUseCase, T8 sPaySdkMerchantOptionsRepository, C4186dg seamlessAuthFeature, Bj getBindingSessionIdUseCase, Wh getBindingMVP0SessionIdUseCase, Zc createBindingOtpUseCase, C4177d7 payBindingUseCase, O8 payBindingV2UseCase, C4150c9 checkBindingUseCase, Nh securePreferences, Xi appNameUtil) {
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(getSessionIdUseCase, "getSessionIdUseCase");
        Intrinsics.checkNotNullParameter(getPaymentTokenUseCase, "getPaymentTokenUseCase");
        Intrinsics.checkNotNullParameter(getPaymentOrderUseCase, "getPaymentOrderUseCase");
        Intrinsics.checkNotNullParameter(getPayOnlineUseCase, "getPayOnlineUseCase");
        Intrinsics.checkNotNullParameter(checkDeviceUseCase, "checkDeviceUseCase");
        Intrinsics.checkNotNullParameter(getDeviceInfoUseCase, "getDeviceInfoUseCase");
        Intrinsics.checkNotNullParameter(getIpAddressUseCase, "getIpAddressUseCase");
        Intrinsics.checkNotNullParameter(orderScreenInteractor, "orderScreenInteractor");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        Intrinsics.checkNotNullParameter(bankAuthenticationContract, "bankAuthenticationContract");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(getSdkAuthUseCase, "getSdkAuthUseCase");
        Intrinsics.checkNotNullParameter(authHandler, "authHandler");
        Intrinsics.checkNotNullParameter(paymentTokenFraudMonReviewUseCase, "paymentTokenFraudMonReviewUseCase");
        Intrinsics.checkNotNullParameter(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        Intrinsics.checkNotNullParameter(resourceManager, "resourceManager");
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sslInteractor, "sslInteractor");
        Intrinsics.checkNotNullParameter(lazyNetworkModule, "lazyNetworkModule");
        Intrinsics.checkNotNullParameter(getLocalSessionIdUseCase, "getLocalSessionIdUseCase");
        Intrinsics.checkNotNullParameter(sPaySdkMerchantOptionsRepository, "sPaySdkMerchantOptionsRepository");
        Intrinsics.checkNotNullParameter(seamlessAuthFeature, "seamlessAuthFeature");
        Intrinsics.checkNotNullParameter(getBindingSessionIdUseCase, "getBindingSessionIdUseCase");
        Intrinsics.checkNotNullParameter(getBindingMVP0SessionIdUseCase, "getBindingMVP0SessionIdUseCase");
        Intrinsics.checkNotNullParameter(createBindingOtpUseCase, "createBindingOtpUseCase");
        Intrinsics.checkNotNullParameter(payBindingUseCase, "payBindingUseCase");
        Intrinsics.checkNotNullParameter(payBindingV2UseCase, "payBindingV2UseCase");
        Intrinsics.checkNotNullParameter(checkBindingUseCase, "checkBindingUseCase");
        Intrinsics.checkNotNullParameter(securePreferences, "securePreferences");
        Intrinsics.checkNotNullParameter(appNameUtil, "appNameUtil");
        this.f32412a = sPayStorage;
        this.f32413b = sPayDataContract;
        this.f32414c = getSessionIdUseCase;
        this.f32415d = getPaymentTokenUseCase;
        this.f32416e = getPaymentOrderUseCase;
        this.f32417f = getPayOnlineUseCase;
        this.f32418g = checkDeviceUseCase;
        this.f32419h = getDeviceInfoUseCase;
        this.f32420i = getIpAddressUseCase;
        this.f32421j = orderScreenInteractor;
        this.f32422k = featuresHandler;
        this.f32423l = bankAuthenticationContract;
        this.f32424m = sPaySdkReducer;
        this.f32425n = getSdkAuthUseCase;
        this.f32426o = authHandler;
        this.f32427p = paymentTokenFraudMonReviewUseCase;
        this.f32428q = resourceManager;
        this.f32429r = metricFacade;
        this.f32430s = sslInteractor;
        this.f32431t = lazyNetworkModule;
        this.f32432u = getLocalSessionIdUseCase;
        this.f32433v = seamlessAuthFeature;
        this.f32434w = getBindingSessionIdUseCase;
        this.f32435x = getBindingMVP0SessionIdUseCase;
        this.f32436y = createBindingOtpUseCase;
        this.f32437z = payBindingUseCase;
        this.f32396A = payBindingV2UseCase;
        this.f32397B = checkBindingUseCase;
        this.f32398C = securePreferences;
        this.f32399D = appNameUtil;
        this.f32401F = Ae.O0.a(new L5(C4121b9.f30720a));
        this.f32402G = Ae.O0.a(new SessionIdResponseBody(null, null, null, null, null, null, null, null, null, null, null, 2047, null));
        this.f32405J = 30000L;
        this.f32406K = 1000L;
        this.f32407L = new C4390kj(this);
        this.f32408M = new Ii(this);
        Be.m D11 = C2399j.D(((C4673ud) sPayStorage).f32205b, new C4558qd());
        C6788a a11 = androidx.lifecycle.x0.a(this);
        int i11 = Ae.I0.f818a;
        this.f32409N = C2399j.M(D11, a11, I0.a.b(3), null);
        this.f32410O = Ae.O0.a(Boolean.FALSE);
        this.f32411P = Ae.O0.a(null);
        C6788a a12 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a12, He.b.f10879b, null, new C4354jc(null, this, sPaySdkConfigRepository, sPaySdkMerchantOptionsRepository), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00eb, code lost:
    
        if (r0.f(r2, He.b.f10879b, r3) != r4) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d0(C4744x c4744x, V8 v82, SdkAuthRequestBody.AuthMethod authMethod, kotlin.coroutines.jvm.internal.c cVar) {
        Vo vo;
        int i11;
        MerchantData m02;
        String sessionId;
        String str;
        String str2;
        String str3;
        SdkAuthRequestBody.AuthMethod authMethod2;
        String str4;
        C4646tf c4646tf;
        c4744x.getClass();
        if (cVar instanceof Vo) {
            vo = (Vo) cVar;
            int i12 = vo.f30224n;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                vo.f30224n = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = vo.f30222l;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = vo.f30224n;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    m02 = c4744x.m0();
                    String authorization = m02.getAuthorization();
                    String str5 = v82 != null ? v82.f30186d : null;
                    sessionId = ((SessionIdResponseBody) C2399j.b(c4744x.f32402G).getValue()).getSessionId();
                    str = v82 != null ? v82.f30184b : null;
                    vo.f30214d = authMethod;
                    vo.f30215e = m02;
                    vo.f30216f = str;
                    vo.f30217g = sessionId;
                    vo.f30218h = str5;
                    vo.f30219i = "spaysdk://payment";
                    vo.f30220j = authorization;
                    C4646tf c4646tf2 = c4744x.f32425n;
                    vo.f30221k = c4646tf2;
                    vo.f30224n = 1;
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    Object i13 = c4744x.f32419h.i(He.b.f10879b, vo);
                    if (i13 != aVar) {
                        str2 = str5;
                        str3 = "spaysdk://payment";
                        authMethod2 = authMethod;
                        str4 = authorization;
                        obj = i13;
                        c4646tf = c4646tf2;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                c4646tf = vo.f30221k;
                str4 = vo.f30220j;
                String str6 = vo.f30219i;
                String str7 = vo.f30218h;
                sessionId = vo.f30217g;
                str = vo.f30216f;
                m02 = vo.f30215e;
                authMethod2 = vo.f30214d;
                Sc.s.b(obj);
                str3 = str6;
                str2 = str7;
                Rf rf2 = new Rf(str4, new SdkAuthRequestBody(str3, str2, sessionId, str, (String) obj, m02.getOrderId(), m02.getMerchantLogin(), m02.getAppPackage(), authMethod2 == null ? authMethod2.getValue() : null));
                vo.f30214d = null;
                vo.f30215e = null;
                vo.f30216f = null;
                vo.f30217g = null;
                vo.f30218h = null;
                vo.f30219i = null;
                vo.f30220j = null;
                vo.f30221k = null;
                vo.f30224n = 2;
                C10720e0 c10720e02 = C10720e0.f105451a;
            }
        }
        vo = new Vo(c4744x, cVar);
        Object obj2 = vo.f30222l;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = vo.f30224n;
        if (i11 != 0) {
        }
        Rf rf22 = new Rf(str4, new SdkAuthRequestBody(str3, str2, sessionId, str, (String) obj2, m02.getOrderId(), m02.getMerchantLogin(), m02.getAppPackage(), authMethod2 == null ? authMethod2.getValue() : null));
        vo.f30214d = null;
        vo.f30215e = null;
        vo.f30216f = null;
        vo.f30217g = null;
        vo.f30218h = null;
        vo.f30219i = null;
        vo.f30220j = null;
        vo.f30221k = null;
        vo.f30224n = 2;
        C10720e0 c10720e022 = C10720e0.f105451a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bb, code lost:
    
        if (r12.f32415d.f(r13, He.b.f10879b, r0) != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bd, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
    
        if (r4 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e0(C4744x c4744x, ListOfCardsResponseBody.PaymentToolInfo.Tool tool, boolean z11, kotlin.coroutines.jvm.internal.c cVar) {
        C4769xo c4769xo;
        int i11;
        MerchantData m02;
        String authorization;
        String sessionId;
        Object i12;
        c4744x.getClass();
        if (cVar instanceof C4769xo) {
            c4769xo = (C4769xo) cVar;
            int i13 = c4769xo.f32510l;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4769xo.f32510l = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4769xo.f32508j;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4769xo.f32510l;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    m02 = c4744x.m0();
                    authorization = m02.getAuthorization();
                    sessionId = ((SessionIdResponseBody) C2399j.b(c4744x.f32402G).getValue()).getSessionId();
                    c4769xo.f32502d = c4744x;
                    c4769xo.f32503e = tool;
                    c4769xo.f32504f = m02;
                    c4769xo.f32505g = sessionId;
                    c4769xo.f32506h = authorization;
                    c4769xo.f32507i = z11;
                    c4769xo.f32510l = 1;
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    i12 = c4744x.f32419h.i(He.b.f10879b, c4769xo);
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                        return Unit.f71690a;
                    }
                    z11 = c4769xo.f32507i;
                    String str = c4769xo.f32506h;
                    String str2 = c4769xo.f32505g;
                    m02 = c4769xo.f32504f;
                    ListOfCardsResponseBody.PaymentToolInfo.Tool tool2 = c4769xo.f32503e;
                    C4744x c4744x2 = c4769xo.f32502d;
                    Sc.s.b(obj);
                    authorization = str;
                    c4744x = c4744x2;
                    sessionId = str2;
                    tool = tool2;
                    i12 = obj;
                }
                Hd hd2 = new Hd(authorization, new PaymentTokenRequestBody(sessionId, (String) i12, tool.getPaymentId(), m02.getMerchantLogin(), m02.getOrderId(), z11, ((C4654tn) c4744x.f32413b).f32147p));
                c4744x.f32403H = hd2;
                c4769xo.f32502d = null;
                c4769xo.f32503e = null;
                c4769xo.f32504f = null;
                c4769xo.f32505g = null;
                c4769xo.f32506h = null;
                c4769xo.f32510l = 2;
                C10720e0 c10720e02 = C10720e0.f105451a;
            }
        }
        c4769xo = new C4769xo(c4744x, cVar);
        Object obj2 = c4769xo.f32508j;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4769xo.f32510l;
        if (i11 != 0) {
        }
        Hd hd22 = new Hd(authorization, new PaymentTokenRequestBody(sessionId, (String) i12, tool.getPaymentId(), m02.getMerchantLogin(), m02.getOrderId(), z11, ((C4654tn) c4744x.f32413b).f32147p));
        c4744x.f32403H = hd22;
        c4769xo.f32502d = null;
        c4769xo.f32503e = null;
        c4769xo.f32504f = null;
        c4769xo.f32505g = null;
        c4769xo.f32506h = null;
        c4769xo.f32510l = 2;
        C10720e0 c10720e022 = C10720e0.f105451a;
    }

    @Override // Ve.InterfaceC4572qr
    public final Function1 a() {
        return this.f32407L;
    }

    @Override // Ve.InterfaceC4572qr
    public final Function0 b() {
        return this.f32408M;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0092, code lost:
    
        if (r0 == r8) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0444, code lost:
    
        if (r0 == r8) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0454, code lost:
    
        if (h0(r0, r7) == r8) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x047d, code lost:
    
        if (r0 == r8) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x052a, code lost:
    
        if (j0(r7) == r8) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x03aa, code lost:
    
        if (r0 == r8) goto L192;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Type inference failed for: r14v7, types: [Ve.Si, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f0(Fh fh2, Vl vl, T8 t82, kotlin.coroutines.d dVar) {
        C4158ch c4158ch;
        T8 t83;
        C4744x c4744x;
        final Ti ti2;
        Unit unit;
        We.E e11;
        C4744x c4744x2;
        MerchantData merchantData;
        Object f7;
        Vl vl2 = vl;
        if (dVar instanceof C4158ch) {
            c4158ch = (C4158ch) dVar;
            int i11 = c4158ch.f30809i;
            if ((i11 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4158ch.f30809i = i11 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4158ch.f30807g;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                switch (c4158ch.f30809i) {
                    case 0:
                        Sc.s.b(obj);
                        AbstractC4245fi abstractC4245fi = fh2.f29004a;
                        if (abstractC4245fi instanceof Lk) {
                            Lm0.a.f17149a.i("DEVICE CHECKED", new Object[0]);
                            c4158ch.f30809i = 1;
                            Object f11 = C10727i.f(xe.X0.b(), new Tn(vl2, this, null), c4158ch);
                            if (f11 != obj2) {
                                f11 = Unit.f71690a;
                                break;
                            }
                        } else if (abstractC4245fi instanceof F7) {
                            Lm0.a.f17149a.i("SPAY CONFIG : ", new Object[0]);
                            c4158ch.f30804d = this;
                            c4158ch.f30805e = vl2;
                            c4158ch.f30806f = t82;
                            c4158ch.f30809i = 2;
                            Object f12 = C10727i.f(C10720e0.a(), new spay.sdk.a(null, this, vl2, t82), c4158ch);
                            if (f12 != obj2) {
                                f12 = Unit.f71690a;
                            }
                            if (f12 != obj2) {
                                t83 = t82;
                                c4744x = this;
                                Be be2 = c4744x.f32430s;
                                ti2 = !(be2 instanceof Ti) ? (Ti) be2 : null;
                                if (ti2 == null) {
                                    String defaultType = KeyStore.getDefaultType();
                                    Intrinsics.checkNotNullExpressionValue(defaultType, "getDefaultType()");
                                    KeyStore keyStore = KeyStore.getInstance(defaultType);
                                    keyStore.load(null, null);
                                    Intrinsics.checkNotNullExpressionValue(keyStore, "keyStore");
                                    Intrinsics.checkNotNullParameter(keyStore, "<set-?>");
                                    TrustManager[] trustManagerArr = {new C4620si()};
                                    ti2.f30056c = trustManagerArr;
                                    TrustManager trustManager = trustManagerArr[0];
                                    Intrinsics.g(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                                    X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                                    Intrinsics.checkNotNullParameter(x509TrustManager, "<set-?>");
                                    ti2.f30057d = x509TrustManager;
                                    SSLContext sslContext = SSLContext.getInstance("TLS");
                                    TrustManager[] trustManagerArr2 = ti2.f30056c;
                                    if (trustManagerArr2 == null) {
                                        Intrinsics.n("trustManages");
                                        throw null;
                                    }
                                    sslContext.init(null, trustManagerArr2, null);
                                    Intrinsics.checkNotNullExpressionValue(sslContext, "sslContext");
                                    Intrinsics.checkNotNullParameter(sslContext, "<set-?>");
                                    ti2.f30055b = sslContext;
                                    final ArrayList t2 = C7714v.t(C4515p.a("IyN8cAklNG04Lmk5Cjs7HzYjIWkWKDADfjs0CAwbfR5zF0BA"), C4515p.a("IyNlFCM7ND41IyUSLC40C387NBg1Iz0gLC8udDQ7LQcADTdpcxRAQA=="), C4515p.a("IyN8Ei8BKnQaASgHABskFi8BNHQaOTJ4aiM4ERYXa3A0Oy0HAA03aXMUQEA="), C4515p.a("IyNlFCM7NAAAJT4aci5odBoCNSEAGDoWLwEgFAo8KSk1DT0WCS5AQA=="), C4515p.a("IyNlFCM7NAAAJT4aci5odBoCNSEAGDoWLwEgFAo8KSk1DX0CFixAQA=="), C4515p.a("IyNwZRApIXQ0OTQLNRg0DiwUInQeAjQhHyM4YSwBaAcKPDt4GyU3DgYpQEA="), C4515p.a("IyNwDS8uLTIgOikHNSIhEnMuLRB+Oy0fACM7FhYXQEA="), C4515p.a("IyNlFCM7NAAAJT4aci5odBoCNSEAGDoWLwEhFAo8KSk1DX0CFixAQA=="), C4515p.a("IyNlFCM7NCYPIyU0CSkiBwo5KyEfJSUgBi5AQA=="), C4515p.a("IyN8Ei8BKnQaASgHABskFi8BNHQaOTJ4aiN9FhkXaHQeOikbNSJ9FnIsMi0KOisPACN9AhYsQEA="), C4515p.a("IyNwZRApIXQ0OTQLNRg0DiwUInQeAjQhHyM4YQYpIhcKPDR9DxghEgkpIjV/ATE1ahg9FgkuQEA="), C4515p.a("IyNpCyMUM3gPGCQSGRcxDyMUNQsPGzQKci4qDxo5MgM1DX0wGRdAQA=="), C4515p.a("IyN8GDYiOBEZFzEPIxRxFw8gOQkWLEBA"), C4515p.a("IyN8GDYiOBEZFzEPIxQxAxAiOQkWLEBA"), C4515p.a("IyNwZRApIXQkOy0HaiI4CRYsQEA="), C4515p.a("IyNwZRApIXQ0OzEpNQw4MwYuMHQePXV0NSI6aTguLi1/ATh8MSIhAnIvIg9+OjgDDw0hICwUQEA="));
                                    SPaySdkConfig sPaySdkConfig = ((C4712vn) ti2.f30054a).f32313c;
                                    if (sPaySdkConfig == null) {
                                        throw C4317i3.f31235a;
                                    }
                                    final ArrayList<String> sslPins = sPaySdkConfig.getSslPins();
                                    if (sslPins == null) {
                                        sslPins = new ArrayList<>();
                                    }
                                    ?? r14 = new HostnameVerifier() { // from class: Ve.Si
                                        @Override // javax.net.ssl.HostnameVerifier
                                        public final boolean verify(String str, SSLSession sSLSession) {
                                            ArrayList trustedHostsList = t2;
                                            Intrinsics.checkNotNullParameter(trustedHostsList, "$trustedHostsList");
                                            Ti this$0 = ti2;
                                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                                            ArrayList trustedPins = sslPins;
                                            Intrinsics.checkNotNullParameter(trustedPins, "$trustedPins");
                                            if (trustedHostsList.contains(str)) {
                                                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                                                Intrinsics.checkNotNullExpressionValue(peerCertificates, "session.peerCertificates");
                                                for (Certificate certificate : peerCertificates) {
                                                    Intrinsics.g(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                                    this$0.getClass();
                                                    if (trustedPins.contains(Lf.a.l0((X509Certificate) certificate))) {
                                                        return true;
                                                    }
                                                }
                                            }
                                            return false;
                                        }
                                    };
                                    Intrinsics.checkNotNullParameter(r14, "<set-?>");
                                    ti2.f30058e = r14;
                                    unit = Unit.f71690a;
                                } else {
                                    unit = null;
                                }
                                if (unit != null) {
                                    throw new IllegalStateException("Illegal sslInteractor state");
                                }
                                C4363jl c4363jl = c4744x.f32431t;
                                boolean r02 = Lf.a.r0(c4363jl.f31377c, EnumC4290h5.SSL, null);
                                E.a aVar = c4363jl.f31376b;
                                if (r02) {
                                    Be be3 = c4363jl.f31375a;
                                    SSLSocketFactory socketFactory = be3.b().getSocketFactory();
                                    Intrinsics.checkNotNullExpressionValue(socketFactory, "sslInteractor.customSSLContext.socketFactory");
                                    aVar.a0(socketFactory, be3.a());
                                    aVar.R(be3.c());
                                    e11 = new We.E(aVar);
                                } else {
                                    aVar.getClass();
                                    e11 = new We.E(aVar);
                                }
                                c4363jl.f31380f = e11;
                                Retrofit.Builder baseUrl = new Retrofit.Builder().baseUrl(He.g.b());
                                We.E e12 = c4363jl.f31380f;
                                if (e12 == null) {
                                    Intrinsics.n("okHttpClient");
                                    throw null;
                                }
                                Retrofit build = baseUrl.client(e12).addConverterFactory(GsonConverterFactory.create()).build();
                                Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .b…e())\n            .build()");
                                Object create = build.create(npi.spay.fk.class);
                                Intrinsics.checkNotNullExpressionValue(create, "provideSPayApiRetrofit()…tFlowSPayApi::class.java)");
                                npi.spay.fk fkVar = (npi.spay.fk) create;
                                Intrinsics.checkNotNullParameter(fkVar, "<set-?>");
                                c4363jl.f31378d = fkVar;
                                Retrofit.Builder baseUrl2 = new Retrofit.Builder().baseUrl(He.g.b());
                                We.E e13 = c4363jl.f31380f;
                                if (e13 == null) {
                                    Intrinsics.n("okHttpClient");
                                    throw null;
                                }
                                Retrofit build2 = baseUrl2.client(e13).addConverterFactory(Sf.f29975a).build();
                                Intrinsics.checkNotNullExpressionValue(build2, "Builder()\n            .b…ory)\n            .build()");
                                Object create2 = build2.create(npi.spay.ij.class);
                                Intrinsics.checkNotNullExpressionValue(create2, "providePageTitleRetrofit…PageTitleApi::class.java)");
                                npi.spay.ij ijVar = (npi.spay.ij) create2;
                                Intrinsics.checkNotNullParameter(ijVar, "<set-?>");
                                c4363jl.f31379e = ijVar;
                                We.E okHttpClient = c4363jl.f31380f;
                                if (okHttpClient == null) {
                                    Intrinsics.n("okHttpClient");
                                    throw null;
                                }
                                Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
                                Vg vg2 = new Vg(new C4130bi(okHttpClient));
                                Intrinsics.checkNotNullParameter(vg2, "<set-?>");
                                SPaySdkConfig sPaySdkConfig2 = ((C4712vn) vl2).f32313c;
                                if (sPaySdkConfig2 == null) {
                                    throw C4317i3.f31235a;
                                }
                                c4158ch.f30804d = c4744x;
                                c4158ch.f30805e = t83;
                                c4158ch.f30806f = null;
                                c4158ch.f30809i = 3;
                                if (c4744x.f32429r.a(sPaySdkConfig2, vg2, c4158ch) != obj2) {
                                    c4744x2 = c4744x;
                                    merchantData = ((C4654tn) c4744x2.f32413b).f32130G;
                                    if (merchantData != null) {
                                        throw L3.f29386a;
                                    }
                                    String appPackage = merchantData.getAppPackage();
                                    Ld ld2 = Ld.SDK_VERSION;
                                    Ur ur = Ur.MERCHANT_VIEW;
                                    Pe pe2 = Pe.NONE;
                                    String a11 = c4744x2.f32399D.a(appPackage);
                                    if (a11 == null) {
                                        a11 = "";
                                    }
                                    Bi bi = new Bi(ld2, ur, pe2, C2454a.b("AppName", a11), null, null, null, 112);
                                    Te te2 = c4744x2.f32429r;
                                    te2.b(bi);
                                    SPaySdkInitConfig sPaySdkInitConfig = ((C4726w9) t83).f32350a;
                                    if (sPaySdkInitConfig == null) {
                                        throw C4549q4.f31841a;
                                    }
                                    te2.b(new Bi(EnumC4464n6.MA_INIT, null, Pe.MA, kotlin.collections.U.j(new Pair("Environment", sPaySdkInitConfig.getStage().toString()), new Pair("BNPL", String.valueOf(sPaySdkInitConfig.getEnableBnpl()))), null, null, null, 114));
                                    c4158ch.f30804d = null;
                                    c4158ch.f30805e = null;
                                    c4158ch.f30809i = 4;
                                    C4654tn c4654tn = (C4654tn) c4744x2.f32413b;
                                    PayStrategy j11 = c4654tn.j();
                                    if (!(j11 instanceof PayStrategy.PayWithBinding)) {
                                        MerchantData m02 = c4744x2.m0();
                                        PayStrategy j12 = c4654tn.j();
                                        PayStrategy.PayOnline payOnline = j12 instanceof PayStrategy.PayOnline ? (PayStrategy.PayOnline) j12 : null;
                                        Yh yh2 = new Yh(m02.getAuthorization(), new SessionIdRequestBody("spaysdk://payment", m02.getMerchantLogin(), m02.getOrderId(), payOnline != null ? payOnline.getBindingId() : null));
                                        C10720e0 c10720e0 = C10720e0.f105451a;
                                        f7 = c4744x2.f32414c.f(yh2, He.b.f10879b, c4158ch);
                                        if (f7 != obj2) {
                                            f7 = Unit.f71690a;
                                        }
                                        if (f7 != obj2) {
                                            f7 = Unit.f71690a;
                                            break;
                                        }
                                    } else {
                                        PayStrategy.PayWithBinding payWithBinding = (PayStrategy.PayWithBinding) j11;
                                        String bindingId = payWithBinding.getBindingId();
                                        int i12 = Lc.f29404a[payWithBinding.getVersion().ordinal()];
                                        if (i12 == 1) {
                                            Al al = new Al(c4744x2.m0().getOrderId(), bindingId);
                                            C10720e0 c10720e02 = C10720e0.f105451a;
                                            f7 = c4744x2.f32434w.f(al, He.b.f10879b, c4158ch);
                                            if (f7 != obj2) {
                                                f7 = Unit.f71690a;
                                            }
                                        } else if (i12 != 2) {
                                            f7 = Unit.f71690a;
                                        } else {
                                            Al al2 = new Al(c4744x2.m0().getOrderId(), bindingId);
                                            C10720e0 c10720e03 = C10720e0.f105451a;
                                            f7 = c4744x2.f32435x.f(al2, He.b.f10879b, c4158ch);
                                            if (f7 != obj2) {
                                                f7 = Unit.f71690a;
                                            }
                                        }
                                        if (f7 != obj2) {
                                            f7 = Unit.f71690a;
                                            break;
                                        }
                                    }
                                }
                            }
                        } else {
                            boolean z11 = abstractC4245fi instanceof N8;
                            Zc zc2 = this.f32436y;
                            if (z11) {
                                Lm0.a.f17149a.i("SESSION ID RESPONSE : " + ((N8) abstractC4245fi).f29532a, new Object[0]);
                                Ae.x0 x0Var = this.f32402G;
                                N8 n82 = (N8) fh2.f29004a;
                                x0Var.setValue(n82.f29532a);
                                Qc qc2 = this.f32422k.f31047a;
                                if (qc2 != null && !((Boolean) qc2.b(Ea.f28917a)).booleanValue()) {
                                    ((C4238fb) this.f32424m).b(S8.f29949a);
                                    return Unit.f71690a;
                                }
                                if (!(((C4654tn) this.f32413b).j() instanceof PayStrategy.PayWithBinding)) {
                                    SessionIdResponseBody sessionIdResponseBody = n82.f29532a;
                                    c4158ch.f30809i = 6;
                                    break;
                                } else {
                                    String sessionId = n82.f29532a.getSessionId();
                                    c4158ch.f30809i = 5;
                                    Cd cd2 = new Cd(new CreateBindingOtpRequestBody(sessionId), false);
                                    C10720e0 c10720e04 = C10720e0.f105451a;
                                    Object f13 = zc2.f(cd2, He.b.f10879b, c4158ch);
                                    if (f13 != obj2) {
                                        f13 = Unit.f71690a;
                                        break;
                                    }
                                }
                            } else {
                                if (!(abstractC4245fi instanceof Ye)) {
                                    if (abstractC4245fi instanceof Wf) {
                                        Wf wf2 = (Wf) abstractC4245fi;
                                        V8 v82 = wf2.f30272a;
                                        C6788a a12 = androidx.lifecycle.x0.a(this);
                                        C10720e0 c10720e05 = C10720e0.f105451a;
                                        C10727i.c(a12, He.b.f10879b, null, new Zf(this, v82, wf2.f30273b, null), 2);
                                    } else if (abstractC4245fi instanceof C4379k8) {
                                        Boolean isOtpNeed = ((C4379k8) abstractC4245fi).f31427a.isOtpNeed();
                                        ((Yq) this.f32426o).f30524e = isOtpNeed != null ? isOtpNeed.booleanValue() : false;
                                        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new C4759xe(this, null), 3);
                                    } else if (abstractC4245fi instanceof C4459n1) {
                                        C4459n1 c4459n1 = (C4459n1) abstractC4245fi;
                                        ListOfCardsResponseBody.PaymentToolInfo.Tool tool = c4459n1.f31619a;
                                        if (tool != null) {
                                            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new Bf(this, tool, c4459n1.f31620b, null), 3);
                                        }
                                    } else if (abstractC4245fi instanceof I0) {
                                        I0 i02 = (I0) abstractC4245fi;
                                        ListOfCardsResponseBody.PaymentToolInfo.Tool tool2 = i02.f29196a;
                                        if (tool2 != null) {
                                            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new C4127bf(this, tool2, i02.f29198c, i02.f29197b, null), 3);
                                        }
                                    } else if (abstractC4245fi instanceof C4807z6) {
                                        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new C4478nk(this, null), 3);
                                    } else if (abstractC4245fi instanceof C4275gj) {
                                        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new Ud(this, null), 3);
                                    } else if (abstractC4245fi instanceof P4) {
                                        c4158ch.f30809i = 8;
                                        break;
                                    } else if (abstractC4245fi instanceof C4100ah) {
                                        this.f32401F.setValue(new L5(C4358jg.f31368a));
                                    } else if (abstractC4245fi instanceof C4694v5) {
                                        M1.b bVar = ((C4694v5) abstractC4245fi).f32258a;
                                        if (bVar instanceof C4594rl) {
                                            String paymentToken = ((C4594rl) bVar).f31983a.getPaymentToken();
                                            Intrinsics.checkNotNullParameter(paymentToken, "paymentToken");
                                            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new Pk(this, paymentToken, null), 3);
                                        }
                                    }
                                    return Unit.f71690a;
                                }
                                String str = ((Ye) abstractC4245fi).f30458a;
                                c4158ch.f30809i = 7;
                                Cd cd3 = new Cd(new CreateBindingOtpRequestBody(str), false);
                                C10720e0 c10720e06 = C10720e0.f105451a;
                                Object f14 = zc2.f(cd3, He.b.f10879b, c4158ch);
                                if (f14 != obj2) {
                                    f14 = Unit.f71690a;
                                    break;
                                }
                            }
                        }
                        return obj2;
                    case 1:
                        Sc.s.b(obj);
                        return Unit.f71690a;
                    case 2:
                        t83 = c4158ch.f30806f;
                        vl2 = (Vl) c4158ch.f30805e;
                        c4744x = c4158ch.f30804d;
                        Sc.s.b(obj);
                        Be be22 = c4744x.f32430s;
                        if (!(be22 instanceof Ti)) {
                        }
                        if (ti2 == null) {
                        }
                        if (unit != null) {
                        }
                        break;
                    case 3:
                        t83 = (T8) c4158ch.f30805e;
                        c4744x2 = c4158ch.f30804d;
                        Sc.s.b(obj);
                        merchantData = ((C4654tn) c4744x2.f32413b).f32130G;
                        if (merchantData != null) {
                        }
                        break;
                    case 4:
                        Sc.s.b(obj);
                        return Unit.f71690a;
                    case 5:
                        Sc.s.b(obj);
                        return Unit.f71690a;
                    case 6:
                        Sc.s.b(obj);
                        return Unit.f71690a;
                    case 7:
                        Sc.s.b(obj);
                        return Unit.f71690a;
                    case 8:
                        Sc.s.b(obj);
                        return Unit.f71690a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        c4158ch = new C4158ch(this, dVar);
        Object obj3 = c4158ch.f30807g;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        switch (c4158ch.f30809i) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        if (((java.lang.Boolean) r6).booleanValue() == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g0(kotlin.coroutines.jvm.internal.c cVar) {
        C4303hi c4303hi;
        int i11;
        if (cVar instanceof C4303hi) {
            c4303hi = (C4303hi) cVar;
            int i12 = c4303hi.f31198f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4303hi.f31198f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4303hi.f31196d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4303hi.f31198f;
                boolean z11 = true;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (((C4654tn) this.f32413b).j() instanceof AuthMethod.ByAuthToken) {
                        if (Lf.a.r0(this.f32422k, EnumC4290h5.SEAMLESS_AUTHORIZATION, null)) {
                            c4303hi.f31198f = 1;
                            obj = this.f32433v.a(c4303hi);
                            if (obj == aVar) {
                                return aVar;
                            }
                        }
                    }
                    z11 = false;
                    return Boolean.valueOf(z11);
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
        }
        c4303hi = new C4303hi(this, cVar);
        Object obj2 = c4303hi.f31196d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4303hi.f31198f;
        boolean z112 = true;
        if (i11 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ee, code lost:
    
        if (r4.l0(r2, r0) == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h0(SessionIdResponseBody sessionIdResponseBody, kotlin.coroutines.jvm.internal.c cVar) {
        Ag ag2;
        Wc.a aVar;
        int i11;
        C4744x c4744x;
        Object g02;
        SessionIdResponseBody sessionIdResponseBody2;
        boolean z11;
        C4744x c4744x2;
        boolean z12;
        int i12;
        if (cVar instanceof Ag) {
            ag2 = (Ag) cVar;
            int i13 = ag2.f28613i;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                ag2.f28613i = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = ag2.f28611g;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = ag2.f28613i;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    ag2.f28608d = this;
                    ag2.f28609e = sessionIdResponseBody;
                    ag2.f28613i = 1;
                    obj = k0(sessionIdResponseBody, ag2);
                    if (obj != aVar) {
                        c4744x = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                        return Unit.f71690a;
                    }
                    z11 = ag2.f28610f;
                    sessionIdResponseBody2 = ag2.f28609e;
                    c4744x2 = ag2.f28608d;
                    Sc.s.b(obj);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    boolean z13 = ((C4654tn) c4744x2.f32413b).j() instanceof AuthMethod.ByMobileApp;
                    z12 = false;
                    C4248fl c4248fl = c4744x2.f32422k;
                    boolean z14 = !z13 && Lf.a.r0(c4248fl, EnumC4290h5.APP_AUTH, null) && c4744x2.f32400E;
                    if ((((C4654tn) c4744x2.f32413b).j() instanceof AuthMethod.ByPhoneNumber) && Lf.a.r0(c4248fl, EnumC4290h5.PHONE_NUMBER_AUTH, null) && Wk.f30290b != 6) {
                        z12 = true;
                    }
                    i12 = Wk.f30290b;
                    if (i12 == 6 || (i12 == 7 && z14)) {
                        c4744x2.n0();
                    } else {
                        Y9 y92 = c4744x2.f32424m;
                        if (!z11) {
                            Eq block = new Eq(c4744x2);
                            Intrinsics.checkNotNullParameter(block, "block");
                            ((Yq) c4744x2.f32426o).f30522c = true;
                            ((C4238fb) y92).b(new Dg());
                        } else if (booleanValue) {
                            ag2.f28608d = null;
                            ag2.f28609e = null;
                            ag2.f28613i = 3;
                        } else if (z14) {
                            c4744x2.n0();
                        } else if (z12) {
                            EnumC4801z0 enumC4801z0 = EnumC4801z0.f32615a;
                            C4661u1 block2 = new C4661u1(c4744x2, 1);
                            Intrinsics.checkNotNullParameter(block2, "block");
                            ((C4238fb) y92).b(new C4644td(enumC4801z0));
                        } else {
                            ((C4238fb) y92).b(new O0(new Sm("Нет доступных способов авторизации")));
                        }
                    }
                    return Unit.f71690a;
                }
                sessionIdResponseBody = ag2.f28609e;
                c4744x = ag2.f28608d;
                Sc.s.b(obj);
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                ag2.f28608d = c4744x;
                ag2.f28609e = sessionIdResponseBody;
                ag2.f28610f = booleanValue2;
                ag2.f28613i = 2;
                g02 = c4744x.g0(ag2);
                if (g02 != aVar) {
                    C4744x c4744x3 = c4744x;
                    sessionIdResponseBody2 = sessionIdResponseBody;
                    z11 = booleanValue2;
                    obj = g02;
                    c4744x2 = c4744x3;
                    boolean booleanValue3 = ((Boolean) obj).booleanValue();
                    boolean z132 = ((C4654tn) c4744x2.f32413b).j() instanceof AuthMethod.ByMobileApp;
                    z12 = false;
                    C4248fl c4248fl2 = c4744x2.f32422k;
                    if (z132) {
                    }
                    if (((C4654tn) c4744x2.f32413b).j() instanceof AuthMethod.ByPhoneNumber) {
                        z12 = true;
                    }
                    i12 = Wk.f30290b;
                    if (i12 == 6) {
                        Y9 y922 = c4744x2.f32424m;
                        if (!z11) {
                        }
                        return Unit.f71690a;
                    }
                    c4744x2.n0();
                    return Unit.f71690a;
                }
                return aVar;
            }
        }
        ag2 = new Ag(this, cVar);
        Object obj2 = ag2.f28611g;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = ag2.f28613i;
        if (i11 != 0) {
        }
        boolean booleanValue22 = ((Boolean) obj2).booleanValue();
        ag2.f28608d = c4744x;
        ag2.f28609e = sessionIdResponseBody;
        ag2.f28610f = booleanValue22;
        ag2.f28613i = 2;
        g02 = c4744x.g0(ag2);
        if (g02 != aVar) {
        }
        return aVar;
    }

    public final void i0(Uri url) {
        Intrinsics.checkNotNullParameter(url, "url");
        CountDownTimerC4352ja countDownTimerC4352ja = this.f32404I;
        if (countDownTimerC4352ja != null) {
            countDownTimerC4352ja.cancel();
        }
        String queryParameter = url.getQueryParameter("state");
        String queryParameter2 = url.getQueryParameter("code");
        V8 v82 = new V8(Boolean.TRUE, queryParameter, null, queryParameter2, 52);
        if (queryParameter == null || queryParameter.length() == 0 || queryParameter2 == null || queryParameter2.length() == 0) {
            n0();
        } else {
            ((C4238fb) this.f32424m).b(new Dg(v82, SdkAuthRequestBody.AuthMethod.SBAPP));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j0(kotlin.coroutines.jvm.internal.c cVar) {
        C4652tl c4652tl;
        int i11;
        C4744x c4744x;
        if (cVar instanceof C4652tl) {
            c4652tl = (C4652tl) cVar;
            int i12 = c4652tl.f32122g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4652tl.f32122g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4652tl.f32120e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4652tl.f32122g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    Hd hd2 = this.f32403H;
                    if (hd2 != null) {
                        PaymentTokenRequestBody paymentTokenRequestBody = PaymentTokenRequestBody.copy$default(hd2.f29150b, null, null, 0, null, null, false, ((C4654tn) this.f32413b).f32147p, 63, null);
                        String authorization = hd2.f29149a;
                        Intrinsics.checkNotNullParameter(authorization, "authorization");
                        Intrinsics.checkNotNullParameter(paymentTokenRequestBody, "paymentTokenRequestBody");
                        c4652tl.f32119d = this;
                        c4652tl.f32122g = 1;
                        C10720e0 c10720e0 = C10720e0.f105451a;
                        He.b bVar = He.b.f10879b;
                        Hi hi2 = this.f32427p;
                        hi2.getClass();
                        Object q11 = ((C4710vl) hi2.f29162a).q(paymentTokenRequestBody, c4652tl);
                        if (q11 != aVar) {
                            q11 = Unit.f71690a;
                        }
                        if (q11 == aVar) {
                            return aVar;
                        }
                    }
                    c4744x = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4744x = c4652tl.f32119d;
                    Sc.s.b(obj);
                }
                ((C4238fb) c4744x.f32424m).b(C4825zo.f32678a);
                return Unit.f71690a;
            }
        }
        c4652tl = new C4652tl(this, cVar);
        Object obj2 = c4652tl.f32120e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4652tl.f32122g;
        if (i11 != 0) {
        }
        ((C4238fb) c4744x.f32424m).b(C4825zo.f32678a);
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0099, code lost:
    
        if (((java.lang.Boolean) r8).booleanValue() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k0(SessionIdResponseBody sessionIdResponseBody, kotlin.coroutines.jvm.internal.c cVar) {
        Ih ih2;
        Object obj;
        int i11;
        C4744x c4744x;
        if (cVar instanceof Ih) {
            ih2 = (Ih) cVar;
            int i12 = ih2.f29237g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                ih2.f29237g = i12 - LinearLayoutManager.INVALID_OFFSET;
                obj = ih2.f29235e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = ih2.f29237g;
                boolean z11 = true;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if ((((C4654tn) this.f32413b).j() instanceof AuthMethod.ByRefreshToken) && Lf.a.r0(this.f32422k, EnumC4290h5.REFRESH_TOKEN, null) && Intrinsics.d(sessionIdResponseBody.getRefreshTokenIsActive(), Boolean.TRUE)) {
                        Nh.f29559a.getClass();
                        f.a aVar2 = C4302hh.f31194b;
                        ih2.f29234d = this;
                        ih2.f29237g = 1;
                        obj = ((C4593rk) this.f32398C).a(aVar2, ih2);
                        if (obj != aVar) {
                            c4744x = this;
                        }
                        return aVar;
                    }
                    z11 = false;
                    return Boolean.valueOf(z11);
                }
                if (i11 == 1) {
                    c4744x = ih2.f29234d;
                    Sc.s.b(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    Nh nh2 = c4744x.f32398C;
                    Nh.f29559a.getClass();
                    f.a aVar3 = C4302hh.f31195c;
                    ih2.f29234d = null;
                    ih2.f29237g = 2;
                    obj = ((C4593rk) nh2).a(aVar3, ih2);
                }
                z11 = false;
                return Boolean.valueOf(z11);
            }
        }
        ih2 = new Ih(this, cVar);
        obj = ih2.f29235e;
        Wc.a aVar4 = Wc.a.COROUTINE_SUSPENDED;
        i11 = ih2.f29237g;
        boolean z112 = true;
        if (i11 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        z112 = false;
        return Boolean.valueOf(z112);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l0(SessionIdResponseBody sessionIdResponseBody, kotlin.coroutines.jvm.internal.c cVar) {
        C4340ir c4340ir;
        int i11;
        C4744x c4744x;
        SessionIdResponseBody l11;
        String deeplink;
        String q11;
        Uri sessionIdDeeplink;
        String a11;
        String str;
        if (cVar instanceof C4340ir) {
            c4340ir = (C4340ir) cVar;
            int i12 = c4340ir.f31327g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4340ir.f31327g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4340ir.f31325e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4340ir.f31327g;
                String str2 = null;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    Lr block = new Lr(this);
                    Intrinsics.checkNotNullParameter(block, "block");
                    String clientId = sessionIdResponseBody.getClientId();
                    c4340ir.f31324d = this;
                    c4340ir.f31327g = 1;
                    C4588rf c4588rf = this.f32433v.f30879a;
                    if (c4588rf == null) {
                        Intrinsics.n("getApp2SdkTokenUseCase");
                        throw null;
                    }
                    obj = c4588rf.a(clientId, "spaysdk://payment", c4340ir);
                    if (obj == aVar) {
                        return aVar;
                    }
                    c4744x = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4744x = c4340ir.f31324d;
                    Sc.s.b(obj);
                }
                A8 a82 = (A8) obj;
                l11 = ((C4654tn) c4744x.f32413b).l();
                if (l11 != null && (deeplink = l11.getDeeplink()) != null && (q11 = M1.b.q(deeplink)) != null) {
                    sessionIdDeeplink = Uri.parse(q11);
                    Intrinsics.checkNotNullExpressionValue(sessionIdDeeplink, "parse(this)");
                    if (sessionIdDeeplink != null) {
                        MerchantData merchantData = ((C4654tn) c4744x.f32413b).f32130G;
                        if (merchantData == null) {
                            throw L3.f29386a;
                        }
                        String appPackage = merchantData.getAppPackage();
                        c4744x.f32433v.getClass();
                        Intrinsics.checkNotNullParameter(sessionIdDeeplink, "sessionIdDeeplink");
                        if (a82 != null && (str = a82.f28587a) != null) {
                            Uri parse = Uri.parse(str);
                            Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
                            if (parse != null) {
                                str2 = parse.getQueryParameter("token");
                            }
                        }
                        String queryParameter = sessionIdDeeplink.getQueryParameter("client_id");
                        if (queryParameter == null) {
                            queryParameter = ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE;
                        }
                        String queryParameter2 = sessionIdDeeplink.getQueryParameter("scope");
                        if (queryParameter2 == null) {
                            queryParameter2 = ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE;
                        }
                        String queryParameter3 = sessionIdDeeplink.getQueryParameter("state");
                        if (queryParameter3 == null) {
                            queryParameter3 = ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE;
                        }
                        String queryParameter4 = sessionIdDeeplink.getQueryParameter("nonce");
                        if (queryParameter4 == null) {
                            queryParameter4 = ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE;
                        }
                        String queryParameter5 = sessionIdDeeplink.getQueryParameter("code_challenge");
                        String str3 = queryParameter5 == null ? ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE : queryParameter5;
                        String queryParameter6 = sessionIdDeeplink.getQueryParameter("code_challenge_method");
                        C4744x c4744x2 = c4744x;
                        String str4 = queryParameter6 == null ? ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE : queryParameter6;
                        String queryParameter7 = sessionIdDeeplink.getQueryParameter("redirect_uri");
                        if (queryParameter7 == null) {
                            queryParameter7 = ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE;
                        }
                        String str5 = str2;
                        Uri.Builder scheme = new Uri.Builder().scheme("https");
                        switch (Em.a(Wk.f30290b)) {
                            case 0:
                                a11 = C4515p.a("IyNwZRApIXQkOy0HaiI4CRYsQEA=");
                                break;
                            case 1:
                                a11 = C4515p.a("IyN8GDYiOBEZFzEPIxQxAxAiOQkWLEBA");
                                break;
                            case 2:
                                a11 = C4515p.a("IyN8GDYiOBEZFzEPIxRxFw8gOQkWLEBA");
                                break;
                            case 3:
                            case 4:
                                a11 = C4515p.a("IyN8GDYiOBEZFzEPIxRxFw8gOQkWLEBA");
                                break;
                            case 5:
                            case 6:
                                a11 = C4515p.a("IyNwZRApIXQkOy0HaiI4CRYsQEA=");
                                break;
                            default:
                                throw new Sc.o();
                        }
                        Uri build = scheme.authority(a11).path("CSAFront/oidc/authorize.do").appendQueryParameter("client_id", queryParameter).appendQueryParameter("scope", queryParameter2).appendQueryParameter("code_challenge_method", str4).appendQueryParameter("nonce", queryParameter4).appendQueryParameter("state", queryParameter3).appendQueryParameter("code_challenge", str3).appendQueryParameter("redirect_uri", queryParameter7).appendQueryParameter("response_type", "code").appendQueryParameter("token", str5).appendQueryParameter("package", appPackage).build();
                        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .s…age)\n            .build()");
                        c4744x2.f32410O.setValue(Boolean.TRUE);
                        Ae.x0 x0Var = c4744x2.f32401F;
                        String uri = build.toString();
                        Intrinsics.checkNotNullExpressionValue(uri, "uri.toString()");
                        x0Var.setValue(new L5(new C4406l6(uri)));
                        return Unit.f71690a;
                    }
                }
                throw C4485nr.f31692a;
            }
        }
        c4340ir = new C4340ir(this, cVar);
        Object obj2 = c4340ir.f31325e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4340ir.f31327g;
        String str22 = null;
        if (i11 != 0) {
        }
        A8 a822 = (A8) obj2;
        l11 = ((C4654tn) c4744x.f32413b).l();
        if (l11 != null) {
            sessionIdDeeplink = Uri.parse(q11);
            Intrinsics.checkNotNullExpressionValue(sessionIdDeeplink, "parse(this)");
            if (sessionIdDeeplink != null) {
            }
        }
        throw C4485nr.f31692a;
    }

    public final MerchantData m0() {
        MerchantData merchantData = ((C4654tn) this.f32413b).f32130G;
        if (merchantData != null) {
            return merchantData;
        }
        throw L3.f29386a;
    }

    public final void n0() {
        Bp block = new Bp(this);
        Intrinsics.checkNotNullParameter(block, "block");
        this.f32410O.setValue(Boolean.FALSE);
        ((Yq) this.f32426o).a(Vp.f30226b);
        this.f32401F.setValue(new L5(C4358jg.f31368a));
    }
}
