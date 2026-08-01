package com.applovin.impl;

import android.os.Bundle;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;

/* loaded from: classes5.dex */
public class z2 {

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f4572a = new StringBuilder();

    public z2 a(String str, Object obj) {
        return a(str, obj, "");
    }

    public z2 b(String str) {
        this.f4572a.append(str);
        return this;
    }

    public String toString() {
        return this.f4572a.toString();
    }

    public z2 a(String str, Object obj, String str2) {
        this.f4572a.append("\n").append(str).append(": ").append(obj).append(str2);
        return this;
    }

    public z2 b(com.applovin.impl.sdk.ad.b bVar) {
        a("Target", bVar.Z()).a("close_style", bVar.q()).a("close_delay_graphic", Long.valueOf(bVar.s()), CmcdData.Factory.STREAMING_FORMAT_SS);
        if (bVar instanceof com.applovin.impl.sdk.ad.a) {
            com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) bVar;
            a("HTML", aVar.h1().substring(0, Math.min(aVar.h1().length(), 64)));
        }
        if (bVar.hasVideoUrl()) {
            a("close_delay", Long.valueOf(bVar.f0()), CmcdData.Factory.STREAMING_FORMAT_SS).a("skip_style", bVar.X()).a("Streaming", Boolean.valueOf(bVar.D0())).a("Video Location", bVar.K());
        }
        return this;
    }

    public z2 a(String str) {
        this.f4572a.append("\n").append(str);
        return this;
    }

    public z2 a() {
        this.f4572a.append("\n========================================");
        return this;
    }

    public z2 a(com.applovin.impl.sdk.ad.b bVar) {
        boolean z = bVar instanceof u7;
        a("Format", bVar.getAdZone().d() != null ? bVar.getAdZone().d().getLabel() : null).a("Ad ID", Long.valueOf(bVar.getAdIdNumber())).a("Zone ID", bVar.getAdZone().e()).a("Ad Class", z ? "VastAd" : "AdServerAd");
        String dspName = bVar.getDspName();
        if (StringUtils.isValidString(dspName)) {
            a("DSP Name", dspName);
        }
        if (z) {
            a("VAST DSP", ((u7) bVar).n1());
        }
        return this;
    }

    public z2 a(c3 c3Var) {
        return a(AndroidInitializeBoldSDK.MSG_NETWORK, c3Var.c()).a("Adapter Version", c3Var.A()).a("Format", c3Var.getFormat().getLabel()).a("Ad Unit ID", c3Var.getAdUnitId()).a("Placement", c3Var.getPlacement()).a("Network Placement", c3Var.U()).a("Serve ID", c3Var.T()).a("Creative ID", StringUtils.isValidString(c3Var.getCreativeId()) ? c3Var.getCreativeId() : "None").a("Ad Domain", StringUtils.isValidString(c3Var.v()) ? c3Var.v() : "None").a("DSP Name", StringUtils.isValidString(c3Var.getDspName()) ? c3Var.getDspName() : "None").a("DSP ID", StringUtils.isValidString(c3Var.getDspId()) ? c3Var.getDspId() : "None").a("Server Parameters", c3Var.l());
    }

    public z2 a(AppLovinAdView appLovinAdView) {
        return a("Size", appLovinAdView.getSize().getWidth() + "x" + appLovinAdView.getSize().getHeight()).a("Alpha", Float.valueOf(appLovinAdView.getAlpha())).a("Visibility", j8.a(appLovinAdView.getVisibility()));
    }

    public z2 a(com.applovin.impl.sdk.l lVar) {
        return a("Muted", Boolean.valueOf(lVar.p0().isMuted()));
    }

    public z2 a(Bundle bundle) {
        if (bundle == null) {
            return this;
        }
        for (String str : bundle.keySet()) {
            a(str, bundle.get(str));
        }
        return this;
    }
}
