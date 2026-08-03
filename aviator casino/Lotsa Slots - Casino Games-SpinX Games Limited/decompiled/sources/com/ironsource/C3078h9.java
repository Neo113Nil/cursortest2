package com.ironsource;

/* renamed from: com.ironsource.h9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3078h9 {

    /* renamed from: com.ironsource.h9$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6286a;

        static {
            int[] iArr = new int[com.unity3d.ironsourceads.IronSourceAds.AdFormat.values().length];
            try {
                iArr[com.unity3d.ironsourceads.IronSourceAds.AdFormat.BANNER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.unity3d.ironsourceads.IronSourceAds.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.unity3d.ironsourceads.IronSourceAds.AdFormat.REWARDED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f6286a = iArr;
        }
    }

    public final void a(java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.ironsource.Q7.a(com.ironsource.Q7.f5934a, runnable, 0L, 2, null);
    }

    public final void b(java.lang.Runnable callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        com.ironsource.Q7.f5934a.a(callback);
    }

    public final com.ironsource.mediationsdk.IronSource.a[] a(java.util.List<? extends com.unity3d.ironsourceads.IronSourceAds.AdFormat> adFormats) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<? extends com.unity3d.ironsourceads.IronSourceAds.AdFormat> it = adFormats.iterator();
        while (it.hasNext()) {
            int i = com.ironsource.C3078h9.a.f6286a[it.next().ordinal()];
            if (i == 1) {
                arrayList.add(com.ironsource.mediationsdk.IronSource.a.BANNER);
            } else if (i == 2) {
                arrayList.add(com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL);
            } else if (i == 3) {
                arrayList.add(com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO);
            }
        }
        return (com.ironsource.mediationsdk.IronSource.a[]) arrayList.toArray(new com.ironsource.mediationsdk.IronSource.a[0]);
    }

    public final com.ironsource.C3226pe b(com.ironsource.C3226pe error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        return error.c() == 2080 ? new com.ironsource.C3226pe(error.c(), "serverResponseIsNotValid") : error;
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError a(com.ironsource.C3226pe error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        if (error.c() != 2070 && error.c() != 2110) {
            if (error.c() != 2080 && error.c() != 2100) {
                if (error.c() == 2090) {
                    return com.ironsource.C3306u5.f6757a.a();
                }
                return new com.ironsource.mediationsdk.logger.IronSourceError(510, error.d());
            }
            return com.ironsource.C3306u5.f6757a.c();
        }
        return com.ironsource.C3306u5.f6757a.b();
    }

    public final void a(long j, com.ironsource.Ve.a responseOrigin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseOrigin, "responseOrigin");
        org.json.JSONObject b = com.ironsource.mediationsdk.utils.IronSourceUtils.b(true);
        try {
            b.put("isMultipleAdObjects", 1);
            b.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, j);
            b.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, responseOrigin.b());
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        com.ironsource.Jb.u.d().q().a(new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.SDK_INIT_SUCCESS, b));
    }

    public final void a(com.ironsource.C3226pe error, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        org.json.JSONObject b = com.ironsource.mediationsdk.utils.IronSourceUtils.b(true);
        try {
            b.put("errorCode", error.c());
            b.put("reason", error.d());
            b.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, j);
            b.put("isMultipleAdObjects", 1);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        com.ironsource.Jb.u.d().q().a(new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.SDK_INIT_FAILED, b));
    }

    public final void a(long j, long j2, long j3, long j4, long j5) {
        org.json.JSONObject b = com.ironsource.mediationsdk.utils.IronSourceUtils.b(true);
        try {
            b.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, "parsingDurationMs=" + j + ";javaHeapKb=" + j2 + ";nativeHeapKb=" + j3 + ";sharedOtherKb=" + j4 + ";initResponseJsonSizeKb=" + j5);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        com.ironsource.Jb.u.d().q().a(new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.TROUBLESHOOTING_INIT_SUCCESS, b));
    }
}
