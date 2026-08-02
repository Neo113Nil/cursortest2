package O4;

import A0.J0;
import Q2.C0375o;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: O4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0257c extends AbstractC0266l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4211a;

    public /* synthetic */ C0257c(int i) {
        this.f4211a = i;
    }

    @Override // O4.AbstractC0266l
    public InterfaceC0267m a(Type type) {
        switch (this.f4211a) {
            case 0:
                if (y4.x.class.isAssignableFrom(Z.h(type))) {
                    return C0256b.f4206n;
                }
                return null;
            default:
                return super.a(type);
        }
    }

    @Override // O4.AbstractC0266l
    public final InterfaceC0267m b(Type type, Annotation[] annotationArr, C0375o c0375o) {
        switch (this.f4211a) {
            case 0:
                if (type == y4.B.class) {
                    return Z.l(annotationArr, Q4.w.class) ? C0256b.f4207o : C0256b.f4205m;
                }
                if (type == Void.class) {
                    return C0256b.f4209q;
                }
                if (Z.m(type)) {
                    return C0256b.f4208p;
                }
                return null;
            default:
                if (Z.h(type) != A0.V.C()) {
                    return null;
                }
                return new J0(c0375o.A(Z.g(0, (ParameterizedType) type), annotationArr));
        }
    }
}
