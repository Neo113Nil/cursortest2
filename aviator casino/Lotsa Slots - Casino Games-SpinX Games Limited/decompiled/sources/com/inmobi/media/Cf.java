package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Cf {
    public static com.inmobi.media.C2723rf a(java.lang.String creativeType, com.inmobi.media.GestureDetectorOnGestureListenerC2675pi webView, boolean z, java.lang.String str, byte b, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        com.inmobi.media.Kf kf = com.inmobi.media.Jf.f4781a;
        kf.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "webView");
        com.iab.omid.library.inmobi.adsession.AdSessionContext createHtmlAdSessionContext = com.iab.omid.library.inmobi.adsession.AdSessionContext.createHtmlAdSessionContext(kf.b, webView, str, str2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createHtmlAdSessionContext, "createHtmlAdSessionContext(...)");
        com.iab.omid.library.inmobi.adsession.ImpressionType impressionType = b == 1 ? com.iab.omid.library.inmobi.adsession.ImpressionType.DEFINED_BY_JAVASCRIPT : b == 2 ? com.iab.omid.library.inmobi.adsession.ImpressionType.UNSPECIFIED : b == 3 ? com.iab.omid.library.inmobi.adsession.ImpressionType.LOADED : b == 4 ? com.iab.omid.library.inmobi.adsession.ImpressionType.BEGIN_TO_RENDER : b == 5 ? com.iab.omid.library.inmobi.adsession.ImpressionType.ONE_PIXEL : b == 6 ? com.iab.omid.library.inmobi.adsession.ImpressionType.VIEWABLE : b == 7 ? com.iab.omid.library.inmobi.adsession.ImpressionType.AUDIBLE : b == 0 ? com.iab.omid.library.inmobi.adsession.ImpressionType.OTHER : com.iab.omid.library.inmobi.adsession.ImpressionType.OTHER;
        int hashCode = creativeType.hashCode();
        if (hashCode != -284840886) {
            if (hashCode != 93166550) {
                if (hashCode != 112202875) {
                    if (hashCode == 1425678798 && creativeType.equals("nonvideo")) {
                        return new com.inmobi.media.C2723rf("html_display_ad", impressionType, createHtmlAdSessionContext, false);
                    }
                } else if (creativeType.equals("video")) {
                    return new com.inmobi.media.C2723rf("html_video_ad", impressionType, createHtmlAdSessionContext, z);
                }
            } else if (creativeType.equals("audio")) {
                return new com.inmobi.media.C2723rf("html_audio_ad", impressionType, createHtmlAdSessionContext, z);
            }
        } else if (creativeType.equals("unknown")) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Df", "access$getTAG$cp(...)");
            return null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Df", "access$getTAG$cp(...)");
        return null;
    }
}
