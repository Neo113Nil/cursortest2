package androidx.lifecycle;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import androidx.lifecycle.AbstractC5434v;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5427n {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.e(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", l = {91}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.n$a */
    static final class a<T> extends kotlin.coroutines.jvm.internal.j implements Function2<ze.u<? super T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f43345d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f43346e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC5434v f43347f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AbstractC5434v.b f43348g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h<T> f43349h;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", l = {92}, m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.n$a$a, reason: collision with other inner class name */
        static final class C0795a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f43350d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h<T> f43351e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ze.u<T> f43352f;

            /* renamed from: androidx.lifecycle.n$a$a$a, reason: collision with other inner class name */
            static final class C0796a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ ze.u<T> f43353a;

                /* JADX WARN: Multi-variable type inference failed */
                C0796a(ze.u<? super T> uVar) {
                    this.f43353a = uVar;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
                    Object n11 = this.f43353a.n(t2, dVar);
                    return n11 == Wc.a.COROUTINE_SUSPENDED ? n11 : Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0795a(InterfaceC2395h<? extends T> interfaceC2395h, ze.u<? super T> uVar, kotlin.coroutines.d<? super C0795a> dVar) {
                super(2, dVar);
                this.f43351e = interfaceC2395h;
                this.f43352f = uVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new C0795a(this.f43351e, this.f43352f, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0795a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f43350d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C0796a c0796a = new C0796a(this.f43352f);
                    this.f43350d = 1;
                    if (this.f43351e.collect(c0796a, this) == aVar) {
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
        /* JADX WARN: Multi-variable type inference failed */
        a(AbstractC5434v abstractC5434v, AbstractC5434v.b bVar, InterfaceC2395h<? extends T> interfaceC2395h, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f43347f = abstractC5434v;
            this.f43348g = bVar;
            this.f43349h = interfaceC2395h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f43347f, this.f43348g, this.f43349h, dVar);
            aVar.f43346e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create((ze.u) obj, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            ze.u uVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f43345d;
            if (i11 == 0) {
                Sc.s.b(obj);
                ze.u uVar2 = (ze.u) this.f43346e;
                C0795a c0795a = new C0795a(this.f43349h, uVar2, null);
                this.f43346e = uVar2;
                this.f43345d = 1;
                if (C5412d0.a(this.f43347f, this.f43348g, c0795a, this) == aVar) {
                    return aVar;
                }
                uVar = uVar2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uVar = (ze.u) this.f43346e;
                Sc.s.b(obj);
            }
            uVar.l(null);
            return Unit.f71690a;
        }
    }

    @NotNull
    public static final <T> InterfaceC2395h<T> a(@NotNull InterfaceC2395h<? extends T> interfaceC2395h, @NotNull AbstractC5434v lifecycle, @NotNull AbstractC5434v.b minActiveState) {
        Intrinsics.checkNotNullParameter(interfaceC2395h, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(minActiveState, "minActiveState");
        return C2399j.e(new a(lifecycle, minActiveState, interfaceC2395h, null));
    }
}
