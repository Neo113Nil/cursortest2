package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;

/* renamed from: com.inmobi.media.uf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4135uf extends AbstractC4254z implements Ok, Pm, InterfaceC3694f {
    public final C4162vf b;
    public final Jd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4135uf(C4162vf provider, Jd stateMachine) {
        super(provider.g.f6535a);
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.b = provider;
        this.c = stateMachine;
    }

    @Override // com.inmobi.media.Ok
    public final void a() {
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("NativeRenderedState", "Initialize Called");
        }
        Ok ok = this.b.g.c.c;
        J j = ok instanceof J ? (J) ok : null;
        if (j != null) {
            j.g();
        }
        C4162vf c4162vf = this.b;
        Uj uj = c4162vf.b;
        if (!uj.f6896a) {
            uj.f6896a = true;
            AbstractC3724g1 abstractC3724g1 = c4162vf.e;
            if (abstractC3724g1.c == null) {
                Y9 y9 = abstractC3724g1.b;
                if (y9 != null) {
                    ((Z9) y9).a(AbstractC3724g1.f, "Failed to startAdSession. adSession is null");
                }
            } else {
                Y9 y92 = abstractC3724g1.b;
                if (y92 != null) {
                    ((Z9) y92).a(AbstractC3724g1.f, "startAdSession");
                }
                AbstractC4012q5.a(abstractC3724g1.f7114a, new C3640d1(abstractC3724g1, null));
            }
            C4162vf c4162vf2 = this.b;
            AbstractC3724g1 abstractC3724g12 = c4162vf2.e;
            ViewGroup adView = c4162vf2.c.f7250a.getParentView();
            abstractC3724g12.getClass();
            Intrinsics.checkNotNullParameter(adView, "adView");
            if (abstractC3724g12.c == null) {
                Y9 y93 = abstractC3724g12.b;
                if (y93 != null) {
                    ((Z9) y93).a(AbstractC3724g1.f, "Failed to registerAdView. adSession is null");
                }
            } else {
                Y9 y94 = abstractC3724g12.b;
                if (y94 != null) {
                    ((Z9) y94).a(AbstractC3724g1.f, "registerAdView");
                }
                AbstractC4012q5.a(abstractC3724g12.f7114a, new C3555a1(abstractC3724g12, adView, null));
            }
            H h = this.f7514a.b;
            Intrinsics.checkNotNullParameter(h, "<this>");
            MetaInfo metaInfo = h.d;
            if (Intrinsics.areEqual(metaInfo != null ? metaInfo.getCreativeType() : null, "video")) {
                this.b.e.a(true);
            } else {
                this.b.e.a();
            }
        }
        Y9 l2 = l();
        if (l2 != null) {
            ((Z9) l2).a("NativeRenderedState", "listenMediaEvents - setting up media event listener");
        }
        BuildersKt__Builders_commonKt.launch$default(this.b.h, null, null, new C3738gf(((C3877ld) this.b.g.g.getValue()).e, null, this), 3, null);
        AbstractC4012q5.a(this.b.h, new C3654df(this, null));
        C4162vf c4162vf3 = this.b;
        if (c4162vf3.b.b) {
            Y9 l3 = l();
            if (l3 != null) {
                ((Z9) l3).a("NativeRenderedState", "Track Views Attached to Telemetry - Already triggered, skipping");
            }
        } else {
            BuildersKt__Builders_commonKt.launch$default(c4162vf3.h, null, null, new C4078sf(this, null), 3, null);
        }
        if (this.b.b.c) {
            Y9 l4 = l();
            if (l4 != null) {
                ((Z9) l4).a("NativeRenderedState", "Impression Tracking - Already triggered, skipping");
            }
        } else {
            H h2 = this.f7514a.b;
            Intrinsics.checkNotNullParameter(h2, "<this>");
            if (h2.m.f6568a == 0) {
                Y9 l5 = l();
                if (l5 != null) {
                    ((Z9) l5).a("NativeRenderedState", "Impression Event Occurred - Load (immediate fire)");
                }
                m();
            } else {
                BuildersKt__Builders_commonKt.launch$default(this.b.h, null, null, new C3966of(this, null), 3, null);
            }
        }
        if (!this.b.b.d) {
            if (AbstractC3559a5.a(this.f7514a.b, "mrc50").isEmpty()) {
                Y9 l6 = l();
                if (l6 != null) {
                    ((Z9) l6).a("NativeRenderedState", "MRC50 Trackers unavailable");
                }
            } else {
                Map a2 = AbstractC4169vm.a(((Dd) this.b.g.f.getValue()).f6512a);
                C3829jm c3829jm = C3829jm.f7187a;
                C3829jm.b("MRCViewable50Started", a2, EnumC3944nm.f7271a);
                BuildersKt__Builders_commonKt.launch$default(this.b.h, null, null, new C4022qf(this, null), 3, null);
            }
        }
        C3877ld c3877ld = (C3877ld) this.b.g.g.getValue();
        MutableStateFlow windowFlow = ((Mq) this.b.l.getValue()).b;
        c3877ld.getClass();
        Intrinsics.checkNotNullParameter(windowFlow, "windowFlow");
        Z9 z9 = c3877ld.f7224a;
        if (z9 != null) {
            z9.a("MediaViewManager", "attachWindowLifecycleObserver called");
        }
        G2 g2 = c3877ld.b;
        if (g2 != null) {
            g2.a(windowFlow);
        }
    }

    @Override // com.inmobi.media.Ok
    public final void c() {
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("NativeRenderedState", "Finalize Called");
        }
        AbstractC4012q5.a(this.b.k(), new C3681ef(this, null));
        AbstractC3727g4.a(this.b.h);
        ((Fe) this.b.k.getValue()).f6557a.a();
        ((C3709fe) this.b.j.getValue()).a();
        AbstractC3787i7.a(((Mq) this.b.l.getValue()).f6728a);
    }

    @Override // com.inmobi.media.Pm
    public final void d() {
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("NativeRenderedState", "unTrackViews");
        }
        C3877ld c3877ld = (C3877ld) this.b.g.g.getValue();
        Z9 z9 = c3877ld.f7224a;
        if (z9 != null) {
            z9.a("MediaViewManager", "detachObserversAndPause called");
        }
        G2 g2 = c3877ld.b;
        if (g2 != null) {
            g2.b();
        }
        C4162vf c4162vf = this.b;
        C3912mi c3912mi = c4162vf.c;
        this.c.a(new C4271zf(c3912mi.c, c3912mi.b, c4162vf.b, c4162vf.e, c4162vf.d, c4162vf.f, c4162vf.g, this.c), this);
    }

    public final void m() {
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("NativeRenderedState", "fireNativeImpression - Starting impression fire");
        }
        C4162vf c4162vf = this.b;
        c4162vf.b.c = true;
        Map a2 = AbstractC4169vm.a(((Dd) c4162vf.g.f.getValue()).f6512a);
        C3829jm c3829jm = C3829jm.f7187a;
        C3829jm.b("AdImpressionSuccessful", a2, EnumC3944nm.f7271a);
        this.b.g.c.g();
        this.b.f.b.f.a(Uf.f6892a);
        AbstractC3724g1 abstractC3724g1 = this.b.e;
        if (abstractC3724g1.e == null) {
            Y9 y9 = abstractC3724g1.b;
            if (y9 != null) {
                ((Z9) y9).a(AbstractC3724g1.f, "Failed to registerImpression: AdEvent is null");
                return;
            }
            return;
        }
        Y9 y92 = abstractC3724g1.b;
        if (y92 != null) {
            ((Z9) y92).a(AbstractC3724g1.f, "registerImpression");
        }
        AbstractC4012q5.a(abstractC3724g1.f7114a, new C3583b1(abstractC3724g1, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0122, code lost:
    
        if (r9.a(r2, r8, r0) != r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0124, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010b, code lost:
    
        if (r9 == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.inmobi.media.InterfaceC3694f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        Cif cif;
        int i;
        if (continuation instanceof Cif) {
            cif = (Cif) continuation;
            int i2 = cif.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cif.c = i2 - Integer.MIN_VALUE;
                Object obj = cif.f7162a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cif.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Y9 l = l();
                    if (l != null) {
                        ((Z9) l).a("NativeRenderedState", "onDestroy");
                    }
                    AbstractC3724g1 abstractC3724g1 = this.b.e;
                    if (abstractC3724g1.c == null) {
                        Y9 y9 = abstractC3724g1.b;
                        if (y9 != null) {
                            ((Z9) y9).a(AbstractC3724g1.f, "Failed to stopAdSession. adSession is null");
                        }
                    } else {
                        Y9 y92 = abstractC3724g1.b;
                        if (y92 != null) {
                            ((Z9) y92).a(AbstractC3724g1.f, "stopAdSession");
                        }
                        AbstractC4012q5.a(abstractC3724g1.f7114a, new C3667e1(abstractC3724g1, null));
                    }
                    C3969oi c3969oi = (C3969oi) this.b.o.getValue();
                    C3912mi pubView = this.b.c;
                    c3969oi.getClass();
                    Intrinsics.checkNotNullParameter(pubView, "pubView");
                    pubView.f7250a.getParentView().setOnClickListener(null);
                    View titleView = pubView.f7250a.getTitleView();
                    if (titleView != null) {
                        titleView.setOnClickListener(null);
                    }
                    View descriptionView = pubView.f7250a.getDescriptionView();
                    if (descriptionView != null) {
                        descriptionView.setOnClickListener(null);
                    }
                    ImageView iconView = pubView.f7250a.getIconView();
                    if (iconView != null) {
                        iconView.setOnClickListener(null);
                    }
                    View ctaView = pubView.f7250a.getCtaView();
                    if (ctaView != null) {
                        ctaView.setOnClickListener(null);
                    }
                    View advertiserView = pubView.f7250a.getAdvertiserView();
                    if (advertiserView != null) {
                        advertiserView.setOnClickListener(null);
                    }
                    View ratingView = pubView.f7250a.getRatingView();
                    if (ratingView != null) {
                        ratingView.setOnClickListener(null);
                    }
                    View view = pubView.c;
                    if (view != null) {
                        view.setOnClickListener(null);
                    }
                    C3877ld c3877ld = (C3877ld) this.b.g.g.getValue();
                    cif.c = 1;
                    c3877ld.getClass();
                    Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new C3820jd(c3877ld, null), cif);
                    if (withContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        withContext = Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.b.d.b();
                Jd jd = this.c;
                Vd vd = new Vd();
                cif.c = 2;
            }
        }
        cif = new Cif(this, (ContinuationImpl) continuation);
        Object obj2 = cif.f7162a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cif.c;
        if (i != 0) {
        }
        this.b.d.b();
        Jd jd2 = this.c;
        Vd vd2 = new Vd();
        cif.c = 2;
    }
}
