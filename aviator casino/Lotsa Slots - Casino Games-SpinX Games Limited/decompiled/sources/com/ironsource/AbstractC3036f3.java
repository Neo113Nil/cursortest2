package com.ironsource;

/* renamed from: com.ironsource.f3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3036f3 implements com.ironsource.InterfaceC3147l7 {

    /* renamed from: com.ironsource.f3$a */
    public static final class a extends com.ironsource.AbstractC3036f3 {

        /* renamed from: a, reason: collision with root package name */
        private final com.ironsource.AbstractC3036f3.b f6237a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.ironsource.AbstractC3036f3.b firstReason) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstReason, "firstReason");
            this.f6237a = firstReason;
        }

        public final com.ironsource.AbstractC3036f3.a a(com.ironsource.AbstractC3036f3.b firstReason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstReason, "firstReason");
            return new com.ironsource.AbstractC3036f3.a(firstReason);
        }

        public final com.ironsource.AbstractC3036f3.b d() {
            return this.f6237a;
        }

        public final com.ironsource.AbstractC3036f3.b e() {
            return this.f6237a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.AbstractC3036f3.a) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6237a, ((com.ironsource.AbstractC3036f3.a) obj).f6237a);
        }

        public int hashCode() {
            return this.f6237a.hashCode();
        }

        public java.lang.String toString() {
            return "First(firstReason=" + this.f6237a + ")";
        }

        public static /* synthetic */ com.ironsource.AbstractC3036f3.a a(com.ironsource.AbstractC3036f3.a aVar, com.ironsource.AbstractC3036f3.b bVar, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bVar = aVar.f6237a;
            }
            return aVar.a(bVar);
        }
    }

    /* renamed from: com.ironsource.f3$b */
    public static abstract class b implements com.ironsource.InterfaceC3147l7 {

        /* renamed from: com.ironsource.f3$b$a */
        public static final class a extends com.ironsource.AbstractC3036f3.b {

            /* renamed from: a, reason: collision with root package name */
            public static final com.ironsource.AbstractC3036f3.b.a f6238a = new com.ironsource.AbstractC3036f3.b.a();

            private a() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.f3$b$b, reason: collision with other inner class name */
        public static final class C0148b extends com.ironsource.AbstractC3036f3.b {

            /* renamed from: a, reason: collision with root package name */
            public static final com.ironsource.AbstractC3036f3.b.C0148b f6239a = new com.ironsource.AbstractC3036f3.b.C0148b();

            private C0148b() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.f3$b$c */
        public static final class c extends com.ironsource.AbstractC3036f3.b {

            /* renamed from: a, reason: collision with root package name */
            public static final com.ironsource.AbstractC3036f3.b.c f6240a = new com.ironsource.AbstractC3036f3.b.c();

            private c() {
                super(null);
            }
        }

        public /* synthetic */ b(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.ironsource.InterfaceC3147l7
        public java.lang.String a() {
            if (this instanceof com.ironsource.AbstractC3036f3.b.a) {
                return "PublisherLoadFail";
            }
            if (this instanceof com.ironsource.AbstractC3036f3.b.C0148b) {
                return "PublisherLoadSuccess";
            }
            if (this instanceof com.ironsource.AbstractC3036f3.b.c) {
                return "ResumeAutoRefresh";
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }

        private b() {
        }
    }

    /* renamed from: com.ironsource.f3$c */
    public static final class c extends com.ironsource.AbstractC3036f3 {

        /* renamed from: a, reason: collision with root package name */
        private final long f6241a;
        private final com.ironsource.AbstractC3036f3.d b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, com.ironsource.AbstractC3036f3.d recurringReason) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recurringReason, "recurringReason");
            this.f6241a = j;
            this.b = recurringReason;
        }

        public final com.ironsource.AbstractC3036f3.c a(long j, com.ironsource.AbstractC3036f3.d recurringReason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recurringReason, "recurringReason");
            return new com.ironsource.AbstractC3036f3.c(j, recurringReason);
        }

        public final long d() {
            return this.f6241a;
        }

        public final com.ironsource.AbstractC3036f3.d e() {
            return this.b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.ironsource.AbstractC3036f3.c)) {
                return false;
            }
            com.ironsource.AbstractC3036f3.c cVar = (com.ironsource.AbstractC3036f3.c) obj;
            return this.f6241a == cVar.f6241a && kotlin.jvm.internal.Intrinsics.areEqual(this.b, cVar.b);
        }

        public final com.ironsource.AbstractC3036f3.d f() {
            return this.b;
        }

        public final long g() {
            return this.f6241a;
        }

        public int hashCode() {
            return (kotlin.UByte$$ExternalSyntheticBackport0.m(this.f6241a) * 31) + this.b.hashCode();
        }

        public java.lang.String toString() {
            return "Recurring(reloadDuration=" + this.f6241a + ", recurringReason=" + this.b + ")";
        }

        public static /* synthetic */ com.ironsource.AbstractC3036f3.c a(com.ironsource.AbstractC3036f3.c cVar, long j, com.ironsource.AbstractC3036f3.d dVar, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = cVar.f6241a;
            }
            if ((i & 2) != 0) {
                dVar = cVar.b;
            }
            return cVar.a(j, dVar);
        }
    }

    /* renamed from: com.ironsource.f3$d */
    public static abstract class d implements com.ironsource.InterfaceC3147l7 {

        /* renamed from: com.ironsource.f3$d$a */
        public static final class a extends com.ironsource.AbstractC3036f3.d {

            /* renamed from: a, reason: collision with root package name */
            public static final com.ironsource.AbstractC3036f3.d.a f6242a = new com.ironsource.AbstractC3036f3.d.a();

            private a() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.f3$d$b */
        public static final class b extends com.ironsource.AbstractC3036f3.d {

            /* renamed from: a, reason: collision with root package name */
            public static final com.ironsource.AbstractC3036f3.d.b f6243a = new com.ironsource.AbstractC3036f3.d.b();

            private b() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.f3$d$c */
        public static final class c extends com.ironsource.AbstractC3036f3.d {

            /* renamed from: a, reason: collision with root package name */
            public static final com.ironsource.AbstractC3036f3.d.c f6244a = new com.ironsource.AbstractC3036f3.d.c();

            private c() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.f3$d$d, reason: collision with other inner class name */
        public static final class C0149d extends com.ironsource.AbstractC3036f3.d {

            /* renamed from: a, reason: collision with root package name */
            public static final com.ironsource.AbstractC3036f3.d.C0149d f6245a = new com.ironsource.AbstractC3036f3.d.C0149d();

            private C0149d() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.f3$d$e */
        public static final class e extends com.ironsource.AbstractC3036f3.d {

            /* renamed from: a, reason: collision with root package name */
            public static final com.ironsource.AbstractC3036f3.d.e f6246a = new com.ironsource.AbstractC3036f3.d.e();

            private e() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.f3$d$f */
        public static final class f extends com.ironsource.AbstractC3036f3.d {

            /* renamed from: a, reason: collision with root package name */
            private final long f6247a;

            public f(long j) {
                super(null);
                this.f6247a = j;
            }

            public final com.ironsource.AbstractC3036f3.d.f a(long j) {
                return new com.ironsource.AbstractC3036f3.d.f(j);
            }

            public final long c() {
                return this.f6247a;
            }

            public final long d() {
                return this.f6247a;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof com.ironsource.AbstractC3036f3.d.f) && this.f6247a == ((com.ironsource.AbstractC3036f3.d.f) obj).f6247a;
            }

            public int hashCode() {
                return kotlin.UByte$$ExternalSyntheticBackport0.m(this.f6247a);
            }

            public java.lang.String toString() {
                return "ResumeVisibility(notVisibleDuration=" + this.f6247a + ")";
            }

            public static /* synthetic */ com.ironsource.AbstractC3036f3.d.f a(com.ironsource.AbstractC3036f3.d.f fVar, long j, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    j = fVar.f6247a;
                }
                return fVar.a(j);
            }
        }

        /* renamed from: com.ironsource.f3$d$g */
        public static final class g extends com.ironsource.AbstractC3036f3.d {

            /* renamed from: a, reason: collision with root package name */
            public static final com.ironsource.AbstractC3036f3.d.g f6248a = new com.ironsource.AbstractC3036f3.d.g();

            private g() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.f3$d$h */
        public static final class h extends com.ironsource.AbstractC3036f3.d {

            /* renamed from: a, reason: collision with root package name */
            public static final com.ironsource.AbstractC3036f3.d.h f6249a = new com.ironsource.AbstractC3036f3.d.h();

            private h() {
                super(null);
            }
        }

        public /* synthetic */ d(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.ironsource.InterfaceC3147l7
        public java.lang.String a() {
            if (this instanceof com.ironsource.AbstractC3036f3.d.f) {
                return "ResumeVisibility";
            }
            if (this instanceof com.ironsource.AbstractC3036f3.d.a) {
                return "PublisherLoadFail";
            }
            if (this instanceof com.ironsource.AbstractC3036f3.d.b) {
                return "PublisherLoadSuccess";
            }
            if (this instanceof com.ironsource.AbstractC3036f3.d.e) {
                return "ResumeAutoRefresh";
            }
            if (this instanceof com.ironsource.AbstractC3036f3.d.c) {
                return "ReloadFailAfterTimer";
            }
            if (this instanceof com.ironsource.AbstractC3036f3.d.C0149d) {
                return "ReloadSuccessAfterTimer";
            }
            if (this instanceof com.ironsource.AbstractC3036f3.d.g) {
                return "TimerAfterReloadFail";
            }
            if (this instanceof com.ironsource.AbstractC3036f3.d.h) {
                return "TimerAfterReloadSuccess";
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }

        public final long b() {
            if (this instanceof com.ironsource.AbstractC3036f3.d.f) {
                return ((com.ironsource.AbstractC3036f3.d.f) this).d();
            }
            return 0L;
        }

        private d() {
        }
    }

    public /* synthetic */ AbstractC3036f3(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.ironsource.InterfaceC3147l7
    public java.lang.String a() {
        if (this instanceof com.ironsource.AbstractC3036f3.a) {
            return ((com.ironsource.AbstractC3036f3.a) this).e().a();
        }
        if (this instanceof com.ironsource.AbstractC3036f3.c) {
            return ((com.ironsource.AbstractC3036f3.c) this).f().a();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final long b() {
        if (this instanceof com.ironsource.AbstractC3036f3.a) {
            return 0L;
        }
        if (this instanceof com.ironsource.AbstractC3036f3.c) {
            return ((com.ironsource.AbstractC3036f3.c) this).f().b();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final long c() {
        if (this instanceof com.ironsource.AbstractC3036f3.a) {
            return 0L;
        }
        if (this instanceof com.ironsource.AbstractC3036f3.c) {
            return ((com.ironsource.AbstractC3036f3.c) this).g();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    private AbstractC3036f3() {
    }
}
