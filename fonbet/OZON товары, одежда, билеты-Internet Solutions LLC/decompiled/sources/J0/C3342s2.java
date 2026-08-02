package J0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m0.C7980b;
import m0.C8008p;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.SnackbarHostKt$animatedOpacity$2$1", f = "SnackbarHost.kt", l = {357}, m = "invokeSuspend")
/* renamed from: J0.s2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3342s2 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f13393d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7980b<Float, C8008p> f13394e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f13395f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ m0.T0 f13396g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f13397h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3342s2(C7980b c7980b, boolean z11, m0.T0 t02, Function0 function0, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f13394e = c7980b;
        this.f13395f = z11;
        this.f13396g = t02;
        this.f13397h = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C3342s2(this.f13394e, this.f13395f, this.f13396g, this.f13397h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C3342s2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        C3342s2 c3342s2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f13393d;
        if (i11 == 0) {
            Sc.s.b(obj);
            Float f7 = new Float(this.f13395f ? 1.0f : 0.0f);
            this.f13393d = 1;
            c3342s2 = this;
            if (C7980b.f(this.f13394e, f7, this.f13396g, null, c3342s2, 12) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            c3342s2 = this;
        }
        c3342s2.f13397h.invoke();
        return Unit.f71690a;
    }
}
