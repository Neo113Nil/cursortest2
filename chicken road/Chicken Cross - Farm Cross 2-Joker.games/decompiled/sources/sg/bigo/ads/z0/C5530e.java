package sg.bigo.ads.z0;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.x0.AbstractC5503c;
import sg.bigo.ads.x0.C5502b;

/* renamed from: sg.bigo.ads.z0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5530e implements InterfaceC5535j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f13431a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ AbstractC5503c c;

    public C5530e(CountDownLatch countDownLatch, AtomicBoolean atomicBoolean, C5502b c5502b) {
        this.f13431a = countDownLatch;
        this.b = atomicBoolean;
        this.c = c5502b;
    }

    @Override // sg.bigo.ads.z0.InterfaceC5535j
    public final void a() {
        this.f13431a.countDown();
        if (this.b.compareAndSet(false, true)) {
            this.c.getClass();
        }
    }
}
