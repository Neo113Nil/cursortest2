package com.applovin.impl;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.ktor.sse.ServerSentEventKt;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class e8 implements v4 {

    /* renamed from: a, reason: collision with root package name */
    private String f4190a;
    private String b;
    private String c;
    private boolean d;
    private long e = -1;
    private int f = -1;

    private e8() {
    }

    public static e8 a(t8 t8Var, y7 y7Var, com.applovin.impl.sdk.l lVar) {
        List<String> explode;
        int size;
        long seconds;
        if (t8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String d = t8Var.d();
            if (TextUtils.isEmpty(d)) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().b("VastTracker", "Unable to create tracker. Could not find URL.");
                }
                return null;
            }
            e8 e8Var = new e8();
            e8Var.c = d;
            e8Var.f4190a = (String) t8Var.a().get("id");
            e8Var.b = (String) t8Var.a().get(NotificationCompat.CATEGORY_EVENT);
            e8Var.d = ((Boolean) lVar.a(c5.t5)).booleanValue();
            if (y7Var != null) {
                e8Var.d = JsonUtils.getBoolean(y7Var.b(), "vast_fire_trackers_from_webview", Boolean.valueOf(e8Var.d)).booleanValue();
            }
            e8Var.f = a(e8Var.b(), y7Var);
            String str = (String) t8Var.a().get("offset");
            if (StringUtils.isValidString(str)) {
                String trim = str.trim();
                if (trim.contains("%")) {
                    e8Var.f = StringUtils.parseInt(trim.substring(0, trim.length() - 1));
                } else if (trim.contains(ServerSentEventKt.COLON) && (size = (explode = CollectionUtils.explode(trim, ServerSentEventKt.COLON)).size()) > 0) {
                    int i = size - 1;
                    long j = 0;
                    for (int i2 = i; i2 >= 0; i2--) {
                        String str2 = explode.get(i2);
                        if (StringUtils.isNumeric(str2)) {
                            int parseInt = Integer.parseInt(str2);
                            if (i2 == i) {
                                seconds = parseInt;
                            } else if (i2 == size - 2) {
                                seconds = TimeUnit.MINUTES.toSeconds(parseInt);
                            } else if (i2 == size - 3) {
                                seconds = TimeUnit.HOURS.toSeconds(parseInt);
                            }
                            j += seconds;
                        }
                    }
                    e8Var.e = j;
                    e8Var.f = -1;
                }
            }
            return e8Var;
        } catch (Throwable th) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("VastTracker", "Error occurred while initializing", th);
            }
            lVar.E().a("VastTracker", th);
            return null;
        }
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8)) {
            return false;
        }
        e8 e8Var = (e8) obj;
        if (this.e != e8Var.e || this.f != e8Var.f) {
            return false;
        }
        String str = this.f4190a;
        if (str == null ? e8Var.f4190a != null : !str.equals(e8Var.f4190a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null ? e8Var.b == null : str2.equals(e8Var.b)) {
            return this.c.equals(e8Var.c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f4190a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.c.hashCode()) * 31;
        long j = this.e;
        return ((hashCode2 + ((int) (j ^ (j >>> 32)))) * 31) + this.f;
    }

    public String toString() {
        return "VastTracker{identifier='" + this.f4190a + "', event='" + this.b + "', uriString='" + this.c + "', offsetSeconds=" + this.e + ", offsetPercent=" + this.f + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean a(long j, int i) {
        long j2 = this.e;
        boolean z = j2 >= 0;
        boolean z2 = j >= j2;
        int i2 = this.f;
        boolean z3 = i2 >= 0;
        boolean z4 = i >= i2;
        if (z && z2) {
            return true;
        }
        return z3 && z4;
    }

    private static int a(String str, y7 y7Var) {
        if ("start".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("firstQuartile".equalsIgnoreCase(str)) {
            return 25;
        }
        if (CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT.equalsIgnoreCase(str)) {
            return 50;
        }
        if ("thirdQuartile".equalsIgnoreCase(str)) {
            return 75;
        }
        if (!CampaignEx.JSON_NATIVE_VIDEO_COMPLETE.equalsIgnoreCase(str)) {
            return -1;
        }
        if (y7Var != null) {
            return y7Var.g();
        }
        return 95;
    }

    public static e8 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        e8 e8Var = new e8();
        String string = JsonUtils.getString(jSONObject, "uri_string", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        e8Var.c = string;
        e8Var.f4190a = JsonUtils.getString(jSONObject, "identifier", "");
        e8Var.b = JsonUtils.getString(jSONObject, NotificationCompat.CATEGORY_EVENT, "");
        e8Var.e = JsonUtils.getLong(jSONObject, "offset_seconds", -1L);
        e8Var.f = JsonUtils.getInt(jSONObject, "offset_percent", -1);
        return e8Var;
    }

    @Override // com.applovin.impl.v4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "identifier", this.f4190a);
        JsonUtils.putString(jSONObject, NotificationCompat.CATEGORY_EVENT, this.b);
        JsonUtils.putString(jSONObject, "uri_string", this.c);
        JsonUtils.putLong(jSONObject, "offset_seconds", this.e);
        JsonUtils.putInt(jSONObject, "offset_percent", this.f);
        return jSONObject;
    }
}
