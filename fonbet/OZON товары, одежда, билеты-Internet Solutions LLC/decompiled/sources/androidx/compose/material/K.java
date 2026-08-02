package androidx.compose.material;

import J0.C3326o1;
import J0.EnumC3337r1;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class K extends AbstractC7737t implements Function2<Z1.q, Z1.b, Pair<? extends J0.M<EnumC3337r1>, ? extends EnumC3337r1>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3326o1 f39920b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39921a;

        static {
            int[] iArr = new int[EnumC3337r1.values().length];
            try {
                iArr[EnumC3337r1.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3337r1.HalfExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3337r1.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f39921a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    K(C3326o1 c3326o1) {
        super(2);
        this.f39920b = c3326o1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Pair<? extends J0.M<EnumC3337r1>, ? extends EnumC3337r1> invoke(Z1.q qVar, Z1.b bVar) {
        long e11 = qVar.e();
        float j11 = Z1.b.j(bVar.p());
        C3326o1 c3326o1 = this.f39920b;
        J0.M a11 = C5204b.a(new L(j11, c3326o1, e11));
        boolean z11 = c3326o1.c().l().getSize() > 0;
        EnumC3337r1 d11 = c3326o1.d();
        if (z11 || !((C5223v) a11).c(d11)) {
            int i11 = a.f39921a[c3326o1.f().ordinal()];
            if (i11 == 1) {
                d11 = EnumC3337r1.Hidden;
            } else {
                if (i11 != 2 && i11 != 3) {
                    throw new Sc.o();
                }
                EnumC3337r1 enumC3337r1 = EnumC3337r1.HalfExpanded;
                C5223v c5223v = (C5223v) a11;
                if (!c5223v.c(enumC3337r1)) {
                    enumC3337r1 = EnumC3337r1.Expanded;
                    if (!c5223v.c(enumC3337r1)) {
                        enumC3337r1 = EnumC3337r1.Hidden;
                    }
                }
                d11 = enumC3337r1;
            }
        }
        return new Pair<>(a11, d11);
    }
}
