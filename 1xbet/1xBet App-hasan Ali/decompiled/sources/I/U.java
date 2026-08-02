package I;

import P.InterfaceC0289e0;
import a.AbstractC0444a;
import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import i4.InterfaceC2015a;
import v.c0;
import v.o0;

/* loaded from: classes.dex */
public final class U extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2451l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ W0.c f2452m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f2453n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(W0.c cVar, InterfaceC0289e0 interfaceC0289e0, int i) {
        super(1);
        this.f2451l = i;
        this.f2452m = cVar;
        this.f2453n = interfaceC0289e0;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f2451l) {
            case 0:
                long j5 = ((W0.h) obj).f6008a;
                float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
                W0.c cVar = this.f2452m;
                this.f2453n.setValue(new W0.l(AbstractC0444a.b(cVar.K(intBitsToFloat), cVar.K(Float.intBitsToFloat((int) (j5 & 4294967295L))))));
                return W3.o.f6046a;
            default:
                b0.m mVar = b0.m.f7161k;
                A.B b3 = new A.B(18, (InterfaceC2015a) obj);
                U u5 = new U(this.f2452m, this.f2453n, 0);
                if (c0.a()) {
                    return c0.a() ? new MagnifierElement(b3, u5, Build.VERSION.SDK_INT == 28 ? o0.f20284b : o0.f20285c) : mVar;
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }
}
