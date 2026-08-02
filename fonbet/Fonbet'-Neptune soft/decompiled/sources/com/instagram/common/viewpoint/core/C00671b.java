package com.instagram.common.viewpoint.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Objects;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.1b, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C00671b<E> extends AbstractC0297Am<E> {
    public static final AbstractC0297Am<Object> A02 = new C00671b(new Object[0], 0);
    public final transient Object[] A00;
    public final transient int A01;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1b != com.google.common.collect.RegularImmutableList<E> */
    public C00671b(Object[] array, int size) {
        this.A00 = array;
        this.A01 = size;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1b != com.google.common.collect.RegularImmutableList<E> */
    @Override // com.instagram.common.viewpoint.core.AbstractC1692ma
    public final int A0G() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1b != com.google.common.collect.RegularImmutableList<E> */
    @Override // com.instagram.common.viewpoint.core.AbstractC1692ma
    public final int A0H() {
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1b != com.google.common.collect.RegularImmutableList<E> */
    @Override // com.instagram.common.viewpoint.core.AbstractC0297Am, com.instagram.common.viewpoint.core.AbstractC1692ma
    public final int A0I(Object[] dst, int dstOff) {
        System.arraycopy(this.A00, 0, dst, dstOff, this.A01);
        return this.A01 + dstOff;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1b != com.google.common.collect.RegularImmutableList<E> */
    @Override // com.instagram.common.viewpoint.core.AbstractC1692ma
    public final boolean A0K() {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1b != com.google.common.collect.RegularImmutableList<E> */
    @Override // com.instagram.common.viewpoint.core.AbstractC1692ma
    public final Object[] A0L() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1b != com.google.common.collect.RegularImmutableList<E> */
    @Override // java.util.List
    public final E get(int i) {
        AbstractC1495jA.A00(i, this.A01);
        return (E) Objects.requireNonNull(this.A00[i]);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1b != com.google.common.collect.RegularImmutableList<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }
}
