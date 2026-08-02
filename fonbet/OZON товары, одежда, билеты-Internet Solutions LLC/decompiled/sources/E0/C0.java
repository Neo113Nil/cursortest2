package E0;

import k1.C7460f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import z0.InterfaceC10969b;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$updateScrollState$1", f = "TextFieldCoreModifier.kt", l = {448, 451}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class C0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f6949d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ D0 f6950e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ float f6951f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C7460f f6952g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0(D0 d02, float f7, C7460f c7460f, kotlin.coroutines.d<? super C0> dVar) {
        super(2, dVar);
        this.f6950e = d02;
        this.f6951f = f7;
        this.f6952g = c7460f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C0(this.f6950e, this.f6951f, this.f6952g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        if (r8.a(r7.f6952g, r7) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r0.C9105F.b(r8, r1, r7) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        n0.d0 d0Var;
        Z0 z02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f6949d;
        D0 d02 = this.f6950e;
        if (i11 == 0) {
            Sc.s.b(obj);
            d0Var = d02.f6964j;
            int i12 = C2958y0.f7332b;
            float f7 = this.f6951f;
            if (!Float.isNaN(f7) && !Float.isInfinite(f7)) {
                f7 = (float) (f7 > 0.0f ? Math.ceil(f7) : Math.floor(f7));
            }
            this.f6949d = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return Unit.f71690a;
            }
            Sc.s.b(obj);
        }
        z02 = d02.f6959e;
        InterfaceC10969b c11 = z02.c();
        this.f6949d = 2;
    }
}
