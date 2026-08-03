package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Be extends com.inmobi.media.AbstractC2892y implements com.inmobi.media.InterfaceC2782tj, com.inmobi.media.Tk, com.inmobi.media.InterfaceC2392f {
    public final com.inmobi.media.Ce b;
    public final com.inmobi.media.Rc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Be(com.inmobi.media.Ce provider, com.inmobi.media.Rc stateMachine) {
        super(provider.g.f4836a);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "provider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.b = provider;
        this.c = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void a() {
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("NativeRenderedState", "Initialize Called");
        }
        com.inmobi.media.InterfaceC2782tj interfaceC2782tj = this.b.g.c.c;
        com.inmobi.media.I i = interfaceC2782tj instanceof com.inmobi.media.I ? (com.inmobi.media.I) interfaceC2782tj : null;
        if (i != null) {
            i.g();
        }
        com.inmobi.media.Ce ce = this.b;
        com.inmobi.media.Fi fi = ce.b;
        if (!fi.f4710a) {
            fi.f4710a = true;
            com.inmobi.media.AbstractC2367e1 abstractC2367e1 = ce.e;
            if (abstractC2367e1.c == null) {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = abstractC2367e1.b;
                if (interfaceC2772t9 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t9).a(com.inmobi.media.AbstractC2367e1.f, "Failed to startAdSession. adSession is null");
                }
            } else {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = abstractC2367e1.b;
                if (interfaceC2772t92 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t92).a(com.inmobi.media.AbstractC2367e1.f, "startAdSession");
                }
                com.inmobi.media.T4.a(abstractC2367e1.f5167a, new com.inmobi.media.C2288b1(abstractC2367e1, null));
            }
            com.inmobi.media.Ce ce2 = this.b;
            com.inmobi.media.AbstractC2367e1 abstractC2367e12 = ce2.e;
            android.view.ViewGroup adView = ce2.c.f5125a.getParentView();
            abstractC2367e12.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adView, "adView");
            if (abstractC2367e12.c == null) {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = abstractC2367e12.b;
                if (interfaceC2772t93 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t93).a(com.inmobi.media.AbstractC2367e1.f, "Failed to registerAdView. adSession is null");
                }
            } else {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = abstractC2367e12.b;
                if (interfaceC2772t94 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t94).a(com.inmobi.media.AbstractC2367e1.f, "registerAdView");
                }
                com.inmobi.media.T4.a(abstractC2367e12.f5167a, new com.inmobi.media.Y0(abstractC2367e12, adView, null));
            }
            com.inmobi.media.G g = this.f5559a.b;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(g, "<this>");
            com.inmobi.media.ads.network.common.model.MetaInfo metaInfo = g.d;
            if (kotlin.jvm.internal.Intrinsics.areEqual(metaInfo != null ? metaInfo.getCreativeType() : null, "video")) {
                this.b.e.a(true);
            } else {
                this.b.e.a();
            }
        }
        com.inmobi.media.InterfaceC2772t9 l2 = l();
        if (l2 != null) {
            ((com.inmobi.media.C2799u9) l2).a("NativeRenderedState", "listenMediaEvents - setting up media event listener");
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.b.h, null, null, new com.inmobi.media.C2618ne(((com.inmobi.media.C2775tc) this.b.g.g.getValue()).e, null, this), 3, null);
        com.inmobi.media.T4.a(this.b.h, new com.inmobi.media.C2537ke(this, null));
        com.inmobi.media.Ce ce3 = this.b;
        if (ce3.b.b) {
            com.inmobi.media.InterfaceC2772t9 l3 = l();
            if (l3 != null) {
                ((com.inmobi.media.C2799u9) l3).a("NativeRenderedState", "Track Views Attached to Telemetry - Already triggered, skipping");
            }
        } else {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(ce3.h, null, null, new com.inmobi.media.C2932ze(this, null), 3, null);
        }
        if (this.b.b.c) {
            com.inmobi.media.InterfaceC2772t9 l4 = l();
            if (l4 != null) {
                ((com.inmobi.media.C2799u9) l4).a("NativeRenderedState", "Impression Tracking - Already triggered, skipping");
            }
        } else {
            com.inmobi.media.G g2 = this.f5559a.b;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(g2, "<this>");
            if (g2.m.f4693a == 0) {
                com.inmobi.media.InterfaceC2772t9 l5 = l();
                if (l5 != null) {
                    ((com.inmobi.media.C2799u9) l5).a("NativeRenderedState", "Impression Event Occurred - Load (immediate fire)");
                }
                m();
            } else {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.b.h, null, null, new com.inmobi.media.C2830ve(this, null), 3, null);
            }
        }
        if (!this.b.b.d) {
            if (com.inmobi.media.D4.a(this.f5559a.b, "mrc50").isEmpty()) {
                com.inmobi.media.InterfaceC2772t9 l6 = l();
                if (l6 != null) {
                    ((com.inmobi.media.C2799u9) l6).a("NativeRenderedState", "MRC50 Trackers unavailable");
                }
            } else {
                java.util.Map a2 = com.inmobi.media.AbstractC2938zk.a(((com.inmobi.media.Lc) this.b.g.f.getValue()).f4817a);
                com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
                com.inmobi.media.C2624nk.b("MRCViewable50Started", a2, com.inmobi.media.EnumC2728rk.f5431a);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.b.h, null, null, new com.inmobi.media.C2882xe(this, null), 3, null);
            }
        }
        com.inmobi.media.C2775tc c2775tc = (com.inmobi.media.C2775tc) this.b.g.g.getValue();
        kotlinx.coroutines.flow.MutableStateFlow windowFlow = ((com.inmobi.media.Po) this.b.l.getValue()).b;
        c2775tc.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowFlow, "windowFlow");
        com.inmobi.media.C2799u9 c2799u9 = c2775tc.f5464a;
        if (c2799u9 != null) {
            c2799u9.a("MediaViewManager", "attachWindowLifecycleObserver called");
        }
        com.inmobi.media.AbstractC2525k2 abstractC2525k2 = c2775tc.b;
        if (abstractC2525k2 != null) {
            abstractC2525k2.a(windowFlow);
        }
    }

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void c() {
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("NativeRenderedState", "Finalize Called");
        }
        com.inmobi.media.T4.a(this.b.k(), new com.inmobi.media.C2564le(this, null));
        com.inmobi.media.J3.a(this.b.h);
        ((com.inmobi.media.Nd) this.b.k.getValue()).f4855a.a();
        ((com.inmobi.media.C2617nd) this.b.j.getValue()).a();
        com.inmobi.media.L6.a(((com.inmobi.media.Po) this.b.l.getValue()).f4905a);
    }

    @Override // com.inmobi.media.Tk
    public final void d() {
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("NativeRenderedState", "unTrackViews");
        }
        com.inmobi.media.C2775tc c2775tc = (com.inmobi.media.C2775tc) this.b.g.g.getValue();
        com.inmobi.media.C2799u9 c2799u9 = c2775tc.f5464a;
        if (c2799u9 != null) {
            c2799u9.a("MediaViewManager", "detachObserversAndPause called");
        }
        com.inmobi.media.AbstractC2525k2 abstractC2525k2 = c2775tc.b;
        if (abstractC2525k2 != null) {
            abstractC2525k2.b();
        }
        com.inmobi.media.Ce ce = this.b;
        com.inmobi.media.C2304bh c2304bh = ce.c;
        this.c.a(new com.inmobi.media.Ge(c2304bh.c, c2304bh.b, ce.b, ce.e, ce.d, ce.f, ce.g, this.c), this);
    }

    public final void m() {
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("NativeRenderedState", "fireNativeImpression - Starting impression fire");
        }
        com.inmobi.media.Ce ce = this.b;
        ce.b.c = true;
        java.util.Map a2 = com.inmobi.media.AbstractC2938zk.a(((com.inmobi.media.Lc) ce.g.f.getValue()).f4817a);
        com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
        com.inmobi.media.C2624nk.b("AdImpressionSuccessful", a2, com.inmobi.media.EnumC2728rk.f5431a);
        this.b.g.c.g();
        this.b.f.b.f.a(com.inmobi.media.C2302bf.f5123a);
        com.inmobi.media.AbstractC2367e1 abstractC2367e1 = this.b.e;
        if (abstractC2367e1.e == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = abstractC2367e1.b;
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a(com.inmobi.media.AbstractC2367e1.f, "Failed to registerImpression: AdEvent is null");
                return;
            }
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = abstractC2367e1.b;
        if (interfaceC2772t92 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(com.inmobi.media.AbstractC2367e1.f, "registerImpression");
        }
        com.inmobi.media.T4.a(abstractC2367e1.f5167a, new com.inmobi.media.Z0(abstractC2367e1, null));
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
    @Override // com.inmobi.media.InterfaceC2392f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2671pe c2671pe;
        int i;
        if (continuation instanceof com.inmobi.media.C2671pe) {
            c2671pe = (com.inmobi.media.C2671pe) continuation;
            int i2 = c2671pe.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2671pe.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = c2671pe.f5391a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2671pe.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.InterfaceC2772t9 l = l();
                    if (l != null) {
                        ((com.inmobi.media.C2799u9) l).a("NativeRenderedState", "onDestroy");
                    }
                    com.inmobi.media.AbstractC2367e1 abstractC2367e1 = this.b.e;
                    if (abstractC2367e1.c == null) {
                        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = abstractC2367e1.b;
                        if (interfaceC2772t9 != null) {
                            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(com.inmobi.media.AbstractC2367e1.f, "Failed to stopAdSession. adSession is null");
                        }
                    } else {
                        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = abstractC2367e1.b;
                        if (interfaceC2772t92 != null) {
                            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(com.inmobi.media.AbstractC2367e1.f, "stopAdSession");
                        }
                        com.inmobi.media.T4.a(abstractC2367e1.f5167a, new com.inmobi.media.C2314c1(abstractC2367e1, null));
                    }
                    com.inmobi.media.C2358dh c2358dh = (com.inmobi.media.C2358dh) this.b.o.getValue();
                    com.inmobi.media.C2304bh pubView = this.b.c;
                    c2358dh.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pubView, "pubView");
                    pubView.f5125a.getParentView().setOnClickListener(null);
                    android.view.View titleView = pubView.f5125a.getTitleView();
                    if (titleView != null) {
                        titleView.setOnClickListener(null);
                    }
                    android.view.View descriptionView = pubView.f5125a.getDescriptionView();
                    if (descriptionView != null) {
                        descriptionView.setOnClickListener(null);
                    }
                    android.widget.ImageView iconView = pubView.f5125a.getIconView();
                    if (iconView != null) {
                        iconView.setOnClickListener(null);
                    }
                    android.view.View ctaView = pubView.f5125a.getCtaView();
                    if (ctaView != null) {
                        ctaView.setOnClickListener(null);
                    }
                    android.view.View advertiserView = pubView.f5125a.getAdvertiserView();
                    if (advertiserView != null) {
                        advertiserView.setOnClickListener(null);
                    }
                    android.view.View ratingView = pubView.f5125a.getRatingView();
                    if (ratingView != null) {
                        ratingView.setOnClickListener(null);
                    }
                    android.view.View view = pubView.c;
                    if (view != null) {
                        view.setOnClickListener(null);
                    }
                    com.inmobi.media.C2775tc c2775tc = (com.inmobi.media.C2775tc) this.b.g.g.getValue();
                    c2671pe.c = 1;
                    c2775tc.getClass();
                    java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.inmobi.media.C2720rc(c2775tc, null), c2671pe);
                    if (withContext != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        withContext = kotlin.Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                this.b.d.b();
                com.inmobi.media.Rc rc = this.c;
                com.inmobi.media.C2354dd c2354dd = new com.inmobi.media.C2354dd();
                c2671pe.c = 2;
            }
        }
        c2671pe = new com.inmobi.media.C2671pe(this, (kotlin.coroutines.jvm.internal.ContinuationImpl) continuation);
        java.lang.Object obj2 = c2671pe.f5391a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2671pe.c;
        if (i != 0) {
        }
        this.b.d.b();
        com.inmobi.media.Rc rc2 = this.c;
        com.inmobi.media.C2354dd c2354dd2 = new com.inmobi.media.C2354dd();
        c2671pe.c = 2;
    }
}
