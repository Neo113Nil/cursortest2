package Yg0;

import B0.A0;
import J4.r;
import J4.s;
import N4.a;
import Qh0.m;
import R2.InterfaceC3917k;
import Sc.k;
import Sc.o;
import We.E;
import Wh0.d;
import Zg0.a;
import Zg0.b;
import Zg0.d;
import Zg0.j;
import android.app.AlarmManager;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.net.Uri;
import androidx.core.app.n;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.work.c;
import androidx.work.impl.C;
import bc.C5637m;
import bh0.InterfaceC5665a;
import bh0.InterfaceC5666b;
import ch.InterfaceC5830a;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import dh0.C6200a;
import fh0.C6568c;
import gh0.AbstractC6735a;
import gh0.C6737c;
import gh0.InterfaceC6736b;
import gh0.InterfaceC6738d;
import hh0.C6957b;
import hh0.InterfaceC6956a;
import ih0.C7080a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import jh0.C7429a;
import kh0.C7680a;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import nh0.C8596a;
import org.jetbrains.annotations.NotNull;
import pf0.i;
import ph0.C8933b;
import ph0.InterfaceC8932a;
import ph0.h;
import qh0.C9057a;
import qj.C9067a;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import rh0.C9274a;
import rh0.C9277d;
import rh0.C9280g;
import rh0.InterfaceC9275b;
import ru.ozon.android.hardwareinfo.DeviceInfoManager;
import ru.ozon.android.hardwareinfo.powermanager.PowerManagerFactory;
import ru.ozon.android.hardwareinfo.powermanager.PowerManagerRepository;
import ru.ozon.android.hardwareinfo.telephony.TelephonyRepositoryImpl;
import ru.ozon.app.android.R;
import ru.ozon.app.android.push.di.module.OzonPushModule;
import ru.ozon.push.sdk.internal.status.data.network.api.PushStatusApiV2;
import ru.ozon.push.sdk.internal.status.data.network.api.PushStatusApiV3;
import ru.ozon.push.sdk.internal.status.data.repository.database.PushDataBase;
import ru.ozon.push.sdk.internal.token.api.NewTokenApi;
import ru.ozon.push.sdk.internal.token.api.OldTokenApi;
import ru.ozon.push.sdk.internal.token.api.TokenApi;
import ru.ozon.push.sdk.internal.updater.PushTokenUpdateResultsConverter;
import th0.C9875a;
import th0.c;
import uh0.C10059a;
import vh0.C10320a;
import vh0.j;
import xe.U;
import xh0.C10778c;
import yh0.C10906d;
import zh0.C11123a;

/* loaded from: classes7.dex */
public final class a implements InterfaceC5665a {

    /* renamed from: A, reason: collision with root package name */
    private static final String f35035A;

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private static final Object f35036B;

    /* renamed from: C, reason: collision with root package name */
    private static volatile a f35037C;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    public static final C0652a f35038y = new C0652a(0);

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private static final V2.e f35039z = V2.b.a("ozon_push_deduplication", null, null, null, 14);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C9277d f35040a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Application f35041b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Zg0.g f35042c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final m f35043d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final PushTokenUpdateResultsConverter f35044e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Nh0.d f35045f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C11123a f35046g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Ch0.a f35047h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final oh0.d f35048i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final xh0.d f35049j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Ph0.a f35050k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final oh0.c f35051l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final C9277d f35052m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final C7080a f35053n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final C8596a f35054o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final Ah0.a f35055p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final Ah0.c f35056q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final Hh0.a f35057r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final ph0.e f35058s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC5830a f35059t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final List<AbstractC6735a> f35060u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final C6957b f35061v;

    /* renamed from: w, reason: collision with root package name */
    private g f35062w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private vh0.g f35063x;

