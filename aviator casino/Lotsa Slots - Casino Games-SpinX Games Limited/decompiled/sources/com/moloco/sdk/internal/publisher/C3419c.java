package com.moloco.sdk.internal.publisher;

/* renamed from: com.moloco.sdk.internal.publisher.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3419c {
    public static final int c = 8;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map<com.moloco.sdk.internal.publisher.t, kotlin.time.Duration> f7090a;
    public final long b;

    /* renamed from: com.moloco.sdk.internal.publisher.c$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7091a;

        static {
            int[] iArr = new int[com.moloco.sdk.internal.publisher.t.values().length];
            try {
                iArr[com.moloco.sdk.internal.publisher.t.f7171a.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.moloco.sdk.internal.publisher.t.b.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.moloco.sdk.internal.publisher.t.c.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.moloco.sdk.internal.publisher.t.f.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.moloco.sdk.internal.publisher.t.g.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.moloco.sdk.internal.publisher.t.e.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.moloco.sdk.internal.publisher.t.d.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            f7091a = iArr;
        }
    }

    public /* synthetic */ C3419c(java.util.Map map, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(map, j);
    }

    public final java.util.Map<com.moloco.sdk.internal.publisher.t, kotlin.time.Duration> a() {
        return this.f7090a;
    }

    public final long b() {
        return this.b;
    }

    public final java.util.Map<com.moloco.sdk.internal.publisher.t, kotlin.time.Duration> c() {
        return this.f7090a;
    }

    public final long d() {
        return this.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.internal.publisher.C3419c)) {
            return false;
        }
        com.moloco.sdk.internal.publisher.C3419c c3419c = (com.moloco.sdk.internal.publisher.C3419c) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f7090a, c3419c.f7090a) && kotlin.time.Duration.m12151equalsimpl0(this.b, c3419c.b);
    }

    public int hashCode() {
        return (this.f7090a.hashCode() * 31) + kotlin.time.Duration.m12167hashCodeimpl(this.b);
    }

    public java.lang.String toString() {
        return "AdCreatorConfiguration(adTimeouts=" + this.f7090a + ", defaultTimeoutDuration=" + ((java.lang.Object) kotlin.time.Duration.m12186toStringimpl(this.b)) + ')';
    }

    public C3419c(java.util.Map<com.moloco.sdk.internal.publisher.t, kotlin.time.Duration> adTimeouts, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTimeouts, "adTimeouts");
        this.f7090a = adTimeouts;
        this.b = j;
    }

    public final com.moloco.sdk.internal.publisher.C3419c a(java.util.Map<com.moloco.sdk.internal.publisher.t, kotlin.time.Duration> adTimeouts, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTimeouts, "adTimeouts");
        return new com.moloco.sdk.internal.publisher.C3419c(adTimeouts, j, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.moloco.sdk.internal.publisher.C3419c a(com.moloco.sdk.internal.publisher.C3419c c3419c, java.util.Map map, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = c3419c.f7090a;
        }
        if ((i & 2) != 0) {
            j = c3419c.b;
        }
        return c3419c.a(map, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C3419c(java.util.Map map, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? kotlin.time.DurationKt.toDuration(5, kotlin.time.DurationUnit.SECONDS) : j, null);
        long duration;
        if ((i & 1) != 0) {
            com.moloco.sdk.internal.publisher.t[] values = com.moloco.sdk.internal.publisher.t.values();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(values.length), 16));
            for (com.moloco.sdk.internal.publisher.t tVar : values) {
                switch (com.moloco.sdk.internal.publisher.C3419c.a.f7091a[tVar.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        duration = kotlin.time.DurationKt.toDuration(5, kotlin.time.DurationUnit.SECONDS);
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        duration = kotlin.time.DurationKt.toDuration(15, kotlin.time.DurationUnit.SECONDS);
                        break;
                    default:
                        throw new kotlin.NoWhenBranchMatchedException();
                }
                linkedHashMap.put(tVar, kotlin.time.Duration.m12144boximpl(duration));
            }
            map = linkedHashMap;
        }
    }
}
