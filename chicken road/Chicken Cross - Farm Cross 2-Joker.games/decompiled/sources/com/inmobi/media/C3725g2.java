package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.g2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3725g2 extends C4093t2 {
    public final C3896m2 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3725g2(Context context, C4201x0 placement, C3981p2 c3981p2) {
        super(context, placement, c3981p2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.L = new C3896m2();
    }

    @Override // com.inmobi.media.C4093t2
    public final boolean X() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
            z9.c("n1", "canProceedToLoad");
        }
        F();
        if (1 == this.b || 2 == this.b) {
            Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
            Kc.a((byte) 1, "n1", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            Z9 z92 = this.i;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                z92.b("n1", "ad load in progress. ignore load");
            }
            b((short) 53);
            return false;
        }
        if (7 == this.b) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 15);
            Kc.a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + this.l.f7470a);
            Z9 z93 = this.i;
            if (z93 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                z93.b("n1", "Ad is active. ignore load");
            }
            return false;
        }
        if (this.b == 4) {
            if (!A()) {
                Z9 z94 = this.i;
                if (z94 != null) {
                    Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                    z94.c("n1", "signalCanShowForStateReady");
                }
                Z9 z95 = this.i;
                if (z95 != null) {
                    Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                    z95.a("n1", "An ad is ready with the ad unit. Signaling ad load success ...");
                }
                AbstractC3781i1 n = n();
                if (n == null) {
                    Kc.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                    Z9 z96 = this.i;
                    if (z96 != null) {
                        Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                        z96.b("n1", "listener is null. load show callback missed");
                    }
                } else {
                    Z9 z97 = this.i;
                    if (z97 != null) {
                        Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                        z97.a("n1", "callback - onLoadSuccess");
                    }
                    d(n);
                }
                return false;
            }
            Z9 z98 = this.i;
            if (z98 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                z98.b("n1", "ad is expired, clearing");
            }
            d();
        }
        E();
        return true;
    }

    @Override // com.inmobi.media.C4093t2, com.inmobi.media.Gj
    public final void a(EnumC3952o2 audioStatusInternal) {
        Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        AbstractC3781i1 n = n();
        if (n != null) {
            n.a(audioStatusInternal);
        }
        C3896m2 c3896m2 = this.L;
        c3896m2.getClass();
        Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        if (!c3896m2.f7237a && audioStatusInternal == EnumC3952o2.e) {
            c3896m2.f7237a = true;
            D9 d9 = D9.c;
            d9.f6466a = System.currentTimeMillis();
            d9.b++;
        }
    }

    public final void e0() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
            z9.d("n1", "AdUnit " + this + " state - CREATED");
        }
        c((byte) 0);
        f((short) 2153);
    }

    public final void f(short s) {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
            z9.c("n1", "onShowFailure");
        }
        AbstractC3781i1 n = n();
        if (n == null) {
            Kc.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
            Z9 z92 = this.i;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                z92.b("n1", "listener is null. show fail callback missed. ");
            }
        } else {
            Z9 z93 = this.i;
            if (z93 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                z93.b("n1", "callback - onAdShowFailed");
            }
            n.b();
        }
        if (s != 0) {
            Z9 z94 = this.i;
            if (z94 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                z94.b("n1", "show failed - " + ((int) s));
            }
            d(s);
        }
    }

    @Override // com.inmobi.media.C4093t2, com.inmobi.media.AbstractC3923n1, com.inmobi.media.Gj
    public final void i(Ej renderView) {
        AbstractC3781i1 n;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
            z9.c("n1", "onRenderViewVisible");
        }
        if (this.b == 4 && (n = n()) != null) {
            Z9 z92 = this.i;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                z92.a("n1", "callback - onAdDisplayed");
            }
            a(n);
        }
        super.i(renderView);
    }

    @Override // com.inmobi.media.C4093t2, com.inmobi.media.AbstractC3923n1
    public final String m() {
        return "audio";
    }

    @Override // com.inmobi.media.C4093t2, com.inmobi.media.Gj
    public final void a(boolean z) {
        Context context = AbstractC3914mk.f7252a;
        if (context == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = Db.b;
        Db a2 = Cb.a(context, "audio_pref_file");
        Intrinsics.checkNotNullParameter("user_mute_count", "key");
        int i = a2.f6510a.getInt("user_mute_count", 0);
        a2.a("user_mute_count", z ? Math.max(0, i - 1) : i + 1, false);
    }
}
