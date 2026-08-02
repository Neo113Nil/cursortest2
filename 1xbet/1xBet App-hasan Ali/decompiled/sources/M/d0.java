package M;

import P.C0305m0;
import h0.C1991e;
import k0.InterfaceC2025e;
import u.C2435F;

/* loaded from: classes.dex */
public final class d0 extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3307l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f3308m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2435F f3309n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f3310o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C2435F f3311p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f3312q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C2435F f3313r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C2435F f3314s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(int i, float f, C2435F c2435f, long j5, C2435F c2435f2, long j6, C2435F c2435f3, C2435F c2435f4) {
        super(1);
        this.f3307l = i;
        this.f3308m = f;
        this.f3309n = c2435f;
        this.f3310o = j5;
        this.f3311p = c2435f2;
        this.f3312q = j6;
        this.f3313r = c2435f3;
        this.f3314s = c2435f4;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        InterfaceC2025e interfaceC2025e = (InterfaceC2025e) obj;
        float b3 = C1991e.b(interfaceC2025e.d());
        int i = this.f3307l;
        float f = this.f3308m;
        if (i != 0 && C1991e.b(interfaceC2025e.d()) <= C1991e.d(interfaceC2025e.d())) {
            f += interfaceC2025e.i0(b3);
        }
        float i02 = f / interfaceC2025e.i0(C1991e.d(interfaceC2025e.d()));
        C2435F c2435f = this.f3309n;
        float floatValue = ((Number) c2435f.f19664n.getValue()).floatValue();
        float f5 = 1.0f - i02;
        C0305m0 c0305m0 = c2435f.f19664n;
        if (floatValue < f5) {
            e0.c(interfaceC2025e, ((Number) c0305m0.getValue()).floatValue() > 0.0f ? ((Number) c0305m0.getValue()).floatValue() + i02 : 0.0f, 1.0f, this.f3310o, b3, this.f3307l);
        }
        float floatValue2 = ((Number) c0305m0.getValue()).floatValue();
        C2435F c2435f2 = this.f3311p;
        float floatValue3 = floatValue2 - ((Number) c2435f2.f19664n.getValue()).floatValue();
        C0305m0 c0305m02 = c2435f2.f19664n;
        if (floatValue3 > 0.0f) {
            e0.c(interfaceC2025e, ((Number) c0305m0.getValue()).floatValue(), ((Number) c0305m02.getValue()).floatValue(), this.f3312q, b3, this.f3307l);
        }
        float floatValue4 = ((Number) c0305m02.getValue()).floatValue();
        C2435F c2435f3 = this.f3313r;
        if (floatValue4 > i02) {
            e0.c(interfaceC2025e, ((Number) c2435f3.f19664n.getValue()).floatValue() > 0.0f ? ((Number) c2435f3.f19664n.getValue()).floatValue() + i02 : 0.0f, ((Number) c0305m02.getValue()).floatValue() < 1.0f ? ((Number) c0305m02.getValue()).floatValue() - i02 : 1.0f, this.f3310o, b3, this.f3307l);
        }
        float floatValue5 = ((Number) c2435f3.f19664n.getValue()).floatValue();
        C2435F c2435f4 = this.f3314s;
        float floatValue6 = floatValue5 - ((Number) c2435f4.f19664n.getValue()).floatValue();
        C0305m0 c0305m03 = c2435f4.f19664n;
        if (floatValue6 > 0.0f) {
            e0.c(interfaceC2025e, ((Number) c2435f3.f19664n.getValue()).floatValue(), ((Number) c0305m03.getValue()).floatValue(), this.f3312q, b3, this.f3307l);
        }
        if (((Number) c0305m03.getValue()).floatValue() > i02) {
            e0.c(interfaceC2025e, 0.0f, ((Number) c0305m03.getValue()).floatValue() < 1.0f ? ((Number) c0305m03.getValue()).floatValue() - i02 : 1.0f, this.f3310o, b3, this.f3307l);
        }
        return W3.o.f6046a;
    }
}
