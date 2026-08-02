package androidx.compose.material3.internal;

import Q0.InterfaceC3829a;
import Q0.InterfaceC3831c;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;
import r0.InterfaceC9132l;
import r0.InterfaceC9137q;

/* loaded from: classes8.dex */
public final class l implements InterfaceC9137q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f40274a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p<Object> f40275b;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", l = {277}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC3829a, InterfaceC3831c<Object>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f40276d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC9132l, kotlin.coroutines.d<? super Unit>, Object> f40278f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function2 function2, kotlin.coroutines.d dVar) {
            super(3, dVar);
            this.f40278f = function2;
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC3829a interfaceC3829a, InterfaceC3831c<Object> interfaceC3831c, kotlin.coroutines.d<? super Unit> dVar) {
            return l.this.new a(this.f40278f, dVar).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f40276d;
            if (i11 == 0) {
                Sc.s.b(obj);
                b bVar = l.this.f40274a;
                this.f40276d = 1;
                if (this.f40278f.invoke(bVar, this) == aVar) {
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

    public static final class b implements InterfaceC9132l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p<Object> f40279a;

        b(p<Object> pVar) {
            this.f40279a = pVar;
        }

        @Override // r0.InterfaceC9132l
        public final void a(float f7) {
            j jVar;
            p<Object> pVar = this.f40279a;
            jVar = ((p) pVar).f40298o;
            jVar.a(pVar.v(f7), 0.0f);
        }
    }

    l(p<Object> pVar) {
        this.f40275b = pVar;
        this.f40274a = new b(pVar);
    }

    @Override // r0.InterfaceC9137q
    public final Object a(@NotNull EnumC8372M enumC8372M, @NotNull Function2<? super InterfaceC9132l, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object i11 = this.f40275b.i(enumC8372M, new a(function2, null), (kotlin.coroutines.jvm.internal.c) dVar);
        return i11 == Wc.a.COROUTINE_SUSPENDED ? i11 : Unit.f71690a;
    }
}
