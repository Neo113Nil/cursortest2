package P70;

import A30.m;
import Aa.C2375b;
import Ae.InterfaceC2397i;
import Ae.O0;
import Ae.w0;
import Ae.x0;
import B0.C2454a;
import B30.f;
import D30.a;
import E30.j;
import Sc.C4005g;
import Sc.o;
import Sc.s;
import T60.a;
import android.app.Application;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.ComponentCallbacksC5392m;
import d40.InterfaceC6083a;
import g30.InterfaceC6618a;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.auth.network.dto.AuthCreateBiometricTokenResponseDto;
import ru.ozon.fintech.exchanger.datapass.ActionResult2;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2SnackDTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.BoxV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.ColumnV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.FinImageV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.RowV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.TextItemV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2;
import ru.ozon.fintech.network.models.a;
import ru.ozon.fintech.settings.models.AppConfig;
import ru.ozon.fintech.settings.models.AuthPinpad;
import ru.ozon.fintech.ui.misc.FinIcons;
import ru.ozon.fintech.ui.pinprogress.PinProgressWrapperState;
import ru.ozon.fintech.ui.utils.Common;
import xe.B0;
import xe.C10727i;
import xe.H0;
import xe.M;

/* loaded from: classes3.dex */
public final class h extends E30.d {

    /* renamed from: A, reason: collision with root package name */
    private boolean f21949A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f21950B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f21951C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f21952D;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final R30.a f21953a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final m f21954b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f21955c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final S80.b f21956d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final B30.a f21957e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final B30.f f21958f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC6083a f21959g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final S60.a f21960h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Application f21961i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final L30.d f21962j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Q90.c f21963k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final K40.a f21964l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final O70.a f21965m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f21966n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final x0<Q70.d> f21967o;

    /* renamed from: p, reason: collision with root package name */
    private B0 f21968p;

    /* renamed from: q, reason: collision with root package name */
    private D30.a f21969q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f21970r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f21971s;

    /* renamed from: t, reason: collision with root package name */
    private String f21972t;

    /* renamed from: u, reason: collision with root package name */
    private String f21973u;

    /* renamed from: v, reason: collision with root package name */
    private String f21974v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final Handler f21975w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private String f21976x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f21977y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f21978z;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.pinpad.presentation.pinpad.PinPadViewModel$onCreate$1", f = "PinPadViewModel.kt", l = {111}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f21979d;

        /* renamed from: P70.h$a$a, reason: collision with other inner class name */
        static final class C0435a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f21981a;

