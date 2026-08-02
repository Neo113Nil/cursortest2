package El0;

import De.C2862e;
import Nl0.r;
import Pl0.q;
import Sc.InterfaceC4008j;
import Yl0.o;
import Yl0.p;
import ab.InterfaceC4990a;
import android.app.Application;
import android.util.Log;
import bb.InterfaceC5614a;
import bm0.InterfaceC5683a;
import db.InterfaceC6134a;
import fb.InterfaceC6491b;
import fm0.InterfaceC6586g;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sb.C9647a;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.N;
import yl0.C10923h;
import yl0.s;

/* loaded from: classes8.dex */
public final class i implements InterfaceC6134a, Ql0.a, InterfaceC6491b {

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    public static final a f8073q = new a();

    /* renamed from: r, reason: collision with root package name */
    public static i f8074r;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Application f8075a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Za.d f8076b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC4008j f8077c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final InterfaceC4008j f8078d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final InterfaceC4008j f8079e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final InterfaceC4008j f8080f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final InterfaceC4008j f8081g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public final InterfaceC4008j f8082h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public final InterfaceC4008j f8083i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    public final InterfaceC4008j f8084j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    public final InterfaceC4008j f8085k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    public final InterfaceC4008j f8086l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    public final InterfaceC4008j f8087m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    public final InterfaceC4008j f8088n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    public final C2862e f8089o;

    /* renamed from: p, reason: collision with root package name */
    public B0 f8090p;

    public static final class a implements InterfaceC6134a, Ql0.a {
        @Override // Ql0.a
        @NotNull
        public final C10923h<Unit> a() {
            i iVar = i.f8074r;
            if (iVar == null) {
                Log.w("VkpnsClientSdk", "Client SDK is not initialized, did you call init method in your Application class?");
                return s.a(new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
            }
            if (iVar != null) {
                return iVar.a();
            }
            throw new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?");
        }

        @Override // db.InterfaceC6134a
        @NotNull
        public final C10923h b() {
            Intrinsics.checkNotNullParameter("ru.vk.store_ads", "topic");
            i iVar = i.f8074r;
            if (iVar == null) {
                Log.w("VkpnsClientSdk", "Client SDK is not initialized, did you call init method in your Application class?");
                return s.a(new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
            }
            if (iVar != null) {
                return iVar.b();
            }
            throw new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?");
        }
    }

    public static final class b extends AbstractC7737t implements Function0<InterfaceC5614a> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f8091b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC5614a invoke() {
            Pl0.h.f22655a.getClass();
            return Pl0.h.b();
        }
    }

    public static final class c extends AbstractC7737t implements Function0<Nl0.e> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f8092b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final Nl0.e invoke() {
            Pl0.h.f22655a.getClass();
            return (Nl0.e) Pl0.h.f22661g.getValue();
        }
    }

