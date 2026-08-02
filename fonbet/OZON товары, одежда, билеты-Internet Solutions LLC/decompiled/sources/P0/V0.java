package P0;

import Kk.C3532b;
import k1.C7464j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import n1.C8408a;
import n1.InterfaceC8410c;
import u0.C9915y;

/* loaded from: classes8.dex */
final class V0 extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<C7464j> f20866b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C9915y f20867c;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20868a;

        static {
            int[] iArr = new int[Z1.s.values().length];
            try {
                iArr[Z1.s.Rtl.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f20868a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    V0(Function0 function0, C9915y c9915y) {
        super(1);
        this.f20866b = function0;
        this.f20867c = c9915y;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC8410c interfaceC8410c) {
        float f7;
        InterfaceC8410c interfaceC8410c2 = interfaceC8410c;
        long i11 = this.f20866b.invoke().i();
        float f11 = C7464j.f(i11);
        if (f11 > 0.0f) {
            f7 = W0.f20882a;
            float v12 = interfaceC8410c2.v1(f7);
            float v13 = interfaceC8410c2.v1(this.f20867c.b(interfaceC8410c2.getLayoutDirection())) - v12;
            float f12 = 2;
            float f13 = (v12 * f12) + f11 + v13;
            Z1.s layoutDirection = interfaceC8410c2.getLayoutDirection();
            int[] iArr = a.f20868a;
            float f14 = iArr[layoutDirection.ordinal()] == 1 ? C7464j.f(interfaceC8410c2.i()) - f13 : v13 < 0.0f ? 0.0f : v13;
            if (iArr[interfaceC8410c2.getLayoutDirection().ordinal()] == 1) {
                f13 = C7464j.f(interfaceC8410c2.i()) - (v13 >= 0.0f ? v13 : 0.0f);
            }
            float f15 = f13;
            float d11 = C7464j.d(i11);
            float f16 = (-d11) / f12;
            float f17 = d11 / f12;
            C8408a.b w02 = interfaceC8410c2.w0();
            long e11 = w02.e();
            w02.a().save();
            try {
                w02.f().b(f14, f16, f15, f17, 0);
                interfaceC8410c2.F0();
            } finally {
                C3532b.b(w02, e11);
            }
        } else {
            interfaceC8410c2.F0();
        }
        return Unit.f71690a;
    }
}
