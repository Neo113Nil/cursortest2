package com.instagram.common.viewpoint.core;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* renamed from: com.facebook.ads.redexgen.X.7m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02327m {
    public static final C02327m A03;
    public final String A00;
    public final C02317l A01;
    public final Object A02;

    static {
        C02327m c02327m;
        if (AbstractC01424a.A02 < 31) {
            c02327m = new C02327m("");
        } else {
            c02327m = new C02327m(C02317l.A01, "");
        }
        A03 = c02327m;
    }

    public C02327m(C02317l c02317l, String str) {
        this.A01 = c02317l;
        this.A00 = str;
        this.A02 = new Object();
    }

    public C02327m(String str) {
        C3M.A08(AbstractC01424a.A02 < 31);
        this.A00 = str;
        this.A01 = null;
        this.A02 = new Object();
    }

    public final LogSessionId A00() {
        return ((C02317l) C3M.A01(this.A01)).A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C02327m)) {
            return false;
        }
        C02327m c02327m = (C02327m) obj;
        if (Objects.equals(this.A00, c02327m.A00) && Objects.equals(this.A01, c02327m.A01) && Objects.equals(this.A02, c02327m.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.A00, this.A01, this.A02);
    }
}
