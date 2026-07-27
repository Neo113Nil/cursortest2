package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Eo extends SimpleThreadSafeToggle {

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f5918a;

    public Eo() {
        super(false, "[WakelocksToggle]");
        this.f5918a = new WeakHashMap();
    }

    public final synchronized void a(Object obj) {
        this.f5918a.put(obj, null);
        if (this.f5918a.size() == 1) {
            updateState(true);
        }
    }

    public final synchronized void b(Object obj) {
        this.f5918a.remove(obj);
        if (this.f5918a.isEmpty()) {
            updateState(false);
        }
    }
}
