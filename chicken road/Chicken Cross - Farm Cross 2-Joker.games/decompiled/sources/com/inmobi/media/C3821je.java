package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.webkit.URLUtil;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.je, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3821je {

    /* renamed from: a, reason: collision with root package name */
    public final C3850ke f7181a;
    public long b;
    public String c;
    public String d;
    public final Ub e;

    public C3821je(C3850ke landingPageModel) {
        Intrinsics.checkNotNullParameter(landingPageModel, "landingPageModel");
        this.f7181a = landingPageModel;
        C3766he c3766he = new C3766he(this);
        C3794ie c3794ie = new C3794ie(this);
        this.e = new Ub(landingPageModel.f7202a, new Vb(false, landingPageModel.d.i, landingPageModel.b.f6590a.b.getCctEnabled(), 16), c3766he, c3794ie, landingPageModel.d, landingPageModel.g, 128);
    }

    public final void a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.b = elapsedRealtime;
        Y9 y9 = this.f7181a.g;
        if (y9 != null) {
            ((Z9) y9).a("PublisherViewClickHandler", "handleLandingPageUrl: viewTouchTimestamp=" + elapsedRealtime + ", lastClickedAssetUrl=" + this.c);
        }
        String str = this.c;
        if (str != null) {
            a(str, this.d);
        }
    }

    public final void b(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        Y9 y9 = this.f7181a.g;
        if (y9 != null) {
            ((Z9) y9).a("PublisherViewClickHandler", "handleNativeAssetClickUrl: url=" + url + ", fallbackUrl=" + str);
        }
        this.c = url;
        this.d = str;
        C3850ke c3850ke = this.f7181a;
        if (c3850ke.b.f6590a.f7340a.g) {
            Y9 y92 = c3850ke.g;
            if (y92 != null) {
                ((Z9) y92).a("PublisherViewClickHandler", "Lock screen ad clicked, firing callback only");
            }
            ((AbstractC3750h) this.f7181a.f).a(MapsKt.emptyMap());
            return;
        }
        Y9 y93 = c3850ke.g;
        if (y93 != null) {
            ((Z9) y93).a("PublisherViewClickHandler", "Firing onAdClicked callback and handling landing page URL");
        }
        ((AbstractC3750h) this.f7181a.f).a(MapsKt.emptyMap());
        a();
    }

    public final void a(String str, String str2) {
        Y9 y9 = this.f7181a.g;
        if (y9 != null) {
            ((Z9) y9).a("PublisherViewClickHandler", "handleLandingPageUrl: processing url=" + str + ", isNetworkUrl=" + URLUtil.isNetworkUrl(str));
        }
        Tb a2 = Ub.a(this.e, "nativeOpen", (String) null, str, (Yb) null, 24);
        Y9 y92 = this.f7181a.g;
        if (y92 != null) {
            ((Z9) y92).a("PublisherViewClickHandler", "processOpenRequest result: " + a2.f6870a);
        }
        if (a2.f6870a == 1) {
            Y9 y93 = this.f7181a.g;
            if (y93 != null) {
                ((Z9) y93).a("PublisherViewClickHandler", "Redirection resolved successfully");
                return;
            }
            return;
        }
        if (str2 != null) {
            Y9 y94 = this.f7181a.g;
            if (y94 != null) {
                ((Z9) y94).a("PublisherViewClickHandler", "Primary URL failed, trying fallback URL: " + str2);
            }
            a(str2, null);
            return;
        }
        Y9 y95 = this.f7181a.g;
        if (y95 != null) {
            ((Z9) y95).b("PublisherViewClickHandler", "Landing Page Handling Failed - no fallback URL available");
        }
    }

    public final void b() {
        C3850ke c3850ke = this.f7181a;
        Y9 y9 = c3850ke.g;
        if (y9 != null) {
            ((Z9) y9).a("PublisherViewClickHandler", "takeAction called, isLockScreen=" + c3850ke.b.f6590a.f7340a.g);
        }
        if (this.f7181a.b.f6590a.f7340a.g) {
            a();
        }
    }

    public final void a(Intent intent) {
        C3850ke c3850ke = this.f7181a;
        Y9 y9 = c3850ke.g;
        if (y9 != null) {
            H h = c3850ke.b;
            Z9 z9 = (Z9) y9;
            z9.a("PublisherViewClickHandler", "openEmbeddedBrowser: creativeId=" + h.e + ", placementId=" + h.f6590a.f7340a.f7031a);
        }
        intent.putExtra("creativeId", this.f7181a.b.e);
        intent.putExtra("impressionId", this.f7181a.b.m.b);
        intent.putExtra("placementId", this.f7181a.b.f6590a.f7340a.f7031a);
        intent.putExtra("supportLockScreen", this.f7181a.c);
        Context context = AbstractC3914mk.f7252a;
        Context context2 = this.f7181a.f7202a;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (!(context2 instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context2.startActivity(intent);
        Y9 y92 = this.f7181a.g;
        if (y92 != null) {
            ((Z9) y92).a("PublisherViewClickHandler", "Embedded browser activity started");
        }
    }
}
