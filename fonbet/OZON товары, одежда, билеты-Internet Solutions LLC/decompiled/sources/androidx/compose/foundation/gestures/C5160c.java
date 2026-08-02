package androidx.compose.foundation.gestures;

import fd.InterfaceC6512o;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import r0.InterfaceC9122b;
import r0.InterfaceC9133m;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4", f = "AnchoredDraggable.kt", l = {1022}, m = "invokeSuspend")
/* renamed from: androidx.compose.foundation.gestures.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5160c extends kotlin.coroutines.jvm.internal.j implements InterfaceC6512o<InterfaceC9122b, InterfaceC9133m<Object>, Object, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f39115d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ InterfaceC9122b f39116e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ InterfaceC9133m f39117f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f39118g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C5167j<Object> f39119h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5160c(C5167j<Object> c5167j, kotlin.coroutines.d<? super C5160c> dVar) {
        super(4, dVar);
        this.f39119h = c5167j;
    }

    @Override // fd.InterfaceC6512o
    public final Object invoke(InterfaceC9122b interfaceC9122b, InterfaceC9133m<Object> interfaceC9133m, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
        C5160c c5160c = new C5160c(this.f39119h, dVar);
        c5160c.f39116e = interfaceC9122b;
        c5160c.f39117f = interfaceC9133m;
        c5160c.f39118g = obj;
        return c5160c.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f39115d;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC9122b interfaceC9122b = this.f39116e;
            InterfaceC9133m interfaceC9133m = this.f39117f;
            Object obj2 = this.f39118g;
            C5167j<Object> c5167j = this.f39119h;
            float n11 = c5167j.n();
            this.f39116e = null;
            this.f39117f = null;
            this.f39115d = 1;
            if (C5158a.b(c5167j, n11, interfaceC9122b, interfaceC9133m, obj2, this) == aVar) {
                return aVar;
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
