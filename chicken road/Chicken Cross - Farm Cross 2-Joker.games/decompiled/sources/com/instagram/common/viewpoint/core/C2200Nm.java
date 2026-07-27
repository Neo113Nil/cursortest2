package com.instagram.common.viewpoint.core;

import java.io.Serializable;

/* renamed from: com.facebook.ads.redexgen.X.Nm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2200Nm implements Serializable {
    public static final long serialVersionUID = 351643298236575728L;
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C2200Nm(C2199Nl c2199Nl) {
        String str;
        String str2;
        String str3;
        String str4;
        str = c2199Nl.A02;
        this.A02 = str;
        str2 = c2199Nl.A01;
        this.A01 = str2;
        str3 = c2199Nl.A00;
        this.A00 = str3;
        str4 = c2199Nl.A03;
        this.A03 = str4;
    }

    public final String A00() {
        return this.A00;
    }

    public final String A01() {
        return this.A01;
    }

    public final String A02() {
        return this.A02;
    }

    public final String A03() {
        return this.A03;
    }
}
