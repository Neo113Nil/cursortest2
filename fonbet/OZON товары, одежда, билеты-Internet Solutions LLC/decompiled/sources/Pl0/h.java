package Pl0;

import Bl0.b0;
import Nl0.r;
import Ol0.A;
import Ol0.s;
import Ol0.x;
import R2.C3909c;
import R2.InterfaceC3912f;
import R2.InterfaceC3917k;
import Sc.InterfaceC4008j;
import W2.f;
import We.E;
import android.content.Context;
import android.content.pm.PackageManager;
import bb.C5616c;
import bb.InterfaceC5614a;
import bm0.C5684b;
import bm0.InterfaceC5683a;
import fm0.C6583d;
import fm0.InterfaceC6586g;
import java.util.List;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import ob.C8683b;
import org.jetbrains.annotations.NotNull;
import pb.C8890a;
import pb.C8891b;
import rb.InterfaceC9240a;
import vb.C10293a;
import xb.C10695c;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Za.d f22657c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final InterfaceC4008j f22658d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final InterfaceC4008j f22659e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final InterfaceC4008j f22660f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public static final InterfaceC4008j f22661g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public static final InterfaceC4008j f22662h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public static final InterfaceC4008j f22663i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    public static final InterfaceC4008j f22664j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    public static final InterfaceC4008j f22665k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    public static final InterfaceC4008j f22666l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    public static final InterfaceC4008j f22667m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    public static final InterfaceC4008j f22668n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    public static final InterfaceC4008j f22669o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    public static final InterfaceC4008j f22670p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    public static final InterfaceC4008j f22671q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    public static final InterfaceC4008j f22672r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    public static final V2.e f22673s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    public static final V2.e f22674t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    public static final V2.e f22675u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    public static final V2.e f22676v;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.m<Object>[] f22656b = {N.i(new G(h.class, "pushDataStore", "getPushDataStore$sdk_public_push_client_release(Landroid/content/Context;)Landroidx/datastore/core/DataStore;")), N.i(new G(h.class, "arbiterDataStore", "getArbiterDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;")), N.i(new G(h.class, "modeDataStore", "getModeDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;")), N.i(new G(h.class, "notificationIdDataStore", "getNotificationIdDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;")), N.i(new G(h.class, "analyticsDataStore", "getAnalyticsDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"))};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f22655a = new h();

    public static final class a extends AbstractC7737t implements Function0<Il0.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f22677b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Il0.a invoke() {
            El0.n nVar = Pl0.e.f22651b;
            if (nVar == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            Context context = nVar.f8115a.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(context, "vkpnsPushConfig.application.applicationContext");
            Intrinsics.checkNotNullParameter(context, "context");
            b0 a11 = b0.f3963c.a(context);
            h.f22655a.getClass();
            return new Il0.a(a11.f3966b, (Nl0.g) h.f22668n.getValue());
        }
    }

    public static final class b extends AbstractC7737t implements Function0<Nl0.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f22678b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Nl0.a invoke() {
            h.f22655a.getClass();
            El0.n nVar = Pl0.e.f22651b;
            if (nVar != null) {
                return new Nl0.a(new Ol0.b(nVar.f8115a));
            }
            throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
        }
    }

    public static final class c extends AbstractC7737t implements Function1<C3909c, W2.f> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f22679b = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final W2.f invoke(C3909c c3909c) {
            C3909c it = c3909c;
            Intrinsics.checkNotNullParameter(it, "it");
            return W2.g.b(new f.b[0]);
        }
    }

    public static final class d extends AbstractC7737t implements Function1<Context, List<? extends InterfaceC3912f<W2.f>>> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f22680b = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final List<? extends InterfaceC3912f<W2.f>> invoke(Context context) {
            Context context2 = context;
            Intrinsics.checkNotNullParameter(context2, "context");
            h.f22655a.getClass();
            String[] elements = {"master_host_package", "master_host_pub"};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return C7714v.a0(V2.l.a(context2, C7705l.j0(elements)));
        }
    }

    public static final class e extends AbstractC7737t implements Function0<Nl0.e> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f22681b = new e(0);

        @Override // kotlin.jvm.functions.Function0
        public final Nl0.e invoke() {
            h.f22655a.getClass();
            El0.n nVar = Pl0.e.f22651b;
            if (nVar == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            Context applicationContext = nVar.f8115a.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "vkpnsPushConfig.application.applicationContext");
            PackageManager packageManager = applicationContext.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "packageManager");
            pb.d dVar = new pb.d(packageManager);
            Ol0.c cVar = new Ol0.c(Pl0.j.f22695b, Pl0.k.f22696b);
            El0.n nVar2 = Pl0.e.f22651b;
            if (nVar2 == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            Context applicationContext2 = nVar2.f8115a.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "vkpnsPushConfig.application.applicationContext");
            Ol0.i iVar = new Ol0.i(h.f22674t.getValue(applicationContext2, h.f22656b[1]));
            E e11 = (E) Pl0.g.f22653a.getValue();
            El0.n nVar3 = Pl0.e.f22651b;
            if (nVar3 == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            Za.c cVar2 = nVar3.f8120f;
            if (cVar2 == null) {
                cVar2 = new C10293a();
            }
            C10695c c10695c = new C10695c(e11, cVar2);
            El0.n nVar4 = Pl0.e.f22651b;
            if (nVar4 == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            Context applicationContext3 = nVar4.f8115a.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext3, "vkpnsPushConfig.application.applicationContext");
            Za.d dVar2 = h.f22657c;
            return new Nl0.e(dVar, cVar, iVar, c10695c, new Ol0.e(new Ml0.g(applicationContext3, dVar2)), new Pl0.i(1, null), dVar2);
        }
    }

    public static final class f extends AbstractC7737t implements Function0<Nl0.g> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f22682b = new f(0);

        @Override // kotlin.jvm.functions.Function0
        public final Nl0.g invoke() {
            h hVar = h.f22655a;
            hVar.getClass();
            El0.n nVar = Pl0.e.f22651b;
            if (nVar != null) {
                return new Nl0.g(new x(nVar.f8124j), h.a(hVar));
            }
            throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
        }
    }

    public static final class g extends AbstractC7737t implements Function0<InterfaceC9240a> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f22683b = new g(0);

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC9240a invoke() {
            h.f22655a.getClass();
            El0.n nVar = Pl0.e.f22651b;
            if (nVar == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            Context applicationContext = nVar.f8115a.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "vkpnsPushConfig.application.applicationContext");
            return C8683b.a(new C8890a(applicationContext));
        }
    }

    /* renamed from: Pl0.h$h, reason: collision with other inner class name */
    public static final class C0447h extends AbstractC7737t implements Function0<Nl0.h> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0447h f22684b = new C0447h(0);

        @Override // kotlin.jvm.functions.Function0
        public final Nl0.h invoke() {
            return new Nl0.h(h.a(h.f22655a));
        }
    }

    public static final class i extends AbstractC7737t implements Function0<Nl0.i> {

        /* renamed from: b, reason: collision with root package name */
        public static final i f22685b = new i(0);

        @Override // kotlin.jvm.functions.Function0
        public final Nl0.i invoke() {
            h.f22655a.getClass();
            El0.n nVar = Pl0.e.f22651b;
            if (nVar == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            Context applicationContext = nVar.f8115a.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "vkpnsPushConfig.application.applicationContext");
            return new Nl0.i(new Ol0.m(h.f22675u.getValue(applicationContext, h.f22656b[2])));
        }
    }

    public static final class j extends AbstractC7737t implements Function0<Zl0.f> {

        /* renamed from: b, reason: collision with root package name */
        public static final j f22686b = new j(0);

        @Override // kotlin.jvm.functions.Function0
        public final Zl0.f invoke() {
            h.f22655a.getClass();
            El0.n nVar = Pl0.e.f22651b;
            if (nVar == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            Context applicationContext = nVar.f8115a.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "vkpnsPushConfig.application.applicationContext");
            Za.d dVar = h.f22657c;
            return new Zl0.f(new Zl0.k(applicationContext, dVar), (InterfaceC6586g) h.f22659e.getValue(), dVar);
        }
    }

    public static final class k extends AbstractC7737t implements Function0<C5616c> {

        /* renamed from: b, reason: collision with root package name */
        public static final k f22687b = new k(0);

        @Override // kotlin.jvm.functions.Function0
        public final C5616c invoke() {
            return new C5616c();
        }
    }

    public static final class l extends AbstractC7737t implements Function0<Nl0.j> {

        /* renamed from: b, reason: collision with root package name */
        public static final l f22688b = new l(0);

        @Override // kotlin.jvm.functions.Function0
        public final Nl0.j invoke() {
            h.f22655a.getClass();
            Za.d dVar = h.f22657c;
            Pl0.e.a();
            Context applicationContext = Pl0.e.a().f8115a.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "vkpnsPushConfig.application.applicationContext");
            return new Nl0.j(new Ol0.o(new Vl0.c(applicationContext, Pl0.e.a().f8116b, dVar), new Pl0.l(1, null), new Pl0.m(1, null), dVar));
        }
    }

    public static final class m extends AbstractC7737t implements Function0<Nl0.k> {

        /* renamed from: b, reason: collision with root package name */
        public static final m f22689b = new m(0);

        @Override // kotlin.jvm.functions.Function0
        public final Nl0.k invoke() {
            h.f22655a.getClass();
            El0.n nVar = Pl0.e.f22651b;
            if (nVar == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            Context applicationContext = nVar.f8115a.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "vkpnsPushConfig.application.applicationContext");
            return new Nl0.k(new s(h.f22676v.getValue(applicationContext, h.f22656b[3])));
        }
    }

    public static final class n extends AbstractC7737t implements Function0<rb.b> {

        /* renamed from: b, reason: collision with root package name */
        public static final n f22690b = new n(0);

        @Override // kotlin.jvm.functions.Function0
        public final rb.b invoke() {
            h.f22655a.getClass();
            El0.n nVar = Pl0.e.f22651b;
            if (nVar == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            Context applicationContext = nVar.f8115a.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "vkpnsPushConfig.application.applicationContext");
            PackageManager packageManager = applicationContext.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "packageManager");
            pb.d packageManagerDataSource = new pb.d(packageManager);
            El0.n nVar2 = Pl0.e.f22651b;
            if (nVar2 == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            Context applicationContext2 = nVar2.f8115a.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "vkpnsPushConfig.application.applicationContext");
            C8891b contextDataSource = new C8891b(applicationContext2);
            Intrinsics.checkNotNullParameter(packageManagerDataSource, "packageManagerDataSource");
            Intrinsics.checkNotNullParameter(contextDataSource, "contextDataSource");
            return new ob.d(packageManagerDataSource, contextDataSource);
        }
    }

    public static final class o extends AbstractC7737t implements Function0<InterfaceC6586g> {

        /* renamed from: b, reason: collision with root package name */
        public static final o f22691b = new o(0);

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC6586g invoke() {
            h hVar = h.f22655a;
            El0.n nVar = Pl0.e.f22651b;
            if (nVar == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            Context applicationContext = nVar.f8115a.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "vkpnsPushConfig.application.applicationContext");
            hVar.getClass();
            Intrinsics.checkNotNullParameter(applicationContext, "<this>");
            InterfaceC3917k<W2.f> dataStore = h.f22673s.getValue(applicationContext, h.f22656b[0]);
            Intrinsics.checkNotNullParameter(dataStore, "dataStore");
            return new C6583d(dataStore);
        }
    }

    public static final class p extends AbstractC7737t implements Function0<Nl0.o> {

        /* renamed from: b, reason: collision with root package name */
        public static final p f22692b = new p(0);

        @Override // kotlin.jvm.functions.Function0
        public final Nl0.o invoke() {
            return new Nl0.o(new Pl0.p(), h.f22657c);
        }
    }

    public static final class q extends AbstractC7737t implements Function0<r> {

        /* renamed from: b, reason: collision with root package name */
        public static final q f22693b = new q(0);

        @Override // kotlin.jvm.functions.Function0
        public final r invoke() {
            E e11 = (E) Pl0.g.f22653a.getValue();
            El0.n nVar = Pl0.e.f22651b;
            if (nVar == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            Za.c cVar = nVar.f8121g;
            if (cVar == null) {
                cVar = new Ll0.c();
            }
            A a11 = new A(e11, cVar);
            h.f22655a.getClass();
            return new r(a11, (InterfaceC6586g) h.f22659e.getValue(), h.f22657c);
        }
    }

    static {
        El0.n nVar = Pl0.e.f22651b;
        f22657c = nVar != null ? nVar.f8117c : new Za.b("VkpnsClientSdk");
        f22658d = Sc.k.b(i.f22685b);
        f22659e = Sc.k.b(o.f22691b);
        f22660f = Sc.k.b(q.f22693b);
        f22661g = Sc.k.b(e.f22681b);
        f22662h = Sc.k.b(p.f22692b);
        f22663i = Sc.k.b(j.f22686b);
        f22664j = Sc.k.b(n.f22690b);
        f22665k = Sc.k.b(b.f22678b);
        f22666l = Sc.k.b(m.f22689b);
        f22667m = Sc.k.b(C0447h.f22684b);
        f22668n = Sc.k.b(f.f22682b);
        f22669o = Sc.k.b(a.f22677b);
        f22670p = Sc.k.b(k.f22687b);
        f22671q = Sc.k.b(g.f22683b);
        f22672r = Sc.k.b(l.f22688b);
        f22673s = V2.b.a("vkpns_client_sdk", new S2.b(new Pl0.o("vkpns_client_sdk")), null, null, 12);
        f22674t = V2.b.a("vkpns_client_sdk_arbiter", new S2.b(new Pl0.o("vkpns_client_sdk_arbiter")), d.f22680b, null, 8);
        f22675u = V2.b.a("vkpns_client_sdk_mode", new S2.b(new Pl0.o("vkpns_client_sdk_mode")), null, null, 12);
        f22676v = V2.b.a("vkpns_notification_id", new S2.b(new Pl0.o("vkpns_notification_id")), null, null, 12);
        V2.b.a("vkpns_client_sdk_analytics", new S2.b(c.f22679b), null, null, 12);
    }

    public static final Ol0.k a(h hVar) {
        hVar.getClass();
        El0.n nVar = Pl0.e.f22651b;
        if (nVar != null) {
            return new Ol0.k(nVar.f8117c);
        }
        throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
    }

    @NotNull
    public static InterfaceC5614a b() {
        if (Pl0.e.f22651b != null) {
            return (Il0.a) f22669o.getValue();
        }
        throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
    }

    @NotNull
    public static InterfaceC5683a c() {
        if (Pl0.e.f22651b == null) {
            throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
        }
        E e11 = (E) Pl0.g.f22653a.getValue();
        El0.n nVar = Pl0.e.f22651b;
        if (nVar == null) {
            throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
        }
        Za.c cVar = nVar.f8120f;
        if (cVar == null) {
            cVar = new C10293a();
        }
        return new C5684b(new bm0.h(e11, nVar.f8116b, cVar), f22657c);
    }
}
