package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlay;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Vf {

    /* renamed from: a, reason: collision with root package name */
    private final Qf f7975a;

    public static final class c implements Aa {
        c() {
        }

        @Override // com.ironsource.Aa
        public void a(IronSourceError ironSourceError) {
            Vf.this.a(Wf.b, LevelPlay.AdFormat.BANNER, Zf.f8052a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.Aa
        public void d(AdInfo adInfo) {
            Vf.this.a(Wf.f, LevelPlay.AdFormat.BANNER, Zf.f8052a.a(adInfo));
        }

        @Override // com.ironsource.Aa
        public void e(AdInfo adInfo) {
            Vf.this.a(Wf.j, LevelPlay.AdFormat.BANNER, Zf.f8052a.a(adInfo));
        }

        @Override // com.ironsource.Aa
        public void f(AdInfo adInfo) {
            Vf.this.a(Wf.m, LevelPlay.AdFormat.BANNER, Zf.f8052a.a(adInfo));
        }

        @Override // com.ironsource.Aa
        public void g(AdInfo adInfo) {
            Vf.this.a(Wf.k, LevelPlay.AdFormat.BANNER, Zf.f8052a.a(adInfo));
        }

        @Override // com.ironsource.Aa
        public void h(AdInfo adInfo) {
            Vf.this.a(Wf.l, LevelPlay.AdFormat.BANNER, Zf.f8052a.a(adInfo));
        }
    }

    public Vf(Qf javaScriptEvaluator) {
        Intrinsics.checkNotNullParameter(javaScriptEvaluator, "javaScriptEvaluator");
        this.f7975a = javaScriptEvaluator;
    }

    private final void b() {
        Uf uf = Uf.f7953a;
        uf.a((InterfaceC4355cb) null);
        uf.a((InterfaceC4570ob) null);
        uf.a((Aa) null);
    }

    private final void c() {
        com.ironsource.mediationsdk.c.d().e(false);
        Uf.f7953a.e();
    }

    public final void d() {
        Uf uf = Uf.f7953a;
        uf.a(new a());
        uf.a(new b());
        uf.a(new c());
    }

    public final void a() {
        b();
        c();
    }

    public static final class a implements InterfaceC4355cb {
        a() {
        }

        @Override // com.ironsource.InterfaceC4355cb
        public void a(AdInfo adInfo) {
            Vf.this.a(Wf.f7998a, LevelPlay.AdFormat.INTERSTITIAL, Zf.f8052a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4355cb
        public void b(AdInfo adInfo) {
            Vf.this.a(Wf.g, LevelPlay.AdFormat.INTERSTITIAL, Zf.f8052a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4355cb
        public void c(AdInfo adInfo) {
            Vf.this.a(Wf.c, LevelPlay.AdFormat.INTERSTITIAL, Zf.f8052a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4355cb
        public void d(AdInfo adInfo) {
            Vf.this.a(Wf.f, LevelPlay.AdFormat.INTERSTITIAL, Zf.f8052a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4355cb
        public void e(AdInfo adInfo) {
            Vf.this.a(Wf.d, LevelPlay.AdFormat.INTERSTITIAL, Zf.f8052a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4355cb
        public void a(IronSourceError ironSourceError) {
            Vf.this.a(Wf.b, LevelPlay.AdFormat.INTERSTITIAL, Zf.f8052a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.InterfaceC4355cb
        public void a(IronSourceError ironSourceError, AdInfo adInfo) {
            Vf.this.a(Wf.e, LevelPlay.AdFormat.INTERSTITIAL, Zf.f8052a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }
    }

    public static final class b implements InterfaceC4606qb, InterfaceC4588pb {
        b() {
        }

        @Override // com.ironsource.InterfaceC4606qb
        public void a(AdInfo adInfo) {
            Vf.this.a(Wf.f7998a, LevelPlay.AdFormat.REWARDED, Zf.f8052a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4570ob
        public void b(C4411fd c4411fd, AdInfo adInfo) {
            Vf.this.a(Wf.i, LevelPlay.AdFormat.REWARDED, Zf.f8052a.a(Uf.f7953a.a(c4411fd), adInfo));
        }

        @Override // com.ironsource.InterfaceC4570ob
        public void c(AdInfo adInfo) {
            Vf.this.a(Wf.c, LevelPlay.AdFormat.REWARDED, Zf.f8052a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4588pb
        public void d(AdInfo adInfo) {
            Vf.this.a(Wf.h, LevelPlay.AdFormat.REWARDED, Zf.f8052a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4606qb
        public void a(IronSourceError ironSourceError) {
            Vf.this.a(Wf.b, LevelPlay.AdFormat.REWARDED, Zf.f8052a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.InterfaceC4570ob
        public void b(AdInfo adInfo) {
            Vf.this.a(Wf.g, LevelPlay.AdFormat.REWARDED, Zf.f8052a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4588pb
        public void a() {
            Vf.this.a(Wf.n, LevelPlay.AdFormat.REWARDED, Zf.f8052a.a(new Object[0]));
        }

        @Override // com.ironsource.InterfaceC4570ob
        public void a(IronSourceError ironSourceError, AdInfo adInfo) {
            Vf.this.a(Wf.e, LevelPlay.AdFormat.REWARDED, Zf.f8052a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }

        @Override // com.ironsource.InterfaceC4570ob
        public void a(C4411fd c4411fd, AdInfo adInfo) {
            Vf.this.a(Wf.f, LevelPlay.AdFormat.REWARDED, Zf.f8052a.a(Uf.f7953a.a(c4411fd), adInfo));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, LevelPlay.AdFormat adFormat, List<? extends Object> list) {
        this.f7975a.a(str, adFormat, list);
    }
}
