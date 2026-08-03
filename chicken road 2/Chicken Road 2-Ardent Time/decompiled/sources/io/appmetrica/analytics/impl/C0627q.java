package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0627q {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.WeakHashMap f6666a = new java.util.WeakHashMap();

    public final boolean a(android.app.Activity activity, io.appmetrica.analytics.impl.EnumC0601p enumC0601p) {
        if (activity != null && this.f6666a.get(activity) == enumC0601p) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.f6666a.put(activity, enumC0601p);
        return true;
    }
}
