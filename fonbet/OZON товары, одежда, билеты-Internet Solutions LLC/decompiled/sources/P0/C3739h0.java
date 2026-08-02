package P0;

import Q0.InterfaceC3831c;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: P0.h0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3739h0 extends AbstractC7737t implements Function2<Z1.q, Z1.b, Pair<? extends InterfaceC3831c<EnumC3790y1>, ? extends EnumC3790y1>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3787x1 f21061b;

    /* renamed from: P0.h0$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21062a;

        static {
            int[] iArr = new int[EnumC3790y1.values().length];
            try {
                iArr[EnumC3790y1.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3790y1.PartiallyExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3790y1.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21062a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3739h0(C3787x1 c3787x1) {
        super(2);
        this.f21061b = c3787x1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Pair<? extends InterfaceC3831c<EnumC3790y1>, ? extends EnumC3790y1> invoke(Z1.q qVar, Z1.b bVar) {
        EnumC3790y1 enumC3790y1;
        long e11 = qVar.e();
        float j11 = Z1.b.j(bVar.p());
        C3787x1 c3787x1 = this.f21061b;
        InterfaceC3831c a11 = androidx.compose.material3.internal.e.a(new C3742i0(j11, e11, c3787x1));
        int i11 = a.f21062a[c3787x1.c().t().ordinal()];
        if (i11 == 1) {
            enumC3790y1 = EnumC3790y1.Hidden;
        } else {
            if (i11 != 2 && i11 != 3) {
                throw new Sc.o();
            }
            enumC3790y1 = EnumC3790y1.PartiallyExpanded;
            if (!a11.c(enumC3790y1)) {
                enumC3790y1 = EnumC3790y1.Expanded;
                if (!a11.c(enumC3790y1)) {
                    enumC3790y1 = EnumC3790y1.Hidden;
                }
            }
        }
        return new Pair<>(a11, enumC3790y1);
    }
}
