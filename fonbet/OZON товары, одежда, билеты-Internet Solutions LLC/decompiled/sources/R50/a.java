package R50;

import A30.m;
import B30.f;
import Jb.j;
import L30.h;
import L30.i;
import P60.o;
import P60.r;
import Q90.n;
import R50.d;
import We.E;
import Z50.g;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import b40.InterfaceC5539a;
import c90.InterfaceC5773a;
import com.squareup.moshi.Moshi;
import d40.InterfaceC6083a;
import f40.InterfaceC6422b;
import f90.InterfaceC6469a;
import g30.InterfaceC6618a;
import i40.InterfaceC7007a;
import k40.C7481b;
import kotlin.jvm.internal.Intrinsics;
import m40.InterfaceC8077a;
import n90.InterfaceC8456a;
import o40.InterfaceC8640a;
import oa0.InterfaceC8681a;
import r90.InterfaceC9218a;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;
import ru.ozon.fintech.wallet.manager.domain.WalletManager;
import ru.ozon.uni.atoms.parsing.adapter.AtomDTOAdapterFactory;
import s30.InterfaceC9590a;
import ta0.InterfaceC9791a;
import v40.C10226b;
import wa0.InterfaceC10467a;
import y30.InterfaceC10835a;
import ya0.C10877b;

/* loaded from: classes3.dex */
final class a implements Q50.a {

    /* renamed from: A, reason: collision with root package name */
    private Pc.a<Application> f24599A;

    /* renamed from: B, reason: collision with root package name */
    private Pc.a<L30.d> f24600B;

    /* renamed from: C, reason: collision with root package name */
    private Pc.a<SharedPreferences> f24601C;

    /* renamed from: D, reason: collision with root package name */
    private Pc.a<S50.a> f24602D;

    /* renamed from: E, reason: collision with root package name */
    private Pc.a<Context> f24603E;

    /* renamed from: F, reason: collision with root package name */
    private Pc.a<T50.a> f24604F;

    /* renamed from: G, reason: collision with root package name */
    private Pc.a<InterfaceC5773a> f24605G;

    /* renamed from: H, reason: collision with root package name */
    private Pc.a<g> f24606H;

    /* renamed from: a, reason: collision with root package name */
    private final P30.b f24607a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6422b f24608b;

    /* renamed from: c, reason: collision with root package name */
    private final Z80.a f24609c;

    /* renamed from: d, reason: collision with root package name */
    private final ExternalNetworkSettings f24610d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC10835a f24611e;

    /* renamed from: f, reason: collision with root package name */
    private final Y20.a f24612f;

    /* renamed from: g, reason: collision with root package name */
    private final O90.a f24613g;

    /* renamed from: h, reason: collision with root package name */
    private final M80.a f24614h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC8681a f24615i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC6469a f24616j;

    /* renamed from: k, reason: collision with root package name */
    private final T70.a f24617k;

    /* renamed from: l, reason: collision with root package name */
    private final I40.a f24618l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC9590a f24619m;

    /* renamed from: n, reason: collision with root package name */
    private final H80.a f24620n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC8077a f24621o;

    /* renamed from: p, reason: collision with root package name */
    private final N60.a f24622p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC8456a f24623q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC7007a f24624r;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC5539a f24625s;

    /* renamed from: t, reason: collision with root package name */
    private final N30.b f24626t;

    /* renamed from: u, reason: collision with root package name */
    private final Z30.a f24627u;

    /* renamed from: v, reason: collision with root package name */
    private final I70.a f24628v;

    /* renamed from: w, reason: collision with root package name */
    private final U60.a f24629w;

    /* renamed from: x, reason: collision with root package name */
    private final InterfaceC10467a f24630x;

    /* renamed from: y, reason: collision with root package name */
    private final Q60.a f24631y;

    /* renamed from: z, reason: collision with root package name */
    private Pc.a<Moshi> f24632z = Jb.d.b(C10226b.a());

    /* renamed from: R50.a$a, reason: collision with other inner class name */
    private static final class C0489a implements Pc.a<SharedPreferences> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f24633a;

        C0489a(P30.b bVar) {
            this.f24633a = bVar;
        }

