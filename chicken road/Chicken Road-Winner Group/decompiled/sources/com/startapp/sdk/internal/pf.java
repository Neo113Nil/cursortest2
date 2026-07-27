package com.startapp.sdk.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.RcdMetadata;
import com.startapp.sdk.adsbase.remoteconfig.RcdTargets;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class pf {

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f4217k = {"getSupportFragmentManager", "getFragmentManager"};

    /* renamed from: a, reason: collision with root package name */
    public final Context f4218a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f4219b;

    /* renamed from: c, reason: collision with root package name */
    public final ib f4220c;

    /* renamed from: d, reason: collision with root package name */
    public final m4 f4221d;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f4224h;

    /* renamed from: i, reason: collision with root package name */
    public String f4225i;
    public final HashMap f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f4223g = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final Cif f4226j = new Cif(this);

    /* renamed from: e, reason: collision with root package name */
    public final kf f4222e = new kf(this);

    public pf(Context context, ib ibVar, m4 m4Var) {
        this.f4218a = context;
        this.f4219b = ibVar;
        this.f4220c = new ib(new jf(ibVar));
        this.f4221d = m4Var;
    }

    public final boolean a() {
        Boolean bool = this.f4224h;
        if (bool == null) {
            this.f4221d.getClass();
            RcdMetadata R2 = MetaData.E().R();
            if (R2 == null || !R2.c()) {
                R2 = null;
            }
            bool = Boolean.valueOf(R2 == null || ((Random) si.f4346d.a()).nextDouble() >= R2.a());
            this.f4224h = bool;
        }
        return bool.booleanValue();
    }

    public final void b(Activity activity) {
        this.f4221d.getClass();
        RcdMetadata R2 = MetaData.E().R();
        if (R2 == null || !R2.c()) {
            R2 = null;
        }
        RcdTargets b3 = R2 != null ? R2.b() : null;
        if (b3 == null) {
            return;
        }
        try {
            Collection a3 = b3.a(8);
            String name = activity.getClass().getName();
            if (a3.contains(name)) {
                a(name, 8);
                return;
            }
        } catch (Throwable th) {
            d9.a(th);
        }
        try {
            a(b3, activity, 16, 32);
        } catch (Throwable th2) {
            d9.a(th2);
        }
        String[] strArr = f4217k;
        for (int i3 = 0; i3 < 2; i3++) {
            try {
                Object invoke = activity.getClass().getMethod(strArr[i3], new Class[0]).invoke(activity, new Object[0]);
                if (invoke != null) {
                    Object invoke2 = invoke.getClass().getMethod("getFragments", new Class[0]).invoke(invoke, new Object[0]);
                    if (invoke2 instanceof Collection) {
                        for (Object obj : (Collection) invoke2) {
                            if (obj != null) {
                                a(b3, obj, 64, 128);
                            }
                        }
                    }
                }
            } catch (NoSuchMethodException unused) {
            } catch (Throwable th3) {
                d9.a(th3);
            }
        }
        ((Executor) this.f4220c.a()).execute(this.f4226j);
    }

    public final void c() {
        HashMap hashMap;
        this.f4221d.getClass();
        RcdMetadata R2 = MetaData.E().R();
        if (R2 == null || !R2.c()) {
            R2 = null;
        }
        RcdTargets b3 = R2 != null ? R2.b() : null;
        if (b3 == null) {
            return;
        }
        synchronized (this.f) {
            hashMap = new HashMap(this.f);
        }
        String a3 = b3.a(hashMap);
        if (a3.equals(this.f4225i)) {
            return;
        }
        this.f4225i = a3;
        d9 d9Var = new d9(e9.f3617d);
        d9Var.f3574d = "RCD.results";
        d9Var.f3575e = a3;
        d9Var.a();
    }

    public final void a(Activity activity) {
        Window window;
        View decorView;
        if (a()) {
            return;
        }
        String name = activity.getClass().getName();
        WeakHashMap weakHashMap = si.f4343a;
        if (name.startsWith("com.startapp.")) {
            return;
        }
        List list = (List) this.f4223g.get(name);
        if (list == null) {
            list = new ArrayList(2);
            this.f4223g.put(name, list);
            ((Executor) this.f4219b.a()).execute(new lf(this, activity));
        }
        Iterator it = list.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                it.remove();
            } else if (weakReference.get() == activity) {
                z3 = true;
            }
        }
        if (z3 || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        list.add(new WeakReference(activity));
        ((Executor) this.f4219b.a()).execute(new mf(this, activity, decorView));
    }

    public final void b() {
        this.f4221d.getClass();
        RcdMetadata R2 = MetaData.E().R();
        if (R2 == null || !R2.c()) {
            R2 = null;
        }
        RcdTargets b3 = R2 != null ? R2.b() : null;
        if (b3 == null) {
            return;
        }
        for (String str : b3.a(1)) {
            try {
                Class.forName(str, false, pf.class.getClassLoader());
                a(str, 1);
            } catch (ClassNotFoundException unused) {
            } catch (Throwable th) {
                d9.a(th);
            }
        }
        try {
            String packageName = this.f4218a.getPackageName();
            PackageInfo packageInfo = this.f4218a.getPackageManager().getPackageInfo(packageName, 15);
            if (packageInfo != null) {
                a(b3, packageName, packageInfo.activities);
                a(b3, packageName, packageInfo.receivers);
                a(b3, packageName, packageInfo.services);
                a(b3, packageName, packageInfo.providers);
            }
        } catch (Throwable th2) {
            d9.a(th2);
        }
        ((Executor) this.f4220c.a()).execute(this.f4226j);
    }

    public final void a(RcdTargets rcdTargets, String str, ComponentInfo[] componentInfoArr) {
        if (componentInfoArr == null) {
            return;
        }
        for (ComponentInfo componentInfo : componentInfoArr) {
            if (componentInfo != null) {
                String str2 = componentInfo.name;
                if (str2.startsWith(".")) {
                    a(rcdTargets, str + str2, 2);
                } else {
                    a(rcdTargets, str2, 2);
                }
            }
        }
    }

    public final void a(int i3) {
        try {
            if (a()) {
                return;
            }
            ((Executor) this.f4219b.a()).execute(new of(this, Thread.currentThread().getStackTrace(), i3));
        } catch (Throwable th) {
            d9.a(th);
        }
    }

    public final void a(RcdTargets rcdTargets, View view) {
        if (view == null) {
            return;
        }
        a(rcdTargets, view.getClass().getName(), 4);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                a(rcdTargets, viewGroup.getChildAt(i3));
            }
        }
    }

    public final void a(RcdTargets rcdTargets, Object obj, int i3, int i4) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            String name = cls.getName();
            if (name.startsWith(ConstantDeviceInfo.APP_PLATFORM) || name.startsWith("java.")) {
                return;
            }
            for (Field field : cls.getDeclaredFields()) {
                if (i3 != 0) {
                    a(rcdTargets, field.getType().getName(), i3);
                }
                try {
                    field.setAccessible(true);
                    if (field.get(obj) != null && i4 != 0) {
                        a(rcdTargets, field.getType().getName(), i4);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void a(String str, int i3) {
        synchronized (this.f) {
            try {
                Integer num = (Integer) this.f.get(str);
                if (num == null) {
                    num = 0;
                }
                this.f.put(str, Integer.valueOf(i3 | num.intValue()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(RcdTargets rcdTargets, String str, int i3) {
        if (str.startsWith(ConstantDeviceInfo.APP_PLATFORM) || str.startsWith("java.")) {
            return;
        }
        WeakHashMap weakHashMap = si.f4343a;
        if (str.startsWith("com.startapp.")) {
            return;
        }
        for (String str2 : rcdTargets.a(i3)) {
            if (str2.length() > 0 && str.startsWith(str2)) {
                if (str2.charAt(str2.length() - 1) == '.') {
                    a(str2, i3);
                } else if (str.length() > str2.length()) {
                    if (str.charAt(str2.length()) == '$') {
                        a(str2, i3);
                    }
                } else {
                    a(str2, i3);
                    return;
                }
            }
        }
    }
}
