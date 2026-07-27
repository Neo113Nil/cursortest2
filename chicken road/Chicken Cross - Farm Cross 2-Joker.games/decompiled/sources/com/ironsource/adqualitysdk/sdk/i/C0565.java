package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.א, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0565 extends AbstractC0554 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public WeakReference f1280;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public WeakReference f1281;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final WeakHashMap f1282 = new WeakHashMap();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            synchronized (AbstractC0554.class) {
                if (this.f1281 == null) {
                    this.f1281 = new WeakReference(activity);
                    AbstractC1145.m5895(new C0581(activity));
                    AbstractC0554.class.notifyAll();
                }
            }
            Iterator it = m5523().iterator();
            while (it.hasNext()) {
                ((InterfaceC0951) it.next()).onActivityCreated(activity, bundle);
            }
        } catch (Exception e) {
            AbstractC0480.m5464(StringFog.decrypt("mtsaod9tEbi70ha63W04nbTEAabQZC+CuMUDqt1k\n", "3bd1w74BXdE=\n"), StringFog.decrypt("u2NzzZ8z0jLefm/jjmfSKpdleOGfdtoom3U=\n", "/hEBou0Tu1w=\n"), (Throwable) e, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        ArrayList arrayList;
        try {
            synchronized (this) {
                arrayList = new ArrayList(this.f1253);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC0951) it.next()).onActivityDestroyed(activity);
            }
        } catch (Exception e) {
            AbstractC0480.m5464(StringFog.decrypt("ZKCSTV2VVqlFqZ5WX5V/jEq/iUpSnGiTRr6LRl+c\n", "I8z9Lzz5GsA=\n"), StringFog.decrypt("g0LDWVCitmrmX993Qfa2cq9EyHJH8at2qUnUUg==\n", "xjCxNiKC3wQ=\n"), (Throwable) e, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ArrayList arrayList;
        try {
            synchronized (this) {
                arrayList = new ArrayList(this.f1253);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC0951) it.next()).onActivityPaused(activity);
            }
        } catch (Exception e) {
            AbstractC0480.m5464(StringFog.decrypt("XHJF1nIFmnB9e0nNcAWzVXJtXtF9DKRKfmxc3XAM\n", "Gx4qtBNp1hk=\n"), StringFog.decrypt("tRwylU07sc3QAS67XG+x1ZkaOapebqvGlA==\n", "8G5A+j8b2KM=\n"), (Throwable) e, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ArrayList arrayList;
        try {
            this.f1281 = new WeakReference(activity);
            AbstractC1145.m5895(new C0581(activity));
            synchronized (this) {
                arrayList = new ArrayList(this.f1253);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC0951) it.next()).onActivityResumed(activity);
            }
        } catch (Exception e) {
            AbstractC0480.m5464(StringFog.decrypt("Z/aMgmZg1ctG/4CZZGD87knpl4VpaevxReiViWRp\n", "IJrj4AcMmaI=\n"), StringFog.decrypt("gzwR67TBfFfmIQ3FpZV8T686GtajkmBUoyo=\n", "xk5jhMbhFTk=\n"), (Throwable) e, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ArrayList arrayList;
        try {
            synchronized (this) {
                arrayList = new ArrayList(this.f1253);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC0951) it.next()).onActivitySaveInstanceState(activity, bundle);
            }
        } catch (Exception e) {
            AbstractC0480.m5464(StringFog.decrypt("igeGkBMtyUWrDoqLES3gYKQYnZccJPd/qBmfmxEk\n", "zWvp8nJBhSw=\n"), StringFog.decrypt("2QvZ9IxOZ1q8FsXanRpnQvUN0sifGGt98grf+pANa2foGN/+\n", "nHmrm/5uDjQ=\n"), (Throwable) e, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        try {
            if (this.f1281 == null) {
                this.f1281 = new WeakReference(activity);
                AbstractC1145.m5895(new C0581(activity));
            }
            synchronized (this) {
                this.f1282.put(activity, Boolean.TRUE);
            }
            Iterator it = m5523().iterator();
            while (it.hasNext()) {
                ((InterfaceC0951) it.next()).onActivityStarted(activity);
            }
            if (activity.getLocalClassName().equals(StringFog.decrypt("6w3hLEP62PbxUegsRvjQ++0QoldY/cX72A7te1Pm4fDnGvVDVeDY9OEW9Q==\n", "iGKMAjaUsYI=\n"))) {
                return;
            }
            synchronized (this) {
                if (this.f1282.size() == 1 && !this.f1254) {
                    m5532(activity);
                }
            }
        } catch (Exception e) {
            AbstractC0480.m5464(StringFog.decrypt("yuQNI5+r2fXr7QE4navw0OT7FiSQoufP6PoUKJ2i\n", "jYhiQf7HlZw=\n"), StringFog.decrypt("uu5VJORKE7Df80kK9R4TqJboXhjiCwiqmvg=\n", "/5wnS5Zqet4=\n"), (Throwable) e, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i;
        try {
            Iterator it = m5523().iterator();
            while (it.hasNext()) {
                ((InterfaceC0951) it.next()).onActivityStopped(activity);
            }
            this.f1254 = activity.isChangingConfigurations();
            synchronized (this) {
                if (!this.f1282.containsKey(activity) || activity.getLocalClassName().equals(StringFog.decrypt("lAHIjwjbf2COXcGPDdl3bZIci/QT3GJtpwLE2BjHRmaYFtzgHsF/Yp4a3A==\n", "926loX21FhQ=\n"))) {
                    i = -1;
                } else {
                    this.f1282.remove(activity);
                    i = this.f1282.size();
                }
            }
            if (i <= -1 || i != 0 || this.f1254) {
                return;
            }
            m5533(activity);
        } catch (Exception e) {
            AbstractC0480.m5464(StringFog.decrypt("M8XPPzxg96MSzMMkPmDehh3a1DgzacmZEdvWND5p\n", "dKmgXV0Mu8o=\n"), StringFog.decrypt("8hXU7I+H4+aXCMjCntPj/t4T39CJyPr40gM=\n", "t2emg/2niog=\n"), (Throwable) e, false);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0554
    /* renamed from: ﻛ */
    public final synchronized boolean mo5522() {
        return this.f1282.size() > 0;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m5532(Activity activity) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f1253);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC0951) it.next()).mo5413(activity);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0554
    /* renamed from: ﾒ */
    public final synchronized void mo5525(Application application, Activity activity) {
        if (this.f1280 == null) {
            this.f1280 = new WeakReference(application);
            if (activity != null) {
                this.f1281 = new WeakReference(activity);
                AbstractC1145.m5895(new C0581(activity));
                synchronized (this) {
                    this.f1282.put(activity, Boolean.TRUE);
                }
            }
            application.registerActivityLifecycleCallbacks(this);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0554
    /* renamed from: ﾒ */
    public final Activity mo5524() {
        WeakReference weakReference = this.f1281;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5533(Activity activity) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f1253);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC0951) it.next()).mo5414(activity);
        }
    }
}
