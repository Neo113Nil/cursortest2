package Fc;

import io.reactivex.j;

/* loaded from: classes.dex */
public class c<T> extends a<T> {

    /* renamed from: a, reason: collision with root package name */
    protected final j f9317a;

    /* renamed from: b, reason: collision with root package name */
    protected T f9318b;

    public c(j jVar) {
        this.f9317a = jVar;
    }

    @Override // tc.InterfaceC9804f
    public final int a(int i11) {
        lazySet(8);
        return 2;
    }

    public final void b(T t2) {
        int i11 = get();
        do {
            j jVar = this.f9317a;
            if (i11 == 8) {
                this.f9318b = t2;
                lazySet(16);
                jVar.onNext(t2);
                if (get() != 4) {
                    jVar.onComplete();
                    return;
                }
                return;
            }
            if ((i11 & (-3)) != 0) {
                return;
            }
            if (i11 == 2) {
                lazySet(3);
                jVar.onNext(t2);
                if (get() != 4) {
                    jVar.onComplete();
                    return;
                }
                return;
            }
            this.f9318b = t2;
            if (compareAndSet(0, 1)) {
                return;
            } else {
                i11 = get();
            }
        } while (i11 != 4);
        this.f9318b = null;
    }

    public void cancel() {
        set(4);
        this.f9318b = null;
    }

    @Override // tc.InterfaceC9808j
    public final void clear() {
        lazySet(32);
        this.f9318b = null;
    }

    @Override // tc.InterfaceC9808j
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // hg.InterfaceC6950c
    public final void n(long j11) {
        T t2;
        if (g.f(j11)) {
            do {
                int i11 = get();
                if ((i11 & (-2)) != 0) {
                    return;
                }
                if (i11 == 1) {
                    if (!compareAndSet(1, 3) || (t2 = this.f9318b) == null) {
                        return;
                    }
                    this.f9318b = null;
                    j jVar = this.f9317a;
                    jVar.onNext(t2);
                    if (get() != 4) {
                        jVar.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    public void onSuccess(T t2) {
        b(t2);
    }

    @Override // tc.InterfaceC9808j
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t2 = this.f9318b;
        this.f9318b = null;
        return t2;
    }
}
