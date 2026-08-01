package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Lq implements Gq {
    public static final WeakHashMap g = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Iq f6704a;
    public final Y9 b;
    public View c;
    public final ConcurrentHashMap d;
    public final WeakReference e;
    public Hg f;

    public Lq(Activity activity, Iq windowInsetListener, Y9 y9) {
        Window window;
        Intrinsics.checkNotNullParameter(windowInsetListener, "windowInsetListener");
        this.f6704a = windowInsetListener;
        this.b = y9;
        this.d = new ConcurrentHashMap();
        WeakReference weakReference = new WeakReference(activity);
        this.e = weakReference;
        Y5.f6965a.getClass();
        if (!Y5.w()) {
            if (y9 != null) {
                ((Z9) y9).a("WindowInsetsHandler", "WindowInsetsHandler is not supported for this version");
                return;
            }
            return;
        }
        Activity activity2 = (Activity) weakReference.get();
        View decorView = (activity2 == null || (window = activity2.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            this.c = decorView;
            if (y9 != null) {
                ((Z9) y9).a("WindowInsetsHandler", "startListeningToInsets");
            }
            WeakHashMap weakHashMap = g;
            Object obj = weakHashMap.get(decorView);
            if (obj == null) {
                obj = new Hq(decorView);
                weakHashMap.put(decorView, obj);
            }
            Intrinsics.checkNotNullParameter(this, "listener");
            ((Hq) obj).f6612a.add(this);
            if (y9 != null) {
                ((Z9) y9).a("WindowInsetsHandler_INSTANCE", this + " created - " + weakHashMap.size());
            }
        }
    }

    public final void a(WindowInsets windowInsets) {
        try {
            Activity activity = (Activity) this.e.get();
            if (!this.f6704a.a()) {
                Y9 y9 = this.b;
                if (y9 != null) {
                    ((Z9) y9).a("WindowInsetsHandler", "listener is not interested in computing insets, skipping");
                    return;
                }
                return;
            }
            if (activity == null) {
                Y9 y92 = this.b;
                if (y92 != null) {
                    ((Z9) y92).b("WindowInsetsHandler", "Activity is null, skipping safeArea computation");
                    return;
                }
                return;
            }
            Jq b = AbstractC3727g4.a(activity) ? Vj.b(windowInsets) : Vj.a(windowInsets);
            Integer f = AbstractC3841k6.f();
            int intValue = f != null ? f.intValue() : AbstractC3841k6.a(windowInsets);
            AbstractC3841k6.a(Integer.valueOf(intValue));
            a(b, intValue);
        } catch (Error e) {
            Y9 y93 = this.b;
            if (y93 != null) {
                ((Z9) y93).b("WindowInsetsHandler", "Error in getting safeArea " + e.getMessage());
            }
        } catch (Exception e2) {
            Y9 y94 = this.b;
            if (y94 != null) {
                ((Z9) y94).a("WindowInsetsHandler", "Exception in getting safeArea", e2);
            }
        }
    }

    public final void a(Jq insets, int i) {
        Hg orientation = Ig.a(AbstractC3841k6.g());
        Kq kq = (Kq) this.d.get(Integer.valueOf(i));
        if (kq == null) {
            kq = new Kq();
            this.d.put(Integer.valueOf(i), kq);
        }
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Jq jq = (Jq) kq.f6682a.get(orientation);
        if (jq != null && Intrinsics.areEqual(insets, jq)) {
            Y9 y9 = this.b;
            if (y9 != null) {
                ((Z9) y9).a("WindowInsetsHandler", "SafeArea - Same value, no need to update");
            }
        } else {
            Y9 y92 = this.b;
            if (y92 != null) {
                ((Z9) y92).a("WindowInsetsHandler", "safeArea - New value, updating to KV store");
            }
            Intrinsics.checkNotNullParameter(orientation, "orientation");
            Intrinsics.checkNotNullParameter(insets, "insets");
            kq.f6682a.put(orientation, insets);
            ConcurrentHashMap concurrentHashMap = this.d;
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(concurrentHashMap.size()));
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((Kq) entry.getValue()).a());
            }
            AbstractC3841k6.a(linkedHashMap);
        }
        if (this.f != orientation) {
            this.f = orientation;
            Iq iq = this.f6704a;
            Object obj = this.d.get(Integer.valueOf(i));
            Intrinsics.checkNotNull(obj);
            iq.a(orientation, (Kq) obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Lq(Ej view, Iq windowInsetListener, Y9 y9) {
        this((Activity) null, windowInsetListener, y9);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(windowInsetListener, "windowInsetListener");
        Y5.f6965a.getClass();
        if (!Y5.w()) {
            if (y9 != null) {
                ((Z9) y9).a("WindowInsetsHandler", "WindowInsetsHandler is not supported for this version");
                return;
            }
            return;
        }
        this.c = view;
        if (y9 != null) {
            ((Z9) y9).a("WindowInsetsHandler", "startListeningToInsets");
        }
        WeakHashMap weakHashMap = g;
        Object obj = weakHashMap.get(view);
        if (obj == null) {
            obj = new Hq(view);
            weakHashMap.put(view, obj);
        }
        Intrinsics.checkNotNullParameter(this, "listener");
        ((Hq) obj).f6612a.add(this);
        if (y9 != null) {
            ((Z9) y9).a("WindowInsetsHandler_INSTANCE", this + " created - " + weakHashMap.size());
        }
    }

    public final void a() {
        View view = this.c;
        if (view != null) {
            WeakHashMap weakHashMap = g;
            Hq hq = (Hq) weakHashMap.get(view);
            if (hq != null) {
                Intrinsics.checkNotNullParameter(this, "listener");
                hq.f6612a.remove(this);
                if (hq.f6612a.isEmpty()) {
                    hq.a();
                    weakHashMap.remove(view);
                }
            }
            Y9 y9 = this.b;
            if (y9 != null) {
                ((Z9) y9).a("WindowInsetsHandler_INSTANCE", this + " destroy - " + weakHashMap.size());
            }
        }
        this.c = null;
        this.d.clear();
    }
}
