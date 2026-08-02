package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.lm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1258lm {

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f14410k = Pattern.compile("\\?");

    /* renamed from: a, reason: collision with root package name */
    public final C0554Af f14411a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f14412b;

    /* renamed from: c, reason: collision with root package name */
    public final U2.a f14413c;

    /* renamed from: d, reason: collision with root package name */
    public final Wq f14414d;

    /* renamed from: e, reason: collision with root package name */
    public final Qw f14415e;
    public final ScheduledExecutorService f;

    /* renamed from: g, reason: collision with root package name */
    public final String f14416g;

    /* renamed from: h, reason: collision with root package name */
    public final Mr f14417h;
    public final C1392ol i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f14418j = new Object();

    public C1258lm(C0554Af c0554Af, Context context, U2.a aVar, Wq wq, Qw qw, String str, Mr mr, C1392ol c1392ol, V9 v9, ScheduledExecutorService scheduledExecutorService) {
        this.f14411a = c0554Af;
        this.f14412b = context;
        this.f14413c = aVar;
        this.f14414d = wq;
        this.f14415e = qw;
        this.f14416g = str;
        this.f14417h = mr;
        this.i = c1392ol;
        this.f = scheduledExecutorService;
    }

    public static final String d(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1403ow a(String str, String str2) {
        String str3;
        String str4;
        E3.a c02;
        String str5 = "";
        if (TextUtils.isEmpty(str)) {
            return AbstractC1400ot.Z(new C0858co("Invalid ad string.", 15));
        }
        Context context = this.f14412b;
        Jr j5 = AbstractC1668us.j(context, 11);
        j5.e();
        C1875za m5 = P2.o.f4767B.f4783q.m(context, this.f14413c, this.f14411a.C());
        V9 v9 = AbstractC1830ya.f16434b;
        P2.c a5 = m5.a("google.afma.response.normalize", v9, v9);
        boolean booleanValue = ((Boolean) Q2.r.f5053d.f5056c.a(F7.G6)).booleanValue();
        C1392ol c1392ol = this.i;
        Qw qw = this.f14415e;
        if (booleanValue) {
            try {
                str3 = str;
            } catch (JSONException unused) {
                str3 = str;
            }
            try {
                str4 = new JSONObject(str3).optString("fetch_url", "");
            } catch (JSONException unused2) {
                str4 = "";
                if (TextUtils.isEmpty(str4)) {
                }
                C1537rw j02 = AbstractC1400ot.j0(AbstractC1400ot.j0(AbstractC1400ot.j0(c02, new N9(8, str2), qw), new N9(9, a5), qw), new N9(10, this), qw);
                AbstractC1803xs.c0(j02, this.f14417h, j5, false);
                return j02;
            }
            if (TextUtils.isEmpty(str4)) {
                c1392ol.a("sst", "2");
                A7 a7 = F7.I6;
                Q2.r rVar = Q2.r.f5053d;
                String str6 = (String) rVar.f5056c.a(a7);
                A7 a72 = F7.H6;
                if (((Boolean) rVar.f5056c.a(a72)).booleanValue()) {
                    Pattern pattern = f14410k;
                    C1356nu c1356nu = new C1356nu(pattern);
                    Matcher matcher = pattern.matcher("");
                    matcher.getClass();
                    if (matcher.matches()) {
                        throw new IllegalArgumentException(AbstractC0952et.F("The pattern may not match the empty string: %s", c1356nu));
                    }
                    List i = new Hq(5, new Qs(2, c1356nu)).i(str4);
                    if (i.size() < 2) {
                        c02 = AbstractC1400ot.Z(new C0858co("Invalid fetch URL.", 1));
                    } else {
                        str5 = (String) i.get(1);
                        T2.L l5 = P2.o.f4767B.f4771c;
                        str4 = Uri.parse(str4).buildUpon().query(null).build().toString();
                    }
                }
                c02 = AbstractC1400ot.X((Hw) AbstractC1400ot.l0(Hw.r(AbstractC0613Id.f9539a.d(new A4(7, this, new Hm(str4, 60000, new HashMap(), str5.getBytes(StandardCharsets.UTF_8), str6)))), ((Integer) r9.a(F7.J6)).intValue(), TimeUnit.MILLISECONDS, this.f), Exception.class, new C0727Yf(4), qw);
            } else {
                c02 = AbstractC1400ot.c0(str3);
                c1392ol.a("sst", "1");
            }
        } else {
            c02 = AbstractC1400ot.c0(str);
            c1392ol.a("sst", "1");
        }
        C1537rw j022 = AbstractC1400ot.j0(AbstractC1400ot.j0(AbstractC1400ot.j0(c02, new N9(8, str2), qw), new N9(9, a5), qw), new N9(10, this), qw);
        AbstractC1803xs.c0(j022, this.f14417h, j5, false);
        return j022;
    }

    public final String b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f14416g));
            }
            return jSONObject.toString();
        } catch (JSONException e3) {
            U2.j.i("Failed to update the ad types for rendering. ".concat(e3.toString()));
            return str;
        }
    }

    public final void c(int i) {
        Bundle bundle = this.i.f14846c;
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.L6)).booleanValue()) {
            AbstractC0467k.C(P2.o.f4767B.f4776j, bundle, AbstractC0467k.o(i));
        }
    }
}
