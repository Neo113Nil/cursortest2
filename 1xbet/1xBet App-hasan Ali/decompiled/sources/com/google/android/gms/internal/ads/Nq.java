package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Nq {

    /* renamed from: a, reason: collision with root package name */
    public final List f10822a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10823b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10824c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10825d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10826e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final long f10827g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f10828h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final Dx f10829j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f10830k;

    /* renamed from: l, reason: collision with root package name */
    public final String f10831l;

    /* renamed from: m, reason: collision with root package name */
    public final String f10832m;

    /* renamed from: n, reason: collision with root package name */
    public final String f10833n;

    /* renamed from: o, reason: collision with root package name */
    public final JSONObject f10834o;

    /* renamed from: p, reason: collision with root package name */
    public final JSONObject f10835p;

    /* renamed from: q, reason: collision with root package name */
    public final String f10836q;

    /* renamed from: r, reason: collision with root package name */
    public final int f10837r;

    /* renamed from: s, reason: collision with root package name */
    public final long f10838s;

    /* renamed from: t, reason: collision with root package name */
    public final long f10839t;

    public Nq(JsonReader jsonReader) {
        String str;
        Bundle a02;
        char c5;
        List list = Collections.EMPTY_LIST;
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jsonReader.beginObject();
        String str2 = "";
        String str3 = "";
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        Dx dx = null;
        long j5 = -1;
        long j6 = 0;
        long j7 = -1;
        int i = 0;
        int i5 = -1;
        int i6 = 1;
        int i7 = 0;
        boolean z3 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (Objects.equals(nextName, "nofill_urls")) {
                list = N4.b.c0(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if (Objects.equals(nextName, "refresh_load_delay_time_interval")) {
                i5 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str3 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str4 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z3 = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i7 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j6 = jsonReader.nextLong();
            } else {
                A7 a7 = F7.S7;
                str = str2;
                Q2.r rVar = Q2.r.f5053d;
                long j8 = j5;
                if (((Boolean) rVar.f5056c.a(a7)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    Dx dx2 = new Dx();
                    jsonReader.beginObject();
                    String str10 = str;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        int hashCode = nextName2.hashCode();
                        if (hashCode != -1724546052) {
                            if (hashCode == 3059181 && nextName2.equals("code")) {
                                c5 = 0;
                            }
                            c5 = 65535;
                        } else {
                            if (nextName2.equals("description")) {
                                c5 = 1;
                            }
                            c5 = 65535;
                        }
                        if (c5 == 0) {
                            jsonReader.nextInt();
                        } else if (c5 != 1) {
                            jsonReader.skipValue();
                        } else {
                            str10 = jsonReader.nextString();
                        }
                    }
                    jsonReader.endObject();
                    dx2.f8430l = str10;
                    dx = dx2;
                } else if ("bidding_data".equals(nextName)) {
                    str5 = jsonReader.nextString();
                } else {
                    A7 a72 = F7.X9;
                    D7 d7 = rVar.f5056c;
                    if (((Boolean) d7.a(a72)).booleanValue() && Objects.equals(nextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(nextName)) {
                        str9 = jsonReader.nextString();
                    } else if ("response_info_extras".equals(nextName)) {
                        if (((Boolean) d7.a(F7.s6)).booleanValue()) {
                            try {
                                Bundle a03 = N4.b.a0(N4.b.f0(jsonReader));
                                if (a03 != null) {
                                    bundle = a03;
                                }
                            } catch (IOException | JSONException unused) {
                            } catch (IllegalStateException unused2) {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(nextName)) {
                        if (((Boolean) d7.a(F7.S8)).booleanValue()) {
                            str7 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (!"adRequestUrl".equals(nextName)) {
                        A7 a73 = F7.T8;
                        if (((Boolean) d7.a(a73)).booleanValue() && Objects.equals(nextName, "adResponseBody")) {
                            str8 = jsonReader.nextString();
                        } else if (((Boolean) d7.a(a73)).booleanValue() && Objects.equals(nextName, "adResponseHeaders")) {
                            jSONObject = N4.b.f0(jsonReader);
                        } else {
                            if (Objects.equals(nextName, "max_parallel_renderers")) {
                                i6 = Math.max(1, jsonReader.nextInt());
                            } else if (((Boolean) d7.a(F7.a9)).booleanValue() && Objects.equals(nextName, "inspector_ad_transaction_extras")) {
                                jSONObject2 = N4.b.f0(jsonReader);
                            } else if (((Boolean) d7.a(F7.f8810c2)).booleanValue() && Objects.equals(nextName, "latency_extras")) {
                                try {
                                    a02 = N4.b.a0(N4.b.f0(jsonReader));
                                } catch (IOException | JSONException unused3) {
                                } catch (IllegalStateException unused4) {
                                }
                                if (a02 != null) {
                                    double d5 = a02.getDouble("start_time");
                                    long j9 = (d5 > 9.223372036854776E18d || d5 < -9.223372036854776E18d) ? -1L : (long) d5;
                                    try {
                                        double d6 = a02.getDouble("end_time");
                                        long j10 = (d6 > 9.223372036854776E18d || d6 < -9.223372036854776E18d) ? -1L : (long) d6;
                                        j7 = j9;
                                        j5 = j10;
                                    } catch (IOException | JSONException unused5) {
                                        j7 = j9;
                                    } catch (IllegalStateException unused6) {
                                        j7 = j9;
                                        jsonReader.skipValue();
                                        j5 = j8;
                                        str2 = str;
                                    }
                                    str2 = str;
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                            j5 = j8;
                            str2 = str;
                        }
                    } else if (((Boolean) d7.a(F7.S8)).booleanValue()) {
                        str6 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    j5 = j8;
                    str2 = str;
                }
                j5 = j8;
                str2 = str;
            }
            str = str2;
            str2 = str;
        }
        long j11 = j5;
        jsonReader.endObject();
        this.f10822a = list;
        this.f10824c = i;
        if (((Boolean) AbstractC1326n8.f14586c.s()).booleanValue()) {
            this.f10825d = -1;
        } else {
            G3 g32 = X7.f12153a;
            if (((Long) g32.s()).longValue() > -1) {
                this.f10825d = ((Long) g32.s()).intValue();
            } else {
                this.f10825d = i5;
            }
        }
        this.f10823b = str3;
        this.f10826e = str4;
        this.f = i7;
        this.f10827g = j6;
        this.f10829j = dx;
        this.f10828h = z3;
        this.i = str5;
        this.f10830k = bundle;
        this.f10831l = str6;
        this.f10832m = str7;
        this.f10833n = str8;
        this.f10834o = jSONObject;
        this.f10835p = jSONObject2;
        this.f10836q = str9;
        G3 g33 = AbstractC1236l8.f14329a;
        this.f10837r = ((Long) g33.s()).longValue() > 0 ? ((Long) g33.s()).intValue() : i6;
        this.f10838s = j7;
        this.f10839t = j11;
    }
}
