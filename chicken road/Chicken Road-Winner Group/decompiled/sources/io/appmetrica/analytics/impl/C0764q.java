package io.appmetrica.analytics.impl;

import android.app.Activity;
import java.util.WeakHashMap;

/* renamed from: io.appmetrica.analytics.impl.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0764q {

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f8098a = new WeakHashMap();

    public final boolean a(Activity activity, EnumC0738p enumC0738p) {
        if (activity != null && this.f8098a.get(activity) == enumC0738p) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.f8098a.put(activity, enumC0738p);
        return true;
    }
}
