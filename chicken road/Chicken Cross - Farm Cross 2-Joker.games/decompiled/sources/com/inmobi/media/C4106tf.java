package com.inmobi.media;

import com.inmobi.ads.controllers.PublisherCallbacks;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.tf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4106tf extends Tj implements InterfaceC3719fo, Pm {
    public final Fd f;
    public final C4227y g;
    public final PublisherCallbacks h;
    public final Rk i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4106tf(Fd adUnit, C4227y adComponent, PublisherCallbacks publisherCallbacks, Rk stateMachine) {
        super(adUnit, adComponent, publisherCallbacks, stateMachine);
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f = adUnit;
        this.g = adComponent;
        this.h = publisherCallbacks;
        this.i = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC3719fo
    public final void a(boolean z) {
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("AUM-NativeRenderedState", "onAudioStateChanged " + z);
        }
        AbstractC4012q5.a(k(), new C3767hf(this, z, null));
    }

    @Override // com.inmobi.media.InterfaceC3719fo
    public final void b() {
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("AUM-NativeRenderedState", "onVideoPaused");
        }
        AbstractC4012q5.a(k(), new C3851kf(this, null));
    }

    @Override // com.inmobi.media.Pm
    public final void d() {
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("AUM-NativeRenderedState", "unTrackViews - stopping view tracking");
        }
        this.i.a(new C4243yf(this.f, this.g, this.h, this.i), this);
    }

    @Override // com.inmobi.media.InterfaceC3719fo
    public final void f() {
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("AUM-NativeRenderedState", "onVideoStarted");
        }
        AbstractC4012q5.a(k(), new C3909mf(this, null));
    }

    @Override // com.inmobi.media.InterfaceC3719fo
    public final void h() {
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("AUM-NativeRenderedState", "onVideoCompleted");
        }
        AbstractC4012q5.a(k(), new C3822jf(this, null));
    }

    @Override // com.inmobi.media.InterfaceC3719fo
    public final void i() {
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("AUM-NativeRenderedState", "onVideoResumed");
        }
        AbstractC4012q5.a(k(), new C3879lf(this, null));
    }
}
