package com.ironsource;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.d3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4365d3 implements InterfaceC4459i7 {

    /* renamed from: com.ironsource.d3$a */
    public static final class a extends AbstractC4365d3 {

        /* renamed from: a, reason: collision with root package name */
        private final b f8121a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b firstReason) {
            super(null);
            Intrinsics.checkNotNullParameter(firstReason, "firstReason");
            this.f8121a = firstReason;
        }

        public final a a(b firstReason) {
            Intrinsics.checkNotNullParameter(firstReason, "firstReason");
            return new a(firstReason);
        }

        public final b d() {
            return this.f8121a;
        }

        public final b e() {
            return this.f8121a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f8121a, ((a) obj).f8121a);
        }

        public int hashCode() {
            return this.f8121a.hashCode();
        }

        public String toString() {
            return "First(firstReason=" + this.f8121a + ")";
        }

        public static /* synthetic */ a a(a aVar, b bVar, int i, Object obj) {
            if ((i & 1) != 0) {
                bVar = aVar.f8121a;
            }
            return aVar.a(bVar);
        }
    }

    /* renamed from: com.ironsource.d3$b */
    public static abstract class b implements InterfaceC4459i7 {

        /* renamed from: com.ironsource.d3$b$a */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f8122a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.d3$b$b, reason: collision with other inner class name */
        public static final class C1321b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C1321b f8123a = new C1321b();

            private C1321b() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.d3$b$c */
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final c f8124a = new c();

            private c() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.ironsource.InterfaceC4459i7
        public String a() {
            if (this instanceof a) {
                return "PublisherLoadFail";
            }
            if (this instanceof C1321b) {
                return "PublisherLoadSuccess";
            }
            if (this instanceof c) {
                return "ResumeAutoRefresh";
            }
            throw new NoWhenBranchMatchedException();
        }

        private b() {
        }
    }

    /* renamed from: com.ironsource.d3$c */
    public static final class c extends AbstractC4365d3 {

        /* renamed from: a, reason: collision with root package name */
        private final long f8125a;
        private final d b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, d recurringReason) {
            super(null);
            Intrinsics.checkNotNullParameter(recurringReason, "recurringReason");
            this.f8125a = j;
            this.b = recurringReason;
        }

        public final c a(long j, d recurringReason) {
            Intrinsics.checkNotNullParameter(recurringReason, "recurringReason");
            return new c(j, recurringReason);
        }

        public final long d() {
            return this.f8125a;
        }

        public final d e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f8125a == cVar.f8125a && Intrinsics.areEqual(this.b, cVar.b);
        }

        public final d f() {
            return this.b;
        }

        public final long g() {
            return this.f8125a;
        }

        public int hashCode() {
            return (Long.hashCode(this.f8125a) * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Recurring(reloadDuration=" + this.f8125a + ", recurringReason=" + this.b + ")";
        }

        public static /* synthetic */ c a(c cVar, long j, d dVar, int i, Object obj) {
            if ((i & 1) != 0) {
                j = cVar.f8125a;
            }
            if ((i & 2) != 0) {
                dVar = cVar.b;
            }
            return cVar.a(j, dVar);
        }
    }

    /* renamed from: com.ironsource.d3$d */
    public static abstract class d implements InterfaceC4459i7 {

        /* renamed from: com.ironsource.d3$d$a */
        public static final class a extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final a f8126a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.d3$d$b */
        public static final class b extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final b f8127a = new b();

            private b() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.d3$d$c */
        public static final class c extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final c f8128a = new c();

            private c() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.d3$d$d, reason: collision with other inner class name */
        public static final class C1322d extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final C1322d f8129a = new C1322d();

            private C1322d() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.d3$d$e */
        public static final class e extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final e f8130a = new e();

            private e() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.d3$d$f */
        public static final class f extends d {

            /* renamed from: a, reason: collision with root package name */
            private final long f8131a;

            public f(long j) {
                super(null);
                this.f8131a = j;
            }

            public final f a(long j) {
                return new f(j);
            }

            public final long c() {
                return this.f8131a;
            }

            public final long d() {
                return this.f8131a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.f8131a == ((f) obj).f8131a;
            }

            public int hashCode() {
                return Long.hashCode(this.f8131a);
            }

            public String toString() {
                return "ResumeVisibility(notVisibleDuration=" + this.f8131a + ")";
            }

            public static /* synthetic */ f a(f fVar, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = fVar.f8131a;
                }
                return fVar.a(j);
            }
        }

        /* renamed from: com.ironsource.d3$d$g */
        public static final class g extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final g f8132a = new g();

            private g() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.d3$d$h */
        public static final class h extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final h f8133a = new h();

            private h() {
                super(null);
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.ironsource.InterfaceC4459i7
        public String a() {
            if (this instanceof f) {
                return "ResumeVisibility";
            }
            if (this instanceof a) {
                return "PublisherLoadFail";
            }
            if (this instanceof b) {
                return "PublisherLoadSuccess";
            }
            if (this instanceof e) {
                return "ResumeAutoRefresh";
            }
            if (this instanceof c) {
                return "ReloadFailAfterTimer";
            }
            if (this instanceof C1322d) {
                return "ReloadSuccessAfterTimer";
            }
            if (this instanceof g) {
                return "TimerAfterReloadFail";
            }
            if (this instanceof h) {
                return "TimerAfterReloadSuccess";
            }
            throw new NoWhenBranchMatchedException();
        }

        public final long b() {
            if (this instanceof f) {
                return ((f) this).d();
            }
            return 0L;
        }

        private d() {
        }
    }

    public /* synthetic */ AbstractC4365d3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.ironsource.InterfaceC4459i7
    public String a() {
        if (this instanceof a) {
            return ((a) this).e().a();
        }
        if (this instanceof c) {
            return ((c) this).f().a();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final long b() {
        if (this instanceof a) {
            return 0L;
        }
        if (this instanceof c) {
            return ((c) this).f().b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final long c() {
        if (this instanceof a) {
            return 0L;
        }
        if (this instanceof c) {
            return ((c) this).g();
        }
        throw new NoWhenBranchMatchedException();
    }

    private AbstractC4365d3() {
    }
}
