package io.appmetrica.analytics.coreutils.internal.toggle;

/* loaded from: classes.dex */
public abstract class SimpleThreadSafeToggle implements io.appmetrica.analytics.coreapi.internal.control.Toggle {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f3804a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3805b;

    /* renamed from: c, reason: collision with root package name */
    private final java.util.ArrayList f3806c;

    public SimpleThreadSafeToggle(boolean z2, java.lang.String str) {
        this.f3804a = str;
        this.f3805b = z2;
        this.f3806c = new java.util.ArrayList();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized boolean getActualState() {
        return this.f3805b;
    }

    public final java.lang.String getTag() {
        return this.f3804a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized void registerObserver(io.appmetrica.analytics.coreapi.internal.control.ToggleObserver toggleObserver, boolean z2) {
        this.f3806c.add(toggleObserver);
        if (z2) {
            toggleObserver.onStateChanged(getActualState());
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized void removeObserver(io.appmetrica.analytics.coreapi.internal.control.ToggleObserver toggleObserver) {
        this.f3806c.remove(toggleObserver);
    }

    public final synchronized void updateState(boolean z2) {
        if (z2 != getActualState()) {
            this.f3805b = z2;
            java.util.Iterator it = this.f3806c.iterator();
            while (it.hasNext()) {
                ((io.appmetrica.analytics.coreapi.internal.control.ToggleObserver) it.next()).onStateChanged(z2);
            }
        }
    }

    public /* synthetic */ SimpleThreadSafeToggle(boolean z2, java.lang.String str, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? false : z2, str);
    }
}
