package Ae;

import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class L0 implements I0 {

    /* renamed from: b, reason: collision with root package name */
    private final long f845b;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {174, 176, 178, 179, 181}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC2397i<? super G0>, Integer, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f846d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ InterfaceC2397i f847e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ int f848f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super G0> interfaceC2397i, Integer num, kotlin.coroutines.d<? super Unit> dVar) {
            int intValue = num.intValue();
            a aVar = L0.this.new a(dVar);
            aVar.f847e = interfaceC2397i;
            aVar.f848f = intValue;
            return aVar.invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0087, code lost:
        
            if (r1.emit(r11, r10) == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
        
            if (xe.Y.b(Long.MAX_VALUE, r10) == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
        
            if (r1.emit(r11, r10) == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
        
            if (r1.emit(r11, r10) == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
        
            if (xe.Y.b(r8, r10) == r0) goto L32;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC2397i interfaceC2397i;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f846d;
            L0 l02 = L0.this;
            if (i11 == 0) {
                Sc.s.b(obj);
                interfaceC2397i = this.f847e;
                if (this.f848f > 0) {
                    G0 g02 = G0.START;
                    this.f846d = 1;
                } else {
                    long j11 = l02.f845b;
                    this.f847e = interfaceC2397i;
                    this.f846d = 2;
                }
                return aVar;
            }
            if (i11 != 1) {
                if (i11 == 2) {
                    interfaceC2397i = this.f847e;
                    Sc.s.b(obj);
                    L0.b(l02);
                    G0 g03 = G0.STOP;
                    this.f847e = interfaceC2397i;
                    this.f846d = 3;
                } else if (i11 == 3) {
                    interfaceC2397i = this.f847e;
                    Sc.s.b(obj);
                    L0.b(l02);
                    this.f847e = interfaceC2397i;
                    this.f846d = 4;
                } else if (i11 == 4) {
                    interfaceC2397i = this.f847e;
                    Sc.s.b(obj);
                    G0 g04 = G0.STOP_AND_RESET_REPLAY_CACHE;
                    this.f847e = null;
                    this.f846d = 5;
                } else if (i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            Sc.s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", l = {}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<G0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f850d;

        b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(2, dVar);
            bVar.f850d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(G0 g02, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((b) create(g02, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            return Boolean.valueOf(((G0) this.f850d) != G0.START);
        }
    }

    public L0(long j11) {
        this.f845b = j11;
        if (j11 < 0) {
            throw new IllegalArgumentException(Sh.b.b(j11, "stopTimeout(", " ms) cannot be negative").toString());
        }
    }

    public static final /* synthetic */ long b(L0 l02) {
        l02.getClass();
        return Long.MAX_VALUE;
    }

    @Override // Ae.I0
    @NotNull
    public final InterfaceC2395h<G0> a(@NotNull M0<Integer> m02) {
        return C2423x.a(new K(C2399j.Q(m02, new a(null)), new b(2, null)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof L0) {
            return this.f845b == ((L0) obj).f845b;
        }
        return false;
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        return Long.hashCode(Long.MAX_VALUE) + (Long.hashCode(this.f845b) * 31);
    }

    @NotNull
    public final String toString() {
        Tc.b builder = new Tc.b(2);
        long j11 = this.f845b;
        if (j11 > 0) {
            builder.add("stopTimeout=" + j11 + "ms");
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return B3.D.c(new StringBuilder("SharingStarted.WhileSubscribed("), C7714v.V(builder.B(), null, null, null, null, 63), ')');
    }
}
