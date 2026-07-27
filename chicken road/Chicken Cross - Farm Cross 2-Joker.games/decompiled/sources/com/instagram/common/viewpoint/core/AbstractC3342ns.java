package com.instagram.common.viewpoint.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.ns, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3342ns {
    public static final AbstractC3342ns A00 = new C1886Be();
    public static final AbstractC3342ns A02 = new C1884Bc(-1);
    public static final AbstractC3342ns A01 = new C1884Bc(1);

    public abstract int A05();

    public abstract AbstractC3342ns A06(int left, int right);

    public abstract AbstractC3342ns A07(long left, long right);

    public abstract <T> AbstractC3342ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator);

    public abstract AbstractC3342ns A09(boolean left, boolean right);

    public abstract AbstractC3342ns A0A(boolean left, boolean right);

    public AbstractC3342ns() {
    }

    public /* synthetic */ AbstractC3342ns(C1886Be c1886Be) {
        this();
    }

    public static AbstractC3342ns A01() {
        return A00;
    }
}
