package P4;

/* renamed from: P4.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0140t extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final C0140t f2399c = new C0140t(C0141u.f2400a);

    @Override // P4.AbstractC0122a
    public final int g(Object obj) {
        float[] fArr = (float[]) obj;
        kotlin.jvm.internal.i.e(fArr, "<this>");
        return fArr.length;
    }

    @Override // P4.AbstractC0134m, P4.AbstractC0122a
    public final void i(O4.a aVar, int i2, Object obj, boolean z) {
        C0139s builder = (C0139s) obj;
        kotlin.jvm.internal.i.e(builder, "builder");
        float w3 = aVar.w(this.f2335b, i2);
        builder.b(builder.d() + 1);
        float[] fArr = builder.f2397a;
        int i3 = builder.f2398b;
        builder.f2398b = i3 + 1;
        fArr[i3] = w3;
    }

    @Override // P4.AbstractC0122a
    public final Object j(Object obj) {
        float[] fArr = (float[]) obj;
        kotlin.jvm.internal.i.e(fArr, "<this>");
        C0139s c0139s = new C0139s();
        c0139s.f2397a = fArr;
        c0139s.f2398b = fArr.length;
        c0139s.b(10);
        return c0139s;
    }

    @Override // P4.M
    public final Object m() {
        return new float[0];
    }

    @Override // P4.M
    public final void n(R4.s encoder, Object obj, int i2) {
        float[] content = (float[]) obj;
        kotlin.jvm.internal.i.e(encoder, "encoder");
        kotlin.jvm.internal.i.e(content, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            float f3 = content[i3];
            L descriptor = this.f2335b;
            kotlin.jvm.internal.i.e(descriptor, "descriptor");
            encoder.f(descriptor, i3);
            encoder.g(f3);
        }
    }
}
