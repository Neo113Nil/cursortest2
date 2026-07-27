package com.startapp.sdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.json.JsonParser;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.List;

/* loaded from: classes.dex */
public final class i8 extends w7 {
    public final ij f;

    /* renamed from: g, reason: collision with root package name */
    public final ib f3858g;

    /* renamed from: h, reason: collision with root package name */
    public final ib f3859h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(Context context, ij videoEnabledAd, AdEventListener adEventListener, ib webViewFactory, ib networkApiExecutor, ib eventTracer, ib webViewCacheLoader, String adm, ib httpClient) {
        super(context, videoEnabledAd, adEventListener, networkApiExecutor, eventTracer, webViewCacheLoader, adm);
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(videoEnabledAd, "videoEnabledAd");
        kotlin.jvm.internal.j.e(webViewFactory, "webViewFactory");
        kotlin.jvm.internal.j.e(networkApiExecutor, "networkApiExecutor");
        kotlin.jvm.internal.j.e(eventTracer, "eventTracer");
        kotlin.jvm.internal.j.e(webViewCacheLoader, "webViewCacheLoader");
        kotlin.jvm.internal.j.e(adm, "adm");
        kotlin.jvm.internal.j.e(httpClient, "httpClient");
        this.f = videoEnabledAd;
        this.f3858g = webViewFactory;
        this.f3859h = httpClient;
    }

    public static final void a(i8 this$0, List errorTrackersUrls, VASTErrorCodes errorCode) {
        kotlin.jvm.internal.j.e(this$0, "this$0");
        kotlin.jvm.internal.j.e(errorTrackersUrls, "errorTrackersUrls");
        kotlin.jvm.internal.j.e(errorCode, "errorCode");
        j8.a(this$0.f3212c, this$0.f.f3886r, errorTrackersUrls, errorCode);
    }

    @Override // com.startapp.sdk.internal.w7, com.startapp.sdk.adsbase.d
    public final Object a(String adm) {
        Object obj;
        vi viVar;
        kotlin.jvm.internal.j.e(adm, "adm");
        try {
            VideoConfig F3 = AdsCommonMetaData.k().F();
            kotlin.jvm.internal.j.d(F3, "getVideoConfig(...)");
            MetaData E3 = MetaData.E();
            kotlin.jvm.internal.j.d(E3, "getInstance(...)");
            xi xiVar = (xi) JsonParser.fromJson(adm, xi.class);
            if (xiVar != null) {
                String vastTag = xiVar.getVastTag();
                if (vastTag != null) {
                    String d02 = E3.d0();
                    if (!xiVar.isRecordHops() || TextUtils.isEmpty(d02)) {
                        viVar = null;
                    } else {
                        ib ibVar = this.f3859h;
                        kotlin.jvm.internal.j.b(d02);
                        viVar = new vi(ibVar, d02, xiVar.getPartnerResponse(), xiVar.getPartnerName(), xiVar.isSkipFailed());
                    }
                    aj ajVar = new aj(this.f3212c, ((rk) this.f3858g.a()).a());
                    ajVar.f = F3.f();
                    ajVar.f3472c = new F1.b(19, this);
                    ui a3 = ajVar.a(vastTag, viVar, xiVar.getEndCard(), xiVar.getMaxEndCards());
                    if (a3 != null) {
                        Ad ad = this.f3210a;
                        dj djVar = (ad != null ? ad.getType() : null) != Ad.AdType.REWARDED_VIDEO ? new dj(xiVar.getSkipafter(), xiVar.getSkipmin()) : null;
                        Ad ad2 = this.f3210a;
                        ij ijVar = ad2 instanceof ij ? (ij) ad2 : null;
                        if (ijVar != null) {
                            ijVar.a(a3, F3, djVar);
                            String ttlSec = xiVar.getTtlSec();
                            if (ttlSec != null) {
                                ijVar.c(ttlSec);
                            }
                        }
                        String admTag = xiVar.getAdmTag();
                        obj = admTag != null ? super.a(admTag) : null;
                        if (obj != null) {
                        }
                    }
                    throw new RuntimeException("Vast config error");
                }
                obj = null;
                if (obj != null) {
                    return obj;
                }
            }
            return super.a(adm);
        } catch (Throwable th) {
            Ad ad3 = this.f3210a;
            ij ijVar2 = ad3 instanceof ij ? (ij) ad3 : null;
            if (ijVar2 != null) {
                ijVar2.setErrorMessage(th.getMessage());
            }
            return null;
        }
    }
}
