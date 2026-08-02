package D6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: D6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0117e {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1827b = AtomicIntegerFieldUpdater.newUpdater(C0117e.class, "notCompletedCount");

    /* renamed from: a, reason: collision with root package name */
    public final H[] f1828a;
    private volatile int notCompletedCount;

    public C0117e(H[] hArr) {
        this.f1828a = hArr;
        this.notCompletedCount = hArr.length;
    }
}
