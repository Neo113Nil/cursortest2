package Gc;

import Gc.k;
import io.reactivex.w;
import qc.q;

/* loaded from: classes9.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    final Object[] f9903a;

    /* renamed from: b, reason: collision with root package name */
    Object[] f9904b;

    /* renamed from: c, reason: collision with root package name */
    int f9905c;

    /* renamed from: Gc.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0204a<T> extends q<T> {
    }

    public a() {
        Object[] objArr = new Object[5];
        this.f9903a = objArr;
        this.f9904b = objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(io.reactivex.j jVar) {
        Object obj;
        Object[] objArr = this.f9903a;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i11 = 0; i11 < 4 && (obj = objArr[i11]) != null; i11++) {
                if (obj == k.COMPLETE) {
                    jVar.onComplete();
                    return true;
                }
                if (obj instanceof k.b) {
                    jVar.onError(((k.b) obj).f9909a);
                    return true;
                }
                if (obj instanceof k.c) {
                    jVar.d(((k.c) obj).f9910a);
                } else {
                    jVar.onNext(obj);
                }
            }
            objArr = (Object[]) objArr[4];
        }
    }

    public final <U> boolean b(w<? super U> wVar) {
        Object[] objArr;
        Object[] objArr2 = this.f9903a;
        while (true) {
            if (objArr2 == null) {
                return false;
            }
            for (int i11 = 0; i11 < 4 && (objArr = objArr2[i11]) != null; i11++) {
                if (k.d(wVar, objArr)) {
                    return true;
                }
            }
            objArr2 = objArr2[4];
        }
    }

    public final void c(T t2) {
        int i11 = this.f9905c;
        if (i11 == 4) {
            Object[] objArr = new Object[5];
            this.f9904b[4] = objArr;
            this.f9904b = objArr;
            i11 = 0;
        }
        this.f9904b[i11] = t2;
        this.f9905c = i11 + 1;
    }

    public final void d(InterfaceC0204a<? super T> interfaceC0204a) {
        Object obj;
        for (Object[] objArr = this.f9903a; objArr != null; objArr = (Object[]) objArr[4]) {
            for (int i11 = 0; i11 < 4 && (obj = objArr[i11]) != null; i11++) {
                if (interfaceC0204a.test(obj)) {
                    return;
                }
            }
        }
    }

    public final void e(T t2) {
        this.f9903a[0] = t2;
    }
}
