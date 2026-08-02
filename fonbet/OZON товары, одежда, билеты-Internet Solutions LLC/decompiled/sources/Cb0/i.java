package Cb0;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Sc.InterfaceC4008j;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.M;

/* loaded from: classes7.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C0 f4642a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final B0<g> f4643b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f4644c;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.clientCookies.NetworkCookieEventsImpl$emit$1", f = "NetworkCookieEventsImpl.kt", l = {14}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f4645d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ g f4647f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g gVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f4647f = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return i.this.new a(this.f4647f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f4645d;
            if (i11 == 0) {
                s.b(obj);
                C0 c02 = i.this.f4642a;
                this.f4645d = 1;
                if (c02.emit(this.f4647f, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function0<M> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f4648b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final M invoke() {
            return td0.f.a();
        }
    }

    public i() {
        C0 b11 = E0.b(0, 0, null, 7);
        this.f4642a = b11;
        this.f4643b = C2399j.a(b11);
        this.f4644c = Sc.k.b(b.f4648b);
    }

    public final void b(@NotNull g event) {
        Intrinsics.checkNotNullParameter(event, "event");
        C10727i.c((M) this.f4644c.getValue(), null, null, new a(event, null), 3);
    }

    @Override // Cb0.h
    @NotNull
    public final B0<g> getEvents() {
        return this.f4643b;
    }
}