        @Override // Pc.a
        public final SharedPreferences get() {
            SharedPreferences A11 = this.f24633a.A();
            j.c(A11);
            return A11;
        }
    }

    private static final class b implements Pc.a<InterfaceC5773a> {

        /* renamed from: a, reason: collision with root package name */
        private final Z80.a f24634a;

        b(Z80.a aVar) {
            this.f24634a = aVar;
        }

        @Override // Pc.a
        public final InterfaceC5773a get() {
            InterfaceC5773a T02 = this.f24634a.T0();
            j.c(T02);
            return T02;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c implements Pc.a<Application> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f24635a;

        c(P30.b bVar) {
            this.f24635a = bVar;
        }

        @Override // Pc.a
        public final Application get() {
            Application m12 = this.f24635a.m1();
            j.c(m12);
            return m12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class d implements Pc.a<Context> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f24636a;

        d(P30.b bVar) {
            this.f24636a = bVar;
        }

        @Override // Pc.a
        public final Context get() {
            Context h11 = this.f24636a.h();
            j.c(h11);
            return h11;
        }
    }

    a(Y20.a aVar, P30.b bVar, M80.a aVar2, Z80.a aVar3, O90.a aVar4, InterfaceC10835a interfaceC10835a, InterfaceC6422b interfaceC6422b, InterfaceC8077a interfaceC8077a, T70.a aVar5, N60.a aVar6, InterfaceC7007a interfaceC7007a, InterfaceC8681a interfaceC8681a, InterfaceC6469a interfaceC6469a, InterfaceC8456a interfaceC8456a, I40.a aVar7, InterfaceC9590a interfaceC9590a, H80.a aVar8, InterfaceC5539a interfaceC5539a, N30.b bVar2, Z30.a aVar9, I70.a aVar10, U60.a aVar11, ExternalNetworkSettings externalNetworkSettings, Q60.a aVar12, InterfaceC10467a interfaceC10467a) {
        R50.d dVar;
        this.f24607a = bVar;
        this.f24608b = interfaceC6422b;
        this.f24609c = aVar3;
        this.f24610d = externalNetworkSettings;
        this.f24611e = interfaceC10835a;
        this.f24612f = aVar;
        this.f24613g = aVar4;
        this.f24614h = aVar2;
        this.f24615i = interfaceC8681a;
        this.f24616j = interfaceC6469a;
        this.f24617k = aVar5;
        this.f24618l = aVar7;
        this.f24619m = interfaceC9590a;
        this.f24620n = aVar8;
        this.f24621o = interfaceC8077a;
        this.f24622p = aVar6;
        this.f24623q = interfaceC8456a;
        this.f24624r = interfaceC7007a;
        this.f24625s = interfaceC5539a;
        this.f24626t = bVar2;
        this.f24627u = aVar9;
        this.f24628v = aVar10;
        this.f24629w = aVar11;
        this.f24630x = interfaceC10467a;
        this.f24631y = aVar12;
        c cVar = new c(bVar);
        this.f24599A = cVar;
        this.f24600B = Jb.d.b(new L30.e(cVar, 0));
        this.f24601C = new C0489a(bVar);
        this.f24602D = Jb.d.b(new e(this.f24599A));
        d dVar2 = new d(bVar);
        this.f24603E = dVar2;
        this.f24604F = Jb.d.b(new R50.c(dVar2, this.f24632z));
        this.f24605G = new b(aVar3);
        dVar = d.a.f24643a;
        this.f24606H = Jb.d.b(dVar);
    }

    @Override // Q50.a
    public final NativeBridgeConfigurator q1() {
        P30.b bVar = this.f24607a;
        Application application = bVar.m1();
        j.c(application);
        InterfaceC6083a exchanger = this.f24608b.G0();
        j.c(exchanger);
        Moshi moshi = this.f24632z.get();
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        F60.a webBridge = new F60.a(moshi);
        E okHttpClient = this.f24609c.getOkHttpClient();
        j.c(okHttpClient);
        Moshi moshi2 = this.f24632z.get();
        InterfaceC10835a interfaceC10835a = this.f24611e;
        B30.a biometricAuth = interfaceC10835a.D();
        j.c(biometricAuth);
        f biometricSecurityStorage = interfaceC10835a.R0();
        j.c(biometricSecurityStorage);
        InterfaceC6618a fintechAnalyticInteractor = this.f24612f.B();
        j.c(fintechAnalyticInteractor);
        R30.a appCoroutineScopes = bVar.f();
        j.c(appCoroutineScopes);
        m fintechAuthInteractor = interfaceC10835a.a1();
        j.c(fintechAuthInteractor);
        O90.a aVar = this.f24613g;
        ru.ozon.fintech.settings.domain.a fintechSettings = aVar.w0();
        j.c(fintechSettings);
        S80.b fintechNavigation = this.f24614h.d0();
        j.c(fintechNavigation);
        WalletManager walletManager = this.f24615i.t();
        j.c(walletManager);
        Intrinsics.checkNotNullParameter(walletManager, "walletManager");
        InterfaceC9791a mirPayWalletManager = walletManager.getMirPayWalletManager();
        j.d(mirPayWalletManager);
        L30.d funVibrator = this.f24600B.get();
        Ib.a cryptoSharedPreferences = Jb.d.a(this.f24601C);
        SharedPreferences sharedPreferences = bVar.getSharedPreferences();
        j.c(sharedPreferences);
        SharedPreferences sharedPreferences2 = sharedPreferences;
        h90.f notificationInteractor = this.f24616j.g1();
        j.c(notificationInteractor);
        U30.a fileManager = bVar.r1();
        j.c(fileManager);
        S30.a applicationInfoDataSource = bVar.getApplicationInfoDataSource();
        j.c(applicationInfoDataSource);
        i fintechLockScreenManager = new i();
        h fintechBrightnessManager = new h();
        V70.b audioRecordInteractor = this.f24617k.L();
        j.c(audioRecordInteractor);
        K40.a cbottomDisplay = this.f24618l.D0();
        j.c(cbottomDisplay);
        v30.d fintechAntiFraudInteractor = this.f24619m.o1();
        j.c(fintechAntiFraudInteractor);
        K80.b fintechLocationManager = this.f24620n.u0();
        j.c(fintechLocationManager);
        InterfaceC8640a forceUpdateInteractor = this.f24621o.T();
        j.c(forceUpdateInteractor);
        N60.a aVar2 = this.f24622p;
        o installedBankAppsInteractor = aVar2.b1();
        j.c(installedBankAppsInteractor);
        Q90.c featureToggles = aVar.F0();
        j.c(featureToggles);
        S50.a sensorInteractor = this.f24602D.get();
        T50.a externalTabBadgeManager = this.f24604F.get();
        n fintechUltraManager = aVar.e1();
        j.c(fintechUltraManager);
        InterfaceC9218a fintechPermissionManager = this.f24623q.k();
        j.c(fintechPermissionManager);
        Ib.a testEnvironmentManagerLazy = Jb.d.a(this.f24605G);
        C7481b appReviewInteractor = this.f24624r.Z();
        O30.b fintechLibType = bVar.M0();
        j.c(fintechLibType);
        P60.d installedAppsInteractor = aVar2.k1();
        j.c(installedAppsInteractor);
        K70.b otpSmsInteractor = this.f24628v.G();
        j.c(otpSmsInteractor);
        d70.d offlineManager = this.f24629w.j();
        j.c(offlineManager);
        g fintechEncryptManager = this.f24606H.get();
        r installedTargetAppsInteractor = aVar2.Y0();
        j.c(installedTargetAppsInteractor);
        C10877b fintechWebviewHeadersInfoProvider = this.f24630x.P();
        S60.a fintechMetrixInteractor = this.f24631y.J0();
        j.c(fintechMetrixInteractor);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        Intrinsics.checkNotNullParameter(webBridge, "webBridge");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        ExternalNetworkSettings externalNetworkSettings = this.f24610d;
        Intrinsics.checkNotNullParameter(externalNetworkSettings, "externalNetworkSettings");
        Intrinsics.checkNotNullParameter(moshi2, "moshi");
        Intrinsics.checkNotNullParameter(biometricAuth, "biometricAuth");
        Intrinsics.checkNotNullParameter(biometricSecurityStorage, "biometricSecurityStorage");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        Intrinsics.checkNotNullParameter(fintechAuthInteractor, "fintechAuthInteractor");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(mirPayWalletManager, "mirPayWalletManager");
        Intrinsics.checkNotNullParameter(funVibrator, "funVibrator");
        Intrinsics.checkNotNullParameter(cryptoSharedPreferences, "cryptoSharedPreferences");
        Intrinsics.checkNotNullParameter(sharedPreferences2, "sharedPreferences");
        Intrinsics.checkNotNullParameter(notificationInteractor, "notificationInteractor");
        Intrinsics.checkNotNullParameter(fileManager, "fileManager");
        Intrinsics.checkNotNullParameter(applicationInfoDataSource, "applicationInfoDataSource");
        Intrinsics.checkNotNullParameter(fintechLockScreenManager, "fintechLockScreenManager");
        Intrinsics.checkNotNullParameter(fintechBrightnessManager, "fintechBrightnessManager");
        Intrinsics.checkNotNullParameter(audioRecordInteractor, "audioRecordInteractor");
        Intrinsics.checkNotNullParameter(cbottomDisplay, "cbottomDisplay");
        Intrinsics.checkNotNullParameter(fintechAntiFraudInteractor, "fintechAntiFraudInteractor");
        Intrinsics.checkNotNullParameter(fintechLocationManager, "fintechLocationManager");
        Intrinsics.checkNotNullParameter(forceUpdateInteractor, "forceUpdateInteractor");
        Intrinsics.checkNotNullParameter(installedBankAppsInteractor, "installedBankAppsInteractor");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(sensorInteractor, "sensorInteractor");
        Intrinsics.checkNotNullParameter(externalTabBadgeManager, "externalTabBadgeManager");
        Intrinsics.checkNotNullParameter(fintechUltraManager, "fintechUltraManager");
        Intrinsics.checkNotNullParameter(fintechPermissionManager, "fintechPermissionManager");
        Intrinsics.checkNotNullParameter(testEnvironmentManagerLazy, "testEnvironmentManagerLazy");
        Intrinsics.checkNotNullParameter(appReviewInteractor, "appReviewInteractor");
        InterfaceC5539a esiaApi = this.f24625s;
        Intrinsics.checkNotNullParameter(esiaApi, "esiaApi");
        N30.b widgetConfig = this.f24626t;
        Intrinsics.checkNotNullParameter(widgetConfig, "widgetConfig");
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        Intrinsics.checkNotNullParameter(installedAppsInteractor, "installedAppsInteractor");
        Z30.a digRoubleApi = this.f24627u;
        Intrinsics.checkNotNullParameter(digRoubleApi, "digRoubleApi");
        Intrinsics.checkNotNullParameter(otpSmsInteractor, "otpSmsInteractor");
        Intrinsics.checkNotNullParameter(offlineManager, "offlineManager");
        Intrinsics.checkNotNullParameter(fintechEncryptManager, "fintechEncryptManager");
        Intrinsics.checkNotNullParameter(installedTargetAppsInteractor, "installedTargetAppsInteractor");
        Intrinsics.checkNotNullParameter(fintechWebviewHeadersInfoProvider, "fintechWebviewHeadersInfoProvider");
        Intrinsics.checkNotNullParameter(fintechMetrixInteractor, "fintechMetrixInteractor");
        Moshi.a g10 = moshi2.g();
        g10.a(new AtomDTOAdapterFactory());
        return new NativeBridgeConfigurator(fintechSettings, fintechNavigation, webBridge, okHttpClient, externalNetworkSettings, digRoubleApi, application, exchanger, new Moshi(g10), biometricAuth, biometricSecurityStorage, fintechAnalyticInteractor, appCoroutineScopes, audioRecordInteractor, installedBankAppsInteractor, installedTargetAppsInteractor, fintechAuthInteractor, mirPayWalletManager, funVibrator, cryptoSharedPreferences, sharedPreferences2, fileManager, forceUpdateInteractor, notificationInteractor, applicationInfoDataSource, cbottomDisplay, fintechAntiFraudInteractor, fintechLocationManager, featureToggles, sensorInteractor, externalTabBadgeManager, fintechUltraManager, appReviewInteractor, fintechPermissionManager, testEnvironmentManagerLazy, esiaApi, fintechLibType, widgetConfig, installedAppsInteractor, otpSmsInteractor, offlineManager, fintechWebviewHeadersInfoProvider, fintechLockScreenManager, fintechBrightnessManager, fintechEncryptManager, fintechMetrixInteractor);
    }
}
