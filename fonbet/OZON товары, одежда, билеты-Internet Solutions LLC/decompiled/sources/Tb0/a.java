package Tb0;

import De.C2862e;
import Fb0.o;
import Hb0.f;
import Kb0.C3452e;
import Kb0.C3487w;
import Kb0.K;
import Kb0.U0;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.s;
import We.B;
import We.InterfaceC4875q;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import android.view.ViewGroup;
import dc0.C6170p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.AbToolBaseApi;
import ru.ozon.app.android.abtool.AbToolLibsApi;
import ru.ozon.app.android.abtool.AbToolNamespace;
import ru.ozon.app.android.core.navigation.interceptors.AuthDestinationInterceptorImpl$startOzonIdSdkAuth$1;
import ru.ozon.app.android.limb2.di.modules.Limb2PluginProvidersModule$provideOzonIdPluginProvider$1;
import ru.ozon.app.android.session.accountRecoveryStart.AccountRecoveryStartDeeplinkHandler$startFlowForSignInUser$1;
import ru.ozon.app.android.session.logout.customActions.LogoutActionHandlerImpl$processAction$1;
import ru.ozon.app.android.storefront.onboardingscreen.screen.OnboardingFlowFragmentViewModel$signIn$2;
import ru.ozon.app.android.switchUser.SwitchUserDestinationInterceptor$blockingSwitchUser$1$1$1;
import ru.ozon.id.antibot.callback.presentation.FullScreenAntibotActivity;
import ru.ozon.id.logout.presentation.LogoutActivity;
import ru.ozon.id.nativeauth.crossApp.CrossAppAuthActivity;
import ru.ozon.id.nativeauth.data.models.AuthTokenDTO;
import ru.ozon.id.nativeauth.main.activity.AuthFlowActivity;
import ru.ozon.id.nativeauth.sso2.Sso2FullScreenErrorActivity;
import xb0.InterfaceC10697b;
import xe.C10727i;
import xe.M;
import zb0.AbstractC11016a;
import zb0.c;
import zb0.f;
import zb0.i;

/* loaded from: classes7.dex */
public final class a implements Ob0.a, InterfaceC10697b {

    /* renamed from: d, reason: collision with root package name */
    private static volatile K f26975d;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ld0.c f26976a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Limb2PluginProvidersModule$provideOzonIdPluginProvider$1 f26977b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2862e f26978c;

    /* renamed from: Tb0.a$a, reason: collision with other inner class name */
    public static final class C0538a {
        public static final void a() {
            if (!Fb0.h.a() && Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
                throw new IllegalStateException("OzonID methods should not be called from main thread until OzonID is initialized");
            }
        }

