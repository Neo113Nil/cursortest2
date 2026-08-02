package Cc;

import java.util.concurrent.atomic.AtomicReference;
import tc.InterfaceC9807i;

/* renamed from: Cc.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C2738a<T> implements InterfaceC9807i<T> {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<C0115a<T>> f4656a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<C0115a<T>> f4657b;

    /* renamed from: Cc.a$a, reason: collision with other inner class name */
    static final class C0115a<E> extends AtomicReference<C0115a<E>> {

        /* renamed from: a, reason: collision with root package name */
        private E f4658a;

        C0115a() {
        }

        public final E a() {
            E e11 = this.f4658a;
            this.f4658a = null;
            return e11;
        }

        C0115a(E e11) {
            this.f4658a = e11;
        }
    }

    public C2738a() {
        AtomicReference<C0115a<T>> atomicReference = new AtomicReference<>();
        this.f4656a = atomicReference;
        AtomicReference<C0115a<T>> atomicReference2 = new AtomicReference<>();
        this.f4657b = atomicReference2;
        C0115a<T> c0115a = new C0115a<>();
        atomicReference2.lazySet(c0115a);
        atomicReference.getAndSet(c0115a);
    }

    @Override // tc.InterfaceC9808j
    public final void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    @Override // tc.InterfaceC9808j
    public final boolean isEmpty() {
        return this.f4657b.get() == this.f4656a.get();
    }

    @Override // tc.InterfaceC9808j
    public final boolean offer(T t2) {
        if (t2 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        C0115a<T> c0115a = new C0115a<>(t2);
        this.f4656a.getAndSet(c0115a).lazySet(c0115a);
        return true;
    }

    @Override // tc.InterfaceC9808j
    public final T poll() {
        C0115a<T> c0115a;
        AtomicReference<C0115a<T>> atomicReference = this.f4657b;
        C0115a<T> c0115a2 = atomicReference.get();
        C0115a<T> c0115a3 = (C0115a) c0115a2.get();
        if (c0115a3 != null) {
            T a11 = c0115a3.a();
            atomicReference.lazySet(c0115a3);
            return a11;
        }
        if (c0115a2 == this.f4656a.get()) {
            return null;
        }
        do {
            c0115a = (C0115a) c0115a2.get();
        } while (c0115a == null);
        T a12 = c0115a.a();
        atomicReference.lazySet(c0115a);
        return a12;
    }
}
