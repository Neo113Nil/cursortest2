package com.unity3d.mediation;

/* loaded from: classes5.dex */
public final class LevelPlayAdSize {
    private static final int f = 320;
    private static final int g = 50;
    private static final int h = 320;
    private static final int i = 90;
    private static final int j = 300;
    private static final int k = 250;
    private static final int m = 90;

    /* renamed from: a, reason: collision with root package name */
    private int f8036a;
    private int b;
    private final java.lang.String c;
    private final boolean d;
    private final com.unity3d.mediation.LevelPlayAdSize e;
    public static final com.unity3d.mediation.LevelPlayAdSize.Companion Companion = new com.unity3d.mediation.LevelPlayAdSize.Companion(null);
    public static final com.unity3d.mediation.LevelPlayAdSize BANNER = new com.unity3d.mediation.LevelPlayAdSize(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, com.ironsource.mediationsdk.j.f6439a, false, null, 16, null);
    public static final com.unity3d.mediation.LevelPlayAdSize MEDIUM_RECTANGLE = new com.unity3d.mediation.LevelPlayAdSize(300, 250, com.ironsource.mediationsdk.j.g, false, null, 16, null);
    private static final int l = 728;
    public static final com.unity3d.mediation.LevelPlayAdSize LEADERBOARD = new com.unity3d.mediation.LevelPlayAdSize(l, 90, com.ironsource.mediationsdk.j.d, false, null, 16, null);
    public static final com.unity3d.mediation.LevelPlayAdSize LARGE = new com.unity3d.mediation.LevelPlayAdSize(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 90, com.ironsource.mediationsdk.j.b, false, null, 16, null);

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ com.unity3d.mediation.LevelPlayAdSize createAdaptiveAdSize$default(com.unity3d.mediation.LevelPlayAdSize.Companion companion, android.content.Context context, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            return companion.createAdaptiveAdSize(context, num);
        }

        @kotlin.jvm.JvmStatic
        public final com.unity3d.mediation.LevelPlayAdSize createAdSize$mediationsdk_release(java.lang.String adSize) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSize, "adSize");
            int hashCode = adSize.hashCode();
            if (hashCode != -96588539) {
                if (hashCode != 72205083) {
                    if (hashCode != 446888797) {
                        if (hashCode == 1951953708 && adSize.equals(com.ironsource.mediationsdk.j.f6439a)) {
                            return com.unity3d.mediation.LevelPlayAdSize.BANNER;
                        }
                    } else if (adSize.equals(com.ironsource.mediationsdk.j.d)) {
                        return com.unity3d.mediation.LevelPlayAdSize.LEADERBOARD;
                    }
                } else if (adSize.equals(com.ironsource.mediationsdk.j.b)) {
                    return com.unity3d.mediation.LevelPlayAdSize.LARGE;
                }
            } else if (adSize.equals(com.ironsource.mediationsdk.j.g)) {
                return com.unity3d.mediation.LevelPlayAdSize.MEDIUM_RECTANGLE;
            }
            throw new java.lang.IllegalArgumentException("Wrong Ad Size");
        }

        @kotlin.jvm.JvmStatic
        public final com.unity3d.mediation.LevelPlayAdSize createAdaptiveAdSize(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            return createAdaptiveAdSize$default(this, context, null, 2, null);
        }

        @kotlin.jvm.JvmStatic
        public final com.unity3d.mediation.LevelPlayAdSize createCustomSize(int i, int i2) {
            return new com.unity3d.mediation.LevelPlayAdSize(i, i2, com.ironsource.mediationsdk.j.f, false, null, 16, null);
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.unity3d.mediation.LevelPlayAdSize createAdaptiveAdSize(android.content.Context context, java.lang.Integer num) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            return new com.ironsource.C3070h1(new com.ironsource.C3158m0()).a(context, num);
        }
    }

    public LevelPlayAdSize(int i2, int i3, java.lang.String str, boolean z, com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize) {
        this.f8036a = i2;
        this.b = i3;
        this.c = str;
        this.d = z;
        this.e = levelPlayAdSize;
    }

    @kotlin.jvm.JvmStatic
    public static final com.unity3d.mediation.LevelPlayAdSize createAdaptiveAdSize(android.content.Context context) {
        return Companion.createAdaptiveAdSize(context);
    }

    @kotlin.jvm.JvmStatic
    public static final com.unity3d.mediation.LevelPlayAdSize createCustomSize(int i2, int i3) {
        return Companion.createCustomSize(i2, i3);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(com.unity3d.mediation.LevelPlayAdSize.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.unity3d.mediation.LevelPlayAdSize");
        com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize = (com.unity3d.mediation.LevelPlayAdSize) obj;
        return this.f8036a == levelPlayAdSize.f8036a && this.b == levelPlayAdSize.b && kotlin.jvm.internal.Intrinsics.areEqual(this.c, levelPlayAdSize.c);
    }

    public final java.lang.String getDescription() {
        return java.lang.String.valueOf(this.c);
    }

    public final com.unity3d.mediation.LevelPlayAdSize getFallbackAdSize$mediationsdk_release() {
        return this.e;
    }

    public final int getHeight() {
        return this.b;
    }

    public final int getWidth() {
        return this.f8036a;
    }

    public int hashCode() {
        int i2 = ((this.f8036a * 31) + this.b) * 31;
        java.lang.String str = this.c;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isAdaptive() {
        return this.d;
    }

    public java.lang.String toString() {
        return this.c + io.ktor.sse.ServerSentEventKt.SPACE + this.f8036a + "x" + this.b;
    }

    @kotlin.jvm.JvmStatic
    public static final com.unity3d.mediation.LevelPlayAdSize createAdaptiveAdSize(android.content.Context context, java.lang.Integer num) {
        return Companion.createAdaptiveAdSize(context, num);
    }

    public /* synthetic */ LevelPlayAdSize(int i2, int i3, java.lang.String str, boolean z, com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, (i4 & 4) != 0 ? null : str, z, (i4 & 16) != 0 ? null : levelPlayAdSize);
    }
}
