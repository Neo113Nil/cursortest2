package C0;

import B1.U;
import B1.W;
import B1.Y;
import B1.m0;
import D1.E;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class b extends C0.a implements E {

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f4293b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f4294c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f4295d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, int i12, m0 m0Var) {
            super(1);
            this.f4293b = m0Var;
            this.f4294c = i11;
            this.f4295d = i12;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            aVar.d(this.f4293b, -this.f4294c, -this.f4295d, 0.0f);
            return Unit.f71690a;
        }
    }

    public b() {
        throw null;
    }

    @Override // D1.E
    @NotNull
    public final W D(@NotNull Y y11, @NotNull U u11, long j11) {
        W z02;
        int Y02 = y11.Y0(androidx.compose.foundation.text.handwriting.a.b());
        int Y03 = y11.Y0(androidx.compose.foundation.text.handwriting.a.a());
        int i11 = Y03 * 2;
        int i12 = Y02 * 2;
        m0 a02 = u11.a0(Z1.c.k(i11, i12, j11));
        z02 = y11.z0(a02.u0() - i11, a02.l0() - i12, kotlin.collections.U.c(), new a(Y03, Y02, a02));
        return z02;
    }
}
