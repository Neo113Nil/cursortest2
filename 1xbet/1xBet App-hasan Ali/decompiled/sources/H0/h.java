package H0;

import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.m f2075a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.internal.m f2076b;

    /* JADX WARN: Multi-variable type inference failed */
    public h(InterfaceC2015a interfaceC2015a, InterfaceC2015a interfaceC2015a2) {
        this.f2075a = (kotlin.jvm.internal.m) interfaceC2015a;
        this.f2076b = (kotlin.jvm.internal.m) interfaceC2015a2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i4.a, kotlin.jvm.internal.m] */
    public final InterfaceC2015a a() {
        return this.f2076b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [i4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r1v6, types: [i4.a, kotlin.jvm.internal.m] */
    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f2075a.invoke()).floatValue() + ", maxValue=" + ((Number) this.f2076b.invoke()).floatValue() + ", reverseScrolling=false)";
    }
}
