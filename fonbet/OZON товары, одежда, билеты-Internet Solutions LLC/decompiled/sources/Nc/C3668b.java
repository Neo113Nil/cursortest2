package Nc;

import Kc.C3493a;
import io.reactivex.AbstractC7094b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import sc.C9656b;

/* renamed from: Nc.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3668b extends AbstractC7094b implements io.reactivex.d {

    /* renamed from: d, reason: collision with root package name */
    static final a[] f18953d = new a[0];

    /* renamed from: e, reason: collision with root package name */
    static final a[] f18954e = new a[0];

    /* renamed from: c, reason: collision with root package name */
    Throwable f18957c;

    /* renamed from: b, reason: collision with root package name */
    final AtomicBoolean f18956b = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<a[]> f18955a = new AtomicReference<>(f18953d);

    /* renamed from: Nc.b$a */
    static final class a extends AtomicReference<C3668b> implements InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.d f18958a;

        a(io.reactivex.d dVar, C3668b c3668b) {
            this.f18958a = dVar;
            lazySet(c3668b);
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            C3668b andSet = getAndSet(null);
            if (andSet != null) {
                andSet.m(this);
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return get() == null;
        }
    }

    C3668b() {
    }

    public static C3668b l() {
        return new C3668b();
    }

    @Override // io.reactivex.AbstractC7094b
    protected final void j(io.reactivex.d dVar) {
        a aVar = new a(dVar, this);
        dVar.onSubscribe(aVar);
        while (true) {
            AtomicReference<a[]> atomicReference = this.f18955a;
            a[] aVarArr = atomicReference.get();
            if (aVarArr == f18954e) {
                Throwable th2 = this.f18957c;
                if (th2 != null) {
                    dVar.onError(th2);
                    return;
                } else {
                    dVar.onComplete();
                    return;
                }
            }
            int length = aVarArr.length;
            a[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                if (atomicReference.get() != aVarArr) {
                    break;
                }
            }
            if (aVar.isDisposed()) {
                m(aVar);
                return;
            }
            return;
        }
    }

    final void m(a aVar) {
        AtomicReference<a[]> atomicReference;
        a[] aVarArr;
        a[] aVarArr2;
        do {
            atomicReference = this.f18955a;
            aVarArr = atomicReference.get();
            int length = aVarArr.length;
            if (length == 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                } else if (aVarArr[i11] == aVar) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 < 0) {
                return;
            }
            if (length == 1) {
                aVarArr2 = f18953d;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i11);
                System.arraycopy(aVarArr, i11 + 1, aVarArr3, i11, (length - i11) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!Bl.b.e(atomicReference, aVarArr, aVarArr2));
    }

    @Override // io.reactivex.d
    public final void onComplete() {
        if (this.f18956b.compareAndSet(false, true)) {
            for (a aVar : this.f18955a.getAndSet(f18954e)) {
                aVar.f18958a.onComplete();
            }
        }
    }

    @Override // io.reactivex.d
    public final void onError(Throwable th2) {
        C9656b.c(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f18956b.compareAndSet(false, true)) {
            C3493a.f(th2);
            return;
        }
        this.f18957c = th2;
        for (a aVar : this.f18955a.getAndSet(f18954e)) {
            aVar.f18958a.onError(th2);
        }
    }

    @Override // io.reactivex.d
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        if (this.f18955a.get() == f18954e) {
            interfaceC8487b.dispose();
        }
    }
}
