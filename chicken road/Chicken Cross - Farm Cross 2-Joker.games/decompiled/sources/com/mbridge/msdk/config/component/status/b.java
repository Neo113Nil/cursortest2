package com.mbridge.msdk.config.component.status;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MBActivityLifecyclePublisher.java */
/* loaded from: classes6.dex */
public class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final List<a> f9039a = new CopyOnWriteArrayList();
    private int b = 0;
    private int c = 0;
    private boolean d = true;
    private boolean e = true;
    Handler f = new Handler();
    private final Runnable g = new Runnable() { // from class: com.mbridge.msdk.config.component.status.b$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            b.this.c();
        }
    };

    public b(Context context) {
        if (context == null) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        a();
        b();
    }

    public void a(a aVar) {
        try {
            this.f9039a.add(aVar);
        } catch (Throwable unused) {
            q0.b("LifecyclePublisher", "add subscriber error");
        }
    }

    public void b(a aVar) {
        try {
            this.f9039a.remove(aVar);
        } catch (Throwable unused) {
            q0.b("LifecyclePublisher", "remove subscriber error");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        a("LifecycleChanged", "onActivityCreated");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        a("LifecycleChanged", "onActivityDestroyed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.c--;
        a("LifecycleChanged", "onActivityPaused");
        if (this.c == 0) {
            this.f.postDelayed(this.g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.c++;
        a("LifecycleChanged", "onActivityResumed");
        if (this.c == 1) {
            if (!this.d) {
                this.f.removeCallbacks(this.g);
            } else {
                a("916003", "");
                this.d = false;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.b++;
        a("LifecycleChanged", "onActivityStarted");
        if (this.b == 1 && this.e) {
            this.e = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.b--;
        a("LifecycleChanged", "onActivityStopped");
        b();
    }

    private void a(com.mbridge.msdk.config.component.base.b bVar) {
        try {
            Iterator<a> it = this.f9039a.iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
        } catch (Throwable unused) {
            q0.b("LifecyclePublisher", "notifySubscriber error");
        }
    }

    private void b() {
        if (this.b == 0 && this.d) {
            a("916004", "");
            this.e = true;
        }
    }

    private void a(String str, String str2) {
        com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
        bVar.b(str);
        HashMap hashMap = new HashMap();
        hashMap.put(com.mbridge.msdk.config.component.common.util.c.c(StatisticData.ERROR_CODE_NOT_FOUND), str2);
        bVar.a(hashMap);
        a(bVar);
    }

    private void a() {
        if (this.c == 0) {
            this.d = true;
        }
    }
}
