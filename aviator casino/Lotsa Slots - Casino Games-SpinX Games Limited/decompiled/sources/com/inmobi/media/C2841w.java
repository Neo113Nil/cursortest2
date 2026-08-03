package com.inmobi.media;

/* renamed from: com.inmobi.media.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2841w {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f5518a;
    public final com.inmobi.media.ads.network.inmobiJson.model.Image b;
    public final com.inmobi.media.core.config.models.AdConfig.AdChoiceConfig c;
    public final com.inmobi.media.C2799u9 d;
    public final java.lang.String e;

    public C2841w(android.content.Context context, com.inmobi.media.ads.network.inmobiJson.model.Image image, com.inmobi.media.core.config.models.AdConfig.AdChoiceConfig adChoiceConfig, com.inmobi.media.C2799u9 c2799u9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adChoiceConfig, "adChoiceConfig");
        this.f5518a = context;
        this.b = image;
        this.c = adChoiceConfig;
        this.d = c2799u9;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        this.e = "AdChoice-Image-" + uuid;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.inmobi.media.C2841w c2841w, com.inmobi.media.Tj tj, java.lang.String str, int i, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2733s c2733s;
        int i2;
        c2841w.getClass();
        if (continuationImpl instanceof com.inmobi.media.C2733s) {
            c2733s = (com.inmobi.media.C2733s) continuationImpl;
            int i3 = c2733s.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2733s.c = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = c2733s.f5434a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c2733s.c;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2815v c2815v = new com.inmobi.media.C2815v(c2841w, str, tj, null);
                    c2733s.c = 1;
                    obj = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(i, c2815v, c2733s);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bool == null ? bool.booleanValue() : false);
            }
        }
        c2733s = new com.inmobi.media.C2733s(c2841w, continuationImpl);
        java.lang.Object obj2 = c2733s.f5434a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c2733s.c;
        if (i2 != 0) {
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) obj2;
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bool2 == null ? bool2.booleanValue() : false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r0 == null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.inmobi.media.Gd gd) {
        java.lang.String url;
        int width;
        com.inmobi.media.ads.network.inmobiJson.model.Image image;
        int height;
        com.inmobi.media.ads.network.inmobiJson.model.Image image2 = this.b;
        if (image2 != null && (url = image2.getUrl()) != null) {
            if (!android.webkit.URLUtil.isNetworkUrl(url)) {
                url = null;
            }
        }
        url = this.c.getUrl();
        java.lang.String str = url;
        com.inmobi.media.ads.network.inmobiJson.model.Image image3 = this.b;
        if (image3 != null) {
            int width2 = image3.getWidth();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(width2);
            if (width2 <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                width = valueOf.intValue();
                int i = width;
                image = this.b;
                if (image != null) {
                    int height2 = image.getHeight();
                    java.lang.Integer valueOf2 = height2 > 0 ? java.lang.Integer.valueOf(height2) : null;
                    if (valueOf2 != null) {
                        height = valueOf2.intValue();
                        int i2 = height;
                        int loadTimeout = this.c.getLoadTimeout();
                        if (!android.webkit.URLUtil.isNetworkUrl(str)) {
                            com.inmobi.media.C2799u9 c2799u9 = this.d;
                            if (c2799u9 != null) {
                                c2799u9.b("AdChoiceViewManager", "Invalid URL: " + str);
                            }
                            throw new com.inmobi.media.C2562lc();
                        }
                        return kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.inmobi.media.r(this, str, loadTimeout, i, i2, null), gd);
                    }
                }
                height = this.c.getHeight();
                int i22 = height;
                int loadTimeout2 = this.c.getLoadTimeout();
                if (!android.webkit.URLUtil.isNetworkUrl(str)) {
                }
            }
        }
        width = this.c.getWidth();
        int i3 = width;
        image = this.b;
        if (image != null) {
        }
        height = this.c.getHeight();
        int i222 = height;
        int loadTimeout22 = this.c.getLoadTimeout();
        if (!android.webkit.URLUtil.isNetworkUrl(str)) {
        }
    }
}
