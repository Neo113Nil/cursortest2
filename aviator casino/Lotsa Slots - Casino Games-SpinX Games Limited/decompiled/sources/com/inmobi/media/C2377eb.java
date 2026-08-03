package com.inmobi.media;

/* renamed from: com.inmobi.media.eb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2377eb {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2431gb f5176a;
    public final com.inmobi.media.Y5 b;
    public final java.util.LinkedHashSet c;
    public java.lang.String d;
    public boolean e;

    public C2377eb(com.inmobi.media.C2431gb c2431gb, com.inmobi.media.Y5 embeddedBrowserViewClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddedBrowserViewClient, "embeddedBrowserViewClient");
        this.f5176a = c2431gb;
        this.b = embeddedBrowserViewClient;
        this.c = new java.util.LinkedHashSet();
    }

    public final void a(int i, boolean z, java.lang.String str, java.lang.Integer num) {
        try {
            if (this.e) {
                return;
            }
            com.inmobi.media.C2431gb c2431gb = this.f5176a;
            if (c2431gb != null) {
                c2431gb.f = "IN_CUSTOM";
            }
            switch (i) {
                case 1:
                    if (z) {
                        this.d = str;
                        com.inmobi.media.Y5 y5 = this.b;
                        com.inmobi.media.Ua funnelState = com.inmobi.media.Ua.h;
                        y5.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(funnelState, "funnelState");
                        com.inmobi.media.Xa.a(funnelState, c2431gb, (java.lang.Integer) null, y5.i);
                        break;
                    }
                    break;
                case 2:
                    if (z) {
                        this.d = str;
                        this.e = true;
                        if (!this.c.contains(1)) {
                            com.inmobi.media.Y5 y52 = this.b;
                            com.inmobi.media.Ua funnelState2 = com.inmobi.media.Ua.h;
                            com.inmobi.media.C2431gb c2431gb2 = this.f5176a;
                            y52.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(funnelState2, "funnelState");
                            com.inmobi.media.Xa.a(funnelState2, c2431gb2, (java.lang.Integer) 8006, y52.i);
                        }
                        this.b.g.invoke();
                        com.inmobi.media.Y5 y53 = this.b;
                        com.inmobi.media.Ua funnelState3 = com.inmobi.media.Ua.i;
                        com.inmobi.media.C2431gb c2431gb3 = this.f5176a;
                        y53.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(funnelState3, "funnelState");
                        com.inmobi.media.Xa.a(funnelState3, c2431gb3, (java.lang.Integer) null, y53.i);
                        break;
                    }
                    break;
                case 3:
                    if (z || (str != null && kotlin.jvm.internal.Intrinsics.areEqual(str, this.d))) {
                        this.e = true;
                        if (!this.c.contains(1)) {
                            com.inmobi.media.Y5 y54 = this.b;
                            com.inmobi.media.Ua funnelState4 = com.inmobi.media.Ua.h;
                            com.inmobi.media.C2431gb c2431gb4 = this.f5176a;
                            y54.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(funnelState4, "funnelState");
                            com.inmobi.media.Xa.a(funnelState4, c2431gb4, (java.lang.Integer) 8006, y54.i);
                        }
                        com.inmobi.media.Y5 y55 = this.b;
                        com.inmobi.media.Ua funnelState5 = com.inmobi.media.Ua.j;
                        com.inmobi.media.C2431gb c2431gb5 = this.f5176a;
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(num != null ? num.intValue() : 8100);
                        y55.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(funnelState5, "funnelState");
                        com.inmobi.media.Xa.a(funnelState5, c2431gb5, valueOf, y55.i);
                        break;
                    }
                case 4:
                    if (z) {
                        this.d = str;
                        break;
                    }
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    this.e = true;
                    switch (i) {
                        case 5:
                            r3 = 8200;
                            break;
                        case 6:
                            r3 = 8300;
                            break;
                        case 7:
                            r3 = 8400;
                            break;
                        case 8:
                            r3 = 8600;
                            break;
                        case 9:
                            r3 = 8500;
                            break;
                    }
                    int i2 = 4;
                    if (!this.c.contains(4)) {
                        i2 = 0;
                    }
                    int i3 = r3 + i2;
                    com.inmobi.media.Y5 y56 = this.b;
                    com.inmobi.media.Ua funnelState6 = com.inmobi.media.Ua.j;
                    com.inmobi.media.C2431gb c2431gb6 = this.f5176a;
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i3);
                    y56.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(funnelState6, "funnelState");
                    com.inmobi.media.Xa.a(funnelState6, c2431gb6, valueOf2, y56.i);
                    break;
            }
            this.c.add(java.lang.Integer.valueOf(i));
        } catch (java.lang.Exception e) {
            e.toString();
        }
    }
}
