package com.ironsource;

/* loaded from: classes5.dex */
public enum H3 {
    Day("d", 86400000),
    Hour(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, 3600000),
    Second(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, 1000);

    public static final com.ironsource.H3.a c = new com.ironsource.H3.a(null);

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f5737a;
    private final long b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.ironsource.H3 a(java.lang.String str) {
            for (com.ironsource.H3 h3 : com.ironsource.H3.values()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(h3.f5737a, str)) {
                    return h3;
                }
            }
            return null;
        }

        private a() {
        }
    }

    H3(java.lang.String str, long j) {
        this.f5737a = str;
        this.b = j;
    }

    public final long a(java.lang.Integer num) {
        return (num != null ? num.intValue() : 1) * this.b;
    }

    public static /* synthetic */ long a(com.ironsource.H3 h3, java.lang.Integer num, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inMilliseconds");
        }
        if ((i & 1) != 0) {
            num = 1;
        }
        return h3.a(num);
    }
}
