package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ae extends com.inmobi.media.Ei implements com.inmobi.media.InterfaceC2519jm, com.inmobi.media.Tk {
    public final com.inmobi.media.Nc f;
    public final com.inmobi.media.C2867x g;
    public final com.inmobi.ads.controllers.PublisherCallbacks h;
    public final com.inmobi.media.AbstractC2861wj i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ae(com.inmobi.media.Nc adUnit, com.inmobi.media.C2867x adComponent, com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks, com.inmobi.media.AbstractC2861wj stateMachine) {
        super(adUnit, adComponent, publisherCallbacks, stateMachine);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f = adUnit;
        this.g = adComponent;
        this.h = publisherCallbacks;
        this.i = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC2519jm
    public final void a(boolean z) {
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("AUM-NativeRenderedState", "onAudioStateChanged " + z);
        }
        com.inmobi.media.T4.a(k(), new com.inmobi.media.C2644oe(this, z, null));
    }

    @Override // com.inmobi.media.InterfaceC2519jm
    public final void b() {
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("AUM-NativeRenderedState", "onVideoPaused");
        }
        com.inmobi.media.T4.a(k(), new com.inmobi.media.C2722re(this, null));
    }

    @Override // com.inmobi.media.Tk
    public final void d() {
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("AUM-NativeRenderedState", "unTrackViews - stopping view tracking");
        }
        this.i.a(new com.inmobi.media.Fe(this.f, this.g, this.h, this.i), this);
    }

    @Override // com.inmobi.media.InterfaceC2519jm
    public final void f() {
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("AUM-NativeRenderedState", "onVideoStarted");
        }
        com.inmobi.media.T4.a(k(), new com.inmobi.media.C2777te(this, null));
    }

    @Override // com.inmobi.media.InterfaceC2519jm
    public final void h() {
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("AUM-NativeRenderedState", "onVideoCompleted");
        }
        com.inmobi.media.T4.a(k(), new com.inmobi.media.C2697qe(this, null));
    }

    @Override // com.inmobi.media.InterfaceC2519jm
    public final void i() {
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("AUM-NativeRenderedState", "onVideoResumed");
        }
        com.inmobi.media.T4.a(k(), new com.inmobi.media.C2749se(this, null));
    }
}
