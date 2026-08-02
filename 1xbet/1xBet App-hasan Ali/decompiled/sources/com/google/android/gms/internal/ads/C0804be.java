package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.be, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0804be {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12836a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12837b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12838c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12839d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12840e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12841g;

    /* renamed from: h, reason: collision with root package name */
    public final int f12842h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f12843j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f12844k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f12845l;

    /* renamed from: m, reason: collision with root package name */
    public final long f12846m;

    /* renamed from: n, reason: collision with root package name */
    public final long f12847n;

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0804be(String str) {
        long j5;
        long j6;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f12836a = a(jSONObject, "aggressive_media_codec_release", F7.f8721M);
        this.f12837b = b(jSONObject, "byte_buffer_precache_limit", F7.i);
        this.f12838c = b(jSONObject, "exo_cache_buffer_size", F7.f8894s);
        this.f12839d = b(jSONObject, "exo_connect_timeout_millis", F7.f8819e);
        A7 a7 = F7.f8813d;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.f12840e = b(jSONObject, "exo_read_timeout_millis", F7.f);
            this.f = b(jSONObject, "load_check_interval_bytes", F7.f8828g);
            this.f12841g = b(jSONObject, "player_precache_limit", F7.f8834h);
            this.f12842h = b(jSONObject, "socket_receive_buffer_size", F7.f8841j);
            this.i = a(jSONObject, "use_cache_data_source", F7.f8833g4);
            b(jSONObject, "min_retry_count", F7.f8847k);
            this.f12843j = a(jSONObject, "treat_load_exception_as_non_fatal", F7.f8859m);
            this.f12844k = a(jSONObject, "enable_multiple_video_playback", F7.f8747Q1);
            this.f12845l = a(jSONObject, "use_range_http_data_source", F7.f8758S1);
            A7 a72 = F7.f8763T1;
            if (jSONObject != null) {
                try {
                    j5 = jSONObject.getLong("range_http_data_source_high_water_mark");
                } catch (JSONException unused3) {
                }
                this.f12846m = j5;
                A7 a73 = F7.f8768U1;
                if (jSONObject != null) {
                    try {
                        j6 = jSONObject.getLong("range_http_data_source_low_water_mark");
                    } catch (JSONException unused4) {
                    }
                    this.f12847n = j6;
                }
                j6 = ((Long) Q2.r.f5053d.f5056c.a(a73)).longValue();
                this.f12847n = j6;
            }
            j5 = ((Long) Q2.r.f5053d.f5056c.a(a72)).longValue();
            this.f12846m = j5;
            A7 a732 = F7.f8768U1;
            if (jSONObject != null) {
            }
            j6 = ((Long) Q2.r.f5053d.f5056c.a(a732)).longValue();
            this.f12847n = j6;
        }
        this.f12840e = b(jSONObject, "exo_read_timeout_millis", F7.f);
        this.f = b(jSONObject, "load_check_interval_bytes", F7.f8828g);
        this.f12841g = b(jSONObject, "player_precache_limit", F7.f8834h);
        this.f12842h = b(jSONObject, "socket_receive_buffer_size", F7.f8841j);
        this.i = a(jSONObject, "use_cache_data_source", F7.f8833g4);
        b(jSONObject, "min_retry_count", F7.f8847k);
        this.f12843j = a(jSONObject, "treat_load_exception_as_non_fatal", F7.f8859m);
        this.f12844k = a(jSONObject, "enable_multiple_video_playback", F7.f8747Q1);
        this.f12845l = a(jSONObject, "use_range_http_data_source", F7.f8758S1);
        A7 a722 = F7.f8763T1;
        if (jSONObject != null) {
        }
        j5 = ((Long) Q2.r.f5053d.f5056c.a(a722)).longValue();
        this.f12846m = j5;
        A7 a7322 = F7.f8768U1;
        if (jSONObject != null) {
        }
        j6 = ((Long) Q2.r.f5053d.f5056c.a(a7322)).longValue();
        this.f12847n = j6;
    }

    public static final boolean a(JSONObject jSONObject, String str, A7 a7) {
        boolean booleanValue = ((Boolean) Q2.r.f5053d.f5056c.a(a7)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return booleanValue;
    }

    public static final int b(JSONObject jSONObject, String str, A7 a7) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) Q2.r.f5053d.f5056c.a(a7)).intValue();
    }
}
