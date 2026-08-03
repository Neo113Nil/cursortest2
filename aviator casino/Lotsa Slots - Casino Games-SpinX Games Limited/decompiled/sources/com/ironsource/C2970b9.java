package com.ironsource;

/* renamed from: com.ironsource.b9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2970b9 {

    /* renamed from: a, reason: collision with root package name */
    private final long f6155a;
    private final com.ironsource.C2970b9.a b;
    private final long c;

    /* renamed from: com.ironsource.b9$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f6156a;
        private final long b;
        private final long c;

        public a(long j, long j2, long j3) {
            this.f6156a = j;
            this.b = j2;
            this.c = j3;
        }

        public final long a() {
            return this.f6156a;
        }

        public final long b() {
            return this.b;
        }

        public final long c() {
            return this.c;
        }

        public final long d() {
            return this.f6156a;
        }

        public final long e() {
            return this.b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.ironsource.C2970b9.a)) {
                return false;
            }
            com.ironsource.C2970b9.a aVar = (com.ironsource.C2970b9.a) obj;
            return this.f6156a == aVar.f6156a && this.b == aVar.b && this.c == aVar.c;
        }

        public final long f() {
            return this.c;
        }

        public int hashCode() {
            return (((kotlin.UByte$$ExternalSyntheticBackport0.m(this.f6156a) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.b)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.c);
        }

        public java.lang.String toString() {
            return "Memory(javaHeapKb=" + this.f6156a + ", nativeHeapKb=" + this.b + ", sharedOtherKb=" + this.c + ")";
        }

        public final com.ironsource.C2970b9.a a(long j, long j2, long j3) {
            return new com.ironsource.C2970b9.a(j, j2, j3);
        }

        public static /* synthetic */ com.ironsource.C2970b9.a a(com.ironsource.C2970b9.a aVar, long j, long j2, long j3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = aVar.f6156a;
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

    public C2970b9(long j, com.ironsource.C2970b9.a memory, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memory, "memory");
        this.f6155a = j;
        this.b = memory;
        this.c = j2;
    }

    public final long a() {
        return this.f6155a;
    }

    public final com.ironsource.C2970b9.a b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final long d() {
        return this.c;
    }

    public final com.ironsource.C2970b9.a e() {
        return this.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.C2970b9)) {
            return false;
        }
        com.ironsource.C2970b9 c2970b9 = (com.ironsource.C2970b9) obj;
        return this.f6155a == c2970b9.f6155a && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c2970b9.b) && this.c == c2970b9.c;
    }

    public final long f() {
        return this.f6155a;
    }

    public int hashCode() {
        return (((kotlin.UByte$$ExternalSyntheticBackport0.m(this.f6155a) * 31) + this.b.hashCode()) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.c);
    }

    public java.lang.String toString() {
        return "InitParsingMetrics(parsingDurationMs=" + this.f6155a + ", memory=" + this.b + ", initResponseJsonSizeKb=" + this.c + ")";
    }

    public final com.ironsource.C2970b9 a(long j, com.ironsource.C2970b9.a memory, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memory, "memory");
        return new com.ironsource.C2970b9(j, memory, j2);
    }

    public static /* synthetic */ com.ironsource.C2970b9 a(com.ironsource.C2970b9 c2970b9, long j, com.ironsource.C2970b9.a aVar, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = c2970b9.f6155a;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            aVar = c2970b9.b;
        }
        com.ironsource.C2970b9.a aVar2 = aVar;
        if ((i & 4) != 0) {
            j2 = c2970b9.c;
        }
        return c2970b9.a(j3, aVar2, j2);
    }
}
