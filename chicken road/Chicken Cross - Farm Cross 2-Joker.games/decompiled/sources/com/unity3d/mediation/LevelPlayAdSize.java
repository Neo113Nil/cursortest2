package com.unity3d.mediation;

import android.content.Context;
import com.ironsource.C4399f1;
import com.ironsource.C4523m0;
import com.ironsource.mediationsdk.j;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.sse.ServerSentEventKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LevelPlayAdSize {
    private static final int f = 320;
    private static final int g = 50;
    private static final int h = 320;
    private static final int i = 90;
    private static final int j = 300;
    private static final int k = 250;
    private static final int m = 90;

    /* renamed from: a, reason: collision with root package name */
    private int f11679a;
    private int b;
    private final String c;
    private final boolean d;
    private final LevelPlayAdSize e;
    public static final Companion Companion = new Companion(null);
    public static final LevelPlayAdSize BANNER = new LevelPlayAdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, j.f8411a, false, null, 16, null);
    public static final LevelPlayAdSize MEDIUM_RECTANGLE = new LevelPlayAdSize(300, 250, j.g, false, null, 16, null);
    private static final int l = 728;
    public static final LevelPlayAdSize LEADERBOARD = new LevelPlayAdSize(l, 90, j.d, false, null, 16, null);
    public static final LevelPlayAdSize LARGE = new LevelPlayAdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 90, j.b, false, null, 16, null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ LevelPlayAdSize createAdaptiveAdSize$default(Companion companion, Context context, Integer num, int i, Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            return companion.createAdaptiveAdSize(context, num);
        }

        @JvmStatic
        public final LevelPlayAdSize createAdSize$mediationsdk_release(String adSize) {
            Intrinsics.checkNotNullParameter(adSize, "adSize");
            int hashCode = adSize.hashCode();
            if (hashCode != -96588539) {
                if (hashCode != 72205083) {
                    if (hashCode != 446888797) {
                        if (hashCode == 1951953708 && adSize.equals(j.f8411a)) {
                            return LevelPlayAdSize.BANNER;
                        }
                    } else if (adSize.equals(j.d)) {
                        return LevelPlayAdSize.LEADERBOARD;
                    }
                } else if (adSize.equals(j.b)) {
                    return LevelPlayAdSize.LARGE;
                }
            } else if (adSize.equals(j.g)) {
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            }
            throw new IllegalArgumentException("Wrong Ad Size");
        }

        @JvmStatic
        public final LevelPlayAdSize createAdaptiveAdSize(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return createAdaptiveAdSize$default(this, context, null, 2, null);
        }

        @JvmStatic
        public final LevelPlayAdSize createCustomSize(int i, int i2) {
            return new LevelPlayAdSize(i, i2, j.f, false, null, 16, null);
        }

        private Companion() {
        }

        @JvmStatic
        public final LevelPlayAdSize createAdaptiveAdSize(Context context, Integer num) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new C4399f1(new C4523m0()).a(context, num);
        }
    }

    public LevelPlayAdSize(int i2, int i3, String str, boolean z, LevelPlayAdSize levelPlayAdSize) {
        this.f11679a = i2;
        this.b = i3;
        this.c = str;
        this.d = z;
        this.e = levelPlayAdSize;
    }

    @JvmStatic
    public static final LevelPlayAdSize createAdaptiveAdSize(Context context) {
        return Companion.createAdaptiveAdSize(context);
    }

    @JvmStatic
    public static final LevelPlayAdSize createCustomSize(int i2, int i3) {
        return Companion.createCustomSize(i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(LevelPlayAdSize.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.unity3d.mediation.LevelPlayAdSize");
        LevelPlayAdSize levelPlayAdSize = (LevelPlayAdSize) obj;
        return this.f11679a == levelPlayAdSize.f11679a && this.b == levelPlayAdSize.b && Intrinsics.areEqual(this.c, levelPlayAdSize.c);
    }

    public final String getDescription() {
        return String.valueOf(this.c);
    }

    public final LevelPlayAdSize getFallbackAdSize$mediationsdk_release() {
        return this.e;
    }

    public final int getHeight() {
        return this.b;
    }

    public final int getWidth() {
        return this.f11679a;
    }

    public int hashCode() {
        int i2 = ((this.f11679a * 31) + this.b) * 31;
        String str = this.c;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isAdaptive() {
        return this.d;
    }

    public String toString() {
        return this.c + ServerSentEventKt.SPACE + this.f11679a + "x" + this.b;
    }

    @JvmStatic
    public static final LevelPlayAdSize createAdaptiveAdSize(Context context, Integer num) {
        return Companion.createAdaptiveAdSize(context, num);
    }

    public /* synthetic */ LevelPlayAdSize(int i2, int i3, String str, boolean z, LevelPlayAdSize levelPlayAdSize, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, (i4 & 4) != 0 ? null : str, z, (i4 & 16) != 0 ? null : levelPlayAdSize);
    }
}
