package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.xg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4217xg extends Sp {
    public static final /* synthetic */ int g = 0;
    public final Tp d;
    public InterfaceC3752h1 e;
    public final Y9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4217xg(Ej adContainer, Tp mViewableAd, InterfaceC3752h1 interfaceC3752h1, Y9 y9) {
        super(adContainer);
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        Intrinsics.checkNotNullParameter(mViewableAd, "mViewableAd");
        this.d = mViewableAd;
        this.e = interfaceC3752h1;
        this.f = y9;
    }

    @Override // com.inmobi.media.Tp
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        AdSession adSession;
        Intrinsics.checkNotNullParameter(childView, "childView");
        Intrinsics.checkNotNullParameter(obstructionCode, "obstructionCode");
        Y9 y9 = this.f;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("xg", "TAG");
            ((Z9) y9).a("xg", "addFriendlyView with obstruction code: " + obstructionCode);
        }
        InterfaceC3752h1 interfaceC3752h1 = this.e;
        if (interfaceC3752h1 != null) {
            C3880lg c3880lg = (C3880lg) interfaceC3752h1;
            Intrinsics.checkNotNullParameter(childView, "childView");
            Intrinsics.checkNotNullParameter(obstructionCode, "obstructionCode");
            if (C3880lg.a(c3880lg.e) && (adSession = c3880lg.f) != null) {
                adSession.addFriendlyObstruction(childView, obstructionCode, null);
            }
        }
        this.d.a(childView, obstructionCode);
    }

    @Override // com.inmobi.media.Tp
    public final View b() {
        return this.d.b();
    }

    @Override // com.inmobi.media.Tp
    public final View c() {
        Y9 y9 = this.f;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("xg", "TAG");
            ((Z9) y9).c("xg", "inflateView called");
        }
        return this.d.c();
    }

    @Override // com.inmobi.media.Tp
    public final boolean d() {
        InterfaceC3752h1 interfaceC3752h1 = this.e;
        return !(interfaceC3752h1 == null || ((C3880lg) interfaceC3752h1).f == null) || this.d.d();
    }

    @Override // com.inmobi.media.Tp
    public final void e() {
        try {
            Y9 y9 = this.f;
            if (y9 != null) {
                Intrinsics.checkNotNullExpressionValue("xg", "TAG");
                ((Z9) y9).a("xg", "stopTrackingForImpression");
            }
            InterfaceC3752h1 interfaceC3752h1 = this.e;
            if (interfaceC3752h1 != null) {
                C3880lg c3880lg = (C3880lg) interfaceC3752h1;
                AdSession adSession = c3880lg.f;
                if (adSession != null) {
                    adSession.finish();
                }
                c3880lg.f = null;
                c3880lg.e = (byte) 3;
                c3880lg.c = null;
            }
        } catch (Exception e) {
            Y9 y92 = this.f;
            if (y92 != null) {
                Intrinsics.checkNotNullExpressionValue("xg", "TAG");
                ((Z9) y92).b("xg", "Exception in stopTrackingForImpression with message : " + e.getMessage());
            }
        } finally {
            this.d.e();
        }
    }

    @Override // com.inmobi.media.Tp
    public final void a(View childView) {
        AdSession adSession;
        Intrinsics.checkNotNullParameter(childView, "childView");
        InterfaceC3752h1 interfaceC3752h1 = this.e;
        if (interfaceC3752h1 != null) {
            C3880lg c3880lg = (C3880lg) interfaceC3752h1;
            Intrinsics.checkNotNullParameter(childView, "childView");
            if (C3880lg.a(c3880lg.e) && (adSession = c3880lg.f) != null) {
                adSession.removeFriendlyObstruction(childView);
            }
        }
        this.d.a(childView);
    }

    @Override // com.inmobi.media.Tp
    public final void a(Map map) {
        Y9 y9 = this.f;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("xg", "TAG");
            ((Z9) y9).a("xg", "startTrackingForImpression");
        }
        try {
            if (this.c.getViewability().getOmidConfig().isOmidEnabled()) {
                Fg.f6559a.getClass();
                if (Omid.isActive()) {
                    View b = this.d.b();
                    WebView webView = b instanceof WebView ? (WebView) b : null;
                    if (webView != null) {
                        Y9 y92 = this.f;
                        if (y92 != null) {
                            Intrinsics.checkNotNullExpressionValue("xg", "TAG");
                            ((Z9) y92).a("xg", "creating OMSDK session");
                        }
                        InterfaceC3752h1 interfaceC3752h1 = this.e;
                        if (interfaceC3752h1 != null) {
                            ((C3880lg) interfaceC3752h1).a(webView, map);
                        }
                    }
                }
            }
        } catch (Exception e) {
            Y9 y93 = this.f;
            if (y93 != null) {
                Intrinsics.checkNotNullExpressionValue("xg", "TAG");
                ((Z9) y93).b("xg", "Exception in startTrackingForImpression with message : " + e.getMessage());
            }
        } finally {
            this.d.a(map);
        }
    }

    @Override // com.inmobi.media.Tp
    public final void a(Context context, byte b) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.d.a(context, b);
    }

    @Override // com.inmobi.media.Tp
    public final void a() {
        Y9 y9 = this.f;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("xg", "TAG");
            ((Z9) y9).c("xg", "destroy");
        }
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            weakReference.clear();
        }
        try {
            this.e = null;
        } catch (Exception e) {
            Y9 y92 = this.f;
            if (y92 != null) {
                Intrinsics.checkNotNullExpressionValue("xg", "TAG");
                ((Z9) y92).a("xg", "Exception in destroy with message", e);
            }
        } finally {
            this.d.a();
        }
    }
}
