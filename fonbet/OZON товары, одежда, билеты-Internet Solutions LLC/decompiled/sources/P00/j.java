package P00;

import S00.d;
import Sc.r;
import Sc.s;
import T00.m;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e10.AbstractC6251a;
import e10.AbstractC6252b;
import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m20.InterfaceC8046a;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final n20.k<? extends InterfaceC8046a<?, ? extends l20.c>> f21488a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final U00.c f21489b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final e f21490c;

    /* loaded from: classes3.dex */
    static final class a extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21491b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f21492c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, m mVar) {
            super(0);
            this.f21491b = str;
            this.f21492c = mVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Not found config for widget(" + this.f21491b + ") and version(" + this.f21492c.f() + ")";
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f21493b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Composer got an error trying to parse a component";
        }
    }

    public j(@NotNull n20.k widgetStore, @NotNull U00.c serializer, @NotNull e executor) {
        Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f21488a = widgetStore;
        this.f21489b = serializer;
        this.f21490c = executor;
    }

    public static T00.f a(j jVar, T00.h hVar, S00.d dVar) {
        return jVar.c(hVar, dVar);
    }

    private final InterfaceC7243a<? extends Object> b(m mVar, C7244b c7244b) {
        String h11 = mVar.h();
        Collection<InterfaceC7243a<? extends Object>> configs = this.f21488a.getConfigs(h11, mVar.f());
        if (configs.isEmpty()) {
            H00.c.e(new a(h11, mVar));
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : configs) {
            if (((InterfaceC7243a) obj).canParse(c7244b)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > 1) {
            H00.c.c(new IllegalStateException(P4.f.a(mVar.f(), "). Must be only one config which canParse state", Cm.e.g(arrayList.size(), "Has ", " configs for ", h11, " and version("))));
        }
        return (InterfaceC7243a) C7714v.M(arrayList);
    }

    private final T00.f<List<T00.j>> c(T00.h hVar, final S00.d dVar) {
        Object parse;
        m c11 = hVar.e().c();
        ArrayList arrayList = new ArrayList();
        List<T00.j> list = K.f71697a;
        InterfaceC7243a<? extends Object> a11 = hVar.a();
        if (a11 == null) {
            arrayList.add(new R00.e(c11, false));
            return new T00.f<>(arrayList, null);
        }
        if (U4.a.b()) {
            c11.getClass();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        dVar.c(c11);
        try {
            try {
                parse = a11.parse(hVar.e());
            } catch (Exception e11) {
                H00.c.b(e11, b.f21493b);
                arrayList.add(new R00.d(c11, l.PARSE, e11));
            }
            if (parse == null) {
                arrayList.add(new R00.e(c11, true));
                return new T00.f<>(arrayList, null);
            }
            Set<String> supportedPlaceholders = a11.getSupportedPlaceholders();
            for (Map.Entry<String, T00.g> entry : hVar.b().entrySet()) {
                String key = entry.getKey();
                T00.g value = entry.getValue();
                if (supportedPlaceholders.contains(key)) {
                    List<T00.h> b11 = value.b();
                    ArrayList arrayList2 = new ArrayList(C7714v.z(b11, 10));
                    for (final T00.h hVar2 : b11) {
                        arrayList2.add(new Callable() { // from class: P00.i
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return j.a(j.this, hVar2, dVar);
                            }
                        });
                    }
                    ArrayList a12 = this.f21490c.a(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = a12.iterator();
                    while (it.hasNext()) {
                        T00.f fVar = (T00.f) it.next();
                        arrayList.addAll(fVar.a());
                        Iterable iterable = (List) fVar.b();
                        if (iterable == null) {
                            iterable = K.f71697a;
                        }
                        C7714v.p(iterable, arrayList3);
                    }
                    linkedHashMap.put(key, arrayList3);
                } else {
                    String a13 = value.a();
                    if (a13 != null) {
                        linkedHashMap2.put(key, a13);
                    }
                }
            }
            if (a11 instanceof AbstractC6252b) {
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = ((List) parse).iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    T00.j jVar = next == null ? null : new T00.j(c11, next, linkedHashMap, linkedHashMap2);
                    if (jVar != null) {
                        arrayList4.add(jVar);
                    }
                }
                list = arrayList4;
            } else {
                list = C7714v.a0(new T00.j(c11, parse, linkedHashMap, linkedHashMap2));
            }
            if (a11 instanceof AbstractC6251a) {
                HashMap hashMap = new HashMap();
                for (String str : ((AbstractC6251a) a11).getCombineKeys()) {
                    List list2 = (List) linkedHashMap.remove(str);
                    if (list2 != null) {
                        hashMap.put(str, list2);
                    }
                }
                list = ((AbstractC6251a) a11).combineWith(list, hashMap);
            }
            dVar.a(c11);
            return new T00.f<>(arrayList, list);
        } finally {
            U4.a.b();
        }
    }

    private final T00.h g(JSONObject jSONObject, T00.a aVar, JSONObject jSONObject2) {
        JSONObject optJSONObject;
        String optString;
        Map map;
        JSONArray optJSONArray;
        JSONObject jSONObject3;
        T00.h g10;
        j jVar = this;
        T00.a aVar2 = aVar;
        JSONObject jSONObject4 = jSONObject2;
        String jSONObject5 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject5, "toString(...)");
        m mVar = (m) jVar.f21489b.a(jSONObject5, m.class);
        String c11 = mVar.c();
        if (c11 == null || c11.length() == 0) {
            return null;
        }
        String c12 = mVar.c();
        JSONObject jSONObject6 = (c12 == null || (optJSONObject = jSONObject4.optJSONObject("widgetStates")) == null || (optString = optJSONObject.optString(c12)) == null || kotlin.text.h.K(optString)) ? null : new JSONObject(optString);
        if (jSONObject6 == null) {
            return null;
        }
        String jSONObject7 = jSONObject6.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject7, "toString(...)");
        C7244b c7244b = new C7244b(jSONObject7, aVar2, mVar);
        InterfaceC7243a<? extends Object> b11 = jVar.b(mVar, c7244b);
        if (b11 == null) {
            map = U.c();
        } else {
            JSONArray optJSONArray2 = jSONObject.optJSONArray("placeholders");
            if (optJSONArray2 == null) {
                map = U.c();
            } else {
                U00.d dVar = new U00.d(optJSONArray2);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<JSONObject> it = dVar.iterator();
                while (it.hasNext()) {
                    JSONObject next = it.next();
                    String optString2 = next.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    Intrinsics.f(optString2);
                    if (kotlin.text.h.K(optString2)) {
                        optString2 = null;
                    }
                    if (optString2 != null && (optJSONArray = next.optJSONArray("widgets")) != null) {
                        if (b11.getSupportedPlaceholders().contains(optString2)) {
                            jSONObject3 = null;
                        } else {
                            jSONObject3 = new JSONObject();
                            jSONObject3.put("layout", optJSONArray);
                            jSONObject3.put("widgetStates", new JSONObject());
                            jSONObject3.putOpt("shared", jSONObject4.opt("shared"));
                            jSONObject3.putOpt("trackingPayloads", jSONObject4.opt("trackingPayloads"));
                            jSONObject3.putOpt("trackingTokenAliases", jSONObject4.opt("trackingTokenAliases"));
                            jSONObject3.putOpt("pageToken", jSONObject4.opt("pageToken"));
                            jSONObject3.putOpt("userToken", jSONObject4.opt("userToken"));
                        }
                        int length = optJSONArray.length();
                        ArrayList arrayList = new ArrayList(length);
                        int i11 = 0;
                        while (i11 < length) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i11);
                            if (optJSONObject2 != null && (g10 = jVar.g(optJSONObject2, aVar2, jSONObject4)) != null) {
                                if (jSONObject3 != null) {
                                    JSONObject jSONObject8 = jSONObject3.getJSONObject("widgetStates");
                                    jSONObject8.put(g10.d(), g10.c());
                                    Iterator it2 = g10.b().values().iterator();
                                    while (it2.hasNext()) {
                                        for (Iterator it3 = ((ArrayList) ((T00.g) it2.next()).b()).iterator(); it3.hasNext(); it3 = it3) {
                                            T00.h hVar = (T00.h) it3.next();
                                            jSONObject8.put(hVar.d(), hVar.c());
                                            it2 = it2;
                                        }
                                    }
                                }
                                arrayList.add(g10);
                            }
                            i11++;
                            jVar = this;
                            aVar2 = aVar;
                            jSONObject4 = jSONObject2;
                        }
                        linkedHashMap.put(optString2, new T00.g(jSONObject3 != null ? jSONObject3.toString() : null, arrayList));
                        jVar = this;
                        aVar2 = aVar;
                        jSONObject4 = jSONObject2;
                    }
                }
                map = linkedHashMap;
            }
        }
        return new T00.h(b11, c7244b, jSONObject6, map);
    }

    @NotNull
    public final T00.a d(@NotNull JSONObject pageJson, @NotNull String page) {
        Intrinsics.checkNotNullParameter(pageJson, "pageJson");
        Intrinsics.checkNotNullParameter(page, "page");
        U4.a.b();
        return (T00.a) this.f21489b.a(page, T00.a.class);
    }

    public final T00.f e(@NotNull m layout, @NotNull String widgetState, @NotNull d.a.C0507a widgetMetricsCollector) {
        T00.a aVar;
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(widgetState, "widgetState");
        Intrinsics.checkNotNullParameter(widgetMetricsCollector, "widgetMetricsCollector");
        String c11 = layout.c();
        if (c11 == null || c11.length() == 0) {
            return null;
        }
        aVar = T00.a.f26425n;
        C7244b c7244b = new C7244b(widgetState, aVar, layout);
        return c(new T00.h(b(layout, c7244b), c7244b, new JSONObject(), U.c()), widgetMetricsCollector);
    }

    public final T00.f f(@NotNull JSONObject rawLayout, @NotNull JSONObject json, @NotNull T00.a state, @NotNull S00.e widgetMetricsCollector) {
        Object a11;
        Intrinsics.checkNotNullParameter(rawLayout, "rawLayout");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetMetricsCollector, "widgetMetricsCollector");
        try {
            r.Companion companion = r.INSTANCE;
            a11 = g(rawLayout, state, json);
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (a11 instanceof r.b) {
            a11 = null;
        }
        T00.h hVar = (T00.h) a11;
        if (hVar != null) {
            return c(hVar, widgetMetricsCollector);
        }
        return null;
    }
}
