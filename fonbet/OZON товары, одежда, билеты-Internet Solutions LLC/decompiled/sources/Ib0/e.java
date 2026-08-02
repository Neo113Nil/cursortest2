package Ib0;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import De.C2862e;
import Sc.s;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.M;

/* loaded from: classes7.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C0 f12133a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C0 f12134b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C0 f12135c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C0 f12136d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2862e f12137e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final B0<i> f12138f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final B0<h> f12139g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final B0<Object> f12140h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final B0<Ib0.b> f12141i;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.core.result.OzonIdAuthEventsImpl$emit$1", f = "OzonIdAuthEventsImpl.kt", l = {22}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f12142d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ i f12144f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f12144f = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e.this.new a(this.f12144f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f12142d;
            if (i11 == 0) {
                s.b(obj);
                C0 c02 = e.this.f12133a;
                this.f12142d = 1;
                if (c02.emit(this.f12144f, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.core.result.OzonIdAuthEventsImpl$emit$2", f = "OzonIdAuthEventsImpl.kt", l = {TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f12145d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ h f12147f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h hVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f12147f = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e.this.new b(this.f12147f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f12145d;
            if (i11 == 0) {
                s.b(obj);
                C0 c02 = e.this.f12134b;
                this.f12145d = 1;
                if (c02.emit(this.f12147f, this) == aVar) {
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

    public e() {
        C0 b11 = E0.b(0, 0, null, 7);
        this.f12133a = b11;
        C0 b12 = E0.b(0, 0, null, 7);
        this.f12134b = b12;
        C0 b13 = E0.b(0, 0, null, 7);
        this.f12135c = b13;
        C0 b14 = E0.b(0, 0, null, 7);
        this.f12136d = b14;
        this.f12137e = td0.f.a();
        this.f12138f = C2399j.a(b11);
        this.f12139g = C2399j.a(b12);
        this.f12140h = C2399j.a(b13);
        this.f12141i = C2399j.a(b14);
    }

    @Override // Ib0.d
    @NotNull
    public final B0<i> a() {
        return this.f12138f;
    }

    @Override // Ib0.d
    @NotNull
    public final B0<Object> b() {
        return this.f12140h;
    }

    @Override // Ib0.d
    @NotNull
    public final B0<h> c() {
        return this.f12139g;
    }

    @Override // Ib0.d
    @NotNull
    public final B0<Ib0.b> d() {
        return this.f12141i;
    }

    @NotNull
    public final xe.B0 i(@NotNull h event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return C10727i.c(this.f12137e, null, null, new b(event, null), 3);
    }

    @NotNull
    public final xe.B0 j(@NotNull i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return C10727i.c(this.f12137e, null, null, new a(event, null), 3);
    }

    @NotNull
    public final void k(@NotNull Ib0.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        C10727i.c(this.f12137e, null, null, new f(this, event, null), 3);
    }

    @NotNull
    public final void l() {
        C10727i.c(this.f12137e, null, null, new g(this, null), 3);
    }
}
