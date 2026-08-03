package com.unity3d.mediation.segment;

/* loaded from: classes5.dex */
public final class LevelPlaySegment {
    public static final com.unity3d.mediation.segment.LevelPlaySegment.a Companion = new com.unity3d.mediation.segment.LevelPlaySegment.a(null);
    public static final java.lang.String IAPT = "iapt";
    public static final java.lang.String LEVEL = "lvl";
    public static final java.lang.String PAYING = "pay";
    public static final java.lang.String SEGMENT_NAME = "segName";
    public static final java.lang.String USER_CREATION_DATE = "ucd";
    private static final int h = 999999;
    private static final double i = 999999.99d;
    private static final int j = 5;
    private static final java.lang.String k = "custom";
    private boolean c;
    private java.lang.String d;
    private long g;

    /* renamed from: a, reason: collision with root package name */
    private final java.util.ArrayList<kotlin.Pair<java.lang.String, java.lang.String>> f8054a = new java.util.ArrayList<>();
    private final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(false);
    private int e = -1;
    private double f = -1.0d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final boolean a(java.lang.String str) {
        if (str == null) {
            return false;
        }
        return new kotlin.text.Regex("^[a-zA-Z0-9]*$").matches(str);
    }

    public final java.util.ArrayList<kotlin.Pair<java.lang.String, java.lang.String>> getCustoms$mediationsdk_release() {
        return this.f8054a;
    }

    public final double getIapTotal() {
        return this.f;
    }

    public final int getLevel() {
        return this.e;
    }

    public final java.util.ArrayList<kotlin.Pair<java.lang.String, java.lang.String>> getSegmentData() {
        com.ironsource.mediationsdk.logger.IronLog.API.info("");
        java.util.ArrayList<kotlin.Pair<java.lang.String, java.lang.String>> arrayList = new java.util.ArrayList<>();
        if (this.e != -1) {
            arrayList.add(new kotlin.Pair<>("lvl", java.lang.String.valueOf(this.e)));
        }
        if (this.c) {
            arrayList.add(new kotlin.Pair<>("pay", java.lang.String.valueOf(isPaying())));
        }
        if (this.f != -1.0d) {
            arrayList.add(new kotlin.Pair<>("iapt", java.lang.String.valueOf(this.f)));
        }
        if (this.g != 0) {
            arrayList.add(new kotlin.Pair<>("ucd", java.lang.String.valueOf(this.g)));
        }
        java.lang.String str = this.d;
        if (str != null && !android.text.TextUtils.isEmpty(str)) {
            arrayList.add(new kotlin.Pair<>(SEGMENT_NAME, str));
        }
        java.util.ArrayList<kotlin.Pair<java.lang.String, java.lang.String>> arrayList2 = this.f8054a;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator<T> it = arrayList2.iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            arrayList3.add(new kotlin.Pair("custom_" + pair.getFirst(), pair.getSecond()));
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    public final java.lang.String getSegmentName() {
        return this.d;
    }

    public final long getUserCreationDate() {
        return this.g;
    }

    public final boolean isPaying() {
        return this.b.get();
    }

    public final void setCustom(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        com.ironsource.mediationsdk.logger.IronLog.API.info("");
        try {
            if (a(key) && a(key, 1, 32) && a(value) && a(value, 1, 32)) {
                if (this.f8054a.size() >= 5) {
                    this.f8054a.remove(0);
                }
                this.f8054a.add(new kotlin.Pair<>(key, value));
                return;
            }
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning(key + ", " + value + " must be alphanumeric and 1-32 in length");
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    public final void setIapTotal(double d) {
        com.ironsource.mediationsdk.logger.IronLog.API.info("");
        if (0.0d <= d && d <= i) {
            double d2 = 100;
            this.f = java.lang.Math.floor(d * d2) / d2;
            return;
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning(d + " must be between 0-999999.99");
    }

    public final void setLevel(int i2) {
        com.ironsource.mediationsdk.logger.IronLog.API.info("");
        if (1 <= i2 && i2 < 1000000) {
            this.e = i2;
            return;
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning(i2 + " must be between 1-999999");
    }

    public final void setPaying(boolean z) {
        com.ironsource.mediationsdk.logger.IronLog.API.info("");
        this.c = true;
        this.b.set(z);
    }

    public final void setSegmentName(java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronLog.API.info("");
        if (a(str) && a(str, 1, 32)) {
            this.d = str;
            return;
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning(str + " must be alphanumeric and 1-32 in length");
    }

    public final void setUserCreationDate(long j2) {
        com.ironsource.mediationsdk.logger.IronLog.API.info("");
        if (j2 > 0) {
            this.g = j2;
            return;
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning(j2 + " is an invalid timestamp");
    }

    public final org.json.JSONObject toJson() {
        com.ironsource.mediationsdk.logger.IronLog.API.info("");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.util.Iterator<kotlin.Pair<java.lang.String, java.lang.String>> it = getSegmentData().iterator();
        while (it.hasNext()) {
            kotlin.Pair<java.lang.String, java.lang.String> next = it.next();
            try {
                jSONObject.put(next.component1(), next.component2());
            } catch (org.json.JSONException e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("exception " + e.getMessage());
            }
        }
        return jSONObject;
    }

    private final boolean a(java.lang.String str, int i2, int i3) {
        return str != null && str.length() >= i2 && str.length() <= i3;
    }
}
