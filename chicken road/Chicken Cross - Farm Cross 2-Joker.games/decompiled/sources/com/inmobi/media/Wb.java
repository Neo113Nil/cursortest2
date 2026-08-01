package com.inmobi.media;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Wb {

    /* renamed from: a, reason: collision with root package name */
    public final Yb f6930a;
    public final C4153v6 b;
    public final LinkedHashSet c;
    public String d;
    public boolean e;

    public Wb(Yb yb, C4153v6 embeddedBrowserViewClient) {
        Intrinsics.checkNotNullParameter(embeddedBrowserViewClient, "embeddedBrowserViewClient");
        this.f6930a = yb;
        this.b = embeddedBrowserViewClient;
        this.c = new LinkedHashSet();
    }

    public final void a(int i, boolean z, String str, Integer num) {
        try {
            if (this.e) {
                return;
            }
            Yb yb = this.f6930a;
            if (yb != null) {
                yb.f = "IN_CUSTOM";
            }
            switch (i) {
                case 1:
                    if (z) {
                        this.d = str;
                        C4153v6 c4153v6 = this.b;
                        Mb funnelState = Mb.h;
                        c4153v6.getClass();
                        Intrinsics.checkNotNullParameter(funnelState, "funnelState");
                        Pb.a(funnelState, yb, (Integer) null, c4153v6.i);
                        break;
                    }
                    break;
                case 2:
                    if (z) {
                        this.d = str;
                        this.e = true;
                        if (!this.c.contains(1)) {
                            C4153v6 c4153v62 = this.b;
                            Mb funnelState2 = Mb.h;
                            Yb yb2 = this.f6930a;
                            c4153v62.getClass();
                            Intrinsics.checkNotNullParameter(funnelState2, "funnelState");
                            Pb.a(funnelState2, yb2, (Integer) 8006, c4153v62.i);
                        }
                        this.b.g.invoke();
                        C4153v6 c4153v63 = this.b;
                        Mb funnelState3 = Mb.i;
                        Yb yb3 = this.f6930a;
                        c4153v63.getClass();
                        Intrinsics.checkNotNullParameter(funnelState3, "funnelState");
                        Pb.a(funnelState3, yb3, (Integer) null, c4153v63.i);
                        break;
                    }
                    break;
                case 3:
                    if (z || (str != null && Intrinsics.areEqual(str, this.d))) {
                        this.e = true;
                        if (!this.c.contains(1)) {
                            C4153v6 c4153v64 = this.b;
                            Mb funnelState4 = Mb.h;
                            Yb yb4 = this.f6930a;
                            c4153v64.getClass();
                            Intrinsics.checkNotNullParameter(funnelState4, "funnelState");
                            Pb.a(funnelState4, yb4, (Integer) 8006, c4153v64.i);
                        }
                        C4153v6 c4153v65 = this.b;
                        Mb funnelState5 = Mb.j;
                        Yb yb5 = this.f6930a;
                        Integer valueOf = Integer.valueOf(num != null ? num.intValue() : 8100);
                        c4153v65.getClass();
                        Intrinsics.checkNotNullParameter(funnelState5, "funnelState");
                        Pb.a(funnelState5, yb5, valueOf, c4153v65.i);
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
                    C4153v6 c4153v66 = this.b;
                    Mb funnelState6 = Mb.j;
                    Yb yb6 = this.f6930a;
                    Integer valueOf2 = Integer.valueOf(i3);
                    c4153v66.getClass();
                    Intrinsics.checkNotNullParameter(funnelState6, "funnelState");
                    Pb.a(funnelState6, yb6, valueOf2, c4153v66.i);
                    break;
            }
            this.c.add(Integer.valueOf(i));
        } catch (Exception e) {
            String str2 = "Error: " + e;
        }
    }
}
