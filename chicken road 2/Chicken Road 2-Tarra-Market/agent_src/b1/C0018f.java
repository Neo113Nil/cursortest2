package b1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: b1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0018f extends C0023k {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f660c = AtomicIntegerFieldUpdater.newUpdater(C0018f.class, "_resumed");
    private volatile int _resumed;

    public C0018f(C0017e c0017e, Throwable th, boolean z2) {
        super(th, z2);
        this._resumed = 0;
    }
}
