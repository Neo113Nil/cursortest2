package com.startapp.sdk.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.ActivityExtra;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class ka extends m8 implements com.startapp.sdk.adsbase.f {
    public ka(Context context, AdPreferences.Placement placement, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5, ib ibVar6, ib ibVar7, ib ibVar8, ib ibVar9) {
        super(context, placement, ibVar, ibVar2, ibVar3, ibVar4, ibVar5, ibVar6, ibVar7, ibVar8, ibVar9);
    }

    public boolean a() {
        return false;
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f
    public final Long getAdCacheTtl() {
        return super.getAdCacheTtl();
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f
    public final Long getLastLoadTime() {
        return super.getLastLoadTime();
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f
    public final boolean getVideoCancelCallBack() {
        return super.getVideoCancelCallBack();
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f
    public final boolean hasAdCacheTtlPassed() {
        return super.hasAdCacheTtlPassed();
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f
    public final void setVideoCancelCallBack(boolean z3) {
        super.setVideoCancelCallBack(z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.io.Serializable, java.lang.Boolean[]] */
    @Override // com.startapp.sdk.adsbase.f
    public final boolean a(String str) {
        int i3;
        String a3 = g0.a();
        if (a() && AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.DISABLED) && a3.equals("back")) {
            setNotDisplayedReason(NotDisplayedReason.VIDEO_BACK);
            return false;
        }
        if (!h0.f.booleanValue()) {
            setState(Ad.AdState.UN_INITIALIZED);
        }
        if (this.f4031b == null) {
            setNotDisplayedReason(NotDisplayedReason.INTERNAL_ERROR);
            return false;
        }
        if (super.hasAdCacheTtlPassed()) {
            setNotDisplayedReason(NotDisplayedReason.AD_EXPIRED);
            return false;
        }
        ActivityExtra activityExtra = this.activityExtra;
        boolean z3 = activityExtra != null && activityExtra.a();
        Intent intent = new Intent(this.context, (Class<?>) OverlayActivity.class);
        intent.putExtra("fileUrl", "exit.html");
        String[] strArr = this.f4037i;
        String concat = "&position=".concat(g0.a());
        for (int i4 = 0; i4 < strArr.length; i4++) {
            String str2 = strArr[i4];
            if (str2 != null && !"".equals(str2)) {
                strArr[i4] = B0.c.l(new StringBuilder(), strArr[i4], concat);
            }
        }
        synchronized (hh.class) {
            int i5 = hh.f3836a;
            i3 = i5 < Integer.MAX_VALUE ? i5 + 1 : 1;
            hh.f3836a = i3;
            HashMap hashMap = hh.f3837b;
            if (hashMap.containsKey(Integer.valueOf(i3))) {
                throw new IllegalStateException();
            }
            hashMap.put(Integer.valueOf(i3), this);
        }
        intent.putExtra("tracking", strArr);
        intent.putExtra("trackingClickUrl", this.f4035g);
        intent.putExtra("packageNames", this.f4030a);
        intent.putExtra("smartRedirect", this.f4036h);
        intent.putExtra("browserEnabled", this.f4044p);
        AdPreferences.Placement placement = this.placement;
        intent.putExtra("placement", placement != null ? placement.getIndex() : -1);
        intent.putExtra("adInfoOverride", getAdInfoOverride());
        intent.putExtra("ad", i3);
        intent.putExtra("videoAd", a());
        intent.putExtra("fullscreen", z3);
        int i6 = this.f4034e;
        if (i6 == 0) {
            i6 = this.context.getResources().getConfiguration().orientation;
        }
        intent.putExtra("orientation", i6);
        intent.putExtra("activityShouldLockOrientation", this.f);
        intent.putExtra("adTag", str);
        intent.putExtra("lastLoadTime", super.getLastLoadTime());
        intent.putExtra("adCacheTtl", super.getAdCacheTtl());
        intent.putExtra("closingUrl", this.f4042n);
        intent.putExtra("rewardDuration", this.f4040l);
        intent.putExtra("rewardedHideTimer", this.f4041m);
        Long l3 = this.f4038j;
        if (l3 != null) {
            intent.putExtra("delayImpressionSeconds", l3);
        }
        Long l4 = this.f4039k;
        if (l4 != null) {
            intent.putExtra("delayCloseInterval", l4);
        }
        intent.putExtra("sendRedirectHops", (Serializable) this.f4043o);
        intent.putExtra("position", a3);
        intent.addFlags(343932928);
        if (((g6) this.consentManager.a()).f3754e) {
            ((g6) this.consentManager.a()).f3753d = intent;
            return true;
        }
        try {
            this.context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e3) {
            Log.e("StartAppSDK", "Failed to show Ad for placement " + this.placement, e3);
            ((p) this.adCacheManager.a()).a(this.placement);
            return false;
        } catch (Throwable th) {
            hh.a(i3, Object.class);
            d9.a(th);
            return false;
        }
    }
}
