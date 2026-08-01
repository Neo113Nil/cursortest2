package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵣ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0988 {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f2907 = StringFog.decrypt("Rfx5tTA0Y2hhxm2+IChwan/8brUx\n", "EZUU0ENAAgU=\n");

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final int f2908;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public long f2909;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public long f2910;

    /* renamed from: ｋ, reason: contains not printable characters */
    public long f2911;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public long f2912;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public Boolean f2913 = null;

    public C0988(int i) {
        this.f2908 = i;
        AbstractC0398 m5397 = AbstractC0398.m5397();
        C1132 c1132 = new C1132(this);
        C0470 c0470 = (C0470) m5397;
        Handler handler = c0470.f890;
        if (handler != null) {
            handler.post(new C0506(c0470, c1132));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0085 A[Catch: JSONException -> 0x0096, TryCatch #0 {JSONException -> 0x0096, blocks: (B:2:0x0000, B:4:0x0012, B:7:0x003c, B:8:0x0078, B:10:0x0085, B:11:0x0090, B:15:0x005a), top: B:1:0x0000 }] */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5793(JSONObject jSONObject) {
        boolean z;
        long j;
        try {
            if (jSONObject.optInt(StringFog.decrypt("qWT1\n", "2g2RGXsKjlc=\n"), 1) != this.f2908 && Math.abs((this.f2911 - this.f2912) - (jSONObject.optLong(StringFog.decrypt("NlcW\n", "UiNlDxWjlEE=\n")) - jSONObject.optLong(StringFog.decrypt("E+o=\n", "Zp5I9U8s2U4=\n")))) > 10) {
                j = jSONObject.optLong(StringFog.decrypt("oqBP\n", "xtQ8yF7Zvrs=\n")) + this.f2909;
                jSONObject.put(StringFog.decrypt("zCL7\n", "uFGUuHbey8s=\n"), this.f2909);
                z = false;
                jSONObject.put(AbstractC0739.f2061, j);
                if (!this.f2913.booleanValue()) {
                    jSONObject.put(StringFog.decrypt("0ol1\n", "pvoG9rL+cek=\n"), false);
                }
                m5794(jSONObject, z);
                m5795(jSONObject, z);
            }
            long optLong = jSONObject.optLong(StringFog.decrypt("XeI=\n", "KJbtIa7zKwk=\n")) + this.f2910;
            jSONObject.put(StringFog.decrypt("lNCK\n", "4aTl+fNT8xY=\n"), this.f2910);
            z = true;
            j = optLong;
            jSONObject.put(AbstractC0739.f2061, j);
            if (!this.f2913.booleanValue()) {
            }
            m5794(jSONObject, z);
            m5795(jSONObject, z);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m5796(JSONObject jSONObject) {
        if (!jSONObject.has(StringFog.decrypt("eYNf\n", "DPcwMpKT3WA=\n")) && !jSONObject.has(StringFog.decrypt("GlBP\n", "biMgz3UmvoI=\n")) && this.f2913 != null) {
            try {
                m5793(jSONObject);
                return true;
            } catch (Exception e) {
                AbstractC0480.m5464(f2907, StringFog.decrypt("PbqMID/MdZcWq5Y9IoJvlBGmmW8ommOADA==\n", "eMj+T03sBu4=\n"), (Throwable) e, false);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045 A[Catch: JSONException -> 0x0050, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0050, blocks: (B:2:0x0000, B:6:0x0012, B:8:0x0022, B:10:0x0045, B:16:0x002a, B:18:0x003a), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5795(JSONObject jSONObject, boolean z) {
        Long valueOf;
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(StringFog.decrypt("GkzD+r9Ogawe\n", "di2wjush9M8=\n"));
            if (optJSONObject == null) {
                return;
            }
            if (z) {
                long optLong = optJSONObject.optLong(StringFog.decrypt("oA==\n", "1bmgtSf99AU=\n"));
                if (optLong > 0) {
                    valueOf = Long.valueOf(optLong + this.f2910);
                    if (valueOf == null) {
                        optJSONObject.put(StringFog.decrypt("ZQ==\n", "EVISMXJZTz8=\n"), valueOf);
                        return;
                    }
                    return;
                }
                valueOf = null;
                if (valueOf == null) {
                }
            } else {
                long optLong2 = optJSONObject.optLong(StringFog.decrypt("sQ==\n", "xWnbJ6PK1U0=\n"));
                if (optLong2 > 0) {
                    valueOf = Long.valueOf(optLong2 + this.f2909);
                    if (valueOf == null) {
                    }
                }
                valueOf = null;
                if (valueOf == null) {
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m5794(JSONObject jSONObject, boolean z) {
        long optLong;
        long j;
        if (jSONObject.has(StringFog.decrypt("S/sj\n", "OI9QXhtFZJs=\n"))) {
            if (z) {
                optLong = jSONObject.optLong(StringFog.decrypt("mCxz\n", "61kHyiw+mnY=\n"));
                j = this.f2910;
            } else {
                optLong = jSONObject.optLong(StringFog.decrypt("2wHd\n", "qHWuULW8T/Q=\n"));
                j = this.f2909;
            }
            try {
                jSONObject.put(StringFog.decrypt("50Ac\n", "lDRvqU/1mlg=\n"), optLong + j);
            } catch (JSONException unused) {
            }
        }
    }
}
