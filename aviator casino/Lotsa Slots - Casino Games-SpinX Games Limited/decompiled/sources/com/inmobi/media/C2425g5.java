package com.inmobi.media;

/* renamed from: com.inmobi.media.g5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2425g5 extends androidx.browser.customtabs.CustomTabsServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2477i5 f5212a;

    public C2425g5(com.inmobi.media.C2477i5 c2477i5) {
        this.f5212a = c2477i5;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(android.content.ComponentName name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        this.f5212a.f5253a = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCustomTabsServiceConnected(android.content.ComponentName name, androidx.browser.customtabs.CustomTabsClient client) {
        int i;
        com.inmobi.media.C2431gb c2431gb;
        com.inmobi.media.C2279ai c2279ai;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "client");
        com.inmobi.media.C2477i5 c2477i5 = this.f5212a;
        c2477i5.f5253a = client;
        com.inmobi.media.U2 u2 = c2477i5.c;
        if (u2 == null) {
            return;
        }
        try {
            com.inmobi.media.C2477i5 c2477i52 = u2.e;
            androidx.browser.customtabs.CustomTabsSession customTabsSession = c2477i52.d;
            if (customTabsSession == null) {
                androidx.browser.customtabs.CustomTabsClient customTabsClient = c2477i52.f5253a;
                customTabsSession = customTabsClient != null ? customTabsClient.newSession(new com.inmobi.media.C2451h5(c2477i52)) : null;
                c2477i52.d = customTabsSession;
            }
            if (customTabsSession != null) {
                android.os.Bundle bundle = android.os.Bundle.EMPTY;
                if (customTabsSession.isEngagementSignalsApiAvailable(bundle)) {
                    customTabsSession.setEngagementSignalsCallback(u2.a(), bundle);
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        try {
            try {
                android.net.Uri parse = android.net.Uri.parse(u2.f4987a);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "Uri.parse(this)");
                u2.a(parse);
            } catch (java.lang.Exception unused2) {
                i = 9;
                c2431gb = u2.c;
                if (c2431gb != null) {
                    c2431gb.f = "EX_NATIVE";
                }
                if (i != 0 || i == 1) {
                    c2279ai = (com.inmobi.media.C2279ai) u2.i.get();
                    if (c2279ai == null) {
                        com.inmobi.media.K2.a(c2279ai, com.inmobi.media.Ua.f, u2.c);
                        return;
                    }
                    return;
                }
                com.inmobi.media.C2279ai c2279ai2 = (com.inmobi.media.C2279ai) u2.i.get();
                if (c2279ai2 != null) {
                    com.inmobi.media.Ua landingPageFunnelState = com.inmobi.media.Ua.g;
                    com.inmobi.media.C2431gb c2431gb2 = u2.c;
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(landingPageFunnelState, "landingPageFunnelState");
                    c2279ai2.f5106a.getLandingPageHandler().a(landingPageFunnelState, c2431gb2, valueOf);
                }
            }
        } catch (java.lang.Throwable unused3) {
            android.content.Context context = u2.f;
            java.lang.String str = u2.f4987a;
            java.lang.Object obj = u2.j.get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
            i = com.inmobi.media.B3.a(context, str, (com.inmobi.media.InterfaceC2859wh) obj, u2.d);
            c2431gb = u2.c;
            if (c2431gb != null) {
            }
            if (i != 0) {
            }
            c2279ai = (com.inmobi.media.C2279ai) u2.i.get();
            if (c2279ai == null) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(android.content.ComponentName componentName) {
        com.inmobi.media.C2477i5 c2477i5 = this.f5212a;
        c2477i5.f5253a = null;
        com.inmobi.media.U2 u2 = c2477i5.c;
        if (u2 != null) {
            com.inmobi.media.C2431gb c2431gb = u2.c;
            if (c2431gb != null) {
                c2431gb.f = "IN_NATIVE";
            }
            com.inmobi.media.C2279ai c2279ai = (com.inmobi.media.C2279ai) u2.i.get();
            if (c2279ai != null) {
                com.inmobi.media.Ua landingPageFunnelState = com.inmobi.media.Ua.g;
                com.inmobi.media.C2431gb c2431gb2 = u2.c;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(landingPageFunnelState, "landingPageFunnelState");
                c2279ai.f5106a.getLandingPageHandler().a(landingPageFunnelState, c2431gb2, (java.lang.Integer) 8009);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        this.f5212a.f5253a = null;
    }
}
