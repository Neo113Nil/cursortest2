package Pc0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Dc0.q;
import De.C2862e;
import Ib0.c;
import Kb0.K;
import Pc0.b;
import Pc0.g;
import Sc.InterfaceC4008j;
import Sc.o;
import Sc.r;
import Sc.s;
import Vb0.b;
import Zc0.n;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.MimeTypeMap;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import cd0.m;
import com.google.android.gms.common.internal.ImagesContract;
import fd0.C6514b;
import ic0.C7045a;
import ic0.C7046b;
import java.util.Map;
import jc0.C7344g;
import jc0.C7346i;
import jd0.C7354g;
import jd0.C7355h;
import jd0.p;
import kc0.C7645c;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.crossApp.dto.CrossAppChallengeResponseDto;
import ru.ozon.id.nativeauth.data.models.AuthActionDTO;
import ru.ozon.id.nativeauth.data.models.AuthTokenDTO;
import ru.ozon.id.nativeauth.data.models.FastEntryActionDTO;
import xe.C10720e0;
import xe.C10727i;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;
import ze.C11115c;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f22161a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Application f22162b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f22163c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f22164d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C7344g> f22165e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f22166f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f22167g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f22168h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C11115c f22169i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<Pc0.g> f22170j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C2862e f22171k;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22172a;

        static {
            int[] iArr = new int[b.EnumC0438b.values().length];
            try {
                iArr[b.EnumC0438b.ENTRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.EnumC0438b.PHONE_ACCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.EnumC0438b.PHONE_ACCESS_OTP_FLOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.EnumC0438b.OTP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.EnumC0438b.OTP_FLOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.EnumC0438b.RESTORE_ACCESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.EnumC0438b.ACCOUNT_MERGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[b.EnumC0438b.PAGE_NOTIFICATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[b.EnumC0438b.PAGE_SOCIAL_ADDITIONAL_INFO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[b.EnumC0438b.PAGE_AGREEMENT_WITH_CONDITIONS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[b.EnumC0438b.WEBVIEW.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[b.EnumC0438b.FINTECH_RECOVERY_CAMERA.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f22172a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.navigation.AuthRouter$closeFlow$1", f = "AuthRouter.kt", l = {251}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f22173d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f22173d;
            if (i11 == 0) {
                s.b(obj);
                c cVar = c.this;
                Pc0.g dVar = cVar.f22163c ? new g.d(new Fb0.c(false, (AuthTokenDTO) null, 6)) : g.c.f22203a;
                C11115c c11115c = cVar.f22169i;
                this.f22173d = 1;
                if (c11115c.n(dVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.navigation.AuthRouter$goBack$1", f = "AuthRouter.kt", l = {243}, m = "invokeSuspend")
    /* renamed from: Pc0.c$c, reason: collision with other inner class name */
    static final class C0439c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f22175d;

        C0439c(kotlin.coroutines.d<? super C0439c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new C0439c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0439c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f22175d;
            if (i11 == 0) {
                s.b(obj);
                c cVar = c.this;
                if (cVar.n().e()) {
                    cVar.l();
                } else {
                    c.e(cVar).j();
                    cVar.n().g();
                    C11115c c11115c = cVar.f22169i;
                    g.a aVar2 = g.a.f22201a;
                    this.f22175d = 1;
                    if (c11115c.n(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.navigation.AuthRouter$navigateBy$1", f = "AuthRouter.kt", l = {}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f22178e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f22178e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new d(this.f22178e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            c.h(c.this, this.f22178e);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.navigation.AuthRouter$onAction$1", f = "AuthRouter.kt", l = {446, 448}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f22179d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AuthActionDTO f22180e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ c f22181f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(c cVar, kotlin.coroutines.d dVar, AuthActionDTO authActionDTO) {
            super(2, dVar);
            this.f22180e = authActionDTO;
            this.f22181f = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new e(this.f22181f, dVar, this.f22180e);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        
            if (Pc0.c.b(r6, r4, r7) == r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
        
            if (Pc0.c.a(r6, r7, r8) == r0) goto L29;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f22179d;
            if (i11 == 0) {
                s.b(obj);
                AuthActionDTO authActionDTO = this.f22180e;
                AuthActionDTO.StatusDTO status = authActionDTO.getStatus();
                String deeplink = status != null ? status.getDeeplink() : null;
                AuthActionDTO.StatusDTO status2 = authActionDTO.getStatus();
                boolean d11 = status2 != null ? Intrinsics.d(status2.isCompleted(), Boolean.TRUE) : false;
                c cVar = this.f22181f;
                if (d11) {
                    AuthActionDTO.StatusDTO status3 = authActionDTO.getStatus();
                    String otpResponseToken = status3 != null ? status3.getOtpResponseToken() : null;
                    if (otpResponseToken != null) {
                        this.f22179d = 1;
                    } else {
                        this.f22179d = 2;
                    }
                } else {
                    if (deeplink == null) {
                        throw new IllegalStateException(("Wrong navigation on action = " + authActionDTO).toString());
                    }
                    c.h(cVar, deeplink);
                }
            } else {
                if (i11 != 1 && i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.navigation.AuthRouter$openAppSettings$1", f = "AuthRouter.kt", l = {}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {
        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new f(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            c cVar = c.this;
            Intent addFlags = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", cVar.f22162b.getPackageName(), null)).addFlags(268435456);
            Intrinsics.checkNotNullExpressionValue(addFlags, "addFlags(...)");
            cVar.f22162b.startActivity(addFlags);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.navigation.AuthRouter$openBiometryDialog$1", f = "AuthRouter.kt", l = {489}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f22183d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ g.h f22185f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(g.h hVar, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f22185f = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new g(this.f22185f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f22183d;
            if (i11 == 0) {
                s.b(obj);
                C11115c c11115c = c.this.f22169i;
                this.f22183d = 1;
                if (c11115c.n(this.f22185f, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.navigation.AuthRouter$safeBackToRoot$1", f = "AuthRouter.kt", l = {196}, m = "invokeSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f22186d;

        public static final class a extends c.a.b {
        }

        h(kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new h(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f22186d;
            if (i11 == 0) {
                s.b(obj);
                a aVar2 = new a();
                C11115c c11115c = c.this.f22169i;
                g.e eVar = new g.e(aVar2);
                this.f22186d = 1;
                if (c11115c.n(eVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.navigation.AuthRouter$safeBackToRoot$2", f = "AuthRouter.kt", l = {203}, m = "invokeSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f22188d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f22190f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(boolean z11, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f22190f = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new i(this.f22190f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f22188d;
            c cVar = c.this;
            if (i11 == 0) {
                s.b(obj);
                C11115c c11115c = cVar.f22169i;
                g.b bVar = g.b.f22202a;
                this.f22188d = 1;
                if (c11115c.n(bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            if (this.f22190f) {
                c.e(cVar).hideLoader();
            } else {
                c.h(cVar, "ozon://ozonIdPageEntry");
            }
            return Unit.f71690a;
        }
    }

    public static final class j extends kotlin.coroutines.a implements J {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f22191a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC4008j f22192b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(J.a aVar, c cVar, InterfaceC4008j interfaceC4008j) {
            super(aVar);
            this.f22191a = cVar;
            this.f22192b = interfaceC4008j;
        }

        @Override // xe.J
        public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
            b.a.c(Vb0.b.f28514a, th2);
            this.f22191a.D();
            ((Nc0.f) this.f22192b.getValue()).v(th2);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.navigation.AuthRouter$startAuthFlow$1", f = "AuthRouter.kt", l = {}, m = "invokeSuspend")
    static final class k extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f22194e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
            this.f22194e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new k(this.f22194e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Uri parse;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            c cVar = c.this;
            if (cVar.f22163c) {
                if (c.j(cVar)) {
                    return Unit.f71690a;
                }
                String str = cVar.f22161a;
                String encodedQuery = (str == null || (parse = Uri.parse(str)) == null) ? null : parse.getEncodedQuery();
                Uri.Builder buildUpon = Uri.parse("ozon://ozonIdPageEntry").buildUpon();
                if (encodedQuery != null) {
                    buildUpon.encodedQuery(encodedQuery);
                }
                String uri = buildUpon.appendQueryParameter("isFirstAuthScreenQueryParam", String.valueOf(true)).build().toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                c.h(cVar, uri);
            }
            String str2 = this.f22194e;
            if (str2 != null) {
                c.h(cVar, str2);
            }
            String str3 = cVar.f22161a;
            if (str3 != null && str3.length() != 0 && str2 == null) {
                c.h(cVar, cVar.f22161a);
            }
            return Unit.f71690a;
        }
    }

    public c(String str, @NotNull Application application, boolean z11, boolean z12, @NotNull InterfaceC4008j<C7344g> otpResultListenerHolder, @NotNull InterfaceC4008j<Pc0.a> authBackStack, @NotNull InterfaceC4008j<Nc0.f> mainScreenContainer, @NotNull InterfaceC4008j<Ib0.e> authEvents) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(otpResultListenerHolder, "otpResultListenerHolder");
        Intrinsics.checkNotNullParameter(authBackStack, "authBackStack");
        Intrinsics.checkNotNullParameter(mainScreenContainer, "mainScreenContainer");
        Intrinsics.checkNotNullParameter(authEvents, "authEvents");
        this.f22161a = str;
        this.f22162b = application;
        this.f22163c = z11;
        this.f22164d = z12;
        this.f22165e = otpResultListenerHolder;
        this.f22166f = authBackStack;
        this.f22167g = mainScreenContainer;
        this.f22168h = authEvents;
        C11115c a11 = ze.k.a(0, 7, null);
        this.f22169i = a11;
        this.f22170j = C2399j.H(a11);
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f22171k = N.g(N.g(N.a(He.b.f10879b), X0.b()), new j(J.f105405n0, this, mainScreenContainer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        boolean z11 = this.f22164d;
        C2862e c2862e = this.f22171k;
        if (z11) {
            C10727i.c(c2862e, null, null, new h(null), 3);
        } else {
            td0.f.b(c2862e, null, new i(n().a(), null));
        }
    }

    public static final Object a(c cVar, kotlin.coroutines.d dVar, AuthActionDTO authActionDTO) {
        cVar.getClass();
        AuthActionDTO.a data = authActionDTO.getData();
        AuthTokenDTO authToken = data != null ? data.getAuthToken() : null;
        boolean z11 = authToken != null;
        AuthActionDTO.StatusDTO status = authActionDTO.getStatus();
        Object n11 = cVar.f22169i.n(new g.d(new Fb0.c(z11, authToken, status != null ? status.getDeeplink() : null)), dVar);
        return n11 == Wc.a.COROUTINE_SUSPENDED ? n11 : Unit.f71690a;
    }

    public static final Object b(c cVar, String str, kotlin.coroutines.d dVar) {
        if (cVar.f22164d) {
            Object n11 = cVar.f22169i.n(new g.e(new Pc0.d(str)), dVar);
            return n11 == Wc.a.COROUTINE_SUSPENDED ? n11 : Unit.f71690a;
        }
        cVar.f22165e.getValue().b(str);
        return Unit.f71690a;
    }

    public static final Nc0.f e(c cVar) {
        return (Nc0.f) cVar.f22167g.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x031e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(c cVar, String link) {
        Uri uri;
        Object a11;
        String str;
        Pc0.b m11;
        Uri parse;
        String scheme;
        Object obj;
        boolean z11;
        boolean z12;
        Pc0.b b11;
        String b12;
        cVar.getClass();
        if (Intrinsics.d(link, "ozon://back")) {
            cVar.q();
            return;
        }
        if (Intrinsics.d(link, "ozon://root")) {
            cVar.D();
            return;
        }
        boolean z13 = false;
        if (kotlin.text.h.e0(link, "ozon://closeFlow", false)) {
            String queryParameter = Uri.parse(link).getQueryParameter("deeplink");
            if (queryParameter != null) {
                ((Ib0.e) cVar.f22168h.getValue()).k(new Ib0.a(queryParameter));
            }
            cVar.l();
            return;
        }
        try {
            uri = Uri.parse(link);
        } catch (Exception unused) {
            uri = null;
        }
        boolean d11 = Intrinsics.d(uri != null ? uri.getScheme() : null, "ozon");
        C2862e c2862e = cVar.f22171k;
        if (d11 && Intrinsics.d(uri.getHost(), "fincamera")) {
            Intrinsics.checkNotNullParameter(link, "link");
            q qVar = new q();
            qVar.setArguments(androidx.core.os.d.b(new Pair("link", link)));
            td0.f.b(c2862e, null, new Pc0.e(cVar, new g.h(qVar), null));
            return;
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(link));
        if (mimeTypeFromExtension != null ? mimeTypeFromExtension.equals("application/pdf") : false) {
            Uri parse2 = Uri.parse(link);
            Intent intent = new Intent("android.intent.action.VIEW", parse2);
            intent.setDataAndType(parse2, "application/pdf");
            C10727i.c(c2862e, null, null, new Pc0.f(cVar, intent, null), 3);
            return;
        }
        if (C7354g.a(link)) {
            C10727i.c(c2862e, null, null, new Pc0.f(cVar, new Intent("android.intent.action.VIEW", Uri.parse(link)), null), 3);
            return;
        }
        Pc0.b b13 = cVar.n().b();
        b.EnumC0438b d12 = b13 != null ? b13.d() : null;
        b.EnumC0438b enumC0438b = b.EnumC0438b.WEBVIEW;
        if (d12 == enumC0438b && C7346i.a(link)) {
            cVar.C(link);
            return;
        }
        if (kotlin.text.h.e0(link, "ozon://ozonIdPageEntry", false)) {
            m11 = m(b.EnumC0438b.ENTRY, link);
        } else if (kotlin.text.h.e0(link, "ozon://ozonIdPageOtpFlow", false)) {
            m11 = m(b.EnumC0438b.OTP_FLOW, link);
        } else if (kotlin.text.h.e0(link, "ozon://ozonIdPageOtp", false)) {
            m11 = m(b.EnumC0438b.OTP, link);
        } else if (kotlin.text.h.e0(link, "ozon://ozonIdPagePhoneAccessOtpFlow", false)) {
            m11 = m(b.EnumC0438b.PHONE_ACCESS_OTP_FLOW, link);
        } else if (kotlin.text.h.e0(link, "ozon://ozonIdPagePhoneAccess", false)) {
            m11 = m(b.EnumC0438b.PHONE_ACCESS, link);
        } else if (kotlin.text.h.e0(link, "ozon://web", false)) {
            String queryParameter2 = Uri.parse(link).getQueryParameter(ImagesContract.URL);
            if (queryParameter2 == null || !C7346i.a(queryParameter2)) {
                queryParameter2 = null;
            }
            if (queryParameter2 != null) {
                m11 = m(enumC0438b, queryParameter2);
            }
            m11 = null;
        } else if (kotlin.text.h.e0(link, "ozon://ozonIdPageCellList", false)) {
            m11 = m(b.EnumC0438b.RESTORE_ACCESS, link);
        } else if (kotlin.text.h.e0(link, "ozon://ozonIdPageAccountMerge", false)) {
            m11 = m(b.EnumC0438b.ACCOUNT_MERGE, link);
        } else if (kotlin.text.h.e0(link, "ozon://ozonIdPageNotification", false)) {
            m11 = m(b.EnumC0438b.PAGE_NOTIFICATION, link);
        } else if (kotlin.text.h.e0(link, "ozon://ozonIdPageSocialAdditionalOption", false)) {
            m11 = m(b.EnumC0438b.PAGE_SOCIAL_ADDITIONAL_INFO, link);
        } else if (kotlin.text.h.e0(link, "ozon://ozonIdPageAgreementWithConditions", false)) {
            m11 = m(b.EnumC0438b.PAGE_AGREEMENT_WITH_CONDITIONS, link);
        } else {
            if (kotlin.text.h.t(link, "ozonid/account-recovery-start", false)) {
                try {
                    r.Companion companion = r.INSTANCE;
                    parse = Uri.parse(link);
                    scheme = parse.getScheme();
                } catch (Throwable th2) {
                    r.Companion companion2 = r.INSTANCE;
                    a11 = s.a(th2);
                }
                if (scheme != null) {
                    int hashCode = scheme.hashCode();
                    if (hashCode != 3213448) {
                        if (hashCode == 99617003) {
                            obj = parse;
                            if (!scheme.equals("https")) {
                            }
                        }
                    } else if (scheme.equals("http")) {
                        obj = parse.buildUpon().scheme("https").build();
                    }
                    a11 = obj.toString();
                    if (a11 instanceof r.b) {
                        a11 = link;
                    }
                    str = (String) a11;
                    if (!C7346i.a(str)) {
                        str = null;
                    }
                    if (str != null) {
                        m11 = m(b.EnumC0438b.WEBVIEW, str);
                    }
                }
                K k11 = Tb0.a.f26975d;
                if (k11 == null) {
                    throw new Lb0.a();
                }
                String l11 = k11.N().getPrimaryDomain().l();
                String uri2 = parse.toString();
                Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
                obj = "https://" + l11 + "/" + kotlin.text.h.i0(uri2, "ozon://");
                a11 = obj.toString();
                if (a11 instanceof r.b) {
                }
                str = (String) a11;
                if (!C7346i.a(str)) {
                }
                if (str != null) {
                }
            }
            m11 = null;
        }
        Pc0.b b14 = cVar.n().b();
        b.EnumC0438b d13 = b14 != null ? b14.d() : null;
        boolean z14 = d13 == b.EnumC0438b.OTP || d13 == b.EnumC0438b.OTP_FLOW || d13 == b.EnumC0438b.WEBVIEW;
        Uri parse3 = Uri.parse(link);
        boolean z15 = m11 != null && cVar.n().d();
        boolean d14 = Intrinsics.d(parse3.getQueryParameter("transitionType"), "replace");
        if (d13 == (m11 != null ? m11.d() : null) && z14 && !d14) {
            String b15 = m11 != null ? m11.b() : null;
            if (b15 == null || (b11 = cVar.n().b()) == null || (b12 = b11.b()) == null || s(b15) == s(b12)) {
                z11 = true;
                boolean z16 = d13 != b.EnumC0438b.PHONE_ACCESS || d13 == b.EnumC0438b.PHONE_ACCESS_OTP_FLOW;
                if (!z14 || z16) {
                    if ((m11 == null ? m11.d() : null) != b.EnumC0438b.RESTORE_ACCESS && m11 != null && m11.d() != b.EnumC0438b.WEBVIEW) {
                        z12 = true;
                        if (parse3.getScheme() != null && !Intrinsics.d(parse3.getScheme(), "ozon")) {
                            z13 = true;
                        }
                        if (!z15) {
                            cVar.r(m11, true);
                            return;
                        }
                        if (z11) {
                            Intrinsics.f(m11);
                            cVar.C(m11.b());
                            return;
                        } else {
                            if (z12) {
                                cVar.r(m11, true);
                                return;
                            }
                            if (m11 != null) {
                                cVar.r(m11, d14);
                                return;
                            } else if (z13) {
                                C10727i.c(c2862e, null, null, new Pc0.f(cVar, new Intent("android.intent.action.VIEW", parse3), null), 3);
                                return;
                            } else {
                                cVar.D();
                                return;
                            }
                        }
                    }
                }
                z12 = false;
                if (parse3.getScheme() != null) {
                    z13 = true;
                }
                if (!z15) {
                }
            }
        }
        z11 = false;
        if (d13 != b.EnumC0438b.PHONE_ACCESS) {
        }
        if (!z14) {
        }
        if ((m11 == null ? m11.d() : null) != b.EnumC0438b.RESTORE_ACCESS) {
            z12 = true;
            if (parse3.getScheme() != null) {
            }
            if (!z15) {
            }
        }
        z12 = false;
        if (parse3.getScheme() != null) {
        }
        if (!z15) {
        }
    }

    public static final boolean j(c cVar) {
        return !cVar.n().d();
    }

    private static final Pc0.b m(b.EnumC0438b enumC0438b, String str) {
        return new Pc0.b(P4.f.b("toString(...)"), str, enumC0438b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pc0.a n() {
        return (Pc0.a) this.f22166f.getValue();
    }

    private final void r(Pc0.b bVar, boolean z11) {
        ComponentCallbacksC5392m c7645c;
        Object hVar;
        int i11 = a.f22172a[bVar.d().ordinal()];
        InterfaceC4008j interfaceC4008j = this.f22167g;
        switch (i11) {
            case 1:
                String screenId = bVar.c();
                Intrinsics.checkNotNullParameter(screenId, "screenId");
                c7645c = new C7645c();
                c7645c.setArguments(androidx.core.os.d.b(new Pair("screen_id_args_key", screenId)));
                break;
            case 2:
            case 3:
                String screenId2 = bVar.c();
                Intrinsics.checkNotNullParameter(screenId2, "screenId");
                c7645c = new C6514b();
                c7645c.setArguments(androidx.core.os.d.b(new Pair("screen_id_args_key", screenId2)));
                break;
            case 4:
            case 5:
                String screenId3 = bVar.c();
                Intrinsics.checkNotNullParameter(screenId3, "screenId");
                c7645c = new Wc0.b();
                c7645c.setArguments(androidx.core.os.d.b(new Pair("screen_id_args_key", screenId3)));
                break;
            case 6:
                String screenId4 = bVar.c();
                Intrinsics.checkNotNullParameter(screenId4, "screenId");
                c7645c = new gd0.e();
                c7645c.setArguments(androidx.core.os.d.b(new Pair("screen_id_args_key", screenId4)));
                break;
            case 7:
                String screenId5 = bVar.c();
                Intrinsics.checkNotNullParameter(screenId5, "screenId");
                c7645c = new ec0.h();
                c7645c.setArguments(androidx.core.os.d.b(new Pair("screen_id_args_key", screenId5)));
                break;
            case 8:
                String screenId6 = bVar.c();
                Intrinsics.checkNotNullParameter(screenId6, "screenId");
                c7645c = new ad0.e();
                c7645c.setArguments(androidx.core.os.d.b(new Pair("screen_id_args_key", screenId6)));
                break;
            case 9:
                String screenId7 = bVar.c();
                Intrinsics.checkNotNullParameter(screenId7, "screenId");
                c7645c = new m();
                c7645c.setArguments(androidx.core.os.d.b(new Pair("screen_id_args_key", screenId7)));
                break;
            case 10:
                String screenId8 = bVar.c();
                Intrinsics.checkNotNullParameter(screenId8, "screenId");
                c7645c = new n();
                c7645c.setArguments(androidx.core.os.d.b(new Pair("screen_id_args_key", screenId8)));
                break;
            case 11:
                String b11 = bVar.b();
                try {
                    if (CookieManager.getInstance() != null) {
                        c7645c = C7355h.a.a(s(b11) ? p.FintechRecovery : p.OzonIdAuth, bVar.c(), null, 4);
                        break;
                    }
                } catch (Throwable unused) {
                }
                Vb0.d dVar = s(b11) ? Vb0.d.FINTECH_RECOVERY : Vb0.d.OZON_ID_AUTH;
                b.a aVar = Vb0.b.f28514a;
                String a11 = Vb0.c.NOT_FOUND.a();
                Map j11 = U.j(new Pair(ImagesContract.URL, b11), new Pair("webview_type", dVar));
                aVar.getClass();
                b.a.a(a11, j11);
                String string = this.f22162b.getString(R.string.ozonid_webview_disabled_error_message_android);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                ((Nc0.f) interfaceC4008j.getValue()).y(string);
                c7645c = null;
                break;
            case 12:
                String link = bVar.b();
                Intrinsics.checkNotNullParameter(link, "link");
                c7645c = new q();
                c7645c.setArguments(androidx.core.os.d.b(new Pair("link", link)));
                break;
            default:
                throw new o();
        }
        if (c7645c == null) {
            return;
        }
        ((Nc0.f) interfaceC4008j.getValue()).g();
        if (z11) {
            n().k(bVar);
            hVar = new g.C0440g(c7645c);
        } else {
            n().h(bVar);
            hVar = c7645c instanceof DialogInterfaceOnCancelListenerC5390k ? new g.h((DialogInterfaceOnCancelListenerC5390k) c7645c) : new g.f(c7645c);
        }
        ze.n.b(this.f22169i, hVar);
    }

    private static boolean s(String str) {
        try {
            Uri parse = Uri.parse(str);
            if (Intrinsics.d(parse.getHost(), "finance.ozon.ru")) {
                return true;
            }
            return Intrinsics.d(parse.getHost(), "finance.ozonru.me");
        } catch (Exception unused) {
            return false;
        }
    }

    public final void A() {
        td0.f.b(this.f22171k, null, new f(null));
    }

    public final void B(@NotNull String requestKey, @NotNull FastEntryActionDTO authActionDTO, @NotNull FastEntryActionDTO.FastEntryDataDTO.FastEntryBiometryDTO biometry) {
        Intrinsics.checkNotNullParameter(requestKey, "requestKey");
        Intrinsics.checkNotNullParameter(authActionDTO, "authActionDTO");
        Intrinsics.checkNotNullParameter(biometry, "biometry");
        C7045a args = new C7045a(biometry.getAnalyticTag(), biometry.getPermission().getTitle(), biometry.getPermission().getSubtitle(), authActionDTO);
        Intrinsics.checkNotNullParameter(requestKey, "requestKey");
        Intrinsics.checkNotNullParameter(args, "args");
        C7046b c7046b = new C7046b();
        Bundle bundle = new Bundle(2);
        bundle.putString("request_key", requestKey);
        bundle.putParcelable("params", args);
        c7046b.setArguments(bundle);
        td0.f.b(this.f22171k, null, new g(new g.h(c7046b), null));
    }

    public final void C(@NotNull String newLink) {
        Intrinsics.checkNotNullParameter(newLink, "newLink");
        n().j(newLink);
        ((Nc0.f) this.f22167g.getValue()).m();
    }

    public final void E(String str) {
        C10727i.c(this.f22171k, null, null, new k(str, null), 3);
    }

    public final void l() {
        td0.f.b(this.f22171k, null, new b(null));
    }

    @NotNull
    public final Pc0.b o(@NotNull String screenId) {
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Pc0.b c11 = n().c(screenId);
        if (c11 != null) {
            return c11;
        }
        D();
        throw new IllegalStateException("Wrong navigation logic - screen entry is not found!");
    }

    @NotNull
    public final InterfaceC2395h<Pc0.g> p() {
        return this.f22170j;
    }

    public final void q() {
        td0.f.b(this.f22171k, null, new C0439c(null));
    }

    public final boolean t() {
        Pc0.b b11 = n().b();
        return Intrinsics.d(b11 != null ? b11.b() : null, "ozon://ozonIdPageSocialAdditionalOption");
    }

    public final boolean u() {
        String b11;
        Pc0.b b12 = n().b();
        return (b12 == null || (b11 = b12.b()) == null || (!kotlin.text.h.e0(b11, "ozon://ozonIdPageOtp", false) && !kotlin.text.h.e0(b11, "ozon://ozonIdPageOtpFlow", false))) ? false : true;
    }

    public final void v(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        td0.f.b(this.f22171k, null, new d(link, null));
    }

    public final void w(@NotNull AuthActionDTO authActionDTO) {
        Intrinsics.checkNotNullParameter(authActionDTO, "authActionDTO");
        td0.f.b(this.f22171k, null, new e(this, null, authActionDTO));
    }

    public final Object x(@NotNull CrossAppChallengeResponseDto crossAppChallengeResponseDto, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object n11 = this.f22169i.n(new g.d(new Fb0.c(true, (AuthTokenDTO) null, crossAppChallengeResponseDto.getStatus().getDeeplink())), dVar);
        return n11 == Wc.a.COROUTINE_SUSPENDED ? n11 : Unit.f71690a;
    }

    public final Object y(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        ((Ib0.e) this.f22168h.getValue()).l();
        Object n11 = this.f22169i.n(g.c.f22203a, cVar);
        return n11 == Wc.a.COROUTINE_SUSPENDED ? n11 : Unit.f71690a;
    }

    public final void z() {
        D();
    }
}
