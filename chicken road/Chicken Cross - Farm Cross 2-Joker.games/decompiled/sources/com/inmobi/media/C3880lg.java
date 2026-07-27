package com.inmobi.media;

import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.CreativeType;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.Owner;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.lg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3880lg implements InterfaceC3752h1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7226a;
    public final ImpressionType b;
    public AdSessionContext c;
    public final boolean d;
    public byte e;
    public AdSession f;

    public C3880lg(String mAdSessionType, ImpressionType impressionType, AdSessionContext adSessionContext, boolean z) {
        Intrinsics.checkNotNullParameter(mAdSessionType, "mAdSessionType");
        Intrinsics.checkNotNullParameter(impressionType, "impressionType");
        this.f7226a = mAdSessionType;
        this.b = impressionType;
        this.c = adSessionContext;
        this.d = z;
    }

    public static boolean a(byte b) {
        if (b > 0) {
            return true;
        }
        Lazy lazy = Ba.f6473a;
        Ba.a(new C3810j3(new Exception("Omid AdSession State Error currentState :: " + ((int) b) + ", expectedState :: 1")));
        return false;
    }

    public static boolean b(byte b) {
        if (b == 1) {
            return true;
        }
        Lazy lazy = Ba.f6473a;
        Ba.a(new C3810j3(new Exception("Omid AdSession State Error currentState :: " + ((int) b) + ", expectedState :: 1")));
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(WebView view, Map map) {
        AdSession adSession;
        AdSession adSession2;
        CreativeType creativeType;
        Owner owner;
        CreativeType creativeType2;
        Intrinsics.checkNotNullParameter(view, "trackingView");
        if (this.e == 2) {
            return;
        }
        if (this.f == null) {
            boolean z = this.d;
            Owner owner2 = Owner.JAVASCRIPT;
            CreativeType creativeType3 = CreativeType.DEFINED_BY_JAVASCRIPT;
            String str = this.f7226a;
            switch (str.hashCode()) {
                case -2139264536:
                    if (str.equals("native_display_ad")) {
                        owner2 = Owner.NATIVE;
                        owner = Owner.NONE;
                        creativeType = CreativeType.NATIVE_DISPLAY;
                        break;
                    }
                    creativeType = creativeType3;
                    owner = null;
                    break;
                case -1329992236:
                    if (str.equals("html_display_ad")) {
                        owner = Owner.NONE;
                        creativeType = CreativeType.HTML_DISPLAY;
                        break;
                    }
                    creativeType = creativeType3;
                    owner = null;
                    break;
                case -1191784049:
                    if (str.equals("native_video_ad")) {
                        owner2 = Owner.NATIVE;
                        creativeType2 = CreativeType.VIDEO;
                        creativeType = creativeType2;
                        owner = owner2;
                        break;
                    }
                    creativeType = creativeType3;
                    owner = null;
                    break;
                case 363190080:
                    if (str.equals("html_audio_ad")) {
                        creativeType2 = CreativeType.AUDIO;
                        creativeType = creativeType2;
                        owner = owner2;
                        break;
                    }
                    creativeType = creativeType3;
                    owner = null;
                    break;
                case 538665083:
                    if (str.equals("html_video_ad")) {
                        creativeType2 = CreativeType.VIDEO;
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
            AdSession adSession3 = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, this.b, owner2, owner, z), this.c);
            Intrinsics.checkNotNullExpressionValue(adSession3, "createAdSession(...)");
            this.f = adSession3;
            if (adSession3 != null) {
                String str2 = this.f7226a;
                Intrinsics.checkNotNullParameter(adSession3, "adSession");
                if (Intrinsics.areEqual(str2, "native_video_ad")) {
                    MediaEvents.createMediaEvents(adSession3);
                    AdEvents.createAdEvents(adSession3);
                } else {
                    AdEvents.createAdEvents(adSession3);
                }
                this.e = (byte) 1;
            }
        }
        Intrinsics.checkNotNullParameter(view, "view");
        if (b(this.e) && (adSession2 = this.f) != null) {
            adSession2.registerAdView(view);
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                View childView = (View) entry.getKey();
                FriendlyObstructionPurpose obstructionCode = (FriendlyObstructionPurpose) entry.getValue();
                Intrinsics.checkNotNullParameter(childView, "childView");
                Intrinsics.checkNotNullParameter(obstructionCode, "obstructionCode");
                if (a(this.e) && (adSession = this.f) != null) {
                    adSession.addFriendlyObstruction(childView, obstructionCode, null);
                }
            }
        }
        if (b(this.e)) {
            AdSession adSession4 = this.f;
            if (adSession4 != null) {
                adSession4.start();
            }
            this.e = (byte) 2;
        }
    }
}
