package com.instagram.common.viewpoint.core;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.fq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2876fq {
    public float A00;
    public EnumC2154Lr A01;
    public Map<String, String> A02;

    public C2876fq(EnumC2154Lr enumC2154Lr) {
        this(enumC2154Lr, 0.0f);
    }

    public C2876fq(EnumC2154Lr enumC2154Lr, float f) {
        this(enumC2154Lr, f, null);
    }

    public C2876fq(@Nullable EnumC2154Lr enumC2154Lr, float f, Map<String, String> windowParams) {
        this.A01 = enumC2154Lr;
        this.A00 = f;
        if (windowParams != null) {
            this.A02 = windowParams;
        } else {
            this.A02 = new HashMap();
        }
    }

    public final float A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01.A03();
    }

    public final EnumC2154Lr A02() {
        return this.A01;
    }

    public final Map<String, String> A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A01 == EnumC2154Lr.A0I;
    }
}
