package P4;

/* renamed from: P4.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0145y extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final C0145y f2415c = new C0145y(C0146z.f2416a);

    @Override // P4.AbstractC0122a
    public final int g(Object obj) {
        int[] iArr = (int[]) obj;
        kotlin.jvm.internal.i.e(iArr, "<this>");
        return iArr.length;
    }

    @Override // P4.AbstractC0134m, P4.AbstractC0122a
    public final void i(O4.a aVar, int i2, Object obj, boolean z) {
        C0144x builder = (C0144x) obj;
        kotlin.jvm.internal.i.e(builder, "builder");
        int i3 = aVar.i(this.f2335b, i2);
        builder.b(builder.d() + 1);
        int[] iArr = builder.f2413a;
        int i6 = builder.f2414b;
        builder.f2414b = i6 + 1;
        iArr[i6] = i3;
    }

    @Override // P4.AbstractC0122a
    public final Object j(Object obj) {
        int[] iArr = (int[]) obj;
        kotlin.jvm.internal.i.e(iArr, "<this>");
        C0144x c0144x = new C0144x();
        c0144x.f2413a = iArr;
        c0144x.f2414b = iArr.length;
        c0144x.b(10);
        return c0144x;
    }

    @Override // P4.M
    public final Object m() {
        return new int[0];
    }

    @Override // P4.M
    public final void n(R4.s encoder, Object obj, int i2) {
        int[] content = (int[]) obj;
        kotlin.jvm.internal.i.e(encoder, "encoder");
        kotlin.jvm.internal.i.e(content, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            int i6 = content[i3];
            L descriptor = this.f2335b;
            kotlin.jvm.internal.i.e(descriptor, "descriptor");
            encoder.f(descriptor, i3);
            encoder.j(i6);
        }
    }
}
