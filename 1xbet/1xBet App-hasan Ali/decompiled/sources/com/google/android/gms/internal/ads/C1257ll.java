package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import a3.AbstractC0467k;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import r0.AbstractC2346c;

/* renamed from: com.google.android.gms.internal.ads.ll, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1257ll implements InterfaceC1434pi, InterfaceC0808bi, Ph, InterfaceC0764aj {

    /* renamed from: k, reason: collision with root package name */
    public final C1392ol f14407k;

    /* renamed from: l, reason: collision with root package name */
    public final C1616tl f14408l;

    /* renamed from: m, reason: collision with root package name */
    public final int f14409m;

    public C1257ll(C1392ol c1392ol, C1616tl c1616tl, int i) {
        this.f14407k = c1392ol;
        this.f14408l = c1616tl;
        this.f14409m = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1434pi
    public final void B0(Sq sq) {
        C1392ol c1392ol = this.f14407k;
        c1392ol.getClass();
        boolean isEmpty = ((List) sq.f11596b.f13761l).isEmpty();
        C1071hd c1071hd = sq.f11596b;
        if (!isEmpty) {
            Lq lq = (Lq) ((List) c1071hd.f13761l).get(0);
            c1392ol.a("ad_format", Lq.a(lq.f10491b));
            if (lq.f10491b == 6) {
                c1392ol.f14844a.put("as", true != c1392ol.f14845b.f8518g ? "0" : "1");
            }
        }
        c1392ol.a("gqi", ((Nq) c1071hd.f13762m).f10823b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1434pi
    public final void D(C1428pc c1428pc) {
        this.f14407k.b(c1428pc.f14995k);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0764aj
    public final void a(String str) {
        A7 a7 = F7.A6;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            boolean booleanValue = ((Boolean) rVar.f5056c.a(F7.e7)).booleanValue();
            C1392ol c1392ol = this.f14407k;
            if (booleanValue) {
                c1392ol.f14844a.put("sgw", String.valueOf(this.f14409m));
            }
            c1392ol.f14844a.put("action", "sgf");
            c1392ol.a("sgf_reason", str);
            this.f14408l.b(c1392ol.f14844a, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    @Override // com.google.android.gms.internal.ads.InterfaceC0764aj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(a3.u uVar) {
        String str;
        A7 a7 = F7.A6;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            A7 a72 = F7.e7;
            D7 d7 = rVar.f5056c;
            boolean booleanValue = ((Boolean) d7.a(a72)).booleanValue();
            C1392ol c1392ol = this.f14407k;
            if (booleanValue) {
                c1392ol.f14844a.put("sgw", String.valueOf(this.f14409m));
            }
            C1616tl c1616tl = this.f14408l;
            if (uVar == null) {
                c1392ol.f14844a.put("action", "sgs");
                ConcurrentHashMap concurrentHashMap = c1392ol.f14844a;
                concurrentHashMap.put("request_id", "-1");
                c1616tl.b(concurrentHashMap, false);
                return;
            }
            Bundle bundle = uVar.f6624e;
            C1428pc c1428pc = uVar.f6623d;
            if (c1428pc != null) {
                d(c1428pc.f15007w, C1347nl.f14702d);
            } else if (bundle != null && !bundle.isEmpty()) {
                d(bundle, C1347nl.f14702d);
            }
            try {
                JSONObject jSONObject = new JSONObject(TextUtils.isEmpty(uVar.f6622c) ? uVar.f6621b : uVar.f6622c);
                c1392ol.f14844a.put("action", "sgs");
                ConcurrentHashMap concurrentHashMap2 = c1392ol.f14844a;
                if (((Boolean) d7.a(F7.l9)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e3) {
                        U2.j.g("Error retrieving JSONObject from the requestJson, ", e3);
                    }
                    concurrentHashMap2.put("tpc", str);
                    if (c1428pc != null) {
                        c1392ol.b(c1428pc.f14995k);
                    }
                    c1616tl.b(concurrentHashMap2, false);
                }
                str = "na";
                concurrentHashMap2.put("tpc", str);
                if (c1428pc != null) {
                }
                c1616tl.b(concurrentHashMap2, false);
            } catch (JSONException unused) {
                c1392ol.f14844a.put("action", "sgf");
                ConcurrentHashMap concurrentHashMap3 = c1392ol.f14844a;
                concurrentHashMap3.put("sgf_reason", "request_invalid");
                c1616tl.b(concurrentHashMap3, false);
            }
        }
    }

    public final void c(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j5 = bundle.getLong(str);
            if (j5 >= 0) {
                this.f14407k.a(str, String.valueOf(j5));
            }
        }
    }

    public final void d(Bundle bundle, C1761wv c1761wv) {
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.f8805b2)).booleanValue() || bundle == null) {
            return;
        }
        P2.o.f4767B.f4776j.getClass();
        bundle.putLong("public-api-callback", System.currentTimeMillis());
        boolean containsKey = bundle.containsKey("ls");
        C1392ol c1392ol = this.f14407k;
        if (containsKey) {
            c1392ol.a("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int i = c1761wv.f16186n;
        for (int i5 = 0; i5 < i; i5++) {
            C1347nl c1347nl = (C1347nl) c1761wv.get(i5);
            long j5 = bundle.getLong(AbstractC0467k.o(c1347nl.f14705b), -1L);
            long j6 = bundle.getLong(AbstractC0467k.o(c1347nl.f14706c), -1L);
            if (j5 > 0 && j6 > 0) {
                c1392ol.a(c1347nl.f14704a, String.valueOf(j6 - j5));
            }
        }
        c(bundle.getBundle("client_sig_latency_key"));
        c(bundle.getBundle("gms_sig_latency_key"));
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.e7)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                c1392ol.a("sod_h", true != bundle.getBoolean("sod_h") ? "0" : "1");
            }
            if (bundle.containsKey("cmr")) {
                c1392ol.a("cmr", String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0808bi
    public final void j0() {
        C1392ol c1392ol = this.f14407k;
        c1392ol.f14844a.put("action", "loaded");
        d(c1392ol.f14846c, C1347nl.f14703e);
        boolean booleanValue = ((Boolean) Q2.r.f5053d.f5056c.a(F7.hc)).booleanValue();
        ConcurrentHashMap concurrentHashMap = c1392ol.f14844a;
        if (booleanValue) {
            concurrentHashMap.put("mafe", true != AbstractC2346c.x("MUTE_AUDIO") ? "0" : "1");
        }
        this.f14408l.b(concurrentHashMap, false);
    }

    @Override // com.google.android.gms.internal.ads.Ph
    public final void l0(C0387u0 c0387u0) {
        C1392ol c1392ol = this.f14407k;
        c1392ol.f14844a.put("action", "ftl");
        c1392ol.a("ftl", String.valueOf(c0387u0.f5058k));
        c1392ol.a("ed", c0387u0.f5060m);
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.M6)).booleanValue()) {
            c1392ol.a("emsg", c0387u0.f5059l);
        }
        this.f14408l.b(c1392ol.f14844a, false);
    }
}