            C0435a(h hVar) {
                this.f21981a = hVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                if (Intrinsics.d((Boolean) obj, Boolean.TRUE)) {
                    h hVar = this.f21981a;
                    hVar.f21977y = true;
                    hVar.B0();
                }
                return Unit.f71690a;
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return h.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f21979d;
            if (i11 == 0) {
                s.b(obj);
                h hVar = h.this;
                w0<Boolean> Y11 = hVar.f21956d.Y();
                if (Y11 == null) {
                    return Unit.f71690a;
                }
                C0435a c0435a = new C0435a(hVar);
                this.f21979d = 1;
                if (Y11.collect(c0435a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new C4005g();
        }
    }

    public h(@NotNull R30.a appCoroutineScopes, @NotNull m fintechAuthInteractor, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull S80.b fintechNavigation, @NotNull B30.a biometricAuthManager, @NotNull B30.f biometricSecurityStorage, @NotNull InterfaceC6083a exchanger, @NotNull S60.a metrixInteractor, @NotNull Application application, @NotNull L30.d funVibrator, @NotNull Q90.c featureToggles, @NotNull K40.a cbottomDisplay, @NotNull O70.a pinPadJsonRepository, @NotNull InterfaceC6618a fintechAnalyticInteractor) {
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        Intrinsics.checkNotNullParameter(fintechAuthInteractor, "fintechAuthInteractor");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
        Intrinsics.checkNotNullParameter(biometricSecurityStorage, "biometricSecurityStorage");
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        Intrinsics.checkNotNullParameter(metrixInteractor, "metrixInteractor");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(funVibrator, "funVibrator");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(cbottomDisplay, "cbottomDisplay");
        Intrinsics.checkNotNullParameter(pinPadJsonRepository, "pinPadJsonRepository");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f21953a = appCoroutineScopes;
        this.f21954b = fintechAuthInteractor;
        this.f21955c = fintechSettings;
        this.f21956d = fintechNavigation;
        this.f21957e = biometricAuthManager;
        this.f21958f = biometricSecurityStorage;
        this.f21959g = exchanger;
        this.f21960h = metrixInteractor;
        this.f21961i = application;
        this.f21962j = funVibrator;
        this.f21963k = featureToggles;
        this.f21964l = cbottomDisplay;
        this.f21965m = pinPadJsonRepository;
        this.f21966n = fintechAnalyticInteractor;
        this.f21967o = O0.a(null);
        a.b bVar = a.b.f96629a;
        this.f21975w = new Handler(Looper.getMainLooper());
        this.f21976x = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r3 != null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B0() {
        String redirectToDeep;
        String b11;
        AuthPinpad.Data data;
        AuthPinpad.Links links;
        String challenge;
        D30.a aVar = this.f21969q;
        boolean z11 = aVar instanceof a.c;
        a.c cVar = z11 ? (a.c) aVar : null;
        if (cVar != null && (b11 = cVar.b()) != null) {
            AuthPinpad C02 = C0();
            if (C02 != null && (data = C02.getData()) != null && (links = data.getLinks()) != null && (challenge = links.getChallenge()) != null) {
                if (challenge.length() <= 0 || b11.length() <= 0) {
                    challenge = null;
                }
                if (challenge != null) {
                    this.f21952D = true;
                    redirectToDeep = kotlin.text.h.X(challenge, "%challengeID%", b11, false);
                }
            }
            redirectToDeep = null;
        }
        AuthPinpad C03 = C0();
        redirectToDeep = C03 != null ? C03.getRedirectToDeep() : null;
        if (redirectToDeep == null) {
            AuthPinpad C04 = C0();
            redirectToDeep = C04 != null ? C04.getRedirectTo() : null;
        }
        this.f21966n.o0(String.valueOf(aVar), redirectToDeep, this.f21977y);
        if (this.f21977y && z11) {
            if (!this.f21952D) {
                this.f21963k.A(null);
                this.f21954b.E();
            }
            N0();
            S80.b bVar = this.f21956d;
            x0<String> p11 = bVar.p();
            if (p11 != null) {
                p11.setValue(null);
            }
            x0<String> p12 = bVar.p();
            if (p12 != null) {
                p12.setValue(redirectToDeep);
            }
        }
    }

    private final AuthPinpad C0() {
        AppConfig n11 = this.f21963k.n();
        if (n11 != null) {
            return n11.getAuthPinpad();
        }
        return null;
    }

    private final void E0() {
        AuthPinpad authPinpad;
        AuthPinpad.Data data;
        AuthPinpad.Links links;
        AppConfig n11 = this.f21963k.n();
        if (n11 == null || (authPinpad = n11.getAuthPinpad()) == null || (data = authPinpad.getData()) == null || (links = data.getLinks()) == null) {
            return;
        }
        this.f21969q = null;
        Q0();
        handleState();
        String recovery = links.getRecovery();
        S80.b bVar = this.f21956d;
        x0<String> p11 = bVar.p();
        if (p11 != null) {
            p11.setValue(null);
        }
        x0<String> p12 = bVar.p();
        if (p12 != null) {
            p12.setValue(recovery);
        }
    }

    private static E30.j F0(D30.e eVar) {
        Integer b11 = eVar != null ? eVar.b() : null;
        return (eVar == null || eVar.a() != null || b11 == null || b11.intValue() <= 3) ? (eVar == null || eVar.a() != null || b11 == null || b11.intValue() > 3) ? (eVar == null || eVar.a() == null) ? new j.c(R.string.wrong_pass, K.f71697a) : new j.c(R.string.pin_pad_sub_title, K.f71697a) : new j.b(b11.intValue()) : new j.c(R.string.wrong_pass, K.f71697a);
    }

    private final void G0(final boolean z11) {
        String p11 = this.f21954b.p();
        if (p11 == null || p11.equals("") || p11.equals("0")) {
            return;
        }
        B30.f fVar = this.f21958f;
        final String i11 = fVar.i(p11);
        fVar.j(i11, new Function1() { // from class: P70.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.g0(h.this, i11, z11, (f.e) obj);
            }
        });
    }

    private final void N0() {
        S80.b bVar = this.f21956d;
        w0<Boolean> S02 = bVar.S0();
        if (S02 != null) {
            S02.tryEmit(null);
        }
        bVar.l(false);
    }

    private final void Q0() {
        a.b bVar = a.b.f96629a;
        this.f21972t = null;
        this.f21973u = null;
        this.f21974v = null;
        this.f21971s = false;
        this.f21978z = false;
        this.f21949A = false;
        this.f21950B = false;
        this.f21951C = false;
        this.f21952D = false;
    }

    public static Unit d0(f.d readTokenResult, h hVar, String str) {
        Intrinsics.checkNotNullParameter(readTokenResult, "readTokenResult");
        hVar.f21975w.post(new e(readTokenResult, hVar, str, 0));
        return Unit.f71690a;
    }

    public static Unit e0(h hVar, ActionResult2 actionResult) {
        Intrinsics.checkNotNullParameter(actionResult, "actionResult");
        if (Intrinsics.d(actionResult.getCbottomId(), "cbottom_biometrics_invite") && Intrinsics.d(actionResult.getType(), "CLICK") && Intrinsics.d(actionResult.getWidgetId(), "bio_promt_confirm")) {
            hVar.f21978z = true;
            hVar.f21956d.pop();
            C10727i.c(androidx.lifecycle.x0.a(hVar), null, null, new k(hVar, hVar.f21972t, null), 3);
        } else if (Intrinsics.d(actionResult.getCbottomId(), "cbottom_biometrics_invite") && Intrinsics.d(actionResult.getType(), "CLICK") && Intrinsics.d(actionResult.getWidgetId(), "bio_promt_cancel")) {
            hVar.f21978z = true;
            hVar.f21956d.pop();
            hVar.B0();
        } else if (Intrinsics.d(actionResult.getCbottomId(), "cbottom_biometrics_invite") && Intrinsics.d(actionResult.getType(), "DISMISSED") && !hVar.f21978z) {
            hVar.f21956d.pop();
            hVar.B0();
        } else if (Intrinsics.d(actionResult.getCbottomId(), "cbottom_biometrics_setup_completed") && Intrinsics.d(actionResult.getType(), "CLICK") && Intrinsics.d(actionResult.getWidgetId(), "bio_promt_done_confirm")) {
            hVar.f21949A = true;
            hVar.f21956d.pop();
            hVar.B0();
        } else if (Intrinsics.d(actionResult.getCbottomId(), "cbottom_biometrics_setup_completed") && Intrinsics.d(actionResult.getType(), "DISMISSED") && !hVar.f21949A) {
            hVar.f21956d.pop();
            hVar.B0();
        } else if (Intrinsics.d(actionResult.getCbottomId(), "cbottom_biometrics_data_changed") && Intrinsics.d(actionResult.getType(), "CLICK") && Intrinsics.d(actionResult.getWidgetId(), "biometrics_data_changed_confirm")) {
            hVar.f21956d.pop();
        } else if (Intrinsics.d(actionResult.getCbottomId(), "cbottom_biometrics_password_changed") && Intrinsics.d(actionResult.getType(), "CLICK") && Intrinsics.d(actionResult.getWidgetId(), "biometrics_password_changed")) {
            hVar.f21956d.pop();
        }
        return Unit.f71690a;
    }

    public static void f0(f.d dVar, h hVar, String str) {
        if (dVar instanceof f.d.c.a) {
            f.d.c.a aVar = (f.d.c.a) dVar;
            InterfaceC6618a.C1033a.c(hVar.f21966n, false, true, null, null, str, Integer.valueOf(aVar.b().length()), aVar.a(), 12);
            AuthCreateBiometricTokenResponseDto g10 = hVar.f21954b.g(aVar.b());
            hVar.f21974v = g10 != null ? g10.getBiometricToken() : null;
            hVar.f21973u = "1111";
            hVar.handleState();
            B0 b02 = hVar.f21968p;
            if (b02 != null) {
                ((H0) b02).j(null);
            }
            hVar.f21968p = C10727i.c(androidx.lifecycle.x0.a(hVar), null, null, new f(hVar, null), 3);
            return;
        }
        if (dVar instanceof f.d.a) {
            f.d.a aVar2 = (f.d.a) dVar;
            InterfaceC6618a.C1033a.c(hVar.f21966n, false, false, G.g.c(aVar2.a(), ": ", aVar2.b()), aVar2.c(), str, null, null, 96);
        } else if (!(dVar instanceof f.d.b)) {
            if (!Intrinsics.d(dVar, f.d.C0058d.f2405a)) {
                throw new o();
            }
            InterfaceC6618a.C1033a.c(hVar.f21966n, true, false, null, null, str, null, null, 108);
        } else {
            f.d.b bVar = (f.d.b) dVar;
            InterfaceC6618a.C1033a.c(hVar.f21966n, false, false, Nk.a.b("InvalidatedKey: ", bVar.a()), bVar.b(), str, null, null, 96);
            hVar.y0();
            hVar.f21956d.Q0(hVar.f21976x, "SHEET_2", C2454a.b("BANK_KEY", "Ozon Банк"));
        }
    }

    public static Unit g0(h hVar, String str, boolean z11, f.e tokenExistResult) {
        Intrinsics.checkNotNullParameter(tokenExistResult, "tokenExistResult");
        hVar.getClass();
        boolean z12 = tokenExistResult instanceof f.e.b.a;
        InterfaceC6618a interfaceC6618a = hVar.f21966n;
        if (z12) {
            interfaceC6618a.X0(null, str, true, true, (r10 & 16) == 0);
            ComponentCallbacksC5392m U10 = hVar.f21956d.U();
            if (U10 != null) {
                hVar.f21958f.b(U10, str, new c(hVar, str));
            }
        } else if (tokenExistResult instanceof f.e.b.C0059b) {
            interfaceC6618a.X0(null, str, true, false, (r10 & 16) == 0);
            if (z11) {
                hVar.f21971s = true;
                hVar.handleState();
            }
        } else {
            if (!(tokenExistResult instanceof f.e.a)) {
                throw new o();
            }
            ((f.e.a) tokenExistResult).getClass();
            hVar.f21966n.X0(null, str, false, false, true);
            hVar.y0();
        }
        return Unit.f71690a;
    }

    public static Unit h0(h hVar, String str, f.a clearTokenResult) {
        Intrinsics.checkNotNullParameter(clearTokenResult, "clearTokenResult");
        if (clearTokenResult instanceof f.a.b) {
            InterfaceC6618a.C1033a.b(hVar.f21966n, true, null, str, 10);
        } else {
            if (!(clearTokenResult instanceof f.a.C0055a)) {
                throw new o();
            }
            InterfaceC6618a.C1033a.b(hVar.f21966n, false, ((f.a.C0055a) clearTokenResult).a(), str, 8);
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleState() {
        E30.j dVar;
        String str;
        AuthPinpad.Data data;
        E30.j jVar;
        h hVar;
        int i11;
        int length;
        Q70.d cVar;
        Q70.d dVar2;
        if (this.f21950B) {
            dVar2 = Q70.a.f23013a;
        } else {
            if (!this.f21951C) {
                D30.a aVar = this.f21969q;
                boolean z11 = this.f21970r && this.f21972t == null;
                boolean z12 = this.f21972t != null;
                boolean z13 = this.f21971s;
                if (aVar == null && z13) {
                    dVar = new j.c(R.string.pinpad_connect_bio, K.f71697a);
                } else {
                    AuthPinpad C02 = C0();
                    if (C02 == null || (data = C02.getData()) == null || (str = data.getTitle()) == null) {
                        str = "";
                    }
                    dVar = new j.d(str);
                }
                E30.j jVar2 = dVar;
                if (aVar instanceof a.i) {
                    jVar = F0(((a.i) aVar).a());
                } else if (aVar instanceof a.d) {
                    jVar = F0(((a.d) aVar).a());
                } else if (aVar instanceof a.e) {
                    jVar = F0(((a.e) aVar).a());
                } else if (aVar instanceof a.h) {
                    jVar = new j.c(R.string.pinpad_error_400, K.f71697a);
                } else if (aVar instanceof a.g) {
                    jVar = new j.c(R.string.pinpad_error_network, K.f71697a);
                } else if (Intrinsics.d(aVar, a.C0130a.f5764a)) {
                    jVar = j.a.f7422a;
                } else if (Intrinsics.d(aVar, a.b.f5765a)) {
                    jVar = j.a.f7422a;
                } else if (aVar instanceof a.c) {
                    jVar = j.a.f7422a;
                } else if (Intrinsics.d(aVar, a.f.f5770a)) {
                    jVar = j.a.f7422a;
                } else {
                    if (aVar != null) {
                        throw new o();
                    }
                    jVar = j.a.f7422a;
                }
                E30.j jVar3 = jVar;
                String str2 = this.f21972t;
                String str3 = this.f21973u;
                hVar = this;
                Common build = Common.INSTANCE.build(new g(1, this, h.class, "actionListenerPinProgress", "actionListenerPinProgress(Lru/ozon/fintech/ui/ActionResult2UI;)V", 0), new Rect(4, 8, 8, 4));
                if (str2 != null) {
                    length = str2.length();
                } else {
                    if (str3 == null) {
                        i11 = 0;
                        PinProgressWrapperState pinProgressWrapperState = new PinProgressWrapperState(build, i11, "graphicTertiary", "graphicActionPrimary", "ozOrange", 4, 6.0f, 7.0f);
                        AuthPinpad C03 = hVar.C0();
                        boolean z14 = C03 == null && C03.getLogoHidden();
                        cVar = new Q70.c(z11, z12, jVar2, jVar3, pinProgressWrapperState, z14, !r1.isStandAloneIntegration(), hVar.f21955c.isStandAloneIntegration());
                        hVar.f21967o.setValue(cVar);
                    }
                    length = str3.length();
                }
                i11 = length;
                PinProgressWrapperState pinProgressWrapperState2 = new PinProgressWrapperState(build, i11, "graphicTertiary", "graphicActionPrimary", "ozOrange", 4, 6.0f, 7.0f);
                AuthPinpad C032 = hVar.C0();
                if (C032 == null) {
                }
                cVar = new Q70.c(z11, z12, jVar2, jVar3, pinProgressWrapperState2, z14, !r1.isStandAloneIntegration(), hVar.f21955c.isStandAloneIntegration());
                hVar.f21967o.setValue(cVar);
            }
            dVar2 = Q70.b.f23014a;
        }
        cVar = dVar2;
        hVar = this;
        hVar.f21967o.setValue(cVar);
    }

    public static final void s0(h hVar) {
        Object obj = hVar.f21969q;
        if (obj instanceof D30.b) {
            D30.e a11 = ((D30.b) obj).a();
            String a12 = a11 != null ? a11.a() : null;
            if (a12 != null) {
                try {
                    hVar.R0((int) ChronoUnit.MINUTES.between(Instant.now(), Instant.parse(a12)));
                } catch (Exception unused) {
                }
            }
        }
        D30.a aVar = hVar.f21969q;
        if (aVar instanceof a.h) {
            hVar.Q0();
            hVar.handleState();
            return;
        }
        if (aVar instanceof a.g) {
            hVar.Q0();
            hVar.handleState();
            return;
        }
        if (aVar instanceof a.f) {
            hVar.Q0();
            hVar.handleState();
            return;
        }
        String str = hVar.f21974v;
        S80.b bVar = hVar.f21956d;
        if (str != null && (aVar instanceof a.i)) {
            hVar.y0();
            hVar.Q0();
            hVar.handleState();
            bVar.Q0(hVar.f21976x, "SHEET_3", null);
            return;
        }
        if (str == null && (aVar instanceof a.i)) {
            hVar.Q0();
            hVar.handleState();
            return;
        }
        if (aVar instanceof a.e) {
            hVar.Q0();
            hVar.handleState();
            return;
        }
        if (aVar instanceof a.d) {
            hVar.Q0();
            hVar.handleState();
            return;
        }
        boolean z11 = hVar.f21971s;
        ru.ozon.fintech.settings.domain.a aVar2 = hVar.f21955c;
        if (z11 && (aVar instanceof a.c)) {
            aVar2.C(false);
            C10727i.c(androidx.lifecycle.x0.a(hVar), null, null, new k(hVar, hVar.f21972t, null), 3);
            hVar.handleState();
            return;
        }
        if (aVar2.v() && (hVar.f21969q instanceof a.c) && hVar.f21970r) {
            aVar2.C(false);
            bVar.Q0(hVar.f21976x, "SHEET_1", null);
            return;
        }
        D30.a aVar3 = hVar.f21969q;
        if (aVar3 instanceof a.c) {
            hVar.f21971s = false;
            hVar.f21960h.a(new a.c(System.currentTimeMillis(), true));
            hVar.B0();
            return;
        }
        if (aVar3 instanceof a.C0130a) {
            hVar.y0();
            hVar.Q0();
            hVar.handleState();
            hVar.f21950B = true;
            hVar.handleState();
            return;
        }
        if (!(aVar3 instanceof a.b)) {
            hVar.Q0();
            hVar.handleState();
            return;
        }
        hVar.y0();
        hVar.Q0();
        hVar.handleState();
        hVar.f21951C = true;
        hVar.handleState();
    }

    public static final void x0(h hVar) {
        hVar.f21956d.Q0(hVar.f21976x, "SHEET_4", C2454a.b("BANK_KEY", "Ozon Банк"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0() {
        String p11 = this.f21954b.p();
        if (p11 != null) {
            B30.f fVar = this.f21958f;
            final String i11 = fVar.i(p11);
            fVar.g(i11, new Function1() { // from class: P70.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return h.h0(h.this, i11, (f.a) obj);
                }
            });
        }
    }

    public final void A0() {
        if ((this.f21969q instanceof a.b) && this.f21951C) {
            E0();
        }
    }

    @NotNull
    public final x0<Q70.d> D0() {
        return this.f21967o;
    }

    public final boolean H0() {
        return this.f21955c.isStandAloneIntegration();
    }

    public final void I0() {
        String str;
        this.f21962j.c();
        String str2 = this.f21972t;
        if ((str2 != null ? str2.length() : 0) > 0) {
            String str3 = this.f21972t;
            if (str3 != null) {
                str = str3.substring(0, str3.length() - 1);
                Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
            } else {
                str = null;
            }
            this.f21972t = str;
            if (str != null && str.length() == 0) {
                this.f21972t = null;
            }
        }
        handleState();
    }

    public final void J0() {
        this.f21962j.c();
        this.f21969q = null;
        if (this.f21970r) {
            G0(true);
        }
    }

    public final void K0() {
        this.f21956d.b();
    }

    public final void L0(int i11) {
        this.f21962j.c();
        String str = this.f21972t;
        if ((str != null ? str.length() : 0) < 4) {
            if (this.f21972t == null) {
                this.f21972t = "";
            }
            this.f21969q = null;
            String str2 = this.f21972t + i11;
            this.f21972t = str2;
            if (str2 != null && str2.length() == 4) {
                B0 b02 = this.f21968p;
                if (b02 != null) {
                    ((H0) b02).j(null);
                }
                this.f21968p = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new f(this, null), 3);
            }
        }
        handleState();
    }

    public final void M0() {
        AuthPinpad.Data data;
        AuthPinpad.Links links;
        N0();
        S80.b bVar = this.f21956d;
        x0<String> L11 = bVar.L();
        if (L11 != null) {
            AuthPinpad C02 = C0();
            L11.setValue((C02 == null || (data = C02.getData()) == null || (links = data.getLinks()) == null) ? null : links.getDontRememberPass());
        }
        bVar.E();
    }

    public final void O0(@NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.f21976x = uuid;
        L80.a.a("PINPADER_PERF", System.currentTimeMillis() + " onCreate");
        this.f21956d.l(true);
        this.f21970r = this.f21957e.b();
        handleState();
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new a(null), 3);
        if (this.f21970r) {
            G0(false);
        }
        this.f21966n.d2();
    }

    public final void P0() {
        L80.a.a("PINPADER_PERF", System.currentTimeMillis() + " onViewCreated");
        this.f21960h.a(new a.e(System.currentTimeMillis(), true, "/apps/auth/signin"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R0(int i11) {
        Application application = this.f21961i;
        String title = application.getResources().getQuantityString(R.plurals.wrong_pass_throttle_minutes, i11, Integer.valueOf(i11));
        Intrinsics.checkNotNullExpressionValue(title, "getQuantityString(...)");
        K40.a aVar = this.f21964l;
        K40.b creator = aVar.creator();
        String subTitle = application.getString(R.string.wrong_pass_throttle_several);
        Intrinsics.checkNotNullExpressionValue(subTitle, "getString(...)");
        creator.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        List b02 = C7714v.b0(20, 20, 20, 20);
        List b03 = C7714v.b0(8, 8, 8, 8);
        int i12 = 48;
        String str = "IMAGE_WARNING";
        FinImageV20DTO finImageV20DTO = new FinImageV20DTO(null, str, null, null, null, null, null, i12, i12, null, null, null, null, null, null, null, C7714v.b0(16, 16, 16, 16), "bgExpressSecondary", null, null, null, null, null, null, null, null, null, null, FinIcons.IC_M_EXCLAMATION_FILLED.getDrawableName(), null, "bgExpressPrimary", null, null, null, null, null, null, -1342374275, 31, null);
        int i13 = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        BoxV20DTO boxV20DTO = new BoxV20DTO(null, "BOX_SPACER_HORIZONTAL", null, bool, bool2, bool3, null, 8, i13, num, null, null, null, null, null, null, null, null, null, null, null, null, num2, num3, null, null, null, null, null, null, null, null, null, -134218115, 1, null);
        int i14 = -1;
        int i15 = -2;
        Float valueOf = Float.valueOf(1.0f);
        Object[] objArr = null == true ? 1 : 0;
        Object[] objArr2 = null == true ? 1 : 0;
        Object[] objArr3 = null == true ? 1 : 0;
        TextItemV20DTO textItemV20DTO = new TextItemV20DTO(null, "TEXT_TITLE", null, null == true ? 1 : 0, bool, bool2, bool3, i15, i15, null, num, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, num2, num3, null == true ? 1 : 0, null == true ? 1 : 0, title, "tsBodyLBold", "textPrimary", null == true ? 1 : 0, null == true ? 1 : 0, objArr, objArr2, null, null, objArr3, -2013266307, 31, null);
        int i16 = 2;
        Boolean bool4 = null;
        Object[] objArr4 = null == true ? 1 : 0;
        Object[] objArr5 = null == true ? 1 : 0;
        Object[] objArr6 = null == true ? 1 : 0;
        Object[] objArr7 = null == true ? 1 : 0;
        Object[] objArr8 = null == true ? 1 : 0;
        Object[] objArr9 = null == true ? 1 : 0;
        Object[] objArr10 = null == true ? 1 : 0;
        Object[] objArr11 = null == true ? 1 : 0;
        Object[] objArr12 = null == true ? 1 : 0;
        Object[] objArr13 = null == true ? 1 : 0;
        Object[] objArr14 = null == true ? 1 : 0;
        Object[] objArr15 = null == true ? 1 : 0;
        Object[] objArr16 = null == true ? 1 : 0;
        Object[] objArr17 = null == true ? 1 : 0;
        Object[] objArr18 = null == true ? 1 : 0;
        Object[] objArr19 = null == true ? 1 : 0;
        Object[] objArr20 = null == true ? 1 : 0;
        Object[] objArr21 = null == true ? 1 : 0;
        Integer num4 = null;
        Object[] objArr22 = null == true ? 1 : 0;
        Object[] objArr23 = null == true ? 1 : 0;
        Object[] objArr24 = null == true ? 1 : 0;
        Object[] objArr25 = null == true ? 1 : 0;
        Object[] objArr26 = null == true ? 1 : 0;
        Object[] objArr27 = null == true ? 1 : 0;
        Object[] objArr28 = null == true ? 1 : 0;
        Object[] objArr29 = null == true ? 1 : 0;
        Object[] objArr30 = null == true ? 1 : 0;
        Object[] objArr31 = null == true ? 1 : 0;
        Object[] objArr32 = null == true ? 1 : 0;
        Object[] objArr33 = null == true ? 1 : 0;
        Object[] objArr34 = null == true ? 1 : 0;
        Object[] objArr35 = null == true ? 1 : 0;
        Object[] objArr36 = null == true ? 1 : 0;
        Object[] objArr37 = null == true ? 1 : 0;
        Object[] objArr38 = null == true ? 1 : 0;
        Object[] objArr39 = null == true ? 1 : 0;
        Object[] objArr40 = null == true ? 1 : 0;
        F40.a[] aVarArr = {textItemV20DTO, new BoxV20DTO(null == true ? 1 : 0, "BOX_SPACER_VERTICAL", null, bool2, bool3, bool4, null, i13, i16, objArr6, objArr7, objArr8, objArr9, objArr10, objArr11, objArr12, objArr13, objArr14, objArr15, objArr16, objArr17, num2, num3, objArr18, objArr19, null, null, null, objArr20, objArr21, objArr4, objArr5, null == true ? 1 : 0, -134218115, 1, null), new TextItemV20DTO(null, "TEXT_DESCRIPTION", null, null == true ? 1 : 0, bool2, bool3, bool4, i15, i15, num4, objArr24, objArr25, objArr26, objArr27, objArr28, objArr29, objArr30, objArr31, objArr32, objArr33, objArr34, objArr35, num2, num3, objArr36, objArr37, null == true ? 1 : 0, subTitle, "tsBodyS", "textSecondary", objArr38, objArr22, objArr23, objArr39, null, null, objArr40, -2013266307, 31, null)};
        int i17 = 1;
        CbottomElement2 cbottomElement2 = null;
        Integer num5 = null;
        Integer num6 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Object[] objArr41 = null == true ? 1 : 0;
        Object[] objArr42 = null == true ? 1 : 0;
        Object[] objArr43 = null == true ? 1 : 0;
        Object[] objArr44 = null == true ? 1 : 0;
        Object[] objArr45 = null == true ? 1 : 0;
        Object[] objArr46 = null == true ? 1 : 0;
        Object[] objArr47 = null == true ? 1 : 0;
        Object[] objArr48 = null == true ? 1 : 0;
        Object[] objArr49 = null == true ? 1 : 0;
        Object[] objArr50 = null == true ? 1 : 0;
        Object[] objArr51 = null == true ? 1 : 0;
        Object[] objArr52 = null == true ? 1 : 0;
        Object[] objArr53 = null == true ? 1 : 0;
        Object[] objArr54 = null == true ? 1 : 0;
        Object[] objArr55 = null == true ? 1 : 0;
        F40.a[] aVarArr2 = {finImageV20DTO, boxV20DTO, new ColumnV20DTO(cbottomElement2, "COLUMN_TEXT", num5, null == true ? 1 : 0, null == true ? 1 : 0, bool2, bool3, i14, i15, num6, num4, objArr42, objArr43, objArr44, valueOf, objArr45, objArr46, objArr47, objArr48, objArr49, objArr50, objArr51, objArr52, num2, num3, objArr53, objArr54, C7714v.b0(aVarArr), str2, str3, str4, objArr55, objArr41, -134234499, i17, null == true ? 1 : 0)};
        Object[] objArr56 = null == true ? 1 : 0;
        Object[] objArr57 = null == true ? 1 : 0;
        Object[] objArr58 = null == true ? 1 : 0;
        Object[] objArr59 = null == true ? 1 : 0;
        Object[] objArr60 = null == true ? 1 : 0;
        Object[] objArr61 = null == true ? 1 : 0;
        Object[] objArr62 = null == true ? 1 : 0;
        Object[] objArr63 = null == true ? 1 : 0;
        Object[] objArr64 = null == true ? 1 : 0;
        Object[] objArr65 = null == true ? 1 : 0;
        Object[] objArr66 = null == true ? 1 : 0;
        Object[] objArr67 = null == true ? 1 : 0;
        Object[] objArr68 = null == true ? 1 : 0;
        Object[] objArr69 = null == true ? 1 : 0;
        Object[] objArr70 = null == true ? 1 : 0;
        Object[] objArr71 = null == true ? 1 : 0;
        Object[] objArr72 = null == true ? 1 : 0;
        aVar.g(new Cbottom2SnackDTO("snackbar_retry_code", objArr72, i16, C7714v.a0(new RowV20DTO(cbottomElement2, "ROW_MAIN", num5, objArr69, objArr68, bool2, bool3, i14, i15, num6, num4, objArr57, objArr58, objArr59, null, b03, b02, "bgSecondary", objArr60, objArr61, objArr62, objArr63, objArr64, num2, num3, objArr65, objArr66, C7714v.b0(aVarArr2), str2, str3, str4, objArr67, objArr56, -134447491, i17, null == true ? 1 : 0)), false, true, i13, i13, 0, false, objArr70, objArr71, null == true ? 1 : 0, null, 15618, null), CbottomType.SNACK, this.f21976x, null);
    }

    public final void onBackPressed() {
        this.f21956d.b();
    }

    public final void onStart() {
        L80.a.a("PINPADER_PERF", System.currentTimeMillis() + " onStart");
        this.f21970r = this.f21957e.b();
        handleState();
        ActionResult2.Companion companion = ActionResult2.INSTANCE;
        String str = this.f21976x;
        companion.getClass();
        this.f21959g.b(ActionResult2.Companion.a(str), androidx.lifecycle.x0.a(this), false, new C2375b(this, 1));
    }

    public final void z0() {
        if ((this.f21969q instanceof a.C0130a) && this.f21950B) {
            E0();
        }
    }
}
