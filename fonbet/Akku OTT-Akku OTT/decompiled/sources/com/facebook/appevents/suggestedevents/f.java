package com.facebook.appevents.suggestedevents;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.k;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* loaded from: classes3.dex */
public final class f implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final a Companion = new a();
    public static final HashMap d = new HashMap();
    public final WeakReference<Activity> a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final AtomicBoolean c = new AtomicBoolean(false);

    @SourceDebugExtension({"SMAP\nViewObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewObserver.kt\ncom/facebook/appevents/suggestedevents/ViewObserver$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,103:1\n361#2,7:104\n*S KotlinDebug\n*F\n+ 1 ViewObserver.kt\ncom/facebook/appevents/suggestedevents/ViewObserver$Companion\n*L\n92#1:104,7\n*E\n"})
    public static final class a {
        @JvmStatic
        public static void a(Activity activity) {
            View a;
            Intrinsics.checkNotNullParameter(activity, "activity");
            int hashCode = activity.hashCode();
            a aVar = f.Companion;
            HashMap hashMap = null;
            if (!com.facebook.internal.instrument.crashshield.a.b(f.class)) {
                try {
                    hashMap = f.d;
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, f.class);
                }
            }
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = hashMap.get(valueOf);
            if (obj == null) {
                obj = new f(activity);
                hashMap.put(valueOf, obj);
            }
            f fVar = (f) obj;
            if (com.facebook.internal.instrument.crashshield.a.b(f.class)) {
                return;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.a.b(fVar)) {
                    return;
                }
                try {
                    if (!fVar.c.getAndSet(true) && (a = com.facebook.appevents.internal.g.a(fVar.a.get())) != null) {
                        ViewTreeObserver viewTreeObserver = a.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalLayoutListener(fVar);
                            fVar.a();
                        }
                    }
                } catch (Throwable th2) {
                    com.facebook.internal.instrument.crashshield.a.a(th2, fVar);
                }
            } catch (Throwable th3) {
                com.facebook.internal.instrument.crashshield.a.a(th3, f.class);
            }
        }

        @JvmStatic
        public static void b(Activity activity) {
            View a;
            Intrinsics.checkNotNullParameter(activity, "activity");
            int hashCode = activity.hashCode();
            a aVar = f.Companion;
            HashMap hashMap = null;
            if (!com.facebook.internal.instrument.crashshield.a.b(f.class)) {
                try {
                    hashMap = f.d;
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, f.class);
                }
            }
            f fVar = (f) hashMap.remove(Integer.valueOf(hashCode));
            if (fVar == null || com.facebook.internal.instrument.crashshield.a.b(f.class)) {
                return;
            }
            try {
                if (!com.facebook.internal.instrument.crashshield.a.b(fVar)) {
                    try {
                        if (fVar.c.getAndSet(false) && (a = com.facebook.appevents.internal.g.a(fVar.a.get())) != null) {
                            ViewTreeObserver viewTreeObserver = a.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnGlobalLayoutListener(fVar);
                            }
                        }
                    } catch (Throwable th2) {
                        com.facebook.internal.instrument.crashshield.a.a(th2, fVar);
                    }
                }
            } catch (Throwable th3) {
                com.facebook.internal.instrument.crashshield.a.a(th3, f.class);
            }
        }
    }

    public f(Activity activity) {
        this.a = new WeakReference<>(activity);
    }

    public final void a() {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            k kVar = new k(this, 2);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                kVar.run();
            } else {
                this.b.post(kVar);
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            a();
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }
}
