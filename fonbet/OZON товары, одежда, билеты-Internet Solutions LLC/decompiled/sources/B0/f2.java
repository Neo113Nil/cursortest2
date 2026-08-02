package B0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f1722a;

    /* renamed from: b, reason: collision with root package name */
    private a f1723b;

    /* renamed from: c, reason: collision with root package name */
    private a f1724c;

    /* renamed from: d, reason: collision with root package name */
    private int f1725d;

    /* renamed from: e, reason: collision with root package name */
    private Long f1726e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1727f;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private a f1728a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private Q1.K f1729b;

        public a(a aVar, @NotNull Q1.K k11) {
            this.f1728a = aVar;
            this.f1729b = k11;
        }

        public final a a() {
            return this.f1728a;
        }

        @NotNull
        public final Q1.K b() {
            return this.f1729b;
        }

        public final void c() {
            this.f1728a = null;
        }

        public final void d(@NotNull Q1.K k11) {
            this.f1729b = k11;
        }
    }

    public f2() {
        this(0);
    }

    public static void d(f2 f2Var, Q1.K k11) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!f2Var.f1727f) {
            Long l11 = f2Var.f1726e;
            if (currentTimeMillis <= (l11 != null ? l11.longValue() : 0L) + 5000) {
                return;
            }
        }
        f2Var.f1726e = Long.valueOf(currentTimeMillis);
        f2Var.b(k11);
    }

    public final void a() {
        this.f1727f = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0072 A[LOOP:0: B:25:0x0062->B:30:0x0072, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077 A[EDGE_INSN: B:31:0x0077->B:32:0x0077 BREAK  A[LOOP:0: B:25:0x0062->B:30:0x0072], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(@NotNull Q1.K k11) {
        a aVar;
        Q1.K b11;
        this.f1727f = false;
        a aVar2 = this.f1723b;
        if (Intrinsics.d(k11, aVar2 != null ? aVar2.b() : null)) {
            return;
        }
        String f7 = k11.f();
        a aVar3 = this.f1723b;
        if (Intrinsics.d(f7, (aVar3 == null || (b11 = aVar3.b()) == null) ? null : b11.f())) {
            a aVar4 = this.f1723b;
            if (aVar4 == null) {
                return;
            }
            aVar4.d(k11);
            return;
        }
        this.f1723b = new a(this.f1723b, k11);
        this.f1724c = null;
        int length = k11.f().length() + this.f1725d;
        this.f1725d = length;
        if (length > this.f1722a) {
            a aVar5 = this.f1723b;
            if ((aVar5 != null ? aVar5.a() : null) == null) {
                return;
            }
            while (true) {
                if (aVar5 != null) {
                    a a11 = aVar5.a();
                    if (a11 != null) {
                        aVar = a11.a();
                        if (aVar != null) {
                            break;
                        } else {
                            aVar5 = aVar5.a();
                        }
                    }
                }
                aVar = null;
                if (aVar != null) {
                }
            }
            if (aVar5 == null) {
                return;
            }
            aVar5.c();
        }
    }

    public final Q1.K c() {
        a aVar = this.f1724c;
        if (aVar == null) {
            return null;
        }
        this.f1724c = aVar.a();
        this.f1723b = new a(this.f1723b, aVar.b());
        this.f1725d = aVar.b().f().length() + this.f1725d;
        return aVar.b();
    }

    public final Q1.K e() {
        a a11;
        a aVar = this.f1723b;
        if (aVar == null || (a11 = aVar.a()) == null) {
            return null;
        }
        this.f1723b = a11;
        this.f1725d -= aVar.b().f().length();
        this.f1724c = new a(this.f1724c, aVar.b());
        return a11.b();
    }

    public f2(int i11) {
        this.f1722a = 100000;
    }
}
