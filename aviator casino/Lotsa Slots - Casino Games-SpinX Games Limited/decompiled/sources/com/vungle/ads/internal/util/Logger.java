package com.vungle.ads.internal.util;

/* compiled from: Logger.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/vungle/ads/internal/util/Logger;", "", "()V", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class Logger {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.vungle.ads.internal.util.Logger.Companion INSTANCE = new com.vungle.ads.internal.util.Logger.Companion(null);
    private static final kotlin.text.Regex IP_REGEX = new kotlin.text.Regex("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
    private static boolean enabled;

    @kotlin.jvm.JvmStatic
    public static final int d(java.lang.String str, java.lang.String str2) {
        return INSTANCE.d(str, str2);
    }

    @kotlin.jvm.JvmStatic
    public static final int e(java.lang.String str, java.lang.String str2) {
        return INSTANCE.e(str, str2);
    }

    @kotlin.jvm.JvmStatic
    public static final int e(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        return INSTANCE.e(str, str2, th);
    }

    @kotlin.jvm.JvmStatic
    public static final int i(java.lang.String str, java.lang.String str2) {
        return INSTANCE.i(str, str2);
    }

    @kotlin.jvm.JvmStatic
    public static final int w(java.lang.String str, java.lang.String str2) {
        return INSTANCE.w(str, str2);
    }

    @kotlin.jvm.JvmStatic
    public static final int w(java.lang.String str, kotlin.jvm.functions.Function0<java.lang.String> function0) {
        return INSTANCE.w(str, function0);
    }

    /* compiled from: Logger.kt */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0007J \u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0011J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u001e\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0014H\u0007J\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0011\u0010\u0015\u001a\u00020\n*\u00020\nH\u0001¢\u0006\u0002\b\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/vungle/ads/internal/util/Logger$Companion;", "", "()V", "IP_REGEX", "Lkotlin/text/Regex;", "enabled", "", "d", "", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY, "", "message", "e", "throwable", "", com.ironsource.mediationsdk.metadata.a.j, "", "enable$vungle_ads_release", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "w", "Lkotlin/Function0;", "eraseSensitiveData", "eraseSensitiveData$vungle_ads_release", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ void enable$vungle_ads_release(boolean enabled) {
            com.vungle.ads.internal.util.Logger.Companion companion = com.vungle.ads.internal.util.Logger.INSTANCE;
            com.vungle.ads.internal.util.Logger.enabled = enabled;
        }

        @kotlin.jvm.JvmStatic
        public final int d(java.lang.String tag, java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            if (com.vungle.ads.internal.util.Logger.enabled) {
                return android.util.Log.d(tag, eraseSensitiveData$vungle_ads_release(message));
            }
            return -1;
        }

        @kotlin.jvm.JvmStatic
        public final int e(java.lang.String tag, java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            if (com.vungle.ads.internal.util.Logger.enabled) {
                return android.util.Log.e(tag, eraseSensitiveData$vungle_ads_release(message));
            }
            return -1;
        }

        @kotlin.jvm.JvmStatic
        public final int e(java.lang.String tag, java.lang.String message, java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "throwable");
            if (!com.vungle.ads.internal.util.Logger.enabled) {
                return -1;
            }
            return android.util.Log.e(tag, eraseSensitiveData$vungle_ads_release(message) + "; error: " + throwable.getLocalizedMessage());
        }

        @kotlin.jvm.JvmStatic
        public final int w(java.lang.String tag, java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            if (com.vungle.ads.internal.util.Logger.enabled) {
                return android.util.Log.w(tag, eraseSensitiveData$vungle_ads_release(message));
            }
            return -1;
        }

        @kotlin.jvm.JvmStatic
        public final int w(java.lang.String tag, kotlin.jvm.functions.Function0<java.lang.String> message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            if (com.vungle.ads.internal.util.Logger.enabled) {
                return android.util.Log.w(tag, eraseSensitiveData$vungle_ads_release(message.invoke()));
            }
            return -1;
        }

        @kotlin.jvm.JvmStatic
        public final int i(java.lang.String tag, java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            if (com.vungle.ads.internal.util.Logger.enabled) {
                return android.util.Log.i(tag, eraseSensitiveData$vungle_ads_release(message));
            }
            return -1;
        }

        public final /* synthetic */ java.lang.String eraseSensitiveData$vungle_ads_release(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
            return com.vungle.ads.internal.util.Logger.IP_REGEX.replace(str, "xxx.xxx.xxx.xxx");
        }
    }
}
