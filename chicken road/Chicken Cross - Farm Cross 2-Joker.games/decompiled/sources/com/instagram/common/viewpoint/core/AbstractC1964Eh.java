package com.instagram.common.viewpoint.core;

import com.instagram.common.viewpoint.core.AbstractC1964Eh;

/* renamed from: com.facebook.ads.redexgen.X.Eh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1964Eh<T extends AbstractC1964Eh<T>> {
    public final int A00;
    public final int A01;
    public final C3490qI A02;
    public final C3453pg A03;

    public abstract int A08();

    public abstract boolean A09(T t);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Eh != com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo<T extends com.facebook.ads.redexgen.X.Eh<T>> */
    public AbstractC1964Eh(int i, C3453pg c3453pg, int i2) {
        this.A00 = i;
        this.A03 = c3453pg;
        this.A01 = i2;
        this.A02 = c3453pg.A08(i2);
    }
}
