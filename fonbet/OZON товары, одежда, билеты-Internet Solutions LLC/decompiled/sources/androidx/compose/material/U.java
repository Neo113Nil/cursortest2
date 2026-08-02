package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.SwitchKt$Switch$2$1", f = "Switch.kt", l = {136}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class U extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f39957d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f39958e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C5210h<Boolean> f39959f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U(boolean z11, C5210h<Boolean> c5210h, kotlin.coroutines.d<? super U> dVar) {
        super(2, dVar);
        this.f39958e = z11;
        this.f39959f = c5210h;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new U(this.f39958e, this.f39959f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((U) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f39957d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C5210h<Boolean> c5210h = this.f39959f;
            boolean booleanValue = c5210h.p().booleanValue();
            boolean z11 = this.f39958e;
            if (z11 != booleanValue) {
                Boolean valueOf = Boolean.valueOf(z11);
                this.f39957d = 1;
                if (C5204b.c(c5210h, valueOf, c5210h.r(), this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
