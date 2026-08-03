package com.inmobi.media;

/* renamed from: com.inmobi.media.rf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2723rf implements com.inmobi.media.InterfaceC2394f1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5428a;
    public final com.iab.omid.library.inmobi.adsession.ImpressionType b;
    public com.iab.omid.library.inmobi.adsession.AdSessionContext c;
    public final boolean d;
    public byte e;
    public com.iab.omid.library.inmobi.adsession.AdSession f;

    public C2723rf(java.lang.String mAdSessionType, com.iab.omid.library.inmobi.adsession.ImpressionType impressionType, com.iab.omid.library.inmobi.adsession.AdSessionContext adSessionContext, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mAdSessionType, "mAdSessionType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impressionType, "impressionType");
        this.f5428a = mAdSessionType;
        this.b = impressionType;
        this.c = adSessionContext;
        this.d = z;
    }

    public static boolean a(byte b) {
        if (b > 0) {
            return true;
        }
        kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
        com.inmobi.media.W9.a(new com.inmobi.media.M2(new java.lang.Exception("Omid AdSession State Error currentState :: " + ((int) b) + ", expectedState :: 1")));
        return false;
    }

    public static boolean b(byte b) {
        if (b == 1) {
            return true;
        }
        kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
        com.inmobi.media.W9.a(new com.inmobi.media.M2(new java.lang.Exception("Omid AdSession State Error currentState :: " + ((int) b) + ", expectedState :: 1")));
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(android.webkit.WebView view, java.util.Map map) {
        com.iab.omid.library.inmobi.adsession.AdSession adSession;
        com.iab.omid.library.inmobi.adsession.AdSession adSession2;
        com.iab.omid.library.inmobi.adsession.CreativeType creativeType;
        com.iab.omid.library.inmobi.adsession.Owner owner;
        com.iab.omid.library.inmobi.adsession.CreativeType creativeType2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "trackingView");
        if (this.f == null) {
            boolean z = this.d;
            com.iab.omid.library.inmobi.adsession.Owner owner2 = com.iab.omid.library.inmobi.adsession.Owner.JAVASCRIPT;
            com.iab.omid.library.inmobi.adsession.CreativeType creativeType3 = com.iab.omid.library.inmobi.adsession.CreativeType.DEFINED_BY_JAVASCRIPT;
            java.lang.String str = this.f5428a;
            switch (str.hashCode()) {
                case -2139264536:
                    if (str.equals("native_display_ad")) {
                        owner2 = com.iab.omid.library.inmobi.adsession.Owner.NATIVE;
                        owner = com.iab.omid.library.inmobi.adsession.Owner.NONE;
                        creativeType = com.iab.omid.library.inmobi.adsession.CreativeType.NATIVE_DISPLAY;
                        break;
                    }
                    creativeType = creativeType3;
                    owner = null;
                    break;
                case -1329992236:
                    if (str.equals("html_display_ad")) {
                        owner = com.iab.omid.library.inmobi.adsession.Owner.NONE;
                        creativeType = com.iab.omid.library.inmobi.adsession.CreativeType.HTML_DISPLAY;
                        break;
                    }
                    creativeType = creativeType3;
                    owner = null;
                    break;
                case -1191784049:
                    if (str.equals("native_video_ad")) {
                        owner2 = com.iab.omid.library.inmobi.adsession.Owner.NATIVE;
                        creativeType2 = com.iab.omid.library.inmobi.adsession.CreativeType.VIDEO;
                        creativeType = creativeType2;
                        owner = owner2;
                        break;
                    }
                    creativeType = creativeType3;
                    owner = null;
                    break;
                case 363190080:
                    if (str.equals("html_audio_ad")) {
                        creativeType2 = com.iab.omid.library.inmobi.adsession.CreativeType.AUDIO;
                        creativeType = creativeType2;
                        owner = owner2;
                        break;
                    }
                    creativeType = creativeType3;
                    owner = null;
                    break;
                case 538665083:
                    if (str.equals("html_video_ad")) {
                        creativeType2 = com.iab.omid.library.inmobi.adsession.CreativeType.VIDEO;
                        creativeType = creativeType2;
                        owner = owner2;
                        break;
                    }
                    creativeType = creativeType3;
                    owner = null;
                    break;
                default:
                    creativeType = creativeType3;
                    owner = null;
                    break;
            }
            com.iab.omid.library.inmobi.adsession.AdSession adSession3 = com.iab.omid.library.inmobi.adsession.AdSession.createAdSession(com.iab.omid.library.inmobi.adsession.AdSessionConfiguration.createAdSessionConfiguration(creativeType, this.b, owner2, owner, z), this.c);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adSession3, "createAdSession(...)");
            this.f = adSession3;
            if (adSession3 != null) {
                java.lang.String str2 = this.f5428a;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSession3, "adSession");
                if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "native_video_ad")) {
                    com.iab.omid.library.inmobi.adsession.media.MediaEvents.createMediaEvents(adSession3);
                    com.iab.omid.library.inmobi.adsession.AdEvents.createAdEvents(adSession3);
                } else {
                    com.iab.omid.library.inmobi.adsession.AdEvents.createAdEvents(adSession3);
                }
                this.e = (byte) 1;
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        if (b(this.e) && (adSession2 = this.f) != null) {
            adSession2.registerAdView(view);
        }
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                android.view.View childView = (android.view.View) entry.getKey();
                com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose obstructionCode = (com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose) entry.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childView, "childView");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obstructionCode, "obstructionCode");
                if (a(this.e) && (adSession = this.f) != null) {
                    adSession.addFriendlyObstruction(childView, obstructionCode, null);
                }
            }
        }
        if (b(this.e)) {
            com.iab.omid.library.inmobi.adsession.AdSession adSession4 = this.f;
            if (adSession4 != null) {
                adSession4.start();
            }
            this.e = (byte) 2;
        }
    }
}
