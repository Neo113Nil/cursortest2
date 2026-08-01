package sg.bigo.ads.X0;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.chartboost.sdk.privacy.model.COPPA;
import com.ironsource.L6;
import com.mbridge.msdk.MBridgeConstans;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.K0.F;
import sg.bigo.ads.K0.O;
import sg.bigo.ads.a.AbstractC5015a;
import sg.bigo.ads.d.C5055a;
import sg.bigo.ads.p0.AbstractC5429c;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class A {
    public static boolean c = false;

    /* renamed from: a, reason: collision with root package name */
    public String f12595a;
    public long b = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public final String a(u uVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String a2;
        String str6;
        String str7;
        String str8;
        A a3 = this;
        sg.bigo.ads.T0.g gVar = sg.bigo.ads.O.g.f12472a;
        String str9 = null;
        if (gVar == null || gVar.U != 1) {
            if (uVar == null) {
                AbstractC5496a.a("BigoAdSdk", "Failed to generate a token due to uninitialized provider.");
            } else {
                String appKey = uVar.f12615a.getAppKey();
                String str10 = uVar.d;
                String str11 = uVar.e;
                int i = uVar.f;
                String channel = uVar.f12615a.getChannel();
                String str12 = Build.VERSION.RELEASE;
                String str13 = uVar.g;
                String str14 = uVar.h;
                String str15 = uVar.i;
                String str16 = uVar.k;
                int i2 = uVar.l;
                String str17 = uVar.m;
                String i3 = uVar.i();
                sg.bigo.ads.T0.g gVar2 = uVar.c;
                String str18 = gVar2 != null ? gVar2.I : "";
                String h = uVar.h();
                String c2 = uVar.c();
                String str19 = uVar.c.w;
                String j = uVar.j();
                int a4 = (int) (O.a() / 1000);
                sg.bigo.ads.T0.g gVar3 = uVar.c;
                String str20 = gVar3.p;
                sg.bigo.ads.U.a e = gVar3.e();
                String str21 = e != null ? e.f12559a : "";
                String f = uVar.f();
                String g = uVar.g();
                String a5 = sg.bigo.ads.b1.h.a(null, uVar);
                String e2 = sg.bigo.ads.F0.a.e();
                sg.bigo.ads.U.b d = uVar.d();
                if (d != null) {
                    str = a5;
                    str2 = String.valueOf(d.c);
                } else {
                    str = a5;
                    str2 = "";
                }
                if (d != null) {
                    str3 = str2;
                    str4 = String.valueOf(d.f12560a);
                } else {
                    str3 = str2;
                    str4 = "";
                }
                String valueOf = d != null ? String.valueOf(d.b) : "";
                int i4 = uVar.s;
                String b = AbstractC5429c.b();
                int d2 = sg.bigo.ads.F0.a.d();
                int a6 = sg.bigo.ads.F0.a.a();
                int b2 = sg.bigo.ads.F0.a.b();
                int a7 = sg.bigo.ads.s1.b.a();
                sg.bigo.ads.U.a c3 = uVar.c.c();
                String str22 = c3 != null ? c3.f12559a : "";
                sg.bigo.ads.U.a d3 = uVar.c.d();
                int i5 = d3 != null ? d3.b ? 1 : 0 : 1;
                sg.bigo.ads.U.a e3 = uVar.c.e();
                int i6 = e3 != null ? e3.b ? 1 : 0 : 1;
                sg.bigo.ads.U.a c4 = uVar.c.c();
                int i7 = c4 != null ? c4.b ? 1 : 0 : 1;
                boolean a8 = sg.bigo.ads.I0.f.a(uVar.b);
                int b3 = sg.bigo.ads.I0.f.b(uVar.b);
                boolean m = uVar.m();
                int a9 = sg.bigo.ads.O.f.a();
                int i8 = uVar.w;
                boolean a10 = uVar.c.B.a(28);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.putOpt(MBridgeConstans.APP_KEY, appKey);
                    jSONObject.putOpt("pkg_name", str10);
                    jSONObject.putOpt("pkg_ver", str11);
                    jSONObject.putOpt("pkg_vc", Integer.valueOf(i));
                    jSONObject.putOpt("pkg_ch", channel);
                    jSONObject.putOpt(L6.F, "android");
                    jSONObject.putOpt("os_ver", str12);
                    jSONObject.putOpt("os_lang", str13);
                    jSONObject.putOpt("vendor", str14);
                    jSONObject.putOpt("model", str15);
                    jSONObject.putOpt("resolution", str16);
                    jSONObject.putOpt("dpi", Integer.valueOf(i2));
                    jSONObject.putOpt("dpi_f", str17);
                    jSONObject.putOpt("net", i3);
                    jSONObject.putOpt("country", str18);
                    jSONObject.putOpt("sdk_ver", "5.10.1");
                    jSONObject.putOpt("sdk_vc", 51001);
                    jSONObject.putOpt(L6.X0, h);
                    jSONObject.putOpt("af_id", c2);
                    jSONObject.putOpt("uid", str19);
                    jSONObject.putOpt("timezone", j);
                    jSONObject.putOpt("timestamp", Integer.valueOf(a4));
                    jSONObject.putOpt("abflags", str20);
                    jSONObject.putOpt("hw_id", str21);
                    jSONObject.putOpt("sim_country", f);
                    jSONObject.putOpt("system_country", g);
                    jSONObject.putOpt("ad_info", str);
                    jSONObject.putOpt("uuid", e2);
                    jSONObject.putOpt("bat_stat", str3);
                    jSONObject.putOpt("bat_num", str4);
                    jSONObject.putOpt("bat_scale", valueOf);
                    jSONObject.putOpt("simulator_file", Integer.valueOf(i4));
                    jSONObject.putOpt("tc_string", b);
                    jSONObject.putOpt("fire_id", str22);
                    jSONObject.putOpt("lat_enable", Integer.valueOf(i5));
                    jSONObject.putOpt("hw_lat_enable", Integer.valueOf(i6));
                    jSONObject.putOpt("fire_lat_enable", Integer.valueOf(i7));
                    jSONObject.putOpt("lgdp", Integer.valueOf(d2));
                    jSONObject.putOpt("ccpa", Integer.valueOf(a6));
                    jSONObject.putOpt(COPPA.COPPA_STANDARD, Integer.valueOf(b2));
                    jSONObject.putOpt("consent_status", Integer.valueOf(a7));
                    jSONObject.putOpt("batsa", Integer.valueOf(a8 ? 1 : 0));
                    jSONObject.putOpt("datasa", Integer.valueOf(b3));
                    jSONObject.putOpt("root", Integer.valueOf(m ? 1 : 0));
                    jSONObject.putOpt("imp_pattern", Integer.valueOf(uVar.c.B.a(25) ? 2 : 0));
                    jSONObject.putOpt("gdpr_switch", Integer.valueOf(a9));
                    jSONObject.putOpt("gp_vc", Integer.valueOf(i8));
                    C5055a a11 = BigoAdSdk.a(uVar.b);
                    JSONObject jSONObject2 = a11 != null ? a11.f : null;
                    jSONObject.putOpt("anti_boot_count", Integer.valueOf(jSONObject2 != null ? jSONObject2.optInt(AbstractC5015a.c, 0) : 0));
                    C5055a a12 = BigoAdSdk.a(uVar.b);
                    JSONObject jSONObject3 = a12 != null ? a12.f : null;
                    if (jSONObject3 != null) {
                        str7 = "";
                        str8 = jSONObject3.optString(AbstractC5015a.h, str7);
                    } else {
                        str7 = "";
                        str8 = str7;
                    }
                    jSONObject.putOpt("anti_sig", str8);
                    jSONObject.putOpt("anti_detect_key", Integer.valueOf(uVar.a()));
                    C5055a a13 = BigoAdSdk.a(uVar.b);
                    JSONObject jSONObject4 = a13 != null ? a13.f : null;
                    jSONObject.putOpt("anti_update_time", jSONObject4 != null ? String.valueOf(jSONObject4.optLong("anti_info_update_millis", 0L)) : str7);
                    jSONObject.putOpt("webp_gif", Integer.valueOf(a10 ? 1 : 0));
                    jSONObject.putOpt("om_ver", "1.3.0");
                    str5 = jSONObject.toString();
                } catch (Exception unused) {
                    AbstractC5496a.a("BigoAdSdk", "Failed to generate a token due to unknown error.");
                    str5 = null;
                }
                if (str5 != null) {
                    if (TextUtils.isEmpty(str5)) {
                        str6 = "data error with empty.";
                    } else if (TextUtils.isEmpty("FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F")) {
                        str6 = "cip error with empty.";
                    } else {
                        a2 = F.a(str5);
                        str9 = a2 + "a2";
                    }
                    AbstractC5496a.a("a", str6);
                    a2 = null;
                    str9 = a2 + "a2";
                } else {
                    str9 = null;
                }
                a3 = this;
            }
        } else if (uVar == null) {
            AbstractC5496a.a("BigoAdSdk", "Failed to generate a token due to uninitialized provider.");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new sg.bigo.ads.U0.o(uVar.f12615a.getAppKey()));
            arrayList.add(new sg.bigo.ads.U0.o(uVar.d));
            arrayList.add(new sg.bigo.ads.U0.o(uVar.e));
            arrayList.add(new sg.bigo.ads.U0.p(uVar.f));
            arrayList.add(new sg.bigo.ads.U0.o(uVar.f12615a.getChannel()));
            arrayList.add(new sg.bigo.ads.U0.o("android"));
            arrayList.add(new sg.bigo.ads.U0.o(Build.VERSION.RELEASE));
            arrayList.add(new sg.bigo.ads.U0.o(uVar.g));
            arrayList.add(new sg.bigo.ads.U0.o(uVar.h));
            arrayList.add(new sg.bigo.ads.U0.o(uVar.i));
            arrayList.add(new sg.bigo.ads.U0.o(uVar.k));
            arrayList.add(new sg.bigo.ads.U0.p(uVar.l));
            arrayList.add(new sg.bigo.ads.U0.o(uVar.m));
            arrayList.add(new sg.bigo.ads.U0.o(uVar.i()));
            sg.bigo.ads.T0.g gVar4 = uVar.c;
            arrayList.add(new sg.bigo.ads.U0.o(gVar4 != null ? gVar4.I : ""));
            arrayList.add(new sg.bigo.ads.U0.o("5.10.1"));
            arrayList.add(new sg.bigo.ads.U0.p(51001));
            arrayList.add(new sg.bigo.ads.U0.o(uVar.h()));
            arrayList.add(new sg.bigo.ads.U0.o(uVar.c()));
            arrayList.add(new sg.bigo.ads.U0.o(uVar.c.w));
            arrayList.add(new sg.bigo.ads.U0.o(uVar.j()));
            arrayList.add(new sg.bigo.ads.U0.p((int) (O.a() / 1000)));
            arrayList.add(new sg.bigo.ads.U0.o(uVar.c.p));
            sg.bigo.ads.U.a e4 = uVar.c.e();
            arrayList.add(new sg.bigo.ads.U0.o(e4 != null ? e4.f12559a : ""));
            arrayList.add(new sg.bigo.ads.U0.o(uVar.f()));
            arrayList.add(new sg.bigo.ads.U0.o(uVar.g()));
            arrayList.add(new sg.bigo.ads.U0.o(sg.bigo.ads.b1.h.a(null, uVar)));
            arrayList.add(new sg.bigo.ads.U0.o(sg.bigo.ads.F0.a.e()));
            sg.bigo.ads.U.b d4 = uVar.d();
            String valueOf2 = d4 != null ? String.valueOf(d4.c) : "";
            String valueOf3 = d4 != null ? String.valueOf(d4.f12560a) : "";
            String valueOf4 = d4 != null ? String.valueOf(d4.b) : "";
            arrayList.add(new sg.bigo.ads.U0.o(valueOf2));
            arrayList.add(new sg.bigo.ads.U0.o(valueOf3));
            arrayList.add(new sg.bigo.ads.U0.o(valueOf4));
            arrayList.add(new sg.bigo.ads.U0.p(uVar.s));
            arrayList.add(new sg.bigo.ads.U0.o(AbstractC5429c.b()));
            sg.bigo.ads.U.a c5 = uVar.c.c();
            arrayList.add(new sg.bigo.ads.U0.o(c5 != null ? c5.f12559a : ""));
            sg.bigo.ads.U.a d5 = uVar.c.d();
            arrayList.add(new sg.bigo.ads.U0.p(d5 != null ? d5.b : 1));
            sg.bigo.ads.U.a e5 = uVar.c.e();
            arrayList.add(new sg.bigo.ads.U0.p(e5 != null ? e5.b : 1));
            sg.bigo.ads.U.a c6 = uVar.c.c();
            arrayList.add(new sg.bigo.ads.U0.p(c6 != null ? c6.b : 1));
            arrayList.add(new sg.bigo.ads.U0.p(sg.bigo.ads.F0.a.d()));
            arrayList.add(new sg.bigo.ads.U0.p(sg.bigo.ads.F0.a.a()));
            arrayList.add(new sg.bigo.ads.U0.p(sg.bigo.ads.F0.a.b()));
            arrayList.add(new sg.bigo.ads.U0.p(sg.bigo.ads.s1.b.a()));
            arrayList.add(new sg.bigo.ads.U0.p(sg.bigo.ads.I0.f.a(uVar.b) ? 1 : 0));
            arrayList.add(new sg.bigo.ads.U0.p(sg.bigo.ads.I0.f.b(uVar.b)));
            arrayList.add(new sg.bigo.ads.U0.p(uVar.m() ? 1 : 0));
            arrayList.add(new sg.bigo.ads.U0.o(""));
            arrayList.add(new sg.bigo.ads.U0.o(""));
            arrayList.add(new sg.bigo.ads.U0.o(""));
            arrayList.add(new sg.bigo.ads.U0.p(uVar.c.B.a(25) ? 2 : 0));
            arrayList.add(new sg.bigo.ads.U0.p(uVar.w));
            arrayList.add(new sg.bigo.ads.U0.o(""));
            arrayList.add(new sg.bigo.ads.U0.o(""));
            arrayList.add(new sg.bigo.ads.U0.p(sg.bigo.ads.O.f.a()));
            arrayList.add(new sg.bigo.ads.U0.p(uVar.c.B.a(28) ? 1 : 0));
            C5055a a14 = BigoAdSdk.a(uVar.b);
            JSONObject jSONObject5 = a14 != null ? a14.f : null;
            arrayList.add(new sg.bigo.ads.U0.p(jSONObject5 != null ? jSONObject5.optInt(AbstractC5015a.c, 0) : 0));
            C5055a a15 = BigoAdSdk.a(uVar.b);
            JSONObject jSONObject6 = a15 != null ? a15.f : null;
            arrayList.add(new sg.bigo.ads.U0.o(jSONObject6 != null ? jSONObject6.optString(AbstractC5015a.h, "") : ""));
            arrayList.add(new sg.bigo.ads.U0.p(uVar.a()));
            C5055a a16 = BigoAdSdk.a(uVar.b);
            JSONObject jSONObject7 = a16 != null ? a16.f : null;
            arrayList.add(new sg.bigo.ads.U0.o(jSONObject7 != null ? String.valueOf(jSONObject7.optLong("anti_info_update_millis", 0L)) : ""));
            arrayList.add(new sg.bigo.ads.U0.o("1.3.0"));
            int i9 = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                i9 += ((sg.bigo.ads.U0.q) arrayList.get(i10)).a();
            }
            ByteBuffer allocate = ByteBuffer.allocate(i9);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((sg.bigo.ads.U0.q) arrayList.get(i11)).a(allocate);
            }
            byte[] array = allocate.array();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(array);
                gZIPOutputStream.close();
                String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                byteArrayOutputStream.close();
                str9 = encodeToString;
            } catch (IOException unused2) {
            }
            JSONObject jSONObject8 = new JSONObject();
            try {
                jSONObject8.put("ver", 1);
                jSONObject8.put("token", str9);
            } catch (JSONException unused3) {
            }
            str9 = jSONObject8.toString();
        }
        a3.f12595a = str9;
        a3.b = System.currentTimeMillis();
        return a3.f12595a;
    }

    public final synchronized String b(u uVar) {
        String a2;
        a2 = a(uVar);
        this.f12595a = a2;
        return a2;
    }

    public final String c(u uVar) {
        String str = this.f12595a;
        if (str != null) {
            return str;
        }
        synchronized (A.class) {
            String str2 = this.f12595a;
            if (str2 != null) {
                return str2;
            }
            String a2 = a(uVar);
            this.f12595a = a2;
            return a2;
        }
    }
}
