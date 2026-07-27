package com.chartboost.sdk.impl;

import android.view.View;
import com.chartboost.sdk.impl.ce;
import com.iab.omid.library.chartboost.Omid;
import com.iab.omid.library.chartboost.adsession.AdEvents;
import com.iab.omid.library.chartboost.adsession.AdSession;
import com.iab.omid.library.chartboost.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.chartboost.adsession.media.InteractionType;
import com.iab.omid.library.chartboost.adsession.media.MediaEvents;
import com.iab.omid.library.chartboost.adsession.media.PlayerState;
import com.iab.omid.library.chartboost.adsession.media.Position;
import com.iab.omid.library.chartboost.adsession.media.VastProperties;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class de {

    /* renamed from: a, reason: collision with root package name */
    public final ce.a f4732a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;

    public de(ce.a sessionHolder, boolean z) {
        Intrinsics.checkNotNullParameter(sessionHolder, "sessionHolder");
        this.f4732a = sessionHolder;
        this.b = z;
    }

    public final void a(Integer num) {
        VastProperties createVastPropertiesForNonSkippableMedia;
        if (!this.b) {
            mb.b("OMSDK signal load OM is disabled by the cb config!", (Throwable) null, 2, (Object) null);
            return;
        }
        try {
            AdEvents b = this.f4732a.b();
            if (b == null) {
                mb.a("Omid load event is null!", (Throwable) null, 2, (Object) null);
                return;
            }
            boolean z = num != null && num.intValue() > 0;
            if (z) {
                if (z) {
                    createVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForSkippableMedia(num != null ? num.intValue() : 0.0f, true, Position.STANDALONE);
                } else {
                    createVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                }
                b.loaded(createVastPropertiesForNonSkippableMedia);
            } else {
                b.loaded();
            }
            mb.a("Signal om ad event loaded!", (Throwable) null, 2, (Object) null);
        } catch (Exception e) {
            mb.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c, e);
        }
    }

    public final void b() {
        try {
            MediaEvents a2 = a("signalMediaBufferFinish");
            if (a2 != null) {
                a2.bufferFinish();
            }
        } catch (Exception e) {
            mb.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c, e);
        }
    }

    public final void c() {
        try {
            MediaEvents a2 = a("signalMediaBufferStart");
            if (a2 != null) {
                a2.bufferStart();
            }
        } catch (Exception e) {
            mb.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c, e);
        }
    }

    public final void d() {
        try {
            MediaEvents a2 = a("signalMediaComplete");
            if (a2 != null) {
                a2.complete();
            }
            this.f = true;
        } catch (Exception e) {
            mb.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c, e);
        }
    }

    public final void e() {
        try {
            if (this.c) {
                return;
            }
            mb.a("Signal media first quartile", (Throwable) null, 2, (Object) null);
            MediaEvents a2 = a("signalMediaFirstQuartile");
            if (a2 != null) {
                a2.firstQuartile();
            }
            this.c = true;
        } catch (Exception e) {
            mb.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c, e);
        }
    }

    public final void f() {
        try {
            if (this.d) {
                return;
            }
            mb.a("Signal media midpoint", (Throwable) null, 2, (Object) null);
            MediaEvents a2 = a("signalMediaMidpoint");
            if (a2 != null) {
                a2.midpoint();
            }
            this.d = true;
        } catch (Exception e) {
            mb.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c, e);
        }
    }

    public final void g() {
        try {
            MediaEvents a2 = a("signalMediaPause");
            if (a2 != null) {
                a2.pause();
            }
        } catch (Exception e) {
            mb.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c, e);
        }
    }

    public final void h() {
        try {
            MediaEvents a2 = a("signalMediaResume");
            if (a2 != null) {
                a2.resume();
            }
        } catch (Exception e) {
            mb.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c, e);
        }
    }

    public final void i() {
        try {
            if (this.g || this.f) {
                return;
            }
            mb.a("Signal media skipped", (Throwable) null, 2, (Object) null);
            MediaEvents a2 = a("signalMediaSkipped");
            if (a2 != null) {
                a2.skipped();
            }
            this.g = true;
        } catch (Exception e) {
            mb.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c, e);
        }
    }

    public final void j() {
        try {
            if (this.e) {
                return;
            }
            mb.a("Signal media third quartile", (Throwable) null, 2, (Object) null);
            MediaEvents a2 = a("signalMediaThirdQuartile");
            if (a2 != null) {
                a2.thirdQuartile();
            }
            this.e = true;
        } catch (Exception e) {
            mb.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c, e);
        }
    }

    public final void k() {
        try {
            MediaEvents a2 = a("signalUserInteractionClick");
            if (a2 != null) {
                a2.adUserInteraction(InteractionType.CLICK);
            }
        } catch (Exception e) {
            mb.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c, e);
        }
    }

    public final void l() {
        if (!this.b) {
            mb.b("OMSDK start session OM is disabled by the cb config!", (Throwable) null, 2, (Object) null);
            return;
        }
        try {
            AdSession c = this.f4732a.c();
            if (c == null) {
                mb.a("Omid start session is null!", (Throwable) null, 2, (Object) null);
                return;
            }
            c.start();
            mb.a("Omid session started successfully! Version: " + Omid.getVersion(), (Throwable) null, 2, (Object) null);
        } catch (Exception e) {
            mb.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c, e);
        }
    }

    public final void m() {
        if (!this.b) {
            mb.b("OMSDK stop session OM is disabled by the cb config!", (Throwable) null, 2, (Object) null);
            return;
        }
        try {
            AdSession c = this.f4732a.c();
            if (c != null) {
                c.finish();
                c.registerAdView(null);
            }
            Omid.updateLastActivity();
            mb.a("Omid session finished!", (Throwable) null, 2, (Object) null);
        } catch (Exception e) {
            mb.b("OMSDK stop session exception", e);
        } finally {
            this.f4732a.a((AdSession) null);
            this.f4732a.a((AdEvents) null);
        }
    }

    public final void a() {
        if (!this.b) {
            mb.b("OMSDK signal impression event OM is disabled by the cb config!", (Throwable) null, 2, (Object) null);
            return;
        }
        try {
            AdEvents b = this.f4732a.b();
            if (b != null) {
                b.impressionOccurred();
                mb.a("Signal om ad event impression occurred!", (Throwable) null, 2, (Object) null);
            } else {
                mb.a("Omid signal impression event is null!", (Throwable) null, 2, (Object) null);
            }
        } catch (Exception e) {
            mb.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c, e);
        }
    }

    public final void a(View obstructionView) {
        Intrinsics.checkNotNullParameter(obstructionView, "obstructionView");
        AdSession c = this.f4732a.c();
        if (c != null) {
            c.addFriendlyObstruction(obstructionView, FriendlyObstructionPurpose.OTHER, "Industry Icon");
        }
    }

    public final void a(float f, float f2) {
        this.c = false;
        this.d = false;
        this.e = false;
        try {
            MediaEvents a2 = a("signalMediaStart duration: " + f + " and volume " + f2);
            if (a2 != null) {
                a2.start(f, f2);
            }
        } catch (Exception e) {
            mb.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c, e);
        }
    }

    public final void a(float f) {
        try {
            MediaEvents a2 = a("signalMediaVolumeChange volume: " + f);
            if (a2 != null) {
                a2.volumeChange(f);
            }
        } catch (Exception e) {
            mb.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c, e);
        }
    }

    public final void a(PlayerState playerState) {
        Intrinsics.checkNotNullParameter(playerState, "playerState");
        try {
            MediaEvents a2 = a("signalMediaStateChange state: " + playerState.name());
            if (a2 != null) {
                a2.playerStateChange(playerState);
            }
        } catch (Exception e) {
            mb.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c, e);
        }
    }

    public final MediaEvents a(String str) {
        if (this.f4732a.a() == null) {
            mb.a("MediaEvents are null when executing " + str, (Throwable) null, 2, (Object) null);
        } else {
            mb.a("MediaEvents valid when executing: " + str, (Throwable) null, 2, (Object) null);
        }
        return this.f4732a.a();
    }
}
