package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q3.C2308a;

/* renamed from: com.google.android.gms.internal.ads.es, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0951es {

    /* renamed from: a, reason: collision with root package name */
    public final C0769ao f13364a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13365b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13366c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13367d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f13368e;
    public final Tq f;

    /* renamed from: g, reason: collision with root package name */
    public final Uq f13369g;

    /* renamed from: h, reason: collision with root package name */
    public final C2308a f13370h;
    public final Q4 i;

    public C0951es(C0769ao c0769ao, U2.a aVar, String str, String str2, Context context, Tq tq, Uq uq, C2308a c2308a, Q4 q42) {
        this.f13364a = c0769ao;
        this.f13365b = aVar.f5852k;
        this.f13366c = str;
        this.f13367d = str2;
        this.f13368e = context;
        this.f = tq;
        this.f13369g = uq;
        this.f13370h = c2308a;
        this.i = q42;
    }

    public static String c(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final ArrayList a(Sq sq, Lq lq, List list) {
        return b(sq, lq, false, "", "", list);
    }

    public final ArrayList b(Sq sq, Lq lq, boolean z3, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z5 = true;
            String c5 = c(c(c((String) it.next(), "@gw_adlocid@", ((Wq) sq.f11595a.f11722l).f), "@gw_adnetrefresh@", true != z3 ? "0" : "1"), "@gw_sdkver@", this.f13365b);
            if (lq != null) {
                c5 = AbstractC1668us.M(c(c(c(c5, "@gw_qdata@", lq.f10535y), "@gw_adnetid@", lq.f10533x), "@gw_allocid@", lq.f10531w), this.f13368e, lq.f10485W, lq.f10532w0);
            }
            C0769ao c0769ao = this.f13364a;
            String c6 = c(c(c(c(c5, "@gw_adnetstatus@", c0769ao.c()), "@gw_ttr@", Long.toString(c0769ao.a(), 10)), "@gw_seqnum@", this.f13366c), "@gw_sessid@", this.f13367d);
            boolean z6 = false;
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8915v3)).booleanValue() && !TextUtils.isEmpty(str)) {
                z6 = true;
            }
            boolean isEmpty = TextUtils.isEmpty(str2);
            boolean z7 = !isEmpty;
            if (z6) {
                z5 = z7;
            } else if (isEmpty) {
                arrayList.add(c6);
            }
            if (this.i.c(Uri.parse(c6))) {
                Uri.Builder buildUpon = Uri.parse(c6).buildUpon();
                if (z6) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z5) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                c6 = buildUpon.build().toString();
            }
            arrayList.add(c6);
        }
        return arrayList;
    }
}
