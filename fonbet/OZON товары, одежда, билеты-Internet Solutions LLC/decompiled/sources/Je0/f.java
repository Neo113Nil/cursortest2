package Je0;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Qj0.AbstractC3880a;
import Qj0.B;
import Qj0.C3902w;
import Qj0.U;
import Qj0.t0;
import android.net.Uri;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import ei0.InterfaceC6369b;
import ie0.C7064a;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.mapsdk.common.geoproxy.model.ApiHost;
import ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig;
import ru.ozon.tracker.performance.ObjectTypes;
import spay.sdk.domain.model.FraudMonInfo;
import te0.C9867b;
import ue0.InterfaceC10046c;
import xe.B0;
import xe.C10749t0;
import xe.H0;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6369b f14660a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ReentrantLock f14661b;

    /* renamed from: c, reason: collision with root package name */
    private U f14662c;

    /* renamed from: d, reason: collision with root package name */
    private String f14663d;

    /* renamed from: e, reason: collision with root package name */
    private B0 f14664e;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14665a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.MAP_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.MAP_READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.FIRST_RASTER_RENDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.RASTER_MAP_RENDERED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.FIRST_VECTOR_RENDERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[e.VECTOR_MAP_RENDERED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[e.STYLE_LOAD_TIME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[e.ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f14665a = iArr;
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends AbstractC7737t implements Function1<C3902w, C3902w> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final C3902w invoke(C3902w c3902w) {
            Integer num;
            C3902w it = c3902w;
            Intrinsics.checkNotNullParameter(it, "it");
            num = o.f14685a;
            return f.b(f.this, it, null, null, null, null, null, null, null, null, null, num, null, null, 507903);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.tracking.PerformanceTracker$subToLoadTiles$1", f = "PerformanceTracker.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<Boolean, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ boolean f14667d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = f.this.new c(dVar);
            cVar.f14667d = ((Boolean) obj).booleanValue();
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, kotlin.coroutines.d<? super Unit> dVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((c) create(bool2, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            if (this.f14667d) {
                f.this.c();
            }
            return Unit.f71690a;
        }
    }

    public f(@NotNull InterfaceC6369b ozonTracker) {
        Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
        this.f14660a = ozonTracker;
        this.f14661b = new ReentrantLock();
    }

    static C3902w b(f fVar, C3902w c3902w, String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i11) {
        String l11 = c3902w.l();
        String n11 = c3902w.n();
        String a11 = c3902w.a();
        String g10 = c3902w.g();
        String f7 = (i11 & 16) != 0 ? c3902w.f() : str;
        String p11 = (i11 & 32) != 0 ? c3902w.p() : str2;
        String e11 = (i11 & 64) != 0 ? c3902w.e() : str3;
        String m11 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? c3902w.m() : str4;
        String j11 = (i11 & 256) != 0 ? c3902w.j() : str5;
        String b11 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? c3902w.b() : str6;
        Integer i12 = c3902w.i();
        Integer k11 = (i11 & 2048) != 0 ? c3902w.k() : num;
        Integer r11 = (i11 & 4096) != 0 ? c3902w.r() : num2;
        Integer s11 = (i11 & 8192) != 0 ? c3902w.s() : num3;
        Integer d11 = (i11 & 16384) != 0 ? c3902w.d() : num4;
        Integer o11 = (i11 & 32768) != 0 ? c3902w.o() : num5;
        Integer h11 = (i11 & 65536) != 0 ? c3902w.h() : num6;
        Integer q11 = c3902w.q();
        Integer c11 = c3902w.c();
        fVar.getClass();
        return new C3902w(l11, n11, a11, g10, f7, p11, e11, m11, j11, b11, i12, k11, r11, s11, d11, o11, h11, q11, c11);
    }

    private static void d(U u11, Function1 function1) {
        if (u11 != null) {
            AbstractC3880a d11 = u11.d(C3902w.class);
            C3902w c3902w = d11 instanceof C3902w ? (C3902w) d11 : null;
            if (c3902w != null) {
                u11.n((C3902w) function1.invoke(c3902w), true);
            }
        }
    }

    public final void a() {
        ReentrantLock reentrantLock = this.f14661b;
        reentrantLock.lock();
        try {
            U u11 = this.f14662c;
            InterfaceC6369b interfaceC6369b = this.f14660a;
            if (u11 != null && u11.l()) {
                U u12 = this.f14662c;
                if (u12 != null) {
                    u12.s();
                }
                String str = this.f14663d;
                if (str != null) {
                    interfaceC6369b.endTrace(str);
                }
            }
            interfaceC6369b.c(null);
            interfaceC6369b.e();
            String str2 = "maps_perfomance_" + System.currentTimeMillis();
            this.f14663d = str2;
            Intrinsics.f(str2);
            U beginTrace = interfaceC6369b.beginTrace(str2);
            beginTrace.r();
            this.f14662c = beginTrace;
            C9867b c9867b = C9867b.f99466a;
            C9867b.g("PerformanceTracker: Начат новый трейс, ПерфТрейсы включены: " + interfaceC6369b.i(), InterfaceC10046c.a.INFO, 4);
            Unit unit = Unit.f71690a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f14661b;
        reentrantLock.lock();
        try {
            d(this.f14662c, new b());
            U u11 = this.f14662c;
            if (u11 != null) {
                u11.s();
            }
            String str = this.f14663d;
            InterfaceC6369b interfaceC6369b = this.f14660a;
            if (str != null) {
                interfaceC6369b.endTrace(str);
            }
            interfaceC6369b.c(null);
            this.f14662c = null;
            this.f14663d = null;
            C9867b c9867b = C9867b.f99466a;
            C9867b.g("PerformanceTracker: Трейс завершён и отправлен", InterfaceC10046c.a.INFO, 4);
            Unit unit = Unit.f71690a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void e(@NotNull InterfaceC2395h<Boolean> tilesLoadingFlow) {
        Intrinsics.checkNotNullParameter(tilesLoadingFlow, "tilesLoadingFlow");
        B0 b02 = this.f14664e;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f14664e = C2399j.C(new C2408n0(tilesLoadingFlow, new c(null)), C10749t0.f105499a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d7, code lost:
    
        r0 = r37.getName();
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0020, B:5:0x0024, B:6:0x002b, B:8:0x002f, B:10:0x0039, B:12:0x003e, B:13:0x004a, B:15:0x004e, B:17:0x005b, B:19:0x0061, B:21:0x0067, B:23:0x006d, B:25:0x0075, B:27:0x007d, B:29:0x0081, B:32:0x0087, B:36:0x009c, B:38:0x00a7, B:40:0x00ad, B:42:0x00b3, B:44:0x00b9, B:48:0x00c5, B:50:0x00cb, B:54:0x00e4, B:56:0x00d7, B:63:0x011d, B:64:0x0126, B:65:0x0129, B:66:0x012e, B:69:0x0131, B:70:0x0204, B:74:0x0159, B:76:0x017a, B:78:0x019d, B:79:0x01bb, B:81:0x01c7, B:83:0x01e7, B:84:0x010f), top: B:2:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(GeoProviderConfig geoProviderConfig, @NotNull e eventName, String str, Long l11, String str2, s sVar) {
        String str3;
        GeoProxyConfig c11;
        String str4;
        GeoProxyConfig c12;
        String str5;
        String appName;
        ApiHost host;
        String url;
        Uri parse;
        String host2;
        String str6;
        ApiHost host3;
        String url2;
        Uri parse2;
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        ReentrantLock reentrantLock = this.f14661b;
        reentrantLock.lock();
        try {
            if (this.f14662c == null) {
                a();
            }
            U u11 = this.f14662c;
            if ((u11 != null ? u11.d(C3902w.class) : null) == null) {
                U u12 = this.f14662c;
                if (u12 != null) {
                    B b11 = new B(ObjectTypes.MAP_SDK);
                    int i11 = U.f23535i;
                    u12.n(b11, true);
                }
                U u13 = this.f14662c;
                if (u13 != null) {
                    ie0.g.f66321a.getClass();
                    GeoProxyConfig c13 = ie0.g.c();
                    if (c13 == null || (host3 = c13.getHost()) == null || (url2 = host3.getUrl()) == null || (parse2 = Uri.parse(url2)) == null || (str6 = parse2.getHost()) == null) {
                        str6 = "https://unknown.com";
                    }
                    t0 t0Var = new t0(str6);
                    int i12 = U.f23535i;
                    u13.n(t0Var, true);
                }
                U u14 = this.f14662c;
                if (u14 != null) {
                    if (geoProviderConfig != null) {
                        C7064a.f66281a.getClass();
                        String a11 = Je0.b.a(geoProviderConfig, C7064a.f());
                        if (a11 != null) {
                            str3 = a11;
                            ie0.g.f66321a.getClass();
                            c11 = ie0.g.c();
                            if (c11 != null && (host = c11.getHost()) != null && (url = host.getUrl()) != null && (parse = Uri.parse(url)) != null && (host2 = parse.getHost()) != null) {
                                str4 = host2;
                                c12 = ie0.g.c();
                                if (c12 != null && (appName = c12.getAppName()) != null) {
                                    str5 = appName;
                                    C3902w c3902w = new C3902w(str3, str4, str5, "14.8.1", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                                    int i13 = U.f23535i;
                                    u14.n(c3902w, true);
                                }
                                String str7 = null;
                                str5 = str7 != null ? FraudMonInfo.UNKNOWN : str7;
                                C3902w c3902w2 = new C3902w(str3, str4, str5, "14.8.1", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                                int i132 = U.f23535i;
                                u14.n(c3902w2, true);
                            }
                            str4 = FraudMonInfo.UNKNOWN;
                            c12 = ie0.g.c();
                            if (c12 != null) {
                                str5 = appName;
                                C3902w c3902w22 = new C3902w(str3, str4, str5, "14.8.1", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                                int i1322 = U.f23535i;
                                u14.n(c3902w22, true);
                            }
                            String str72 = null;
                            if (str72 != null) {
                            }
                            C3902w c3902w222 = new C3902w(str3, str4, str5, "14.8.1", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                            int i13222 = U.f23535i;
                            u14.n(c3902w222, true);
                        }
                    }
                    str3 = FraudMonInfo.UNKNOWN;
                    ie0.g.f66321a.getClass();
                    c11 = ie0.g.c();
                    if (c11 != null) {
                        str4 = host2;
                        c12 = ie0.g.c();
                        if (c12 != null) {
                        }
                        String str722 = null;
                        if (str722 != null) {
                        }
                        C3902w c3902w2222 = new C3902w(str3, str4, str5, "14.8.1", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                        int i132222 = U.f23535i;
                        u14.n(c3902w2222, true);
                    }
                    str4 = FraudMonInfo.UNKNOWN;
                    c12 = ie0.g.c();
                    if (c12 != null) {
                    }
                    String str7222 = null;
                    if (str7222 != null) {
                    }
                    C3902w c3902w22222 = new C3902w(str3, str4, str5, "14.8.1", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                    int i1322222 = U.f23535i;
                    u14.n(c3902w22222, true);
                }
            } else {
                d(this.f14662c, new g(geoProviderConfig, this, str2, str));
            }
            switch (a.f14665a[eventName.ordinal()]) {
                case 1:
                    if (l11 != null) {
                        d(this.f14662c, new h(this, l11));
                        C9867b c9867b = C9867b.f99466a;
                        C9867b.g("PerformanceTracker: Событие MAP_LOAD, runTime=" + l11, InterfaceC10046c.a.INFO, 4);
                        break;
                    }
                    break;
                case 2:
                    if (l11 != null) {
                        d(this.f14662c, new i(this, l11));
                        C9867b c9867b2 = C9867b.f99466a;
                        C9867b.g("PerformanceTracker: Событие MAP_READY, runTime=" + l11, InterfaceC10046c.a.INFO, 4);
                        break;
                    }
                    break;
                case 3:
                case 4:
                    C9867b c9867b3 = C9867b.f99466a;
                    C9867b.g("PerformanceTracker: Событие RASTER (пропущено)", InterfaceC10046c.a.INFO, 4);
                    break;
                case 5:
                    if (l11 != null) {
                        d(this.f14662c, new j(this, l11));
                        C9867b c9867b4 = C9867b.f99466a;
                        C9867b.g("PerformanceTracker: Событие FIRST_VECTOR_RENDERED, runTime=" + l11, InterfaceC10046c.a.INFO, 4);
                        break;
                    }
                    break;
                case 6:
                    if (l11 != null) {
                        d(this.f14662c, new k(this, l11));
                        C9867b c9867b5 = C9867b.f99466a;
                        C9867b.g("PerformanceTracker: Событие VECTOR_MAP_RENDERED, runTime=" + l11, InterfaceC10046c.a.INFO, 4);
                        c();
                        break;
                    }
                    break;
                case 7:
                    if (l11 != null) {
                        d(this.f14662c, new l(this, l11));
                        C9867b c9867b6 = C9867b.f99466a;
                        C9867b.g("PerformanceTracker: Событие STYLE_LOAD_TIME, runTime=" + l11, InterfaceC10046c.a.INFO, 4);
                        break;
                    }
                    break;
                case 8:
                    if (sVar != null) {
                        d(this.f14662c, new m(this, sVar));
                        C9867b c9867b7 = C9867b.f99466a;
                        C9867b.g("PerformanceTracker: Событие ERROR, errorHash=" + sVar.a(), InterfaceC10046c.a.INFO, 4);
                        a();
                        break;
                    }
                    break;
                default:
                    throw new Sc.o();
            }
            Unit unit = Unit.f71690a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
