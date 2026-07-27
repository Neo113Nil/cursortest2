package P4;

/* renamed from: P4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0126e extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final C0126e f2366c = new C0126e(C0127f.f2368a);

    @Override // P4.AbstractC0122a
    public final int g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.i.e(zArr, "<this>");
        return zArr.length;
    }

    @Override // P4.AbstractC0134m, P4.AbstractC0122a
    public final void i(O4.a aVar, int i2, Object obj, boolean z) {
        C0125d builder = (C0125d) obj;
        kotlin.jvm.internal.i.e(builder, "builder");
        boolean k3 = aVar.k(this.f2335b, i2);
        builder.b(builder.d() + 1);
        boolean[] zArr = builder.f2362a;
        int i3 = builder.f2363b;
        builder.f2363b = i3 + 1;
        zArr[i3] = k3;
    }

    @Override // P4.AbstractC0122a
    public final Object j(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.i.e(zArr, "<this>");
        C0125d c0125d = new C0125d();
        c0125d.f2362a = zArr;
        c0125d.f2363b = zArr.length;
        c0125d.b(10);
        return c0125d;
    }

    @Override // P4.M
    public final Object m() {
        return new boolean[0];
    }

    @Override // P4.M
    public final void n(R4.s encoder, Object obj, int i2) {
        boolean[] content = (boolean[]) obj;
        kotlin.jvm.internal.i.e(encoder, "encoder");
        kotlin.jvm.internal.i.e(content, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            boolean z = content[i3];
            L descriptor = this.f2335b;
            kotlin.jvm.internal.i.e(descriptor, "descriptor");
            encoder.f(descriptor, i3);
            encoder.b(z);
        }
    }
}
