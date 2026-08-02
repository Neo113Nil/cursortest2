package N0;

import B1.U;
import B1.V;
import B1.W;
import B1.Y;
import B1.m0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class h implements V {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f18304a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Z1.s f18305b;

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f18306b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
            return Unit.f71690a;
        }
    }

    h(s sVar, Z1.s sVar2) {
        this.f18304a = sVar;
        this.f18305b = sVar2;
    }

    @Override // B1.V
    @NotNull
    /* renamed from: measure-3p2s80s */
    public final W mo2measure3p2s80s(@NotNull Y y11, @NotNull List<? extends U> list, long j11) {
        W z02;
        this.f18304a.g(this.f18305b);
        z02 = y11.z0(0, 0, kotlin.collections.U.c(), a.f18306b);
        return z02;
    }
}
