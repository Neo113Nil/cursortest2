package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import d2.C0274d;
import e2.AbstractC0294i;
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
    public final Context f5766a;

    /* renamed from: b, reason: collision with root package name */
    public final SafePackageManager f5767b;

    /* renamed from: c, reason: collision with root package name */
    public final Ya f5768c;

    /* renamed from: d, reason: collision with root package name */
    public final Kc f5769d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5770e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5771g;

    public Bg(Context context, SafePackageManager safePackageManager, Ya ya) {
        this.f5766a = context;
        this.f5767b = safePackageManager;
        this.f5768c = ya;
        Kc kc = new Kc(0);
        kc.a(EnumC0806rg.f8231d, 1);
        kc.a(EnumC0806rg.f8230c, 2);
        this.f5769d = kc;
        this.f5770e = TimeUnit.DAYS.toSeconds(1L);
        this.f = "com.android.vending";
        this.f5771g = "com.huawei.appmarket";
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        if (((java.lang.Number) r7).longValue() < r13.f5770e) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0832sg a(List list) {
        C0832sg c0832sg;
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return (C0832sg) list.get(0);
        }
        SafePackageManager safePackageManager = this.f5767b;
        Context context = this.f5766a;
        PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 0);
        if (packageInfo != null) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(packageInfo.firstInstallTime);
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            C0832sg c0832sg2 = (C0832sg) it.next();
            C0274d c0274d = new C0274d(c0832sg2, Long.valueOf(Math.abs(c0832sg2.f8310c - seconds)));
            while (true) {
                boolean hasNext = it.hasNext();
                Object obj = c0274d.f4846b;
                if (!hasNext) {
                    break;
                }
                C0832sg c0832sg3 = (C0832sg) it.next();
                Long valueOf = Long.valueOf(Math.abs(c0832sg3.f8310c - seconds));
                C0274d c0274d2 = new C0274d(c0832sg3, valueOf);
                Comparable comparable = (Comparable) obj;
                if ((comparable == valueOf ? 0 : comparable == null ? -1 : comparable.compareTo(valueOf)) > 0) {
                    c0274d = c0274d2;
                }
            }
            c0832sg = (C0832sg) c0274d.f4845a;
        }
        c0832sg = null;
        if (c0832sg == null) {
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            C0832sg c0832sg4 = (C0832sg) it2.next();
            while (it2.hasNext()) {
                C0832sg c0832sg5 = (C0832sg) it2.next();
                if (a(this, c0832sg4, c0832sg5) < 0) {
                    c0832sg4 = c0832sg5;
                }
            }
            c0832sg = c0832sg4;
        }
        Ya ya = this.f5768c;
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList(AbstractC0294i.U(list));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            C0832sg c0832sg6 = (C0832sg) it3.next();
            arrayList.add(new JSONObject().put("referrer", c0832sg6.f8308a).put("install_timestamp_seconds", c0832sg6.f8310c).put("click_timestamp_seconds", c0832sg6.f8309b).put(AdRevenueConstants.SOURCE_KEY, c0832sg6.f8311d.f8233a));
        }
        ya.reportEvent("several_filled_referrers", jSONObject.put("candidates", AbstractC0711no.a((Collection) arrayList) ? null : new JSONArray((Collection) arrayList)).put("chosen", new JSONObject().put("referrer", c0832sg.f8308a).put("install_timestamp_seconds", c0832sg.f8310c).put("click_timestamp_seconds", c0832sg.f8309b).put(AdRevenueConstants.SOURCE_KEY, c0832sg.f8311d.f8233a)).putOpt("install_time", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : null).toString());
        return c0832sg;
    }

    public /* synthetic */ Bg(Context context) {
        this(context, new SafePackageManager(), AbstractC0921w1.a());
    }

    public static final int a(Bg bg, C0832sg c0832sg, C0832sg c0832sg2) {
        int signum = Long.signum(c0832sg.f8310c - c0832sg2.f8310c);
        return signum == 0 ? ((Number) bg.f5769d.a(c0832sg.f8311d)).intValue() - ((Number) bg.f5769d.a(c0832sg2.f8311d)).intValue() : signum;
    }
}
