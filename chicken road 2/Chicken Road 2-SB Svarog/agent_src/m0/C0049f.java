package m0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: m0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0049f extends C0054k {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f926c = AtomicIntegerFieldUpdater.newUpdater(C0049f.class, "_resumed");
    private volatile int _resumed;

    public C0049f(C0048e c0048e, Throwable th, boolean z2) {
        super(th, z2);
        this._resumed = 0;
    }
}
