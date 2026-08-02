package androidx.compose.material;

import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend")
/* renamed from: androidx.compose.material.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5203a extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<xe.M, Float, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ xe.M f39971d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ float f39972e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C5210h<Object> f39973f;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1$1", f = "AnchoredDraggable.kt", l = {186}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.a$a, reason: collision with other inner class name */
    static final class C0737a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f39974d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C5210h<Object> f39975e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f39976f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0737a(C5210h<Object> c5210h, float f7, kotlin.coroutines.d<? super C0737a> dVar) {
            super(2, dVar);
            this.f39975e = c5210h;
            this.f39976f = f7;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new C0737a(this.f39975e, this.f39976f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0737a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f39974d;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f39974d = 1;
                if (this.f39975e.y(this.f39976f, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5203a(C5210h<Object> c5210h, kotlin.coroutines.d<? super C5203a> dVar) {
        super(3, dVar);
        this.f39973f = c5210h;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(xe.M m11, Float f7, kotlin.coroutines.d<? super Unit> dVar) {
        float floatValue = f7.floatValue();
        C5203a c5203a = new C5203a(this.f39973f, dVar);
        c5203a.f39971d = m11;
        c5203a.f39972e = floatValue;
        return c5203a.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        C10727i.c(this.f39971d, null, null, new C0737a(this.f39973f, this.f39972e, null), 3);
        return Unit.f71690a;
    }
}
