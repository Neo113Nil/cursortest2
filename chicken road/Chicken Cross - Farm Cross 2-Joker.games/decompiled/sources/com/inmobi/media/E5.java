package com.inmobi.media;

import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import io.ktor.sse.ServerSentEventKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class E5 extends CustomTabsCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F5 f6528a;

    public E5(F5 f5) {
        this.f6528a = f5;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        super.onActivityLayout(i, i2, i3, i4, i5, extras);
        Intrinsics.checkNotNullExpressionValue("F5", "access$getLOG_TAG$cp(...)");
        String str = "onActivityLayout " + i + ServerSentEventKt.SPACE + i2 + ServerSentEventKt.SPACE + i3 + ServerSentEventKt.SPACE + i4 + ServerSentEventKt.SPACE + i5;
        C4038r3 c4038r3 = this.f6528a.c;
        if (c4038r3 != null) {
            c4038r3.a(i, i2, i3, i4, i5);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i, Bundle bundle) {
        super.onNavigationEvent(i, bundle);
        Intrinsics.checkNotNullExpressionValue("F5", "access$getLOG_TAG$cp(...)");
        String str = "onNavigationEvent " + i;
        C4038r3 c4038r3 = this.f6528a.c;
        if (c4038r3 != null) {
            G5 g5 = c4038r3.i;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 6 && g5.c == null) {
                            if (g5.d == 4) {
                                g5.c = Boolean.TRUE;
                            } else {
                                g5.c = Boolean.FALSE;
                            }
                            if (Intrinsics.areEqual(g5.c, Boolean.TRUE)) {
                                C3998pj c3998pj = (C3998pj) g5.e.get();
                                if (c3998pj != null) {
                                    Mb landingPageFunnelState = Mb.i;
                                    Yb yb = g5.f6574a;
                                    Integer valueOf = Integer.valueOf(ConnectionsStatusCodes.STATUS_ALREADY_CONNECTED_TO_ENDPOINT);
                                    Intrinsics.checkNotNullParameter(landingPageFunnelState, "landingPageFunnelState");
                                    c3998pj.f7308a.getLandingPageHandler().a(landingPageFunnelState, yb, valueOf);
                                }
                                C3998pj c3998pj2 = (C3998pj) g5.e.get();
                                if (c3998pj2 != null) {
                                    Y9 y9 = c3998pj2.f7308a.i;
                                    if (y9 != null) {
                                        String str2 = Ej.j1;
                                        Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$cp(...)");
                                        ((Z9) y9).a(str2, "onCCTPageLoadedSuccessfully");
                                    }
                                    c3998pj2.f7308a.F();
                                }
                            } else {
                                C3998pj c3998pj3 = (C3998pj) g5.e.get();
                                if (c3998pj3 != null) {
                                    Mb landingPageFunnelState2 = Mb.j;
                                    Yb yb2 = g5.f6574a;
                                    Integer valueOf2 = Integer.valueOf(ConnectionsStatusCodes.STATUS_NOT_CONNECTED_TO_ENDPOINT);
                                    Intrinsics.checkNotNullParameter(landingPageFunnelState2, "landingPageFunnelState");
                                    c3998pj3.f7308a.getLandingPageHandler().a(landingPageFunnelState2, yb2, valueOf2);
                                }
                            }
                        }
                    } else if (g5.c == null) {
                        g5.c = Boolean.FALSE;
                        C3998pj c3998pj4 = (C3998pj) g5.e.get();
                        if (c3998pj4 != null) {
                            Mb landingPageFunnelState3 = Mb.j;
                            Yb yb3 = g5.f6574a;
                            Integer valueOf3 = Integer.valueOf(ConnectionsStatusCodes.STATUS_CONNECTION_REJECTED);
                            Intrinsics.checkNotNullParameter(landingPageFunnelState3, "landingPageFunnelState");
                            c3998pj4.f7308a.getLandingPageHandler().a(landingPageFunnelState3, yb3, valueOf3);
                        }
                    }
                } else if (g5.c == null) {
                    g5.c = Boolean.TRUE;
                    C3998pj c3998pj5 = (C3998pj) g5.e.get();
                    if (c3998pj5 != null) {
                        AbstractC3754h3.a(c3998pj5, Mb.i, g5.f6574a);
                    }
                    C3998pj c3998pj6 = (C3998pj) g5.e.get();
                    if (c3998pj6 != null) {
                        Y9 y92 = c3998pj6.f7308a.i;
                        if (y92 != null) {
                            String str3 = Ej.j1;
                            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$cp(...)");
                            ((Z9) y92).a(str3, "onCCTPageLoadedSuccessfully");
                        }
                        c3998pj6.f7308a.F();
                    }
                }
            } else if (!g5.b) {
                g5.b = true;
                C3998pj c3998pj7 = (C3998pj) g5.e.get();
                if (c3998pj7 != null) {
                    AbstractC3754h3.a(c3998pj7, Mb.h, g5.f6574a);
                }
            }
            g5.d = i;
            if (i == 1) {
                C3998pj c3998pj8 = (C3998pj) c4038r3.k.get();
                if (c3998pj8 != null) {
                    Ej.h1.getClass();
                    c3998pj8.a(C3855kj.a("IN_NATIVE_BROWSER", "onPageStart"));
                    return;
                }
                return;
            }
            if (i == 4) {
                C3998pj c3998pj9 = (C3998pj) c4038r3.k.get();
                if (c3998pj9 != null) {
                    Ej.h1.getClass();
                    c3998pj9.a(C3855kj.a("IN_NATIVE_BROWSER", "onNavigatingAway"));
                    return;
                }
                return;
            }
            if (i == 5) {
                C3998pj c3998pj10 = (C3998pj) c4038r3.k.get();
                if (c3998pj10 != null) {
                    Ej.h1.getClass();
                    c3998pj10.a(C3855kj.a("IN_NATIVE_BROWSER", "onVisible"));
                }
                C3998pj c3998pj11 = (C3998pj) c4038r3.k.get();
                if (c3998pj11 != null) {
                    Y9 y93 = c3998pj11.f7308a.i;
                    if (y93 != null) {
                        String str4 = Ej.j1;
                        Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$cp(...)");
                        ((Z9) y93).a(str4, "onCCTScreenDisplayed");
                    }
                    c3998pj11.f7308a.getListener().f(c3998pj11.f7308a);
                    c3998pj11.f7308a.b((String) null, (String) null, (String) null);
                    return;
                }
                return;
            }
            if (i != 6) {
                return;
            }
            C3998pj c3998pj12 = (C3998pj) c4038r3.k.get();
            if (c3998pj12 != null) {
                Ej.h1.getClass();
                c3998pj12.a(C3855kj.a("IN_NATIVE_BROWSER", "onHidden"));
            }
            C3998pj c3998pj13 = (C3998pj) c4038r3.k.get();
            if (c3998pj13 != null) {
                Y9 y94 = c3998pj13.f7308a.i;
                if (y94 != null) {
                    String str5 = Ej.j1;
                    Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$cp(...)");
                    ((Z9) y94).a(str5, "onCCTScreenDismissed");
                }
                c3998pj13.f7308a.Y();
            }
            c4038r3.b();
        }
    }
}
