package io.appmetrica.analytics.coreutils.internal.toggle;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public abstract class SimpleThreadSafeToggle implements Toggle {

    /* renamed from: a, reason: collision with root package name */
    private final String f6307a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f6308b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f6309c;

    public SimpleThreadSafeToggle(boolean z, String str) {
        this.f6307a = str;
        this.f6308b = z;
        this.f6309c = new ArrayList();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized boolean getActualState() {
        return this.f6308b;
    }

    public final String getTag() {
        return this.f6307a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized void registerObserver(ToggleObserver toggleObserver, boolean z) {
        this.f6309c.add(toggleObserver);
        if (z) {
            toggleObserver.onStateChanged(getActualState());
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized void removeObserver(ToggleObserver toggleObserver) {
        this.f6309c.remove(toggleObserver);
    }

    public final synchronized void updateState(boolean z) {
        if (z != getActualState()) {
            this.f6308b = z;
            Iterator it = this.f6309c.iterator();
            while (it.hasNext()) {
                ((ToggleObserver) it.next()).onStateChanged(z);
            }
        }
    }

    public /* synthetic */ SimpleThreadSafeToggle(boolean z, String str, int i2, e eVar) {
        this((i2 & 1) != 0 ? false : z, str);
    }
}
