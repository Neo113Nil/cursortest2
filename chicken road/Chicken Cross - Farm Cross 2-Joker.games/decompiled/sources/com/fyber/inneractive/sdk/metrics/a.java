package com.fyber.inneractive.sdk.metrics;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5446a;

    public a(String str) {
        this.f5446a = str;
    }

    public static boolean a(int i, int i2, JSONArray jSONArray, CopyOnWriteArrayList copyOnWriteArrayList) {
        if (i <= 0 || i2 <= 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.HOURS.toMillis(i);
        int i3 = 0;
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            long optLong = jSONArray.optLong(i4, 0L);
            if (optLong > currentTimeMillis) {
                i3++;
                copyOnWriteArrayList.add(Long.valueOf(optLong));
            }
        }
        return i3 >= i2;
    }
}