    /* renamed from: Yg0.a$a, reason: collision with other inner class name */
    public static final class C0652a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.m<Object>[] f35064a = {N.i(new G(C0652a.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"))};

        /* renamed from: Yg0.a$a$a, reason: collision with other inner class name */
        static final class C0653a extends AbstractC7737t implements Function0<InterfaceC8932a> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f35065b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0653a(Context context) {
                super(0);
                this.f35065b = context;
            }

            @Override // kotlin.jvm.functions.Function0
            public final InterfaceC8932a invoke() {
                return C8933b.a.a(this.f35065b);
            }
        }

        /* renamed from: Yg0.a$a$b */
        /* loaded from: classes3.dex */
        static final class b extends AbstractC7737t implements Function1<C6568c, String> {

            /* renamed from: b, reason: collision with root package name */
            public static final b f35066b = new b(1);

            @Override // kotlin.jvm.functions.Function1
            public final String invoke(C6568c c6568c) {
                C6568c it = c6568c;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.m();
            }
        }

        public /* synthetic */ C0652a(int i11) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x01a9  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x023b  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0304  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0349  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0437  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x043a  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x035c  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0318  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01b5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static a a(Application application, Zg0.g gVar, C6737c c6737c, Zg0.d dVar) {
            SharedPreferences sharedPreferences;
            ArrayList arrayList;
            Ld0.c f7;
            ArrayList arrayList2;
            InterfaceC5830a interfaceC5830a;
            TokenApi tokenApi;
            Zg0.a b11;
            Ch0.a dVar2;
            ArrayList arrayList3;
            h hVar;
            Ld0.d c11;
            ru.ozon.android.ozonLogger.core.h providePushConfiguration$lambda$1;
            List<Ld0.f> f11;
            pf0.h hVar2;
            int i11 = 0;
            if (dVar instanceof d.c) {
                int i12 = C6200a.f61627d;
                d.c cVar = (d.c) dVar;
                C6200a.d(cVar.a());
                int i13 = sh0.b.f98783c;
                sh0.b.d(cVar.b());
            } else {
                C6200a.d(dVar);
            }
            Context appContext = application.getApplicationContext();
            DeviceInfoManager.Companion companion = DeviceInfoManager.INSTANCE;
            Intrinsics.f(appContext);
            DeviceInfoManager invoke = companion.invoke(appContext);
            String string = application.getString(R.string.deeplink_scheme_ozonpush);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Intent intent = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme(string).build()).setPackage(application.getPackageName());
            Intrinsics.checkNotNullExpressionValue(intent, "setPackage(...)");
            if (appContext.getPackageManager().resolveActivity(intent, 65536) == null) {
                throw new IllegalStateException(A0.b("Необходимо добавить обработчик схемы ", string, " (@string/deeplink_scheme_ozonpush) в манифест на свою активити. Подробнее в README \"Подключение библиотеки\""));
            }
            m mVar = new m(new Qh0.h(application, gVar, c6737c.a()));
            Moshi moshi = new Moshi(new Moshi.a());
            PushTokenUpdateResultsConverter pushTokenUpdateResultsConverter = new PushTokenUpdateResultsConverter(moshi);
            E a11 = C10778c.a(appContext, gVar.i(), C7714v.a0(new xh0.e()));
            Ld0.c f12 = gVar.f();
            Retrofit H11 = (f12 == null || (hVar2 = (pf0.h) f12.d(pf0.h.class)) == null) ? null : hVar2.H((i) a.f35036B.getValue());
            boolean z11 = H11 != null;
            Zg0.e i14 = gVar.i();
            Bh0.b bVar = new Bh0.b();
            MoshiConverterFactory create = MoshiConverterFactory.create(moshi);
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            Retrofit.Builder newBuilder = H11 != null ? H11.newBuilder() : null;
            if (newBuilder == null) {
                newBuilder = new Retrofit.Builder().baseUrl(i14.c().e()).client(a11);
            }
            Retrofit build = newBuilder.addCallAdapterFactory(bVar).addConverterFactory(create).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            n e11 = n.e(appContext);
            Intrinsics.checkNotNullExpressionValue(e11, "from(...)");
            if (a.f35035A == null) {
                SharedPreferences sharedPreferences2 = appContext.getSharedPreferences("ozon_push_preferences", 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "getSharedPreferences(...)");
                sharedPreferences = sharedPreferences2;
            } else {
                try {
                    N4.a b12 = N4.a.b("ozon_push_preferences_encrypted", a.f35035A, appContext, a.c.AES256_SIV, a.d.AES256_GCM);
                    a.f35038y.getClass();
                    d(appContext, b12);
                    sharedPreferences = b12;
                } catch (Exception unused) {
                    i11 = 0;
                    sharedPreferences = appContext.getSharedPreferences("ozon_push_preferences", i11);
                    SharedPreferences sharedPreferences3 = sharedPreferences;
                    oh0.c cVar2 = new oh0.c(sharedPreferences3);
                    oh0.d dVar3 = new oh0.d(gVar, e11);
                    Oh0.a aVar = new Oh0.a(sharedPreferences3);
                    ContentResolver contentResolver = appContext.getContentResolver();
                    Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
                    Rh0.b bVar2 = new Rh0.b(gVar, sharedPreferences3, contentResolver);
                    arrayList = new ArrayList();
                    gVar.e().getClass();
                    f7 = gVar.f();
                    if (f7 != null) {
                    }
                    arrayList2 = arrayList;
                    interfaceC5830a = null;
                    if (z11) {
                    }
                    Ph0.b bVar3 = new Ph0.b(appContext, pushTokenUpdateResultsConverter);
                    Lh0.a aVar2 = new Lh0.a();
                    InterfaceC5830a interfaceC5830a2 = interfaceC5830a;
                    TokenApi tokenApi2 = tokenApi;
                    th0.c a12 = c.a.a(appContext);
                    Intrinsics.checkNotNullParameter(appContext, "context");
                    PackageInfo packageInfo = appContext.getPackageManager().getPackageInfo(appContext.getPackageName(), 0);
                    Intrinsics.checkNotNullExpressionValue(packageInfo, "getPackageInfo(...)");
                    ArrayList arrayList4 = arrayList2;
                    Nh0.d dVar4 = new Nh0.d(tokenApi2, bVar3, dVar3, aVar, gVar, bVar2, aVar2, cVar2, new th0.g(new th0.d(a12, new C9875a(packageInfo)), new th0.f(gVar.h()), sharedPreferences3, gVar.h()), invoke, null, interfaceC5830a2);
                    b11 = gVar.b();
                    if (b11 instanceof a.b) {
                    }
                    Ph0.a aVar3 = new Ph0.a(appContext);
                    new Mh0.a(aVar, sharedPreferences3).a();
                    PowerManagerRepository create2 = PowerManagerFactory.INSTANCE.create(invoke, application);
                    C9067a c9067a = new C9067a(application);
                    Ch0.b bVar4 = new Ch0.b(invoke, c9067a, create2, new TelephonyRepositoryImpl(application), create2, c9067a, c9067a);
                    Retrofit build2 = build.newBuilder().baseUrl(gVar.i().a()).build();
                    s.a a13 = r.a(PushDataBase.class, "ru.ozon.push.sdk.pushstatus.data.repository.database.PushDataBase", appContext);
                    a13.b(Dh0.a.a(), Dh0.a.b(), Dh0.a.c(), Dh0.a.d(), Dh0.a.e(), Dh0.a.f());
                    a13.g();
                    a13.e();
                    PushDataBase pushDataBase = (PushDataBase) a13.d();
                    Fh0.d a14 = pushDataBase.a();
                    Fh0.i b13 = pushDataBase.b();
                    if (gVar.n()) {
                    }
                    Ch0.a aVar4 = dVar2;
                    xh0.d dVar5 = new xh0.d();
                    Ah0.c cVar3 = new Ah0.c();
                    Hh0.a aVar5 = new Hh0.a(appContext, cVar3);
                    Ih0.m mVar2 = new Ih0.m(aVar4, aVar5, dVar5, bVar4);
                    if (gVar.e().o()) {
                    }
                    C11123a c11123a = new C11123a(mVar2, arrayList3);
                    Ih0.d dVar6 = new Ih0.d(gVar, mVar2, new Ih0.g(aVar4, bVar4));
                    h hVar3 = hVar;
                    C10906d c10906d = new C10906d(new j(appContext, gVar, e11, dVar3, hVar3, new vh0.n(appContext, new j.a().a())));
                    Y9.b e12 = D.e(Map.class, String.class, String.class);
                    Intrinsics.checkNotNullExpressionValue(e12, "newParameterizedType(...)");
                    JsonAdapter d11 = moshi.d(e12);
                    Intrinsics.checkNotNullExpressionValue(d11, "adapter(...)");
                    C9280g c9280g = new C9280g();
                    Object systemService = appContext.getSystemService((Class<Object>) AlarmManager.class);
                    Intrinsics.checkNotNullExpressionValue(systemService, "getSystemService(...)");
                    Intrinsics.checkNotNullParameter(appContext, "appContext");
                    C9277d c9277d = new C9277d(dVar4, dVar4, d11, c9280g, (AlarmManager) systemService, new C9274a());
                    C7080a c7080a = new C7080a();
                    C i15 = C.i(appContext);
                    Intrinsics.checkNotNullExpressionValue(i15, "getInstance(...)");
                    Ah0.b bVar5 = new Ah0.b(i15);
                    Ah0.a aVar6 = new Ah0.a();
                    List<Zg0.h> j11 = gVar.j();
                    C5637m c5637m = new C5637m();
                    InterfaceC3917k<W2.f> value = a.f35039z.getValue(application, f35064a[0]);
                    Ld0.c f13 = gVar.f();
                    return new a(application, gVar, mVar, pushTokenUpdateResultsConverter, dVar4, c11123a, aVar4, dVar3, dVar5, aVar3, cVar2, c9277d, c7080a, bVar2, new C8596a(dVar6), aVar6, cVar3, aVar5, new ph0.e(sharedPreferences3, new C0653a(appContext)), interfaceC5830a2, c6737c.a(), new C6957b(appContext, gVar, c10906d, j11, c9277d, c7080a, c5637m, new C10059a(new C9057a(value, moshi, ((f13 != null || (c11 = f13.c()) == null) ? null : c11.b()) != Nd0.b.DEBUG)), bVar5, aVar6, hVar3, interfaceC5830a2), c9277d);
                }
            }
            SharedPreferences sharedPreferences32 = sharedPreferences;
            oh0.c cVar22 = new oh0.c(sharedPreferences32);
            oh0.d dVar32 = new oh0.d(gVar, e11);
            Oh0.a aVar7 = new Oh0.a(sharedPreferences32);
            ContentResolver contentResolver2 = appContext.getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver2, "getContentResolver(...)");
            Rh0.b bVar22 = new Rh0.b(gVar, sharedPreferences32, contentResolver2);
            arrayList = new ArrayList();
            gVar.e().getClass();
            f7 = gVar.f();
            if (f7 != null || (f11 = f7.f()) == null) {
                arrayList2 = arrayList;
                interfaceC5830a = null;
            } else {
                arrayList2 = arrayList;
                ArrayList arrayList5 = new ArrayList();
                Iterator it = f11.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Iterator it2 = it;
                    if (next instanceof InterfaceC5830a) {
                        arrayList5.add(next);
                    }
                    it = it2;
                }
                interfaceC5830a = (InterfaceC5830a) C7714v.M(arrayList5);
            }
            if (z11) {
                Object create3 = build.create(OldTokenApi.class);
                Intrinsics.f(create3);
                tokenApi = (TokenApi) create3;
            } else {
                Object create4 = build.create(NewTokenApi.class);
                Intrinsics.f(create4);
                tokenApi = (TokenApi) create4;
            }
            Ph0.b bVar32 = new Ph0.b(appContext, pushTokenUpdateResultsConverter);
            Lh0.a aVar22 = new Lh0.a();
            InterfaceC5830a interfaceC5830a22 = interfaceC5830a;
            TokenApi tokenApi22 = tokenApi;
            th0.c a122 = c.a.a(appContext);
            Intrinsics.checkNotNullParameter(appContext, "context");
            PackageInfo packageInfo2 = appContext.getPackageManager().getPackageInfo(appContext.getPackageName(), 0);
            Intrinsics.checkNotNullExpressionValue(packageInfo2, "getPackageInfo(...)");
            ArrayList arrayList42 = arrayList2;
            Nh0.d dVar42 = new Nh0.d(tokenApi22, bVar32, dVar32, aVar7, gVar, bVar22, aVar22, cVar22, new th0.g(new th0.d(a122, new C9875a(packageInfo2)), new th0.f(gVar.h()), sharedPreferences32, gVar.h()), invoke, null, interfaceC5830a22);
            b11 = gVar.b();
            if (b11 instanceof a.b) {
                a.b bVar6 = (a.b) b11;
                String a15 = bVar6.c().a();
                String c12 = bVar22.c();
                ((OF.a) bVar6.b()).getClass();
                providePushConfiguration$lambda$1 = OzonPushModule.Companion.providePushConfiguration$lambda$1();
                providePushConfiguration$lambda$1.f(ru.ozon.android.ozonLogger.core.c.NOTICE, Sh.b.c("PushSdk hwid migration. Old hwid: ", a15, ", new hwid: ", c12), sj.f.b(new Pair("oldhwid", a15), new Pair("newhwid", c12)), Boolean.FALSE);
            }
            Ph0.a aVar32 = new Ph0.a(appContext);
            new Mh0.a(aVar7, sharedPreferences32).a();
            PowerManagerRepository create22 = PowerManagerFactory.INSTANCE.create(invoke, application);
            C9067a c9067a2 = new C9067a(application);
            Ch0.b bVar42 = new Ch0.b(invoke, c9067a2, create22, new TelephonyRepositoryImpl(application), create22, c9067a2, c9067a2);
            Retrofit build22 = build.newBuilder().baseUrl(gVar.i().a()).build();
            s.a a132 = r.a(PushDataBase.class, "ru.ozon.push.sdk.pushstatus.data.repository.database.PushDataBase", appContext);
            a132.b(Dh0.a.a(), Dh0.a.b(), Dh0.a.c(), Dh0.a.d(), Dh0.a.e(), Dh0.a.f());
            a132.g();
            a132.e();
            PushDataBase pushDataBase2 = (PushDataBase) a132.d();
            Fh0.d a142 = pushDataBase2.a();
            Fh0.i b132 = pushDataBase2.b();
            if (gVar.n()) {
                Object create5 = build22.create(PushStatusApiV2.class);
                Intrinsics.checkNotNullExpressionValue(create5, "create(...)");
                dVar2 = new Ch0.d((PushStatusApiV2) create5, a142, b132);
            } else {
                Object create6 = build22.create(PushStatusApiV3.class);
                Intrinsics.checkNotNullExpressionValue(create6, "create(...)");
                dVar2 = new Ch0.e((PushStatusApiV3) create6, bVar42, a142, b132);
            }
            Ch0.a aVar42 = dVar2;
            xh0.d dVar52 = new xh0.d();
            Ah0.c cVar32 = new Ah0.c();
            Hh0.a aVar52 = new Hh0.a(appContext, cVar32);
            Ih0.m mVar22 = new Ih0.m(aVar42, aVar52, dVar52, bVar42);
            if (gVar.e().o()) {
                arrayList3 = arrayList42;
                hVar = null;
            } else {
                hVar = new h(appContext, "UndisplayedPushTracker", ph0.j.a(), b.f35066b);
                arrayList3 = arrayList42;
                arrayList3.add(hVar);
            }
            C11123a c11123a2 = new C11123a(mVar22, arrayList3);
            Ih0.d dVar62 = new Ih0.d(gVar, mVar22, new Ih0.g(aVar42, bVar42));
            h hVar32 = hVar;
            C10906d c10906d2 = new C10906d(new vh0.j(appContext, gVar, e11, dVar32, hVar32, new vh0.n(appContext, new j.a().a())));
            Y9.b e122 = D.e(Map.class, String.class, String.class);
            Intrinsics.checkNotNullExpressionValue(e122, "newParameterizedType(...)");
            JsonAdapter d112 = moshi.d(e122);
            Intrinsics.checkNotNullExpressionValue(d112, "adapter(...)");
            C9280g c9280g2 = new C9280g();
            Object systemService2 = appContext.getSystemService((Class<Object>) AlarmManager.class);
            Intrinsics.checkNotNullExpressionValue(systemService2, "getSystemService(...)");
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            C9277d c9277d2 = new C9277d(dVar42, dVar42, d112, c9280g2, (AlarmManager) systemService2, new C9274a());
            C7080a c7080a2 = new C7080a();
            C i152 = C.i(appContext);
            Intrinsics.checkNotNullExpressionValue(i152, "getInstance(...)");
            Ah0.b bVar52 = new Ah0.b(i152);
            Ah0.a aVar62 = new Ah0.a();
            List<Zg0.h> j112 = gVar.j();
            C5637m c5637m2 = new C5637m();
            InterfaceC3917k<W2.f> value2 = a.f35039z.getValue(application, f35064a[0]);
            Ld0.c f132 = gVar.f();
            return new a(application, gVar, mVar, pushTokenUpdateResultsConverter, dVar42, c11123a2, aVar42, dVar32, dVar52, aVar32, cVar22, c9277d2, c7080a2, bVar22, new C8596a(dVar62), aVar62, cVar32, aVar52, new ph0.e(sharedPreferences32, new C0653a(appContext)), interfaceC5830a22, c6737c.a(), new C6957b(appContext, gVar, c10906d2, j112, c9277d2, c7080a2, c5637m2, new C10059a(new C9057a(value2, moshi, ((f132 != null || (c11 = f132.c()) == null) ? null : c11.b()) != Nd0.b.DEBUG)), bVar52, aVar62, hVar32, interfaceC5830a22), c9277d2);
        }

        @NotNull
        public static a b() throws C7680a {
            a aVar = a.f35037C;
            if (aVar != null) {
                return aVar;
            }
            throw new C7680a();
        }

        private static void d(Context context, N4.a aVar) {
            if (aVar.getBoolean("is_migration_done", false)) {
                return;
            }
            SharedPreferences.Editor edit = aVar.edit();
            Map<String, ?> all = context.getSharedPreferences("ozon_push_preferences", 0).getAll();
            Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof Integer) {
                    String key = entry.getKey();
                    Object value2 = entry.getValue();
                    Intrinsics.g(value2, "null cannot be cast to non-null type kotlin.Int");
                    edit.putInt(key, ((Integer) value2).intValue());
                } else if (value instanceof Long) {
                    String key2 = entry.getKey();
                    Object value3 = entry.getValue();
                    Intrinsics.g(value3, "null cannot be cast to non-null type kotlin.Long");
                    edit.putLong(key2, ((Long) value3).longValue());
                } else if (value instanceof String) {
                    String key3 = entry.getKey();
                    Object value4 = entry.getValue();
                    Intrinsics.g(value4, "null cannot be cast to non-null type kotlin.String");
                    edit.putString(key3, (String) value4);
                } else if (value instanceof Boolean) {
                    String key4 = entry.getKey();
                    Object value5 = entry.getValue();
                    Intrinsics.g(value5, "null cannot be cast to non-null type kotlin.Boolean");
                    edit.putBoolean(key4, ((Boolean) value5).booleanValue());
                } else if (value instanceof Float) {
                    String key5 = entry.getKey();
                    Object value6 = entry.getValue();
                    Intrinsics.g(value6, "null cannot be cast to non-null type kotlin.Float");
                    edit.putFloat(key5, ((Float) value6).floatValue());
                }
            }
            edit.putBoolean("is_migration_done", true);
            if (edit.commit()) {
                context.deleteSharedPreferences("ozon_push_preferences");
            }
        }

        @NotNull
        public final a c(@NotNull Application application, @NotNull Zg0.g pushConfiguration, @NotNull C6737c pushProviders, @NotNull Zg0.d logConfiguration) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(pushConfiguration, "pushConfiguration");
            Intrinsics.checkNotNullParameter(pushProviders, "pushProviders");
            Intrinsics.checkNotNullParameter(logConfiguration, "logConfiguration");
            if (a.f35037C == null) {
                synchronized (this) {
                    try {
                        if (a.f35037C == null) {
                            a.f35038y.getClass();
                            a.f35037C = a(application, pushConfiguration, pushProviders, logConfiguration);
                            a aVar = a.f35037C;
                            if (aVar != null) {
                                a.g(aVar, application);
                            }
                        }
                        Unit unit = Unit.f71690a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return b();
        }

        private C0652a() {
        }
    }

    static final class b extends AbstractC7737t implements Function0<Yg0.b> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f35067b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Yg0.b invoke() {
            return new Yg0.b();
        }
    }

    static final class c extends AbstractC7737t implements Function1<Qh0.i, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f35069c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Boolean f35070d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ jh0.c f35071e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ CompletableFuture<Unit> f35072f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z11, Boolean bool, jh0.c cVar, CompletableFuture<Unit> completableFuture) {
            super(1);
            this.f35069c = z11;
            this.f35070d = bool;
            this.f35071e = cVar;
            this.f35072f = completableFuture;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Qh0.i iVar) {
            Qh0.i updateResult = iVar;
            Intrinsics.checkNotNullParameter(updateResult, "updateResult");
            for (InterfaceC6738d.a aVar : updateResult.a()) {
                Wh0.d<C7429a> b11 = aVar.b();
                if (b11 instanceof d.a) {
                    int i11 = C6200a.f61627d;
                    Throwable a11 = ((d.a) b11).a();
                    Zg0.d b12 = C6200a.b();
                    if (b12 instanceof d.b) {
                        C6200a.c().a(C6200a.a(aVar.a() + " push token wasn't received. UpdateTrigger: " + this.f35071e + ". See exception for details."), a11);
                        ((d.b) b12).getClass();
                    }
                } else {
                    if (!(b11 instanceof d.b)) {
                        throw new o();
                    }
                    jh0.b a12 = aVar.a();
                    String a13 = ((C7429a) ((d.b) b11).a()).a();
                    jh0.c c11 = aVar.c();
                    Zg0.d b13 = C6200a.b();
                    if (b13 instanceof d.b) {
                        C6200a.c().a(C6200a.a(a12 + " push token was successfully received. Token: " + a13 + ", updateTrigger: " + c11 + "."), null);
                        ((d.b) b13).getClass();
                    }
                }
            }
            CompletableFuture<Unit> m11 = ((Nh0.d) a.this.v()).m(updateResult.a(), updateResult.b(), this.f35069c, this.f35070d);
            final CompletableFuture<Unit> completableFuture = this.f35072f;
            final f fVar = new f(completableFuture);
            m11.thenApply(new Function() { // from class: Yg0.d
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (Boolean) Function1.this.invoke(obj);
                }
            }).exceptionally((Function<Throwable, ? extends U>) new Function() { // from class: Yg0.e
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Throwable th2 = (Throwable) obj;
                    Zg0.d b14 = C6200a.b();
                    if (b14 instanceof d.b) {
                        C6200a.c().a(C6200a.a("Sending push-tokens failed."), th2);
                        ((d.b) b14).getClass();
                    }
                    return Boolean.valueOf(completableFuture.completeExceptionally(th2));
                }
            });
            return Unit.f71690a;
        }
    }

    static {
        String str = null;
        try {
            str = N4.c.a(N4.c.f18682a);
        } catch (Throwable unused) {
        }
        f35035A = str;
        f35036B = k.a(Sc.n.SYNCHRONIZED, b.f35067b);
    }

    private a() {
        throw null;
    }

    public a(Application application, Zg0.g gVar, m mVar, PushTokenUpdateResultsConverter pushTokenUpdateResultsConverter, Nh0.d dVar, C11123a c11123a, Ch0.a aVar, oh0.d dVar2, xh0.d dVar3, Ph0.a aVar2, oh0.c cVar, C9277d c9277d, C7080a c7080a, Rh0.b bVar, C8596a c8596a, Ah0.a aVar3, Ah0.c cVar2, Hh0.a aVar4, ph0.e eVar, InterfaceC5830a interfaceC5830a, List list, C6957b c6957b, C9277d c9277d2) {
        this.f35040a = c9277d2;
        this.f35041b = application;
        this.f35042c = gVar;
        this.f35043d = mVar;
        this.f35044e = pushTokenUpdateResultsConverter;
        this.f35045f = dVar;
        this.f35046g = c11123a;
        this.f35047h = aVar;
        this.f35048i = dVar2;
        this.f35049j = dVar3;
        this.f35050k = aVar2;
        this.f35051l = cVar;
        this.f35052m = c9277d;
        this.f35053n = c7080a;
        this.f35054o = c8596a;
        this.f35055p = aVar3;
        this.f35056q = cVar2;
        this.f35057r = aVar4;
        this.f35058s = eVar;
        this.f35059t = interfaceC5830a;
        this.f35060u = list;
        this.f35061v = c6957b;
        M m11 = M.f71699a;
        this.f35063x = new vh0.g(m11, m11, m11);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AbstractC6735a) obj).d(this.f35042c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC6736b a11 = ((AbstractC6735a) it.next()).a();
            if (a11 != null) {
                arrayList2.add(a11);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((InterfaceC6736b) it2.next()).a(this.f35041b, this.f35042c);
        }
        this.f35041b.registerActivityLifecycleCallbacks(new Yg0.c(this));
    }

    public static final void g(a aVar, Application application) {
        ProcessLifecycleOwner processLifecycleOwner;
        aVar.f35061v.d(application);
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        AbstractC5434v lifecycle = processLifecycleOwner.getLifecycle();
        Context applicationContext = application.getApplicationContext();
        Intrinsics.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
        Application application2 = (Application) applicationContext;
        Zg0.g gVar = aVar.f35042c;
        if (gVar.d() == null) {
            throw new o();
        }
        lifecycle.a(new oh0.j(aVar, aVar.f35048i, aVar.f35051l));
        Zg0.f a11 = ((b.a) gVar.d()).a();
        Ph0.a aVar2 = aVar.f35050k;
        if (a11 != null) {
            Intrinsics.checkNotNullParameter(application2, "<this>");
            if (!(application2 instanceof c.b)) {
                throw new Ph0.c();
            }
            aVar2.b(a11);
        } else {
            aVar2.a();
        }
        lifecycle.a(aVar.f35046g);
        Application application3 = aVar.f35041b;
        C8596a c8596a = aVar.f35054o;
        vh0.k kVar = new vh0.k(C7714v.b0(new vh0.m(c8596a, application3), new vh0.b(c8596a), new vh0.c(c8596a), new C10320a(c8596a)));
        Intrinsics.checkNotNullParameter(application2, "application");
        application2.registerActivityLifecycleCallbacks(kVar);
        C7080a c7080a = aVar.f35053n;
        c7080a.getClass();
        Intrinsics.checkNotNullParameter(application2, "application");
        application2.registerActivityLifecycleCallbacks(c7080a);
        if (gVar.e().n()) {
            aVar.f35058s.a();
        }
    }

    public static void z(a aVar, Set preShowingHandlers, Set postShowingHandlers) {
        M postOpeningHandlers = M.f71699a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(preShowingHandlers, "preShowingHandlers");
        Intrinsics.checkNotNullParameter(postShowingHandlers, "postShowingHandlers");
        Intrinsics.checkNotNullParameter(postOpeningHandlers, "postOpeningHandlers");
        aVar.f35063x = new vh0.g(preShowingHandlers, postShowingHandlers, postOpeningHandlers);
    }

    public final void A(@NotNull g teensModeProvider) {
        Intrinsics.checkNotNullParameter(teensModeProvider, "teensModeProvider");
        this.f35062w = teensModeProvider;
    }

    @NotNull
    public final CompletableFuture<Unit> B(@NotNull jh0.c updateTrigger, boolean z11) {
        Intrinsics.checkNotNullParameter(updateTrigger, "updateTrigger");
        CompletableFuture<Unit> completableFuture = new CompletableFuture<>();
        g gVar = this.f35062w;
        this.f35043d.b(updateTrigger, new c(z11, gVar != null ? Boolean.valueOf(gVar.isTeensModeEnabled()) : null, updateTrigger, completableFuture));
        return completableFuture;
    }

    @Override // bh0.InterfaceC5665a
    @NotNull
    public final U<Unit> a(@NotNull String widgetName, @NotNull Map<String, String> metadata) {
        Intrinsics.checkNotNullParameter(widgetName, "widgetName");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return this.f35040a.a(widgetName, metadata);
    }

    @Override // bh0.InterfaceC5665a
    public final void b(@NotNull InterfaceC5666b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f35040a.b(listener);
    }

    @NotNull
    public final C8596a i() {
        return this.f35054o;
    }

    public final InterfaceC5830a j() {
        return this.f35059t;
    }

    @NotNull
    public final Ah0.a k() {
        return this.f35055p;
    }

    @NotNull
    public final InterfaceC9275b l() {
        return this.f35052m;
    }

    @NotNull
    public final oh0.b m() {
        return this.f35051l;
    }

    @NotNull
    public final oh0.d n() {
        return this.f35048i;
    }

    @NotNull
    public final vh0.g o() {
        return this.f35063x;
    }

    @NotNull
    public final Zg0.g p() {
        return this.f35042c;
    }

    @NotNull
    public final InterfaceC6956a q() {
        return this.f35061v;
    }

    @NotNull
    public final Jh0.a r() {
        return this.f35056q;
    }

    @NotNull
    public final Ch0.a s() {
        return this.f35047h;
    }

    @NotNull
    public final Ih0.e t() {
        return this.f35057r;
    }

    @NotNull
    public final PushTokenUpdateResultsConverter u() {
        return this.f35044e;
    }

    @NotNull
    public final Nh0.b v() {
        return this.f35045f;
    }

    @NotNull
    public final xh0.d w() {
        return this.f35049j;
    }

    @NotNull
    public final List<C7429a> x() {
        return this.f35045f.h();
    }

    public final Boolean y() {
        g gVar = this.f35062w;
        if (gVar != null) {
            return Boolean.valueOf(gVar.isTeensModeEnabled());
        }
        return null;
    }
}
