package B20;

import B0.A0;
import De.C2862e;
import De.s;
import Td0.d;
import U20.b;
import android.os.Build;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r20.AbstractC9166c;
import r20.C9165b;
import s20.d;
import w20.C10420b;
import xe.C10720e0;
import xe.N;
import xe.X0;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<AbstractC9166c> f2200a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d f2201b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C9165b f2202c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final t20.c f2203d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final t20.j f2204e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final t20.e f2205f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final List<U20.c> f2206g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final e f2207h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C10420b f2208i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final t20.f f2209j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final H20.a f2210k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C2862e f2211l;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a extends RuntimeException {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull List<? extends AbstractC9166c> providers, @NotNull d dynamicProvidersInMemoryCache, @NotNull C9165b config, @NotNull t20.c appVersionProvider, @NotNull t20.j displayInfoProvider, @NotNull t20.e clearAppDataExecutor, @NotNull List<U20.c> libConfigs, @NotNull e inMemoryCache, @NotNull C10420b debugMenuRouter, @NotNull t20.f dependenciesProvider, @NotNull H20.a entryPointsProvider) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        Intrinsics.checkNotNullParameter(dynamicProvidersInMemoryCache, "dynamicProvidersInMemoryCache");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(appVersionProvider, "appVersionProvider");
        Intrinsics.checkNotNullParameter(displayInfoProvider, "displayInfoProvider");
        Intrinsics.checkNotNullParameter(clearAppDataExecutor, "clearAppDataExecutor");
        Intrinsics.checkNotNullParameter(libConfigs, "libConfigs");
        Intrinsics.checkNotNullParameter(inMemoryCache, "inMemoryCache");
        Intrinsics.checkNotNullParameter(debugMenuRouter, "debugMenuRouter");
        Intrinsics.checkNotNullParameter(dependenciesProvider, "dependenciesProvider");
        Intrinsics.checkNotNullParameter(entryPointsProvider, "entryPointsProvider");
        this.f2200a = providers;
        this.f2201b = dynamicProvidersInMemoryCache;
        this.f2202c = config;
        this.f2203d = appVersionProvider;
        this.f2204e = displayInfoProvider;
        this.f2205f = clearAppDataExecutor;
        this.f2206g = libConfigs;
        this.f2207h = inMemoryCache;
        this.f2208i = debugMenuRouter;
        this.f2209j = dependenciesProvider;
        this.f2210k = entryPointsProvider;
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f2211l = N.a(s.f6650a.x().plus(X0.b()));
    }

    @NotNull
    public final ArrayList d() {
        b.c cVar;
        ArrayList arrayList = new ArrayList();
        H20.a aVar = this.f2210k;
        aVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Td0.d dVar : aVar.a()) {
            if (dVar instanceof d.a) {
                linkedHashMap.put(((d.a) dVar).a(), dVar);
            }
        }
        for (s20.d dVar2 : H20.a.b()) {
            if (dVar2 instanceof d.a) {
                linkedHashMap.put(((d.a) dVar2).getId(), dVar2);
            }
        }
        List U02 = C7714v.U0(linkedHashMap.values());
        boolean isEmpty = U02.isEmpty();
        List<U20.c> list = this.f2206g;
        if (!isEmpty || !list.isEmpty()) {
            List<U20.c> list2 = list;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list2, 10));
            int i11 = 0;
            for (Object obj : list2) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                U20.c cVar2 = (U20.c) obj;
                arrayList2.add(new b.c(Ej.b.a(i11, "baseLibs"), cVar2.b(), null, cVar2.a()));
                i11 = i12;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : U02) {
                if (obj2 instanceof d.a) {
                    d.a aVar2 = (d.a) obj2;
                    cVar = new b.c(Nk.a.b("baseLibs", aVar2.a()), aVar2.c(), null, new n((d.a) obj2));
                } else if (obj2 instanceof d.a) {
                    d.a aVar3 = (d.a) obj2;
                    cVar = new b.c(Nk.a.b("baseLibs", aVar3.getId()), aVar3.getName(), null, new p((d.a) obj2));
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    arrayList3.add(cVar);
                }
            }
            arrayList.add(new U20.a("baseLibsGroup", "Библиотеки", C7714v.I0(new l(), C7714v.p0(arrayList3, arrayList2))));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List<AbstractC9166c> list3 = this.f2200a;
        ArrayList arrayList4 = new ArrayList(C7714v.z(list3, 10));
        for (AbstractC9166c abstractC9166c : list3) {
            U20.a provide = abstractC9166c.provide();
            linkedHashMap2.put(provide.a(), abstractC9166c);
            arrayList4.add(provide);
        }
        arrayList.addAll(arrayList4);
        LinkedHashMap a11 = this.f2201b.a();
        ArrayList arrayList5 = new ArrayList(a11.size());
        for (Map.Entry entry : a11.entrySet()) {
            U20.a provide2 = ((AbstractC9166c) entry.getValue()).provide();
            linkedHashMap2.put(provide2.a(), entry.getValue());
            arrayList5.add(provide2);
        }
        arrayList.addAll(arrayList5);
        this.f2207h.b(linkedHashMap2);
        C9165b c9165b = this.f2202c;
        if (c9165b.f()) {
            arrayList.add(new U20.a("localizationDebugGroup", "Отладка локализации", C7714v.a0(new b.C0551b("localizationDebugStrings", "Строки локализации", new q(this)))));
        }
        if (c9165b.d()) {
            arrayList.add(new U20.a("baseActionsGroup", "Базовые действия", C7714v.b0(new b.C0551b("baseActionsCrash", "Crash", h.f2213b), new b.C0551b("baseActionsAnr", "ANR", new i(1, t20.b.f98969a, t20.b.class, "execute", "execute(Landroid/content/Context;)V", 0)), new b.C0551b("baseActionsClearData", "Очистка данных", new k(this)))));
        }
        if (c9165b.c()) {
            b.a aVar4 = new b.a("appInfoVersion", "Версия приложения", this.f2203d.a(), null, 24);
            this.f2209j.getClass();
            Object[] elements = {aVar4, null, (t20.f.b().isEmpty() || t20.f.c().isEmpty()) ? null : new b.c("appInfoDependencies", "Зависимости", null, new g(this))};
            Intrinsics.checkNotNullParameter(elements, "elements");
            arrayList.add(new U20.a("appInfoGroup", "О приложении", C7705l.B(elements)));
        }
        if (c9165b.e()) {
            String MANUFACTURER = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            b.a aVar5 = new b.a("deviceInfoManufacturer", "Мануфактура", MANUFACTURER, null, 24);
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            b.a aVar6 = new b.a("deviceInfoModel", "Модель", MODEL, null, 24);
            b.a aVar7 = new b.a("deviceInfoAndroidSdk", "Android SDK", String.valueOf(Build.VERSION.SDK_INT), null, 24);
            t20.j jVar = this.f2204e;
            b.e eVar = new b.e("deviceInfoResolution", "Разрешение экрана", jVar.c() + " x " + jVar.e());
            String valueOf = String.valueOf(jVar.a());
            int b11 = jVar.b();
            int b12 = jVar.b();
            arrayList.add(new U20.a("deviceInfoGroup", "Об устройстве", C7714v.b0(aVar5, aVar6, aVar7, eVar, new b.a("deviceInfoDensity", "Density", valueOf, b11 + "dpi - " + ((b12 < 0 || b12 >= 121) ? (120 > b12 || b12 >= 161) ? b12 == 213 ? "tvdpi" : (160 > b12 || b12 >= 241) ? (240 > b12 || b12 >= 321) ? (320 > b12 || b12 >= 481) ? (480 > b12 || b12 >= 641) ? "unknown" : "xxxhdpi" : "xxhdpi" : "xhdpi" : "hdpi" : "mdpi" : "ldpi"), 16), new b.e("deviceInfoScreenDp", "Размеры в DP", ((int) (((float) jVar.c()) / jVar.a())) + "dp x " + ((int) (((float) jVar.e()) / jVar.a())) + "dp"), new b.e("deviceInfoScreenDpWithoutSystemBars", "Размеры в DP без системных панелей", jVar.d() + "dp x " + ((int) (((float) jVar.e()) / jVar.a())) + "dp"))));
        }
        return arrayList;
    }

    @NotNull
    public final U20.a e(@NotNull String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        AbstractC9166c abstractC9166c = this.f2207h.a().get(groupId);
        U20.a provide = abstractC9166c != null ? abstractC9166c.provide() : null;
        if (provide != null) {
            return provide;
        }
        throw new IllegalStateException(A0.b("Группы с id - ", groupId, " не существует, либо id был изменен").toString());
    }
}
