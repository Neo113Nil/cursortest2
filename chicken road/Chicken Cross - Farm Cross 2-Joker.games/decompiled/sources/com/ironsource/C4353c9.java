package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.c9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4353c9 {

    /* renamed from: a, reason: collision with root package name */
    private final long f8112a;
    private final a b;
    private final long c;

    /* renamed from: com.ironsource.c9$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f8113a;
        private final long b;
        private final long c;

        public a(long j, long j2, long j3) {
            this.f8113a = j;
            this.b = j2;
            this.c = j3;
        }

        public final long a() {
            return this.f8113a;
        }

        public final long b() {
            return this.b;
        }

        public final long c() {
            return this.c;
        }

        public final long d() {
            return this.f8113a;
        }

        public final long e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f8113a == aVar.f8113a && this.b == aVar.b && this.c == aVar.c;
        }

        public final long f() {
            return this.c;
        }

        public int hashCode() {
            return (((Long.hashCode(this.f8113a) * 31) + Long.hashCode(this.b)) * 31) + Long.hashCode(this.c);
        }

        public String toString() {
            return "Memory(javaHeapKb=" + this.f8113a + ", nativeHeapKb=" + this.b + ", sharedOtherKb=" + this.c + ")";
        }

        public final a a(long j, long j2, long j3) {
            return new a(j, j2, j3);
        }

        public static /* synthetic */ a a(a aVar, long j, long j2, long j3, int i, Object obj) {
            if ((i & 1) != 0) {
                j = aVar.f8113a;
            }
            long j4 = j;
            if ((i & 2) != 0) {
                j2 = aVar.b;
            }
            long j5 = j2;
            if ((i & 4) != 0) {
                j3 = aVar.c;
            }
            return aVar.a(j4, j5, j3);
        }
    }

    public C4353c9(long j, a memory, long j2) {
        Intrinsics.checkNotNullParameter(memory, "memory");
        this.f8112a = j;
        this.b = memory;
        this.c = j2;
    }

    public final long a() {
        return this.f8112a;
    }

    public final a b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final long d() {
        return this.c;
    }

    public final a e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4353c9)) {
            return false;
        }
        C4353c9 c4353c9 = (C4353c9) obj;
        return this.f8112a == c4353c9.f8112a && Intrinsics.areEqual(this.b, c4353c9.b) && this.c == c4353c9.c;
    }

    public final long f() {
        return this.f8112a;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f8112a) * 31) + this.b.hashCode()) * 31) + Long.hashCode(this.c);
    }

    public String toString() {
        return "InitParsingMetrics(parsingDurationMs=" + this.f8112a + ", memory=" + this.b + ", initResponseJsonSizeKb=" + this.c + ")";
    }

    public final C4353c9 a(long j, a memory, long j2) {
        Intrinsics.checkNotNullParameter(memory, "memory");
        return new C4353c9(j, memory, j2);
    }

    public static /* synthetic */ C4353c9 a(C4353c9 c4353c9, long j, a aVar, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = c4353c9.f8112a;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            aVar = c4353c9.b;
        }
        a aVar2 = aVar;
        if ((i & 4) != 0) {
            j2 = c4353c9.c;
        }
        return c4353c9.a(j3, aVar2, j2);
    }
}
