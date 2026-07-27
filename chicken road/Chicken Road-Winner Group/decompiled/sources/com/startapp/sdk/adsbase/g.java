package com.startapp.sdk.adsbase;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.h6;
import com.startapp.sdk.internal.p0;
import com.startapp.sdk.internal.rf;
import com.startapp.sdk.internal.sf;
import com.startapp.sdk.internal.sg;
import com.startapp.sdk.internal.si;
import com.startapp.sdk.internal.tg;
import com.startapp.sdk.internal.ug;
import com.startapp.sdk.internal.vg;
import com.startapp.sdk.internal.w0;
import com.startapp.simple.bloomfilter.api.BloomFilterCreator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static List f3220a = null;

    /* renamed from: b, reason: collision with root package name */
    public static List f3221b = null;

    /* renamed from: c, reason: collision with root package name */
    public static long f3222c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static volatile Pair f3223d = null;

    /* renamed from: e, reason: collision with root package name */
    public static volatile Pair f3224e = null;
    public static boolean f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f3225g = false;

    /* renamed from: h, reason: collision with root package name */
    public static SimpleTokenUtils$TokenType f3226h = SimpleTokenUtils$TokenType.UNDEFINED;

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair a() {
        return f3223d != null ? new Pair(((SimpleTokenUtils$TokenType) f3223d.first).toString(), (String) f3223d.second) : new Pair(SimpleTokenUtils$TokenType.T1.toString(), "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair b() {
        return f3224e != null ? new Pair(((SimpleTokenUtils$TokenType) f3224e.first).toString(), (String) f3224e.second) : new Pair(SimpleTokenUtils$TokenType.T2.toString(), "");
    }

    public static void c(Context context) {
        Context a3 = w0.a(context);
        if (a3 != null) {
            context = a3;
        }
        f(context);
        f = true;
        f3225g = false;
        f3226h = SimpleTokenUtils$TokenType.UNDEFINED;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        context.registerReceiver(new sg(), intentFilter);
        MetaData.E().a(new tg(context));
    }

    public static void d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Set D3 = MetaData.E().D();
        Set P2 = MetaData.E().P();
        f3220a = new CopyOnWriteArrayList();
        f3221b = new CopyOnWriteArrayList();
        try {
            int i3 = p0.f4197a;
            List<PackageInfo> list = (List) packageManager.getClass().getMethod("getInstalledPackages", Integer.TYPE).invoke(packageManager, 8192);
            f3222c = System.currentTimeMillis();
            PackageInfo packageInfo = null;
            for (PackageInfo packageInfo2 : list) {
                int i4 = packageInfo2.applicationInfo.flags;
                if ((i4 & 1) == 0 && (i4 & 128) == 0) {
                    long j3 = packageInfo2.firstInstallTime;
                    if (j3 < f3222c && j3 >= 1291593600000L) {
                        f3222c = j3;
                    }
                    f3220a.add(packageInfo2);
                    try {
                        String b3 = si.b(context);
                        if (D3 != null && D3.contains(b3)) {
                            f3221b.add(packageInfo2);
                        }
                    } catch (Throwable th) {
                        d9.a(th);
                    }
                } else if (P2.contains(packageInfo2.packageName)) {
                    f3220a.add(packageInfo2);
                } else if (packageInfo2.packageName.equals(h6.f3826a)) {
                    packageInfo = packageInfo2;
                }
            }
            List list2 = f3220a;
            if (list2.size() > 100) {
                ArrayList arrayList = new ArrayList(list2);
                Collections.sort(arrayList, new vg());
                list2 = arrayList.subList(0, 100);
            }
            f3220a = list2;
            List list3 = f3221b;
            if (list3.size() > 100) {
                ArrayList arrayList2 = new ArrayList(list3);
                Collections.sort(arrayList2, new vg());
                list3 = arrayList2.subList(0, 100);
            }
            f3221b = list3;
            if (packageInfo != null) {
                f3220a.add(0, packageInfo);
            }
        } catch (Throwable th2) {
            if (si.a(th2, RemoteException.class)) {
                return;
            }
            d9.a(th2);
        }
    }

    public static void e(Context context) {
        boolean a3 = MetaData.E().W().a(context);
        synchronized (g.class) {
            if ((f3223d == null || f3224e == null) && a3) {
                try {
                    d(context);
                    SimpleTokenUtils$TokenType simpleTokenUtils$TokenType = SimpleTokenUtils$TokenType.T1;
                    List list = f3220a;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PackageInfo) it.next()).packageName);
                    }
                    f3223d = new Pair(simpleTokenUtils$TokenType, new BloomFilterCreator().fromKeys(arrayList));
                    SimpleTokenUtils$TokenType simpleTokenUtils$TokenType2 = SimpleTokenUtils$TokenType.T2;
                    List list2 = f3221b;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((PackageInfo) it2.next()).packageName);
                    }
                    f3224e = new Pair(simpleTokenUtils$TokenType2, new BloomFilterCreator().fromKeys(arrayList2));
                } catch (Throwable th) {
                    d9.a(th);
                }
            }
        }
    }

    public static void f(Context context) {
        Context a3 = w0.a(context);
        if (a3 != null) {
            context = a3;
        }
        try {
            if ((f3223d == null || f3224e == null) && MetaData.E().W().a(context)) {
                ((Executor) com.startapp.sdk.components.a.a(context).f3338D.a()).execute(new ug(context));
            }
        } catch (Throwable th) {
            d9.a(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair a(Context context) {
        if (f3223d == null) {
            e(context);
        }
        rf edit = ((sf) com.startapp.sdk.components.a.a(context).f3341G.a()).edit();
        String str = (String) f3223d.second;
        edit.a("shared_prefs_simple_token", str);
        edit.f4299a.putString("shared_prefs_simple_token", str);
        edit.apply();
        f = false;
        f3226h = SimpleTokenUtils$TokenType.UNDEFINED;
        return new Pair(SimpleTokenUtils$TokenType.T1, (String) f3223d.second);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair b(Context context) {
        if (f3224e == null) {
            e(context);
        }
        rf edit = ((sf) com.startapp.sdk.components.a.a(context).f3341G.a()).edit();
        String str = (String) f3224e.second;
        edit.a("shared_prefs_simple_token2", str);
        edit.f4299a.putString("shared_prefs_simple_token2", str);
        edit.apply();
        f = false;
        f3226h = SimpleTokenUtils$TokenType.UNDEFINED;
        return new Pair(SimpleTokenUtils$TokenType.T2, (String) f3224e.second);
    }
}
