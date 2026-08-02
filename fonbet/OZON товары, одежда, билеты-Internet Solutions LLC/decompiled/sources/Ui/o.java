package Ui;

import F4.F;
import Si.InterfaceC4010a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class o extends AbstractC7737t implements Function1<F<InterfaceC4010a>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4069c f27812b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27813a;

        static {
            int[] iArr = new int[u.values().length];
            try {
                iArr[u.NEED_SELECTION_REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.READY_TO_RESTORE_SCROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f27813a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(C4069c c4069c) {
        super(1);
        this.f27812b = c4069c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(F<InterfaceC4010a> f7) {
        C4069c c4069c = this.f27812b;
        c4069c.b0().g(f7, new n(c4069c));
        return Unit.f71690a;
    }
}
