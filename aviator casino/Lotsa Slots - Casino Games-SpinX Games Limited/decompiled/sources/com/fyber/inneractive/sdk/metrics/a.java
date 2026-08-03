package com.fyber.inneractive.sdk.metrics;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3792a;

    public a(java.lang.String str) {
        this.f3792a = str;
    }

    public static boolean a(int i, int i2, org.json.JSONArray jSONArray, java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList) {
        if (i <= 0 || i2 <= 0) {
            return false;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - java.util.concurrent.TimeUnit.HOURS.toMillis(i);
        int i3 = 0;
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            long optLong = jSONArray.optLong(i4, 0L);
            if (optLong > currentTimeMillis) {
                i3++;
                copyOnWriteArrayList.add(java.lang.Long.valueOf(optLong));
            }
        }
        return i3 >= i2;
    }
}
