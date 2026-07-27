package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.json.JsonParser;
import com.startapp.sdk.ads.Orientation;
import com.startapp.sdk.ads.video.VideoAdDetails;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* loaded from: classes.dex */
public final class ij extends ka {

    /* renamed from: r, reason: collision with root package name */
    public VideoAdDetails f3886r;

    public ij(Context context, AdPreferences.Placement placement, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5, ib ibVar6, ib ibVar7, ib ibVar8, ib ibVar9) {
        super(context, placement, ibVar, ibVar2, ibVar3, ibVar4, ibVar5, ibVar6, ibVar7, ibVar8, ibVar9);
    }

    @Override // com.startapp.sdk.internal.ka
    public final boolean a() {
        return this.f3886r != null;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final a2 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        return str == null ? new j8(this.context, this, adPreferences, adEventListener, this.placement, this.adCacheManager, this.videoAdCacheManager, this.webViewFactory, this.httpClient, this.networkApiExecutor, this.eventTracer, this.motionProcessor, this.webViewCacheLoader) : new i8(this.context, this, adEventListener, this.webViewFactory, this.networkApiExecutor, this.eventTracer, this.webViewCacheLoader, str, this.httpClient);
    }

    @Override // com.startapp.sdk.internal.m8
    public final void d(String str) {
        super.d(str);
        String a3 = si.a(str, "@videoJson@", "@videoJson@");
        if (a3 != null) {
            VideoAdDetails videoAdDetails = (VideoAdDetails) JsonParser.fromJson(a3, VideoAdDetails.class);
            this.f3886r = videoAdDetails;
            if (videoAdDetails != null) {
                videoAdDetails.setup();
            }
        }
    }

    public final void a(ui uiVar, VideoConfig videoConfig, dj djVar) {
        this.f3886r = new VideoAdDetails(uiVar, videoConfig, djVar, this.context.getAssets());
        Integer num = uiVar.f4492q;
        if (num == null || uiVar.f4493r == null) {
            return;
        }
        if (num.intValue() <= uiVar.f4493r.intValue()) {
            Orientation orientation = Orientation.PORTRAIT;
            this.f4034e = 1;
        } else if (Orientation.LANDSCAPE == Orientation.PORTRAIT) {
            this.f4034e = 1;
        } else {
            this.f4034e = 2;
        }
    }
}
