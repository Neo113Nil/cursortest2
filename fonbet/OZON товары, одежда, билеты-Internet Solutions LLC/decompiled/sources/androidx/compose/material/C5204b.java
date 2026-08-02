package androidx.compose.material;

import J0.InterfaceC3268b;
import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6512o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import m0.B0;
import m0.InterfaceC8002m;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.material.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5204b {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {706}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.b$a */
    static final class a<T> extends kotlin.coroutines.jvm.internal.j implements InterfaceC6512o<InterfaceC3268b, J0.M<T>, T, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f39981d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ InterfaceC3268b f39982e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ J0.M f39983f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f39984g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C5210h<T> f39985h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f39986i;

        /* renamed from: androidx.compose.material.b$a$a, reason: collision with other inner class name */
        static final class C0738a extends AbstractC7737t implements Function2<Float, Float, Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3268b f39987b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.J f39988c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0738a(InterfaceC3268b interfaceC3268b, kotlin.jvm.internal.J j11) {
                super(2);
                this.f39987b = interfaceC3268b;
                this.f39988c = j11;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(Float f7, Float f11) {
                float floatValue = f7.floatValue();
                this.f39987b.a(floatValue, f11.floatValue());
                this.f39988c.f71784a = floatValue;
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C5210h<T> c5210h, float f7, kotlin.coroutines.d<? super a> dVar) {
            super(4, dVar);
            this.f39985h = c5210h;
            this.f39986i = f7;
        }

        @Override // fd.InterfaceC6512o
        public final Object invoke(InterfaceC3268b interfaceC3268b, Object obj, Object obj2, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar = new a(this.f39985h, this.f39986i, dVar);
            aVar.f39982e = interfaceC3268b;
            aVar.f39983f = (J0.M) obj;
            aVar.f39984g = obj2;
            return aVar.invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f39981d;
            if (i11 == 0) {
                Sc.s.b(obj);
                InterfaceC3268b interfaceC3268b = this.f39982e;
                float e11 = this.f39983f.e(this.f39984g);
                if (!Float.isNaN(e11)) {
                    kotlin.jvm.internal.J j11 = new kotlin.jvm.internal.J();
                    C5210h<T> c5210h = this.f39985h;
                    float s11 = Float.isNaN(c5210h.s()) ? 0.0f : c5210h.s();
                    j11.f71784a = s11;
                    InterfaceC8002m<Float> m11 = c5210h.m();
                    C0738a c0738a = new C0738a(interfaceC3268b, j11);
                    this.f39982e = null;
                    this.f39983f = null;
                    this.f39981d = 1;
                    if (B0.b(s11, e11, this.f39986i, m11, c0738a, this) == aVar) {
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

    @NotNull
    public static final <T> J0.M<T> a(@NotNull Function1<? super J0.N<T>, Unit> function1) {
        J0.N n11 = new J0.N();
        function1.invoke(n11);
        return new C5223v(n11.b());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(Function0 function0, Function2 function2, kotlin.coroutines.jvm.internal.c cVar) {
        C5205c c5205c;
        int i11;
        if (cVar instanceof C5205c) {
            c5205c = (C5205c) cVar;
            int i12 = c5205c.f39991e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c5205c.f39991e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c5205c.f39990d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c5205c.f39991e;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    C5206d c5206d = new C5206d(function0, function2, null);
                    c5205c.f39991e = 1;
                    if (xe.N.d(c5206d, c5205c) == aVar) {
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
        c5205c = new C5205c(cVar);
        Object obj2 = c5205c.f39990d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c5205c.f39991e;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }

    public static final <T> Object c(@NotNull C5210h<T> c5210h, T t2, float f7, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object h11 = c5210h.h(t2, EnumC8372M.Default, new a(c5210h, f7, null), dVar);
        return h11 == Wc.a.COROUTINE_SUSPENDED ? h11 : Unit.f71690a;
    }
}
