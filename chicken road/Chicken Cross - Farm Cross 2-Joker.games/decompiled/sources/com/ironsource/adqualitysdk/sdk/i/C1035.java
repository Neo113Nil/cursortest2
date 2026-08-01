package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ỵ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1035 implements Comparable {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0414 f3075;

    public C1035(C0414 c0414) {
        this.f3075 = c0414;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        JSONObject jSONObject;
        C1035 c1035 = (C1035) obj;
        synchronized (this) {
            jSONObject = this.f3075.f546;
        }
        long optLong = jSONObject.optLong(StringFog.decrypt("lM0=\n", "4L6V1DpKvq8=\n"));
        long m5811 = c1035.m5811();
        if (optLong >= m5811) {
            if (optLong == m5811) {
                long m5809 = m5809();
                long m58092 = c1035.m5809();
                if (m5809 >= m58092) {
                    if (m5809 == m58092) {
                        return 0;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1035.class != obj.getClass()) {
            return false;
        }
        return this.f3075.f545.equals(((C1035) obj).f3075.f545);
    }

    public final int hashCode() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3075.f546;
        }
        if (jSONObject != null) {
            return m5810().hashCode();
        }
        return 0;
    }

    public final String toString() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3075.f546;
        }
        return jSONObject.toString();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m5808() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3075.f546;
        }
        return jSONObject.optString(StringFog.decrypt("iN4m\n", "/bdCV3H7VkY=\n"), null);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final long m5809() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3075.f546;
        }
        return jSONObject.optInt(StringFog.decrypt("fYM=\n", "GO1rEoeHd7Y=\n"));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized JSONObject m5810() {
        return this.f3075.f546;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m5812(int i) {
        JSONObject jSONObject = this.f3075.f546;
        if (jSONObject != null) {
            AbstractC0647.m5607(jSONObject, i, Arrays.asList(AbstractC0739.f2030));
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final long m5811() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3075.f546;
        }
        return jSONObject.optLong(StringFog.decrypt("lM0=\n", "4L6V1DpKvq8=\n"));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5813(String str) {
        JSONObject jSONObject;
        try {
            synchronized (this) {
                jSONObject = this.f3075.f546;
            }
            jSONObject.put(StringFog.decrypt("VinY\n", "I0C8cuuKHt4=\n"), str);
        } catch (JSONException unused) {
        }
    }
}
