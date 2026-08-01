package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.do, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class Cdo {
    public String A02;
    public String A03;
    public String A04;
    public final NY A06;
    public final C2200Nm A07;
    public final C2930gi A08;
    public C2188Na A01 = C2188Na.A01(null);
    public int A00 = 1000;
    public boolean A05 = false;

    public Cdo(C2930gi c2930gi, NY ny, C2200Nm c2200Nm) {
        this.A08 = c2930gi;
        this.A06 = ny;
        this.A07 = c2200Nm;
    }

    public final Cdo A09(int i) {
        this.A00 = i;
        return this;
    }

    public final Cdo A0A(C2188Na c2188Na) {
        this.A01 = c2188Na;
        return this;
    }

    public final Cdo A0B(String str) {
        this.A04 = str;
        return this;
    }

    public final Cdo A0C(String str) {
        this.A02 = str;
        return this;
    }

    public final Cdo A0D(String str) {
        this.A03 = str;
        return this;
    }

    public final Cdo A0E(boolean z) {
        this.A05 = z;
        return this;
    }

    public final C2753dq A0F() {
        return new C2753dq(this, null);
    }
}
