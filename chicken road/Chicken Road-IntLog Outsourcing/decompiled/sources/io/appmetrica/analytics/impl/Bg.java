package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import f4.C0430g;
import g4.AbstractC0467l;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Bg {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6598a;

    /* renamed from: b, reason: collision with root package name */
    public final SafePackageManager f6599b;

    /* renamed from: c, reason: collision with root package name */
    public final Ya f6600c;

    /* renamed from: d, reason: collision with root package name */
    public final Kc f6601d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6602e;

    /* renamed from: f, reason: collision with root package name */
    public final String f6603f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6604g;

    public Bg(Context context, SafePackageManager safePackageManager, Ya ya) {
        this.f6598a = context;
        this.f6599b = safePackageManager;
        this.f6600c = ya;
        Kc kc = new Kc(0);
        kc.a(EnumC0955rg.f9175d, 1);
        kc.a(EnumC0955rg.f9174c, 2);
        this.f6601d = kc;
        this.f6602e = TimeUnit.DAYS.toSeconds(1L);
        this.f6603f = "com.android.vending";
        this.f6604g = "com.huawei.appmarket";
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        if (((java.lang.Number) r7).longValue() < r13.f6602e) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0981sg a(List list) {
        C0981sg c0981sg;
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return (C0981sg) list.get(0);
        }
        SafePackageManager safePackageManager = this.f6599b;
        Context context = this.f6598a;
        PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 0);
        if (packageInfo != null) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(packageInfo.firstInstallTime);
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            C0981sg c0981sg2 = (C0981sg) it.next();
            C0430g c0430g = new C0430g(c0981sg2, Long.valueOf(Math.abs(c0981sg2.f9258c - seconds)));
            while (true) {
                boolean hasNext = it.hasNext();
                Object obj = c0430g.f5669b;
                if (!hasNext) {
                    break;
                }
                C0981sg c0981sg3 = (C0981sg) it.next();
                Long valueOf = Long.valueOf(Math.abs(c0981sg3.f9258c - seconds));
                C0430g c0430g2 = new C0430g(c0981sg3, valueOf);
                Comparable comparable = (Comparable) obj;
                if ((comparable == valueOf ? 0 : comparable == null ? -1 : comparable.compareTo(valueOf)) > 0) {
                    c0430g = c0430g2;
                }
            }
            c0981sg = (C0981sg) c0430g.f5668a;
        }
        c0981sg = null;
        if (c0981sg == null) {
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            C0981sg c0981sg4 = (C0981sg) it2.next();
            while (it2.hasNext()) {
                C0981sg c0981sg5 = (C0981sg) it2.next();
                if (a(this, c0981sg4, c0981sg5) < 0) {
                    c0981sg4 = c0981sg5;
                }
            }
            c0981sg = c0981sg4;
        }
        Ya ya = this.f6600c;
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList(AbstractC0467l.D0(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            C0981sg c0981sg6 = (C0981sg) it3.next();
            arrayList.add(new JSONObject().put("referrer", c0981sg6.f9256a).put("install_timestamp_seconds", c0981sg6.f9258c).put("click_timestamp_seconds", c0981sg6.f9257b).put(AdRevenueConstants.SOURCE_KEY, c0981sg6.f9259d.f9177a));
        }
        ya.reportEvent("several_filled_referrers", jSONObject.put("candidates", AbstractC0860no.a((Collection) arrayList) ? null : new JSONArray((Collection) arrayList)).put("chosen", new JSONObject().put("referrer", c0981sg.f9256a).put("install_timestamp_seconds", c0981sg.f9258c).put("click_timestamp_seconds", c0981sg.f9257b).put(AdRevenueConstants.SOURCE_KEY, c0981sg.f9259d.f9177a)).putOpt("install_time", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : null).toString());
        return c0981sg;
    }

    public /* synthetic */ Bg(Context context) {
        this(context, new SafePackageManager(), AbstractC1070w1.a());
    }

    public static final int a(Bg bg, C0981sg c0981sg, C0981sg c0981sg2) {
        int signum = Long.signum(c0981sg.f9258c - c0981sg2.f9258c);
        return signum == 0 ? ((Number) bg.f6601d.a(c0981sg.f9259d)).intValue() - ((Number) bg.f6601d.a(c0981sg2.f9259d)).intValue() : signum;
    }
}
