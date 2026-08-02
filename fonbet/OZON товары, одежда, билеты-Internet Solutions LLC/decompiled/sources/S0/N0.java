package S0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class N0 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.collection.M<Object> f25290b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ G f25291c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N0(G g10, androidx.collection.M m11) {
        super(0);
        this.f25290b = m11;
        this.f25291c = g10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        androidx.collection.M<Object> m11 = this.f25290b;
        Object[] objArr = m11.f38663b;
        long[] jArr = m11.f38662a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            this.f25291c.q(objArr[(i11 << 3) + i13]);
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return Unit.f71690a;
    }
}