    public static final class d extends AbstractC7737t implements Function0<Zl0.f> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f8093b = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final Zl0.f invoke() {
            Pl0.h.f22655a.getClass();
            return (Zl0.f) Pl0.h.f22663i.getValue();
        }
    }

    public static final class e extends AbstractC7737t implements Function0<Wl0.b> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Wl0.b invoke() {
            Za.d dVar = Pl0.f.f22652a;
            Za.d logger = i.this.f8076b;
            Intrinsics.checkNotNullParameter(logger, "logger");
            Za.d dVar2 = q.f22702a;
            Pl0.h.f22655a.getClass();
            Yl0.a aVar = new Yl0.a((Nl0.i) Pl0.h.f22658d.getValue());
            InterfaceC5683a pushTokenRepository = Pl0.h.c();
            Intrinsics.checkNotNullParameter(logger, "logger");
            Intrinsics.checkNotNullParameter(pushTokenRepository, "pushTokenRepository");
            return new Wl0.b(aVar, new Yl0.c(pushTokenRepository, (InterfaceC6586g) Pl0.h.f22659e.getValue(), logger), logger);
        }
    }

    public static final class f extends AbstractC7737t implements Function0<Yl0.e> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f8095b = new f(0);

        @Override // kotlin.jvm.functions.Function0
        public final Yl0.e invoke() {
            return q.a();
        }
    }

    public static final class g extends AbstractC7737t implements Function0<InterfaceC4990a> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f8096b = new g(0);

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC4990a invoke() {
            if (Pl0.e.f22651b == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            InterfaceC4008j interfaceC4008j = Pl0.a.f22641a;
            Fl0.b emptyAdsRemoteMessageInterceptorFactory = new Fl0.b();
            Intrinsics.checkNotNullParameter(emptyAdsRemoteMessageInterceptorFactory, "emptyAdsRemoteMessageInterceptorFactory");
            return new Fl0.c();
        }
    }

    public static final class h extends AbstractC7737t implements Function0<Ql0.a> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Ql0.a invoke() {
            Za.d dVar = Pl0.d.f22647a;
            i iVar = i.this;
            C2862e scope = iVar.f8089o;
            Intrinsics.checkNotNullParameter(scope, "scope");
            Za.d logger = iVar.f8076b;
            Intrinsics.checkNotNullParameter(logger, "logger");
            Za.d dVar2 = q.f22702a;
            Pl0.h.f22655a.getClass();
            return new Ql0.c(scope, new C9647a((rb.b) Pl0.h.f22664j.getValue()), logger);
        }
    }

    /* renamed from: El0.i$i, reason: collision with other inner class name */
    public static final class C0180i extends AbstractC7737t implements Function0<Object> {
        public C0180i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Za.d dVar = Pl0.d.f22647a;
            i iVar = i.this;
            C2862e scope = iVar.f8089o;
            El0.m getPushToken = new El0.m(iVar, null);
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(getPushToken, "getPushToken");
            Za.d logger = iVar.f8076b;
            Intrinsics.checkNotNullParameter(logger, "logger");
            Intrinsics.checkNotNullParameter(q.f22702a, "logger");
            Pl0.h.f22655a.getClass();
            return new Ql0.f(scope, getPushToken, new o((Nl0.o) Pl0.h.f22662h.getValue()), logger);
        }
    }

    public static final class j extends AbstractC7737t implements Function0<Yl0.i> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Yl0.i invoke() {
            Za.d dVar = q.f22702a;
            i iVar = i.this;
            Za.d logger = iVar.f8076b;
            Intrinsics.checkNotNullParameter(logger, "logger");
            C2862e coroutineScope = iVar.f8089o;
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Pl0.h.f22655a.getClass();
            return new Yl0.i((Nl0.a) Pl0.h.f22665k.getValue(), (Nl0.k) Pl0.h.f22666l.getValue(), Pl0.h.b(), coroutineScope, logger);
        }
    }

    public static final class k extends AbstractC7737t implements Function0<El0.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final k f8100b = new k(0);

        @Override // kotlin.jvm.functions.Function0
        public final El0.a invoke() {
            return (El0.a) Pl0.d.f22648b.getValue();
        }
    }

    public static final class l extends AbstractC7737t implements Function0<InterfaceC6134a> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC6134a invoke() {
            Za.d dVar = Pl0.d.f22647a;
            i iVar = i.this;
            C2862e scope = iVar.f8089o;
            Intrinsics.checkNotNullParameter(scope, "scope");
            Za.d logger = iVar.f8076b;
            Intrinsics.checkNotNullParameter(logger, "logger");
            Za.d dVar2 = q.f22702a;
            Pl0.h.f22655a.getClass();
            InterfaceC4008j interfaceC4008j = Pl0.h.f22660f;
            return new Ql0.j(scope, new p((r) interfaceC4008j.getValue()), new Yl0.r((r) interfaceC4008j.getValue()), logger);
        }
    }

    public static final class m extends AbstractC7737t implements Function0<El0.h> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final El0.h invoke() {
            Za.d dVar = Pl0.d.f22647a;
            Za.d logger = i.this.f8076b;
            Intrinsics.checkNotNullParameter(logger, "logger");
            Pl0.h.f22655a.getClass();
            return new El0.h((Zl0.f) Pl0.h.f22663i.getValue(), new Pl0.b(1, null), logger);
        }
    }

    public i(n config) {
        Pl0.e eVar = Pl0.e.f22650a;
        Intrinsics.checkNotNullParameter(config, "config");
        if (!Intrinsics.d(Pl0.e.f22651b, config)) {
            synchronized (eVar) {
                try {
                    if (!Intrinsics.d(Pl0.e.f22651b, config)) {
                        Pl0.e.f22651b = config;
                    }
                    Unit unit = Unit.f71690a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f8075a = Pl0.e.a().f8115a;
        n nVar = Pl0.e.f22651b;
        this.f8076b = nVar != null ? nVar.f8117c : new Za.b("VkpnsClientSdk");
        this.f8077c = Sc.k.b(b.f8091b);
        this.f8078d = Sc.k.b(g.f8096b);
        this.f8079e = Sc.k.b(d.f8093b);
        this.f8080f = Sc.k.b(new j());
        this.f8081g = Sc.k.b(new e());
        this.f8082h = Sc.k.b(c.f8092b);
        this.f8083i = Sc.k.b(f.f8095b);
        this.f8084j = Sc.k.b(k.f8100b);
        this.f8085k = Sc.k.b(new m());
        this.f8086l = Sc.k.b(new l());
        this.f8087m = Sc.k.b(new C0180i());
        this.f8088n = Sc.k.b(new h());
        this.f8089o = N.a(C10720e0.a());
    }

    @Override // Ql0.a
    @NotNull
    public final C10923h<Unit> a() {
        return ((Ql0.a) this.f8088n.getValue()).a();
    }

    @Override // db.InterfaceC6134a
    @NotNull
    public final C10923h b() {
        Intrinsics.checkNotNullParameter("ru.vk.store_ads", "topic");
        return ((InterfaceC6134a) this.f8086l.getValue()).b();
    }

    @NotNull
    public final C10923h<String> c() {
        C10923h c10923h = new C10923h(0);
        Pair pair = new Pair(c10923h, new C10923h.a());
        C10923h<String> c10923h2 = (C10923h) pair.a();
        C10923h.a aVar = (C10923h.a) pair.b();
        this.f8076b.info("Get token requested");
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(this.f8089o, He.b.f10879b, null, new El0.j(this, aVar, null), 2);
        return c10923h2;
    }
}
