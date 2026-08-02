package L9;

import L9.b;
import qc.q;

/* loaded from: classes9.dex */
final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f16611a;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f16612b;

    /* renamed from: c, reason: collision with root package name */
    private int f16613c;

    /* renamed from: L9.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0317a<T> extends q<T> {
    }

    a() {
        Object[] objArr = new Object[5];
        this.f16611a = objArr;
        this.f16612b = objArr;
    }

    final void a(T t2) {
        int i11 = this.f16613c;
        if (i11 == 4) {
            Object[] objArr = new Object[5];
            this.f16612b[4] = objArr;
            this.f16612b = objArr;
            i11 = 0;
        }
        this.f16612b[i11] = t2;
        this.f16613c = i11 + 1;
    }

    final void b(InterfaceC0317a<? super T> interfaceC0317a) {
        Object[] objArr;
        for (Object[] objArr2 = this.f16611a; objArr2 != null; objArr2 = objArr2[4]) {
            for (int i11 = 0; i11 < 4 && (objArr = objArr2[i11]) != null; i11++) {
                ((b.a) interfaceC0317a).test(objArr);
            }
        }
    }
}
