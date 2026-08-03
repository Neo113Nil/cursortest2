package com.ironsource;

/* loaded from: classes5.dex */
public final class Fd {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Map<com.unity3d.mediation.LevelPlay.AdFormat, com.ironsource.Fd.a> f5707a;

    public static final class a {
        public static final com.ironsource.Fd.a.C0117a c = new com.ironsource.Fd.a.C0117a(null);
        private static final java.lang.String d = "adUnitId";
        private static final java.lang.String e = "instances";

        /* renamed from: a, reason: collision with root package name */
        private final java.util.Map<java.lang.String, com.ironsource.Fd.b> f5708a;
        private final java.util.List<com.ironsource.Fd.c> b;

        /* renamed from: com.ironsource.Fd$a$a, reason: collision with other inner class name */
        public static final class C0117a {
            public /* synthetic */ C0117a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0117a() {
            }
        }

        public a(org.json.JSONObject adFormatProviderOrder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormatProviderOrder, "adFormatProviderOrder");
            java.util.List<java.lang.String> b = com.ironsource.C3079ha.b(adFormatProviderOrder.names());
            b = b == null ? kotlin.collections.CollectionsKt.emptyList() : b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : b) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual((java.lang.String) obj, "preload")) {
                    arrayList.add(obj);
                }
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
            for (java.lang.Object obj2 : arrayList) {
                org.json.JSONArray optJSONArray = adFormatProviderOrder.optJSONArray((java.lang.String) obj2);
                if (optJSONArray == null) {
                    optJSONArray = new org.json.JSONArray();
                } else {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optJSONArray, "adFormatProviderOrder.op…(adUnitId) ?: JSONArray()");
                }
                linkedHashMap.put(obj2, new com.ironsource.Fd.b(optJSONArray));
            }
            this.f5708a = linkedHashMap;
            this.b = b(adFormatProviderOrder);
        }

        public final java.util.Map<java.lang.String, com.ironsource.Fd.b> a() {
            return this.f5708a;
        }

        public final java.util.List<com.ironsource.Fd.c> b() {
            return this.b;
        }

        private final com.ironsource.Fd.c a(org.json.JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            java.lang.String optString = jSONObject.has("adUnitId") ? jSONObject.optString("adUnitId") : null;
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("instances");
            return new com.ironsource.Fd.c(optString, optJSONArray != null ? com.ironsource.C3079ha.b(optJSONArray) : null);
        }

        private final java.util.List<com.ironsource.Fd.c> b(org.json.JSONObject jSONObject) {
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("preload");
            if (optJSONArray == null) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
            kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, optJSONArray.length());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<java.lang.Integer> it = until.iterator();
            while (it.hasNext()) {
                com.ironsource.Fd.c a2 = a(optJSONArray.optJSONObject(((kotlin.collections.IntIterator) it).nextInt()));
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            return arrayList;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final java.util.List<java.lang.String> f5709a;

        public b(org.json.JSONArray providerOrder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
            java.util.List<java.lang.String> b = com.ironsource.C3079ha.b(providerOrder);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "jsonArrayToStringList(providerOrder)");
            this.f5709a = b;
        }

        public final java.util.List<java.lang.String> a() {
            return this.f5709a;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f5710a;
        private final java.util.List<java.lang.String> b;

        public c(java.lang.String str, java.util.List<java.lang.String> list) {
            this.f5710a = str;
            this.b = list;
        }

        public final java.lang.String a() {
            return this.f5710a;
        }

        public final java.util.List<java.lang.String> b() {
            return this.b;
        }

        public final java.lang.String c() {
            return this.f5710a;
        }

        public final java.util.List<java.lang.String> d() {
            return this.b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.ironsource.Fd.c)) {
                return false;
            }
            com.ironsource.Fd.c cVar = (com.ironsource.Fd.c) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.f5710a, cVar.f5710a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, cVar.b);
        }

        public int hashCode() {
            java.lang.String str = this.f5710a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            java.util.List<java.lang.String> list = this.b;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        public java.lang.String toString() {
            return "AdUnitPreloadConfig(adUnitId=" + this.f5710a + ", instanceIds=" + this.b + ")";
        }

        public final com.ironsource.Fd.c a(java.lang.String str, java.util.List<java.lang.String> list) {
            return new com.ironsource.Fd.c(str, list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.ironsource.Fd.c a(com.ironsource.Fd.c cVar, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cVar.f5710a;
            }
            if ((i & 2) != 0) {
                list = cVar.b;
            }
            return cVar.a(str, list);
        }
    }

    public Fd(org.json.JSONObject providerOrder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        com.unity3d.mediation.LevelPlay.AdFormat[] values = com.unity3d.mediation.LevelPlay.AdFormat.values();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(values.length), 16));
        for (com.unity3d.mediation.LevelPlay.AdFormat adFormat : values) {
            org.json.JSONObject optJSONObject = providerOrder.optJSONObject(com.ironsource.Ff.a(adFormat));
            if (optJSONObject == null) {
                optJSONObject = new org.json.JSONObject();
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optJSONObject, "providerOrder.optJSONObj…dFormat)) ?: JSONObject()");
            }
            linkedHashMap.put(adFormat, new com.ironsource.Fd.a(optJSONObject));
        }
        this.f5707a = linkedHashMap;
    }

    public final java.util.Map<com.unity3d.mediation.LevelPlay.AdFormat, com.ironsource.Fd.a> a() {
        return this.f5707a;
    }

    public final java.util.List<com.ironsource.Fd.c> a(com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        java.util.List<com.ironsource.Fd.c> b2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        com.ironsource.Fd.a aVar = this.f5707a.get(adFormat);
        return (aVar == null || (b2 = aVar.b()) == null) ? kotlin.collections.CollectionsKt.emptyList() : b2;
    }
}
