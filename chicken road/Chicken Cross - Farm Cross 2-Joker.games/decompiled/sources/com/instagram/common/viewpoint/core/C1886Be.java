package com.instagram.common.viewpoint.core;

import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Be, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1886Be extends AbstractC3342ns {
    public C1886Be() {
        super(null);
    }

    private final AbstractC3342ns A00(int result) {
        AbstractC3342ns abstractC3342ns;
        AbstractC3342ns abstractC3342ns2;
        AbstractC3342ns abstractC3342ns3;
        if (result < 0) {
            abstractC3342ns3 = AbstractC3342ns.A02;
            return abstractC3342ns3;
        }
        if (result > 0) {
            abstractC3342ns2 = AbstractC3342ns.A01;
            return abstractC3342ns2;
        }
        abstractC3342ns = AbstractC3342ns.A00;
        return abstractC3342ns;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3342ns
    public final int A05() {
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3342ns
    public final AbstractC3342ns A06(int left, int right) {
        return A00(Integer.compare(left, right));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3342ns
    public final AbstractC3342ns A07(long left, long right) {
        return A00(Long.compare(left, right));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3342ns
    public final <T> AbstractC3342ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator) {
        return A00(comparator.compare(left, right));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3342ns
    public final AbstractC3342ns A09(boolean left, boolean right) {
        return A00(Boolean.compare(left, right));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3342ns
    public final AbstractC3342ns A0A(boolean left, boolean right) {
        return A00(Boolean.compare(right, left));
    }
}
