package P1;

import androidx.recyclerview.widget.LinearLayoutManager;
import ed.InterfaceC6346b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: P1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3805l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final O1.b<b, a> f21574a = new O1.b<>(16);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final O1.c<b, a> f21575b = new O1.c<>(0);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final S1.p f21576c = new S1.p();

    @InterfaceC6346b
    /* renamed from: P1.l$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f21577a;

        private /* synthetic */ a(Object obj) {
            this.f21577a = obj;
        }

        public static final /* synthetic */ a a(Object obj) {
            return new a(obj);
        }

        public final /* synthetic */ Object b() {
            return this.f21577a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return Intrinsics.d(this.f21577a, ((a) obj).f21577a);
            }
            return false;
        }

        public final int hashCode() {
            Object obj = this.f21577a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return "AsyncTypefaceResult(result=" + this.f21577a + ')';
        }
    }

    /* renamed from: P1.l$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final InterfaceC3808o f21578a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f21579b;

        public b(@NotNull InterfaceC3808o interfaceC3808o, Object obj) {
            this.f21578a = interfaceC3808o;
            this.f21579b = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f21578a, bVar.f21578a) && Intrinsics.d(this.f21579b, bVar.f21579b);
        }

        public final int hashCode() {
            int hashCode = this.f21578a.hashCode() * 31;
            Object obj = this.f21579b;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        @NotNull
        public final String toString() {
            return "Key(font=" + this.f21578a + ", loaderKey=" + this.f21579b + ')';
        }
    }

    public static void e(C3805l c3805l, InterfaceC3808o interfaceC3808o, C3796c c3796c, Object obj) {
        c3805l.getClass();
        c3796c.getClass();
        b bVar = new b(interfaceC3808o, null);
        synchronized (c3805l.f21576c) {
            try {
                if (obj == null) {
                } else {
                    c3805l.f21574a.b(bVar, a.a(obj));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final a d(@NotNull InterfaceC3808o interfaceC3808o, @NotNull C3796c c3796c) {
        a a11;
        c3796c.getClass();
        b bVar = new b(interfaceC3808o, null);
        synchronized (this.f21576c) {
            a11 = this.f21574a.a(bVar);
            if (a11 == null) {
                a11 = this.f21575b.a(bVar);
            }
        }
        return a11;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(@NotNull InterfaceC3808o interfaceC3808o, @NotNull C3796c c3796c, @NotNull Function1 function1, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C3806m c3806m;
        int i11;
        b bVar;
        C3805l c3805l;
        if (cVar instanceof C3806m) {
            c3806m = (C3806m) cVar;
            int i12 = c3806m.f21584h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c3806m.f21584h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c3806m.f21582f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c3806m.f21584h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    c3796c.getClass();
                    b bVar2 = new b(interfaceC3808o, null);
                    synchronized (this.f21576c) {
                        try {
                            a a11 = this.f21574a.a(bVar2);
                            if (a11 == null) {
                                a11 = this.f21575b.a(bVar2);
                            }
                            if (a11 != null) {
                                return a11.b();
                            }
                            Unit unit = Unit.f71690a;
                            c3806m.f21580d = this;
                            c3806m.f21581e = bVar2;
                            c3806m.f21584h = 1;
                            Object invoke = ((C3801h) function1).invoke(c3806m);
                            if (invoke == aVar) {
                                return aVar;
                            }
                            obj = invoke;
                            bVar = bVar2;
                            c3805l = this;
                        } finally {
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = c3806m.f21581e;
                    c3805l = c3806m.f21580d;
                    Sc.s.b(obj);
                }
                synchronized (c3805l.f21576c) {
                    try {
                        if (obj == null) {
                            c3805l.f21575b.d(bVar, a.a(null));
                        } else {
                            c3805l.f21574a.b(bVar, a.a(obj));
                        }
                        Unit unit2 = Unit.f71690a;
                    } finally {
                    }
                }
                return obj;
            }
        }
        c3806m = new C3806m(this, cVar);
        Object obj2 = c3806m.f21582f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c3806m.f21584h;
        if (i11 != 0) {
        }
        synchronized (c3805l.f21576c) {
        }
    }
}
