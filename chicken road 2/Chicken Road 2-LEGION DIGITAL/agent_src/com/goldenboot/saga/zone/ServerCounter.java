package com.goldenboot.saga.zone;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class ServerCounter extends JoystickLauncher {
    public static final /* synthetic */ AtomicIntegerFieldUpdater injectMetric = AtomicIntegerFieldUpdater.newUpdater(ServerCounter.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ServerCounter(ServiceRegulator serviceRegulator, Throwable th, boolean z) {
        super(th, z);
        if (th == null) {
            th = new CancellationException("Continuation " + serviceRegulator + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }

    public final boolean releaseHeader() {
        return injectMetric.compareAndSet(this, 0, 1);
    }
}