        @NotNull
        public static K b() {
            K k11 = a.f26975d;
            if (k11 != null) {
                return k11;
            }
            throw new Lb0.a();
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26979a;

        static {
            int[] iArr = new int[Fb0.e.values().length];
            try {
                iArr[Fb0.e.OZON_RU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Fb0.e.OZONRU_CN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Fb0.e.OZONRU_ME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Fb0.e.OZONRUCN_ME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f26979a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.limb.plugin.OzonIdPlugin$onInstantPluginsCreated$1", f = "OzonIdPlugin.kt", l = {194, 198}, m = "invokeSuspend")
    static final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f26980d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f26981e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j11, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f26981e = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f26981e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
        
            if (r6.a(r5) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
        
            if (Fb0.o.m(r6, r5.f26981e, r5) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f26980d;
            if (i11 == 0) {
                s.b(obj);
                K k11 = a.f26975d;
                if (k11 == null) {
                    throw new Lb0.a();
                }
                this.f26980d = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                s.b(obj);
            }
            Fb0.h.b();
            o.i().complete(new Long(SystemClock.elapsedRealtime()));
            K k12 = a.f26975d;
            if (k12 == null) {
                throw new Lb0.a();
            }
            Jc0.j value = k12.E().getValue();
            this.f26980d = 2;
        }
    }

    public a(@NotNull Ld0.c limbDiStore, @NotNull Application application, @NotNull Limb2PluginProvidersModule$provideOzonIdPluginProvider$1 ozonIdConfig) {
        List<zb0.g> list;
        Intrinsics.checkNotNullParameter(limbDiStore, "store");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(ozonIdConfig, "config");
        this.f26976a = limbDiStore;
        this.f26977b = ozonIdConfig;
        this.f26978c = td0.f.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Vb0.b.f28514a.getClass();
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        Intrinsics.checkNotNullParameter(limbDiStore, "limbDiStore");
        Vb0.b.f28515b = ozonIdConfig;
        Vb0.b.f28516c = limbDiStore;
        Fb0.f m4clone = ozonIdConfig.m4clone();
        List<Ld0.f> f7 = limbDiStore.f();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = f7.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Ld0.f fVar = (Ld0.f) it.next();
            zb0.d dVar = fVar instanceof zb0.d ? (zb0.d) fVar : null;
            c.b c11 = dVar != null ? dVar.c() : null;
            if (c11 != null) {
                arrayList.add(c11);
            }
        }
        ArrayList W02 = C7714v.W0(arrayList);
        c.b onAuthCookieEvent = this.f26977b.getOnAuthCookieEvent();
        if (onAuthCookieEvent != null) {
            W02.add(onAuthCookieEvent);
        }
        List<Ld0.f> f11 = this.f26976a.f();
        ArrayList arrayList2 = new ArrayList();
        for (Ld0.f fVar2 : f11) {
            i iVar = fVar2 instanceof i ? (i) fVar2 : null;
            f.a c12 = iVar != null ? iVar.c() : null;
            if (c12 != null) {
                arrayList2.add(c12);
            }
        }
        ArrayList W03 = C7714v.W0(arrayList2);
        f.a cookieEventListener = this.f26977b.getCookieEventListener();
        if (cookieEventListener != null) {
            W03.add(cookieEventListener);
        }
        List<Ld0.f> f12 = this.f26976a.f();
        ArrayList arrayList3 = new ArrayList();
        for (Ld0.f fVar3 : f12) {
            zb0.h hVar = fVar3 instanceof zb0.h ? (zb0.h) fVar3 : null;
            if (hVar == null || (list = hVar.c()) == null) {
                list = kotlin.collections.K.f71697a;
            }
            C7714v.p(list, arrayList3);
        }
        ArrayList W04 = C7714v.W0(arrayList3);
        W04.addAll(this.f26977b.getOzonIdCookieHandlers());
        f26975d = new K(application, limbDiStore, m4clone, W02, W03, W04);
        C10727i.c(this.f26978c, null, null, new f(this, null), 3);
        if (this.f26977b.getHostFeatureFlagsProvider() != null && this.f26977b.getFeatureFlagsProvider() != null) {
            throw new IllegalArgumentException("At least one of OzonIdConfig.hostFeatureFlagsProvider or OzonIdConfig.featureFlagsProvider must be null");
        }
        o.h().complete(new Pair<>(Long.valueOf(elapsedRealtime), Long.valueOf(SystemClock.elapsedRealtime())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R() {
        Function2<Ld0.c, Hb0.c, Unit> hostFeatureFlagsProvider;
        Limb2PluginProvidersModule$provideOzonIdPluginProvider$1 limb2PluginProvidersModule$provideOzonIdPluginProvider$1 = this.f26977b;
        Function1<Ld0.c, Unit> featureFlagsProvider = limb2PluginProvidersModule$provideOzonIdPluginProvider$1.getFeatureFlagsProvider();
        Ld0.c cVar = this.f26976a;
        if (featureFlagsProvider != null) {
            Function1<Ld0.c, Unit> featureFlagsProvider2 = limb2PluginProvidersModule$provideOzonIdPluginProvider$1.getFeatureFlagsProvider();
            if (featureFlagsProvider2 != null) {
                featureFlagsProvider2.invoke(cVar);
                return;
            }
            return;
        }
        if (limb2PluginProvidersModule$provideOzonIdPluginProvider$1.getHostFeatureFlagsProvider() == null || (hostFeatureFlagsProvider = limb2PluginProvidersModule$provideOzonIdPluginProvider$1.getHostFeatureFlagsProvider()) == null) {
            return;
        }
        hostFeatureFlagsProvider.invoke(cVar, C0538a.b().z().getValue());
    }

    @Override // xb0.InterfaceC10697b
    @NotNull
    public final d B() {
        return new d(this);
    }

    @Override // Ob0.a
    @NotNull
    public final Intent D(@NotNull AccountRecoveryStartDeeplinkHandler$startFlowForSignInUser$1 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        C0538a.a();
        Fb0.h.c();
        int i11 = AuthFlowActivity.f97290u;
        return AuthFlowActivity.a.a(config.getActivity(), new Tb0.b(config));
    }

    @Override // Ob0.a
    public final void F(@NotNull ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        C0538a.b().R().getValue().e(rootView);
    }

    @Override // xb0.InterfaceC10696a
    public final boolean I() {
        return C0538a.b().w().getValue().e();
    }

    @Override // Ob0.a
    public final Object K(@NotNull Pb0.b bVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object e11 = C6170p.e(C0538a.b().t().f().getValue(), bVar.getRestoreRequiredCookie(), bVar.getClearAccountManager(), cVar, 4);
        return e11 == Wc.a.COROUTINE_SUSPENDED ? e11 : Unit.f71690a;
    }

    @Override // Ob0.a
    @NotNull
    public final Cb0.h L() {
        return C0538a.b().L().getValue();
    }

    @Override // xb0.InterfaceC10696a
    @NotNull
    public final AbstractC11016a M() {
        return C0538a.b().t().e().getValue();
    }

    @NotNull
    public final Od0.a Q(@NotNull Uri uri, @NotNull String path) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(path, "path");
        return C0538a.b().H().getValue().a(uri, path, this.f26976a);
    }

    @Override // Ob0.a
    @NotNull
    public final Intent b(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C0538a.a();
        Fb0.h.c();
        int i11 = AuthFlowActivity.f97290u;
        return AuthFlowActivity.a.b(activity);
    }

    @Override // Ob0.a
    @NotNull
    public final Intent g(@NotNull Pb0.e config) {
        Intrinsics.checkNotNullParameter(config, "config");
        C0538a.a();
        Fb0.h.c();
        int i11 = AuthFlowActivity.f97290u;
        return AuthFlowActivity.a.f(config.getActivity(), config.getOtpToken(), config.getOnOtpFlowResult());
    }

    @Override // Ob0.a
    @NotNull
    public final Fb0.a getBiometryAuth() {
        return C0538a.b().q().getValue();
    }

    @Override // xb0.InterfaceC10696a
    @NotNull
    public final InterfaceC4875q getCookieJar() {
        return C0538a.b().t().g().getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xb0.InterfaceC10696a
    @NotNull
    public final List<B> getInterceptors() {
        InterfaceC4008j interfaceC4008j;
        InterfaceC4008j interfaceC4008j2;
        InterfaceC4008j interfaceC4008j3;
        int i11 = C3487w.f15747t;
        interfaceC4008j = C3487w.f15746s;
        interfaceC4008j2 = C3487w.f15744q;
        int i12 = C3452e.f15604r;
        interfaceC4008j3 = C3452e.f15603q;
        return C7714v.b0(C3487w.f15742o.getValue(), interfaceC4008j.getValue(), interfaceC4008j2.getValue(), interfaceC4008j3.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xb0.InterfaceC10696a
    @NotNull
    public final List<B> getNetworkInterceptors() {
        InterfaceC4008j interfaceC4008j;
        InterfaceC4008j interfaceC4008j2;
        int i11 = U0.f15559i;
        interfaceC4008j = U0.f15558h;
        int i12 = C3452e.f15604r;
        interfaceC4008j2 = C3452e.f15602p;
        return C7714v.b0(interfaceC4008j.getValue(), interfaceC4008j2.getValue());
    }

    @Override // xb0.InterfaceC10696a
    public final String getSessionId() {
        return C0538a.b().w().getValue().b();
    }

    @Override // xb0.InterfaceC10696a
    public final long getUserId() {
        Long d11 = C0538a.b().w().getValue().d();
        if (d11 != null) {
            return d11.longValue();
        }
        return 0L;
    }

    @Override // Ob0.a
    @NotNull
    public final Jc0.b h() {
        return C0538a.b().D().getValue();
    }

    @Override // Ob0.a
    public final void l(@NotNull OnboardingFlowFragmentViewModel$signIn$2 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (!C0538a.b().t().h().getValue().b().j()) {
            int i11 = AuthFlowActivity.f97290u;
            AuthFlowActivity.a.d(config.getActivity(), config.getStartDeeplink(), config.getIsCloseButtonVisible(), config.getExtraPage());
        } else {
            boolean z11 = true;
            Fb0.d.a(new Fb0.c(z11, (AuthTokenDTO) null, 6), Gb0.d.LOGIN, true);
        }
    }

    @Override // Ob0.a
    @NotNull
    public final Ib0.d n() {
        return C0538a.b().p().getValue();
    }

    @Override // Ld0.e
    public final void onInstantPluginsCreated() {
        long currentTimeMillis = System.currentTimeMillis();
        Ld0.e d11 = this.f26976a.d(AbToolBaseApi.class);
        AbToolLibsApi abToolLibsApi = d11 instanceof AbToolLibsApi ? (AbToolLibsApi) d11 : null;
        R();
        Limb2PluginProvidersModule$provideOzonIdPluginProvider$1 limb2PluginProvidersModule$provideOzonIdPluginProvider$1 = this.f26977b;
        if (limb2PluginProvidersModule$provideOzonIdPluginProvider$1.getFeatureFlagsProvider() != null) {
            K k11 = f26975d;
            if (k11 == null) {
                throw new Lb0.a();
            }
            Boolean bool = (Boolean) k11.z().getValue().b(f.p.f10814a);
            bool.getClass();
            K k12 = f26975d;
            if (k12 == null) {
                throw new Lb0.a();
            }
            k12.z().getValue().c(f.o.f10813a, bool);
        } else if (limb2PluginProvidersModule$provideOzonIdPluginProvider$1.getHostFeatureFlagsProvider() != null) {
            Boolean bool2 = (Boolean) C0538a.b().z().getValue().b(f.p.f10814a);
            bool2.getClass();
            C0538a.b().z().getValue().c(f.o.f10813a, bool2);
        }
        C0538a.b().y().b();
        if (abToolLibsApi != null) {
            abToolLibsApi.addOnChangeFeaturesListener(AbToolNamespace.DEFAULT, new e(this));
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        o.l(C0538a.b());
        C10727i.c(this.f26978c, He.b.f10879b, null, new c(currentTimeMillis2, null), 2);
        o.j().complete(Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // Ob0.a
    public final boolean p(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return (activity instanceof AuthFlowActivity) || (activity instanceof CrossAppAuthActivity) || (activity instanceof LogoutActivity) || (activity instanceof FullScreenAntibotActivity) || (activity instanceof Sso2FullScreenErrorActivity);
    }

    @Override // Ob0.a
    public final void q(@NotNull SwitchUserDestinationInterceptor$blockingSwitchUser$1$1$1 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        C0538a.a();
        Fb0.h.c();
        C0538a.b().Z().getValue().b(config.getUserId(), config.getOnResult());
    }

    @Override // xb0.InterfaceC10696a
    public final void r(@NotNull Pb0.a config) {
        Intrinsics.checkNotNullParameter(config, "config");
        C0538a.a();
        Fb0.h.c();
        C0538a.b().t().n().getValue().f(config.getWebView());
    }

    @Override // Ob0.a
    public final void s(@NotNull LogoutActionHandlerImpl$processAction$1 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        C0538a.b().K().getValue().a(config.getActivity());
    }

    @Override // Ob0.a
    public final Intent t(@NotNull AuthDestinationInterceptorImpl$startOzonIdSdkAuth$1 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (C0538a.b().t().h().getValue().b().j()) {
            return null;
        }
        int i11 = AuthFlowActivity.f97290u;
        return AuthFlowActivity.a.e(config.getActivity(), config.getStartDeeplink(), config.getIsCloseButtonVisible(), config.getExtraPage());
    }

    @Override // Ob0.a
    @InterfaceC3999a
    public final String w() {
        return C0538a.b().w().getValue().a();
    }

    @Override // Ob0.a
    public final void z() {
        C0538a.b().R().getValue().d();
    }
}
