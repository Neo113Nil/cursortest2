package P4;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class M extends AbstractC0134m {

    /* renamed from: b, reason: collision with root package name */
    public final L f2335b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(M4.a primitiveSerializer) {
        super(primitiveSerializer);
        kotlin.jvm.internal.i.e(primitiveSerializer, "primitiveSerializer");
        this.f2335b = new L(primitiveSerializer.c());
    }

    @Override // P4.AbstractC0122a, M4.a
    public final Object a(O4.b decoder) {
        kotlin.jvm.internal.i.e(decoder, "decoder");
        return h(decoder);
    }

    @Override // P4.AbstractC0134m, M4.a
    public final void b(R4.s sVar, Object obj) {
        int g6 = g(obj);
        L descriptor = this.f2335b;
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        R4.s a6 = sVar.a(descriptor);
        n(a6, obj, g6);
        a6.p(descriptor);
    }

    @Override // M4.a
    public final N4.e c() {
        return this.f2335b;
    }

    @Override // P4.AbstractC0122a
    public final Object d() {
        return (K) j(m());
    }

    @Override // P4.AbstractC0122a
    public final int e(Object obj) {
        K k3 = (K) obj;
        kotlin.jvm.internal.i.e(k3, "<this>");
        return k3.d();
    }

    @Override // P4.AbstractC0122a
    public final Iterator f(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // P4.AbstractC0122a
    public final Object k(Object obj) {
        K k3 = (K) obj;
        kotlin.jvm.internal.i.e(k3, "<this>");
        return k3.a();
    }

    @Override // P4.AbstractC0134m
    public final void l(Object obj, int i2, Object obj2) {
        kotlin.jvm.internal.i.e((K) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object m();

    public abstract void n(R4.s sVar, Object obj, int i2);
}
