package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Eh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0670Eh<T extends com.facebook.ads.redexgen.core.AbstractC0670Eh<T>> {
    public final int A00;
    public final int A01;
    public final com.facebook.ads.redexgen.core.C2196qI A02;
    public final com.facebook.ads.redexgen.core.C2159pg A03;

    public abstract int A08();

    public abstract boolean A09(T t);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Eh != com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo<T extends com.facebook.ads.redexgen.X.Eh<T>> */
    public AbstractC0670Eh(int i, com.facebook.ads.redexgen.core.C2159pg c2159pg, int i2) {
        this.A00 = i;
        this.A03 = c2159pg;
        this.A01 = i2;
        this.A02 = c2159pg.A08(i2);
    }
}
