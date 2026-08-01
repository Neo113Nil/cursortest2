package com.mbridge.msdk.config.component.common.kit;

import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.adsession.media.Position;
import com.iab.omid.library.mmadbridge.adsession.media.VastProperties;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.omsdk.b;
import java.util.Iterator;

/* compiled from: OmSdkKit.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private AdSession f8948a;
    private AdEvents b;
    private MediaEvents c;
    private com.mbridge.msdk.config.dynamic.binddata.wrapper.a d;

    private void b() {
        if (this.c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSDKResume");
            this.c.resume();
        } catch (Exception e) {
            q0.b("OmSdkKit", e.getMessage(), e);
        }
    }

    private void c() {
        if (this.c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkBuffEnd");
            this.c.bufferFinish();
        } catch (Exception e) {
            q0.b("OmSdkKit", e.getMessage(), e);
        }
    }

    private void d() {
        if (this.c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkBuffStart");
            this.c.bufferStart();
        } catch (Exception e) {
            q0.b("OmSdkKit", e.getMessage(), e);
        }
    }

    private void e() {
    }

    private void f() {
        if (this.c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkClick");
            this.c.adUserInteraction(InteractionType.CLICK);
        } catch (Exception e) {
            q0.b("OmSdkKit", e.getMessage(), e);
        }
    }

    private void g() {
        if (this.f8948a != null) {
            try {
                q0.b("OMSDK_TAG", "onOMSdkDestory");
                this.f8948a.removeAllFriendlyObstructions();
                this.f8948a.finish();
                this.f8948a = null;
            } catch (Exception e) {
                q0.b("OmSdkKit", e.getMessage(), e);
            }
        }
    }

    private void h() {
        if (this.c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkPause");
            this.c.pause();
        } catch (Exception e) {
            q0.b("OmSdkKit", e.getMessage(), e);
        }
    }

    private void i() {
    }

    private void j() {
        if (this.c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkSkipped");
            this.c.skipped();
        } catch (Exception e) {
            q0.b("OmSdkKit", e.getMessage(), e);
        }
    }

    private void k() {
        if (this.f8948a != null) {
            try {
                q0.b("OMSDK_TAG", "onOMSdkStart");
                this.f8948a.start();
                if (this.b != null) {
                    this.b.loaded(VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
                    this.b.impressionOccurred();
                }
                com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.d;
                if (aVar != null && !aVar.d()) {
                    Object b = this.d.b("viewTag");
                    Object b2 = this.d.b("rootView");
                    if ((b instanceof String) && (b2 instanceof ViewGroup)) {
                        String valueOf = String.valueOf(b);
                        ViewGroup viewGroup = (ViewGroup) b2;
                        this.f8948a.registerAdView(viewGroup.findViewWithTag(valueOf));
                        Iterator<View> it = c.a(viewGroup, valueOf).iterator();
                        while (it.hasNext()) {
                            this.f8948a.addFriendlyObstruction(it.next(), FriendlyObstructionPurpose.OTHER, null);
                        }
                    }
                }
            } catch (Exception e) {
                q0.b("OmSdkKit", e.getMessage(), e);
            }
        }
    }

    public void a(String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        this.d = aVar;
        a(str);
    }

    private void a(String str) {
        if (this.d == null) {
        }
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "onDestroy":
                g();
                break;
            case "PlayerPlayPlaying":
                b();
                break;
            case "PlayerPlayPause":
                h();
                break;
            case "PlayerPlayStart":
                k();
                break;
            case "onAdClick":
                f();
                break;
            case "onBufferingEnd":
                c();
                break;
            case "onCreate":
                a();
                break;
            case "PlayerPlayMuteChanged":
                e();
                break;
            case "PlayerProgressChanged":
                i();
                break;
            case "onBufferingStart":
                d();
                break;
            case "skipped":
                j();
                break;
        }
    }

    private void a() {
        try {
            if (this.d.a((Object) "g0")) {
                Object b = this.d.b("g0");
                if (b instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) b;
                    AdSession a2 = b.a(com.mbridge.msdk.foundation.controller.c.n().d(), false, String.valueOf(aVar.b(CampaignEx.KEY_OMID)), String.valueOf(aVar.b("requestId")), String.valueOf(aVar.b("id")), String.valueOf(aVar.b("campaignUnitId")), String.valueOf(aVar.b("videoURL")), String.valueOf(aVar.b("requestNoticeId")));
                    this.f8948a = a2;
                    if (a2 != null) {
                        this.b = AdEvents.createAdEvents(a2);
                        this.c = MediaEvents.createMediaEvents(this.f8948a);
                    }
                }
            }
        } catch (Exception e) {
            q0.b("OmSdkKit", e.getMessage(), e);
        }
    }
}
