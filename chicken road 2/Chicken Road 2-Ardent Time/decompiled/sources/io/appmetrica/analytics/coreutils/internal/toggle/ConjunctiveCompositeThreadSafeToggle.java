package io.appmetrica.analytics.coreutils.internal.toggle;

/* loaded from: classes.dex */
public final class ConjunctiveCompositeThreadSafeToggle implements io.appmetrica.analytics.coreapi.internal.control.Toggle {

    /* renamed from: c, reason: collision with root package name */
    private final java.lang.String f3798c;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f3800e;

    /* renamed from: a, reason: collision with root package name */
    private final java.util.ArrayList f3796a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final java.util.HashMap f3797b = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.locks.ReentrantLock f3799d = new java.util.concurrent.locks.ReentrantLock();

    public ConjunctiveCompositeThreadSafeToggle(java.util.List<? extends io.appmetrica.analytics.coreapi.internal.control.Toggle> list, java.lang.String str) {
        this.f3798c = "[ConjunctiveCompositeToggle-" + str + ']';
        try {
            access$acquireLock(this);
            for (final io.appmetrica.analytics.coreapi.internal.control.Toggle toggle : list) {
                io.appmetrica.analytics.coreapi.internal.control.ToggleObserver toggleObserver = new io.appmetrica.analytics.coreapi.internal.control.ToggleObserver() { // from class: io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle$1$1$observer$1
                    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
                    public void onStateChanged(boolean z2) {
                        io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle = io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle.this;
                        io.appmetrica.analytics.coreapi.internal.control.Toggle toggle2 = toggle;
                        try {
                            io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle.access$acquireLock(conjunctiveCompositeThreadSafeToggle);
                            io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle.access$updateState(conjunctiveCompositeThreadSafeToggle, this, z2, java.lang.String.valueOf(kotlin.jvm.internal.q.a(toggle2.getClass()).b()));
                        } finally {
                            io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle.access$releaseLock(conjunctiveCompositeThreadSafeToggle);
                        }
                    }
                };
                this.f3797b.put(toggleObserver, java.lang.Boolean.valueOf(toggle.getActualState()));
                toggle.registerObserver(toggleObserver, false);
            }
            setActualState(a(this.f3797b.values()));
            access$releaseLock(this);
        } catch (java.lang.Throwable th) {
            access$releaseLock(this);
            throw th;
        }
    }

    private static boolean a(java.util.Collection collection) {
        if (collection == null || !collection.isEmpty()) {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!((java.lang.Boolean) it.next()).booleanValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final void access$acquireLock(io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle) {
        conjunctiveCompositeThreadSafeToggle.getClass();
        boolean z2 = false;
        while (!z2) {
            try {
                z2 = conjunctiveCompositeThreadSafeToggle.f3799d.tryLock(100L, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.Throwable th) {
                a.AbstractC0059a.i(th);
            }
            if (!z2) {
                try {
                    java.lang.Thread.sleep(100L);
                } catch (java.lang.Throwable th2) {
                    a.AbstractC0059a.i(th2);
                }
            }
        }
    }

    public static final void access$releaseLock(io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle) {
        conjunctiveCompositeThreadSafeToggle.f3799d.unlock();
    }

    public static final void access$updateState(io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle, io.appmetrica.analytics.coreapi.internal.control.ToggleObserver toggleObserver, boolean z2, java.lang.String str) {
        conjunctiveCompositeThreadSafeToggle.f3797b.put(toggleObserver, java.lang.Boolean.valueOf(z2));
        boolean a2 = a(conjunctiveCompositeThreadSafeToggle.f3797b.values());
        if (a2 != conjunctiveCompositeThreadSafeToggle.getActualState()) {
            conjunctiveCompositeThreadSafeToggle.setActualState(a2);
            java.util.Iterator it = conjunctiveCompositeThreadSafeToggle.f3796a.iterator();
            while (it.hasNext()) {
                ((io.appmetrica.analytics.coreapi.internal.control.ToggleObserver) it.next()).onStateChanged(a2);
            }
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public boolean getActualState() {
        return this.f3800e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public void registerObserver(io.appmetrica.analytics.coreapi.internal.control.ToggleObserver toggleObserver, boolean z2) {
        try {
            access$acquireLock(this);
            this.f3796a.add(toggleObserver);
            if (z2) {
                toggleObserver.onStateChanged(getActualState());
            }
        } finally {
            access$releaseLock(this);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public void removeObserver(io.appmetrica.analytics.coreapi.internal.control.ToggleObserver toggleObserver) {
        try {
            access$acquireLock(this);
            this.f3796a.remove(toggleObserver);
        } finally {
            access$releaseLock(this);
        }
    }

    public void setActualState(boolean z2) {
        this.f3800e = z2;
    }

    public java.lang.String toString() {
        return "ConjunctiveCompositeThreadSafeToggle(toggleStates=" + this.f3797b + ", tag='" + this.f3798c + "', actualState=" + getActualState() + ')';
    }
}
