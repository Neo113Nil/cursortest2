package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Do extends io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.WeakHashMap f4239a;

    public Do() {
        super(false, "[WakelocksToggle]");
        this.f4239a = new java.util.WeakHashMap();
    }

    public final synchronized void a(java.lang.Object obj) {
        this.f4239a.put(obj, null);
        if (this.f4239a.size() == 1) {
            updateState(true);
        }
    }

    public final synchronized void b(java.lang.Object obj) {
        this.f4239a.remove(obj);
        if (this.f4239a.isEmpty()) {
            updateState(false);
        }
    }
}
