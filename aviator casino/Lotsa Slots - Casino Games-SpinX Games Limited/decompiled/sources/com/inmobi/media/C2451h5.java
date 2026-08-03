package com.inmobi.media;

/* renamed from: com.inmobi.media.h5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2451h5 extends androidx.browser.customtabs.CustomTabsCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2477i5 f5233a;

    public C2451h5(com.inmobi.media.C2477i5 c2477i5) {
        this.f5233a = c2477i5;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onActivityLayout(int i, int i2, int i3, int i4, int i5, android.os.Bundle extras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
        super.onActivityLayout(i, i2, i3, i4, i5, extras);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("i5", "access$getLOG_TAG$cp(...)");
        com.inmobi.media.U2 u2 = this.f5233a.c;
        if (u2 != null) {
            u2.a(i, i2, i3, i4, i5);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i, android.os.Bundle bundle) {
        super.onNavigationEvent(i, bundle);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("i5", "access$getLOG_TAG$cp(...)");
        com.inmobi.media.U2 u2 = this.f5233a.c;
        if (u2 != null) {
            com.inmobi.media.C2502j5 c2502j5 = u2.g;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 6 && c2502j5.c == null) {
                            if (c2502j5.d == 4) {
                                c2502j5.c = java.lang.Boolean.TRUE;
                            } else {
                                c2502j5.c = java.lang.Boolean.FALSE;
                            }
                            if (kotlin.jvm.internal.Intrinsics.areEqual(c2502j5.c, java.lang.Boolean.TRUE)) {
                                com.inmobi.media.C2279ai c2279ai = (com.inmobi.media.C2279ai) c2502j5.e.get();
                                if (c2279ai != null) {
                                    com.inmobi.media.Ua landingPageFunnelState = com.inmobi.media.Ua.i;
                                    com.inmobi.media.C2431gb c2431gb = c2502j5.f5271a;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(landingPageFunnelState, "landingPageFunnelState");
                                    c2279ai.f5106a.getLandingPageHandler().a(landingPageFunnelState, c2431gb, (java.lang.Integer) 8003);
                                }
                                com.inmobi.media.C2279ai c2279ai2 = (com.inmobi.media.C2279ai) c2502j5.e.get();
                                if (c2279ai2 != null) {
                                    com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = c2279ai2.f5106a.i;
                                    if (interfaceC2772t9 != null) {
                                        java.lang.String str = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.i1;
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                                        ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str, "onCCTPageLoadedSuccessfully");
                                    }
                                    c2279ai2.f5106a.D();
                                }
                            } else {
                                com.inmobi.media.C2279ai c2279ai3 = (com.inmobi.media.C2279ai) c2502j5.e.get();
                                if (c2279ai3 != null) {
                                    com.inmobi.media.Ua landingPageFunnelState2 = com.inmobi.media.Ua.j;
                                    com.inmobi.media.C2431gb c2431gb2 = c2502j5.f5271a;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(landingPageFunnelState2, "landingPageFunnelState");
                                    c2279ai3.f5106a.getLandingPageHandler().a(landingPageFunnelState2, c2431gb2, (java.lang.Integer) 8005);
                                }
                            }
                        }
                    } else if (c2502j5.c == null) {
                        c2502j5.c = java.lang.Boolean.FALSE;
                        com.inmobi.media.C2279ai c2279ai4 = (com.inmobi.media.C2279ai) c2502j5.e.get();
                        if (c2279ai4 != null) {
                            com.inmobi.media.Ua landingPageFunnelState3 = com.inmobi.media.Ua.j;
                            com.inmobi.media.C2431gb c2431gb3 = c2502j5.f5271a;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(landingPageFunnelState3, "landingPageFunnelState");
                            c2279ai4.f5106a.getLandingPageHandler().a(landingPageFunnelState3, c2431gb3, (java.lang.Integer) 8004);
                        }
                    }
                } else if (c2502j5.c == null) {
                    c2502j5.c = java.lang.Boolean.TRUE;
                    com.inmobi.media.C2279ai c2279ai5 = (com.inmobi.media.C2279ai) c2502j5.e.get();
                    if (c2279ai5 != null) {
                        com.inmobi.media.K2.a(c2279ai5, com.inmobi.media.Ua.i, c2502j5.f5271a);
                    }
                    com.inmobi.media.C2279ai c2279ai6 = (com.inmobi.media.C2279ai) c2502j5.e.get();
                    if (c2279ai6 != null) {
                        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = c2279ai6.f5106a.i;
                        if (interfaceC2772t92 != null) {
                            java.lang.String str2 = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.i1;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$cp(...)");
                            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(str2, "onCCTPageLoadedSuccessfully");
                        }
                        c2279ai6.f5106a.D();
                    }
                }
            } else if (!c2502j5.b) {
                c2502j5.b = true;
                com.inmobi.media.C2279ai c2279ai7 = (com.inmobi.media.C2279ai) c2502j5.e.get();
                if (c2279ai7 != null) {
                    com.inmobi.media.K2.a(c2279ai7, com.inmobi.media.Ua.h, c2502j5.f5271a);
                }
            }
            c2502j5.d = i;
            if (i == 1) {
                com.inmobi.media.C2279ai c2279ai8 = (com.inmobi.media.C2279ai) u2.i.get();
                if (c2279ai8 != null) {
                    com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.g1.getClass();
                    c2279ai8.a(com.inmobi.media.Vh.a("IN_NATIVE_BROWSER", "onPageStart"));
                    return;
                }
                return;
            }
            if (i == 4) {
                com.inmobi.media.C2279ai c2279ai9 = (com.inmobi.media.C2279ai) u2.i.get();
                if (c2279ai9 != null) {
                    com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.g1.getClass();
                    c2279ai9.a(com.inmobi.media.Vh.a("IN_NATIVE_BROWSER", "onNavigatingAway"));
                    return;
                }
                return;
            }
            if (i == 5) {
                com.inmobi.media.C2279ai c2279ai10 = (com.inmobi.media.C2279ai) u2.i.get();
                if (c2279ai10 != null) {
                    com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.g1.getClass();
                    c2279ai10.a(com.inmobi.media.Vh.a("IN_NATIVE_BROWSER", "onVisible"));
                }
                com.inmobi.media.C2279ai c2279ai11 = (com.inmobi.media.C2279ai) u2.i.get();
                if (c2279ai11 != null) {
                    com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = c2279ai11.f5106a.i;
                    if (interfaceC2772t93 != null) {
                        java.lang.String str3 = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.i1;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$cp(...)");
                        ((com.inmobi.media.C2799u9) interfaceC2772t93).a(str3, "onCCTScreenDisplayed");
                    }
                    c2279ai11.f5106a.getListener().f(c2279ai11.f5106a);
                    c2279ai11.f5106a.b((java.lang.String) null, (java.lang.String) null, (java.lang.String) null);
                    return;
                }
                return;
            }
            if (i != 6) {
                return;
            }
            com.inmobi.media.C2279ai c2279ai12 = (com.inmobi.media.C2279ai) u2.i.get();
            if (c2279ai12 != null) {
                com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.g1.getClass();
                c2279ai12.a(com.inmobi.media.Vh.a("IN_NATIVE_BROWSER", "onHidden"));
            }
            com.inmobi.media.C2279ai c2279ai13 = (com.inmobi.media.C2279ai) u2.i.get();
            if (c2279ai13 != null) {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = c2279ai13.f5106a.i;
                if (interfaceC2772t94 != null) {
                    java.lang.String str4 = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.i1;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$cp(...)");
                    ((com.inmobi.media.C2799u9) interfaceC2772t94).a(str4, "onCCTScreenDismissed");
                }
                c2279ai13.f5106a.W();
            }
        }
    }
}
