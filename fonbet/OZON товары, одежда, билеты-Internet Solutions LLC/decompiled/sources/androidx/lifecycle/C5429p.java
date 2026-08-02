package androidx.lifecycle;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.M0;
import Sc.C4005g;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n.C8358c;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;
import xe.L0;
import xe.N0;

/* renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5429p {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.e(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", l = {107, 112, 113, 115}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.p$a */
    static final class a<T> extends kotlin.coroutines.jvm.internal.j implements Function2<ze.u<? super T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f43362d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f43363e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ P<T> f43364f;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.p$a$a, reason: collision with other inner class name */
        static final class C0797a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ P<T> f43365d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C5428o f43366e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0797a(P p11, C5428o c5428o, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f43365d = p11;
                this.f43366e = c5428o;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new C0797a(this.f43365d, this.f43366e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0797a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                this.f43365d.observeForever(this.f43366e);
                return Unit.f71690a;
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.p$a$b */
        static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ P<T> f43367d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ W<T> f43368e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(P<T> p11, W<T> w11, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f43367d = p11;
                this.f43368e = w11;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new b(this.f43367d, this.f43368e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                this.f43367d.observeForever(this.f43368e);
                return Unit.f71690a;
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$3", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.p$a$c */
        static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ P<T> f43369d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ W<T> f43370e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(P<T> p11, W<T> w11, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f43369d = p11;
                this.f43370e = w11;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new c(this.f43369d, this.f43370e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                this.f43369d.removeObserver(this.f43370e);
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(P<T> p11, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f43364f = p11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f43364f, dVar);
            aVar.f43363e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create((ze.u) obj, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
        
            if (xe.C10727i.f(r10, r8, r9) == r0) goto L33;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.W] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v3, types: [androidx.lifecycle.o, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v6 */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            W w11;
            W w12;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            ?? r12 = this.f43362d;
            P<T> p11 = this.f43364f;
            try {
            } catch (Throwable th2) {
                C10720e0 c10720e0 = C10720e0.f105451a;
                CoroutineContext plus = De.s.f6650a.x().plus(N0.f105411a);
                c cVar = new c(p11, r12, null);
                this.f43363e = th2;
                this.f43362d = 4;
                if (C10727i.f(plus, cVar, this) != aVar) {
                    throw th2;
                }
            }
            if (r12 == 0) {
                Sc.s.b(obj);
                final ze.u uVar = (ze.u) this.f43363e;
                ?? r13 = new W() { // from class: androidx.lifecycle.o
                    @Override // androidx.lifecycle.W
                    public final void onChanged(Object obj2) {
                        ze.u.this.b(obj2);
                    }
                };
                C10720e0 c10720e02 = C10720e0.f105451a;
                L0 x11 = De.s.f6650a.x();
                C0797a c0797a = new C0797a(p11, r13, null);
                this.f43363e = r13;
                this.f43362d = 1;
                w11 = r13;
            } else {
                if (r12 != 1) {
                    if (r12 == 2) {
                        W w13 = (W) this.f43363e;
                        Sc.s.b(obj);
                        w12 = w13;
                        this.f43363e = w12;
                        this.f43362d = 3;
                        r12 = w12;
                        if (xe.Y.a(this) == aVar) {
                            return aVar;
                        }
                        throw new C4005g();
                    }
                    if (r12 == 3) {
                        W w14 = (W) this.f43363e;
                        Sc.s.b(obj);
                        r12 = w14;
                        throw new C4005g();
                    }
                    if (r12 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th3 = (Throwable) this.f43363e;
                    Sc.s.b(obj);
                    throw th3;
                }
                W w15 = (W) this.f43363e;
                Sc.s.b(obj);
                w11 = w15;
            }
            C10720e0 c10720e03 = C10720e0.f105451a;
            L0 x12 = De.s.f6650a.x();
            b bVar = new b(p11, w11, null);
            this.f43363e = w11;
            this.f43362d = 2;
            w12 = w11;
            if (C10727i.f(x12, bVar, this) == aVar) {
                return aVar;
            }
            this.f43363e = w12;
            this.f43362d = 3;
            r12 = w12;
            if (xe.Y.a(this) == aVar) {
            }
            throw new C4005g();
        }
    }

    @NotNull
    public static final <T> InterfaceC2395h<T> a(@NotNull P<T> p11) {
        Intrinsics.checkNotNullParameter(p11, "<this>");
        return C2399j.d(C2399j.e(new a(p11, null)), -1, 2);
    }

    public static C5423j b(InterfaceC2395h interfaceC2395h) {
        kotlin.coroutines.g context = kotlin.coroutines.g.f71771a;
        Intrinsics.checkNotNullParameter(interfaceC2395h, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        C5430q block = new C5430q(interfaceC2395h, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        C5423j c5423j = new C5423j(context, block);
        if (interfaceC2395h instanceof M0) {
            if (C8358c.e().g()) {
                c5423j.setValue(((M0) interfaceC2395h).getValue());
                return c5423j;
            }
            c5423j.postValue(((M0) interfaceC2395h).getValue());
        }
        return c5423j;
    }
}
