package androidx.compose.material;

import J0.InterfaceC3268b;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;
import r0.InterfaceC9132l;
import r0.InterfaceC9137q;

/* renamed from: androidx.compose.material.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5213k implements InterfaceC9137q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f40072a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5210h<Object> f40073b;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", l = {292}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.k$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC3268b, J0.M<Object>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f40074d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC9132l, kotlin.coroutines.d<? super Unit>, Object> f40076f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function2 function2, kotlin.coroutines.d dVar) {
            super(3, dVar);
            this.f40076f = function2;
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC3268b interfaceC3268b, J0.M<Object> m11, kotlin.coroutines.d<? super Unit> dVar) {
            return C5213k.this.new a(this.f40076f, dVar).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f40074d;
            if (i11 == 0) {
                Sc.s.b(obj);
                b bVar = C5213k.this.f40072a;
                this.f40074d = 1;
                if (this.f40076f.invoke(bVar, this) == aVar) {
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

    /* renamed from: androidx.compose.material.k$b */
    public static final class b implements InterfaceC9132l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5210h<Object> f40077a;

        b(C5210h<Object> c5210h) {
            this.f40077a = c5210h;
        }

        @Override // r0.InterfaceC9132l
        public final void a(float f7) {
            C5210h<Object> c5210h = this.f40077a;
            ((C5210h) c5210h).f40056o.a(c5210h.v(f7), 0.0f);
        }
    }

    C5213k(C5210h<Object> c5210h) {
        this.f40073b = c5210h;
        this.f40072a = new b(c5210h);
    }

    @Override // r0.InterfaceC9137q
    public final Object a(@NotNull EnumC8372M enumC8372M, @NotNull Function2<? super InterfaceC9132l, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object i11 = this.f40073b.i(enumC8372M, new a(function2, null), (kotlin.coroutines.jvm.internal.c) dVar);
        return i11 == Wc.a.COROUTINE_SUSPENDED ? i11 : Unit.f71690a;
    }
}
