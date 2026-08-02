package Ic0;

import Fb0.f;
import Hb0.f;
import Sc.InterfaceC4008j;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.AuthTokenDTO;
import ru.ozon.id.nativeauth.initAuth.InitAuthApi;
import ru.ozon.id.nativeauth.initAuth.InitAuthRequestBody;
import ru.ozon.id.nativeauth.initAuth.InitAuthResponse;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import xe.C10720e0;
import xe.C10727i;
import xe.I;
import xe.M;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<InitAuthApi> f12172a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<i> f12173b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<hd0.e> f12174c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final f.a f12175d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Hb0.c> f12176e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final I f12177f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.initAuth.InitAuthRepository$initAuth$2", f = "InitAuthRepository.kt", l = {29, AppUpdateInfo.Factory.DAYS_BETWEEN_30, 33, 34, 38}, m = "invokeSuspend")
    /* renamed from: Ic0.a$a, reason: collision with other inner class name */
    static final class C0240a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super AuthTokenDTO>, Object> {

        /* renamed from: d, reason: collision with root package name */
        InitAuthRequestBody f12178d;

        /* renamed from: e, reason: collision with root package name */
        int f12179e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f12181g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f12182h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f12183i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0240a(boolean z11, String str, boolean z12, kotlin.coroutines.d<? super C0240a> dVar) {
            super(2, dVar);
            this.f12181g = z11;
            this.f12182h = str;
            this.f12183i = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new C0240a(this.f12181g, this.f12182h, this.f12183i, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super AuthTokenDTO> dVar) {
            return ((C0240a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00ef, code lost:
        
            if (r13 == r0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
        
            if (r13 == r0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00b6, code lost:
        
            if (r13 == r0) goto L41;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InitAuthRequestBody initAuthRequestBody;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f12179e;
            boolean z11 = this.f12183i;
            a aVar2 = a.this;
            if (i11 == 0) {
                s.b(obj);
                ((i) aVar2.f12173b.getValue()).b(this.f12181g);
                InitAuthRequestBody initAuthRequestBody2 = new InitAuthRequestBody(aVar2.f12175d.a(), this.f12182h);
                Hb0.c cVar = (Hb0.c) aVar2.f12176e.getValue();
                f.o oVar = f.o.f10813a;
                this.f12178d = initAuthRequestBody2;
                this.f12179e = 1;
                Object a11 = cVar.a(oVar, this);
                if (a11 != aVar) {
                    initAuthRequestBody = initAuthRequestBody2;
                    obj = a11;
                }
                return aVar;
            }
            if (i11 != 1) {
                if (i11 == 2) {
                    s.b(obj);
                    return ((InitAuthResponse) obj).getAuthToken();
                }
                if (i11 != 3) {
                    if (i11 == 4) {
                        s.b(obj);
                        return null;
                    }
                    if (i11 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return ((InitAuthResponse) obj).getAuthToken();
                }
                initAuthRequestBody = this.f12178d;
                s.b(obj);
                if (!((Boolean) obj).booleanValue() || z11) {
                    InitAuthApi initAuthApi = (InitAuthApi) aVar2.f12172a.getValue();
                    this.f12178d = null;
                    this.f12179e = 5;
                    obj = initAuthApi.initAuth("composer-api.bx/_action/initAuth", initAuthRequestBody, j.f12234a, this);
                } else {
                    hd0.e eVar = (hd0.e) aVar2.f12174c.getValue();
                    this.f12178d = null;
                    this.f12179e = 4;
                    if (eVar.h(true, this) != aVar) {
                        return null;
                    }
                }
                return aVar;
            }
            initAuthRequestBody = this.f12178d;
            s.b(obj);
            if (((Boolean) obj).booleanValue() && z11) {
                InitAuthApi initAuthApi2 = (InitAuthApi) aVar2.f12172a.getValue();
                this.f12178d = null;
                this.f12179e = 2;
                obj = initAuthApi2.initAuth("composer-api.bx/_action/initAuthMobileV1", initAuthRequestBody, j.f12234a, this);
            } else {
                Hb0.c cVar2 = (Hb0.c) aVar2.f12176e.getValue();
                f.o oVar2 = f.o.f10813a;
                this.f12178d = initAuthRequestBody;
                this.f12179e = 3;
                obj = cVar2.a(oVar2, this);
            }
            return aVar;
        }
    }

    public a() {
        throw null;
    }

    public a(InterfaceC4008j api, InterfaceC4008j interceptor, InterfaceC4008j sso2MobileConfigInteractor, f.a appName, InterfaceC4008j featureFlagsStore) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        He.b ioDispatcher = He.b.f10879b;
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        Intrinsics.checkNotNullParameter(sso2MobileConfigInteractor, "sso2MobileConfigInteractor");
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(featureFlagsStore, "featureFlagsStore");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f12172a = api;
        this.f12173b = interceptor;
        this.f12174c = sso2MobileConfigInteractor;
        this.f12175d = appName;
        this.f12176e = featureFlagsStore;
        this.f12177f = ioDispatcher;
    }

    public final Object f(boolean z11, String str, boolean z12, @NotNull kotlin.coroutines.d<? super AuthTokenDTO> dVar) {
        return C10727i.f(this.f12177f, new C0240a(z11, str, z12, null), dVar);
    }
}
