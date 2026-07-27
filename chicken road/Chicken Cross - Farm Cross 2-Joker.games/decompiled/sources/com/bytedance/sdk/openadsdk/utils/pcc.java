package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class pcc implements Application.ActivityLifecycleCallbacks {
    public static long gm = 0;
    public static boolean pcc = false;
    public static long sf;
    private volatile WeakReference<Activity> gbb;
    private final oo kj;
    private final oo vy;
    private final AtomicBoolean oo = new AtomicBoolean(false);
    private final RunnableC0207pcc vj = new RunnableC0207pcc();
    private final wh wh = new wh();
    private final vj qf = new vj();
    private int ork = 0;
    private volatile CopyOnWriteArrayList<WeakReference<com.bytedance.sdk.component.adexpress.pcc>> vh = new CopyOnWriteArrayList<>();
    private HandlerThread tmg = null;
    private Handler hc = null;
    private final LinkedList<Activity> jr = new LinkedList<>();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public pcc() {
        this.kj = new sf();
        this.vy = new gm();
        gm();
    }

    private void gm() {
        this.tmg = com.bytedance.sdk.component.utils.kj.pcc("lifecycle", 10);
        this.hc = new Handler(this.tmg.getLooper());
    }

    private void pcc(Runnable runnable) {
        if (!this.tmg.isAlive()) {
            gm();
        }
        this.hc.postDelayed(runnable, 1000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.jr.addFirst(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(final Activity activity) {
        Window window;
        try {
            if (rj.sf() && (window = activity.getWindow()) != null) {
                final View decorView = window.getDecorView();
                if (decorView.isAttachedToWindow()) {
                    if (rj.oo(activity)) {
                        rj.pcc(true);
                    }
                } else {
                    decorView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.pcc.1
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View view) {
                            decorView.removeOnAttachStateChangeListener(this);
                            if (rj.oo(activity)) {
                                rj.pcc(true);
                            }
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View view) {
                            decorView.removeOnAttachStateChangeListener(this);
                        }
                    });
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.pcc("TTAD.ActivityLifecycle", th);
        }
        this.ork++;
        if (this.oo.get()) {
            this.hc.removeCallbacks(this.vy);
            this.hc.removeCallbacks(this.kj);
            pcc(this.vy);
        }
        this.oo.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        pcc(this.wh);
        if (!pcc) {
            sf = System.currentTimeMillis();
            pcc = true;
        }
        this.gbb = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        int i = this.ork - 1;
        this.ork = i;
        if (i < 0) {
            this.ork = 0;
        }
        if (ApmHelper.isIsInit()) {
            pcc(this.qf);
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.pcc$pcc, reason: collision with other inner class name */
    static class RunnableC0207pcc implements Runnable {
        RunnableC0207pcc() {
        }

        @Override // java.lang.Runnable
        public void run() {
            rnn.sf(new com.bytedance.sdk.component.kj.sf.gm("reportPvFromBackGround") { // from class: com.bytedance.sdk.openadsdk.utils.pcc.pcc.1
                @Override // java.lang.Runnable
                public void run() {
                    ApmHelper.reportPvFromBackGround();
                }
            });
        }
    }

    class wh implements Runnable {
        wh() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.core.jr.sf().removeMessages(1001);
            com.bytedance.sdk.openadsdk.core.lu.pcc();
        }
    }

    class vj implements Runnable {
        vj() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ApmHelper.isIsInit()) {
                Handler sf = com.bytedance.sdk.openadsdk.core.jr.sf();
                Message obtain = Message.obtain(sf, pcc.this.vj);
                obtain.what = 1001;
                sf.sendMessageDelayed(obtain, 30000L);
            }
        }
    }

    private static class oo implements Runnable {
        private oo() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.oo.pcc.ork mua = com.bytedance.sdk.openadsdk.core.settings.vh.sf().mua();
            if (mua == null || mua.pcc() || !com.bytedance.sdk.component.utils.lu.kj(com.bytedance.sdk.openadsdk.core.lu.pcc())) {
                return;
            }
            com.bytedance.sdk.openadsdk.oo.pcc.sf.pcc(com.bytedance.sdk.openadsdk.core.hc.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc()));
        }
    }

    private static class gm extends oo {
        private gm() {
            super();
        }

        @Override // com.bytedance.sdk.openadsdk.utils.pcc.oo, java.lang.Runnable
        public void run() {
            super.run();
            com.bytedance.sdk.openadsdk.utils.vj.pcc();
        }
    }

    private static class sf extends oo {
        private sf() {
            super();
        }

        @Override // com.bytedance.sdk.openadsdk.utils.pcc.oo, java.lang.Runnable
        public void run() {
            super.run();
            com.bytedance.sdk.openadsdk.wh.sf.pcc().sf();
            com.bytedance.sdk.openadsdk.utils.vj.sf();
            com.bytedance.sdk.openadsdk.component.qf.pcc.pcc(3);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (this.ork <= 0) {
            this.oo.set(true);
        }
        if (pcc()) {
            pcc = false;
            com.bytedance.sdk.openadsdk.core.jr.sf.set(false);
            gm = System.currentTimeMillis();
            this.hc.removeCallbacks(this.vy);
            this.hc.removeCallbacks(this.kj);
            pcc(this.kj);
        }
        pcc(new qf(sf, gm, pcc()));
    }

    public class qf implements Runnable {
        private long gm;
        private boolean oo;
        private long sf;

        public qf(long j, long j2, boolean z) {
            this.sf = j;
            this.gm = j2;
            this.oo = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.oo) {
                com.bytedance.sdk.openadsdk.dax.oo.pcc().pcc(this.sf / 1000, this.gm / 1000);
            }
        }
    }

    public void pcc(com.bytedance.sdk.component.adexpress.pcc pccVar) {
        this.vh.add(new WeakReference<>(pccVar));
    }

    public boolean sf(com.bytedance.sdk.component.adexpress.pcc pccVar) {
        return this.vh.remove(new WeakReference(pccVar));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.vh != null && this.vh.size() > 0) {
            Iterator<WeakReference<com.bytedance.sdk.component.adexpress.pcc>> it = this.vh.iterator();
            while (it.hasNext()) {
                WeakReference<com.bytedance.sdk.component.adexpress.pcc> next = it.next();
                if (next != null && next.get() != null) {
                    try {
                        next.get().pcc(activity);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (this.gbb != null && this.gbb.get() == activity) {
            this.gbb = null;
        }
        this.jr.remove(activity);
    }

    public boolean pcc() {
        return this.oo.get();
    }

    public boolean pcc(boolean z) {
        Window window;
        if (this.gbb == null) {
            return z;
        }
        try {
            Activity activity = this.gbb.get();
            return (activity == null || (window = activity.getWindow()) == null) ? z : window.getDecorView().hasWindowFocus();
        } catch (Throwable unused) {
            return z;
        }
    }

    public Activity sf() {
        if (this.jr.isEmpty()) {
            return null;
        }
        return this.jr.getFirst();
    }
}
