package com.inmobi.media;

/* loaded from: classes5.dex */
public final class N1 extends com.inmobi.media.C2262a2 {
    public final com.inmobi.media.T1 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N1(android.content.Context context, com.inmobi.media.C2816v0 placement, com.inmobi.media.W1 w1) {
        super(context, placement, w1);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        this.K = new com.inmobi.media.T1();
    }

    @Override // com.inmobi.media.C2262a2
    public final boolean W() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
            c2799u9.c("l1", "canProceedToLoad");
        }
        F();
        if (1 == this.b || 2 == this.b) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
            com.inmobi.media.Sb.a((byte) 1, "l1", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            if (c2799u92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c2799u92.b("l1", "ad load in progress. ignore load");
            }
            b((short) 53);
            return false;
        }
        if (7 == this.b) {
            b(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 15);
            com.inmobi.media.Sb.a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + this.l.f5497a);
            com.inmobi.media.C2799u9 c2799u93 = this.i;
            if (c2799u93 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c2799u93.b("l1", "Ad is active. ignore load");
            }
            return false;
        }
        if (this.b == 4) {
            if (!A()) {
                com.inmobi.media.C2799u9 c2799u94 = this.i;
                if (c2799u94 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                    c2799u94.c("l1", "signalCanShowForStateReady");
                }
                com.inmobi.media.C2799u9 c2799u95 = this.i;
                if (c2799u95 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                    c2799u95.a("l1", "An ad is ready with the ad unit. Signaling ad load success ...");
                }
                com.inmobi.media.AbstractC2421g1 n = n();
                if (n == null) {
                    com.inmobi.media.Sb.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                    com.inmobi.media.C2799u9 c2799u96 = this.i;
                    if (c2799u96 != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                        c2799u96.b("l1", "listener is null. load show callback missed");
                    }
                } else {
                    com.inmobi.media.C2799u9 c2799u97 = this.i;
                    if (c2799u97 != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                        c2799u97.a("l1", "callback - onLoadSuccess");
                    }
                    d(n);
                }
                return false;
            }
            com.inmobi.media.C2799u9 c2799u98 = this.i;
            if (c2799u98 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c2799u98.b("l1", "ad is expired, clearing");
            }
            d();
        }
        E();
        return true;
    }

    @Override // com.inmobi.media.C2262a2, com.inmobi.media.AbstractC2726ri
    public final void a(com.inmobi.media.V1 audioStatusInternal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        com.inmobi.media.AbstractC2421g1 n = n();
        if (n != null) {
            n.a(audioStatusInternal);
        }
        com.inmobi.media.T1 t1 = this.K;
        t1.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        if (!t1.f4967a && audioStatusInternal == com.inmobi.media.V1.e) {
            t1.f4967a = true;
            com.inmobi.media.Z8 z8 = com.inmobi.media.Z8.c;
            z8.f5190a = java.lang.System.currentTimeMillis();
            z8.b++;
        }
    }

    public final void d0() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
            c2799u9.d("l1", "AdUnit " + this + " state - CREATED");
        }
        c((byte) 0);
        f((short) 2153);
    }

    public final void f(short s) {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
            c2799u9.c("l1", "onShowFailure");
        }
        com.inmobi.media.AbstractC2421g1 n = n();
        if (n == null) {
            com.inmobi.media.Sb.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            if (c2799u92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c2799u92.b("l1", "listener is null. show fail callback missed. ");
            }
        } else {
            com.inmobi.media.C2799u9 c2799u93 = this.i;
            if (c2799u93 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c2799u93.b("l1", "callback - onAdShowFailed");
            }
            n.b();
        }
        if (s != 0) {
            com.inmobi.media.C2799u9 c2799u94 = this.i;
            if (c2799u94 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c2799u94.b("l1", "show failed - " + ((int) s));
            }
            d(s);
        }
    }

    @Override // com.inmobi.media.C2262a2, com.inmobi.media.AbstractC2551l1, com.inmobi.media.AbstractC2726ri
    public final void i(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        com.inmobi.media.AbstractC2421g1 n;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
            c2799u9.c("l1", "onRenderViewVisible");
        }
        if (this.b == 4 && (n = n()) != null) {
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            if (c2799u92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c2799u92.a("l1", "callback - onAdDisplayed");
            }
            a(n);
        }
        super.i(renderView);
    }

    @Override // com.inmobi.media.C2262a2, com.inmobi.media.AbstractC2551l1
    public final java.lang.String m() {
        return "audio";
    }

    @Override // com.inmobi.media.C2262a2, com.inmobi.media.AbstractC2726ri
    public final void a(boolean z) {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
        com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context, "audio_pref_file");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_mute_count", com.ironsource.X3.i.W);
        int i = a2.f4815a.getInt("user_mute_count", 0);
        a2.a("user_mute_count", z ? java.lang.Math.max(0, i - 1) : i + 1, false);
    }
}
