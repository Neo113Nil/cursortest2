package com.inmobi.media;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class D5 extends CustomTabsServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F5 f6505a;

    public D5(F5 f5) {
        this.f6505a = f5;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        F5 f5 = this.f6505a;
        f5.f6549a = null;
        C4038r3 c4038r3 = f5.c;
        if (c4038r3 == null || !c4038r3.m) {
            return;
        }
        c4038r3.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCustomTabsServiceConnected(ComponentName name, CustomTabsClient client) {
        int i;
        Yb yb;
        C3998pj c3998pj;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(client, "client");
        F5 f5 = this.f6505a;
        f5.f6549a = client;
        C4038r3 c4038r3 = f5.c;
        if (c4038r3 == null || c4038r3.n || c4038r3.m) {
            return;
        }
        try {
            F5 f52 = c4038r3.e;
            CustomTabsSession customTabsSession = f52.d;
            if (customTabsSession == null) {
                CustomTabsClient customTabsClient = f52.f6549a;
                customTabsSession = customTabsClient != null ? customTabsClient.newSession(new E5(f52)) : null;
                f52.d = customTabsSession;
            }
            if (customTabsSession != null) {
                Bundle bundle = Bundle.EMPTY;
                if (customTabsSession.isEngagementSignalsApiAvailable(bundle)) {
                    customTabsSession.setEngagementSignalsCallback(c4038r3.a(), bundle);
                }
            }
        } catch (Throwable unused) {
        }
        try {
            try {
                Uri parse = Uri.parse(c4038r3.f7341a);
                Intrinsics.checkNotNullExpressionValue(parse, "Uri.parse(this)");
                c4038r3.a(parse);
                c4038r3.m = true;
            } catch (Exception unused2) {
                i = 9;
                yb = c4038r3.c;
                if (yb != null) {
                    yb.f = "EX_NATIVE";
                }
                if (i != 0 || i == 1) {
                    c3998pj = (C3998pj) c4038r3.k.get();
                    if (c3998pj != null) {
                        AbstractC3754h3.a(c3998pj, Mb.f, c4038r3.c);
                    }
                } else {
                    C3998pj c3998pj2 = (C3998pj) c4038r3.k.get();
                    if (c3998pj2 != null) {
                        Mb landingPageFunnelState = Mb.g;
                        Yb yb2 = c4038r3.c;
                        Integer valueOf = Integer.valueOf(i);
                        Intrinsics.checkNotNullParameter(landingPageFunnelState, "landingPageFunnelState");
                        c3998pj2.f7308a.getLandingPageHandler().a(landingPageFunnelState, yb2, valueOf);
                    }
                }
                c4038r3.b();
            }
        } catch (Throwable unused3) {
            Context c = c4038r3.c();
            String str = c4038r3.f7341a;
            Object obj = c4038r3.l.get();
            Intrinsics.checkNotNull(obj);
            i = Y3.a(c, str, (Ji) obj, c4038r3.d);
            yb = c4038r3.c;
            if (yb != null) {
            }
            if (i != 0) {
            }
            c3998pj = (C3998pj) c4038r3.k.get();
            if (c3998pj != null) {
            }
            c4038r3.b();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        F5 f5 = this.f6505a;
        f5.f6549a = null;
        C4038r3 c4038r3 = f5.c;
        if (c4038r3 != null) {
            Yb yb = c4038r3.c;
            if (yb != null) {
                yb.f = "IN_NATIVE";
            }
            C3998pj c3998pj = (C3998pj) c4038r3.k.get();
            if (c3998pj != null) {
                Mb landingPageFunnelState = Mb.g;
                Yb yb2 = c4038r3.c;
                Integer valueOf = Integer.valueOf(ConnectionsStatusCodes.STATUS_OUT_OF_ORDER_API_CALL);
                Intrinsics.checkNotNullParameter(landingPageFunnelState, "landingPageFunnelState");
                c3998pj.f7308a.getLandingPageHandler().a(landingPageFunnelState, yb2, valueOf);
            }
            c4038r3.b();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        F5 f5 = this.f6505a;
        f5.f6549a = null;
        C4038r3 c4038r3 = f5.c;
        if (c4038r3 == null || !c4038r3.m) {
            return;
        }
        c4038r3.b();
    }
}
