package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.support.annotation.MainThread;
import android.support.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zza extends ActivityLifecycleObserver {
    private final WeakReference<C0007zza> zzds;

    @VisibleForTesting(otherwise = 2)
    /* renamed from: com.google.android.gms.common.api.internal.zza$zza, reason: collision with other inner class name */
    static class C0007zza extends LifecycleCallback {
        private List<Runnable> zzdt;

        private C0007zza(LifecycleFragment lifecycleFragment) {
            super(lifecycleFragment);
            this.zzdt = new ArrayList();
            this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C0007zza zza(Activity activity) {
            C0007zza c0007zza;
            synchronized (activity) {
                LifecycleFragment fragment = getFragment(activity);
                c0007zza = (C0007zza) fragment.getCallbackOrNull("LifecycleObserverOnStop", C0007zza.class);
                if (c0007zza == null) {
                    c0007zza = new C0007zza(fragment);
                }
            }
            return c0007zza;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized void zza(Runnable runnable) {
            this.zzdt.add(runnable);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        @MainThread
        public void onStop() {
            List<Runnable> list;
            synchronized (this) {
                list = this.zzdt;
                this.zzdt = new ArrayList();
            }
            Iterator<Runnable> it = list.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }
    }

    public zza(Activity activity) {
        this(C0007zza.zza(activity));
    }

    @VisibleForTesting(otherwise = 2)
    private zza(C0007zza c0007zza) {
        this.zzds = new WeakReference<>(c0007zza);
    }

    @Override // com.google.android.gms.common.api.internal.ActivityLifecycleObserver
    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        C0007zza c0007zza = this.zzds.get();
        if (c0007zza == null) {
            throw new IllegalStateException("The target activity has already been GC'd");
        }
        c0007zza.zza(runnable);
        return this;
    }
}
