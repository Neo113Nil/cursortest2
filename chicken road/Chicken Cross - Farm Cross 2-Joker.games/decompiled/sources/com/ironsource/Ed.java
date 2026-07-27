package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Ed {

    /* renamed from: a, reason: collision with root package name */
    private final Map<LevelPlay.AdFormat, a> f7617a;

    public static final class a {
        public static final C0306a c = new C0306a(null);
        private static final String d = "adUnitId";
        private static final String e = "instances";

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, b> f7618a;
        private final List<c> b;

        /* renamed from: com.ironsource.Ed$a$a, reason: collision with other inner class name */
        public static final class C0306a {
            public /* synthetic */ C0306a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0306a() {
            }
        }

        public a(JSONObject adFormatProviderOrder) {
            Intrinsics.checkNotNullParameter(adFormatProviderOrder, "adFormatProviderOrder");
            List<String> b = C4444ha.b(adFormatProviderOrder.names());
            b = b == null ? CollectionsKt.emptyList() : b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : b) {
                if (!Intrinsics.areEqual((String) obj, "preload")) {
                    arrayList.add(obj);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
            for (Object obj2 : arrayList) {
                JSONArray optJSONArray = adFormatProviderOrder.optJSONArray((String) obj2);
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                } else {
                    Intrinsics.checkNotNullExpressionValue(optJSONArray, "adFormatProviderOrder.op…(adUnitId) ?: JSONArray()");
                }
                linkedHashMap.put(obj2, new b(optJSONArray));
            }
            this.f7618a = linkedHashMap;
            this.b = b(adFormatProviderOrder);
        }

        public final Map<String, b> a() {
            return this.f7618a;
        }

        public final List<c> b() {
            return this.b;
        }

        private final c a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            String optString = jSONObject.has("adUnitId") ? jSONObject.optString("adUnitId") : null;
            JSONArray optJSONArray = jSONObject.optJSONArray("instances");
            return new c(optString, optJSONArray != null ? C4444ha.b(optJSONArray) : null);
        }

        private final List<c> b(JSONObject jSONObject) {
            JSONArray optJSONArray = jSONObject.optJSONArray("preload");
            if (optJSONArray == null) {
                return CollectionsKt.emptyList();
            }
            IntRange until = RangesKt.until(0, optJSONArray.length());
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                c a2 = a(optJSONArray.optJSONObject(((IntIterator) it).nextInt()));
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            return arrayList;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f7619a;

        public b(JSONArray providerOrder) {
            Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
            List<String> b = C4444ha.b(providerOrder);
            Intrinsics.checkNotNullExpressionValue(b, "jsonArrayToStringList(providerOrder)");
            this.f7619a = b;
        }

        public final List<String> a() {
            return this.f7619a;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f7620a;
        private final List<String> b;

        public c(String str, List<String> list) {
            this.f7620a = str;
            this.b = list;
        }

        public final String a() {
            return this.f7620a;
        }

        public final List<String> b() {
            return this.b;
        }

        public final String c() {
            return this.f7620a;
        }

        public final List<String> d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f7620a, cVar.f7620a) && Intrinsics.areEqual(this.b, cVar.b);
        }

        public int hashCode() {
            String str = this.f7620a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<String> list = this.b;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "AdUnitPreloadConfig(adUnitId=" + this.f7620a + ", instanceIds=" + this.b + ")";
        }

        public final c a(String str, List<String> list) {
            return new c(str, list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c a(c cVar, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.f7620a;
            }
            if ((i & 2) != 0) {
                list = cVar.b;
            }
            return cVar.a(str, list);
        }
    }

    public Ed(JSONObject providerOrder) {
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        LevelPlay.AdFormat[] values = LevelPlay.AdFormat.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(values.length), 16));
        for (LevelPlay.AdFormat adFormat : values) {
            JSONObject optJSONObject = providerOrder.optJSONObject(Gf.a(adFormat));
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            } else {
                Intrinsics.checkNotNullExpressionValue(optJSONObject, "providerOrder.optJSONObj…dFormat)) ?: JSONObject()");
            }
            linkedHashMap.put(adFormat, new a(optJSONObject));
        }
        this.f7617a = linkedHashMap;
    }

    public final Map<LevelPlay.AdFormat, a> a() {
        return this.f7617a;
    }

    public final List<c> a(LevelPlay.AdFormat adFormat) {
        List<c> b2;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        a aVar = this.f7617a.get(adFormat);
        return (aVar == null || (b2 = aVar.b()) == null) ? CollectionsKt.emptyList() : b2;
    }
}
