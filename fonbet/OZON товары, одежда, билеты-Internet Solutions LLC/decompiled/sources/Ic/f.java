package Ic;

import io.reactivex.A;
import io.reactivex.m;
import io.reactivex.w;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class f<T> extends AbstractC3232a<T, f<T>> implements w<T>, m<T>, A<T>, io.reactivex.d {

    /* renamed from: e, reason: collision with root package name */
    private final w<? super T> f12170e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference<InterfaceC8487b> f12171f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class a implements w<Object> {
        private static final /* synthetic */ a[] $VALUES;
        public static final a INSTANCE;

        static {
            a aVar = new a("INSTANCE", 0);
            INSTANCE = aVar;
            $VALUES = new a[]{aVar};
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
        }

        @Override // io.reactivex.w
        public final void onNext(Object obj) {
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        }
    }

    public f() {
        a aVar = a.INSTANCE;
        this.f12171f = new AtomicReference<>();
        this.f12170e = aVar;
    }

    @Override // nc.InterfaceC8487b
    public final void dispose() {
        rc.d.a(this.f12171f);
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return rc.d.b(this.f12171f.get());
    }

    @Override // io.reactivex.w
    public final void onComplete() {
        CountDownLatch countDownLatch = this.f12156a;
        if (!this.f12159d) {
            this.f12159d = true;
            if (this.f12171f.get() == null) {
                this.f12158c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            Thread.currentThread();
            this.f12170e.getClass();
        } finally {
            countDownLatch.countDown();
        }
    }

    @Override // io.reactivex.w
    public final void onError(Throwable th2) {
        CountDownLatch countDownLatch = this.f12156a;
        boolean z11 = this.f12159d;
        Gc.m mVar = this.f12158c;
        if (!z11) {
            this.f12159d = true;
            if (this.f12171f.get() == null) {
                mVar.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            Thread.currentThread();
            if (th2 == null) {
                mVar.add(new NullPointerException("onError received a null Throwable"));
            } else {
                mVar.add(th2);
            }
            this.f12170e.getClass();
            countDownLatch.countDown();
        } catch (Throwable th3) {
            countDownLatch.countDown();
            throw th3;
        }
    }

    @Override // io.reactivex.w
    public final void onNext(T t2) {
        boolean z11 = this.f12159d;
        Gc.m mVar = this.f12158c;
        if (!z11) {
            this.f12159d = true;
            if (this.f12171f.get() == null) {
                mVar.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        Thread.currentThread();
        this.f12157b.add(t2);
        if (t2 == null) {
            mVar.add(new NullPointerException("onNext received a null value"));
        }
        this.f12170e.getClass();
    }

    @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        Thread.currentThread();
        Gc.m mVar = this.f12158c;
        if (interfaceC8487b == null) {
            mVar.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        AtomicReference<InterfaceC8487b> atomicReference = this.f12171f;
        while (!atomicReference.compareAndSet(null, interfaceC8487b)) {
            if (atomicReference.get() != null) {
                interfaceC8487b.dispose();
                if (atomicReference.get() != rc.d.DISPOSED) {
                    mVar.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + interfaceC8487b));
                    return;
                }
                return;
            }
        }
        this.f12170e.getClass();
    }

    @Override // io.reactivex.m, io.reactivex.A
    public final void onSuccess(T t2) {
        onNext(t2);
        onComplete();
    }
}
