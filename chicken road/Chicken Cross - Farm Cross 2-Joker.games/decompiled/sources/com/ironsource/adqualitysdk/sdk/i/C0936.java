package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴭ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0936 extends AbstractC1102 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f2630 = StringFog.decrypt("uQLs\n", "ynafCBU8HCI=\n");

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f2629 = StringFog.decrypt("oO8=\n", "1JzBglifh1Y=\n");

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final String f2628 = StringFog.decrypt("5V0=\n", "kClRvarlGpM=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public final int f2633 = (int) TimeUnit.SECONDS.toMillis(120);

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String f2632 = StringFog.decrypt("u4q/L+ZX2w==\n", "y/jQW4k5qKI=\n");

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String f2631 = StringFog.decrypt("0AAIIye8wwLG\n", "tWxtQFPOrGw=\n");

    public C0936(C1161 c1161) {
        this.f3223 = c1161;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final String m5770() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3224;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(StringFog.decrypt("TzcM\n", "OkVg+itsUL0=\n"));
        return optJSONObject != null ? optJSONObject.optString(StringFog.decrypt("8g==\n", "lxI2/DuWt30=\n"), this.f2631) : this.f2631;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final long m5771() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3224;
        }
        return jSONObject.optLong(f2628, 0L);
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final long m5772() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3224;
        }
        return jSONObject.optLong(f2629, 0L);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final int m5773() {
        JSONObject jSONObject;
        if (((C0470) AbstractC0398.m5397()).f879) {
            synchronized (this) {
                jSONObject = this.f3224;
            }
            if (jSONObject.optBoolean(StringFog.decrypt("bbkY4g==\n", "CdB5hZyU4m0=\n"), false)) {
                return m5776();
            }
        }
        return m5877().optInt(StringFog.decrypt("juZe\n", "45At6DJMRZs=\n"), 9850);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final int m5774() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3224;
        }
        return jSONObject.optInt(StringFog.decrypt("+bRk\n", "lNEUXOYABBc=\n"), 40);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final List m5775() {
        JSONObject jSONObject;
        C1161 c1161 = this.f3223;
        JSONObject jSONObject2 = c1161.f3327;
        String str = c1161.f3328;
        List arrayList = new ArrayList();
        String str2 = AbstractC0647.f1786;
        JSONArray optJSONArray = jSONObject2.optJSONArray(str);
        if (optJSONArray != null) {
            arrayList = AbstractC0647.m5604(optJSONArray);
        }
        synchronized (this) {
            jSONObject = this.f3224;
        }
        String decrypt = StringFog.decrypt("KbLa\n", "TMai+gSk7KU=\n");
        List arrayList2 = new ArrayList();
        JSONArray optJSONArray2 = jSONObject.optJSONArray(decrypt);
        if (optJSONArray2 != null) {
            arrayList2 = AbstractC0647.m5604(optJSONArray2);
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final int m5776() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3224;
        }
        return jSONObject.optInt(StringFog.decrypt("1NM9R/TzTQ==\n", "sLpcIJmFPq4=\n"), 1000000);
    }
}
