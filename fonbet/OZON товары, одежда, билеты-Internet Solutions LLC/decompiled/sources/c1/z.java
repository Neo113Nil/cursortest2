package c1;

import c1.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class z extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f56309b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(y yVar) {
        super(0);
        this.f56309b = yVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        boolean z11;
        do {
            U0.b bVar = this.f56309b.f56290f;
            y yVar = this.f56309b;
            synchronized (bVar) {
                try {
                    z11 = yVar.f56287c;
                    if (!z11) {
                        yVar.f56287c = true;
                        try {
                            U0.b bVar2 = yVar.f56290f;
                            int m11 = bVar2.m();
                            if (m11 > 0) {
                                Object[] l11 = bVar2.l();
                                int i11 = 0;
                                do {
                                    ((y.a) l11[i11]).g();
                                    i11++;
                                } while (i11 < m11);
                            }
                            yVar.f56287c = false;
                        } finally {
                        }
                    }
                    Unit unit = Unit.f71690a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (y.b(this.f56309b));
        return Unit.f71690a;
    }
}
