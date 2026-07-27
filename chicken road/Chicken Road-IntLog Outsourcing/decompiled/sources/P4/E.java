package P4;

/* loaded from: classes.dex */
public final class E extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final E f2324c = new E(F.f2325a);

    @Override // P4.AbstractC0122a
    public final int g(Object obj) {
        long[] jArr = (long[]) obj;
        kotlin.jvm.internal.i.e(jArr, "<this>");
        return jArr.length;
    }

    @Override // P4.AbstractC0134m, P4.AbstractC0122a
    public final void i(O4.a aVar, int i2, Object obj, boolean z) {
        D builder = (D) obj;
        kotlin.jvm.internal.i.e(builder, "builder");
        long p5 = aVar.p(this.f2335b, i2);
        builder.b(builder.d() + 1);
        long[] jArr = builder.f2322a;
        int i3 = builder.f2323b;
        builder.f2323b = i3 + 1;
        jArr[i3] = p5;
    }

    @Override // P4.AbstractC0122a
    public final Object j(Object obj) {
        long[] jArr = (long[]) obj;
        kotlin.jvm.internal.i.e(jArr, "<this>");
        D d6 = new D();
        d6.f2322a = jArr;
        d6.f2323b = jArr.length;
        d6.b(10);
        return d6;
    }

    @Override // P4.M
    public final Object m() {
        return new long[0];
    }

    @Override // P4.M
    public final void n(R4.s encoder, Object obj, int i2) {
        long[] content = (long[]) obj;
        kotlin.jvm.internal.i.e(encoder, "encoder");
        kotlin.jvm.internal.i.e(content, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = content[i3];
            L descriptor = this.f2335b;
            kotlin.jvm.internal.i.e(descriptor, "descriptor");
            encoder.f(descriptor, i3);
            encoder.k(j2);
        }
    }
}
