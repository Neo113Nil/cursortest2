package Lb;

import Pb.C3820a;
import Pe.w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final /* synthetic */ class c implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16674a;

    public /* synthetic */ c(int i11) {
        this.f16674a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16674a) {
            case 0:
                byte[][] packed = f.a();
                Intrinsics.checkNotNullParameter(packed, "packed");
                b bVar = new b(0);
                for (int i11 = 0; i11 < 32; i11++) {
                    for (int i12 = 0; i12 < 8; i12++) {
                        C3820a.g(bVar.a(i11).a(i12), packed[(i11 * 8) + i12]);
                    }
                }
                return bVar;
            default:
                return w.f22310a.b();
        }
    }
}
