package P0;

import Je.InterfaceC3394a;
import Kk.C3532b;
import S0.C3991w0;
import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

/* loaded from: classes8.dex */
public final class N1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Je.d f20708a = Je.e.a();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3991w0 f20709b;

    private static final class a implements InterfaceC3793z1 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final d2 f20710a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final C10737n f20711b;

        public a(@NotNull d2 d2Var, @NotNull C10737n c10737n) {
            this.f20710a = d2Var;
            this.f20711b = c10737n;
        }

        @Override // P0.InterfaceC3793z1
        public final void a() {
            C10737n c10737n = this.f20711b;
            if (c10737n.isActive()) {
                r.Companion companion = Sc.r.INSTANCE;
                c10737n.resumeWith(c2.ActionPerformed);
            }
        }

        @Override // P0.InterfaceC3793z1
        @NotNull
        public final d2 b() {
            return this.f20710a;
        }

        @Override // P0.InterfaceC3793z1
        public final void dismiss() {
            C10737n c10737n = this.f20711b;
            if (c10737n.isActive()) {
                r.Companion companion = Sc.r.INSTANCE;
                c10737n.resumeWith(c2.Dismissed);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f20710a, aVar.f20710a) && this.f20711b.equals(aVar.f20711b);
        }

        public final int hashCode() {
            return this.f20711b.hashCode() + (this.f20710a.hashCode() * 31);
        }
    }

    private static final class b implements d2 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f20712a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final A1 f20713b;

        public b(@NotNull String str, @NotNull A1 a12) {
            this.f20712a = str;
            this.f20713b = a12;
        }

        @Override // P0.d2
        public final boolean a() {
            return false;
        }

        @Override // P0.d2
        public final String b() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f20712a, bVar.f20712a) && this.f20713b == bVar.f20713b;
        }

        @Override // P0.d2
        @NotNull
        public final A1 getDuration() {
            return this.f20713b;
        }

        @Override // P0.d2
        @NotNull
        public final String getMessage() {
            return this.f20712a;
        }

        public final int hashCode() {
            return this.f20713b.hashCode() + C3532b.a(this.f20712a.hashCode() * 961, 31, false);
        }
    }

    public N1() {
        C3991w0 f7;
        f7 = S0.n1.f(null, S0.D1.f25195a);
        this.f20709b = f7;
    }

    public static Object c(N1 n12, String str, kotlin.coroutines.jvm.internal.j jVar) {
        A1 a12 = A1.Short;
        n12.getClass();
        return n12.b(new b(str, a12), jVar);
    }

    public final InterfaceC3793z1 a() {
        return (InterfaceC3793z1) this.f20709b.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[Catch: all -> 0x009d, TRY_LEAVE, TryCatch #2 {all -> 0x009d, blocks: (B:26:0x005c, B:28:0x0082), top: B:25:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r8v0, types: [Je.a, P0.d2] */
    /* JADX WARN: Type inference failed for: r8v8, types: [Je.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull d2 d2Var, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        O1 frame;
        Wc.a aVar;
        int i11;
        Je.d dVar;
        N1 n12;
        d2 d2Var2;
        Throwable th2;
        N1 n13;
        Object n11;
        InterfaceC3394a interfaceC3394a;
        try {
            try {
                if (cVar instanceof O1) {
                    frame = (O1) cVar;
                    int i12 = frame.f20746j;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        frame.f20746j = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj = frame.f20744h;
                        aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = frame.f20746j;
                        if (i11 != 0) {
                            Sc.s.b(obj);
                            frame.f20740d = this;
                            frame.f20741e = d2Var;
                            dVar = this.f20708a;
                            frame.f20742f = dVar;
                            frame.f20746j = 1;
                            if (dVar.a(frame) != aVar) {
                                n12 = this;
                                d2Var2 = d2Var;
                            }
                            return aVar;
                        }
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC3394a = frame.f20742f;
                            n13 = frame.f20740d;
                            try {
                                Sc.s.b(obj);
                                n13.f20709b.setValue(null);
                                interfaceC3394a.c(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                n13.f20709b.setValue(null);
                                throw th2;
                            }
                        }
                        ?? r82 = frame.f20742f;
                        d2 d2Var3 = frame.f20741e;
                        n12 = frame.f20740d;
                        Sc.s.b(obj);
                        dVar = r82;
                        d2Var2 = d2Var3;
                        frame.f20740d = n12;
                        frame.f20741e = d2Var2;
                        frame.f20742f = dVar;
                        frame.f20743g = frame;
                        frame.f20746j = 2;
                        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
                        c10737n.o();
                        n12.f20709b.setValue(new a(d2Var2, c10737n));
                        n11 = c10737n.n();
                        if (n11 == aVar) {
                            Intrinsics.checkNotNullParameter(frame, "frame");
                        }
                        if (n11 != aVar) {
                            Je.d dVar2 = dVar;
                            obj = n11;
                            interfaceC3394a = dVar2;
                            n13 = n12;
                            n13.f20709b.setValue(null);
                            interfaceC3394a.c(null);
                            return obj;
                        }
                        return aVar;
                    }
                }
                frame.f20740d = n12;
                frame.f20741e = d2Var2;
                frame.f20742f = dVar;
                frame.f20743g = frame;
                frame.f20746j = 2;
                C10737n c10737n2 = new C10737n(1, Wc.b.b(frame));
                c10737n2.o();
                n12.f20709b.setValue(new a(d2Var2, c10737n2));
                n11 = c10737n2.n();
                if (n11 == aVar) {
                }
                if (n11 != aVar) {
                }
                return aVar;
            } catch (Throwable th4) {
                th2 = th4;
                n13 = n12;
                n13.f20709b.setValue(null);
                throw th2;
            }
            if (i11 != 0) {
            }
        } catch (Throwable th5) {
            d2Var.c(null);
            throw th5;
        }
        frame = new O1(this, cVar);
        Object obj2 = frame.f20744h;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = frame.f20746j;
    }
}
