package com.facebook.appevents.suggestedevents;

import android.app.Activity;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.facebook.appevents.suggestedevents.f;
import com.facebook.internal.n;
import com.facebook.internal.p;
import com.facebook.w;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class e {
    public static final e a = new e();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final LinkedHashSet c = new LinkedHashSet();
    public static final LinkedHashSet d = new LinkedHashSet();

    @JvmStatic
    public static final synchronized void a() {
        synchronized (e.class) {
            if (com.facebook.internal.instrument.crashshield.a.b(e.class)) {
                return;
            }
            try {
                w.c().execute(new d());
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, e.class);
            }
        }
    }

    @JvmStatic
    public static final void d(Activity activity) {
        if (com.facebook.internal.instrument.crashshield.a.b(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                if (b.get()) {
                    a aVar = a.a;
                    boolean z = false;
                    if (!com.facebook.internal.instrument.crashshield.a.b(a.class)) {
                        try {
                            z = a.f;
                        } catch (Throwable th) {
                            com.facebook.internal.instrument.crashshield.a.a(th, a.class);
                        }
                    }
                    if (z) {
                        if (c.isEmpty()) {
                            if (!d.isEmpty()) {
                            }
                        }
                        f.Companion.getClass();
                        f.a.a(activity);
                        return;
                    }
                }
                f.Companion.getClass();
                f.a.b(activity);
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, e.class);
        }
    }

    public final void b() {
        String str;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            n k = p.k(w.b(), false);
            if (k != null && (str = k.k) != null) {
                c(str);
                if (c.isEmpty() && d.isEmpty()) {
                    return;
                }
                File d2 = com.facebook.appevents.ml.d.d();
                if (d2 == null) {
                    return;
                }
                a.d(d2);
                WeakReference<Activity> weakReference = com.facebook.appevents.internal.f.m;
                Activity activity = weakReference != null ? weakReference.get() : null;
                if (activity != null) {
                    d(activity);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }

    @VisibleForTesting(otherwise = 2)
    public final void c(String str) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("production_events")) {
                JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    LinkedHashSet linkedHashSet = c;
                    String string = jSONArray.getString(i);
                    Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                    linkedHashSet.add(string);
                }
            }
            if (jSONObject.has("eligible_for_prediction_events")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    LinkedHashSet linkedHashSet2 = d;
                    String string2 = jSONArray2.getString(i2);
                    Intrinsics.checkNotNullExpressionValue(string2, "jsonArray.getString(i)");
                    linkedHashSet2.add(string2);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }
}
