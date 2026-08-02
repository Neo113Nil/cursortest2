package O4;

import L4.C0226i;
import L4.InterfaceC0228k;
import java.io.IOException;

/* renamed from: O4.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0277x extends L4.q {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4238l = 1;

    /* renamed from: m, reason: collision with root package name */
    public Object f4239m;

    public /* synthetic */ C0277x(L4.I i) {
        super(i);
    }

    @Override // L4.q, L4.I
    public final long e(C0226i c0226i, long j5) {
        switch (this.f4238l) {
            case 0:
                try {
                    return super.e(c0226i, j5);
                } catch (IOException e3) {
                    ((C0278y) this.f4239m).f4242n = e3;
                    throw e3;
                }
            default:
                try {
                    return super.e(c0226i, j5);
                } catch (Exception e5) {
                    this.f4239m = e5;
                    throw e5;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0277x(C0278y c0278y, InterfaceC0228k interfaceC0228k) {
        super(interfaceC0228k);
        this.f4239m = c0278y;
    }
}
